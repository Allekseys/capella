package com.hillel;

import static java.lang.Double.MAX_VALUE;

public class Copmlex {

  private double re;
  private double im;

  public Copmlex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  @Override
  public String toString() {
    if (this.im > 0) {
      return this.re + "+" + this.im + "i";
    } else if (this.im < 0){
      return this.re + "" + this.im + "i";
    } else {
      return this.re + "";
    }
  }

  public Copmlex add(Copmlex number) {
    this.re = this.re + number.re;
    this.im = this.im + number.im;
    return this;
  }

  public Copmlex sub(Copmlex number) {
    this.re = this.re - number.re;
    this.im = this.im - number.im;
    return this;
  }

  public Copmlex mult(Copmlex number) {
    double re = this.re * number.re - this.im * number.im;
    this.im = this.im * number.re + this.re * number.im;
    this.re = re;
    return this;
  }

  public Copmlex div(Copmlex number) {
    if (number.re != 0 || number.im != 0) {
      double re = (this.re * number.re + this.im * number.im) / (number.re * number.re + number.im * number.im);
      this.im = (this.im * number.re + this.re * number.im) / (number.re * number.re + number.im * number.im);
      this.re = re;
      return this;
    }
    System.out.println("Error: Divising by zero");
    this.re = MAX_VALUE;
    this.im = MAX_VALUE;
    return this;
  }

  public Copmlex sqrtPlusRoot() {
    if (this.im != 0) {
      double re = Math.sqrt((this.re + Math.sqrt((this.re * this.re + this.im * this.im))) / 2);
      this.im = Math.signum(this.im) * Math.sqrt((-1 * this.re + Math.sqrt((this.re * this.re + this.im * this.im))) / 2);
      this.re = re;
      return this;
    }
    this.re = MAX_VALUE;
    this.im = MAX_VALUE;
    return this;
  }

  public Copmlex sqrtMinusRoot() {
    if (this.im != 0) {
      double re = -1 * Math.sqrt((this.re + Math.sqrt((this.re * this.re + this.im * this.im))) / 2);
      this.im = -1 * Math.signum(this.im) * Math.sqrt((-1 * this.re + Math.sqrt((this.re * this.re + this.im * this.im))) / 2);
      this.re = re;
      return this;
    }
    this.re = MAX_VALUE;
    this.im = MAX_VALUE;
    return this;
  }

  public double getRe() {
    return re;
  }

  public void setRe(double re) {
    this.re = re;
  }

  public double getIm() {
    return im;
  }

  public void setIm(double im) {
    this.im = im;
  }
}
