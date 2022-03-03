//
//  paihangbang.swift
//  intelligence
//
//  Created by 邝仕琦 on 2022/1/23.
//

import SwiftUI
import UIKit

struct paihangbang: View {
    var body: some View {
        NavigationView {
            ZStack {
                Image("phbhome")
                    .resizable()
                    .frame(width: UIScreen.main.bounds.width, height: UIScreen.main.bounds.height,alignment: .center)
                Text("敬请期待")
                    .font(.title)
                    .foregroundColor(.white)
            }
            .padding(.bottom,100)

        }
        //.navigationBarTitleDisplayMode(.inline)
    }
}

struct paihangbang_Previews: PreviewProvider {
    static var previews: some View {
        paihangbang()
    }
}

