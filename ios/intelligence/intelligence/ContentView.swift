//
//  ContentView.swift
//  intelligence
//
//  Created by 邝仕琦 on 2022/1/23.
//

import SwiftUI
import AVFoundation
import UIKit


var audioplayer: AVAudioPlayer?

func play(forResource: String, oftype: String){
    let path = Bundle.main.path(forResource: forResource, ofType: oftype)!
    let url = URL(fileURLWithPath: path)
    
    do{
        audioplayer = try AVAudioPlayer(contentsOf: url)
        audioplayer?.play()
    } catch{
        print("音频文件出现问题")
    }
    
}


struct ContentView: View {
    
    @State private var pics = ["0","1","2","3","4","5","6","7","8","9"]
    @State private var currentpic = Int.random(in: 0...2)
    @State private var n = 0
    @State private var showalert = false
    @State private var pics2 = ["","","","","","","","",""]
    @State private var lastpic = 4
    @State private var flag = 0
    @State private var timealready:Double = 0.0
    @State private var fail = 0
    @State private var result:Double = 0.0
    @ObservedObject var results: Ddd
    
    let timer = Timer.publish(every: 0.001, on: .main, in: .common).autoconnect()
    
    
    var body: some View {
        VStack(spacing: 30){
            Text(String(format:"Time: %.3f",timealready))
                .font(.largeTitle)
                .foregroundColor(.white)
                .padding(.horizontal, 20)
                .padding(.vertical, 5)
                .background(
                    Capsule()
                        .fill(Color.black)
                        .opacity(0.75)
                )
            if n > 0 {
                Text("第\(n)题")
                    .font(.title)
            }
            if n < 20 {
                Image(pics[currentpic])
                    .resizable()
                    .frame(width: 300, height: 280, alignment: .center)
            }
            if n > 0 {
                
                Text("请在下方选中上一次出现的图")
                HStack(spacing: 20){
                    ForEach(0..<3){ num in
                        Button(action: {
                            pics2 = pics
                            if(pics2[num] == pics[lastpic]){
                                play(forResource: "note1",oftype: "wav")
                            }
                            else if(n != 1){
                                play(forResource: "note2",oftype: "m4a")
                                fail = 1
                            }
                            lastpic = currentpic
                            self.pics.shuffle()
                            self.currentpic = Int.random(in: 0...2)
                            if(n >= 20){
                                showalert = true
                                flag = 0
                                result = timealready
                                n = 19
                                if(results.results.count >= 10){
                                    if (result < results.results[9]) {
                                        results.results[9] = result
                                        results.results.sort(by: < )
                                    }
                                }else{
                                    results.results.append(result)
                                    results.results.sort(by: < )
                                    print(results.results)
                                }
                            }
                            n+=1
                        }){
                            Image(self.pics2[num])
                                .resizable()
                                .clipShape(Rectangle())
                                .overlay(Rectangle().stroke(Color.clear,lineWidth: 1))
                                //.shadow(color:.black,radius: 2)
                                .aspectRatio(contentMode: .fit)
                                .frame(width: 120, height: 100, alignment: .center)
                            
                        }
                        .alert(isPresented: $showalert){
                            Alert(title: Text("游戏结束"),
                                  message:Text(fail == 0 ? String(format:"您的用时为 %.3f 秒",result):"您失败了"),
                                   dismissButton: .default(Text("重新开始")){
                                    timealready = 0
                                    n = 0
                                    fail = 0
                                    lastpic = 4
                                    self.pics.shuffle()
                                    self.currentpic = Int.random(in: 0...2)
                                   }
                             )
                        }
                    }
                }
                .onReceive(timer) { time in
                if flag > 0 {
                    self.timealready += 0.001
                }
            }
                Button(action: {
                    n = 0
                    timealready = 0
                    fail = 0
                    lastpic = 4
                    flag = 0
                    self.pics.shuffle()
                    self.currentpic = Int.random(in: 0...2)
                }){
                    Text("重来")
                        .padding()
                        .background(Color.gray.opacity(0.5).clipShape(Capsule()))
                }
            }
            else if(n==0) {
                Button(action: {
                    flag = 1
                    n += 1
                    pics2 = pics
                    lastpic = currentpic
                    self.pics.shuffle()
                    self.currentpic = Int.random(in: 0...2)
                }){
                    Text("我记住了")
                        .font(.title3)
                        .foregroundColor(.black)
                        .fontWeight(.bold)
                        .padding(28)
                        .background(Color.gray.opacity(0.5).clipShape(Rectangle()))
                        .cornerRadius(16)
                   
                }
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView(results: Ddd())
    }
}

