//
//  mingxinpiantu.swift
//  intelligence
//
//  Created by 邝仕琦 on 2022/1/23.
//

import SwiftUI

struct mingxinpiantu: View {
    var body: some View {
        NavigationView {
            ZStack {
                Image("mxphome")
                    .resizable()
                    .frame(width: UIScreen.main.bounds.width, height: UIScreen.main.bounds.height, alignment: .center)
            }
            .padding(.bottom,100)
        }
        //.navigationBarTitleDisplayMode(.inline)
    }
}

struct mingxinpiantu_Previews: PreviewProvider {
    static var previews: some View {
        mingxinpiantu()
    }
}
