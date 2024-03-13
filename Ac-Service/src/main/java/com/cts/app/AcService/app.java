package com.cts.app.AcService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;
 
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.app.AcService.dao.CustomerDao;
import com.cts.app.AcService.dao.DeviceDao;
import com.cts.app.AcService.dao.EmployeeDao;
import com.cts.app.AcService.dao.LoginDao;
import com.cts.app.AcService.dao.RegisterDao;
import com.cts.app.AcService.dao.RepairDao;
import com.cts.app.AcService.dao.impl.RepairDaoImpl;
import com.cts.app.AcService.dao.impl.CustomerDaoImpl;
import com.cts.app.AcService.dao.impl.DeviceDaoImpl;
import com.cts.app.AcService.dao.impl.LoginDaoImpl;
import com.cts.app.AcService.dao.impl.RegisterDaoImpl;
import com.cts.app.AcService.dao.impl.EmployeeDaoImpl;
import com.cts.app.AcService.entity.Customer;
import com.cts.app.AcService.entity.Device;
import com.cts.app.AcService.entity.Employee;
import com.cts.app.AcService.entity.Login;
import com.cts.app.AcService.entity.Register;
import com.cts.app.AcService.entity.Repair;

 
/**
* Hello world!
*
*/
public class app {

 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("com/cts/app/AcService/springConfig.xml");
		CustomerDao Dao= (CustomerDaoImpl)context.getBean("dao");
		DeviceDao Dao1= (DeviceDaoImpl)context.getBean("dao1");
		EmployeeDao Dao2= (EmployeeDaoImpl)context.getBean("dao2");
		RepairDao Dao3= (RepairDaoImpl)context.getBean("dao3");
		LoginDao Dao4= (LoginDaoImpl)context.getBean("dao4");
		RegisterDao Dao5= (RegisterDaoImpl)context.getBean("dao5");
		
//		System.out.println("Make a choice");
		//do {
		System.out.println("1.CUSTOMER");
		System.out.println("2.ADMIN");
		System.out.println("3.EMPLOYEE");
		System.out.println("4.EXIT");
		int choice=Integer.parseInt(sc.nextLine());

		if(choice==1){
            do {
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. Enter Customer Details");
			System.out.println("4. Enter Device Details");
			System.out.println("5. EXIT");
			int customerChoice=Integer.parseInt(sc.nextLine());
			switch(customerChoice){

			case 1:
				
				System.out.println("Enter the UserName: ");
				String UserName=sc.nextLine();
				System.out.println("Enter the Password: ");
				String Password=sc.nextLine();
			
				Login loginRef = (Login) context.getBean("loginBean");
				loginRef.setName(UserName);
				loginRef.setPassword(Password);
		
			    //context.close();
				boolean res4=Dao4.createLogin(loginRef);
				if(res4)
				System.out.println("Successfully login");
				
				break;
				
				
				
			case 2:
				
				System.out.println("Enter the Customer ID: ");
				int CID=Integer.parseInt(sc.nextLine());
				System.out.println("Enter the Customer Name: ");
				String CName=sc.nextLine();
				System.out.println("Enter the Customer PhoneNumber: ");
				String CPhoneNumber=sc.nextLine();
				System.out.println("Enter the Customer Email: ");
				String CEmail=sc.nextLine();
				System.out.println("Enter the Password: ");
				String CPassword=sc.nextLine();
			
				
				Register registerRef = (Register) context.getBean("registerBean");
				registerRef.setCustomerId(CID);
				registerRef.setName(CName);
				registerRef.setPhone(CPhoneNumber);
				registerRef.setEmail(CEmail);
				registerRef.setPassword(CPassword);
			    //context.close();
				boolean res5=Dao5.createRegister(registerRef);
				if(res5)
				System.out.println("Customer Created");
				
				break;
			
				case 3:
					System.out.println("Enter the Customer ID: ");
					int CustomerID=Integer.parseInt(sc.nextLine());
					System.out.println("Enter the Customer Name: ");
					String CustomerName=sc.nextLine();
					System.out.println("Enter the Customer PhoneNumber: ");
					String CustomerPhoneNumber=sc.nextLine();
					System.out.println("Enter the Customer Email: ");
					String CustomerEmail=sc.nextLine();
				
					
					Customer customerRef = (Customer) context.getBean("customerBean");
					  customerRef.setId(CustomerID);
					  customerRef.setName(CustomerName);
					  customerRef.setPhone(CustomerPhoneNumber);
					  customerRef.setEmail(CustomerEmail);
				    //context.close();
					boolean res=Dao.createCustomer(customerRef);
					if(res)
					System.out.println("Customer Created");
					
					break;
		
		
				case 4:
					System.out.println("Enter the Device ID: ");
					int DeviceID=Integer.parseInt(sc.nextLine());
     				System.out.println("Enter the Device Brand: ");
					String DeviceBrand=sc.nextLine();
					System.out.println("Enter the Device Model: ");
					String DeviceModel=sc.nextLine();
					System.out.println("Enter the Device Type: ");
					String DeviceType=sc.nextLine();
					System.out.println("Enter the Device Problem: ");
					String DeviceProblem=sc.nextLine();
					
					Device deviceRef = (Device) context.getBean("deviceBean");
					deviceRef.setId(DeviceID);
				    deviceRef.setBrand(DeviceBrand);
					deviceRef.setModel(DeviceModel);
					deviceRef.setType(DeviceType);
					deviceRef.setProblem(DeviceProblem);
				    //context.close();
					boolean res1=Dao1.createDevice(deviceRef);
					if(res1)
					System.out.println("Device details added");
					break;
					
				default:
					System.out.println("Invalid Choice");
					break;
					
				case 5:
					System.exit(1);
					break;
					
		      }
            }while(true);
                    }
            
