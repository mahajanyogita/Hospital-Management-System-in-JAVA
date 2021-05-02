import java.io.*;

import java.util.*;

import java.util.Calendar;

class staff

{

 String sid, sname, desg, gender;

 int salary;

 void new_staff()

 {

  Scanner t = new Scanner(System.in);

  System.out.print("Id:-");
  sid = t.nextLine();

  System.out.print("Name:-");
  sname = t.nextLine();

  System.out.print("Desigination:-");
  desg = t.nextLine();

  System.out.print("Gender:-");
  gender = t.nextLine();

  System.out.print("Salary:-");
  salary = t.nextInt();

 }

 void staff_info()

 {

  System.out.println(sid + "\t" + sname + "\t" + gender + "\t" + salary);

 }

}



class doctor

{

 String did, dname, specialist, appoint, doc_qual;

 int droom;



 void new_doctor()

 {

  Scanner t = new Scanner(System.in);

  System.out.print("Id:-");
  did = t.nextLine();

  System.out.print("Name:-");
  dname = t.nextLine();

  System.out.print("Specialization:-");
  specialist = t.nextLine();

  System.out.print("Work time:-");
  appoint = t.nextLine();

  System.out.print("Qualification:-");
  doc_qual = t.nextLine();

  System.out.print("Room No.:-");
  droom = t.nextInt();

 }

 void doctor_info()

 {

  System.out.println(did + "\t" + dname + "  \t" + specialist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);


 }

}



class patient

{

 String pid, pname, disease, pgender, admit_status;

 int age;



 void new_patient()

 {

  Scanner t = new Scanner(System.in);

  System.out.print("Id:-");
  pid = t.nextLine();

  System.out.print("Name:-");
  pname = t.nextLine();

  System.out.print("Disease:-");
  disease = t.nextLine();

  System.out.print("Gender:-");
  pgender = t.nextLine();

  System.out.print("Admit Status:-");
  admit_status = t.nextLine();

  System.out.print("Age:-");
  age = t.nextInt();

 }

 void patient_info()

 {

  System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + pgender + "      \t" + admit_status + "\t" + age);

 }

}



class medical

{

 String med_name, med_comp, exp_date;

 int med_cost, count;


 void new_medi()

 {

  Scanner t = new Scanner(System.in);

  System.out.print("Name:-");
  med_name = t.nextLine();

  System.out.print("Comp:-");
  med_comp = t.nextLine();

  System.out.print("exp_date:-");
  exp_date = t.nextLine();

  System.out.print("Cost:-");
  med_cost = t.nextInt();

  System.out.print("No of Unit:-");
  count = t.nextInt();

 }

 void find_medi()

 {

  System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);

 }

}


class lab

{

 String facility;

 int lab_cost;


 void new_faci()

 {

  Scanner t = new Scanner(System.in);

  System.out.print("Facility:-");
  facility = t.nextLine();

  System.out.print("Cost:-");
  lab_cost = t.nextInt();

 }

 void faci_list()

 {

  System.out.println(facility + "\t\t" + lab_cost);

 }

}



class facility 
{



 String fac_name;

 void add_faci()

 {

  Scanner t = new Scanner(System.in);

  System.out.print("Facility:-");
  fac_name = t.nextLine();


 }

 void show_faci()

 {

  System.out.println(fac_name);

 }

}



public class hospital
{

 public static void main(String args[])

