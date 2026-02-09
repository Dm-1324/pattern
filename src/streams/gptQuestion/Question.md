# Java Streams Interview Cheat Sheet

This cheat sheet contains **45 Java Streams questions** with:

- **Concept** – which streams feature is used
- **Input** – starting input
- **Output** – expected output

---

| Q# | Concept                     | Input                                                         | Output                                   |
|----|-----------------------------|---------------------------------------------------------------|------------------------------------------|
| 1  | Stream basics: forEach      | `["java", "stream", "api"]`                                   | java<br>stream<br>api                    |
| 2  | Collect to Set              | `["java", "stream", "java", "api"]`                           | [java, stream, api]                      |
| 3  | String → IntStream          | `"abc"`                                                       | [97, 98, 99]                             |
| 4  | Filter & count              | `["apple", "ant", "ball", "ape"]`                             | 3                                        |
| 5  | Find first                  | `["", " ", "", "java", "stream"]`                             | `" "`                                    |
| 6  | Filter + map                | `["java", "stream", "api", "code"]`                           | [JAVA, STREAM, CODE]                     |
| 7  | Map to length               | `["java", "is", "powerful"]`                                  | [4, 2, 8]                                |
| 8  | Filter palindromes          | `["madam", "java", "level", "stream"]`                        | [madam, level]                           |
| 9  | Peek                        | `["short", "medium", "verylongword"]`                         | prints medium, verylongword              |
| 10 | Replace vowels              | `["java", "stream"]`                                          | [j\*v\*, str\**m]                        |
| 11 | Flatten lists               | `[["a","b"], ["c","d"]]`                                      | [a, b, c, d]                             |
| 12 | Unique words                | `["java streams are powerful", "streams make java powerful"]` | [java, streams, are, powerful, make]     |
| 13 | Unique characters           | `["abc", "bcd"]`                                              | [a, b, c, d]                             |
| 14 | CSV flatten                 | `["a,b,c", "b,c,d"]`                                          | [a, b, c, d]                             |
| 15 | Unique vowels               | `["apple", "banana", "cat"]`                                  | [a, e]                                   |
| 16 | Group by length             | `["java", "is", "fun", "streams"]`                            | {2=[is], 3=[fun], 4=[java], 7=[streams]} |
| 17 | Group by first char         | `["apple", "ant", "ball", "bat"]`                             | {a=[apple, ant], b=[ball, bat]}          |
| 18 | Group + count               | `["a","bb","cc","ddd"]`                                       | {1=1, 2=2, 3=1}                          |
| 19 | Group + Set                 | `["cat","car","cat","cow"]`                                   | {c=[cat, car, cow]}                      |
| 20 | Longest word per group      | `["apple","ant","banana","bat"]`                              | {a=apple, b=banana}                      |
| 21 | Lengths per group           | `["apple","ant","banana","bat"]`                              | {a=[5,3], b=[6,3]}                       |
| 22 | Uppercase per length        | `["java","code","stream","api"]`                              | {3=[API], 4=[JAVA,CODE],6=[STREAM]}      |
| 23 | Vowels per group            | `["apple","ant","ball","bat"]`                                | {a=[a,e], b=[a]}                         |
| 24 | Sorted characters per group | `["apple","ape","ant"]`                                       | {a=[a,e,l,n,p,t]}                        |
| 25 | Distinct lengths per group  | `["cat","car","cart","cow"]`                                  | {c=2}                                    |
| 26 | Longest word                | `["java","streams","powerful"]`                               | powerful                                 |
| 27 | Total char count            | `["java","api"]`                                              | 7                                        |
| 28 | Average length              | `["java","stream","api"]`                                     | 4.3333…                                  |
| 29 | Most vowels                 | `["java","education","stream"]`                               | education                                |
| 30 | Distinct characters         | `["abc","bcd","cde"]`                                         | 5                                        |
| 31 | AnyMatch                    | `["java","stream","api"]`                                     | false                                    |
| 32 | All lowercase               | `["java","stream","Api"]`                                     | false                                    |
| 33 | None empty                  | `["java"," ","stream"]`                                       | false                                    |
| 34 | First longer than 7         | `["java","streams","powerful"]`                               | powerful                                 |
| 35 | Any containing "java"       | `["hello","java streams"]`                                    | true                                     |
| 36 | Sort by length              | `["java","is","powerful"]`                                    | [is, java, powerful]                     |
| 37 | Length then alphabet        | `["bat","apple","ant","bapple","aaaaa"]`                      | [ant, bat, aaaaa, apple, bapple]         |
| 38 | Reverse alphabet            | `["java","api","stream"]`                                     | [stream, java, api]                      |
| 39 | Sort by vowel count         | `["java","education","stream"]`                               | [java, stream, education]                |
| 40 | Top 3 longest               | `["a","bb","ccc","dddd","eeeee"]`                             | [eeeee, dddd, ccc]                       |
| 41 | Unique consonants per group | `["apple","ant","ball","bat"]`                                | {a=[p], b=[l]}                           |
| 42 | Most frequent character     | `["apple","banana"]`                                          | a                                        |
| 43 | Comma-separated per group   | `["cat","car","dog"]`                                         | {c=cat,car, d=dog}                       |
| 44 | Character frequency         | `["ab","bc"]`                                                 | {a=1, b=2, c=1}                          |
| 45 | Avg vowels per group        | `["apple","ant","ball","bat"]`                                | {a=1.5, b=0.5}                           |

---

