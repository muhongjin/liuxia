//
//  homepage.swift
//  intelligence
//
//  Created by 邝仕琦 on 2022/1/22.
//

import SwiftUI

struct homepage: View {
   
    var body: some View {
                NavigationView {
                    ZStack {
                        Image("home")
                            .resizable()
                            .frame(width: 440, height:920, alignment: .center)
                            .padding(.bottom,100)
                    VStack {
                        Image("liuxia")
                            .padding(.bottom)
                    NavigationLink(destination: youxi()) {
                        Image("youxi")
                            .padding(.leading)
                            .padding(1)
                    }
                    //.navigationBarTitleDisplayMode(.inline)
                    NavigationLink(destination: gerenchengzhang(results: Ddd())) {
                        Image("gerenchengchang")
                            .padding(.trailing)
                            .padding(1)
                    }
                    //.navigationBarTitleDisplayMode(.inline)
                    NavigationLink(destination: paihangbang()) {
                        Image("paihangbang")
                            .padding(1)
                    }
                    //.navigationBarTitleDisplayMode(.inline)

                    NavigationLink(destination: guanyuwomen()) {
                        Image("guanyuwomen")
                            .padding(1)
                    }
                    //.navigationBarTitleDisplayMode(.inline)

                    NavigationLink(destination: mingxinpiantu()) {
                        Image("mingxinpian")
                            .padding(1)
                    }
                    //.navigationBarTitleDisplayMode(.inline)

                }
                    .padding(.bottom,100)
            }
                    .padding(.top,80)
                    
        }
                .ignoresSafeArea()
    }

struct homepage_Previews: PreviewProvider {
    static var previews: some View {
        homepage()
    }
  }
}
