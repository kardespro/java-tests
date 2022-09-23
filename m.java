package com.negodev;

import com.negodev.utils.Network.Network;


class Main {
  public static void main(String[] args) {

      double value = 99.5;
        String formattedValue = Network.provideHost(value);
        System.out.println("Response = " + formattedValue);
     
    }
}