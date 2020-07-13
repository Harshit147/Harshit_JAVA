import java.util.*;
public class Hill{
static void KeyMatrix(String key, int keyMatrix[][]) 
{ 
	int k = 0; 
	for (int i = 0; i < 3; i++) 
	{ 
		for (int j = 0; j < 3; j++) 
		{ 
			keyMatrix[i][j] = (key.charAt(k)) % 65; 
			k++; 
		} 
	} 
} 
static void encrypt(int cipherMatrix[][], 
			int keyMatrix[][], 
			int message[][]) 
{ 
	int x, i, j; 
	for (i = 0; i < 3; i++) 
	{ 
		for (j = 0; j < 1; j++) 
		{ 
			cipherMatrix[i][j] = 0; 
			for (x = 0; x < 3; x++) 
			{ 
				cipherMatrix[i][j] += 
					keyMatrix[i][x] * message[x][j]; 
			} 
			cipherMatrix[i][j] = cipherMatrix[i][j] % 26; 
		} 
	} 
} 
static void HillCipher(String message, String key) 
{ 
	int [][]keyMatrix = new int[3][3]; 
	KeyMatrix(key, keyMatrix); 

	int [][] Amessage= new int[3][1]; 
	for (int i = 0; i < 3; i++) 
		Amessage[i][0] = (message.charAt(i)) % 65; 

	int [][]cipherMatrix = new int[3][1]; 
	encrypt(cipherMatrix, keyMatrix, Amessage); 

	String CipherText=""; 
	for (int i = 0; i < 3; i++) 
		CipherText += (char)(cipherMatrix[i][0] + 65); 

	
	System.out.print(" Ciphertext:" + CipherText); 
} 
public static void main(String[] args) 
{ 	 
	String message = "ABC"; 

	
	String key = "8929061909"; 

	HillCipher(message, key); 
	} 
} 


