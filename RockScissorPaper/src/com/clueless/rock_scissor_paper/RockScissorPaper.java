package com.clueless.rock_scissor_paper;

import java.util.Scanner;

public class RockScissorPaper {
	public static void main(String[] args) {

		String me;
		int num;
		String computer;
		int com;
		String re;
		int mecount=0;
		int comcount=0;
		boolean chcek = true;
		Scanner scan = new Scanner(System.in);
		
			while(chcek){
				System.out.println("");
				while(true){
			System.out.println("가위,바위,보!\n당신: ");
			me = scan.nextLine();
		
		
			if(me.equals("가위")) num=0;
			else if (me.equals("바위")) num=1;
			else num=2;
		    
			com = (int)(Math.random()*3);
			if(com==0) computer="가위";
			else if(com==1) computer="바위";
			else computer="보";
			
			System.out.println("컴터: "+computer);
			
			
			if((num==0 && com== 1)||num==1 && com== 2||num==2 && com== 0){
				System.out.println("컴퓨터한테 졌습니다.");
				comcount+=1;
			}
			else if((num==1 && com== 0)||num==2 && com== 1||num==0 && com== 2){
				System.out.println("당신이 이겼습니다.");
				mecount+=1;
			}
			else{
				System.out.println("비겼습니다.");
				break;
			}
			
			System.out.println("내가 이긴횟수: "+mecount+"   컴퓨터가 이긴횟수: "+comcount);
			
			System.out.println("한판더?? (y,n)");
			re = scan.nextLine();
			 if(re.equals("n")) {
				 chcek=false;
				 break;
			}
		 }
       }
	}
}	
	
