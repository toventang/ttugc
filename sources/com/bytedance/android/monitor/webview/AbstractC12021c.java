package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import com.bytedance.android.monitor.C11905b;
import com.bytedance.android.monitor.p704b.AbstractC11911e;
import com.bytedance.android.monitor.p713k.AbstractC11944b;
import com.bytedance.android.monitor.webview.p722b.AbstractC12012a;
import com.bytedance.android.monitor.webview.p722b.AbstractC12014c;
import com.bytedance.android.monitor.webview.p722b.AbstractC12015d;
import com.bytedance.android.monitor.webview.p722b.AbstractC12016e;
import com.bytedance.android.monitor.webview.p722b.AbstractC12017f;
import com.bytedance.android.monitor.webview.p722b.AbstractC12018g;
import com.bytedance.android.monitor.webview.p722b.AbstractC12019h;
import com.bytedance.android.monitor.webview.p722b.AbstractC12020i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c */
public interface AbstractC12021c extends AbstractC11944b, AbstractC12012a, AbstractC12014c, AbstractC12015d, AbstractC12016e, AbstractC12018g, AbstractC12019h, AbstractC12020i {
    static {
        Covode.recordClassIndex(13749);
    }

    /* renamed from: a */
    void mo19251a(WebView webView);

    /* renamed from: b */
    void mo19252b(WebView webView);

    /* renamed from: com.bytedance.android.monitor.webview.c$a */
    public static class C12022a {

        /* renamed from: a */
        public String f28769a;

        /* renamed from: b */
        public AbstractC12032d f28770b;

        /* renamed from: c */
        AbstractC12011b f28771c;

        /* renamed from: d */
        AbstractC12017f f28772d;

        /* renamed from: e */
        public String[] f28773e;

        /* renamed from: f */
        public String[] f28774f;

        /* renamed from: g */
        public String f28775g;

        /* renamed from: h */
        AbstractC11911e f28776h;

        /* renamed from: i */
        AbstractC12009a f28777i;

        /* renamed from: j */
        public String f28778j = "";

        /* renamed from: k */
        public boolean f28779k = true;

        /* renamed from: l */
        public boolean f28780l = true;

        /* renamed from: m */
        public boolean f28781m = true;

        /* renamed from: n */
        public boolean f28782n = true;

        /* renamed from: o */
        public boolean f28783o = true;

        /* renamed from: p */
        public boolean f28784p;

        /* renamed from: q */
        public boolean f28785q;

        /* renamed from: r */
        public boolean f28786r;

        /* renamed from: s */
        public String f28787s = "loc_after_detach";

        /* renamed from: t */
        boolean f28788t = true;

        /* renamed from: u */
        String f28789u = "";

        /* renamed from: v */
        String f28790v = "";

        /* renamed from: w */
        AbstractC12016e f28791w;

        /* renamed from: x */
        int f28792x = 100;

        /* renamed from: y */
        public String f28793y = "";

        /* renamed from: z */
        public JSONObject f28794z = new JSONObject();

        static {
            Covode.recordClassIndex(13750);
        }

        /* renamed from: a */
        public final C12022a mo19253a() {
            this.f28784p = true;
            return this;
        }

        /* renamed from: b */
        public final C12022a mo19257b() {
            this.f28785q = true;
            return this;
        }

        /* renamed from: d */
        public final C12022a mo19260d() {
            this.f28779k = true;
            return this;
        }

        /* renamed from: c */
        public final C12022a mo19259c() {
            this.f28787s = "loc_after_detach";
            return this;
        }

        C12022a() {
        }

        /* renamed from: a */
        public final C12022a mo19255a(String str) {
            this.f28793y = str;
            return this;
        }

        /* renamed from: b */
        public final C12022a mo19258b(String str) {
            this.f28769a = str;
            return this;
        }

        /* renamed from: a */
        public final C12022a mo19254a(AbstractC12009a aVar) {
            this.f28777i = aVar;
            this.f28776h = new C11905b(aVar);
            return this;
        }

        /* renamed from: a */
        public final C12022a mo19256a(String... strArr) {
            this.f28773e = strArr;
            return this;
        }
    }
}
