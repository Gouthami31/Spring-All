package com.mvn.Has_A_Relation;

public class marks {
      private int tel;
      private int hin;
      private int eng;
      public marks(int tel,int hin,int eng) {
    	  this.tel=tel;
    	  this.hin=hin;
    	  this.eng=eng;
      }
      public marks() {
    	  
      }
      public void setTel(int tel) {
    	  this.tel=tel;
      }
      public void setHin(int hin) {
    	  this.hin=hin;
      }
      public void setEng(int eng) {
    	  this.eng=eng;
      }
      public int getTel() {
    	  return this.tel;
      }
      public int getHin() {
    	  return this.hin;
      }
      public int getEng() {
    	  return this.eng;
      }
}
