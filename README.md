# NYP 3. Ödev

Mehmetcan Sütsatan · 250053429 · K = 29

Java referansları, kapsülleme, kalıtım ve metot ezme örnekleri. JDK 17 veya üstü gerekir.
Örnekler ayrı derlenir; aynı adlı Main sınıfları tek derleme çıktısına konulmamalıdır.

| Klasör | İçerik | Çalıştırma sınıfı |
| --- | --- | --- |
| kupa | Referanslar, Stack/Heap örneği | Main |
| kapsul/src | Termostat kapsülleme | Main |
| src | Kalıtım ve abonelik örnekleri | Main, ezme |
| toros/src | Lonca, silah ve karakterler | toros.Main |

```sh
javac -encoding UTF-8 -d out/kupa kupa/*.java
java -cp out/kupa Main
javac -encoding UTF-8 -d out/kapsul kapsul/src/*.java
java -cp out/kapsul Main
javac -encoding UTF-8 -d out/kalitim src/*.java
java -cp out/kalitim Main
javac -encoding UTF-8 -d out/toros toros/src/*.java
java -cp out/toros toros.Main
```

Kupa örneğinin çıktısı: Kırmızı, Yeşil, Yeşil 29, masadakiKupa: null.
Null referans üzerinden metot çağrılmaz.

## Kontrol durumu

Kupa derleme hataları ve null erişimi düzeltildi. Termostat başlangıç örneği JDK 17 ile uyumlu hale getirildi.
Bu incelemenin yerel ortamında javac bulunmadığından Java derlemesi doğrulanmadı; CI derleme ve örnek çalıştırma işlerini içerir.
