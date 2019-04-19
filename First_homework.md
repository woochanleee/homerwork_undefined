
> Written with [StackEdit](https://stackedit.io/)..

# JAVA study
## 1. JAVA를 시작하기 전에
> ***java로 프로그램작성하기***

```java
	class 클래스이름 {
		public static void mai(String[] args) // main메서드의 선언부
		{
		// 실행될 문장을 적는다.
		}
	}
```
> ***주석 (comment)***

**범위주석** 		'/*'와 '*/'사이의 내용
**한줄주석** 		'//'부터 라인 끝까지의 내용은 주석으로 간주된다.
## 2. 변수
> ***변수의 선언과 초기화***
```java
	int age; // age 라는 이름의 변수를 선언
	int age = 25; // 변수 age를 선언하고 25로 초기화 한다.
```
* "변수의 초기화란, 변수를 사용하기 전에 처음으로 값을 저장하는 것"
> ***변수의 명명규칙***
1. **대소문자가 구분되며 길이에 제한이 없다.**
-- True와 true는 서로 다른 것으로 간주된다.
2. **예약어를 사용해서는 안 된다.**
-- true는 예약어라서 사용할 수 없지만, True는 가능하다.
3.  **숫자로 시작해서는 안 된다.**
-- top10은 허용하지만, 7up은 허용되지 않는다.
4.  **특수문자는 '_'와 '$'만을 허용한다.**
-- $harp은 허용되지만, S#arp은 허용되지 않는다.
> ***변수의 타입***

**기본형**
![logo](https://slidesplayer.org/slide/15437333/93/images/32/%EC%9E%90%EB%B0%94+%28Java%29+%EC%9D%98+%EA%B8%B0%EB%B3%B8%ED%98%95+%EB%B3%80%EC%88%98+%EC%9E%90%EB%B0%94%EC%9D%98+%EA%B8%B0%EB%B3%B8%ED%98%95+%EB%B3%80%EC%88%98+%EC%A2%85%EB%A5%98%EC%99%80+%ED%8A%B9%EC%A7%95+%ED%91%9C%ED%98%84+%ED%98%95%ED%83%9C+%EB%8D%B0%EC%9D%B4%ED%84%B0%ED%83%80%EC%9E%85+%EC%84%A4+%EB%AA%85+%EB%85%BC%EB%A6%AC%EA%B0%92+boolean.jpg)
![logo](data:image/png;base64,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)
![logo](data:image/jpeg;base64,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)
> ***상수와 리터럴 (constant & literal)***

```java
	final int MAX_SPEED; // 에러. 상수는 선언과 동시에 초기화해야함.
	final int MAX_VALUE = 100; // OK. 선언과 동시에 초기화했음
	MAX_VALUE = 200; // 에러. 상수의 값은 변경될 수 없음
```
* **상수**는 변수와 달리 한번 값을 저장하면 다른 값으로 변경할 수 없다. 상수를 선언하는 방법은 변수와 동일하며, 단지 변수의 타입 앞에 키워드 'final'을 붙여주기만 하면 된다.

**변수 (variable)**		하나의 값을 저장하기 위한 공간
**상수 (constant)** 	값을 한번만 저장할 수 있는 공간
**리터럴(literal)**		그 자체로 값을 의미하는 것

**상수가 필요한 이유?** 
-- 상수는 리터럴에 '의미있는 이름'을 붙여서 코드의 이해와 수정을 쉽게 만든다.

**리터럴의 타입과 접미사**
![logo](https://t1.daumcdn.net/cfile/tistory/990422415A8197D214)
> ***형식화된 출력 - printf()***

c언어에서 printf()와 비슷하다.

**printf()의 지시자**
![logo](https://t1.daumcdn.net/cfile/tistory/996B823359A3C9D821)

# 3. 연산자(Operator)
> ***연산자***


**연산자(operator)**	연산을 수행하는 기호(+, -, *, / 등)
**피연산자(operand)**		연산자의 작업 대상(변수, 상수, 리터럴, 수식)

> ***식과 대입연산자***

```java
	23;						// 결과를 얻었지만 쓰이지 않고 사라진다.
	y = 23;					// 식의 평가결과가 변수 y에 저장된다.
	Sytem.out.println(y);	// 변수 y의 값을 화면에 출력
	Sytem.out.println(23);	// 23이 화면에 출력된다.
```

> ***연산자의 종류***

![logo](https://t1.daumcdn.net/cfile/tistory/224CAC4D586CF94C12)
> ***결합규칙***

![logo](http://cfile239.uf.daum.net/image/1525EA4C5021BEDE196B3B)
> ***산술 변환(usual arithmetic conversion)***
```java
	int i = 10;
	float f = 20.0f;

	float result = f + (foat) i;	// 형변환으로 두 피연산자의 타입을 일치
	float result = f + i;	// 큰 타입으로 형변환시, 형변환연산자 생략가능
```
> ***단항 연산자***

### 등등 C 언어와 비슷하여 생략

## 4. 조건문과 반복문
> ***조건문 - if, switch***
* **if문**
* **if - else문**
* if - else if 문
* 중첩 if문
* switch문
> ***반복문 - for, while, do - while***
* **for문**
* while문
* do - while문
* break문
* continue문
* 이름 붙은 반복문

### if문
```java
	if (조건식) {
			// 조건식이 참(true)일 때 수행될 문장들을 적는다.
	}
```
```java
	if (조건식)
	{
	...
	}
```
- **위쪽의 스타일은 라인의 수가 짧아진다.**
- **아래쪽의 스타일은 블럭의 시작과 끝을 찾기 쉽다.**

### if - else문
```java
	if (조건식)
	{
		// 조건식이 참(0이 아닌 값)일 때 수행될 문장들을 적는다.
	}	else
	{
		// 조건식이 거짓(0)일 때 수행될 문장들을 적는다.
```
**if 조건식의 결과가 참이 아닐 때, 즉 거짓일 때 else블럭의 문장 수행**
### if - else if 문
```java
	if (조건식1)
	{
		// 조건식1의 연산결과가 참일 때 수행될 문장들을 적는다.
	}
	else if (조건식2)
	{
		// 조건식2의 연산결과가 참일 때 수행될 문장들을 적는다.
	}
	else if (조건식3)
	{
		// 조건식3의 연산결과가 참일 때 수행될 문장들을 적는다.
	}
	else
	{
		// 마지막에는 보통 else블럭으로 끝나며, else블럭은 생략가능하다.
		// 위의 어느 조건식도 만족하지 않을 때 수행될 문장들을 적는다.
	} 
```
**if - else문은 두 가지 경우 중 하나가 수행되는 구조인데, 처리해야할 경우의 수가 셋 이상인 경우에 사용**
>***중첩 if문*** 
```java
	if (조건식1)
	{
		// 조건식1의 연산결과가 true일 때 수행될 문장들을 적는다.
		if (조건식2)
		{
			// 조건식1과 조건식2가 모두 true일때 수행될 문장들
		}
		else
		{
			// 조건식1이 true이고, 조건식2가 false일 때 수행되는 문장들
		}
	}
	else
	{
		// 조건식1이 falsee일 때 수행되는 문장들
	}
```
**if 문의 중첩의 횟수에는 거의 제한이 없다.**
### switch 등 C 언어와 비슷하여 생략

## 배열






# i. 프린트
**System.out.( ) 형태로 쓰인다**
1. print, println
* print는 문자열을 출력하고, println은 print와 똑같지만 마지막에 줄바꿈을 추가하여 끝나는 부분에 한줄이 추가된다.
2. printf
* printf는 C언어의 printf와 동일한 동작을 수행한다.

# ii. 자료형, 연산자
> ***자료형***
![logo](https://t1.daumcdn.net/cfile/tistory/2578E050586CF71711)

***정수 타입(byte, char, short, int, long)***
	* 정수 타입에는 모두 다섯 개의 타입이 있으며 저장할 수 있는 값의 범위가 서로 다르다.
* **byte 타입**
	* byte 타입은 색상 정보 및 파일 또는 이미지 등의 이진(바이너리) 데이터를 처리할 때 주로 사용된다.
* **char 타입**
	* 문자(유니코드) 이다.
* **short 타입**
	* short타입은 2byte(16bit)로 표현되는 정수값을 저장할 수 있는 데이터 타입이다.
* **long 타입**
	* long 타입은 8byte(64bit)로 표현되는 정수값을 저장할 수 있는 데이터 타입이다.
	
***실수 타입(float, double)***

* **float, double**
	* float과 double은 소수점이 있는 실수 데이터를 저장할 수 있는 타입이다.
* **논리 타입(boolean)**  
	* boolean 타입은 1byte(8bit)로 표현되는 논리값(true/false)을 저장할 수 있는 데이터 타입이다.
> ***연산자와 연산식***
> ![logo](https://t1.daumcdn.net/cfile/tistory/224CAC4D586CF94C12)

* 프로그램에서 데이터를 처리하여 결과를 산출하는 것을 연산(operations)이라고 한다. 연산에 사용되는 표시나 기호를 연산자(operator)라고 하고, 연산되는 데이터는 피연산자(operand)라고 한다.
```java
	x + y
	x - y
	x * y + z
	x == y
```
**위 식에서 +, -, (*), == 은 연산자이고 x, y, z 변수는 피 연산자이다.** 

> ***연산의 방향과 우선순위***
> ![logo](https://cdn-images-1.medium.com/max/1600/0*CF6P_KeLjetU2sOo.)

```java
	100 * 2 / 3 % 5	
```
**위 식에서 (*), /, %는 같은 우선순위를 갖고 있다.**
**대부분의 연산자는 왼쪽에서부터 오른쪽으로 (->) 연산을 시작한다.**
**괄호( )를 사용해서 먼저 처리해야 할 연산식을 묶는것이 좋다.**
> ***단항 연산자***

* **단항연산자는 피연산자가 단 하나뿐인 연산자를 말하고 여기에는 아래와 같이 있다.**

**1. 부호 연산자(+, -)**
* **주의할점 : 부호 연산자의 산출 타입은 int 타입이 된다.** 
```java
	short s == 100;
	short result = -s;	// 컴파일 에러, int result = -s;로 변경해야 한다.
```
**2. 증감 연산자(++, --)**
![logo](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAVMAAACVCAMAAADSU+lbAAABpFBMVEX///8AAADJyclOTk61tbVlZWXY2Njs7OwjIyP39/dxcXH8/Pzm5uZ6enqNjY11dXXBwcGFhYWnp6fDw8PQ0NC8vLzi4uKdnZ2VlZWJiYnw8PB/f3+tra3c3NygoKCXl5cwMDBWVlZpaWlfX19CQkIqKipLS0s6OjorKyv///c+Pj4cHBwVFRUNDQ3w//9LAAAAAE///+/q9f/i/f8AAFYxAAD/8uD8+NwOV5UyIhVIc5wbAAByNgDt3auz3v/U5vV/QQAAFlV/UxrL5emTYT3y9OYfMUR+QBNfnsaqiGd+o8uwczWQWTPB3PEAAEWIWhjjy5uQRwAgAAD/98yPkZzOoF+9lmZCiLYAEy8PO3qVxd+RVCaqyucAACzYuY2lvdP658h+vuPPvKiIt+7Hi1NoNg+2gzNYAAA+QU0AK1cAJks/FQDv1L1Ge7MMVoRlaXnpvoBmjb7F9f+0kl3Ap4v2yqeackBMIQCjzf4SaKQAABSwsqIvL1QvW4eNobnl4cimZhNCAABuGwAADkK1glkAIG+ZfnoAOGqpejKsjnUALG9cjclQRFxkAAAUuklEQVR4nO2djZ/jxHnHZ2RZWr3berMtyS+SvPbuehe4Aw5SCGmApA0ByksDpJTjci0hNEDTNJCGFAgJTdLmn848M3oZyfLerU+3bO+j32c/69HbjPz1vGmeZ0YIFXKFTvcgGW3JTHCne9E6FapE3W/6jh4ILcWSaODQXXHvwlpifLbHZQ+gVhThvGA6hs2klnXvSj7GB3tc9iAqmvNQIZdu9L0ikjqmnCCvmjRE69KGVutu1DHlpQHUGYQMjI/2RNoxrSkmDVVA4BK24b5xdEyrGhCYpF3yyMfecXRMayIdoSFCKcb23lF0TGvyaQ7tYyze+dwd6pjWJO9gOo4XrjBjFQLUDqOYBAaC6zh6PK+eepWYuo6P0Akpc4HgOMIU4ek3cBM7mEY9pPSGdsbUzZg6Ih44ejqqRnGFmDprF/toaUND4QpJeqWYWqQXsPB8ytSEPuxsEZFgADviWTWKq8M0wBrpaVOmDrnTcf9KMVU2bjSMU0A43cjqHM1WPoQx6XilJ+PKuVeHqYJ1JJ6iZXQlmSJ5PtIIQnjCIk+ssWlD2UcL9UC+wvkU+aejjXJV8ykTKUdIUSCkjFbkv3eEBIziq1ufIg3u9qrmUwPGUwLYGViwPYURq4WIlKVzdduouWUYhjU6jKCNIkyvVhvF3YxfPGHNPfIvEq8u00xQ9iVLVS37ajEdxSpRQkKaSlV2Sq8801VUBK8U0wvoyjH9ptUxbV8d0/bVMW1fHdP2VTD19o6is5vWFORMV0l/PyUxxmf7XvxAKs2ZdmpVHdP2RZmG4r6aY7zx9r76AZSN77ndn3ZtVFXBvTPt+lI1df3T9tUxbV8d0/bVMW1fHdP21TFtXx3T9nUO09vid+4qio5pTbuZ3vo1/puH7iaKjmlNu5nexPgPLxVbt7k8e7uafzumNe1kevzq94f47/OtJx7+qDjyxPu/qZzZMa1pJ9PXX3vy9a/+Jy/8FaYPd0zP1U6mX+OfoB/i/8q2LsRUxtTLwlqkCCl9a7GxkmC+ooecM0u1DqOAPx0PsoAaqhrCrrgh4akVhipCIjfNwCe7DN5FXmEXKp6P0EZ0y1N9F/5rNLGDMjHJA6HVnCUWWhLSMPVhogcCPrF70S6mTzz7yHX0Cv4PenMaMH1II58krBGmLJzf6jZT9jnq0w9TRZlPMFKHMGFIEU/50zNT2DQZDofJFE+9BUKRSjbCZDoozjRUYwj71KSYGSexdOIRltFClEoiZg/+JxNILCgSk84kmLtMfeimSUgiU21EmR7aMB9c8VoqbruY3sRvInTj2e+S5uiTYvD6yYfK8I+vl19ti+nMJop6KWzpuPCzRuM+5CCffedMy/GpxEJRFBHCprWGDTeKCBKPo6+Q45HLXXmKwT1uugj68wrT2YombNYSc7ITmF9iEEUCTGIC7pkH0P1m+jv8gix/7wekAkDHui5/+dXnMvlg4YdZONcWU033qXRa6nqis9DQ7FSFYhukoRHGUn6motvxDCknsaxDfpYnKsm1swV8vxPZ3cjIO5PzbDlJByTKNFbyi8WVgn3qvSdg5ZDPpyPKFAUxJFZ4TFGmii+vgGmwEeSlSJi6/mUxff21PDuyVmrvdj9ak7xHvvOM5FNtaJpzkGkOfXpUH81oHeLMSPL9CbJPEJag7NMyOVohD9vZjQWLOfxE9kGeU7WVh0IDoXmKBlg882pMtxOjTOVRtACf5HhM6ygNj0dawRSb+89o4rSD6Rv4I6g6r/3+nWfo9kXaKCGhDdTKAr9AJctWtI1StEyKoqFtpZaqoL5M2yj3QBIPNORtysMuaVaM0r1QwYILE2Mo02p9SvPpVmLVsk8y9pFQK/sbVBSCe1Ez02ufZt39H+EX6OcTX/FMn6w8XzXn037hUekRxmZAy7sJTreGYeWFH+iroQVemXSWu2ERbgrNib7nQX2Ky0iscDgJDVU12J6xNfCclUOqTXDe3maKTKOaWJWp4nkuytr9Syn7rzyVPZbeeu//aFuk/O+7xUGNC4Ma2igFpgCwDf0AGpLZIVsZYABy7EP+dJwvGmDEEIrWcCsZTGnCnymuuUTWgN5OofdFqtUK03nMJTbLE5tuPNEz1x7zn8W0QtBUqFCWc3IEG0M4U97fIae4tUamPyo6pl+//Ms7RdHAlBQ2PesW2kv6MaZfMzGnEqhS8rGTB1iOihaI+Y5vKeKYZnxhpknP0tABz3QGvsioX09Md4mULJ9ibrECBQ7oLJ8K995JvR9jfcpyPgON6E8eHYxm9oZN/5mnNj1SmQlY9Pn1cDWb2QdjqNT0I3rmqNJo2LsLpz116zDG/YbEiFifPx6yg9zjx/3u819A2/WpojPJxVZ+59mByoIWctkwlBehoOFMpfL8VZO2tf5AU2IQM01Pyw5yRUbZdwWDmrox6fbVMW1fHdP21TFtXx3T9tUxbV8d0/bVMW1fu5lee5GN8t9RHdOadjP98HH8p7tymuiY1rSb6Z8/W3/2T3cTRce0pp1Mn3j/T1++9pvGa2rqmNa0k+lN/Bf0NL7jQB9qGpeaj6lgDQVlMh6NxpPAzeIfmeOxWR3kH/lZwIQjc3kKY1E+nIfQlFt7BXaNdzWl9lSujz+RmMc0kvx6T4xEz3HQmBvNH583LLOndjG99vw7vyxG+c9Xw/ipHBApQxhuJx99LUAjar0UlhMlUMTqiirZmHTgDpyBq2FJJLH5wsAhW0oxzo8klxx3HAFGQDPp7KC3NX5q0/FTYWWSxKIisUGyWsZqGGqw+JC+BtOOXRlGbUu7mH741ZPX0a2vPr9O8P4xzPTuQ2X4i8J+stO+P6YmjGB9oOe26DOWSsAPVAqYGYtl0Rk4YsDs+y5sDMSgtEV7HtkxGDieWOSskN301jj/+IQmnH2l/G6QcxCvD6zhEAHTPsu/2mUy/Sm1Qn/91kukZv2jkVl2viBMy3B+6hbTwLKYIwodUI5WYKOcrQcSqQnUteM5SVoYo5Fsb5B4QnOqfxCuBYTTHozgaydGaiDexqebMUl3Wa7OLC+GPZJnzXSHPSpPLDdGO2rcS61J6gFTlRllLpPp8e/xz/pp/1v4ox3XcTq3jdLEEw3FNpot3SkYUQVSfh1Fy0yZUnIC2U7qqSbNOtEJYvkUbcj9kJ0etrIFwnRWRUjLYrETWJZHoHZTB4e4boveTmyg9papOkmEClO/FVNpRTuYfoI/gAr+t4//4c6tVJ3plHmhROTfDNlD2DVUoOxroWnSxqswuVfknUQpqeAk8Qgx+/sq4vOpkIaRHR0WLRFUIFJmiz7bzqfbiflpMsNeyMp+wTQcNpnF70nNTI/BAw30O/zPd4yizjTwZd+XVyF4o8C2Ah4pIl2lStZlqvxU5q5C3Vag3dAdXRd0gZZcQ+3bnG9P4Ou+IwgDV/azn2OKSSOz0ZgfSlPZrycGRhMfGUONY4r2XUT7PDUzvfVe9gj1yuOf3/Fn3O5LQWcpzTOUvZnZ0YZtiRHVeJkdgxwdYQNyNKn1dCMmm4e0sPusE1WY3VxyapScQebPCj+sIoXSMfWXGjcxrSeGRKg9EkMr2ihnGF1effqLvBN17dk7F/5m+37ek8xs0czkLvRoA6c6/OmFfT9zXYig7Oe26MovKp5w4TP4D6sebvv1jXuNiUF9gjRN6cEK2ilpRGNNYT4TZZvZhpqZ3hhcL0J39Olvtu8XG0fUVfKAgjtt6rIXtuiQ+kzY1Gei2b6/KMM6+yU8hfmfnvJMmf/pWT2xeIzqYu2+127H/76M9QmqBVJZ+fXIVvY0o1hMCX/2sFyrDK7L1l+PWBxD/kx3G0op36jt2E4s31Ei1KxLfI66gLrn/Zo6pu2rY9q+Oqbtq2Pavjqm7atj2r46pu1rD6a3Zy9VtjumNV2c6Y338MeP8js6pjWdw/TWu43hm0/hdyoDgB3TmnYzPX77kSI7Hr/4chF+9a3542/yJ3ZMazqH6YuPlUyfL/i+/tqPr733GF/492FKJ4PtOKZsH4NdvI0jm02WBRF//jkRVw41pNKWLsz0DfwT9K/4X7gTG5gGbNxYsSUwX3IzQiQ6QqdFZ5PhZDEqxtgFampBJ9RsPDTNiY8UfgSe7DK5EarTeAJzpFWId0Q+zFDI7NKDNeyP+Zm+KOxnAdGcSHRMWs5SmWZjfTJJPrLl+zzvJJDl7734yHPkQ6Ph57Mwmyr97af4lVIamApsBHUBw+iHXsk0COnQdG8EmU5zikH8M31KhHozMPvRWeBRadUQE5h4TvYl+T0esRHXjCONnoXFJb0owPy7bw02oxdBxJYdTsAeVZ1rjj2fJK/d33l8N54u5pQ/c+Nvy3A2w+/4H17mulMNTNlbKN11oJoVpmJM88woBihSMbKZD0D36ICrPp8P8lngmeaj0YhzM9mkY5JxxwYuE2NMp0dwljZfcBaRSRJm6TjzuY6M5RhsJ0ieg5vMZc41VxTlGin7CkzBhTDJpzSMfohfID/pD8qVUpqY2j16m2af0PJPOaZg5KRSwzAsh4Yp08CVToCpfzrV4hn5toO8BNuxrQTKLC6s0IoSUNEq1pigI48wpS8SQbYRhlY5vdF11qTOGC9FV4PCM8XIMALqh5KnArNOL2n+/o769NbPsyz7WFn4t218C5cuLjHuIw8LZzxTcE1REsuiriyWlTAbKGUqix6dBd6b01ynFbPM0YTaVAarplF+IU7gDWIO9TYZqyxiw1Iz/qJIc6wsihqkEmB4gxswLeaa2yI319za9rnaQxdkehMzV79XiwmpTX4oWByYmDE9rZT9zN2nrrzss7d9LWYO9hG1buYCVFa+ofTBx2WFweGpcBPQ76J9sVVjikSPxbwYsVQucZ2J5v7p8adZd/8mfnO3b48xdF1p5aF5H4mHTUyHzD9IzVsSxlTJ6lPZhbUfinZfTlRYDyYMVbXPYfaKudUSYZwys95AZTHnznw2TGZPkuK9QhNLNRLJ1YpUuLnmiiLed6bo9hd8mDbk337qc4aSrZSSfacaU30Bpt2opzDvsIOGfMos7+Yq2+sf2jPbigWWT5nJXTP5DqnCm2IRjkrLv9Ib6mV759GIxQ3/iiO6xg09CGteID+MIS421xyZ8DOlQ5L+6diEn0m/96UmLva8f3ORF/lf/Xdh968z9Ri3U5lUdiaYhDmmNrWKrmZBzUMEPFG0LJ82uYYEmCe8gRY7yL8AwNFYGtGSRVzxgZrkTK2Q7qcvaqw4SWrMEYaWfXdxHoC70v0f6xP1rSnxs55JVX/tN+vzJ6o5IQp5K7FcYUqun0zIH71+asSmeWJSRNPDMY14yOfTos+Poo05MXuhvyOVKz3XvK6tZ0AlU/08jT96ThTV67mTtewAfzr/4Mqd2pBKS8+q3Zh0++qYtq+OafvqmLavjmn76pi2r45p++qYtq+LM732dm2CT8e0posz/fDn+N8qThMd05ouzvSn+GfZRJ9MHdOaLsz02vsffPnrJ/k9HdOaLsz0E1Kbvo2f4fbcgelY0odbO2FUuhi4R1I0m9mi6GlGOaRhgw2kHF4SsnFsGHESLGMSGhNksik4MiyqWn1/vZ7Pl5CMcIT8IRoJWZQ2QrOKUfUKzJG49uk7z6FfVFZKaWA6ZaNms1WqoYqNjy3ZKa5h4NeJ88VNPbW3jC1jqOT2ksCDeeWOMxjkk5uyJU3zhT1h2W+2YLqW9AGtueHnOGXpIwmiGQgYncCcQLrhoR7wn24ue6758a/ShKr/74/yYYRuPfzxdXTj/Y+5lVIamCaY2tiwhKWK7cRc0+H4DUss/+ZosEnXGyM0UcFUcOn8W1fIbafzHnMjYUw9DIhPB6icjGUWo6QIvg8brZ8KdMY/ppP+BJfGyNY/vfy55se3zUz/+CgfzhdDfoNfKWWbqb8eLRWwrMN6wxV7VDYL3FyIURQb+fcZWHEvNYaxXdr1xAVJsF8WfsGkfhNDk47qL+cH5MiBYcsIuakVReJBuZ4EcgjBXkgvtVRzHbh4fAqMhaPxkZBZEos5vJc233Snrv0d/v5yufwW5lqpbaZDi+YnaosO8ZY9ytcDmgtlWWf1p6fGy9QKrWnBNFrSoiw0fmW5Z6OAlP6N7SuKLus0Rwf5OqczNSUhTVrCEtUkGx6A7WZlZ/4q5LJ0qQolU7f9jHpBpp/g78LU2N8+/FY5DbXBFs2+ADDdbNtNtTmdjA4Td0fsC+mxFWHBmHD252gxH89VNa8kbVpQRmAZ8RA4kCA9QmfkUxrZRWQN95tY87WclX35UELuoVzLp7CWfMu6GNPj/8y6pn/mVkrZYuouSP2/CJBJy36D3ZSt81xdVlpBVsnUdSXBEQTHlbJspFDXEzxVMucTiZyhWLSyzeLK6QewNjS5DoTAfCdIrqCYtDlLLXhjAq1PL3+u+S7dePoD9ghFm6pMW0xpqx7PkX4gkzLXwFRw2IrkR/nuGbQ8/bBo9z3SsRqcGR75zGpUZ8ZVfoq18Dx7Q9tBxaORCflSMrJIrh3hAby4GcFMd5vEgqlB1madqCX4s6RQ/4rJ7DLXQ2lW0Yk6/vSz5/KddaY2W8eA3G1qngVVpibrSy3ZmipFCxQznxpF5U1ua/6W5jB9XM2QZ2+dofesJcxPwuJOLnsUuSmUWmQr86LBjyLJTNKXMtd8l264ee6U3Z1+KOz1BsjVkOaSjLXmmerUDnwYMa/cgmDf1LbMnXBWqdkK3gdBagA4xVmOSePEXn0i4+yFEfzPUcw7V+JUJ/GmK/g1kolWt5WyvpTb7poolzHWp9edx5Ssc1Y+X+U7+C9nV3LPzOQt96SxmmSH3Qk9MOG/gFz2rCRyeCLwqUz45yjzCjxHNah73q+pY9q+Oqbtq2Pavjqm7atj2r46pu2rY9q+Oqbtq2Pavjqm7atj2r4Y0xTj/aewdExr8ilTj/7fUx3TmpYYD2EYEe8/4N0xrUojTGE40cB4s69lpmNaVQ/jJYzKujDXeU+oHVNe2oqQZAu/OiS02a/4d0x5AdJ8Bd0l5NREOP+CRvkd01z+GCgWb2BWHLrWQdy7sMivcbbHZQ+iDgHhnKtDXdzp3rWsPTyZyTd9R//PtU7i7QrBFS4uN8HRHpc9iCpL/V8B7e3wSNlSMuoAAAAASUVORK5CYII=)
* **증감 연산자는 변수의 값을 1 증가(++)시키거나 1 감소(--)시키는 연산자를 마한다.  boolean타입을 제외한 모든 기본 타입의 피연산자에 사용할 수 있다.**

**3. 논리 부정 연산자(!)**
**논리 부정 연산자는 true를 false로, false를 true로 변경하기 때문에 boolean 타입에만 사용할수 있다. 토클(toggle) 기능을 구현할 때도 주로 사용한다.**

**4. 비트 반전 연산자(~)**
**비트 반전 연산자는 정수타입의 피연산자에만 사용되며, 피연산자를 2진수로 표현했을 때 비트값인 0을 1로, 1은 0으로 반전한다. 연산 후, 부호 비트인 최상위 비트를 포함해서 모든 비트가 반전되기 때문에, 부호가 반대인 새로운 값이 산출된다.**
> ***이항 연산자***

**이항 연산자는 피연산자가 두 개인 연산자를 말하며 여기에는 아래와 같이 있다.**
**1. 산술 연산자(+, -, (*), /, %)**
우리가 일반적으로 말하는 사칙연산인 +, -, *, /, %를 포함해서 총 5개이다. boolean 타입을 제외한 모든 기본 타입에 사용할 수 있다.

**2. 문자열 연결 연산자(+)**
문자열 연결 연산자인 +는 문자열을 서로 결합하는 연산자이다.
```java
	String str1 = "JDK" + 6.0;	// "JDK6.0"이 저장된다.
	String str2 = str1 + " 특징";	// "JDK6.0 특징"이 저장된다.
```
**3. 비교 연산자(<, <=, >, >=, ==, !=)**
비교 연산자는 대소 또는 동등을 비교해서 boolean 타입인 true / false를 산출한다. 대소 연산자는 boolean 타입을 제외한 기본 타입에 사용할 수 있고, 동등 연산자는 모든 타입에 사용될 수 있다. **비교 연산자는 흐름 제어문인 조건문(if), 반복문(for, while)에서 주로 이용되어 실행 흐름을 제어할 때 사용된다.**

**4. 논리 연산자(&&, ||, &, |, ^, !)**
![logo](http://postfiles1.naver.net/20151217_144/rain483_1450323631274OwSWm_PNG/6.PNG?type=w1)
논리 연산자는 논리곱, 논리합, 배타적 논리합, 논리 부정 연산을 수행한다. **논리 연산자의 피연산자는 boolean 타입만 사용할 수 있다.**

**5. 비트 연산자(&, |, ^, ~, <<, >>, >>>)**
* 비트 논리 연산자(&, |, ^)
	* AND, OR, XOR, NOT 등이 있다.
* 비트 이동 연산자(<<, >>, >>>) 
	* 정수 데이터의 비트를 좌측 또는 우측으로 밀어서 이동시키는 연산을 수행한다.
	
**6. 대입 연산자(=, +=, -=, (*)=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=0)**
오른쪽의 피연산자의 값을 좌측 피연산자인 변수에 저장한다.
> ***삼항 연산자***

**삼항 연산자는 세 개의 피연산자가 필요오 하는 연산자를 말한다.**
```java
	조건식(피연산자1)	?	값 또는 연산식(피연산자2)	:	값 또는 연산식(피연산자3)
```
	
	

# iii. 반복문, 제어문

![logo](https://t1.daumcdn.net/cfile/tistory/252D5D365429EDC908)
> ***if문***

```java
	if (조건식)	{
		실행문;
		실행문;
		...
	}		
```
**위 식에서 조건식에는 true 또는 false 값을 산출할 수 있는 연산식이나, boolean 변수가 올수 있다. 조건식이 true이면 블록을 실행하고 false이면 블록을 실행하지 않는다.**

> ***if - else문***

if문의 조건식이 true이면 if문의 블록이 실행되고, 조건식이 false이면 else 블록이 실행된다.
```java
	if (조건식) {
			// 조건식이 true
	} else {
			// 조건식이 false
	}
```
> ***if - else if - else 문***

여러 개의 조건식중 true가 되는 블록만 실행하고 전체 if문을 벗어난다. else if 블록의 마지막에는 else 블록을 추가할 수 있는데, 모든 조건식이 false일 경우 else 블록을 실행하고 if문을 벗어나게 한다.
```java
	if (조건식1) {
			// 조건식1이 true
	}	else if (조건식2)	{
			// 조건식 2가 true
	}	else {
			// 조건식1 및
			// 조건식2가 false
	}
```
> ***중첩 if문***

if문의 블록 내부에 또 다른 if문을 사용한다.
```java
	if (조건식1) 
	{
		// 조건식1이 true
		if (조건식2) 
		{
		//조건식2가 true
		} else 
		{
		// 조건식2가 false
		}
	} else 
	{
		// 조건식 1이 false
	}
```
> ***switch문***

변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다.
```java
	switch(변수) {
		case 값1:
			// 변수가 값1일 경우
			break;
		case 값2:
			// 변수가 값2일 경우
			break;
		default:
			// 변수가 값1, 값2 모두 아닐경우
		}
```
위 식에서 case 끝에 break가 붙어 있는 이뉴는 다음 case를 실행하지 말고 switch문을 빠져나가기 위해서 이다.
> for 문

```java
	for (1. 초기화식; 2. 조건식; 4. 증감식)
	{
			// 조건식이 true일 경우
			3. 실행문;
	}
```
> ***while문***

```java
	while (1.조건식)
	{
			// 조건식이 true일 경우
			2. 실행문;
	}
```
> ***do - while문***

```java
	do
	{
		1. 실행문;
	} while (2. 조건식);
```
> ***break문***

```java
	for (...)
	{
		break;	// for문을 빠져나온다.
	}
	while (...)
	{
		break;	// while문을 빠져나온다.
	}
```
> ***continue***

```java
	for (...)
	{
		continue;	// 그 다음 문장을 실행하지 않고 조건식을 확인하러 간다.
	}
	while (...)
	{
		continue;
	}
```
