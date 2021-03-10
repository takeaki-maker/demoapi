# demoapi
kotlinでのWebapi作成のプロトタイプ。

 `/api/book` にGetリクエストを投げるとBookリストがJsonで帰ってくる。

Kotlin


# 使用ツール・言語等
言語：Kotlin 1.3.72
DB：MySQL 8.0.22
フレームワーク：Springboot
ビルドツール：Gradle

# セットアップ
1. DB接続先設定

`applicatioin.yml`の`datasource`部分で接続先DBを自分の環境に合わせて設定する。

詳しくは`#`のコメントアウト部分を参照してください。

application.yml
```yml
spring:
  datasource:
    url:  jdbc:mysql://localhost/demo          # ローカルで実行する場合はdemoの部分を自分のdatabase名に変更する。
    username: root 　　　　　　　　　　　　        # DB接続時のユーザー名を変更する場合はここも変更する。
    driverClassName: com.mysql.jdbc.Driver     # Mysqlを使用する場合は修正不要
# JPA
jpa:
  hibernate:
  ddl-auto: update
  show-sql: true
```

2. DBテーブル作成
`schema.sql`を実行する。

# How to Use(ローカルで実行する場合)
1. アプリケーションを起動する
2. `localhost:8080/api/books`にリクエストを投げる。
ブラウザを使用する場合は、`http://localhost:8080/api/books`にアクセス。
コマンドラインからリクエストを投げる際のコマンドは各自調べてください。
