package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 105021038 傅琬鈞
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scn=new Scanner(System.in);
				ArrayList<Student>studList=new ArrayList<Student>();
		studList.add(new Student("David","1899"));
		studList.add(new Student("Jack","1085"));
		studList.add(new Student("Kevin","1985"));
		studList.get(1).showInfo();
		studList.get(1).addCourse("程式1","1050807");
		studList.get(1).showInfo();

			}

		}
		

		class Student {

			private String id, name;
			private ArrayList<Course> couList = new ArrayList<Course>();

			public Student(String name1, String id1) {
				name = name1;
				id = id1;
			}

			public void showInfo() {
				System.out.println(name);
				System.out.println(id);
				System.out.println(couList.size());
				for (int i = 0; i < couList.size(); i++) {
					System.out.println(couList.get(i).getName());
					System.out.println(couList.get(i).getID());
				}
			}

			public void addCourse(String name1, String id1) {
				couList.add(new Course(name1, id1));
			}

		}
		class Course {

			private String couName, couID, teacher;
			private int score;

			public Course(String name1, String id1) {
				couName = name1;
				couID = id1;
			}

			public String getName() {
				return couName;
			}

			public String getID() {
				return couID;
			}
		}
