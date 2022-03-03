//
//  youxi.swift
//  intelligence
//
//  Created by 邝仕琦 on 2022/1/23.
//

import SwiftUI

struct youxi: View {
    init(){
        UITabBar.appearance().isHidden = true
    }
    
    var body: some View {
            ZStack {
                Image("home2")
                    .resizable()
                    .ignoresSafeArea(.all,edges: .all)
                    .aspectRatio(contentMode: .fit)
                    .frame(width: UIScreen.main.bounds.width, height: UIScreen.main.bounds.height, alignment: .center)
                Image("tishi")
                    .resizable()
                    .aspectRatio(contentMode: .fit)
                    .frame(width: UIScreen.main.bounds.width, height: UIScreen.main.bounds.height-770, alignment: .center)
                    .padding(.bottom,350)
                
                NavigationLink(destination: ContentView(results: Ddd())) {
                    Image("kaishi")
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                        .frame(width: UIScreen.main.bounds.width-100, height: UIScreen.main.bounds.height-840)
                }
                .offset(x: 0, y: 200)

            }
        //.navigationBarTitleDisplayMode(.inline)

    }
}

struct youxi_Previews: PreviewProvider {
    static var previews: some View {
        youxi()
    }
}

