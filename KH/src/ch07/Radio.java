package ch07;

public class Radio {

		double channel; 
		int volume;
		boolean onOff;
		String name;
		
		Radio(){
			
		}
		Radio(String name){
			this.name = name;
		}
		
		
		void printInfo() {
			System.out.println("["+name+" 라디오]");
			if(onOff == false)
			{
				System.out.println("라디오가 꺼져있습니다.");
			}
			else
				System.out.println("라디오가 켜져있습니다.");
			System.out.println("현재 채널은 " + channel + "입니다. \n볼륨은 " + volume + "입니다.");
			System.out.println("----------------------------------------");
		}
		void setVolume(int vl) {
			volume = vl;
			
			System.out.println("system : Volume 재설정");
			System.out.println("----------------------------------------");
		}
		void setChannel(double ch) {
			channel = ch;
			
			System.out.println("system : 채널 재설정");
			System.out.println("----------------------------------------");
		}
		void setName(String nm) {
			name = nm;
		}
		void setOnOff() {
			
			if(onOff == false)
			{
				onOff = true;
				System.out.println("system : 라디오를 켰습니다.");
			}
			else {
				onOff = false;
				System.out.println("system : 라디오를 껐습니다.");
				
			}
			System.out.println("----------------------------------------");
		}
}
