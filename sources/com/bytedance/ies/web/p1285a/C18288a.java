package com.bytedance.ies.web.p1285a;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.a.a */
public class C18288a implements AbstractC18294e {

    /* renamed from: a */
    public String f43651a = "_fetchQueue";

    /* renamed from: b */
    public String f43652b = "_handleMessageFromToutiao";

    /* renamed from: c */
    public String f43653c = "javascript:ToutiaoJSBridge";

    /* renamed from: d */
    public WebView f43654d;

    /* renamed from: e */
    public String f43655e;

    /* renamed from: f */
    public List<String> f43656f;

    /* renamed from: g */
    public List<String> f43657g;

    /* renamed from: h */
    public List<String> f43658h;

    /* renamed from: i */
    Map<String, AbstractC18293d> f43659i = new HashMap();

    /* renamed from: j */
    public boolean f43660j;

    /* renamed from: k */
    private AbstractC18295f f43661k;

    /* renamed from: l */
    private Handler f43662l = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.ies.web.p1285a.C18288a.HandlerC182891 */

        static {
            Covode.recordClassIndex(20960);
        }

        public final void handleMessage(Message message) {
            if (message.obj instanceof C18297h) {
                C18288a aVar = C18288a.this;
                C18297h hVar = (C18297h) message.obj;
                WebView webView = aVar.f43654d;
                if (webView != null && hVar != null && TextUtils.equals("call", hVar.f43668a) && aVar.f43659i != null && !aVar.f43659i.isEmpty()) {
                    String url = webView.getUrl();
                    if (!aVar.f43660j && !aVar.mo29257e(url)) {
                        String str = hVar.f43670c;
                        if (aVar.f43657g == null || !aVar.f43657g.contains(str)) {
                            String str2 = hVar.f43670c;
                            if (aVar.f43658h == null || !aVar.f43658h.contains(str2)) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("code", -1);
                                    if (!TextUtils.isEmpty(hVar.f43674g)) {
                                        aVar.mo29248a(hVar.f43674g, hVar.f43669b, jSONObject);
                                        return;
                                    } else {
                                        aVar.mo29249a(hVar.f43669b, jSONObject);
                                        return;
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                    return;
                                }
                            }
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        AbstractC18293d dVar = aVar.f43659i.get(hVar.f43670c);
                        if (dVar != null) {
                            dVar.call(hVar, jSONObject2);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (!hVar.f43676i) {
                        return;
                    }
                    if (!TextUtils.isEmpty(hVar.f43674g)) {
                        aVar.mo29248a(hVar.f43674g, hVar.f43669b, jSONObject2);
                    } else {
                        aVar.mo29249a(hVar.f43669b, jSONObject2);
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(20959);
    }

    /* renamed from: a */
    public final void mo29249a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            m34009a(jSONObject2);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18294e
    /* renamed from: a */
    public final void mo29250a(List<String> list, C18297h hVar, JSONObject jSONObject) {
        this.f43658h = list;
        if (!TextUtils.isEmpty(hVar.f43674g)) {
            mo29248a(hVar.f43674g, hVar.f43669b, jSONObject);
        } else {
            mo29249a(hVar.f43669b, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo29247a() {
        this.f43654d = null;
        Handler handler = this.f43662l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f43661k = null;
        this.f43659i = null;
    }

    /* renamed from: a */
    public final C18288a mo29243a(AbstractC18295f fVar) {
        this.f43661k = fVar;
        return this;
    }

    /* renamed from: b */
    public final C18288a mo29251b(List<String> list) {
        this.f43657g = list;
        return this;
    }

    /* renamed from: c */
    public final C18288a mo29254c(List<String> list) {
        this.f43658h = list;
        return this;
    }

    /* renamed from: a */
    public static C18288a m34008a(WebView webView) {
        return new C18288a(webView);
    }

    /* renamed from: a */
    public final C18288a mo29241a(WebChromeClient webChromeClient) {
        WebView webView = this.f43654d;
        if (webView != null) {
            webView.setWebChromeClient(webChromeClient);
        }
        return this;
    }

    /* renamed from: a */
    public final C18288a mo29244a(String str) {
        this.f43655e = str;
        return this;
    }

    /* renamed from: a */
    private void m34009a(JSONObject jSONObject) {
        WebView webView = this.f43654d;
        if (webView != null) {
            C18298i.m34033a(webView, this.f43653c + "." + this.f43652b + "(" + jSONObject.toString() + ")");
        }
    }

    private C18288a(WebView webView) {
        this.f43654d = webView;
        if (webView != null) {
            if ((webView instanceof C18291b) && !((C18291b) webView).f43665a) {
                this.f43654d.setWebChromeClient(new WebChromeClient());
            }
            try {
                this.f43654d.getSettings().setJavaScriptEnabled(true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final C18288a mo29242a(WebViewClient webViewClient) {
        if (this.f43654d == null) {
            return this;
        }
        if (webViewClient instanceof C18292c) {
            ((C18292c) webViewClient).f43667d = this;
        }
        WebView webView = this.f43654d;
        if (C84367b.m145126a() && webViewClient != null) {
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
        return this;
    }

    /* renamed from: b */
    public final boolean mo29253b(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f43655e)) {
            if (!this.f43655e.equals(Uri.parse(str).getScheme().toLowerCase()) || !mo29255c(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo29255c(String str) {
        if (str == null || !str.startsWith(this.f43655e)) {
            return false;
        }
        String str2 = this.f43655e + "://private/setresult/";
        try {
            if (str.equals(this.f43655e + "://dispatch_message/")) {
                WebView webView = this.f43654d;
                if (webView != null) {
                    int i = Build.VERSION.SDK_INT;
                    webView.evaluateJavascript(this.f43653c + "." + this.f43651a + "()", new ValueCallback<String>() {
                        /* class com.bytedance.ies.web.p1285a.C18288a.C182902 */

                        static {
                            Covode.recordClassIndex(20961);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str) {
                            String str2 = str;
                            try {
                                C18288a.this.mo29256d(new JSONObject("{a=" + str2 + "}").optString("a", ""));
                            } catch (JSONException unused) {
                            }
                        }
                    });
                }
                return true;
            }
            if (str.startsWith(str2)) {
                int i2 = Build.VERSION.SDK_INT;
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final boolean mo29257e(String str) {
        String str2;
        List<String> list;
        int indexOf;
        if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 27 || (indexOf = str.indexOf(92)) == -1) {
                str2 = Uri.parse(str).getHost();
            } else {
                str2 = Uri.parse(str.substring(0, indexOf)).getHost();
            }
            if (!(str2 == null || (list = this.f43656f) == null)) {
                if (!list.isEmpty()) {
                    for (int i = 0; i < this.f43656f.size(); i++) {
                        String str3 = this.f43656f.get(i);
                        if (!str2.equals(str3)) {
                            if (!str2.endsWith(".".concat(String.valueOf(str3)))) {
                            }
                        }
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo29256d(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C18297h hVar = new C18297h();
                hVar.f43668a = jSONObject.getString("__msg_type");
                String str2 = null;
                hVar.f43669b = jSONObject.optString("__callback_id", null);
                hVar.f43670c = jSONObject.optString("func");
                hVar.f43671d = jSONObject.optJSONObject("params");
                hVar.f43672e = jSONObject.optInt("JSSDK");
                hVar.f43673f = jSONObject.optString("namespace");
                hVar.f43674g = jSONObject.optString("__iframe_url");
                if (!TextUtils.isEmpty(hVar.f43668a) && !TextUtils.isEmpty(hVar.f43670c)) {
                    Thread.currentThread();
                    AbstractC18295f fVar = this.f43661k;
                    if (fVar == null || !fVar.mo29290a(hVar)) {
                        Message obtain = Message.obtain();
                        obtain.obj = hVar;
                        this.f43662l.sendMessage(obtain);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        WebView webView = this.f43654d;
                        if (webView != null) {
                            str2 = webView.getUrl();
                        }
                        this.f43661k.mo29289a(hVar, jSONObject2, str2, this);
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C18288a mo29246a(List<String> list) {
        this.f43656f = list;
        return this;
    }

    /* renamed from: b */
    public final void mo29252b(String str, JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("__msg_type", "event");
                jSONObject2.put("__event_id", str);
                if (jSONObject != null) {
                    jSONObject2.put("__params", jSONObject);
                }
                m34009a(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C18288a mo29245a(String str, AbstractC18293d dVar) {
        if (!TextUtils.isEmpty(str) && dVar != null) {
            this.f43659i.put(str, dVar);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo29248a(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str2);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            WebView webView = this.f43654d;
            if (webView != null) {
                C18298i.m34033a(webView, C1764a.m5928a("javascript:(function(){   const iframe = document.querySelector('iframe[src=\"%s\"');   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, '%s');   }})()", new Object[]{str, jSONObject2.toString(), str}));
            }
        } catch (Exception unused) {
        }
    }
}
