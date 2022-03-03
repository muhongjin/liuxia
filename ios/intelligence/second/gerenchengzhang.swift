//
//  gerenchengzhang.swift
//  intelligence
//
//  Created by 邝仕琦 on 2022/1/23.
//

import SwiftUI

struct gerenchengzhang: View {
    @ObservedObject var results: Ddd
    var body: some View {
        NavigationView {
            ZStack {
                Image("grzxhome")
                    .resizable()
                    .frame(width: UIScreen.main.bounds.width, height: UIScreen.main.bounds.height, alignment: .center)
                if(results.results.count >= 1){
                    VStack{
                        ForEach(0..<results.results.count){ i in
                            Text("\(results.results[i])")
                        }
                        
                    }
                }else{
                    Text("敬请期待")
                        .font(.title)
                }
                
                
            }
            .padding(.bottom,100)
        }
        //.navigationBarTitleDisplayMode(.inline)
    }
}

struct gerenchengzhang_Previews: PreviewProvider {
    static var previews: some View {
        gerenchengzhang(results: Ddd())
    }
}
