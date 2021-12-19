package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.a */
public final class DialogC68505a extends Dialog {

    /* renamed from: a */
    public C68506a f153321a;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a$a */
    public static class C68506a {

        /* renamed from: a */
        public String f153322a;

        static {
            Covode.recordClassIndex(80759);
        }
    }

    static {
        Covode.recordClassIndex(80758);
    }

    public DialogC68505a(Context context) {
        super(context, R.style.a0y);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(4609);
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        getWindow().addFlags(67108864);
        setContentView(R.layout.ayb);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        ((TextView) findViewById(R.id.title)).setText(R.string.ma);
        findViewById(R.id.pi).setOnClickListener(new View$OnClickListenerC68545b(this));
        WebView webView = (WebView) findViewById(R.id.fii);
        String str = this.f153321a.f153322a;
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(4609);
    }
}
