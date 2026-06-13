package com.sobriety.app

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        setContentView(webView)

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://505402a8-908a-469c-8a69-4ff09020d565-00-3vhqp55x517pt.kirk.replit.dev/about")
    }
}
