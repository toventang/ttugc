package com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2357a;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34341n;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34342o;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ax.a.a.a */
public final class C34294a implements ValueCallback<String> {

    /* renamed from: a */
    static final String f81085a = "javascript:var result = {};var timing = window.performance && window.performance.timing;result.dom_ready = timing.domComplete - timing.domInteractive;";

    /* renamed from: m */
    public static long f81086m;

    /* renamed from: b */
    public boolean f81087b;

    /* renamed from: c */
    public C34297b f81088c = new C34297b();

    /* renamed from: d */
    public WeakReference<WebView> f81089d;

    /* renamed from: e */
    public WebView f81090e;

    /* renamed from: f */
    public AbstractC34341n f81091f;

    /* renamed from: g */
    public String f81092g;

    /* renamed from: h */
    public int f81093h;

    /* renamed from: i */
    public int f81094i;

    /* renamed from: j */
    public final Handler f81095j = new Handler();

    /* renamed from: k */
    public long f81096k;

    /* renamed from: l */
    public final Runnable f81097l = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2357a.C34294a.RunnableC342951 */

        static {
            Covode.recordClassIndex(41239);
        }

        public final void run() {
            if (C34294a.this.f81089d != null && C34294a.this.f81089d.get() != null) {
                if (C34294a.this.f81088c.f81115j == 100) {
                    C34294a.this.mo60723a(true, false);
                } else if (C34294a.this.f81088c.f81115j > C34294a.this.f81093h) {
                    C34294a aVar = C34294a.this;
                    aVar.f81093h = aVar.f81088c.f81115j;
                    C34294a.this.f81094i = 0;
                    C34294a.this.f81095j.postDelayed(this, 1000);
                } else {
                    C34294a.this.f81094i++;
                    if (C34294a.this.f81094i < 3) {
                        C34294a.this.f81095j.postDelayed(this, 1000);
                        return;
                    }
                    C34294a aVar2 = C34294a.this;
                    int i = Build.VERSION.SDK_INT;
                    if (aVar2.f81090e != null) {
                        try {
                            aVar2.f81090e.evaluateJavascript(C34294a.f81085a, null);
                            aVar2.f81090e.evaluateJavascript("javascript:result", new ValueCallback<String>() {
                                /* class com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2357a.C34294a.C342962 */

                                static {
                                    Covode.recordClassIndex(41240);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // android.webkit.ValueCallback
                                public final /* synthetic */ void onReceiveValue(String str) {
                                    try {
                                        if (new JSONObject(str).getLong("dom_ready") <= 0) {
                                            C34294a.this.f81088c.f81130y = -4;
                                            C34294a.this.f81088c.f81121p = true;
                                        }
                                        C34294a.this.mo60723a(true, false);
                                    } catch (JSONException unused) {
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    };

    /* renamed from: n */
    private List<String> f81098n;

    /* renamed from: o */
    private boolean f81099o;

    /* renamed from: p */
    private String f81100p;

    /* renamed from: q */
    private long f81101q;

    static {
        Covode.recordClassIndex(41238);
    }

    /* renamed from: d */
    public final void mo60727d() {
        if (this.f81088c.f81130y != 0) {
            if (TextUtils.equals(this.f81088c.f81105B, this.f81088c.f81114i)) {
                this.f81088c.f81121p = true;
                mo60723a(true, false);
                return;
            }
            this.f81088c.f81125t++;
        }
    }

    /* renamed from: a */
    public final JSONObject mo60721a() {
        boolean z;
        C34297b bVar = this.f81088c;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isBlank", Boolean.toString(bVar.f81106a));
            jSONObject.put("pageFinish", Boolean.toString(bVar.f81122q));
            jSONObject.put("mainFrameError", Boolean.toString(bVar.f81121p));
            jSONObject.put("webViewType", bVar.f81112g);
            if (bVar.f81127v > 0) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("isOfflineCache", Boolean.toString(z));
            jSONObject.put("errUrl", bVar.f81105B);
            jSONObject.put("errType", Integer.toString(bVar.f81130y));
            jSONObject.put("errCode", Integer.toString(bVar.f81131z.intValue()));
            jSONObject.put("errMsg", bVar.f81104A);
            jSONObject.put("useCache", Boolean.toString(mo60724a(bVar)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final JSONObject mo60725b() {
        C34297b bVar = this.f81088c;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ttweb_isBlank", bVar.f81106a);
            jSONObject.put("ttweb_pageFinish", bVar.f81122q);
            jSONObject.put("ttweb_originalUrl", bVar.f81113h);
            jSONObject.put("ttweb_pageUrl", bVar.f81114i);
            jSONObject.put("ttweb_webviewType", bVar.f81112g);
            jSONObject.put("ttweb_mainFrameError", bVar.f81121p);
            jSONObject.put("ttweb_errUrl", bVar.f81105B);
            jSONObject.put("ttweb_errType", bVar.f81130y);
            jSONObject.put("ttweb_errCode", bVar.f81131z);
            jSONObject.put("ttweb_errMsg", bVar.f81104A);
            jSONObject.put("ttweb_useCache", mo60724a(bVar));
            if (f81086m > 0) {
                jSONObject.put("ttweb_initToLoadUrl", bVar.f81116k - f81086m);
                jSONObject.put("ttweb_initToPageStart", bVar.f81117l - f81086m);
                jSONObject.put("ttweb_initToPageFinish", bVar.f81118m - f81086m);
            }
            jSONObject.put("ttweb_detectDuration", bVar.f81107b);
            jSONObject.put("ttweb_attachedWindowToLoadUrl", bVar.f81116k - bVar.f81110e);
            jSONObject.put("ttweb_loadUrlToAttachedWindow", bVar.f81110e - bVar.f81116k);
            jSONObject.put("ttweb_loadUrlToPageFinish", bVar.f81118m - bVar.f81116k);
            jSONObject.put("ttweb_loadUrlToPageStart", bVar.f81117l - bVar.f81116k);
            jSONObject.put("ttweb_attachedWindowToDetachWindow", bVar.f81111f - bVar.f81110e);
            jSONObject.put("ttweb_pageStartToPageFinish", bVar.f81118m - bVar.f81117l);
            jSONObject.put("ttweb_loadUrlToDetachWindow", bVar.f81111f - bVar.f81116k);
            jSONObject.put("ttweb_loadResCount", bVar.f81123r);
            jSONObject.put("ttweb_requestResCount", bVar.f81124s);
            jSONObject.put("ttweb_loadResErrorCount", bVar.f81125t);
            jSONObject.put("ttweb_ttNetResCount", bVar.f81126u);
            jSONObject.put("ttweb_offlineResCount", bVar.f81127v);
            jSONObject.put("ttweb_TTWebViewData", this.f81100p);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: c */
    public final JSONObject mo60726c() {
        C34297b bVar = this.f81088c;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("detectDuration", bVar.f81107b);
            jSONObject.put("attachedWindowToLoadUrl", bVar.f81116k - bVar.f81110e);
            jSONObject.put("loadUrlToAttachedWindow", bVar.f81110e - bVar.f81116k);
            jSONObject.put("loadUrlToPageFinish", bVar.f81118m - bVar.f81116k);
            jSONObject.put("loadUrlToPageStart", bVar.f81117l - bVar.f81116k);
            jSONObject.put("attachedWindowToDetachWindow", bVar.f81111f - bVar.f81110e);
            jSONObject.put("pageStartToPageFinish", bVar.f81118m - bVar.f81117l);
            jSONObject.put("loadUrlToDetachWindow", bVar.f81111f - bVar.f81116k);
            jSONObject.put("loadResCount", bVar.f81123r);
            jSONObject.put("requestResCount", bVar.f81124s);
            jSONObject.put("loadResErrorCount", bVar.f81125t);
            jSONObject.put("ttNetResCount", bVar.f81126u);
            jSONObject.put("offlineResCount", bVar.f81127v);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static boolean m70164b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m70163a(String str) {
        if (m70164b(str)) {
            return false;
        }
        if (TextUtils.equals("about:blank", str)) {
            return true;
        }
        if (str == null || str.length() <= 9 || !str.substring(0, 10).equalsIgnoreCase("javascript")) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals("null", str2) && !TextUtils.equals("{}", str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("detailGetWebViewData")) {
                    this.f81100p = jSONObject.getString("detailGetWebViewData");
                    this.f81101q = SystemClock.uptimeMillis();
                }
                if (jSONObject.has("detailClearWebViewData")) {
                    SystemClock.uptimeMillis();
                }
                if (jSONObject.has("detailEnableDomData")) {
                    SystemClock.uptimeMillis();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo60724a(C34297b bVar) {
        if (!(this.f81098n == null || bVar == null || TextUtils.isEmpty(bVar.f81113h))) {
            for (String str : this.f81098n) {
                if (bVar.f81113h.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo60723a(boolean z, boolean z2) {
        if (!this.f81087b) {
            this.f81087b = true;
            if (!this.f81088c.f81121p) {
                if (z || !z2) {
                    this.f81088c.f81122q = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60722a(String str, ValueCallback<String> valueCallback) {
        if (this.f81090e != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.f81099o) {
                this.f81090e.evaluateJavascript("ttwebview:/*" + str + "*/;", valueCallback);
            }
        }
    }

    public C34294a(WebView webView, List<String> list, AbstractC34341n nVar, AbstractC34342o oVar) {
        boolean z;
        String str;
        this.f81089d = new WeakReference<>(webView);
        this.f81090e = webView;
        this.f81098n = list;
        this.f81091f = nVar;
        if (oVar == null || !oVar.mo60802g()) {
            z = false;
        } else {
            z = true;
        }
        this.f81099o = z;
        if (oVar != null) {
            str = oVar.mo60801f();
        } else {
            str = "";
        }
        this.f81092g = str;
    }
}
