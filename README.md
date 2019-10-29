## PPKWU - Programowanie pod kątem wielokrotnego użycia
## Zadanie 2 - Text Validation

 **Dokumentacja API**
 ===================
 
API analizuje zmienną ścieżki dostępu i sprawdza występowanie:
 - małych liter
 - wielkich liter
 - liczb
 - znaków specjalnych

| METODA | ŚCIEŻKA DOSTĘPU | PARAMETR | OPIS |
|--------|:---------------:|:--------:|:----:|
| GET| `api/text/validation/`| `{text}` | Zwraca obiekt TextDetails w formie JSON z informacją o występujących elementach |
-----

### **Przykłady wywołania**

* ### PathVariable text = helloTestowy1234  

Request: 
```java
      GET | localhost:8080/api/text/validation/helloTestowy1234 
```
Response:
```json
    {
    "hasCapitalLetter": true,
    "hasSmallLetter": true,
    "hasNumber": true, 
    "hasSpecialCharacter": false
    } 
```   

* ### PathVariable text = roman_@!  

Request: 
```java
      GET | localhost:8080/api/text/validation/roman_!@ 
```
Response:
```json
    {
    "hasCapitalLetter": false,
    "hasSmallLetter": true,
    "hasNumber": false, 
    "hasSpecialCharacter": true
    } 
```
