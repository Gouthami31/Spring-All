package com.mvn.depInjection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      /* product p=new product(11,"cloths",1000);
       order o=new order(1,"zeans",p);
        p.setPid(101);
       p.setPname("mobiles");
       p.setPrice(2000);
      /* System.out.println(p.getPid());
       System.out.println(p.getPname());
       System.out.println(p.getPrice());*/
      /* o.print();*/
       
    	product p=new product();
    	 p.setPid(101);
         p.setPname("mobiles");
         p.setPrice(2000);
    	order o=new order(1,"phone",p);
    	o.setProduct(p);
    	o.print();
       
       
       
       
       
    }
}
