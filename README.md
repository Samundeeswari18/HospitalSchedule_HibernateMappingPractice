![HospitalDb_ER_Diagram](https://github.com/Samundeeswari18/HospitalSchedule_HibernateMappingPractice/assets/118312757/b95d386c-5797-42c9-bf08-6f5ec653343d)

The Entity Classes (Models):
Doctors
▶	The individual Doctors
Hospital
▶ The hospital to which many doctors belong. 
Specialty
▶	Each Doctor has one specialty 
Doctor Schedule
▶	Each doctor has one Schedule
		Patients
			▶	Multiple patients can have multiple
				Doctors 


    Create new maven project, name it:  
DoctorSchedule
● The Entity Classes (Models):
○ Doctors
▶The individual Doctors
○ Id
○ Name
○ Hospital
 The hospital to which many doctors ▶
belong.
Id
Name
address
○ Specialty
▶Each Doctor has one specialty
Id
name
○ Doctor Schedule
▶Each doctor has one Schedule
Id
Type (annual visit, checkup etc)
date/time

Patients
▶Multiple patients can have multiple
Doctors
Id
Name
address
● Relationships:
○ Doctors -> Hospital (Many → One)
○ Specialty -> Doctors  (One → Many)
○ Doctor -> Schedule Profile (One → One)
	

Relationships:
Doctors 	-> Hospital (Many → One)
Specialty -> Doctors  (One → Many)
Doctor 	-> Schedule Profile (One → One)
Patients > Doctors (Many → Many)

