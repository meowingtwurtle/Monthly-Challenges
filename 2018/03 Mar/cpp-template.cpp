#include <iostream>
#include <string>
#include <vector>

std::vector<std::string> summarizeRanges(std::vector<int> vec)
{
	// write your code here
	return std::vector<std::string>();
}

int main()
{
	std::vector<std::vector<int>> inputs = {{1,2,3,4,5,8,9,10}, {4,5,6,7,10,11,12}, {1,3,5,6,7}};
	std::vector<std::vector<std::string>> outputs = {{"1->5", "8->9", "10"}, {"4->7", "10->12"}, {"1", "3", "5->7"}};

	std::vector<std::vector<int>> bonusInputs = {{10,1,8,2,2,3,9,4,8}, {7,6,6,4,8,6,7,5}};
	std::vector<std::vector<std::string>> bonusOutputs = {{"1->4", "8->10"}, {"4->8"}};
 
	for (unsigned i = 0; i < inputs.size(); i++)
	{
 		if (summarizeRanges(inputs[i]) != outputs[i])
 		{
 			std::cout << "Test #" << i << " Failed\nInput: \"[";
 			for (unsigned j = 0; j < inputs[i].size(); j++) std::cout << inputs[i][j] << (j == inputs[i].size() - 1 ? "]" : ", ");
 			std::cout << "\"\nExpected Output: [";
 			for (unsigned j = 0; j < outputs[i].size(); j++) std::cout << outputs[i][j] << (j == outputs[i].size() - 1 ? "]" : ", ");
 			std::cout << std::endl;
 			return 1;
 		}
	}

	std::cout << "All basic tests passed!" << std::endl;

	for (unsigned i = 0; i < bonusInputs.size(); i++)
	{
 		if (summarizeRanges(bonusInputs[i]) != bonusOutputs[i])
 		{
 			std::cout << "Bonus Test #" << i << " Failed\nInput: \"[";
 			for (unsigned j = 0; j < bonusInputs[i].size(); j++) std::cout << bonusInputs[i][j] << (j == bonusInputs[i].size() - 1 ? "]" : ", ");
 			std::cout << "\"\nExpected Output: [";
 			for (unsigned j = 0; j < bonusOutputs[i].size(); j++) std::cout << bonusOutputs[i][j] << (j == bonusOutputs[i].size() - 1 ? "]" : ", ");
 			std::cout << std::endl;
 			return 1;
 		}
	}

	std::cout << "All tests passed!" << std::endl;

	return 0;
}
