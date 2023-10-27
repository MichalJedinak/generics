package com.skilmea.java.generics.uloha.uloha_4;

import java.util.List;

import com.skilmea.java.generics.uloha.uloha_3.objects.Kniha;

public interface WebElementManager {
      void addButton(String text,String action);
      void addForm(String name);
      void addItem(String name);
      Integer addBook(Kniha kniha);
      List<Kniha> getAllBooks();
      Kniha getBook(String title);//  or  int id  lepšie  pre výber s SQL databazy
}
