package com.crm;

import com.crm.entity.*;
import com.crm.repository.CategoryRepository;
import com.crm.repository.LaptopRepository;
import com.crm.repository.ProductRepository;
import com.crm.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CrmApplication {
//	@Autowired
//	private  static StudentRepository studentRepository;
//	private static LaptopRepository laptopRepository;	public CrmApplication(StudentRepository studentRepository,LaptopRepository laptopRepository) {
//		this.studentRepository=studentRepository;
//		this.laptopRepository=laptopRepository;
//	}



	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);


//	@Bean//it will create object of this particular class,and keep the details in spring ioc.
//	public ModelMapper getMapper(){
//		return new ModelMapper();
//	}
//One to One
//		Student student=new Student();
//		student.setStudentId(3);
//		student.setName("Samir");
//		student.setAbout("I am a java developer");
//       studentRepository.save(student);
////
//		Student student1=new Student();
//		student1.setStudentId(2);
//		student1.setName("Sumit");
//		student1.setAbout("I am a java developer");
//        studentRepository.save(student1);

//		Laptop laptop=new Laptop();
//		laptop.setLaptopId(102);
//		laptop.setLaptopModel("Vostro 3176");
//		laptop.setBrand("Dell");
//  laptopRepository.save(laptop);
//		laptop.setStudent(student);
//		student.setLaptop(laptop);

//One to many or Many to one
//		Student student=new Student();
//		student.setStudentId(3);
//		student.setName("Samir");
//		student.setAbout("I am a java developer");
//       studentRepository.save(student);
//
//
//	   Address a1=new Address();
//	   a1.setId(100);
//	   a1.setCity("Jamshedpur");
//	   a1.setState("Jharkhand");
//	   a1.setCountry("India");
//	   a1.setStudent(student);
//
//		Address a2=new Address();
//		a2.setId(101);
//		a2.setCity("Ranchi");
//		a2.setState("Jharkhand");
//		a2.setCountry("India");
//a2.setStudent(student);
//List<Address> addressList=new ArrayList<>();
//addressList.add(a1);
//addressList.add(a2);
//
//student.setAddress1(addressList);
//studentRepository.save(student);


//Many to many
//		Product product1=new Product();
//		product1.setpId("pid_1");
//		product1.setProductName("Iphone 14 max pro");
//
//		Product product2=new Product();
//		product2.setpId("pid_2");
//		product2.setProductName("Samsung S22 Ultra");
//
//		Product product3=new Product();
//		product3.setpId("pid_3");
//		product1.setProductName("Samsung Tv4494");
//
//		Category category1=new Category();
//		category1.setcId("cId_1");
//		category1.setTitle("Electronics");
//
//		Category category2=new Category();
//		category2.setcId("cId_2");
//		category2.setTitle("Mobiles");
//
//		List<Product>category1ProductList=category1.getProductList();
//		category1ProductList.add(product1);
//		category1ProductList.add(product2);
//		category1ProductList.add(product3);
//
//		List<Product>category2Product=category2.getProductList();
//		category2Product.add(product1);
//		category2Product.add(product2);
//
//		categoryRepository.save(category1);
//		categoryRepository.save(category2);
//      Category category= categoryRepository.findById("cId_1").get();
//		System.out.println(category.getProducts.);

	}
	@Autowired
	private static CategoryRepository categoryRepository;



	@Autowired
	private ProductRepository productRepository;
	public CrmApplication(ProductRepository productRepository,CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository=categoryRepository;
	}
}
