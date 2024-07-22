/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.web_scrapping;

import java.io.IOException;
       
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

        
public class Web_Scrapping {

    public static void main(String[] args) throws IOException {
       Document doc = Jsoup.connect("https://www.netshoes.com.br/p/chuteira-nike-beco-2-futsal-vermelho-JD8-4975-016?sellerId=13644&promoted=true").get();
       Element titleElement = doc.selectFirst (".Product-name");
       System.out.println("Product name: " + titleElement.text());
       Element priceElement = doc.selectFirst (".Price-box");
       System.out.println("Product price: " + priceElement.text());
       Element descriptionElement = doc.selectFirst(".features--description");
        if (descriptionElement != null) {
       System.out.println("Product description: " + descriptionElement.text());
        } else {
       System.out.println("Product Description: Nao consegui encontrar");
      Element imageElement = doc.selectFirst(".showcase__image-presenter--desktop");
        if (imageElement != null) {
        } else {
       System.out.println("Product image: Nao consegui encontrar");     
       
    }
    }
}
} 