package com.p4501vk.api.sdk.p4509ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import com.p2082ss.android.ugc.trill.R;
import com.p4501vk.api.sdk.AbstractC87878f;
import com.p4501vk.api.sdk.C87816VK;
import com.p4501vk.api.sdk.C87831b;
import com.p4501vk.api.sdk.R$id;
import com.p4501vk.api.sdk.p4502a.C87827d;
import com.p4501vk.api.sdk.p4502a.EnumC87830f;
import com.p4501vk.api.sdk.p4507f.C87893g;
import com.p4501vk.api.sdk.p4507f.C87894h;
import java.util.ArrayList;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89036ab;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.vk.api.sdk.ui.VKWebViewAuthActivity */
public class VKWebViewAuthActivity extends Activity {

    /* renamed from: c */
    public static AbstractC87878f.C87880b f199683c;

    /* renamed from: d */
    public static final C87928a f199684d = new C87928a((byte) 0);

    /* renamed from: a */
    WebView f199685a;

    /* renamed from: b */
    ProgressBar f199686b;

    /* renamed from: e */
    private C87827d f199687e;

    static {
        Covode.recordClassIndex(103941);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* renamed from: com.vk.api.sdk.ui.VKWebViewAuthActivity$a */
    public static final class C87928a {
        static {
            Covode.recordClassIndex(103942);
        }

        private C87928a() {
        }

        public /* synthetic */ C87928a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final boolean mo142413b() {
        if (m152934a(getIntent(), "vk_validation_url") != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final String mo142414c() {
        if (mo142413b()) {
            return m152934a(getIntent(), "vk_validation_url");
        }
        C87827d dVar = this.f199687e;
        if (dVar == null) {
            C89219l.m154710a("params");
        }
        return dVar.f199510c;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C15477a.m28479e(this);
        WebView webView = this.f199685a;
        if (webView == null) {
            C89219l.m154710a("webView");
        }
        webView.destroy();
        C87894h.m152900b();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo142412a() {
        String uri;
        MethodCollector.m26663i(11647);
        try {
            if (mo142413b()) {
                uri = m152934a(getIntent(), "vk_validation_url");
            } else {
                Uri.Builder buildUpon = Uri.parse("https://oauth.vk.com/authorize").buildUpon();
                C89378p[] pVarArr = new C89378p[7];
                C87827d dVar = this.f199687e;
                if (dVar == null) {
                    C89219l.m154710a("params");
                }
                pVarArr[0] = C89387v.m154943a("client_id", String.valueOf(dVar.f199509b));
                C87827d dVar2 = this.f199687e;
                if (dVar2 == null) {
                    C89219l.m154710a("params");
                }
                pVarArr[1] = C89387v.m154943a("scope", C89070n.m154551a(dVar2.f199508a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
                C87827d dVar3 = this.f199687e;
                if (dVar3 == null) {
                    C89219l.m154710a("params");
                }
                pVarArr[2] = C89387v.m154943a("redirect_uri", dVar3.f199510c);
                pVarArr[3] = C89387v.m154943a("response_type", "token");
                pVarArr[4] = C89387v.m154943a("display", "mobile");
                C87831b bVar = C87816VK.f199480a;
                if (bVar == null) {
                    C89219l.m154710a("config");
                }
                pVarArr[5] = C89387v.m154943a("v", bVar.f199519e);
                pVarArr[6] = C89387v.m154943a("revoke", "1");
                for (Map.Entry entry : C89041ag.m154421a(pVarArr).entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                uri = buildUpon.build().toString();
            }
            WebView webView = this.f199685a;
            if (webView == null) {
                C89219l.m154710a("webView");
            }
            String a = C84357h.f188595a.mo129370a(webView, uri);
            if (!TextUtils.isEmpty(a)) {
                uri = a;
            }
            webView.loadUrl(uri);
            MethodCollector.m26664o(11647);
        } catch (Exception unused) {
            setResult(0);
            finish();
            MethodCollector.m26664o(11647);
        }
    }

    /* renamed from: com.vk.api.sdk.ui.VKWebViewAuthActivity$b */
    public final class C87929b extends WebViewClient {

        /* renamed from: a */
        public boolean f199688a;

        static {
            Covode.recordClassIndex(103943);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C23833c.m45039a(webView, renderProcessGoneDetail);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C87929b() {
        }

        /* renamed from: a */
        private final boolean m152939a(String str) {
            Integer num;
            int i = 0;
            if (str != null) {
                String c = VKWebViewAuthActivity.this.mo142414c();
                C89219l.m154709a((Object) c, "");
                if (C89361p.m154874b(str, c, false)) {
                    Intent intent = new Intent("com.vk.auth-token");
                    String substring = str.substring(C89361p.m154888a((CharSequence) str, "#", 0, false, 6) + 1);
                    C89219l.m154709a((Object) substring, "");
                    intent.putExtra("extra-token-data", substring);
                    Map<String, String> a = C87893g.m152897a(substring);
                    if (a == null || (!a.containsKey("error") && !a.containsKey("cancel"))) {
                        i = -1;
                    }
                    VKWebViewAuthActivity.this.setResult(i, intent);
                    if (VKWebViewAuthActivity.this.mo142413b()) {
                        Uri parse = Uri.parse(C89361p.m154868a(str, "#", "?"));
                        if (parse.getQueryParameter("success") != null) {
                            String queryParameter = parse.getQueryParameter("access_token");
                            String queryParameter2 = parse.getQueryParameter("secret");
                            String queryParameter3 = parse.getQueryParameter("user_id");
                            if (queryParameter3 != null) {
                                num = Integer.valueOf(Integer.parseInt(queryParameter3));
                            } else {
                                num = null;
                            }
                            VKWebViewAuthActivity.f199683c = new AbstractC87878f.C87880b(queryParameter2, queryParameter, num);
                        }
                    }
                    C87894h.m152900b();
                    VKWebViewAuthActivity.this.finish();
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.vk.api.sdk.ui.VKWebViewAuthActivity$b$a */
        public static final class DialogInterface$OnClickListenerC87930a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C87929b f199690a;

            static {
                Covode.recordClassIndex(103944);
            }

            DialogInterface$OnClickListenerC87930a(C87929b bVar) {
                this.f199690a = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f199690a.f199688a = false;
                VKWebViewAuthActivity.this.mo142412a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.vk.api.sdk.ui.VKWebViewAuthActivity$b$b */
        public static final class DialogInterface$OnClickListenerC87931b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C87929b f199691a;

            static {
                Covode.recordClassIndex(103945);
            }

            DialogInterface$OnClickListenerC87931b(C87929b bVar) {
                this.f199691a = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                VKWebViewAuthActivity.this.setResult(0);
                VKWebViewAuthActivity.this.finish();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (C84365i.m145122b(webView, str)) {
                return true;
            }
            return m152939a(str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri uri;
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            return m152939a(String.valueOf(uri));
        }

        /* renamed from: a */
        private final void m152938a(WebView webView, String str) {
            Context context;
            this.f199688a = true;
            if (webView != null) {
                context = webView.getContext();
            } else {
                context = null;
            }
            try {
                new AlertDialog.Builder(context).setMessage(str).setPositiveButton(R.string.h_s, new DialogInterface$OnClickListenerC87930a(this)).setNegativeButton(17039360, new DialogInterface$OnClickListenerC87931b(this)).show();
            } catch (Exception unused) {
                VKWebViewAuthActivity.this.setResult(0);
                VKWebViewAuthActivity.this.finish();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f199688a) {
                VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
                ProgressBar progressBar = vKWebViewAuthActivity.f199686b;
                if (progressBar == null) {
                    C89219l.m154710a("progress");
                }
                progressBar.setVisibility(8);
                WebView webView2 = vKWebViewAuthActivity.f199685a;
                if (webView2 == null) {
                    C89219l.m154710a("webView");
                }
                webView2.setVisibility(0);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            m152939a(str);
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String str;
            CharSequence description;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT < 23 || webResourceError == null || (description = webResourceError.getDescription()) == null) {
                str = null;
            } else {
                str = description.toString();
            }
            m152938a(webView, str);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            m152938a(webView, str);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.bji);
        View findViewById = findViewById(R$id.webView);
        C89219l.m154709a((Object) findViewById, "");
        this.f199685a = (WebView) findViewById;
        View findViewById2 = findViewById(R.id.d_3);
        C89219l.m154709a((Object) findViewById2, "");
        this.f199686b = (ProgressBar) findViewById2;
        Bundle bundleExtra = getIntent().getBundleExtra("vk_auth_params");
        Context context = BadParcelableCrashOptimizer.getContext();
        if (bundleExtra != null) {
            if (context != null) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            int i = bundleExtra.getInt("vk_app_id");
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("vk_app_scope");
            if (stringArrayList != null) {
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) stringArrayList, 10));
                for (T t : stringArrayList) {
                    C89219l.m154709a((Object) t, "");
                    arrayList2.add(EnumC87830f.valueOf(t));
                }
                arrayList = arrayList2;
            } else {
                arrayList = C89036ab.INSTANCE;
            }
            String string = bundleExtra.getString("vk_app_redirect_url", "https://oauth.vk.com/blank.html");
            C89219l.m154709a((Object) string, "");
            this.f199687e = new C87827d(i, string, arrayList);
        } else if (!mo142413b()) {
            finish();
        }
        WebView webView = this.f199685a;
        if (webView == null) {
            C89219l.m154710a("webView");
        }
        C87929b bVar = new C87929b();
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
        webView.setWebViewClient(C23833c.m45038a(bVar));
        webView.setVerticalScrollBarEnabled(false);
        webView.setVisibility(4);
        webView.setOverScrollMode(2);
        WebView webView2 = this.f199685a;
        if (webView2 == null) {
            C89219l.m154710a("webView");
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        mo142412a();
    }

    /* renamed from: a */
    private static String m152934a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
