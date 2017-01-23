package com.clueless.rock_scissor_paper;

import java.util.Scanner;

public class RockScissorPaper_2 {
	public static void generateHand() {
		System.out.println("묵찌빠!");
		me = scan.nextLine();
		while(true){
			if(me.equals("찌")) {
				num=0; break; 
			}
			else if (me.equals("묵")){
				num=1; break; 
			}
			else if (me.equals("빠")){
				num=2; break; 
			}
			else 
				System.out.println("다시입력하세요.\n");
			me = scan.nextLine();
		}
		
		com = (int)(Math.random()*3);
		if(com==0) computer="찌";
		else if(com==1) computer="묵";
		else computer="빠";
		
		System.out.println("컴터: "+computer+"\n");
	}

	
	static String me;
	static int num;	
	static String computer;
	static int com;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String re;
		int mecount=0;
		int comcount=0;
		int comattack=0;
		int meattack=0;
		boolean check = true;
		
		
			while(check){
				System.out.println("");
				while(true){
			System.out.println("가위,바위,보! (그만:n)\n당신:");
			me = scan.nextLine();
			if(me.equals("n")){
				check=false;
				System.out.println("수고하셨습니다.");
				break;
			}
			
			while(true){
			if(me.equals("가위")) {
				num=0; break; 
			}
			else if (me.equals("바위")){
				num=1; break; 
			}
			else if (me.equals("보")){
				num=2; break; 
			} 
			else 
				System.out.println("다시입력하세요.");
				me = scan.nextLine();
			}
			
		
			
			com = (int)(Math.random()*3);
			if(com==0) computer="가위";
			else if(com==1) computer="바위";
			else computer="보";
			
			System.out.println("컴터: "+computer);
			
			
			if((num==0 && com== 1)||num==1 && com== 2||num==2 && com== 0){
				System.out.println("공격: 컴퓨터  수비: 당신");
				comattack=1; meattack=0;
				
			}
			else if((num==1 && com== 0)||num==2 && com== 1||num==0 && com== 2){
				System.out.println("공격: 당신  수비: 컴퓨터");
				meattack=1; comattack=0;
			
			}
			else{
				System.out.println("비겼습니다.");
				break;
			}
			
			
				while(true){
					/////////////////컴퓨터 공격
					if(comattack==1){
						
						generateHand();
						
					if(com==num){
						System.out.println("컴퓨터한테 졌습니다.");
						comcount+=1;
						break;
					}
					else if((num==1 && com== 0)||(num==2 && com== 1)||(num==0 && com== 2)){
						System.out.println("공격권 전환!! = 공격: 사람");
						comattack=0; meattack=1;
			
						
					}
					
				}
				/////////////////////////////////당신 공격
					
						
						if(meattack==1){
							
							generateHand();
							
							if(com==num){
								System.out.println("당신이 이겼습니다.");
								mecount+=1;
								break;
							}
							else if((num==0 && com== 1)||(num==1 && com== 2)||(num==2 && com== 0)){
								System.out.println("공격권 전환!! = 공격: 컴퓨터");
								comattack=1; meattack=0;
								
								
							}
						
						}
				
				
			}
			System.out.println("내가 이긴횟수: "+mecount+"   컴퓨터가 이긴횟수: "+comcount+"\n");
			
		 }
				
       }
	}
}	
	
