$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CheckItemCard.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: ru"
    }
  ],
  "line": 2,
  "name": "Проверка карточки товара",
  "description": "",
  "id": "проверка-карточки-товара",
  "keyword": "Функция"
});
formatter.before({
  "duration": 3994489300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Предыстория"
});
formatter.step({
  "line": 5,
  "name": "пользователь выбрал товар и находится на странице товара",
  "keyword": "Допустим "
});
formatter.match({
  "location": "CheckItemCardSteps.пользователь_выбрал_товар_и_находится_на_странице_товара()"
});
formatter.result({
  "duration": 2851684200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Товар корректно отобразился",
  "description": "",
  "id": "проверка-карточки-товара;товар-корректно-отобразился",
  "type": "scenario",
  "keyword": "Сценарий"
});
formatter.step({
  "line": 8,
  "name": "присутствует заголовок товара",
  "keyword": "Если "
});
formatter.step({
  "line": 9,
  "name": "отображается изображение товара",
  "keyword": "И "
});
formatter.step({
  "line": 10,
  "name": "отбражается стоимость товара",
  "keyword": "Также "
});
formatter.step({
  "line": 11,
  "name": "есть кнопка добавить в корзину",
  "keyword": "Также "
});
formatter.step({
  "line": 12,
  "name": "имеется возможность изменять количество товара",
  "keyword": "К тому же "
});
formatter.match({
  "location": "CheckItemCardSteps.присутствует_заголовок_товара()"
});
formatter.result({
  "duration": 44582400,
  "status": "passed"
});
formatter.match({
  "location": "CheckItemCardSteps.отображается_изображение_товара()"
});
formatter.result({
  "duration": 52303700,
  "status": "passed"
});
formatter.match({
  "location": "CheckItemCardSteps.отбражается_стоимость_товара()"
});
formatter.result({
  "duration": 25881900,
  "status": "passed"
});
formatter.match({
  "location": "CheckItemCardSteps.есть_кнопка_добавить_в_корзину()"
});
formatter.result({
  "duration": 26892300,
  "status": "passed"
});
formatter.match({
  "location": "CheckItemCardSteps.имеется_возможность_изменять_количество_товара()"
});
formatter.result({
  "duration": 498891000,
  "status": "passed"
});
formatter.after({
  "duration": 797955100,
  "status": "passed"
});
formatter.uri("SearchInputField.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: ru"
    }
  ],
  "line": 3,
  "name": "Проверка работы строки поиска",
  "description": "",
  "id": "проверка-работы-строки-поиска",
  "keyword": "Функция"
});
formatter.before({
  "duration": 3581418400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Предыстория"
});
formatter.step({
  "line": 6,
  "name": "пользователь находится на главной странице https://magazintrav.ru",
  "keyword": "Пусть "
});
formatter.match({
  "arguments": [
    {
      "val": "https://magazintrav.ru",
      "offset": 43
    }
  ],
  "location": "SearchInputFieldSteps.пользователь_находится_на_главной_странице(String)"
});
formatter.result({
  "duration": 1856790400,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Поиск продукта \u0027Арония\u0027 через строку поиска",
  "description": "",
  "id": "проверка-работы-строки-поиска;поиск-продукта-\u0027арония\u0027-через-строку-поиска",
  "type": "scenario",
  "keyword": "Сценарий"
});
formatter.step({
  "line": 9,
  "name": "пользователь вводит в строку поиска Арония",
  "keyword": "Когда "
});
formatter.step({
  "line": 10,
  "name": "продукт Арония отображается на экране",
  "keyword": "Тогда "
});
formatter.match({
  "arguments": [
    {
      "val": "Арония",
      "offset": 36
    }
  ],
  "location": "SearchInputFieldSteps.пользователь_вводит_в_строку_поиска_Арония(String)"
});
formatter.result({
  "duration": 250627900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Арония",
      "offset": 8
    }
  ],
  "location": "SearchInputFieldSteps.продукт_Арония_отображается_на_экране(String)"
});
formatter.result({
  "duration": 404318700,
  "status": "passed"
});
formatter.after({
  "duration": 700221400,
  "status": "passed"
});
formatter.uri("UserRegistration.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: ru"
    }
  ],
  "line": 3,
  "name": "Отправка жалобы руководству",
  "description": "",
  "id": "отправка-жалобы-руководству",
  "keyword": "Функция"
});
formatter.before({
  "duration": 3248425800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Предыстория"
});
formatter.step({
  "line": 6,
  "name": "пользователь находится на главной странице",
  "keyword": "Допустим "
});
formatter.match({
  "location": "StepsLeaveComplaint.пользователь_находится_на_главной_странице()"
});
formatter.result({
  "duration": 1595518900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "позитивная отправка жалобы руководству",
  "description": "",
  "id": "отправка-жалобы-руководству;позитивная-отправка-жалобы-руководству",
  "type": "scenario",
  "keyword": "Сценарий"
});
formatter.step({
  "line": 9,
  "name": "нажимает на кнопку Помощь",
  "keyword": "Когда "
});
formatter.step({
  "line": 10,
  "name": "выбирает пункт службы контроля качества",
  "keyword": "И "
});
formatter.step({
  "line": 11,
  "name": "пользователь нажимает на кнопку оставить жалобу",
  "keyword": "Тогда "
});
formatter.step({
  "line": 12,
  "name": "заполняет все поля",
  "keyword": "И "
});
formatter.step({
  "line": 13,
  "name": "пользователь нажимает кнопку отправить",
  "keyword": "Тогда "
});
formatter.match({
  "location": "StepsLeaveComplaint.нажимает_на_кнопку_Помощь()"
});
formatter.result({
  "duration": 119172200,
  "status": "passed"
});
formatter.match({
  "location": "StepsLeaveComplaint.выбирает_пункт_службы_контроля_качества()"
});
formatter.result({
  "duration": 655062200,
  "status": "passed"
});
formatter.match({
  "location": "StepsLeaveComplaint.пользователь_нажимает_на_кнопку_оставить_жалобу()"
});
formatter.result({
  "duration": 760652000,
  "status": "passed"
});
formatter.match({
  "location": "StepsLeaveComplaint.заполняет_все_поля()"
});
formatter.result({
  "duration": 795416800,
  "status": "passed"
});
formatter.match({
  "location": "StepsLeaveComplaint.пользователь_нажимает_кнопку_отправить()"
});
formatter.result({
  "duration": 93574700,
  "status": "passed"
});
formatter.after({
  "duration": 752232200,
  "status": "passed"
});
});