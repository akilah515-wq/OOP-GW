# OOP-GW
Eastern Medical Health Region 
University of Technology, Jamaica School of Computing and Information Technology Object-Oriented Programming 
Group Project, Semester 2

PROJECT OVERVIEW

The EMHR System is a console based healthcare management application built in Java for the Eastern Medical Health Region (EMHR), serving the parishes of Kingston, Portland, Saint Andrew, and Saint Thomas.

SYSTEM REQUIREMENTS
Operating System : Windows 10/11, macOS, or Linux
Java Version     : Java JDK 17 or higher
IDE              : IntelliJ IDEA (Community or Ultimate Edition)
RAM              : Minimum 4GB
Storage          : Minimum 100MB free space

INSTALLATION GUIDE
Step 1 — Install Java JDK
If you do not have Java installed:

Go to: https://www.oracle.com/java/technologies/downloads/
Download JDK 17 or higher for your operating system
Follow the installation instructions

Step 2 — Install IntelliJ IDEA

Go to: https://www.jetbrains.com/idea/download/
Download the free Community Edition
Follow the installation instructions

Step 3 — Get the Project
- Copy all the Java source files shared by your group members into a single folder on your laptop
- Name the folder EMHR_System

Step 4 — Open the Project in IntelliJ

Open IntelliJ IDEA
Click "Open"
Navigate to the EMHR_System folder and select it
Click "OK" — IntelliJ will load the project automatically

HOW TO RUN THE PROGRAM

Running in IntelliJ Idea
1) Open the project in IntelliJ IDEA
2) In the left panel, navigate to: src → Main.java
3) Right-click on Main.java
4) Select "Run 'Main.main()'"
5) The program will start in the terminal at the bottom of the screen





Project Structure

EMHR_System/
│
├── src/
│   ├── Main.java                  
│   │
│   ├── Person.java               
│   ├── Patient.java              
│   ├── PatientMenu.java          
│   │
│   ├── Appointment.java          
│   ├── AppointmentMenu.java      
│   │
│   ├── User.java                  
│   ├── Role.java                 
│   ├── Permission.java           
│   ├── UserMenu.java              
│   │
│   ├── MedicalRecord.java         
│   ├── VisitRecord.java           
│   ├── LabResult.java            
│   ├── EHRMenu.java               
│   │
│   ├── Payment.java               
│   ├── CashPayment.java           
│   ├── CardPayment.java           
│   ├── InsurancePayment.java      
│   ├── BillingMenu.java           
│   │
│   ├── Notification.java          
│   ├── EmailNotification.java     
│   ├── SMSNotification.java       
│   │
│   ├── Vitals.java                
│   ├── RiskScore.java             
│   ├── TriageMenu.java            
│   │
│   └── data/                      
│       ├── patients.txt
│       ├── appointments.txt
│       ├── users.txt
│       ├── records.txt
│       └── billing.txt
│
└── README.md                      

Group Members: 
Akilah Johnson    2509289
Brianna Jones    
Jevaunni Clarke
Jade 

COVERAGE SNAPSHOT

Module                              Class                                              Status
Users and Roles                     User, Role, Permission, UserMenu                   Pending
Patient Registry                    Person, Patient, PatientMenu                       Complete
Appointments                        Appointment, AppointmentMenuIn                     Progress
EHR                                 MedicalRecord, VisitRecord, LabResult, EHRMenu     Pending
Billing                             Payment, CashPayment, CardPayment, Insurance       Pending
Notifications                       Notification, EmailNotification, SMS               Pending
Triage & Analytics                  Vitals, RiskScore, TriageMenu                      Pending

