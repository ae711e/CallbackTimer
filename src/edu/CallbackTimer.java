/*
 * Copyright (c) 2017. Aleksey Eremin
 * 11.01.17 17:00
 *
 */
// by novel  http://pr0java.blogspot.ru/2015/07/8-callback.html

package edu;

import javax.swing.*;
import java.awt.event.ActionListener;


/**
 * Created by ae on 11.01.2017.
 */
// Использование обратного вызова на Java
  
public class CallbackTimer {
  public static void main(String[] args)
  {
    System.out.println("Hello!");
    ActionListener listener = new TimePrint();
    Timer t = new Timer(1000, listener);
    t.start();
    JOptionPane.showMessageDialog(null, "Exit programm?");
    System.exit(0);
  }
  
}
