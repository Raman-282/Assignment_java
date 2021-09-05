package com.example.demo;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class Product {
   

    
   @GetMapping("/myurl")
   public String sayHello()
   {
       return "Welcome To Our Site";
   }
   

   
   @GetMapping("/productinfo")
   public ProductInfo getProductInfo() {
   ProductInfo p =new  ProductInfo();
   

   p.setId(1);
   p.setUserid("Raman");
   p.setTitle("LEE");
   p.setType("Jeans");
   p.setPrice(2000.00);
   p.setDiscount(200.00);
   p.setQuantity(1);
   p.setVendor("Trends");  
   return p;
   }
   

   
   @GetMapping("/productinfo/{id}")
   public ProductInfo getProductById(@PathVariable("id") Integer id) {
       ProductInfo p =new  ProductInfo();
       

       
       p.setId(1);
       p.setUserid("Raman");
       p.setTitle("LEE");
       p.setType("Jeans");
       p.setPrice(2000.00);
       p.setDiscount(200.00);
       p.setQuantity(1);
       p.setVendor("Trends");  
       return p;
  
}
   
   
  @PostMapping(value = "/insertproductdetails")
  public ProductInfo insertProductDetail(@RequestBody ProductInfo product) {
  return new ProductService().addProduct(product); //calling the service
  }
  

  
  @PutMapping("/update")
  public ProductInfo updateProductInfo(@RequestBody ProductInfo product) {
  return new ProductService().updateProduct(product);
  }
  

  
  @GetMapping("/getlist")
  public List<ProductInfo> getProductList() {
  List<ProductInfo> listOfProduct = new ProductService().getAllProductlist();
  return listOfProduct;
  }
  

  
  @DeleteMapping("/delete/{id}")
  public List<ProductInfo> deleteProductById(@PathVariable Integer id) {
      new ProductService().deleteProduct(id);
      return new ProductService().getAllProductlist();
  }
}
