1. Множественное использование кода. Если разные классы-наследники должны использовать одинаковую логику для методов движения, то это может привести к дублированию кода.

2. Ненужные методы в классе Animal. Если конкретное животное не умеет летать, нет смысла иметь метод fly в классе Animal. 
Лучше добавить этот метод только в классы-наследники, которые действительно умеют летать.