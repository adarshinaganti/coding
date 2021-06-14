#include <stdio.h>
#include <cs50.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

int getLetters(string text);
int getSentences(string text);
int getWords(string text);
int getGrade(int letters, int sentences, int words);
void printGrade(int grade);

int main(int argc, string argv[]){
	string text = get_string("Text: ");
	
	int letters = getLetters(text);
	int sentences = getSentences(text);
	int words = getWords(text);
	int grade = getGrade(letters, sentences, words);
	
	printGrade(grade);
}

void printGrade(int grade){
	if(grade <= 1){
		printf("Before Grade 1\n");
	}

	else if(grade >= 16){
		printf("Grade 16+\n");
	}

	else{
		printf("Grade %i\n", grade);
	}
}

int getGrade(int letters, int sentences, int words){
	float S = (sentences / (float) words) * 100;
	float L = (letters / (float) words) * 100;
	int grade = 0.0588 * L - 0.296 * S - 15.8;
	return round(grade + 1);
}

int getLetters(string text){
	int letters = 0;
	for(int i = 0, n = strlen(text); i < n; i++){
		if(isalpha(text[i])){
			letters++;
		}
	}
	return letters;
}

int getWords(string text){
	int words = 0;
	for(int i = 0, n = strlen(text); i < n; i++){
		if(text[i] == ' '){
			words++;
		}
	}
	return words + 1;
}

int getSentences(string text){
	int sentences = 0;
	for(int i = 0, n = strlen(text); i < n; i++){
		if(text[i] == '.' || text[i] == '!' || text[i] == '?'){
			sentences++;
		}
	}
	return sentences;
}