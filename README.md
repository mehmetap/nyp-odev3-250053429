# NYP 3. Ödev

**Mehmetcan Sütsatan · 250053429 · K = 29**

Referanslar, kapsülleme, kalıtım, `super`, `protected`, `final`, metot ezme
ve HAS-A ilişkilerini gösteren bağımsız Java örnekleri. JDK 17 gerekir.

## Yapı ve çalıştırma

Komutları depo kökünde çalıştırın. Aynı isimli `Main` sınıfları bağımsız
örneklerdir; her birini ayrı çıktı klasörüne derleyin.

| Bölüm | Kaynak | Ana sınıf |
|---|---|---|
| Toros Efsaneleri | `src/toros/` | `toros.Main` |
| Yapıcı zinciri | `src/Main.java` | `Main` |
| Metot ezme | `src/ezme.java` | `ezme` |
| Kupa referansları | `kupa/` | `Main` |
| Termostat | `kapsul/src/` | `Main` |

```sh
javac -encoding UTF-8 -d out/toros src/toros/*.java
java -cp out/toros toros.Main
javac -encoding UTF-8 -d out/kalitim src/Main.java src/ezme.java
java -cp out/kalitim Main
java -cp out/kalitim ezme
javac -encoding UTF-8 -d out/kupa kupa/*.java
java -cp out/kupa Main
javac -encoding UTF-8 -d out/kapsul kapsul/src/*.java
java -cp out/kapsul Main
```

Kupa örneğinin çıktısı: `Kırmızı`, `Yeşil`, `Yeşil 29`, `masadakiKupa: null`.
Termostat 16–30 °C sınırlarında 0,5 °C adımla çalışır; kapalıyken değişiklik reddedilir.

Toros paketi Lonca, Silah, Karakter, Savasci, Buyucu, Okcu ve Suikastci sınıflarını içerir.
IDE dosyaları, boş probe dosyaları ve derleme çıktıları kaynak teslimine dahil edilmez.
Commit tarihleri değiştirilmez; ödevin farklı günlerde commit şartı gerçek çalışma geçmişiyle sağlanmalıdır.
