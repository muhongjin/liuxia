//
//  guanyuwomen.swift
//  intelligence
//
//  Created by 李易寰 on 2022/3/2.
//

import SwiftUI

struct guanyuwomen: View {
    var body: some View {
        NavigationView {
            ZStack {
                Image("home")
                    .resizable()
                    .frame(width: UIScreen.main.bounds.width, height: UIScreen.main.bounds.height, alignment: .center)
                VStack{
                    Image("icon")
                    Text("你")
                        .bold()
                    Text("听说过流体智力吗？")
                        .bold()
                        .padding(.bottom)
                    Text("美国心理学家雷蒙德•卡特尔把智力的构成区分为流体智力和晶体智力两大类。而流体智力是一个人生来就能进行智力活动的能力。")
                        .frame(width: 250)
                    Text("”留下“就是因此而生")
                        .frame(width: 250)
                    Text("通过锻炼工作记忆中中央执行系统的刷新功能，以提升工作记忆为目的而展开")
                        .frame(width: 250)
                        .padding(.top)
                    Text("“留下”开始于2022年1月18日，希望每一个玩过“留下”的人都可以留下")
                        .bold()
                        .frame(width: 250)
                        .padding()
                    Text("最后，感谢参与“留下”的所有小伙伴。因为有你们，才有了最好的“留下")
                        .frame(width: 250)
                    Text("留下团队：")
                    Text("康林子琦 邝仕琦 梁睿洋 李易寰 牟泓锦 斯热吉丁 王陈 温路航 殷伊涵(按姓氏首字母顺序排列，不分先后)")
                        .frame(width: 250)
                    
                }
            }
            .padding(.bottom,100)
        }
    }
}

struct guanyuwomen_Previews: PreviewProvider {
    static var previews: some View {
        guanyuwomen()
    }
}
