package br.com.leandro.simplewebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webViewId);
        webView.setWebViewClient(new WebViewClient());

        //Fixando a url do Google para o Teste
        webView.loadUrl("http://www.google.com.br");

        //Habilitando JavaScript para evitar problemas de renderização nos Sites.
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    //Utilizando o metodo onBackPressed para que quando acionar o botão voltar, o app não fechar.
    public void onBackPressed() {

        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
