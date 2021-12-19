package com.bytedance.android.monitor.p706d;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.d.c */
public class C11919c {

    /* renamed from: a */
    public String f28469a;

    /* renamed from: b */
    public String f28470b;

    /* renamed from: c */
    public String f28471c;

    /* renamed from: d */
    public JSONObject f28472d;

    /* renamed from: e */
    public JSONObject f28473e;

    /* renamed from: f */
    public JSONObject f28474f;

    /* renamed from: g */
    public JSONObject f28475g;

    /* renamed from: h */
    public JSONObject f28476h;

    /* renamed from: i */
    public String f28477i;

    /* renamed from: j */
    public boolean f28478j;

    /* renamed from: k */
    public AbstractC12009a f28479k;

    static {
        Covode.recordClassIndex(13645);
    }

    private C11919c() {
    }

    /* renamed from: com.bytedance.android.monitor.d.c$a */
    public static class C11920a {

        /* renamed from: a */
        public String f28480a;

        /* renamed from: b */
        public String f28481b;

        /* renamed from: c */
        public JSONObject f28482c;

        /* renamed from: d */
        public JSONObject f28483d;

        /* renamed from: e */
        public JSONObject f28484e;

        /* renamed from: f */
        public JSONObject f28485f;

        /* renamed from: g */
        public JSONObject f28486g;

        /* renamed from: h */
        public boolean f28487h;

        /* renamed from: i */
        public AbstractC12009a f28488i;

        /* renamed from: j */
        private String f28489j;

        /* renamed from: k */
        private String f28490k;

        static {
            Covode.recordClassIndex(13646);
        }

        /* renamed from: a */
        public final C11919c mo19133a() {
            C11919c cVar = new C11919c((byte) 0);
            cVar.f28471c = this.f28489j;
            cVar.f28469a = this.f28480a;
            cVar.f28470b = this.f28481b;
            cVar.f28472d = this.f28482c;
            cVar.f28473e = this.f28483d;
            JSONObject jSONObject = this.f28484e;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            cVar.f28474f = jSONObject;
            cVar.f28475g = this.f28485f;
            JSONObject jSONObject2 = this.f28486g;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            cVar.f28476h = jSONObject2;
            cVar.f28478j = this.f28487h;
            cVar.f28477i = this.f28490k;
            AbstractC12009a aVar = this.f28488i;
            if (aVar == null) {
                aVar = HybridMonitor.getInstance().getCustomReportMonitor();
            }
            cVar.f28479k = aVar;
            return cVar;
        }

        /* renamed from: a */
        public final C11920a mo19129a(AbstractC12009a aVar) {
            this.f28488i = aVar;
            return this;
        }

        /* renamed from: b */
        public final C11920a mo19134b(String str) {
            this.f28481b = str;
            return this;
        }

        /* renamed from: c */
        public final C11920a mo19136c(String str) {
            this.f28490k = str;
            return this;
        }

        /* renamed from: d */
        public final C11920a mo19138d(JSONObject jSONObject) {
            this.f28485f = jSONObject;
            return this;
        }

        /* renamed from: e */
        public final C11920a mo19139e(JSONObject jSONObject) {
            this.f28486g = jSONObject;
            return this;
        }

        public C11920a(String str) {
            this.f28489j = str;
        }

        /* renamed from: a */
        public final C11920a mo19130a(String str) {
            this.f28480a = str;
            return this;
        }

        /* renamed from: b */
        public final C11920a mo19135b(JSONObject jSONObject) {
            this.f28483d = jSONObject;
            return this;
        }

        /* renamed from: c */
        public final C11920a mo19137c(JSONObject jSONObject) {
            this.f28484e = jSONObject;
            return this;
        }

        /* renamed from: a */
        public final C11920a mo19131a(JSONObject jSONObject) {
            this.f28482c = jSONObject;
            return this;
        }

        /* renamed from: a */
        public final C11920a mo19132a(boolean z) {
            this.f28487h = z;
            return this;
        }
    }

    public String toString() {
        return "CustomInfo{url='" + this.f28469a + '\'' + ", biz='" + this.f28470b + '\'' + ", eventName='" + this.f28471c + '\'' + ", vid='" + this.f28477i + '\'' + ", isSample=" + this.f28478j + '}';
    }

    /* synthetic */ C11919c(byte b) {
        this();
    }
}