	 else if(choice==2){
		 do {
			System.out.println("1. Enter Employee Details");
			System.out.println("2. Fetch Device Details");
			System.out.println("3. Fetch Customer Details");
			System.out.println("4. Fetch Employee Details");
	        System.out.println("5. Fetch Registration Details");
	        System.out.println("6. Fetch Login Details");
	        System.out.println("7. EXIT");
		    int adminChoice=Integer.parseInt(sc.nextLine());
            switch(adminChoice){
				case 1:
					System.out.println("Enter the Employee ID: ");
					int EmployeeID=Integer.parseInt(sc.nextLine());
					System.out.println("Enter the Employee Name: ");
					String EmployeeName=sc.nextLine();
					System.out.println("Enter the Employee PhoneNumber: ");
					String EmployeePhoneNumber=sc.nextLine();
					System.out.println("Enter the Employee Email: ");
					String EmployeeEmail=sc.nextLine();
			
					Employee employeeRef = (Employee) context.getBean("employeeBean");
					employeeRef.setId(EmployeeID);
					employeeRef.setName(EmployeeName);
					employeeRef.setPhone(EmployeePhoneNumber);
					employeeRef.setEmail(EmployeeEmail);
				    //context.close();
					boolean res2=Dao2.createEmployee(employeeRef);
					if(res2)
					System.out.println("Employee Created");
					
					break;
				case 2:
					Dao1.fetchDevice().forEach(device -> System.out.println(device));
					break;
				case 3:
					Dao.fetchCustomer().forEach(customer -> System.out.println(customer));
					break;
				case 4:
					Dao2.fetchEmployee().forEach(employee -> System.out.println(employee));
					break;
				case 5:
					Dao5.fetchRegister().forEach(register -> System.out.println(register));
					break;
				case 6:
					Dao4.fetchLogin().forEach(login -> System.out.println(login));
					break;
				default:
					System.out.println("Invalid Choice");
					break;
					
				case 7:
					System.exit(1);
					break;
		      }
                       }while(true);
	 }
	 else if(choice==3){
		 do {
			System.out.println("1. Fetch Repair Details");
			System.out.println("2. EXIT");
		    int employeeChoice=Integer.parseInt(sc.nextLine());
         switch(employeeChoice){
				
				case 1:
					Dao1.fetchDevice().forEach(device -> System.out.println(device));
					break;
				default:
					System.out.println("Invalid Choice");
					break;
					
				case 2:
					System.exit(1);
					break;
		      }
		 }while(true);
                    }
	 
		else{
		     System.out.println("Exit");
	
		}
		
		//}
		//while(true);
			
	}
}

		
