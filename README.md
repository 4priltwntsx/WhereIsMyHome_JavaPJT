![header](https://capsule-render.vercel.app/api?type=shark&color=auto&height=300&section=header&text=WhereIsMyHome&fontSize=90)

<h2> 프로젝트 소개 </h2>
<h3> 요청 조건 </h3>
:pushpin: AptInfo.xml을 파싱하여 HomeInfo 객체에 저장한다. <br>
:pushpin: AptDealHistory.xml, AptRentHistory.xml, HomeDealHistory.xml, HomeRentHistory.xml 파일을 파싱하여 HomeDeal 객체에 저장한다. <br>
:pushpin: XML 파싱한 주택의 목록을 화면에 표시한다. <br>
:pushpin: 매매/전,월세, 아파트/주택을 법정동, 아파트 이름으로 주택 검색이 가능해야 한다
<br>
<br>


<h2> 구현 기능 </h2>

<h3> 기본기능 </h3>
<h4> 주택 거래 데이터 분석 </h4>
:pushpin: 아파트/주택 매매/전,월세 거래 정보에 대해 법정동 또는 아파트 이름으로 검색이 가능하다.
<br>
<br>
<img src="https://lab.ssafy.com/gbjhgy126/pjt_daejeon_8th_class5_java_team11/uploads/6d4fc903515f3f2a24c7d6811d9b760f/main.PNG" width="500" height="300">
<br>
<br>

:pushpin: 검색된 아파트/주택에 대해 상세 정보를 확인할 수 있다.<br>
&nbsp; &nbsp; &nbsp; &nbsp; :heavy_check_mark: 아파트 이름 클릭 시 해당 아파트의 이미지 및 거래 정보(이름, 거래/월세금액, 건축 연도 등) 확인 가능
<br>
<br>
&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://lab.ssafy.com/gbjhgy126/pjt_daejeon_8th_class5_java_team11/uploads/7b5cded69a9bbf2ad2a61b2993403c06/apartment_image" width="500" height="300">
<br>
<br>
&nbsp; &nbsp; &nbsp; &nbsp; :heavy_check_mark: 아파트 이름으로 검색 가능
<br>
<br>
&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://lab.ssafy.com/gbjhgy126/pjt_daejeon_8th_class5_java_team11/uploads/547f19aa86a1f79be27f6d7d15584a70/apartment_search" width="500" height="300">
<br>
<br>
&nbsp; &nbsp; &nbsp; &nbsp; :heavy_check_mark: 법정동 이름으로 검색 가능
<br>
<br>
&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://lab.ssafy.com/gbjhgy126/pjt_daejeon_8th_class5_java_team11/uploads/ccaede255978259ee870c13ceb89a6cd/dong_search" width="500" height="300">

<br>
<h3> 부가 기능 </h3>
<h4> 주변 환경 시설 조회 </h4>
:pushpin: 환경 지도점검 데이터 파일(csv) 을 읽고, 새로운 화면에 출력한다. 매매를 원하는 지역에 어떤 환경 시설이 있고, 해당 시설들의 점검일과 상세 주소를 확인할 수 있다.<br>
&nbsp; &nbsp; &nbsp; &nbsp; 환경 지도점검 데이터 출처 – 서울 열린 데이터 광장 
(https://data.seoul.go.kr/dataList/datasetList.do#)<br>
&nbsp; &nbsp; &nbsp; &nbsp; :heavy_check_mark: 환경 시설 정보를 확인할 수 있는 새로운 창을 띄우는 버튼 생성 <br>
&nbsp; &nbsp; &nbsp; &nbsp; :heavy_check_mark: 버튼을 클릭하면 업체명, 주소시, 점검일이 있는 표(table)와 검색창, 검색 버튼으로 구성된 윈도우 창이 생성된다.
<br>
<br>
&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://lab.ssafy.com/gbjhgy126/pjt_daejeon_8th_class5_java_team11/uploads/e86082b3cfd0b11f0813c8c9954c0845/environment_btn" width="200" height="50">
<br>
<br>
&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://lab.ssafy.com/gbjhgy126/pjt_daejeon_8th_class5_java_team11/uploads/fbde3c8f4fb4497c762bf6248b99cb54/click" width="500" height="300">
<br>
<br>
:pushpin: 법정동으로 검색 가능<br>
&nbsp; &nbsp; &nbsp; &nbsp; :heavy_check_mark: 원하는 법정동의 환경 시설을 목록으로 확인
<br>
<br>
&nbsp; &nbsp; &nbsp; &nbsp; <img src="https://lab.ssafy.com/gbjhgy126/pjt_daejeon_8th_class5_java_team11/uploads/8d5448e28b83df953136e9a0e119b5e5/environment_search" width="300" height="300">


<br>

<h2> 배운 점 & 아쉬운 점 </h2>

<p align="justify">
<h3> 배운 점 </h3>
:heavy_check_mark: Swing의 활용<br>
:heavy_check_mark: Parsing<br>
:heavy_check_mark: 파일 입출력 및 데이터 가공<br>

<h3> 보완할 점 </h3>
:heavy_check_mark: 날짜, 가격 등으로 목록 정렬 기능 추가<br>
:heavy_check_mark: 주변 상가 정보 분석 기능 추가<br>
</p>

<br>
