/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologies;

import jade.content.*;

public class Account implements Concept {
// --------------------------------------

   private String id;
   private String name;
   private float balance = 0;

   public String getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public float getBalance() {
      return balance;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setBalance(float balance) {
      this.balance = balance;
   }

   public boolean equals(Account acc) {
      return acc.getId().equals(this.id);
   }

   public String toString() {
      return name + "  # " + id + "  --> balance = " + balance;
   }
}