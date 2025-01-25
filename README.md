# TheBakeryApp

## Описание проекта

**TheBakeryApp** — это мобильное приложение для пекарни, которое позволяет пользователям узнать информацию о продукции и оформить заказы. Приложение включает анимации, интерактивные элементы и адаптивный дизайн для комфортного взаимодействия.

### Основной функционал
- **Анимация загрузки** — приложение запускается с плавной анимацией, создающей приятное первое впечатление.
- **Экран с акцией** — на главном экране отображается кнопка для перехода к информации о текущих акциях.
- **Информация о хлебе** — при переходе на экран с информацией отображается описание, картинка и кнопка для возврата на главный экран.
- **Режим с перевернутым экраном** — при повороте экрана элементы интерфейса адаптируются для удобного отображения.
- **Подтверждение выхода** — при попытке выхода из приложения появляется всплывающее окно для подтверждения, с возможностью отмены действия.

### Используемые технологии
- **Android SDK** — для создания приложения.
- **Java** — основной язык программирования.
- **XML** — для создания пользовательского интерфейса.
- **Material Design** — для улучшенной визуализации и интерактивности.

### Требования
- **Минимальная версия Android**: 5.0 (Lollipop, SDK 22)
- **Целевая версия Android**: 13 (SDK 33)
- **Процессор**: ARM или x86
- **Память**: 2 ГБ и более
- **Версия Java**: 8

### Инструкция по сборке и запуску
1. Клонируйте репозиторий и перейдите в директорию проекта:
```bash
git clone https://github.com/polinio/TheBakeryApp.git
```
2. Откройте проект в Android Studio.
3. Запустите приложение на эмуляторе или подключенном устройстве.

### Экранное поведение
- **Запуск приложения:**
При запуске приложения отображается анимация загрузки.
После загрузки появляется главный экран с элементами интерфейса, включая экран с акцией.

<div align="center">
  <img src="https://github.com/polinio/TheBakeryApp/blob/master/screenshots/sc_menu.png" alt="Текст для изображения" width="250" />
  <img src="https://github.com/polinio/TheBakeryApp/blob/master/screenshots/sc_ad.png" alt="Текст для изображения" width="250" />
</div>

- **Экран с информацией о хлебе:**
На экране с информацией о хлебе отображается описание продукции и картинка.
Можно вернуться назад на главный экран с помощью кнопки возврата.

<div align="center">
  <img src="https://github.com/polinio/TheBakeryApp/blob/master/screenshots/sc_bread_nutrition.png" alt="Текст для изображения" width="250" />
</div>

- **Перевернутый экран:**
Когда экран переворачивается, все элементы автоматически адаптируются, чтобы быть видимыми.
Приложение корректно отображает информацию и элементы даже в горизонтальной ориентации.

<div align="center">
  <img src="https://github.com/polinio/TheBakeryApp/blob/master/screenshots/sc_rotate.png" alt="Текст для изображения" width="250" />
</div>

- **Подтверждение выхода:**
При попытке закрыть приложение появляется всплывающее окно с запросом подтверждения.
Пользователь может выбрать "Да" для выхода или "Нет" для отмены выхода.

<div align="center">
  <img src="https://github.com/polinio/TheBakeryApp/blob/master/screenshots/sc_exit.png" alt="Текст для изображения" width="250" />
</div>

### Видео-демонстрация
Вы можете посмотреть видео демонстрацию работы приложения по следующей [ссылке](https://www.youtube.com/watch?v=uEl0bkWO6Dg).

