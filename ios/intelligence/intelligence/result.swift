//
//  result.swift
//  intelligence
//
//  Created by 李易寰 on 2022/3/3.
//

import SwiftUI

class Ddd: Codable,ObservableObject {
    enum CodingKeys: CodingKey {
        case results
    }
    
    required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        results = try container.decode([Double].self, forKey: .results)
    }
    
    func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(results, forKey: .results)
    }
    
    init() {
    }
    @Published var results:[Double] = []
}
