# Library_system_project
> 소프트웨어설계 수업용 프로젝트입니다.

설계 패턴을 5개 이상 구현하여 프로젝트 기능을 구현하는 작업입니다.
필자는 도서관을 주제로 하였고, 도서관의 여러 기능들을 다양한 패턴을 이용하여 구현하였습니다.

![](../header.png)

## 사용한 패턴

1. Singleton Pattern(도서관 구현)
2. State Pattern(알림 구현)
3. Observer Pattern(유저 구현)
4. Templete Pattern(서점 구현)
5. Iterator Pattern(책꽂이 구현)


## 주요 기능 소개
1. 도서관에 유저 추가 및 삭제
2. 서점마다 책 출시 시 도서관에 책 배치 및 유저에게 알림전송
3. 유저 알림 허용 및 차단

<img width="328" alt="스크린샷 2023-05-26 오전 12 57 17" src="https://github.com/sdoohee/Library_system_project/assets/90372242/c70d0228-7833-4715-9c17-756d6f88a94d">

<img width="380" alt="스크린샷 2023-05-26 오전 12 57 25" src="https://github.com/sdoohee/Library_system_project/assets/90372242/3b75271a-89c7-4dbf-aa45-bfedc15a4d80">

## 설계 이슈
1. 서점에서 도서관에 책을 줄 때 도서관이 여러개이면 안된다. 
2. 신도서 출시 알림을 받고 싶은 유저와 그렇지 않은 유저가 있을거라는 설정을 어떻게 해야 할 지 고민을 했다.
3. 도서관에 책이 추가되었을 때 유저에게 각각 알림을 보내야 한다. 
4. 서점에서 책을 출시하고 도서관에 책을 배치하는 과정은 동일한데 매번 같은 동작을 수행하는 것은 비효율적이다.
5. 책장을 리스트 형태로 구현하게 된다면 도서관이 수용할 수 있는 책의 초대 갯수를 설정하지 못하며, 파악하기도 힘들다.

## 설계 패턴 적용 해결방안
#서점에서 도서관에 책을 줄 때 도서관이 여러개이면 안된다. 

1. 서점에서 도서관에 책을 줄 때 도서관이 여러개이면 안된다. 
    * Singleton
    * 애플리케이션이 시작될 때, 어떤 클래스가 최초 한 번만 메모리를 할당하고 해당 메모리에 인스텐스를 만들어 사용하는 패턴. 특, '하나'의 인스턴스만 생성하여 사용하는 디자인 패턴
    * = 인스턴스가 필요할 때, 똑같은 인스턴스를 만들지 않고 기존의 인스턴스를 활용하는 것

1-1. 구현이유
    * 객체를 생헝할 때마다 메모리 영역을 할당받아야 한다. 하지만 한번의 new를 통해 객체를 생성해 메모리 낭비를 방지 가능하다.
    * 싱글톤으로 구현한 인스턴스는 '전역'이므로, 다른 클래스의 인스턴스들이 데이터를 공유하는 것이 가능하다.

2. 신도서 출시 알림을 받고 싶은 유저와 그렇지 않은 유저가 있을거라는 설정을 어떻게 해야 할 지 고민을 했다.
    * State
    * 객체의 내부 상태에 따라 스스로 행동을 변경할 수 있게 허가하는 패턴으로, 어떻게 하면 객체를 마치 자신의 클래스를 바꾸는 것처럼 보임

2-1. 구현이유
    * 상태 전이를 위한 조건 로직(객체의 상태와 이들 간의 전이 방법0이 복잡해지는 것을 해소하기 위해
    * 클래스 하나에 모여 있던 상태 전이 로직을 꺼내 각 상태를 나타내는 클래스로 분산시키면, 설계가 단순해져서 상태가 전이되는 방식을 쉽게 이해할 수 있다.

## 정보

송지현 – sdoohee0808@naver.com


<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki
