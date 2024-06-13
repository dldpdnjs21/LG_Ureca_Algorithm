package com.ureca;

public class NameMenu {
	//데이터에 대한 CRUD
	
	//데이터 저장소
	String []names = new String[5]; //최대 5명의 이름을 배열로 저장
	//String []names = {null,null,null,null,null}; 값이 들어가기 전 상태
	void create(String name){
		for(int i=0; i<names.length; i++) {
			if(names[i] == null) {//빈곳 찾기
				names[i] = name;
				break;
			}//if
		}//for
	}//create
	String[] read(){
		return names; //String 배열로 저장된 값을 names로 넘겨준다
	}//read
	void update(String oldName, String newName){
		for(int i=0; i<names.length; i++) {
//			if(names[i] == oldName) { //변경할 이름을 찾았다면
		    //==> String 메모리 주소 비교
			//==> 실행이 될 때도 있고 안 될때도 있다
			
			if(names[i].equals(oldName)) {
			//==> String(문자열) 내용 비교
				names[i] =
				newName;
				break;
			}//if
		}//for
	}//update
	void delete(String delName){
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(delName)) { //삭제할 이름을 찾았다면
				names[i] = null;
				break;
			}//if
		}//for
	}//delete
	
	//<클래스작성>
	//NameMenu.java (이름에 대한 추가, 검색, 수정, 삭제 기능메소드를 정의)
	// - 멤버변수(필드): 배열객체(String names[])
	//   
	//	     멤버메소드)
	// -추가() : add/addName/append/create/insert 
	//	       names[0]가 빈자리 체크?    
	//	              names[0] ==  null           O
	//	              names[0] .equals(  null )   X
	// -검색()
	// -수정()
	// -삭제()
	//	       names[0]가 "홍길동" 체크?
	//	              names[0] ==  delName           X
	//	              names[0] .equals(  delName )   O
}
