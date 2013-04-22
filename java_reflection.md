JAVA Reflection
===============

* Reflection?
	- 반영, 반성, 반사, 심사숙고
	- 일상생활 : 거울 -> 자기 자신을 볼 수 있는 물건
	- JAVA : Reflection -> 클래스를 비추는 거울! 자기 모습을 보여주고 수정까지 가능하다.

* JAVA reflection API
	- 특정 Class, Field, Method 등을 보여주고 활용할 수 있게 만든 API
	- java.lang.reflect
		- 대표적인 예
			- Constructor : getConstructors()
			- Field : getFields()
			- Method : getMethods()
			- Type : getTypeParameters()
			...

	- 예제 코드

* JAVA의 강력한 힘! Reflection
	- IDE는 어떻게 구성되어 있는가? (자동 완성?)
		- C언어가 강력한 IDE가 없는 이유는? 컴파일 단계에서만 각종 메서드 확인
		- 물론......세상이 좋아져서 다른 언어들도 유사하게 지원한다. (PHP, Python, javascript, Scala)
	- Spring에서는?
		1. HttpServletRequest로 전달된 인자를 JavaBean으로 바로 set?
			
			@RequestMapping(value = "/create", method = RequestMethod.GET)
	    	public String appCreatePage( App app ) {
	        	return "test";
	    	}

    	2. ModelBinding
    		- 필드명이나 get*, set* 등의 메소드를 찾아 불러와 유사 Model Binding 가능

    	3. Library 제작
    		- 라이브러리나 범용유틸리티 제작시, Method명을 찾아서 실행하거나 Binding 시킬 수 있다.