 {

  String months[] = {

   "Jan",
   "Feb",
   "Mar",
   "Apr",

   "May",
   "Jun",
   "Jul",
   "Aug",

   "Sep",
   "Oct",
   "Nov",
   "Dec"
  };

  Calendar calendar = Calendar.getInstance();

  //System.out.println("--------------------------------------------------------------------------------");

  int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;


  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          ***HOSPITAL MANAGEMENT SYSTEM***");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));


  doctor[] d = new doctor[25];

  patient[] p = new patient[100];

  lab[] l = new lab[20];

  facility[] f = new facility[20];

  medical[] m = new medical[100];

  staff[] s = new staff[100];

  int i;

  for (i = 0; i < 25; i++)

   d[i] = new doctor();

  for (i = 0; i < 100; i++)

   p[i] = new patient();

  for (i = 0; i < 20; i++)

   l[i] = new lab();

  for (i = 0; i < 20; i++)

   f[i] = new facility();

  for (i = 0; i < 100; i++)

   m[i] = new medical();

  for (i = 0; i < 100; i++)

   s[i] = new staff();


  d[0].did = "21";
  d[0].dname = "Dr.Ghanendra";
  d[0].specialist = "ENT";
  d[0].appoint = "10-4";
  d[0].doc_qual = "MBBS,Md";
  d[0].droom = 17;

  d[1].did = "32";
  d[1].dname = "Dr.Vikram";
  d[1].specialist = "medi.";
  d[1].appoint = "10-4";
  d[1].doc_qual = "MBBS,Md";
  d[1].droom = 45;

  d[2].did = "17";
  d[2].dname = "Dr.Rekha";
  d[2].specialist = "Child spl";
  d[2].appoint = "10-4";
  d[2].doc_qual = "B.D.M";
  d[2].droom = 8;

  d[3].did = "33";
  d[3].dname = "Dr.Pramod";
  d[3].specialist = "Artho";
  d[3].appoint = "10-4";
  d[3].doc_qual = "MBBS,MS";
  d[3].droom = 40;


  p[0].pid = "12";
  p[0].pname = "Pankaj";
  p[0].disease = "Cancer";
  p[0].pgender = "Male";
  p[0].admit_status = "y";
  p[0].age = 30;

  p[1].pid = "13";
  p[1].pname = "Kuli";
  p[1].disease = "Cold";
  p[1].pgender = "Male";
  p[1].admit_status = "y";
  p[1].age = 23;

  p[2].pid = "14";
  p[2].pname = "Gaurav";
  p[2].disease = "Maleria";
  p[2].pgender = "Male";
  p[2].admit_status = "y";
  p[2].age = 45;

  p[3].pid = "15";
  p[3].pname = "Ravi";
  p[3].disease = "Sugar";
  p[3].pgender = "Male";
  p[3].admit_status = "y";
  p[3].age = 25;


  m[0].med_name = "Corex";
  m[0].med_comp = "Cino pvt";
  m[0].exp_date = "9-5-16";
  m[0].med_cost = 55;
  m[0].count = 8;

  m[1].med_name = "Nytra";
  m[1].med_comp = "Ace pvt";
  m[1].exp_date = "4-4-15";
  m[1].med_cost = 500;
  m[1].count = 5;

  m[2].med_name = "Brufa";
  m[2].med_comp = "Reckitt";
  m[2].exp_date = "12-7-17";
  m[2].med_cost = 50;
  m[2].count = 56;

  m[3].med_name = "Pride";
  m[3].med_comp = "ddf pvt";
  m[3].exp_date = "12-4-12";
  m[3].med_cost = 1100;
  m[3].count = 100;


  l[0].facility = "X-Ray     ";
  l[0].lab_cost = 800;

  l[1].facility = "Ct Scan   ";
  l[1].lab_cost = 1200;

  l[2].facility = "Or Scan   ";
  l[2].lab_cost = 500;

  l[3].facility = "Blood Bank";
  l[3].lab_cost = 50;


  f[0].fac_name = "Ambulane";

  f[1].fac_name = "Admit fec";

  f[2].fac_name = "Canteen";

  f[3].fac_name = "Free Camp";


  s[0].sid = "22";
  s[0].sname = "Ravi";
  s[0].desg = "Worker";
  s[0].gender = "Male";
  s[0].salary = 5000;

  s[1].sid = "23";
  s[1].sname = "Komal";
  s[1].desg = "Nurse";
  s[1].gender = "Female";
  s[1].salary = 2000;

  s[2].sid = "24";
  s[2].sname = "Raju";
  s[2].desg = "Worker";
  s[2].gender = "Male";
  s[2].salary = 5000;

  s[3].sid = "25";
  s[3].sname = "Rani";
  s[3].desg = "Nurse";
  s[3].gender = "Female";
  s[3].salary = 20000;


  Scanner t = new Scanner(System.in);


  int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;

  while (status == 1)

  {

   System.out.println("\n                                    MAIN MENU");

   System.out.println("--------------------------------------------------------------------------------");

   System.out.println("1.DOCTOR ");
   
   System.out.println("2.PATIENT ");
   
   System.out.println("3.MEDICAL ");
   
   System.out.println("4.LAB ");
   
   System.out.println("5.FACILITY ");
   
   System.out.println("6.STAFF ");
   
   System.out.println("7.EXIT");
   
   

   System.out.println("--------------------------------------------------------------------------------");
   
   choice = t.nextInt();
   if(choice==7)
   break;
   switch (choice)

   {

    case 1:

     {

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                      **DOCTOR SECTION**");

      System.out.println("--------------------------------------------------------------------------------");

      s1 = 1;

      while (s1 == 1)

      {

       System.out.println("\n1.New Entry \n2.Doctor List");

       c1 = t.nextInt();

       switch (c1)

       {

        case 1:

         {

          d[count1].new_doctor();count1++;

          break;

         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("Id \t Name\t Specialist \t Timing \t Qualification \t Room No");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count1; j++)

          {

           d[j].doctor_info();

          }

          break;

         }

       }



       System.out.println("TO RETURN BACK press 1 Or \n FOR MORE press 0");

       s1 = t.nextInt();

      }

      break;

     }

    case 2:

     {

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                     **PATIENT SECTION**");

      System.out.println("--------------------------------------------------------------------------------");

      s2 = 1;

      while (s2 == 1)

      {

       System.out.println("1.New Entry\n2.Patient List");

       c1 = t.nextInt();

       switch (c1)

       {

        case 1:
         {
          p[count2].new_patient();count2++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("Id \t Name \t Disease \t Gender \t Admit Status \t Age");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count2; j++) {
           p[j].patient_info();
          }
          break;
         }

       }

       System.out.println("TO RETURN BACK press 1 Or \n FOR MORE press 0");

       s2 = t.nextInt();

      }

      break;

     }

    case 3:

     {

      s3 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                     **MEDICAL SECTION**");

      System.out.println("--------------------------------------------------------------------------------");

      while (s3 == 1)

      {

       System.out.println("1.New Entry \n2.Medicine List");

       c1 = t.nextInt();

       switch (c1)

       {

        case 1:
         {
          m[count3].new_medi();count3++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("Name \t Company \t Expiry Date \t Cost");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count3; j++) {
           m[j].find_medi();
          }
          break;
         }

       }

       System.out.println("TO RETURN BACK press 1 Or \n FOR MORE press 0");

       s3 = t.nextInt();

      }

      break;

     }

