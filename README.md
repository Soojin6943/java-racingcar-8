# 🏎️ 자동차 경주

[2주차 프리코스 미션] 자동차 경주

<br>

## 📋 기능 목록

### 입력 및 출력

- [x]  자동차 이름 입력 받기
    - [x]  쉼표(,) 기준으로 구분
    - [x]  이름 앞뒤 공백 제거
- [x]  시도할 횟수 입력 받기
- [x]  각 시도별 자동차의 전진 상태 출력
- [x]  최종 우승자 출력

> 통상적으로 이름 앞뒤에는 공백이 들어가지 않아, 이름 입력의 앞뒤 공백을 제거 <br>
이름 중간 공백은 이름에 포함
> 

### 기본 기능

- [x]  자동차 이름의 문자열을 `Car` 객체 리스트로 변환
- [x]  0~9 사이의 랜덤 값 생성
- [x]  랜덤 값이 4 이상일 경우 자동차 전진
- [x]  모든 자동차가 한 번씩 전진 시도 (한 라운드 진행)
- [x]  입력받은 시도 횟수만큼 라운드 반복
- [x]  가장 멀리 간 자동차의 포지션 찾기
- [x]  최종 우승자 찾기

### 예외 처리

- [x]  자동차 이름이 5자 이상인 경우 → `IllegalArgumentException`
- [x]  자동차 이름이 공백 또는 비어있는 경우 → `IllegalArgumentException`
- [x]  쉼표만 입력하거나 쉼표로 시작하거나 끝나는 경우 → `IllegalArgumentException`
- [x]  시도 횟수가 숫자가 아닌 경우 → `IllegalArgumentException`
- [x]  시도 횟수가 0 이하인 경우 → `IllegalArgumentException`

### 테스트 코드

- [x]  Car - 전진, 초기 위치 테스트
- [x]  Cars - 문자열 파싱, 우승자, 최대 거리 계산 테스트
- [x]  CarValidator - 자동차 이름 길이, 공백, 쉼표 입력 예외 테스트
- [x]  TryCountValidator - 시도 횟수 0이하, 숫자 아님 예외 테스트
- [x]  RacingGame - 랜덤 전진/멈춤 테스트
- [x]  Application - 통합 테스트

<br>

## 구조

```java
racingcar
 ┣ 📂 controller
 ┃ ┗ 📜 RacingController.java      # 프로그램 전체 흐름 제어
 ┣ 📂 model
 ┃ ┣ 📜 Car.java                    # 자동차 객체 (상태 + 전진 로직)
 ┃ ┣ 📜 Cars.java                   # 자동차 컬렉션, 파싱 및 우승자 판단
 ┃ ┣ 📜 RacingGame.java             # 라운드별 진행, 랜덤 이동 로직
 ┃ ┣ 📜 CarValidator.java           # 자동차 이름 검증
 ┃ ┗ 📜 TryCountValidator.java      # 시도 횟수 검증
 ┣ 📂 view
 ┃ ┣ 📜 InputView.java              # 사용자 입력 처리
 ┃ ┗ 📜 OutputView.java             # 진행 결과 및 우승자 출력
 ┗ 📜 Application.java              # main() 진입점

```
