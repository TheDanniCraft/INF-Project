# INF-Project#

## Branching Strategie - GitHub Flow

Wir arbeiten mit [GitHub Flow](https://www.gitkraken.com/learn/git/best-practices/git-branch-strategy).

Der `main` Branch beinhaltet immer die ***aktuelle*** und ***funktionierende*** Version des Codes. 
Um an einem Feature zu arbeiten muss ein neuer Branch erstellt werden indem man nur diese eine Feature bearbeitet.
Sozusagen für jede Karte im Backlog ein Brach (außer es hat nichts mit dem Code zu tun).

>Nur eine Person arbeitet an einem Branch!

Wenn das Feature fertig ist muss man wie [hier](https://medium.com/singlestone/a-git-workflow-using-rebase-1b1210de83e5 ) erklärt einen **rebase** machen um den Branch auf den aktuellen Stand des `main` Branch zu bringen.

>Bei dem Artikel alles zu dem Thema **Fork** ignorieren.
>Einfach lokal arbeiten.

Danach kann eine **Pull Request** gemacht werden und der Branch in `main` **gemerged** werden.

Das ist im Bild dargestellt.

<img  src="https://1v5ymx3zt3y73fq5gy23rtnc-wpengine.netdna-ssl.com/wp-content/uploads/2021/03/git-flow.svg" style="height:500px">

## Links

- [How to Write a Git Commit Message](https://cbea.ms/git-commit)

