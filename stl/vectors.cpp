#include <iostream>
#include <vector>

// Should be careful about namespaces in larger projects.
// Its okay for a single file execution
using namespace std;

int main()
{
    // std::vector<TYPE> VECTOR_NAME
    // remove "std::" if using the std namespace else add it
    vector<int> sizeless_array;
    vector<int> sized_array(3); // initalized with 0

    sized_array.push_back(123);    // add 123 to end of the array [0,0,0,123]
    sizeless_array.push_back(123); // add 123 to end of array [123]
}