# Android Step Counter App

This repository contains an Android application that retrieves and 
displays step count data using the Google Fit API. The app allows users to 
authorize access to their Google Fit data, retrieve step count data for a 
specified duration, and display it in the user interface.

## App Setup

To set up the Android application project in Android Studio, follow these 
steps:

1. Clone this repository to your local machine or download the source 
code.
2. Open Android Studio and select "Open an existing Android Studio 
project."
3. Navigate to the project directory and select it to open the project.
4. Android Studio will build the project and load all the necessary 
dependencies.

To enable the Google Fit API in your project, follow these steps:

1. Go to the [Google API Console](https://console.developers.google.com/).
2. Create a new project or select an existing project.
3. Enable the Google Fit API for your project.
4. Create an OAuth 2.0 client ID and configure the necessary credentials.
5. Copy the generated API key or OAuth 2.0 client ID and replace the 
corresponding placeholders in the project source code 
(`google_fit_api.xml`).

## Google Fit Authorization

The app implements a function that asks the user for permission to access 
their Google Fit data. Specifically, it requests permission to access 
`DataType.TYPE_STEP_COUNT_DELTA`.

To authorize access, follow these steps:

1. Launch the app on an Android device or emulator.
2. Grant the necessary permissions when prompted.
3. A dialog will appear asking for authorization to access Google Fit 
data.
4. Select the Google account associated with your Google Fit data.
5. Grant the required permissions for step count data access.

## Step Count Retrieval

The app implements a function that uses the Google Fit API to retrieve 
step count data. By default, it retrieves step count data for the past 24 
hours. You can modify the app to specify a different time range if 
desired.

To retrieve step count data, follow these steps:

1. Ensure you have granted authorization to access Google Fit data (as 
mentioned in the previous section).
2. Launch the app on an Android device or emulator.
3. The step count data will be fetched and displayed in the user 
interface.

## Data Presentation

The step count data retrieved from the Google Fit API is displayed in a 
`TextView` in the user interface. Each time the app becomes active, the 
data is automatically refreshed. Additionally, a "refresh" button is 
provided to manually update the data.

## Error Handling

The app implements appropriate error handling for cases where data access 
is denied or other errors occur. If access to Google Fit data is denied, 
an error message will be displayed in the user interface.

## Submission

To submit the application:

1. Ensure you have completed the necessary setup steps mentioned above.
2. Provide the source code for the application.
3. Include instructions on how to run the application, specifying any 
additional configurations or dependencies required.
4. Optionally, explain any design choices you made and any difficulties 
you encountered during development.

## Evaluation

The application will be evaluated based on the following criteria:

1. Functionality: Does the app work as expected? Can it retrieve and 
display step count data accurately?
2. Code Quality: Is the code well-structured, readable, and maintainable?
3. Error Handling: Does the app handle errors gracefully and provide 
appropriate user feedback?
4. User Experience: Is the user interface intuitive and responsive?

Feel free to reach out if you have any questions or need further 
assistance.

