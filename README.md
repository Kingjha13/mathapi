<div align="center">

# 📐 MathApi

### ⚡ Fast • 🛡 Safe • 💯 Pure Kotlin • 🚀 Production Ready

[![](https://jitpack.io/v/Kingjha13/mathapi.svg)](https://jitpack.io/#Kingjha13/mathapi)
![Kotlin](https://img.shields.io/badge/Kotlin-100%25-blueviolet)
![Platform](https://img.shields.io/badge/Platform-Android%20%7C%20JVM-green)
![License](https://img.shields.io/badge/License-MIT-yellow)

</div>

---

## ✨ Overview

**MathApi** is a lightweight, high-performance math utility library written in **pure Kotlin**, designed for:

- 📱 Android Applications  
- 💻 JVM Projects  
- 🎨 Jetpack Compose  
- 🎮 Game & AR Calculations  

It provides **ready-to-use optimized math functions** with safe edge-case handling and low time complexity.

---

# 🚀 Why MathApi?

✔ Clean & simple API  
✔ No initialization required  
✔ Zero external dependencies  
✔ Safe operations (no crashes)  
✔ Small footprint  
✔ Production-ready  

---

# 📦 Installation (JitPack)

### 1️⃣ Add JitPack Repository

**`settings.gradle`**
```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

### 2️⃣ Add Dependency

**`build.gradle`**
```kotlin
dependencies {
    implementation("com.github.Kingjha13:mathapi:v3.1.0")
}
```

Sync project → Done ✅

---

# 📚 Available Modules

| Class | Description |
|-------|------------|
| `MathApi` | Basic arithmetic |
| `AdvancedMath` | Factorial, power, GCD, LCM |
| `Statistics` | Mean, variance, standard deviation |
| `NumberTheory` | Prime check, Fibonacci |
| `Geometry` | Distance, triangle area |
| `SafeMath` | Safe divide, clamp |
| `Point` | 2D coordinate model |

---

# 🧮 Quick Usage

```kotlin
import com.github.kingjha13.mathapi.*

fun main() {

    val sum = MathApi.add(10, 5)
    val factorial = AdvancedMath.factorial(6)
    val mean = Statistics.mean(listOf(1.0, 2.0, 3.0))
    val prime = NumberTheory.isPrime(97)

    println("Sum: $sum")
    println("Factorial: $factorial")
    println("Mean: $mean")
    println("Is Prime: $prime")
}
```

---

# 📐 Geometry Example

```kotlin
val p1 = Point(0.0, 0.0)
val p2 = Point(3.0, 4.0)

Geometry.distance(p1, p2) // 5.0

Geometry.triangleArea(
    Point(0.0, 0.0),
    Point(4.0, 0.0),
    Point(0.0, 3.0)
) // 6.0
```

---

# 🛡 Safe Math Example

```kotlin
SafeMath.safeDivide(10.0, 0.0) // 0.0 (no crash)
SafeMath.clamp(150, 0, 100)    // 100
```

---

# 🧪 Jetpack Compose Demo

```kotlin
@Composable
fun MathApiDemo() {

    val add = MathApi.add(10, 5)
    val factorial = AdvancedMath.factorial(6)
    val mean = Statistics.mean(listOf(1.0, 2.0, 3.0))
    val prime = NumberTheory.isPrime(97)

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Add: $add")
        Text("Factorial: $factorial")
        Text("Mean: $mean")
        Text("Is Prime: $prime")
    }
}
```

Works perfectly with **Material 3**.

---

# 🧠 Design Philosophy

🚀 Optimized low time complexity  
🔒 Safe & predictable behavior  
🧪 Easy to test  
📦 Minimal & clean structure  
💯 100% Pure Kotlin  

---

# 🛠 Compatibility

| Platform | Status |
|----------|--------|
| Android | ✅ Supported |
| JVM | ✅ Supported |
| Jetpack Compose | ✅ Supported |
| AR / Game Math | ✅ Supported |

---

# 📌 Versioning

This project follows **Semantic Versioning**:

- PATCH → Bug fixes  
- MINOR → New features  
- MAJOR → Breaking changes  

**Current Version:** `v3.1.0`

---

# 🤝 Contributing

Contributions are welcome!

1. Fork the repository  
2. Create a feature branch  
3. Improve or extend functionality  
4. Submit a Pull Request  

---

# 📄 License

MIT License  
Free for personal and commercial use.

---

# 👨‍💻 Author

**Avanish Jha**  
GitHub: https://github.com/Kingjha13  

---

<div align="center">

### ⭐ If this library helps you, consider starring the repository!

</div>
