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
  "duration": 4000763800,
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
  "duration": 3014356300,
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
  "duration": 73088199,
  "status": "passed"
});
formatter.match({
  "location": "CheckItemCardSteps.отображается_изображение_товара()"
});
formatter.result({
  "duration": 42755101,
  "status": "passed"
});
formatter.match({
  "location": "CheckItemCardSteps.отбражается_стоимость_товара()"
});
formatter.result({
  "duration": 33440300,
  "status": "passed"
});
formatter.match({
  "location": "CheckItemCardSteps.есть_кнопка_добавить_в_корзину()"
});
formatter.result({
  "duration": 338271901,
  "status": "passed"
});
formatter.match({
  "location": "CheckItemCardSteps.имеется_возможность_изменять_количество_товара()"
});
formatter.result({
  "duration": 304364000,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //*[contains(text(),\u0027Наличие\u0027 because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//*[contains(text(),\u0027Наличие\u0027\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d77.0.3865.75)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027MSK2-LEARNING-0\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.75, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\student\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:41808}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a56600eb48351fc90bb76ed595108145\n*** Element info: {Using\u003dxpath, value\u003d//*[contains(text(),\u0027Наличие\u0027}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat steps.CheckItemCardSteps.имеется_возможность_изменять_количество_товара(CheckItemCardSteps.java:55)\r\n\tat ✽.К тому же имеется возможность изменять количество товара(CheckItemCard.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1248934400,
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
  "duration": 3285903999,
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
