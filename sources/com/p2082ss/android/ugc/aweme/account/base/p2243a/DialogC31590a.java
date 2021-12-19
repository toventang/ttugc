package com.p2082ss.android.ugc.aweme.account.base.p2243a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2234a.C31375a;
import com.p2082ss.android.ugc.aweme.account.util.C33046o;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.base.a.a */
public final class DialogC31590a extends Dialog {

    /* renamed from: a */
    public C31591a f75548a;

    static {
        Covode.recordClassIndex(38316);
    }

    private DialogC31590a(Context context) {
        super(context, R.style.uj);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.base.a.a$a */
    public static class C31591a {

        /* renamed from: a */
        public String f75549a;

        /* renamed from: b */
        public String f75550b;

        static {
            Covode.recordClassIndex(38317);
        }

        /* renamed from: a */
        public final DialogC31590a mo57591a(Context context) {
            DialogC31590a aVar = new DialogC31590a(context, (byte) 0);
            aVar.f75548a = this;
            return aVar;
        }
    }

    /* renamed from: a */
    public static Dialog m65889a(Context context) {
        C31591a aVar = new C31591a();
        aVar.f75549a = C33046o.m67682a("terms-of-use");
        return aVar.mo57591a(context);
    }

    /* renamed from: b */
    public static Dialog m65890b(Context context) {
        C31591a aVar = new C31591a();
        aVar.f75549a = C33046o.m67682a("privacy-policy");
        return aVar.mo57591a(context);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(11192);
        super.onCreate(bundle);
        if (getWindow() != null) {
            Context context = getContext();
            if ((TextUtils.equals("oppo", Build.BRAND.toLowerCase()) && context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) || C31375a.m65596a() || C31375a.m65597a(context)) {
                getWindow().clearFlags(1024);
            }
            getWindow().requestFeature(1);
        }
        try {
            setContentView(R.layout.h3);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(-1, -1);
        }
        setCancelable(true);
        TextView textView = (TextView) findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f75548a.f75550b)) {
            textView.setText(this.f75548a.f75550b);
        } else {
            textView.setText(R.string.a1l);
        }
        findViewById(R.id.pi).setOnClickListener(new View$OnClickListenerC31592b(this));
        WebView webView = (WebView) findViewById(R.id.fii);
        webView.getSettings().setJavaScriptEnabled(true);
        WebViewClient webViewClient = new WebViewClient();
        if (C84367b.m145126a()) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        webView.setWebViewClient(C23833c.m45038a(webViewClient));
        String str = this.f75548a.f75549a;
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(11192);
    }

    /* synthetic */ DialogC31590a(Context context, byte b) {
        this(context);
    }
}
