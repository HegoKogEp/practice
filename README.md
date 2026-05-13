# practice - Project Documentation

## Content

1. [app\src\androidTest\java\com\mobile\app](#app)
   1. [ExampleInstrumentedTest.kt](#exampleinstrumentedtest)
2. [app\src\main](#main)
   1. [AndroidManifest.xml](#androidmanifest)
3. [app\src\main\java\com\mobile\app](#app)
   1. [MainActivity.kt](#mainactivity)
4. [app\src\main\java\com\mobile\app\ui\navigation](#navigation)
   1. [AppNavigation.kt](#appnavigation)
5. [app\src\main\java\com\mobile\app\ui\theme](#theme)
   1. [Color.kt](#color)
   2. [Theme.kt](#theme)
   3. [Type.kt](#type)
6. [app\src\main\res\drawable](#drawable)
   1. [ic_launcher_background.xml](#iclauncherbackground)
   2. [ic_launcher_foreground.xml](#iclauncherforeground)
7. [app\src\main\res\mipmap-anydpi-v26](#mipmapanydpiv26)
   1. [ic_launcher_round.xml](#iclauncherround)
   2. [ic_launcher.xml](#iclauncher)
8. [app\src\main\res\values](#values)
   1. [colors.xml](#colors)
   2. [strings.xml](#strings)
   3. [themes.xml](#themes)
9. [app\src\main\res\values-night](#valuesnight)
   1. [themes.xml](#themes)
10. [app\src\main\res\xml](#xml)
   1. [network_security_config.xml](#networksecurityconfig)
11. [app\src\test\java\com\mobile\app](#app)
   1. [ExampleUnitTest.kt](#exampleunittest)
12. [auth\src\androidTest\java\com\mobile\auth](#auth)
   1. [ExampleInstrumentedTest.kt](#exampleinstrumentedtest)
13. [auth\src\main](#main)
   1. [AndroidManifest.xml](#androidmanifest)
14. [auth\src\main\java\com\mobile\auth\data\dto\model](#model)
   1. [GroupDto.kt](#groupdto)
   2. [PersonDto.kt](#persondto)
   3. [UserDto.kt](#userdto)
15. [auth\src\main\java\com\mobile\auth\data\dto\request](#request)
   1. [LoginRequest.kt](#loginrequest)
   2. [RegisterRequest.kt](#registerrequest)
16. [auth\src\main\java\com\mobile\auth\data\dto\response](#response)
   1. [LoginResponse.kt](#loginresponse)
17. [auth\src\main\java\com\mobile\auth\data\local](#local)
   1. [TokenManager.kt](#tokenmanager)
18. [auth\src\main\java\com\mobile\auth\data\network](#network)
   1. [ApiService.kt](#apiservice)
   2. [AuthInterceptor.kt](#authinterceptor)
   3. [RetrofitClient.kt](#retrofitclient)
19. [auth\src\main\java\com\mobile\auth\data\repository](#repository)
   1. [AuthRepository.kt](#authrepository)
20. [auth\src\main\java\com\mobile\auth\data\state](#state)
   1. [LoginState.kt](#loginstate)
21. [auth\src\main\java\com\mobile\auth\di](#di)
   1. [AuthServiceLocator.kt](#authservicelocator)
22. [auth\src\main\java\com\mobile\auth\impl](#impl)
   1. [AuthManagerImpl.kt](#authmanagerimpl)
   2. [AuthNavigatorImpl.kt](#authnavigatorimpl)
23. [auth\src\main\java\com\mobile\auth\ui\navigation](#navigation)
   1. [AuthNavHost.kt](#authnavhost)
24. [auth\src\main\java\com\mobile\auth\ui\navigation\screens](#screens)
   1. [AuthScreen.kt](#authscreen)
   2. [LoginScreen.kt](#loginscreen)
   3. [RegisterScreen.kt](#registerscreen)
25. [auth\src\main\java\com\mobile\auth\ui\theme](#theme)
   1. [Color.kt](#color)
   2. [Theme.kt](#theme)
   3. [Type.kt](#type)
26. [auth\src\main\java\com\mobile\auth\viewmodels](#viewmodels)
   1. [LoginViewModel.kt](#loginviewmodel)
   2. [RegisterViewModel.kt](#registerviewmodel)
27. [auth\src\main\res\drawable](#drawable)
   1. [ic_launcher_background.xml](#iclauncherbackground)
   2. [ic_launcher_foreground.xml](#iclauncherforeground)
28. [auth\src\main\res\mipmap-anydpi-v26](#mipmapanydpiv26)
   1. [ic_launcher_round.xml](#iclauncherround)
   2. [ic_launcher.xml](#iclauncher)
29. [auth\src\main\res\values](#values)
   1. [colors.xml](#colors)
   2. [strings.xml](#strings)
   3. [themes.xml](#themes)
30. [auth\src\main\res\values-night](#valuesnight)
   1. [themes.xml](#themes)
31. [auth\src\test\java\com\mobile\auth](#auth)
   1. [ExampleUnitTest.kt](#exampleunittest)
32. [calculations\src\androidTest\java\com\mobile\calculations](#calculations)
   1. [ExampleInstrumentedTest.kt](#exampleinstrumentedtest)
33. [calculations\src\main](#main)
   1. [AndroidManifest.xml](#androidmanifest)
34. [calculations\src\main\java\com\mobile\calculations\data](#data)
   1. [CalculationsDatabase.kt](#calculationsdatabase)
   2. [DepositCalculation.kt](#depositcalculation)
   3. [DepositDao.kt](#depositdao)
35. [calculations\src\main\java\com\mobile\calculations\data\repository](#repository)
   1. [DepositRepository.kt](#depositrepository)
36. [calculations\src\main\java\com\mobile\calculations\data\state](#state)
   1. [CalculationState.kt](#calculationstate)
37. [calculations\src\main\java\com\mobile\calculations\di](#di)
   1. [CalculationsServiceLocator.kt](#calculationsservicelocator)
38. [calculations\src\main\java\com\mobile\calculations\impl](#impl)
   1. [CalculationsNavigatorImpl.kt](#calculationsnavigatorimpl)
   2. [CalculationsProviderImpl.kt](#calculationsproviderimpl)
39. [calculations\src\main\java\com\mobile\calculations\ui\navigation](#navigation)
   1. [CalculationsNavHost.kt](#calculationsnavhost)
40. [calculations\src\main\java\com\mobile\calculations\ui\navigation\screens](#screens)
   1. [CalculationsScreen.kt](#calculationsscreen)
   2. [DepositScreenOne.kt](#depositscreenone)
   3. [DepositScreenTwo.kt](#depositscreentwo)
   4. [MyCalculationsScreen.kt](#mycalculationsscreen)
   5. [ResultScreen.kt](#resultscreen)
41. [calculations\src\main\java\com\mobile\calculations\ui\theme](#theme)
   1. [Theme.kt](#theme)
42. [calculations\src\main\java\com\mobile\calculations\viewmodels](#viewmodels)
   1. [DepositCalculationViewModel.kt](#depositcalculationviewmodel)
   2. [HistoryViewModel.kt](#historyviewmodel)
43. [calculations\src\main\res\drawable](#drawable)
   1. [ic_launcher_background.xml](#iclauncherbackground)
   2. [ic_launcher_foreground.xml](#iclauncherforeground)
44. [calculations\src\main\res\mipmap-anydpi-v26](#mipmapanydpiv26)
   1. [ic_launcher_round.xml](#iclauncherround)
   2. [ic_launcher.xml](#iclauncher)
45. [calculations\src\main\res\values](#values)
   1. [colors.xml](#colors)
   2. [strings.xml](#strings)
   3. [themes.xml](#themes)
46. [calculations\src\main\res\values-night](#valuesnight)
   1. [themes.xml](#themes)
47. [calculations\src\test\java\com\mobile\calculations](#calculations)
   1. [ExampleUnitTest.kt](#exampleunittest)
48. [domain\src\androidTest\java\com\mobile\domain](#domain)
   1. [ExampleInstrumentedTest.kt](#exampleinstrumentedtest)
49. [domain\src\main](#main)
   1. [AndroidManifest.xml](#androidmanifest)
50. [domain\src\main\java\com\mobile\domain\auth](#auth)
   1. [AuthManager.kt](#authmanager)
   2. [AuthNavigator.kt](#authnavigator)
   3. [AuthState.kt](#authstate)
   4. [User.kt](#user)
51. [domain\src\main\java\com\mobile\domain\calculations](#calculations)
   1. [CalculationResult.kt](#calculationresult)
   2. [CalculationsNavigator.kt](#calculationsnavigator)
   3. [CalculationsProvider.kt](#calculationsprovider)
52. [domain\src\main\res\drawable](#drawable)
   1. [ic_launcher_background.xml](#iclauncherbackground)
   2. [ic_launcher_foreground.xml](#iclauncherforeground)
53. [domain\src\main\res\mipmap-anydpi-v26](#mipmapanydpiv26)
   1. [ic_launcher_round.xml](#iclauncherround)
   2. [ic_launcher.xml](#iclauncher)
54. [domain\src\main\res\values](#values)
   1. [colors.xml](#colors)
   2. [strings.xml](#strings)
   3. [themes.xml](#themes)
55. [domain\src\main\res\values-night](#valuesnight)
   1. [themes.xml](#themes)
56. [domain\src\test\java\com\mobile\domain](#domain)
   1. [ExampleUnitTest.kt](#exampleunittest)

## FILE 1: Project Root

## app\src\androidTest\java\com\mobile\app

<a id='app'></a>

## FILE 1: ExampleInstrumentedTest.kt

<a id='exampleinstrumentedtest'></a>

```kotlin
package com.mobile.app

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.mobile.app", appContext.packageName)
    }
}
```

---

## app\src\main

<a id='main'></a>

## FILE 2: AndroidManifest.xml

<a id='androidmanifest'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">
    <uses-permission android:name="android.permission.INTERNET" />
    <application
        android:networkSecurityConfig="@xml/network_security_config"
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Draft">
        <activity android:name=".MainActivity" android:exported="true" android:label="@string/title_activity_main" android:theme="@style/Theme.Draft">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
```

---

## app\src\main\java\com\mobile\app

<a id='app'></a>

## FILE 3: MainActivity.kt

<a id='mainactivity'></a>

```kotlin
package com.mobile.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.mobile.app.ui.theme.AppTheme
import com.mobile.app.ui.navigation.AppNavigation
import com.mobile.auth.data.local.TokenManager
import com.mobile.auth.di.AuthServiceLocator
import com.mobile.calculations.di.CalculationsServiceLocator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Инициализация модулей
        TokenManager.init(applicationContext)
        AuthServiceLocator.init()
        CalculationsServiceLocator.init(applicationContext)

        setContent {
            AppTheme {
                AppNavigation()
            }
        }
    }
}
```

---

## app\src\main\java\com\mobile\app\ui\navigation

<a id='navigation'></a>

## FILE 4: AppNavigation.kt

<a id='appnavigation'></a>

```kotlin
package com.mobile.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mobile.auth.data.local.TokenManager
import com.mobile.auth.ui.navigation.AuthNavHost
import com.mobile.auth.ui.navigation.AuthScreen
import com.mobile.calculations.di.CalculationsServiceLocator
import com.mobile.calculations.ui.navigation.CalculationsNavHost
import com.mobile.calculations.ui.navigation.CalculationsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val startDestination = if (TokenManager.token != null) "main" else "auth"

    NavHost(navController = navController, startDestination = startDestination) {
        // Auth module
        composable("auth") {
            AuthNavHost(
                navController = rememberNavController(),
                onAuthSuccess = { /* AuthManager обновляется через интерфейс */ },
                onNavigateToCalculations = { userId ->
                    navController.navigate("main/$userId") { popUpTo("auth") { inclusive = true } }
                }
            )
        }

        // Calculations module
        composable("main/{userId}") { backStackEntry ->
            val userId = backStackEntry.arguments?.getString("userId")?.toLongOrNull() ?: 0L
            val calcViewModel = CalculationsServiceLocator.getInstance().getDepositCalculationViewModel()
            CalculationsNavHost(
                navController = rememberNavController(),
                userId = userId,
                onLogout = {
                    TokenManager.clearUserData()
                    navController.navigate("auth") { popUpTo("auth") { inclusive = true } }
                },
                calcViewModel = calcViewModel
            )
        }
    }
}
```

---

## app\src\main\java\com\mobile\app\ui\theme

<a id='theme'></a>

## FILE 5: Color.kt

<a id='color'></a>

```kotlin
package com.mobile.app.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
```

---

## FILE 6: Theme.kt

<a id='theme'></a>

```kotlin
package com.mobile.app.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.mobile.auth.ui.theme.Pink40
import com.mobile.auth.ui.theme.Pink80
import com.mobile.auth.ui.theme.Purple40
import com.mobile.auth.ui.theme.Purple80
import com.mobile.auth.ui.theme.PurpleGrey40
import com.mobile.auth.ui.theme.PurpleGrey80
import com.mobile.auth.ui.theme.Typography

private val DarkColorScheme = darkColorScheme(primary = Purple80, secondary = PurpleGrey80, tertiary = Pink80)
private val LightColorScheme = lightColorScheme(primary = Purple40, secondary = PurpleGrey40, tertiary = Pink40)

@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(), dynamicColor: Boolean = true, content: @Composable () -> Unit) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    MaterialTheme(colorScheme = colorScheme, typography = Typography, content = content)
}
```

---

## FILE 7: Type.kt

<a id='type'></a>

```kotlin
package com.mobile.app.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
```

---

## app\src\main\res\drawable

<a id='drawable'></a>

## FILE 8: ic_launcher_background.xml

<a id='iclauncherbackground'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path
        android:fillColor="#3DDC84"
        android:pathData="M0,0h108v108h-108z" />
    <path
        android:fillColor="#00000000"
        android:pathData="M9,0L9,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,0L19,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M29,0L29,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M39,0L39,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M49,0L49,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M59,0L59,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M69,0L69,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M79,0L79,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M89,0L89,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M99,0L99,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,9L108,9"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,19L108,19"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,29L108,29"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,39L108,39"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,49L108,49"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,59L108,59"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,69L108,69"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,79L108,79"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,89L108,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,99L108,99"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,29L89,29"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,39L89,39"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,49L89,49"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,59L89,59"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,69L89,69"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,79L89,79"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M29,19L29,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M39,19L39,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M49,19L49,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M59,19L59,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M69,19L69,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M79,19L79,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
</vector>

```

---

## FILE 9: ic_launcher_foreground.xml

<a id='iclauncherforeground'></a>

```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:aapt="http://schemas.android.com/aapt"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path android:pathData="M31,63.928c0,0 6.4,-11 12.1,-13.1c7.2,-2.6 26,-1.4 26,-1.4l38.1,38.1L107,108.928l-32,-1L31,63.928z">
        <aapt:attr name="android:fillColor">
            <gradient
                android:endX="85.84757"
                android:endY="92.4963"
                android:startX="42.9492"
                android:startY="49.59793"
                android:type="linear">
                <item
                    android:color="#44000000"
                    android:offset="0.0" />
                <item
                    android:color="#00000000"
                    android:offset="1.0" />
            </gradient>
        </aapt:attr>
    </path>
    <path
        android:fillColor="#FFFFFF"
        android:fillType="nonZero"
        android:pathData="M65.3,45.828l3.8,-6.6c0.2,-0.4 0.1,-0.9 -0.3,-1.1c-0.4,-0.2 -0.9,-0.1 -1.1,0.3l-3.9,6.7c-6.3,-2.8 -13.4,-2.8 -19.7,0l-3.9,-6.7c-0.2,-0.4 -0.7,-0.5 -1.1,-0.3C38.8,38.328 38.7,38.828 38.9,39.228l3.8,6.6C36.2,49.428 31.7,56.028 31,63.928h46C76.3,56.028 71.8,49.428 65.3,45.828zM43.4,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2c-0.3,-0.7 -0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C45.3,56.528 44.5,57.328 43.4,57.328L43.4,57.328zM64.6,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2s-0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C66.5,56.528 65.6,57.328 64.6,57.328L64.6,57.328z"
        android:strokeWidth="1"
        android:strokeColor="#00000000" />
</vector>
```

---

## app\src\main\res\mipmap-anydpi-v26

<a id='mipmapanydpiv26'></a>

## FILE 10: ic_launcher_round.xml

<a id='iclauncherround'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background" />
    <foreground android:drawable="@drawable/ic_launcher_foreground" />
    <monochrome android:drawable="@drawable/ic_launcher_foreground" />
</adaptive-icon>
```

---

## FILE 11: ic_launcher.xml

<a id='iclauncher'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background" />
    <foreground android:drawable="@drawable/ic_launcher_foreground" />
    <monochrome android:drawable="@drawable/ic_launcher_foreground" />
</adaptive-icon>
```

---

## app\src\main\res\values

<a id='values'></a>

## FILE 12: colors.xml

<a id='colors'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
</resources>
```

---

## FILE 13: strings.xml

<a id='strings'></a>

```xml
<resources>
    <string name="app_name">App</string>
    <string name="title_activity_main">MainActivity</string>
</resources>
```

---

## FILE 14: themes.xml

<a id='themes'></a>

```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.Practice" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_500</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/white</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_700</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
```

---

## app\src\main\res\values-night

<a id='valuesnight'></a>

## FILE 15: themes.xml

<a id='themes'></a>

```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.Practice" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_200</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/black</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_200</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
```

---

## app\src\main\res\xml

<a id='xml'></a>

## FILE 16: network_security_config.xml

<a id='networksecurityconfig'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<network-security-config>
    <domain-config cleartextTrafficPermitted="true">
        <domain includeSubdomains="true">192.168.200.160</domain>
    </domain-config>
</network-security-config>
```

---

## app\src\test\java\com\mobile\app

<a id='app'></a>

## FILE 17: ExampleUnitTest.kt

<a id='exampleunittest'></a>

```kotlin
package com.mobile.app

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
```

---

## auth\src\androidTest\java\com\mobile\auth

<a id='auth'></a>

## FILE 18: ExampleInstrumentedTest.kt

<a id='exampleinstrumentedtest'></a>

```kotlin
package com.mobile.auth

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.mobile.auth", appContext.packageName)
    }
}
```

---

## auth\src\main

<a id='main'></a>

## FILE 19: AndroidManifest.xml

<a id='androidmanifest'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Practice" />

</manifest>
```

---

## auth\src\main\java\com\mobile\auth\data\dto\model

<a id='model'></a>

## FILE 20: GroupDto.kt

<a id='groupdto'></a>

```kotlin
package com.mobile.auth.data.dto.model

import com.google.gson.annotations.SerializedName

data class GroupDto(
    @SerializedName("groupId")
    val id: Int,
    @SerializedName("groupName")
    val name: String
)
```

---

## FILE 21: PersonDto.kt

<a id='persondto'></a>

```kotlin
package com.mobile.auth.data.dto.model

import com.google.gson.annotations.SerializedName

data class PersonDto(
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("middleName")
    val middleName: String,
    @SerializedName("birthDate")
    val birthDate: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("groupId")
    val groupId: Int
)
```

---

## FILE 22: UserDto.kt

<a id='userdto'></a>

```kotlin
package com.mobile.auth.data.dto.model

import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("login")
    val login: String,
    @SerializedName("email")
    val email: String?,
    @SerializedName("person")
    val person: PersonDto?
)
```

---

## auth\src\main\java\com\mobile\auth\data\dto\request

<a id='request'></a>

## FILE 23: LoginRequest.kt

<a id='loginrequest'></a>

```kotlin
package com.mobile.auth.data.dto.request

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("login")
    val login: String,
    @SerializedName("password")
    val password: String
)
```

---

## FILE 24: RegisterRequest.kt

<a id='registerrequest'></a>

```kotlin
package com.mobile.auth.data.dto.request

import com.mobile.auth.data.dto.model.PersonDto
import com.google.gson.annotations.SerializedName

data class RegisterRequest(
    @SerializedName("login")
    val login: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("phoneNumber")
    val phoneNumber: String,
    @SerializedName("roleId")
    val roleId: Int = 1,
    @SerializedName("authAllowed")
    val authAllowed: Boolean = true,
    @SerializedName("person")
    val person: PersonDto
)
```

---

## auth\src\main\java\com\mobile\auth\data\dto\response

<a id='response'></a>

## FILE 25: LoginResponse.kt

<a id='loginresponse'></a>

```kotlin
package com.mobile.auth.data.dto.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token")
    val token: String
)
```

---

## auth\src\main\java\com\mobile\auth\data\local

<a id='local'></a>

## FILE 26: TokenManager.kt

<a id='tokenmanager'></a>

```kotlin
package com.mobile.auth.data.local

import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

object TokenManager {
    private lateinit var prefs: EncryptedSharedPreferences

    fun init(context: Context) {
        if (!::prefs.isInitialized) {
            val masterKey = MasterKey.Builder(context)
                .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                .build()

            prefs = EncryptedSharedPreferences.create(
                context,
                "secure_prefs",
                masterKey,
                EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
            ) as EncryptedSharedPreferences
        }
    }

    var token: String?
        get() = if (::prefs.isInitialized) prefs.getString("auth_token", null) else null
        set(value) {
            if (::prefs.isInitialized) {
                value?.let {
                    prefs.edit().putString("auth_token", it).apply()
                } ?: run {
                    prefs.edit().remove("auth_token").apply()
                }
            }
        }

    var userId: Long?
        get() = if (::prefs.isInitialized) prefs.getLong("user_id", -1L).takeIf { it != -1L } else null
        set(value) {
            if (::prefs.isInitialized) {
                value?.let {
                    prefs.edit().putLong("user_id", it).apply()
                } ?: run {
                    prefs.edit().remove("user_id").apply()
                }
            }
        }

    fun clearUserData() {
        token = null
        userId = null
    }
}
```

---

## auth\src\main\java\com\mobile\auth\data\network

<a id='network'></a>

## FILE 27: ApiService.kt

<a id='apiservice'></a>

```kotlin
package com.mobile.auth.data.network

import com.mobile.auth.data.dto.request.LoginRequest
import com.mobile.auth.data.dto.request.RegisterRequest
import com.mobile.auth.data.dto.model.UserDto
import com.mobile.auth.data.dto.model.GroupDto
import com.mobile.auth.data.dto.response.LoginResponse
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): LoginResponse

    @POST("auth/register")
    suspend fun register(@Body request: RegisterRequest): Response<Unit>

    @GET("users")
    suspend fun getUsers(): List<UserDto>

    @GET("groups")
    suspend fun getGroups(): List<GroupDto>
}
```

---

## FILE 28: AuthInterceptor.kt

<a id='authinterceptor'></a>

```kotlin
package com.mobile.auth.data.network

import com.mobile.auth.data.local.TokenManager
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val builder = original.newBuilder()
            .addHeader("Content-Type", "application/json")
        TokenManager.token?.let {
            builder.addHeader("Authorization", "Bearer $it")
        }
        return chain.proceed(builder.build())
    }
}
```

---

## FILE 29: RetrofitClient.kt

<a id='retrofitclient'></a>

```kotlin
package com.mobile.auth.data.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitClient {
    private const val BASE_URL = "http://192.168.200.160:8080/api/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(AuthInterceptor())
        .addInterceptor(loggingInterceptor)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()

    private val gson = GsonBuilder().setLenient().create()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    val apiService: ApiService by lazy { retrofit.create(ApiService::class.java) }
}
```

---

## auth\src\main\java\com\mobile\auth\data\repository

<a id='repository'></a>

## FILE 30: AuthRepository.kt

<a id='authrepository'></a>

```kotlin
package com.mobile.auth.data.repository

import com.mobile.auth.data.dto.model.GroupDto
import com.mobile.auth.data.dto.model.UserDto
import com.mobile.auth.data.dto.request.LoginRequest
import com.mobile.auth.data.dto.request.RegisterRequest
import com.mobile.auth.data.local.TokenManager
import com.mobile.auth.data.network.RetrofitClient
import java.io.IOException

class AuthRepository {
    private val apiService = RetrofitClient.apiService

    suspend fun loginUser(login: String, password: String): Result<UserDto> {
        return try {
            val loginResponse = apiService.login(LoginRequest(login, password))
            TokenManager.token = loginResponse.token

            val allUsers = apiService.getUsers()
            val currentUser = allUsers.find { it.login == login }
                ?: throw IOException("User not found in users list")

            TokenManager.userId = currentUser.id.toLong()
            Result.success(currentUser)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun registerUser(request: RegisterRequest): Result<Unit> {
        return try {
            val response = apiService.register(request)
            if (response.isSuccessful) Result.success(Unit)
            else Result.failure(IOException("Registration failed: ${response.code()}"))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getUsers(): Result<List<UserDto>> {
        return try {
            Result.success(apiService.getUsers())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getGroups(): Result<List<GroupDto>> {
        return try {
            Result.success(apiService.getGroups())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
```

---

## auth\src\main\java\com\mobile\auth\data\state

<a id='state'></a>

## FILE 31: LoginState.kt

<a id='loginstate'></a>

```kotlin
package com.mobile.auth.data.state

data class LoginState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val isSuccess: Boolean = false
)
```

---

## auth\src\main\java\com\mobile\auth\di

<a id='di'></a>

## FILE 32: AuthServiceLocator.kt

<a id='authservicelocator'></a>

```kotlin
package com.mobile.auth.di

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobile.auth.data.repository.AuthRepository
import com.mobile.auth.viewmodels.LoginViewModel
import com.mobile.auth.viewmodels.RegisterViewModel

class AuthServiceLocator {
    val authRepository: AuthRepository by lazy { AuthRepository() }

    val viewModelFactory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return when {
                modelClass.isAssignableFrom(LoginViewModel::class.java) -> LoginViewModel(authRepository) as T
                modelClass.isAssignableFrom(RegisterViewModel::class.java) -> RegisterViewModel(authRepository) as T
                else -> throw IllegalArgumentException("Unknown ViewModel class")
            }
        }
    }

    companion object {
        private lateinit var instance: AuthServiceLocator
        fun init() { instance = AuthServiceLocator() }
        fun getInstance(): AuthServiceLocator = instance
    }
}
```

---

## auth\src\main\java\com\mobile\auth\impl

<a id='impl'></a>

## FILE 33: AuthManagerImpl.kt

<a id='authmanagerimpl'></a>

```kotlin
package com.mobile.auth.impl

import com.mobile.auth.data.local.TokenManager
import com.mobile.domain.auth.AuthManager
import com.mobile.domain.auth.AuthState
import com.mobile.domain.auth.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class AuthManagerImpl : AuthManager {

    private val _authState = MutableStateFlow<AuthState>(
        if (TokenManager.token != null) AuthState.Loading else AuthState.LoggedOut
    )

    override fun getCurrentUser(): User? = null // Упрощённо

    override fun isLoggedIn(): Boolean = TokenManager.token != null

    override fun logout() {
        TokenManager.clearUserData()
        _authState.value = AuthState.LoggedOut
    }

    override fun observeAuthState(): Flow<AuthState> = _authState

    fun updateAuthState(state: AuthState) { _authState.value = state }

    fun setAuthenticated(userId: Long, login: String) {
        val user = User(id = userId, login = login, email = null, firstName = null, lastName = null)
        _authState.value = AuthState.Authenticated(user)
    }
}
```

---

## FILE 34: AuthNavigatorImpl.kt

<a id='authnavigatorimpl'></a>

```kotlin
package com.mobile.auth.impl

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.mobile.domain.auth.AuthNavigator

class AuthNavigatorImpl : AuthNavigator {
    override fun navigateToLogin(context: Context) {
        // Реализация навигации через Intent или навигационный граф
    }

    override fun navigateToRegister(context: Context) {
        // Реализация навигации
    }

    override fun openAuthFlow(activity: Activity, requestCode: Int) {
        // Запуск аутентификации как результата
    }
}
```

---

## auth\src\main\java\com\mobile\auth\ui\navigation

<a id='navigation'></a>

## FILE 35: AuthNavHost.kt

<a id='authnavhost'></a>

```kotlin
package com.mobile.auth.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mobile.auth.ui.navigation.screens.AuthScreen
import com.mobile.auth.ui.screens.LoginScreen
import com.mobile.auth.ui.screens.RegisterScreen

@Composable
fun AuthNavHost(
    navController: NavHostController,
    onAuthSuccess: () -> Unit,
    onNavigateToCalculations: (Long) -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = AuthScreen.Login.route
    ) {
        composable(AuthScreen.Login.route) {
            LoginScreen(
                onLoginSuccess = {
                    onAuthSuccess()
                    onNavigateToCalculations(0L) // userId передаётся из app
                },
                onNavigateToRegister = {
                    navController.navigate(AuthScreen.Register.route)
                }
            )
        }
        composable(AuthScreen.Register.route) {
            RegisterScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}
```

---

## auth\src\main\java\com\mobile\auth\ui\navigation\screens

<a id='screens'></a>

## FILE 36: AuthScreen.kt

<a id='authscreen'></a>

```kotlin
package com.mobile.auth.ui.navigation.screens

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen("login")
    object Register : AuthScreen("register")
}
```

---

## FILE 37: LoginScreen.kt

<a id='loginscreen'></a>

```kotlin
package com.mobile.auth.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mobile.auth.di.AuthServiceLocator
import com.mobile.auth.ui.theme.AppStyles
import com.mobile.auth.ui.theme.screenPadding
import com.mobile.auth.viewmodels.LoginViewModel

@Composable
fun LoginScreen(
    onLoginSuccess: () -> Unit,
    onNavigateToRegister: () -> Unit,
    viewModel: LoginViewModel = viewModel(factory = AuthServiceLocator.getInstance().viewModelFactory)
) {
    val state by viewModel.state.collectAsState()
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    LaunchedEffect(state.isSuccess) {
        if (state.isSuccess) {
            viewModel.resetSuccess()
            onLoginSuccess()
        }
    }

    Column(
        modifier = Modifier.fillMaxSize().screenPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Вход", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(32.dp))
        TextField(
            value = login, onValueChange = { login = it },
            label = { Text("Логин") }, modifier = Modifier.fillMaxWidth(), singleLine = true
        )
        Spacer(Modifier.height(AppStyles.FieldSpacing))
        TextField(
            value = password, onValueChange = { password = it },
            label = { Text("Пароль") }, visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(), singleLine = true
        )
        Spacer(Modifier.height(24.dp))
        Button(
            onClick = { viewModel.loginUser(login, password) },
            enabled = !state.isLoading && login.isNotEmpty() && password.isNotEmpty(),
            modifier = Modifier.fillMaxWidth()
        ) {
            if (state.isLoading) CircularProgressIndicator(modifier = Modifier.size(20.dp))
            else Text("Войти")
        }
        if (state.error != null) {
            Text(state.error!!, color = MaterialTheme.colorScheme.error, modifier = Modifier.padding(top = 8.dp))
        }
        Spacer(Modifier.height(8.dp))
        TextButton(onClick = onNavigateToRegister) { Text("Зарегистрироваться") }
    }
}
```

---

## FILE 38: RegisterScreen.kt

<a id='registerscreen'></a>

```kotlin
package com.mobile.auth.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mobile.auth.data.dto.model.GroupDto
import com.mobile.auth.di.AuthServiceLocator
import com.mobile.auth.ui.theme.AppStyles
import com.mobile.auth.ui.theme.screenPadding
import com.mobile.auth.viewmodels.RegisterViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(
    onNavigateBack: () -> Unit,
    viewModel: RegisterViewModel = viewModel(factory = AuthServiceLocator.getInstance().viewModelFactory)
) {
    val state by viewModel.state.collectAsState()

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var middleName by remember { mutableStateOf("") }
    var birthDate by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("MALE") }
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }

    var selectedGroup by remember { mutableStateOf<GroupDto?>(null) }
    var groupExpanded by remember { mutableStateOf(false) }

    LaunchedEffect(state.isSuccess) {
        if (state.isSuccess) onNavigateBack()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .screenPadding()
    ) {
        Text("Регистрация", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(24.dp))

        TextField(value = firstName, onValueChange = { firstName = it }, label = { Text("Имя") }, modifier = Modifier.fillMaxWidth(), singleLine = true)
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))
        TextField(value = lastName, onValueChange = { lastName = it }, label = { Text("Фамилия") }, modifier = Modifier.fillMaxWidth(), singleLine = true)
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))
        TextField(value = middleName, onValueChange = { middleName = it }, label = { Text("Отчество (опционально)") }, modifier = Modifier.fillMaxWidth(), singleLine = true)
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))
        TextField(value = birthDate, onValueChange = { birthDate = it }, label = { Text("Дата рождения (ГГГГ-ММ-ДД)") }, modifier = Modifier.fillMaxWidth(), singleLine = true)
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        Text("Пол", style = MaterialTheme.typography.labelLarge)
        Spacer(modifier = Modifier.height(4.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            FilterChip(selected = gender == "MALE", onClick = { gender = "MALE" }, label = { Text("Мужской") }, modifier = Modifier.weight(1f))
            FilterChip(selected = gender == "FEMALE", onClick = { gender = "FEMALE" }, label = { Text("Женский") }, modifier = Modifier.weight(1f))
        }
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        ExposedDropdownMenuBox(expanded = groupExpanded, onExpandedChange = { groupExpanded = it }) {
            TextField(value = selectedGroup?.name ?: "Выберите группу", onValueChange = {}, readOnly = true, trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = groupExpanded) }, modifier = Modifier.menuAnchor().fillMaxWidth())
            ExposedDropdownMenu(expanded = groupExpanded, onDismissRequest = { groupExpanded = false }) {
                state.groups.forEach { group ->
                    DropdownMenuItem(text = { Text(group.name) }, onClick = { selectedGroup = group; groupExpanded = false })
                }
            }
        }
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        TextField(value = login, onValueChange = { login = it }, label = { Text("Логин") }, modifier = Modifier.fillMaxWidth(), singleLine = true)
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))
        TextField(value = password, onValueChange = { password = it }, label = { Text("Пароль") }, visualTransformation = PasswordVisualTransformation(), modifier = Modifier.fillMaxWidth(), singleLine = true)
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))
        TextField(value = email, onValueChange = { email = it }, label = { Text("Email") }, modifier = Modifier.fillMaxWidth(), singleLine = true)
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))
        TextField(value = phone, onValueChange = { phone = it }, label = { Text("Телефон") }, modifier = Modifier.fillMaxWidth(), singleLine = true)
        Spacer(modifier = Modifier.height(AppStyles.FieldSpacing))

        if (state.error != null) {
            Text(text = state.error!!, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(bottom = 8.dp))
        }

        Button(
            onClick = {
                selectedGroup?.let { group ->
                    viewModel.registerUser(firstName, lastName, middleName.ifEmpty { " " }, birthDate, gender, group.id, login, password, email, phone)
                }
            },
            enabled = !state.isLoading && selectedGroup != null && login.isNotEmpty() && password.isNotEmpty(),
            modifier = Modifier.fillMaxWidth(),
            shape = AppStyles.ShapeMedium
        ) {
            if (state.isLoading) CircularProgressIndicator(modifier = Modifier.size(20.dp), color = MaterialTheme.colorScheme.onPrimary)
            else Text("Зарегистрироваться")
        }

        Spacer(modifier = Modifier.height(16.dp))
        TextButton(onClick = onNavigateBack, modifier = Modifier.align(Alignment.CenterHorizontally)) { Text("Назад к входу") }
    }
}
```

---

## auth\src\main\java\com\mobile\auth\ui\theme

<a id='theme'></a>

## FILE 39: Color.kt

<a id='color'></a>

```kotlin
package com.mobile.auth.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)
val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
```

---

## FILE 40: Theme.kt

<a id='theme'></a>

```kotlin
package com.mobile.auth.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

private val DarkColorScheme = darkColorScheme(primary = Purple80, secondary = PurpleGrey80, tertiary = Pink80)
private val LightColorScheme = lightColorScheme(primary = Purple40, secondary = PurpleGrey40, tertiary = Pink40)

object AppStyles {
    val ScreenPadding = PaddingValues(horizontal = 24.dp, vertical = 16.dp)
    val FieldSpacing = 12.dp
    val ShapeSmall = RoundedCornerShape(8.dp)
    val ShapeMedium = RoundedCornerShape(12.dp)
}

fun Modifier.screenPadding() = this.padding(AppStyles.ScreenPadding)
fun Modifier.fillMaxWidthWithPadding() = this.fillMaxWidth().padding(horizontal = 24.dp)

@Composable
fun AuthTheme(darkTheme: Boolean = isSystemInDarkTheme(), dynamicColor: Boolean = true, content: @Composable () -> Unit) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    MaterialTheme(colorScheme = colorScheme, typography = Typography, content = content)
}
```

---

## FILE 41: Type.kt

<a id='type'></a>

```kotlin
package com.mobile.auth.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val Typography = Typography(
    bodyLarge = TextStyle(fontFamily = FontFamily.Default, fontWeight = FontWeight.Normal, fontSize = 16.sp, lineHeight = 24.sp, letterSpacing = 0.5.sp)
)
```

---

## auth\src\main\java\com\mobile\auth\viewmodels

<a id='viewmodels'></a>

## FILE 42: LoginViewModel.kt

<a id='loginviewmodel'></a>

```kotlin
package com.mobile.auth.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.auth.data.repository.AuthRepository
import com.mobile.auth.data.state.LoginState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LoginViewModel(private val authRepository: AuthRepository) : ViewModel() {
    private val _state = MutableStateFlow(LoginState())
    val state: StateFlow<LoginState> = _state

    fun loginUser(login: String, password: String) {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true, error = null)
            authRepository.loginUser(login, password)
                .onSuccess { user ->
                    _state.value = _state.value.copy(isLoading = false, isSuccess = true)
                }
                .onFailure { error ->
                    _state.value = _state.value.copy(isLoading = false, error = error.localizedMessage)
                }
        }
    }

    fun resetSuccess() {
        _state.value = _state.value.copy(isSuccess = false)
    }
}
```

---

## FILE 43: RegisterViewModel.kt

<a id='registerviewmodel'></a>

```kotlin
package com.mobile.auth.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.auth.data.dto.model.PersonDto
import com.mobile.auth.data.dto.request.RegisterRequest
import com.mobile.auth.data.repository.AuthRepository
import com.mobile.auth.data.state.RegisterState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class RegisterViewModel(private val authRepository: AuthRepository) : ViewModel() {
    private val _state = MutableStateFlow(RegisterState())
    val state: StateFlow<RegisterState> = _state

    init { loadGroups() }

    private fun loadGroups() {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true)
            authRepository.getGroups()
                .onSuccess { groups -> _state.value = _state.value.copy(isLoading = false, groups = groups) }
                .onFailure { error -> _state.value = _state.value.copy(isLoading = false, error = error.localizedMessage) }
        }
    }

    fun registerUser(firstName: String, lastName: String, middleName: String, birthDate: String, gender: String, groupId: Int, login: String, password: String, email: String, phoneNumber: String) {
        viewModelScope.launch {
            _state.value = _state.value.copy(isLoading = true, error = null)
            val person = PersonDto(firstName, lastName, middleName, birthDate, gender, groupId)
            val request = RegisterRequest(login, password, email, phoneNumber, 1, true, person)
            authRepository.registerUser(request)
                .onSuccess { _state.value = _state.value.copy(isLoading = false, isSuccess = true) }
                .onFailure { error -> _state.value = _state.value.copy(isLoading = false, error = error.localizedMessage) }
        }
    }

    fun resetSuccess() { _state.value = _state.value.copy(isSuccess = false) }
}
```

---

## auth\src\main\res\drawable

<a id='drawable'></a>

## FILE 44: ic_launcher_background.xml

<a id='iclauncherbackground'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path
        android:fillColor="#3DDC84"
        android:pathData="M0,0h108v108h-108z" />
    <path
        android:fillColor="#00000000"
        android:pathData="M9,0L9,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,0L19,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M29,0L29,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M39,0L39,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M49,0L49,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M59,0L59,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M69,0L69,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M79,0L79,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M89,0L89,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M99,0L99,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,9L108,9"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,19L108,19"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,29L108,29"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,39L108,39"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,49L108,49"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,59L108,59"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,69L108,69"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,79L108,79"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,89L108,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,99L108,99"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,29L89,29"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,39L89,39"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,49L89,49"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,59L89,59"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,69L89,69"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,79L89,79"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M29,19L29,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M39,19L39,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M49,19L49,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M59,19L59,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M69,19L69,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M79,19L79,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
</vector>

```

---

## FILE 45: ic_launcher_foreground.xml

<a id='iclauncherforeground'></a>

```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:aapt="http://schemas.android.com/aapt"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path android:pathData="M31,63.928c0,0 6.4,-11 12.1,-13.1c7.2,-2.6 26,-1.4 26,-1.4l38.1,38.1L107,108.928l-32,-1L31,63.928z">
        <aapt:attr name="android:fillColor">
            <gradient
                android:endX="85.84757"
                android:endY="92.4963"
                android:startX="42.9492"
                android:startY="49.59793"
                android:type="linear">
                <item
                    android:color="#44000000"
                    android:offset="0.0" />
                <item
                    android:color="#00000000"
                    android:offset="1.0" />
            </gradient>
        </aapt:attr>
    </path>
    <path
        android:fillColor="#FFFFFF"
        android:fillType="nonZero"
        android:pathData="M65.3,45.828l3.8,-6.6c0.2,-0.4 0.1,-0.9 -0.3,-1.1c-0.4,-0.2 -0.9,-0.1 -1.1,0.3l-3.9,6.7c-6.3,-2.8 -13.4,-2.8 -19.7,0l-3.9,-6.7c-0.2,-0.4 -0.7,-0.5 -1.1,-0.3C38.8,38.328 38.7,38.828 38.9,39.228l3.8,6.6C36.2,49.428 31.7,56.028 31,63.928h46C76.3,56.028 71.8,49.428 65.3,45.828zM43.4,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2c-0.3,-0.7 -0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C45.3,56.528 44.5,57.328 43.4,57.328L43.4,57.328zM64.6,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2s-0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C66.5,56.528 65.6,57.328 64.6,57.328L64.6,57.328z"
        android:strokeWidth="1"
        android:strokeColor="#00000000" />
</vector>
```

---

## auth\src\main\res\mipmap-anydpi-v26

<a id='mipmapanydpiv26'></a>

## FILE 46: ic_launcher_round.xml

<a id='iclauncherround'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background" />
    <foreground android:drawable="@drawable/ic_launcher_foreground" />
    <monochrome android:drawable="@drawable/ic_launcher_foreground" />
</adaptive-icon>
```

---

## FILE 47: ic_launcher.xml

<a id='iclauncher'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background" />
    <foreground android:drawable="@drawable/ic_launcher_foreground" />
    <monochrome android:drawable="@drawable/ic_launcher_foreground" />
</adaptive-icon>
```

---

## auth\src\main\res\values

<a id='values'></a>

## FILE 48: colors.xml

<a id='colors'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
</resources>
```

---

## FILE 49: strings.xml

<a id='strings'></a>

```xml
<resources>
    <string name="app_name">Auth</string>
</resources>
```

---

## FILE 50: themes.xml

<a id='themes'></a>

```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.Practice" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_500</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/white</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_700</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
```

---

## auth\src\main\res\values-night

<a id='valuesnight'></a>

## FILE 51: themes.xml

<a id='themes'></a>

```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.Practice" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_200</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/black</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_200</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
```

---

## auth\src\test\java\com\mobile\auth

<a id='auth'></a>

## FILE 52: ExampleUnitTest.kt

<a id='exampleunittest'></a>

```kotlin
package com.mobile.auth

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
```

---

## calculations\src\androidTest\java\com\mobile\calculations

<a id='calculations'></a>

## FILE 53: ExampleInstrumentedTest.kt

<a id='exampleinstrumentedtest'></a>

```kotlin
package com.mobile.calculations

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.mobile.calculation", appContext.packageName)
    }
}
```

---

## calculations\src\main

<a id='main'></a>

## FILE 54: AndroidManifest.xml

<a id='androidmanifest'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Practice" />

</manifest>
```

---

## calculations\src\main\java\com\mobile\calculations\data

<a id='data'></a>

## FILE 55: CalculationsDatabase.kt

<a id='calculationsdatabase'></a>

```kotlin
package com.mobile.calculations.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DepositCalculation::class], version = 1, exportSchema = false)
abstract class CalculationsDatabase : RoomDatabase() {
    abstract fun depositDao(): DepositDao

    companion object {
        @Volatile private var INSTANCE: CalculationsDatabase? = null

        fun getDatabase(context: Context): CalculationsDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CalculationsDatabase::class.java,
                    "deposits_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
```

---

## FILE 56: DepositCalculation.kt

<a id='depositcalculation'></a>

```kotlin
package com.mobile.calculations.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.vo.PrimaryKey

@Entity(tableName = "deposit_calculations")
data class DepositCalculation(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userId: Long,
    val initialAmount: Double,
    val periodMonths: Int,
    val interestRate: Double,
    val monthlyTopUp: Double?,
    val finalAmount: Double,
    val interestEarned: Double,
    val calculationDate: Long
)
```

---

## FILE 57: DepositDao.kt

<a id='depositdao'></a>

```kotlin
package com.mobile.calculations.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DepositDao {
    @Query("SELECT * FROM deposit_calculations WHERE userId = :userId ORDER BY calculationDate DESC")
    fun getCalculationsForUser(userId: Long): Flow<List<DepositCalculation>>

    @Insert
    suspend fun insertCalculation(calculation: DepositCalculation)

    @Query("SELECT * FROM deposit_calculations WHERE id = :id AND userId = :userId")
    suspend fun getCalculationByIdAndUser(id: Long, userId: Long): DepositCalculation?

    @Query("DELETE FROM deposit_calculations WHERE id = :id AND userId = :userId")
    suspend fun deleteCalculationById(id: Long, userId: Long)
}
```

---

## calculations\src\main\java\com\mobile\calculations\data\repository

<a id='repository'></a>

## FILE 58: DepositRepository.kt

<a id='depositrepository'></a>

```kotlin
package com.mobile.calculations.data.repository

import com.mobile.calculations.data.DepositCalculation
import com.mobile.calculations.data.DepositDao
import kotlinx.coroutines.flow.Flow

class DepositRepository(private val depositDao: DepositDao) {
    fun getCalculationsForUser(userId: Long): Flow<List<DepositCalculation>> =
        depositDao.getCalculationsForUser(userId)

    suspend fun insertCalculation(calculation: DepositCalculation) =
        depositDao.insertCalculation(calculation)

    suspend fun getCalculationByIdAndUser(id: Long, userId: Long) =
        depositDao.getCalculationByIdAndUser(id, userId)

    suspend fun deleteCalculationById(id: Long, userId: Long) =
        depositDao.deleteCalculationById(id, userId)
}
```

---

## calculations\src\main\java\com\mobile\calculations\data\state

<a id='state'></a>

## FILE 59: CalculationState.kt

<a id='calculationstate'></a>

```kotlin
package com.mobile.calculations.data.state

data class CalculationState(
    val entryFee: String = "",
    val depositTerm: String = "",
    val interestRate: Double = 0.0,
    val monthlyTopUp: String = "",
    val finalAmount: Double = 0.0,
    val interestEarned: Double = 0.0
)
```

---

## calculations\src\main\java\com\mobile\calculations\di

<a id='di'></a>

## FILE 60: CalculationsServiceLocator.kt

<a id='calculationsservicelocator'></a>

```kotlin
package com.mobile.calculations.di

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobile.calculations.data.CalculationsDatabase
import com.mobile.calculations.data.repository.DepositRepository
import com.mobile.calculations.viewmodels.DepositCalculationViewModel
import com.mobile.calculations.viewmodels.HistoryViewModel

class CalculationsServiceLocator(private val context: Context) {
    val database: CalculationsDatabase by lazy { CalculationsDatabase.getDatabase(context) }
    val depositRepository: DepositRepository by lazy { DepositRepository(database.depositDao()) }

    fun getDepositCalculationViewModel(): DepositCalculationViewModel = DepositCalculationViewModel(depositRepository)
    fun getHistoryViewModel(userId: Long): HistoryViewModel = HistoryViewModel(depositRepository, userId)

    companion object {
        private lateinit var instance: CalculationsServiceLocator
        fun init(context: Context) { instance = CalculationsServiceLocator(context) }
        fun getInstance(): CalculationsServiceLocator = instance
    }
}
```

---

## calculations\src\main\java\com\mobile\calculations\impl

<a id='impl'></a>

## FILE 61: CalculationsNavigatorImpl.kt

<a id='calculationsnavigatorimpl'></a>

```kotlin
package com.mobile.calculations.impl

import android.app.Activity
import android.content.Context
import com.mobile.domain.calculations.CalculationsNavigator

class CalculationsNavigatorImpl : CalculationsNavigator {
    override fun navigateToNewCalculation(context: Context, userId: Long) { /* Реализация */ }
    override fun navigateToMyCalculations(context: Context, userId: Long) { /* Реализация */ }
    override fun openCalculationFlow(activity: Activity, userId: Long) { /* Реализация */ }
}
```

---

## FILE 62: CalculationsProviderImpl.kt

<a id='calculationsproviderimpl'></a>

```kotlin
package com.mobile.calculations.impl

import com.mobile.calculations.data.repository.DepositRepository
import com.mobile.domain.calculations.CalculationResult
import com.mobile.domain.calculations.CalculationsProvider
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class CalculationsProviderImpl(private val repository: DepositRepository) : CalculationsProvider {
    override fun getCalculationsForUser(userId: Long): Flow<List<CalculationResult>> =
        repository.getCalculationsForUser(userId).map { it.map { calc -> calc.toDomain() } }

    override suspend fun saveCalculation(calculation: CalculationResult): Boolean {
        val entity = com.mobile.calculations.data.DepositCalculation(
            id = calculation.id, userId = calculation.userId, initialAmount = calculation.initialAmount,
            periodMonths = calculation.periodMonths, interestRate = calculation.interestRate,
            monthlyTopUp = calculation.monthlyTopUp, finalAmount = calculation.finalAmount,
            interestEarned = calculation.interestEarned, calculationDate = calculation.calculationDate
        )
        repository.insertCalculation(entity)
        return true
    }

    override suspend fun deleteCalculation(calculationId: Long, userId: Long) =
        repository.deleteCalculationById(calculationId, userId)
}

private fun com.mobile.calculations.data.DepositCalculation.toDomain(): CalculationResult =
    CalculationResult(id, userId, initialAmount, periodMonths, interestRate, monthlyTopUp, finalAmount, interestEarned, calculationDate)
```

---

## calculations\src\main\java\com\mobile\calculations\ui\navigation

<a id='navigation'></a>

## FILE 63: CalculationsNavHost.kt

<a id='calculationsnavhost'></a>

```kotlin
package com.mobile.calculations.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mobile.calculations.ui.screens.DepositScreenOne
import com.mobile.calculations.ui.screens.DepositScreenTwo
import com.mobile.calculations.ui.screens.MyCalculationsScreen
import com.mobile.calculations.ui.screens.ResultScreen
import com.mobile.calculations.viewmodels.DepositCalculationViewModel

@Composable
fun CalculationsNavHost(
    navController: NavHostController,
    userId: Long,
    onLogout: () -> Unit,
    calcViewModel: DepositCalculationViewModel
) {
    NavHost(
        navController = navController,
        startDestination = CalculationsScreen.MyCalculations.route
    ) {
        composable(CalculationsScreen.MyCalculations.route) {
            MyCalculationsScreen(onLogout = onLogout, userId = userId)
        }
        navigation(
            startDestination = CalculationsScreen.DepositScreenOne.route,
            route = CalculationsScreen.NewCalculationGraph.route
        ) {
            composable(CalculationsScreen.DepositScreenOne.route) {
                DepositScreenOne(navController = navController, calcViewModel = calcViewModel)
            }
            composable(CalculationsScreen.DepositScreenTwo.route) {
                DepositScreenTwo(navController = navController, calcViewModel = calcViewModel)
            }
            composable(CalculationsScreen.Result.route) {
                ResultScreen(navController = navController, viewModel = calcViewModel, userId = userId)
            }
        }
    }
}
```

---

## calculations\src\main\java\com\mobile\calculations\ui\navigation\screens

<a id='screens'></a>

## FILE 64: CalculationsScreen.kt

<a id='calculationsscreen'></a>

```kotlin
sealed class CalculationsScreen(val route: String) {
    object MyCalculations : CalculationsScreen("my_calculations")
    object NewCalculationGraph : CalculationsScreen("new_calc_graph")
    object DepositScreenOne : CalculationsScreen("deposit_one")
    object DepositScreenTwo : CalculationsScreen("deposit_two")
    object Result : CalculationsScreen("result")
}
```

---

## FILE 65: DepositScreenOne.kt

<a id='depositscreenone'></a>

```kotlin
package com.mobile.calculations.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mobile.calculations.ui.navigation.CalculationsScreen
import com.mobile.calculations.ui.theme.AppStyles
import com.mobile.calculations.viewmodels.DepositCalculationViewModel

@Composable
fun DepositScreenOne(navController: NavController, calcViewModel: DepositCalculationViewModel) {
    var entryFee by remember { mutableStateOf(calcViewModel.state.entryFee) }
    var depositTerm by remember { mutableStateOf(calcViewModel.state.depositTerm) }
    var errorMessage by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("Параметры вклада", style = MaterialTheme.typography.headlineSmall)
        TextField(value = entryFee, onValueChange = { entryFee = it; errorMessage = "" }, label = { Text("Стартовый взнос") }, modifier = Modifier.fillMaxWidth(), isError = errorMessage.isNotEmpty())
        TextField(value = depositTerm, onValueChange = { depositTerm = it; errorMessage = "" }, label = { Text("Срок вклада (месяцы)") }, modifier = Modifier.fillMaxWidth(), isError = errorMessage.isNotEmpty())
        if (errorMessage.isNotEmpty()) Text(errorMessage, color = MaterialTheme.colorScheme.error)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(onClick = { navController.popBackStack() }, modifier = Modifier.weight(1f)) { Text("Назад") }
            Button(
                onClick = {
                    when {
                        entryFee.isEmpty() || depositTerm.isEmpty() -> errorMessage = "Заполните все поля"
                        entryFee.toDoubleOrNull() == null || entryFee.toDouble() <= 0 -> errorMessage = "Некорректная сумма"
                        depositTerm.toIntOrNull() == null || depositTerm.toInt() <= 0 -> errorMessage = "Некорректный срок"
                        else -> {
                            calcViewModel.updateInitialParams(entryFee, depositTerm)
                            navController.navigate(CalculationsScreen.DepositScreenTwo.route)
                        }
                    }
                }, modifier = Modifier.weight(1f)
            ) { Text("Далее") }
        }
    }
}
```

---

## FILE 66: DepositScreenTwo.kt

<a id='depositscreentwo'></a>

```kotlin
package com.mobile.calculations.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mobile.calculations.ui.navigation.CalculationsScreen
import com.mobile.calculations.viewmodels.DepositCalculationViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DepositScreenTwo(navController: NavController, calcViewModel: DepositCalculationViewModel) {
    val state = calcViewModel.state
    var monthlyTopUp by remember { mutableStateOf(state.monthlyTopUp) }
    var errorMessage by remember { mutableStateOf("") }
    val availableRate = calcViewModel.getAvailableRate()

    Column(modifier = Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("Дополнительные параметры", style = MaterialTheme.typography.headlineSmall)
        Text(text = "Процентная ставка: ${String.format("%.1f", availableRate)}%")
        TextField(value = monthlyTopUp, onValueChange = { monthlyTopUp = it }, label = { Text("Ежемесячное пополнение (необязательно)") }, modifier = Modifier.fillMaxWidth())
        if (errorMessage.isNotEmpty()) Text(errorMessage, color = MaterialTheme.colorScheme.error)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(onClick = { navController.popBackStack() }, modifier = Modifier.weight(1f)) { Text("Назад") }
            Button(
                onClick = {
                    val months = state.depositTerm.toIntOrNull()
                    if (months == null || months <= 0) errorMessage = "Срок вклада некорректен"
                    else {
                        calcViewModel.setRateAndTopUp(availableRate, monthlyTopUp)
                        calcViewModel.calculate()
                        navController.navigate(CalculationsScreen.Result.route)
                    }
                }, modifier = Modifier.weight(1f)
            ) { Text("Рассчитать") }
        }
    }
}
```

---

## FILE 67: MyCalculationsScreen.kt

<a id='mycalculationsscreen'></a>

```kotlin
package com.mobile.calculations.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mobile.calculations.di.CalculationsServiceLocator
import com.mobile.calculations.viewmodels.HistoryViewModel
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCalculationsScreen(onLogout: () -> Unit, userId: Long, viewModel: HistoryViewModel = CalculationsServiceLocator.getInstance().getHistoryViewModel(userId)) {
    val calculations by viewModel.calculations.collectAsState(initial = emptyList())
    var filterText by remember { mutableStateOf("") }
    val filtered = calculations.filter {
        it.initialAmount.toString().contains(filterText) || it.finalAmount.toString().contains(filterText) || it.interestRate.toString().contains(filterText)
    }

    Column {
        TopAppBar(title = { Text("Мои расчёты") }, actions = { TextButton(onClick = onLogout) { Text("Выйти") } })
        TextField(value = filterText, onValueChange = { filterText = it }, label = { Text("Фильтр (сумма, проценты)") }, modifier = Modifier.fillMaxWidth().padding(8.dp))
        LazyColumn {
            items(filtered) { calc ->
                Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                    Row(modifier = Modifier.fillMaxWidth().padding(12.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                        Column {
                            Text("Старт: ${calc.initialAmount}", style = MaterialTheme.typography.bodyMedium)
                            Text("Итог: ${calc.finalAmount}", style = MaterialTheme.typography.bodyMedium)
                            Text(SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(calc.calculationDate))
                        }
                        IconButton(onClick = { viewModel.deleteCalculation(calc.id) }) { Icon(Icons.Default.Delete, contentDescription = "Удалить") }
                    }
                }
            }
        }
    }
}
```

---

## FILE 68: ResultScreen.kt

<a id='resultscreen'></a>

```kotlin
package com.mobile.calculations.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mobile.calculations.ui.navigation.CalculationsScreen
import com.mobile.calculations.viewmodels.DepositCalculationViewModel
import kotlinx.coroutines.launch

@Composable
fun ResultScreen(navController: NavController, viewModel: DepositCalculationViewModel, userId: Long) {
    val state = viewModel.state
    val scope = rememberCoroutineScope()
    var saveError by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("Результат расчета", style = MaterialTheme.typography.headlineSmall)
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                ResultItem("Стартовый взнос", state.entryFee)
                ResultItem("Срок (мес)", state.depositTerm)
                ResultItem("Ставка", "${state.interestRate}%")
                if (state.monthlyTopUp.isNotEmpty()) ResultItem("Пополнение", state.monthlyTopUp)
                ResultItem("Итоговая сумма", "%.2f".format(state.finalAmount))
                ResultItem("Начислено", "%.2f".format(state.interestEarned))
            }
        }
        if (saveError) Text("Ошибка сохранения. Авторизуйтесь заново.", color = MaterialTheme.colorScheme.error)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(onClick = {
                scope.launch {
                    if (viewModel.saveCalculation(userId)) {
                        viewModel.reset()
                        navController.popBackStack(CalculationsScreen.NewCalculationGraph.route, inclusive = true)
                        navController.navigate(CalculationsScreen.MyCalculations.route)
                    } else saveError = true
                }
            }, modifier = Modifier.weight(1f)) { Text("Сохранить") }
            Button(onClick = { viewModel.reset(); navController.popBackStack() }, modifier = Modifier.weight(1f)) { Text("Назад") }
        }
    }
}

@Composable
fun ResultItem(label: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(label, style = MaterialTheme.typography.bodyMedium)
        Text(value, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.primary)
    }
}
```

---

## calculations\src\main\java\com\mobile\calculations\ui\theme

<a id='theme'></a>

## FILE 69: Theme.kt

<a id='theme'></a>

```kotlin
package com.mobile.calculations.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.mobile.auth.ui.theme.Pink40
import com.mobile.auth.ui.theme.Pink80
import com.mobile.auth.ui.theme.Purple40
import com.mobile.auth.ui.theme.Purple80
import com.mobile.auth.ui.theme.PurpleGrey40
import com.mobile.auth.ui.theme.PurpleGrey80

private val DarkColorScheme = darkColorScheme(primary = Purple80, secondary = PurpleGrey80, tertiary = Pink80)
private val LightColorScheme = lightColorScheme(primary = Purple40, secondary = PurpleGrey40, tertiary = Pink40)

object AppStyles {
    val ScreenPadding = PaddingValues(horizontal = 24.dp, vertical = 16.dp)
    val FieldSpacing = 12.dp
    val ShapeSmall = RoundedCornerShape(8.dp)
    val ShapeMedium = RoundedCornerShape(12.dp)
}

fun Modifier.screenPadding() = this.padding(AppStyles.ScreenPadding)
fun Modifier.fillMaxWidthWithPadding() = this.fillMaxWidth().padding(horizontal = 24.dp)

@Composable
fun CalculationsTheme(darkTheme: Boolean = isSystemInDarkTheme(), dynamicColor: Boolean = true, content: @Composable () -> Unit) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    MaterialTheme(colorScheme = colorScheme, typography = com.mobile.auth.ui.theme.Typography, content = content)
}
```

---

## calculations\src\main\java\com\mobile\calculations\viewmodels

<a id='viewmodels'></a>

## FILE 70: DepositCalculationViewModel.kt

<a id='depositcalculationviewmodel'></a>

```kotlin
package com.mobile.calculations.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.calculations.data.DepositCalculation
import com.mobile.calculations.data.repository.DepositRepository
import com.mobile.calculations.data.state.CalculationState
import kotlinx.coroutines.launch

class DepositCalculationViewModel(private val repository: DepositRepository) : ViewModel() {
    var state: CalculationState = CalculationState()
        private set

    fun updateInitialParams(fee: String, term: String) { state = state.copy(entryFee = fee, depositTerm = term) }
    fun setRateAndTopUp(rate: Double, topUp: String) { state = state.copy(interestRate = rate, monthlyTopUp = topUp) }

    fun calculate() {
        val initial = state.entryFee.toDoubleOrNull() ?: return
        val months = state.depositTerm.toIntOrNull() ?: return
        if (initial <= 0 || months <= 0) return
        val monthlyRate = state.interestRate / 100 / 12
        var current = initial
        var totalInterest = 0.0
        repeat(months) {
            val interest = current * monthlyRate
            totalInterest += interest
            current += interest
            state.monthlyTopUp.toDoubleOrNull()?.let { current += it }
        }
        state = state.copy(finalAmount = current, interestEarned = totalInterest)
    }

    fun getAvailableRate(): Double {
        val months = state.depositTerm.toIntOrNull() ?: 0
        return when { months < 6 -> 15.0; months < 12 -> 10.0; else -> 5.0 }
    }

    suspend fun saveCalculation(userId: Long): Boolean {
        val calculation = DepositCalculation(
            userId = userId, initialAmount = state.entryFee.toDoubleOrNull() ?: 0.0,
            periodMonths = state.depositTerm.toIntOrNull() ?: 0, interestRate = state.interestRate,
            monthlyTopUp = state.monthlyTopUp.toDoubleOrNull(), finalAmount = state.finalAmount,
            interestEarned = state.interestEarned, calculationDate = System.currentTimeMillis()
        )
        repository.insertCalculation(calculation)
        return true
    }

    fun reset() { state = CalculationState() }
}
```

---

## FILE 71: HistoryViewModel.kt

<a id='historyviewmodel'></a>

```kotlin
package com.mobile.calculations.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.calculations.data.DepositCalculation
import com.mobile.calculations.data.repository.DepositRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class HistoryViewModel(private val repository: DepositRepository, private val userId: Long) : ViewModel() {
    val calculations: Flow<List<DepositCalculation>> = repository.getCalculationsForUser(userId)
    fun deleteCalculation(id: Long) { viewModelScope.launch { repository.deleteCalculationById(id, userId) } }
    suspend fun getCalculationById(id: Long): DepositCalculation? = repository.getCalculationByIdAndUser(id, userId)
}
```

---

## calculations\src\main\res\drawable

<a id='drawable'></a>

## FILE 72: ic_launcher_background.xml

<a id='iclauncherbackground'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path
        android:fillColor="#3DDC84"
        android:pathData="M0,0h108v108h-108z" />
    <path
        android:fillColor="#00000000"
        android:pathData="M9,0L9,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,0L19,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M29,0L29,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M39,0L39,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M49,0L49,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M59,0L59,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M69,0L69,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M79,0L79,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M89,0L89,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M99,0L99,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,9L108,9"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,19L108,19"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,29L108,29"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,39L108,39"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,49L108,49"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,59L108,59"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,69L108,69"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,79L108,79"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,89L108,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,99L108,99"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,29L89,29"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,39L89,39"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,49L89,49"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,59L89,59"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,69L89,69"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,79L89,79"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M29,19L29,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M39,19L39,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M49,19L49,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M59,19L59,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M69,19L69,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M79,19L79,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
</vector>

```

---

## FILE 73: ic_launcher_foreground.xml

<a id='iclauncherforeground'></a>

```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:aapt="http://schemas.android.com/aapt"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path android:pathData="M31,63.928c0,0 6.4,-11 12.1,-13.1c7.2,-2.6 26,-1.4 26,-1.4l38.1,38.1L107,108.928l-32,-1L31,63.928z">
        <aapt:attr name="android:fillColor">
            <gradient
                android:endX="85.84757"
                android:endY="92.4963"
                android:startX="42.9492"
                android:startY="49.59793"
                android:type="linear">
                <item
                    android:color="#44000000"
                    android:offset="0.0" />
                <item
                    android:color="#00000000"
                    android:offset="1.0" />
            </gradient>
        </aapt:attr>
    </path>
    <path
        android:fillColor="#FFFFFF"
        android:fillType="nonZero"
        android:pathData="M65.3,45.828l3.8,-6.6c0.2,-0.4 0.1,-0.9 -0.3,-1.1c-0.4,-0.2 -0.9,-0.1 -1.1,0.3l-3.9,6.7c-6.3,-2.8 -13.4,-2.8 -19.7,0l-3.9,-6.7c-0.2,-0.4 -0.7,-0.5 -1.1,-0.3C38.8,38.328 38.7,38.828 38.9,39.228l3.8,6.6C36.2,49.428 31.7,56.028 31,63.928h46C76.3,56.028 71.8,49.428 65.3,45.828zM43.4,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2c-0.3,-0.7 -0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C45.3,56.528 44.5,57.328 43.4,57.328L43.4,57.328zM64.6,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2s-0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C66.5,56.528 65.6,57.328 64.6,57.328L64.6,57.328z"
        android:strokeWidth="1"
        android:strokeColor="#00000000" />
</vector>
```

---

## calculations\src\main\res\mipmap-anydpi-v26

<a id='mipmapanydpiv26'></a>

## FILE 74: ic_launcher_round.xml

<a id='iclauncherround'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background" />
    <foreground android:drawable="@drawable/ic_launcher_foreground" />
    <monochrome android:drawable="@drawable/ic_launcher_foreground" />
</adaptive-icon>
```

---

## FILE 75: ic_launcher.xml

<a id='iclauncher'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background" />
    <foreground android:drawable="@drawable/ic_launcher_foreground" />
    <monochrome android:drawable="@drawable/ic_launcher_foreground" />
</adaptive-icon>
```

---

## calculations\src\main\res\values

<a id='values'></a>

## FILE 76: colors.xml

<a id='colors'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
</resources>
```

---

## FILE 77: strings.xml

<a id='strings'></a>

```xml
<resources>
    <string name="app_name">Calculation</string>
</resources>
```

---

## FILE 78: themes.xml

<a id='themes'></a>

```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.Practice" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_500</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/white</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_700</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
```

---

## calculations\src\main\res\values-night

<a id='valuesnight'></a>

## FILE 79: themes.xml

<a id='themes'></a>

```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.Practice" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_200</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/black</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_200</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
```

---

## calculations\src\test\java\com\mobile\calculations

<a id='calculations'></a>

## FILE 80: ExampleUnitTest.kt

<a id='exampleunittest'></a>

```kotlin
package com.mobile.calculations

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
```

---

## domain\src\androidTest\java\com\mobile\domain

<a id='domain'></a>

## FILE 81: ExampleInstrumentedTest.kt

<a id='exampleinstrumentedtest'></a>

```kotlin
package com.mobile.domain

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.mobile.domain", appContext.packageName)
    }
}
```

---

## domain\src\main

<a id='main'></a>

## FILE 82: AndroidManifest.xml

<a id='androidmanifest'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Practice" />

</manifest>
```

---

## domain\src\main\java\com\mobile\domain\auth

<a id='auth'></a>

## FILE 83: AuthManager.kt

<a id='authmanager'></a>

```kotlin
package com.mobile.domain.auth

import kotlinx.coroutines.flow.Flow

interface AuthManager {
    fun getCurrentUser(): User?
    fun isLoggedIn(): Boolean
    fun logout()
    fun observeAuthState(): Flow<AuthState>
}
```

---

## FILE 84: AuthNavigator.kt

<a id='authnavigator'></a>

```kotlin
package com.mobile.domain.auth

import android.app.Activity
import android.content.Context

interface AuthNavigator {
    fun navigateToLogin(context: Context)
    fun navigateToRegister(context: Context)
    fun openAuthFlow(activity: Activity, requestCode: Int)
}
```

---

## FILE 85: AuthState.kt

<a id='authstate'></a>

```kotlin
package com.mobile.domain.auth

sealed class AuthState {
    object Idle : AuthState()
    object Loading : AuthState()
    data class Authenticated(val user: User) : AuthState()
    data class Error(val message: String) : AuthState()
    object LoggedOut : AuthState()
}
```

---

## FILE 86: User.kt

<a id='user'></a>

```kotlin
package com.mobile.domain.auth

data class User(
    val id: Long,
    val login: String,
    val email: String?,
    val firstName: String?,
    val lastName: String?
)
```

---

## domain\src\main\java\com\mobile\domain\calculations

<a id='calculations'></a>

## FILE 87: CalculationResult.kt

<a id='calculationresult'></a>

```kotlin
package com.mobile.domain.calculations

data class CalculationResult(
    val id: Long = 0,
    val userId: Long,
    val initialAmount: Double,
    val periodMonths: Int,
    val interestRate: Double,
    val monthlyTopUp: Double?,
    val finalAmount: Double,
    val interestEarned: Double,
    val calculationDate: Long
)

```

---

## FILE 88: CalculationsNavigator.kt

<a id='calculationsnavigator'></a>

```kotlin
package com.mobile.domain.calculations

import android.app.Activity
import android.content.Context

interface CalculationsNavigator {
    fun navigateToNewCalculation(context: Context, userId: Long)
    fun navigateToMyCalculations(context: Context, userId: Long)
    fun openCalculationFlow(activity: Activity, userId: Long)
}
```

---

## FILE 89: CalculationsProvider.kt

<a id='calculationsprovider'></a>

```kotlin
package com.mobile.domain.calculations

import kotlinx.coroutines.flow.Flow

interface CalculationsProvider {
    fun getCalculationsForUser(userId: Long): Flow<List<CalculationResult>>
    suspend fun saveCalculation(calculation: CalculationResult): Boolean
    suspend fun deleteCalculation(calculationId: Long, userId: Long)
}
```

---

## domain\src\main\res\drawable

<a id='drawable'></a>

## FILE 90: ic_launcher_background.xml

<a id='iclauncherbackground'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path
        android:fillColor="#3DDC84"
        android:pathData="M0,0h108v108h-108z" />
    <path
        android:fillColor="#00000000"
        android:pathData="M9,0L9,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,0L19,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M29,0L29,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M39,0L39,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M49,0L49,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M59,0L59,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M69,0L69,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M79,0L79,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M89,0L89,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M99,0L99,108"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,9L108,9"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,19L108,19"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,29L108,29"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,39L108,39"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,49L108,49"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,59L108,59"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,69L108,69"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,79L108,79"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,89L108,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M0,99L108,99"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,29L89,29"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,39L89,39"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,49L89,49"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,59L89,59"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,69L89,69"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M19,79L89,79"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M29,19L29,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M39,19L39,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M49,19L49,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M59,19L59,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M69,19L69,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
    <path
        android:fillColor="#00000000"
        android:pathData="M79,19L79,89"
        android:strokeWidth="0.8"
        android:strokeColor="#33FFFFFF" />
</vector>

```

---

## FILE 91: ic_launcher_foreground.xml

<a id='iclauncherforeground'></a>

```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:aapt="http://schemas.android.com/aapt"
    android:width="108dp"
    android:height="108dp"
    android:viewportWidth="108"
    android:viewportHeight="108">
    <path android:pathData="M31,63.928c0,0 6.4,-11 12.1,-13.1c7.2,-2.6 26,-1.4 26,-1.4l38.1,38.1L107,108.928l-32,-1L31,63.928z">
        <aapt:attr name="android:fillColor">
            <gradient
                android:endX="85.84757"
                android:endY="92.4963"
                android:startX="42.9492"
                android:startY="49.59793"
                android:type="linear">
                <item
                    android:color="#44000000"
                    android:offset="0.0" />
                <item
                    android:color="#00000000"
                    android:offset="1.0" />
            </gradient>
        </aapt:attr>
    </path>
    <path
        android:fillColor="#FFFFFF"
        android:fillType="nonZero"
        android:pathData="M65.3,45.828l3.8,-6.6c0.2,-0.4 0.1,-0.9 -0.3,-1.1c-0.4,-0.2 -0.9,-0.1 -1.1,0.3l-3.9,6.7c-6.3,-2.8 -13.4,-2.8 -19.7,0l-3.9,-6.7c-0.2,-0.4 -0.7,-0.5 -1.1,-0.3C38.8,38.328 38.7,38.828 38.9,39.228l3.8,6.6C36.2,49.428 31.7,56.028 31,63.928h46C76.3,56.028 71.8,49.428 65.3,45.828zM43.4,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2c-0.3,-0.7 -0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C45.3,56.528 44.5,57.328 43.4,57.328L43.4,57.328zM64.6,57.328c-0.8,0 -1.5,-0.5 -1.8,-1.2s-0.1,-1.5 0.4,-2.1c0.5,-0.5 1.4,-0.7 2.1,-0.4c0.7,0.3 1.2,1 1.2,1.8C66.5,56.528 65.6,57.328 64.6,57.328L64.6,57.328z"
        android:strokeWidth="1"
        android:strokeColor="#00000000" />
</vector>
```

---

## domain\src\main\res\mipmap-anydpi-v26

<a id='mipmapanydpiv26'></a>

## FILE 92: ic_launcher_round.xml

<a id='iclauncherround'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background" />
    <foreground android:drawable="@drawable/ic_launcher_foreground" />
    <monochrome android:drawable="@drawable/ic_launcher_foreground" />
</adaptive-icon>
```

---

## FILE 93: ic_launcher.xml

<a id='iclauncher'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background" />
    <foreground android:drawable="@drawable/ic_launcher_foreground" />
    <monochrome android:drawable="@drawable/ic_launcher_foreground" />
</adaptive-icon>
```

---

## domain\src\main\res\values

<a id='values'></a>

## FILE 94: colors.xml

<a id='colors'></a>

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
</resources>
```

---

## FILE 95: strings.xml

<a id='strings'></a>

```xml
<resources>
    <string name="app_name">Domain</string>
</resources>
```

---

## FILE 96: themes.xml

<a id='themes'></a>

```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.Practice" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_500</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/white</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_700</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
```

---

## domain\src\main\res\values-night

<a id='valuesnight'></a>

## FILE 97: themes.xml

<a id='themes'></a>

```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.Practice" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/purple_200</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/black</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_200</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">?attr/colorPrimaryVariant</item>
        <!-- Customize your theme here. -->
    </style>
</resources>
```

---

## domain\src\test\java\com\mobile\domain

<a id='domain'></a>

## FILE 98: ExampleUnitTest.kt

<a id='exampleunittest'></a>

```kotlin
package com.mobile.domain

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
```

---

