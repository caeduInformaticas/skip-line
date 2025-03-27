import SwiftUI
import shared
struct ContentView: View {
    var body: some View {
        let greeting = Greeting().greet()
        Text(greeting)
    }
}
