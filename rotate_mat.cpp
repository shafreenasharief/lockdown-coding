#include <iostream>
#define M 3
#define N 3
using namespace std;

// Function to print the matrix
void displayMatrix(int matrix[][M])
{
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < M; j++)
        {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }}

// Main Function
int main()
{
    int matrix[N][M];
    cout<<"Enter the matrix elements"<<endl;
    for(int i = 0 ; i < M ; i++)
    {
        for(int j = 0 ; j < N ; j++)
        {
            cin >> matrix[i][j]; // Input the matrix elements
        }}
    cout << "The given matrix is" << endl;
    displayMatrix(matrix);
    int temp[M];
    int k;
    cout << "Number of rotations : ";
    cin >> k; // input the number of rotations
    k = k % M;

    // For rotating matrix by k times
    for (int i = 0; i < N; i++)
    {
        // copy first M-k elements to temporary array
        for (int t = 0; t < M - k; t++)
        {
            temp[t] = matrix[i][t];
        }
        // copy the elements from k to end to starting
        for (int j = M - k; j < M; j++)
        {
            matrix[i][j - M + k] = matrix[i][j];
        }
        // copy elements from temporary array to end
        for (int j = k; j < M; j++)
        {
            matrix[i][j] = temp[j - k];
        }}

    cout<<"\nThe rotated matrix is\n";
    // display rotated matrix

    displayMatrix(matrix);
    return 0;
}
