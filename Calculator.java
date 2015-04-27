// Класс реализации Калькулятор

public class Calculator{
	
private int result; // результат вычисления

// суммируем аргументы. param:params - аргументы суммирования
	public void add(int...params){		
		for(Integer param:params){
		this.result += param;
		}
	}

// получить результат. result - результат вычисления
	public int getResult(){			
		return this.result;
	}

// очистить результат вычисления
	public void cleanResult(){		
		this.result = 0;
	}
		
}