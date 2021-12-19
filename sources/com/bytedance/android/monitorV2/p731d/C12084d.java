package com.bytedance.android.monitorV2.p731d;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.webview.AbstractC12190b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.d.d */
public class C12084d {

    /* renamed from: a */
    public String f28950a;

    /* renamed from: b */
    public String f28951b;

    /* renamed from: c */
    public String f28952c;

    /* renamed from: d */
    public JSONObject f28953d;

    /* renamed from: e */
    public JSONObject f28954e;

    /* renamed from: f */
    public JSONObject f28955f;

    /* renamed from: g */
    public JSONObject f28956g;

    /* renamed from: h */
    public JSONObject f28957h;

    /* renamed from: i */
    public JSONObject f28958i;

    /* renamed from: j */
    public JSONObject f28959j;

    /* renamed from: k */
    public JSONObject f28960k;

    /* renamed from: l */
    public JSONObject f28961l;

    /* renamed from: m */
    public String f28962m;

    /* renamed from: n */
    public int f28963n;

    /* renamed from: o */
    public AbstractC12190b f28964o;

    static {
        Covode.recordClassIndex(13813);
    }

    private C12084d() {
    }

    public String toString() {
        return "CustomInfo{url='" + this.f28950a + '\'' + ", bid='" + this.f28951b + '\'' + ", eventName='" + this.f28952c + '\'' + ", vid='" + this.f28962m + '\'' + ", canSample=" + this.f28963n + '}';
    }

    /* renamed from: com.bytedance.android.monitorV2.d.d$a */
    public static class C12085a {

        /* renamed from: a */
        public String f28965a;

        /* renamed from: b */
        public String f28966b;

        /* renamed from: c */
        public JSONObject f28967c;

        /* renamed from: d */
        public JSONObject f28968d;

        /* renamed from: e */
        public JSONObject f28969e;

        /* renamed from: f */
        public JSONObject f28970f;

        /* renamed from: g */
        public JSONObject f28971g;

        /* renamed from: h */
        public JSONObject f28972h;

        /* renamed from: i */
        public JSONObject f28973i;

        /* renamed from: j */
        public JSONObject f28974j;

        /* renamed from: k */
        public JSONObject f28975k;

        /* renamed from: l */
        public AbstractC12190b f28976l;

        /* renamed from: m */
        private String f28977m;

        /* renamed from: n */
        private String f28978n;

        /* renamed from: o */
        private int f28979o;

        static {
            Covode.recordClassIndex(13814);
        }

        /* renamed from: a */
        public final C12084d mo19435a() {
            C12084d dVar = new C12084d((byte) 0);
            dVar.f28952c = this.f28977m;
            String str = this.f28965a;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            dVar.f28950a = str;
            String str3 = this.f28966b;
            if (str3 != null) {
                str2 = str3;
            }
            dVar.f28951b = str2;
            JSONObject jSONObject = this.f28967c;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            dVar.f28953d = jSONObject;
            JSONObject jSONObject2 = this.f28968d;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            dVar.f28954e = jSONObject2;
            JSONObject jSONObject3 = this.f28969e;
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            dVar.f28955f = jSONObject3;
            JSONObject jSONObject4 = this.f28970f;
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            dVar.f28956g = jSONObject4;
            dVar.f28963n = this.f28979o;
            JSONObject jSONObject5 = this.f28971g;
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
            }
            this.f28971g = jSONObject5;
            dVar.f28957h = jSONObject5;
            JSONObject jSONObject6 = this.f28972h;
            if (jSONObject6 == null) {
                jSONObject6 = new JSONObject();
            }
            dVar.f28958i = jSONObject6;
            dVar.f28962m = this.f28978n;
            AbstractC12190b bVar = this.f28976l;
            if (bVar == null) {
                bVar = HybridMultiMonitor.getInstance().getCustomReportMonitor();
            }
            dVar.f28964o = bVar;
            JSONObject jSONObject7 = this.f28974j;
            if (jSONObject7 == null) {
                jSONObject7 = new JSONObject();
            }
            dVar.f28960k = jSONObject7;
            JSONObject jSONObject8 = this.f28973i;
            if (jSONObject8 == null) {
                jSONObject8 = new JSONObject();
            }
            dVar.f28959j = jSONObject8;
            JSONObject jSONObject9 = this.f28975k;
            if (jSONObject9 == null) {
                jSONObject9 = new JSONObject();
            }
            dVar.f28961l = jSONObject9;
            return dVar;
        }

        /* renamed from: a */
        public final C12085a mo19433a(String str) {
            this.f28965a = str;
            return this;
        }

        /* renamed from: b */
        public final C12085a mo19436b(JSONObject jSONObject) {
            this.f28968d = jSONObject;
            return this;
        }

        /* renamed from: c */
        public final C12085a mo19437c(JSONObject jSONObject) {
            this.f28969e = jSONObject;
            return this;
        }

        /* renamed from: d */
        public final C12085a mo19438d(JSONObject jSONObject) {
            this.f28971g = jSONObject;
            return this;
        }

        /* renamed from: e */
        public final C12085a mo19439e(JSONObject jSONObject) {
            this.f28972h = null;
            return this;
        }

        public C12085a(String str) {
            this.f28977m = str;
        }

        /* renamed from: a */
        public final C12085a mo19434a(JSONObject jSONObject) {
            this.f28967c = jSONObject;
            return this;
        }

        /* renamed from: a */
        public final C12085a mo19432a(int i) {
            if (i < 0 || i > 8) {
                i = 8;
            }
            this.f28979o = i;
            return this;
        }
    }

    /* synthetic */ C12084d(byte b) {
        this();
    }
}
