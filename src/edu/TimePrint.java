/*
 * Copyright (c) 2017. Aleksey Eremin
 * 11.01.17 17:01
 *
 */

package edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by ae on 11.01.2017.
 */
public class TimePrint implements ActionListener {
  private int cnt;
  
  @Override
  public void actionPerformed(ActionEvent e) {
    Date dat = new Date();
    System.out.println(cnt+ ") Current time: " + dat);
    cnt++;
  }
}

