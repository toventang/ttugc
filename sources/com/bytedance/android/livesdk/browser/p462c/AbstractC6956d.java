package com.bytedance.android.livesdk.browser.p462c;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2931h;
import com.bytedance.android.live.p176b.C2943o;
import com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.c.d */
public interface AbstractC6956d {

    /* renamed from: com.bytedance.android.livesdk.browser.c.d$c */
    public interface AbstractC6959c {
        static {
            Covode.recordClassIndex(7698);
        }

        /* renamed from: a */
        WebViewClient mo13262a();

        /* renamed from: b */
        void mo13263b();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.d$d */
    public interface AbstractC6960d {
        static {
            Covode.recordClassIndex(7699);
        }

        /* renamed from: a */
        boolean mo13264a();

        /* renamed from: b */
        C6962f mo13265b();

        /* renamed from: c */
        boolean mo13266c();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.d$e */
    public interface AbstractC6961e {
        static {
            Covode.recordClassIndex(7700);
        }

        /* renamed from: a */
        void mo13231a(WebView webView, String str);
    }

    static {
        Covode.recordClassIndex(7695);
    }

    /* renamed from: a */
    WebView mo13244a(Context context);

    /* renamed from: a */
    C4031a mo13245a(C6958b bVar);

    /* renamed from: a */
    C4031a mo13246a(C6958b bVar, C2943o oVar);

    /* renamed from: a */
    C6962f mo13247a(Activity activity, AbstractC6961e eVar);

    /* renamed from: a */
    void mo13248a(Context context, C6957a aVar);

    /* renamed from: a */
    void mo13249a(WebView webView);

    /* renamed from: a */
    void mo13250a(C6962f fVar);

    /* renamed from: a */
    void mo13251a(C6962f fVar, String str);

    /* renamed from: a */
    void mo13252a(C6962f fVar, String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo13253a(AbstractC7033a aVar);

    /* renamed from: a */
    void mo13254a(String str, JSONObject jSONObject);

    /* renamed from: a */
    boolean mo13255a();

    /* renamed from: a */
    boolean mo13256a(String str);

    /* renamed from: b */
    void mo13257b(AbstractC7033a aVar);

    /* renamed from: com.bytedance.android.livesdk.browser.c.d$b */
    public static class C6958b {

        /* renamed from: A */
        public boolean f17387A;

        /* renamed from: B */
        public String f17388B;

        /* renamed from: C */
        public boolean f17389C;

        /* renamed from: D */
        public String f17390D;

        /* renamed from: E */
        public String f17391E;

        /* renamed from: F */
        public String f17392F;

        /* renamed from: G */
        public float f17393G;

        /* renamed from: H */
        public boolean f17394H;

        /* renamed from: I */
        public int f17395I;

        /* renamed from: J */
        public boolean f17396J;

        /* renamed from: a */
        public String f17397a;

        /* renamed from: b */
        public int f17398b;

        /* renamed from: c */
        public int f17399c;

        /* renamed from: d */
        public int f17400d;

        /* renamed from: e */
        public int f17401e;

        /* renamed from: f */
        public int f17402f;

        /* renamed from: g */
        public int f17403g;

        /* renamed from: h */
        public int f17404h;

        /* renamed from: i */
        public int f17405i;

        /* renamed from: j */
        public int f17406j;

        /* renamed from: k */
        public int f17407k;

        /* renamed from: l */
        public boolean f17408l;

        /* renamed from: m */
        public boolean f17409m;

        /* renamed from: n */
        public boolean f17410n;

        /* renamed from: o */
        public boolean f17411o;

        /* renamed from: p */
        public boolean f17412p;

        /* renamed from: q */
        public boolean f17413q;

        /* renamed from: r */
        public boolean f17414r;

        /* renamed from: s */
        public boolean f17415s;

        /* renamed from: t */
        public boolean f17416t;

        /* renamed from: u */
        public AbstractC2931h f17417u;

        /* renamed from: v */
        public String f17418v;

        /* renamed from: w */
        public boolean f17419w;

        /* renamed from: x */
        public String f17420x;

        /* renamed from: y */
        public boolean f17421y;

        /* renamed from: z */
        public boolean f17422z;

        static {
            Covode.recordClassIndex(7697);
        }

        /* renamed from: b */
        public final C6958b mo13261b(String str) {
            if (str != null) {
                this.f17392F = str;
            }
            return this;
        }

        /* renamed from: a */
        public final C6958b mo13258a(int i) {
            this.f17408l = false;
            this.f17401e = i;
            this.f17402f = 0;
            this.f17403g = 0;
            this.f17404h = 0;
            this.f17405i = 0;
            return this;
        }

        private C6958b(String str) {
            this.f17407k = -1;
            this.f17418v = "";
            this.f17419w = true;
            this.f17390D = "";
            this.f17392F = "bottom";
            this.f17397a = str;
        }

        /* renamed from: a */
        public final C6958b mo13260a(String str) {
            try {
                this.f17393G = Float.parseFloat(str);
            } catch (Exception unused) {
                this.f17393G = 0.0f;
            }
            return this;
        }

        /* synthetic */ C6958b(String str, byte b) {
            this(str);
        }

        /* renamed from: a */
        public final C6958b mo13259a(int i, int i2, int i3, int i4) {
            this.f17408l = true;
            this.f17402f = i;
            this.f17403g = i2;
            this.f17404h = i3;
            this.f17405i = i4;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.d$a */
    public static class C6957a {

        /* renamed from: a */
        public String f17377a;

        /* renamed from: b */
        public String f17378b;

        /* renamed from: c */
        public boolean f17379c;

        /* renamed from: d */
        public boolean f17380d;

        /* renamed from: e */
        public boolean f17381e;

        /* renamed from: f */
        public String f17382f;

        /* renamed from: g */
        public String f17383g;

        /* renamed from: h */
        public String f17384h;

        /* renamed from: i */
        public boolean f17385i;

        /* renamed from: j */
        public String f17386j;

        static {
            Covode.recordClassIndex(7696);
        }

        private C6957a(String str) {
            this.f17385i = true;
            this.f17377a = str;
        }

        /* synthetic */ C6957a(String str, byte b) {
            this(str);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.d$f */
    public static class C6962f implements AbstractC7033a {

        /* renamed from: a */
        public WebView f17423a;

        /* renamed from: b */
        public AbstractC6953a f17424b;

        /* renamed from: c */
        public WebChromeClient f17425c;

        /* renamed from: d */
        public WebViewClient f17426d;

        /* renamed from: e */
        AbstractC6959c f17427e;

        static {
            Covode.recordClassIndex(7701);
        }

        @Override // com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a
        /* renamed from: a */
        public final <T> void mo13267a(String str, T t) {
            AbstractC6953a aVar = this.f17424b;
            if (aVar != null && aVar.mo13236a() != null) {
                this.f17424b.mo13236a().mo29404a(str, (Object) t);
            }
        }

        public C6962f(WebView webView, AbstractC6953a aVar, WebChromeClient webChromeClient, AbstractC6959c cVar) {
            this.f17423a = webView;
            this.f17424b = aVar;
            this.f17425c = webChromeClient;
            this.f17426d = cVar.mo13262a();
            this.f17427e = cVar;
        }
    }
}
