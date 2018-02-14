//: Playground - noun: a place where people can play

import UIKit

func rainfall (rain: [Double]) {
    var sum: Double = 0
    var count: Double = 0
    for num in rain {
        if num == -999 {
            print("sum is \(sum)")
            if count == 0 {
                print("no rainfall")
            }
            else { print("rainfall is \(sum / count)") }
            
        }
        else if num >= 0 {
            sum = sum + num
            count += 1
        }
    }
    
}

rainfall(rain: [23, 42, -23, 22, 4, -999, 24, -2, 84]) //should return rainfall of 22.75
rainfall(rain: [4, -999, -2, 84]) //rainfall of 4
rainfall(rain: [-999, 42]) //no rainfall
