# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As a [basketball scout, I want to analyze the stats of the 2023 - 2024 playoffs.], <br> 
> I want to [determine the best scorer], <br> 
> so that I can [choose the best player to draft to my fantasy team]. 

## Dataset 

Dataset: https://www.kaggle.com/datasets/mohamedsaqibshouqi/2023-2024-nba-player-stats-playoffs/data 
- **Name** (String) - names of the players 
- **Ppg** (double) - Points per game a player has
- **Ts** (double) - The true shooting percentage of a player meaning how efficient they are at scoring.

## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![UML Diagram for my project] ![Ethan Lam - (Unit 3) UML Diagram](https://github.com/user-attachments/assets/74f0a5e2-5445-4b71-955c-1b3f6516712f)


## Description 

The purpose of our project is to do our job as a basketball analyst and determine who is the best scorer of the 2023-2024 NBA playoffs. In order to do this, we must analyze the stats of players in the 2023-2024 NBA playoffs to find who is the best scorer. Using data sets we found from Kaggle, we were able to get all the important data we needed to complete our goal. To find the best scorer, we must analyze how much they scored and how efficient they scored. Our code traverses through the 1D arrays and data and adds up the PPG and the TS% for each player. Then it finds which player has the highest sum of the two stats to determine the "best scorer". Using a toString method we print out the player's name which in this case was Joel Embiid who is the best scorer according to our program.
