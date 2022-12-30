# RM_최영애_코딩테스트_과제

## DB ERD
![Untitled](https://user-images.githubusercontent.com/109134495/210075420-e2ea4937-c90f-4104-9108-2fd948ac8378.png)

## 세팅법
1. 이 git을 clone한다.
2. 다음과 같은 방법으로 maven install을 진행하여 war 파일을 생성한다.<br/>
![image](https://user-images.githubusercontent.com/109134495/210075572-c64fd1ce-20ba-4793-87bd-c3f6ddda409f.png)<br/>
생성이 성공적이라면 다음과 같이 target폴더 안에 war 파일이 생겼을 것이다.<br/>
![image](https://user-images.githubusercontent.com/109134495/210075709-99208cab-df2b-4327-8491-3a76e71114f0.png)<br/>
3. 프로젝트의 폴더로 들어가 '터미널에서 열기'를 실행한다.<br/>
![image](https://user-images.githubusercontent.com/109134495/210075819-e399d1a4-6a8d-476e-9e5b-3a3ef8e9429d.png)<br/>
4. 이처럼 'docker-compose up --build -d'를 입력한다.<br/>
![image](https://user-images.githubusercontent.com/109134495/210075971-82badde4-616b-4ec9-99aa-c0be078f83cf.png)<br/>
5. 개인의 db 프로그램에 접속하여 3306포트의 사용자 root, 비밀번호 root의 연결을 만들고 이 git에 있는 db.sql을 열어 안의 내용을 전체 복사, 붙여넣기하고 실행한다.
6. 주소창에 'localhost:8080'을 입력하면 메인화면이 뜬다.<br/>
![image](https://user-images.githubusercontent.com/109134495/210076360-5bcafa6e-bd04-49e6-b308-dd978b8a832c.png)<br/>
'http://localhost:8080/product'를 입력하면 상품정보 데이터를 조회할 수 있다.<br/>
![image](https://user-images.githubusercontent.com/109134495/210076460-df6399ac-8dc2-44e5-ad60-62088da57c17.png)<br/>
(저는 JSON Viewer 확장 프로그램을 쓰고 있습니다. 편히 보시려면 해당 확장 프로그램을 크롬에서 다운 후 적용하시면 됩니다.)<br/>
'http://localhost:8080/company'를 입력하면 상품정보 데이터를 조회할 수 있다.<br/>
![image](https://user-images.githubusercontent.com/109134495/210076584-99f3d99e-66f6-4cd4-a384-be1da822b2ac.png)<br/>
'http://localhost:8080/customer'를 입력하면 상품정보 데이터를 조회할 수 있다.<br/>
![image](https://user-images.githubusercontent.com/109134495/210076646-424e33b5-e7b9-4860-82e3-fb86581c93af.png)<br/>
'http://localhost:8080/purchaseInfo'를 입력하면 상품정보 데이터를 조회할 수 있다.<br/>
![image](https://user-images.githubusercontent.com/109134495/210076712-0a00f500-1e65-4b6e-9524-c56159887947.png)

## Docker Hub에 Push한 링크
https://hub.docker.com/r/choiyoungae/rm_youngae_project

