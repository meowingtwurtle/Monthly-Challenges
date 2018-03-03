using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MonthlyChallenge {
    class Program {
        static bool isBalanced(string str) {
            // your code
            return true;
        }
        static void Main(string[] args) {
            string[] inputs = new string[] { "[]", "[{}]", "[{]}", "[[", "]]", "}{", "[{()}]" };
            bool[] outputs = new bool[] { true, true, false, false, false, false, true };
            for (int i = 0; i < inputs.Length; i++) {
                if (isBalanced(inputs[i]) != outputs[i]) {
                    Console.WriteLine(string.Format("Wrong output on test #{0}", i+1));
                    Console.WriteLine(string.Format("Input: {0}", inputs[i]));
                    Console.WriteLine(string.Format("Expected output: {0}", outputs[i]));
                    System.Environment.Exit(1);
                }
            }
            Console.WriteLine("You\'ve passed all test cases");
        }
    }
}
