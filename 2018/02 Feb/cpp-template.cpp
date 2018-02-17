#include <iostream>
#include <string>
#include <array>

bool isBalanced(std::string str)
{
	// write your code here
	return false;
}

int main()
{
	std::array<std::string, 7> inputs = {"[]", "[{}]", "[{]}", "[[", "]]", "}{", "[{()}]"};
	std::array<bool, 7> outputs = {true, true, false, false, false, false, true};
 
	for (unsigned i = 0; i < inputs.size(); i++)
	{
 		if (isBalanced(inputs[i]) != outputs[i])
 		{
 			std::cout << "Test #" << i << " Failed\nInput: \"" << inputs[i] << "\"\nExpected Output: " << (outputs[i] ? "true" : "false") << std::endl;
 			return 1;
 		}
	}

	std::cout << "All tests passed!" << std::endl;
	return 0;
}
