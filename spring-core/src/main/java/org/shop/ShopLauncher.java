package org.shop;

import org.shop.data.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
    	/**
    	 * 1. Getting and initializing ApplicationContext
    	 */
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	/**
    	 * 2. Getting bean by alias    	  	
    	 */
    	Item item = (Item) context.getBean("item-alias");
    	
    	/**
    	 * 3. By using autowire="byName" in "item" bean
    	 * spring set its "order" and "product" fields by name match  
    	 * 
    	 * 
    	 * 4. By using autowire="byType" in "order" bean
    	 * spring set its "user" field by type match 
    	 * 
    	 * 5. By using autowire="autodetect" 
    	 * spring will apply closest match: by type, by name or constructor
    	 * Unfortunately this template does not consists of quite enough classes for such example
    	 * 
    	 */
    	
    	
    	System.out.println(item);
    }
}