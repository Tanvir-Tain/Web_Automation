
# SmartCarePRO

In this Document , I wrote to automation script for Hospital Management Web App ( https://carepro-training.ihmafrica.com/ )


## Tools 

**IDE:** Eclipse

**Programming Language :** Java 

**Frame Work :** Selenium, Test_Ng, opencsv, webdrivermanager.

**Browser :** Chrome.



## Authors

- [@M.M.Tanvir Ahmed ](https://github.com/Tanvir-Tain)


## Working Process 

To run the automation script in the directory of  Excel_Technologies_Ltd/src/test/java/Excel_Technologies_Ltd/com by  following this process 

```bash
1.For Browser Set Up using Web Driver Manager.
2. Find every locator of button and test box for the mentioned web Application By using Driver Manager and web Driver framework. 
3. Create Maven Project Excel Technology Ltd. 
4. Create 2 Classes, one is for browser setup  and another is for Auto Data Input in the patient Information module from CSV file .

In this project  I use 2 classes: one is used for the browser set and another is for testing the required method.
Using methods are: 
Test Case 1- Signin() :  In this method, tester and tester2023! are used as username and password textboxes accordingly. 
Test Case 2- selectfaculty(): Prvince = Lusaka, District = Lusaka, Faculty = Dr. Watson Dental Clinic are filled to test required textboxes for the Select Facility module.
Test Case 3- searchoraddpatients(): Click the search button after filling in the NRC number 11111/11/1, which is tested in this test case. After showing and clicking the Attend to Patient button we face critical defects in biometrics information testing which is shown randomly or not displayed biometrics information. We handle this defect using the exception handling method.
Test Case 4- servicepont(): In this method, vital button is tested for Select Service for the Patient module. 
Test Case 5- patientInformation(): After successfully passing previous test cases Patient Information Form is tested automatically to take data from csv dataset. In this Form Date and time filled are not writeable. That is why we are  unable to fill out this date and time based on the date and time information in the dataset provided.

```


## Test Result 

![Screenshot](https://prnt.sc/dKrVw6bwKjU6)

- [Screen Short Link ](https://prnt.sc/dKrVw6bwKjU6)
- [Screen Record Link](https://drive.google.com/file/d/1t6I89sojDoLDu8it9XU0LOixgNgiy2Ia/view?usp=sharing)


![AutomationScript](https://github.com/Tanvir-Tain/Web_Automation/assets/49960242/2af05b86-5792-46df-9ba8-b63a96fb282e)
