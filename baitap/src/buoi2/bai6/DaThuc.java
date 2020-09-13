/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai6;

import java.util.Scanner;

public class DaThuc {
    private int stage;
    private int[] entry = new int[100];

    public DaThuc(int stage, int[] entry) {
        this.stage = stage;
        this.entry = entry;
    }

    public DaThuc() {
    }

    public int getStage() {
        return stage;
    }

    public int[] getEntry() {
        return entry;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bậc của đa thức: ");
        this.stage = sc.nextInt();
        int i;
        for(i=this.stage; i>0 ; i--){
            this.entry[i] = 0;
        }
        while (this.entry[this.stage]==0){
            System.out.println("Nhập hệ số của hạng tử bậc cao nhất :");
            this.entry[this.stage] = sc.nextInt();
        }
        for(i=this.stage-1; i>0 ; i--){
            System.out.println("Nhập hệ số của hạng tử bậc "+i+" :");
            this.entry[i] = sc.nextInt();
        }
    }

    public void outputInfo(){
        System.out.println("Đa thức bậc "+this.stage);
        if (this.entry[this.stage]==1)
            System.out.print("P(x)= X^"+this.stage);
        else
            System.out.print("P(x)= "+this.entry[this.stage]+"X^"+this.stage);
        int i;
        for(i= this.stage-1 ; i>0 ; i--){
            if (i!=1) {
                if (this.entry[i] == 0) {
                    continue;
                }
                if (this.entry[i] == 1) {
                    System.out.print(" +" + " X^" + i);
                } else
                    System.out.print(" + " + this.entry[i] + "X^" + i);
            }
            else {
                if (this.entry[i] == 0) {
                    continue;
                }
                if (this.entry[i] == 1) {
                    System.out.print(" +" + "X" );
                } else
                    System.out.print(" + " + this.entry[i] + "X" );
            }
        }
        System.out.println();
    }

    public void addPolynomial(int targetStage, int[] targetEntry){
        int[] result = new int[100];
        int i;
        if (targetStage >= this.stage){
            for(i=targetStage; i>0 ; i--){
                result[i] = targetEntry[i]+this.entry[i];
            }

            if(result[targetStage]==0)
                System.out.print("G(x)= ");
            else
                if (result[targetStage]==1)
                    System.out.print("G(x)= X^"+targetStage);
                else
                    System.out.print("G(x)= "+result[targetStage]+"X^"+targetStage);
            for(i= targetStage-1 ; i>0 ; i--){
                if (i!=1) {
                    if (result[i] == 0) {
                        continue;
                    }
                    if (result[i] == 1) {
                        System.out.print(" +" + " X^" + i);
                    } else
                        System.out.print(" + " + result[i] + "X^" + i);
                }
                else {
                    if (result[i] == 0) {
                        continue;
                    }
                    if (result[i] == 1) {
                        System.out.print(" +" + "X" );
                    } else
                        System.out.print(" + " + result[i] + "X" );
                }
            }
            System.out.println();
        }
        else{
            for(i=this.stage; i>0 ; i--){
                result[i] = targetEntry[i]+this.entry[i];
            }
            if(result[this.stage]==0)
                System.out.print("G(x)= ");
            else
            if (result[this.stage]==1)
                System.out.print("G(x)= X^"+this.stage);
            else
                System.out.print("G(x)= "+result[this.stage]+"X^"+this.stage);
            for(i= this.stage-1 ; i>0 ; i--){
                if (i!=1) {
                    if (result[i] == 0) {
                        continue;
                    }
                    if (result[i] == 1) {
                        System.out.print(" +" + " X^" + i);
                    } else
                        System.out.print(" + " + result[i] + "X^" + i);
                }
                else {
                    if (result[i] == 0) {
                        continue;
                    }
                    if (result[i] == 1) {
                        System.out.print(" +" + "X" );
                    } else
                        System.out.print(" + " + result[i] + "X" );
                }
            }
            System.out.println();
        }
    }

    public void subtractPolynomial(int targetStage, int[] targetEntry){
        int[] result = new int[100];
        int i;
        if (targetStage >= this.stage){
            for(i=targetStage; i>0 ; i--){
                result[i] = this.entry[i]-targetEntry[i];
            }

            if(result[targetStage]==0)
                System.out.print("G(x)= ");
            else
            if (result[targetStage]==1)
                System.out.print("G(x)= X^"+targetStage);
            else
                System.out.print("G(x)= "+result[targetStage]+"X^"+targetStage);

            for(i= targetStage-1 ; i>0 ; i--){
                if (i!=1) {
                    if (result[i] == 0) {
                        continue;
                    }
                    if (result[i] == 1) {
                        System.out.print(" +" + " X^" + i);
                    } else
                        System.out.print(" + " + result[i] + "X^" + i);
                }
                else {
                    if (result[i] == 0) {
                        continue;
                    }
                    if (result[i] == 1) {
                        System.out.print(" +" + "X" );
                    } else
                        System.out.print(" + " + result[i] + "X" );
                }
            }
            System.out.println();
        }
        else{
            for(i=this.stage; i>0 ; i--){
                result[i] = this.entry[i]-targetEntry[i];
            }
            if(result[this.stage]==0)
                System.out.print("G(x)= ");
            else
            if (result[this.stage]==1)
                System.out.print("G(x)= X^"+this.stage);
            else
                System.out.print("G(x)= "+result[this.stage]+"X^"+this.stage);
            for(i= this.stage-1 ; i>0 ; i--){
                if (i!=1) {
                    if (result[i] == 0) {
                        continue;
                    }
                    if (result[i] == 1) {
                        System.out.print(" +" + " X^" + i);
                    } else
                        System.out.print(" + " + result[i] + "X^" + i);
                }
                else {
                    if (result[i] == 0) {
                        continue;
                    }
                    if (result[i] == 1) {
                        System.out.print(" +" + "X" );
                    } else
                        System.out.print(" + " + result[i] + "X" );
                }
            }
            System.out.println();
        }
    }
}