    case 4:

     {

      s4 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                    **LABORATRY SECTION**");

      System.out.println("--------------------------------------------------------------------------------");

      while (s4 == 1)

      {

       System.out.println("1.New Entry \n2.Lab List");

       c1 = t.nextInt();

       switch (c1)

       {

        case 1:
         {
          l[count4].new_faci();count4++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("Facility \t\tCost");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count4; j++) {
           l[j].faci_list();

          }

          break;

         }

       }

       System.out.println("TO RETURN BACK press 1 Or \n FOR MORE press 0");

       s4 = t.nextInt();

      }

      break;

     }

    case 5:

     {

      s5 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("          **HOSPILITY FACILITY SECTION**");

      System.out.println("--------------------------------------------------------------------------------");

      while (s5 == 1)

      {

       System.out.println("1.New Entry\n2.Facility List");

       c1 = t.nextInt();

       switch (c1)

       {

        case 1:
         {
          f[count5].add_faci();count5++;
          break;
         }

        case 2:
         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("Hospitality Facilities are:-");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count5; j++)
          {
           f[j].show_faci();
          }
          break;
         }

       }

       System.out.println("TO RETURN BACK press 1 Or \n FOR MORE press 0");

       s5 = t.nextInt();

      }

      break;

     }

    case 6:

     {

      s6 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                       **STAFF SECTION**");

      System.out.println("--------------------------------------------------------------------------------");

      while (s6 == 1)

      {


       String a = "Nurse", b = "Worker", c = "Security";

       System.out.println("1.New Entry\n2.Nurse List\n3.Worker List \n4.Securuty List");

       c1 = t.nextInt();

       switch (c1)

       {

        case 1:
         {
          s[count6].new_staff();count6++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");


          System.out.println("Id \t Name \t Gender \t Salary");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count6; j++)

          {

           if (a.equals(s[j].desg))

            s[j].staff_info();

          }

          break;

         }

        case 3:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("Id \t Name \t Gender \t Salary");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count6; j++)

          {

           if (b.equals(s[j].desg))

            s[j].staff_info();

          }

          break;

         }

        case 4:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("Id \t Name \t Gender \t Salary");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count6; j++)

          {

           if (c.equals(s[j].desg))

            s[j].staff_info();

          }

          break;

         }

       }

       System.out.println("TO RETURN BACK press 1 Or \n FOR MORE press 0");

       s6 = t.nextInt();

      }

      break;

     }

    case 7:

     {

      break;

     }

    default:

     {

      System.out.println("INAVLID CHOICE!");

     }

   }

   System.out.println("TO RETURN MAIN MENU press 1 Or \n FOR MORE press 0");

   status = t.nextInt();

  }

 }

}
