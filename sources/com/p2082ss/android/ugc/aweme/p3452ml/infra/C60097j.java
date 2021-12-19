package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60086f;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59975a;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.j */
public final class C60097j {

    /* renamed from: p */
    public static boolean f136943p = C59975a.f136570a;

    /* renamed from: q */
    public static final ConcurrentHashMap<String, C60097j> f136944q = new ConcurrentHashMap<>();

    /* renamed from: r */
    public static final C60098a f136945r = new C60098a((byte) 0);

    /* renamed from: a */
    public boolean f136946a = f136943p;

    /* renamed from: b */
    int f136947b;

    /* renamed from: c */
    String f136948c = "";

    /* renamed from: d */
    boolean f136949d;

    /* renamed from: e */
    public AbstractC60089c f136950e;

    /* renamed from: f */
    public int f136951f;

    /* renamed from: g */
    final C60099b f136952g = new C60099b();

    /* renamed from: h */
    final C60099b f136953h = new C60099b();

    /* renamed from: i */
    public int f136954i;

    /* renamed from: j */
    public int f136955j;

    /* renamed from: k */
    public String f136956k;

    /* renamed from: l */
    public Float f136957l;

    /* renamed from: m */
    public String f136958m;

    /* renamed from: n */
    public Float f136959n;

    /* renamed from: o */
    public String f136960o;

    /* renamed from: s */
    private boolean f136961s;

    /* renamed from: t */
    private final C60099b f136962t = new C60099b();

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.j$a */
    public static final class C60098a {
        static {
            Covode.recordClassIndex(70606);
        }

        private C60098a() {
        }

        public /* synthetic */ C60098a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.infra.j$b */
    public static final class C60099b {

        /* renamed from: a */
        public long f136963a = -1;

        /* renamed from: b */
        public long f136964b = -1;

        static {
            Covode.recordClassIndex(70607);
        }

        /* renamed from: b */
        public final void mo97634b() {
            this.f136964b = -1;
            this.f136963a = -1;
        }

        /* renamed from: c */
        private final boolean m109582c() {
            long j = this.f136963a;
            if (j < 0) {
                return true;
            }
            long j2 = this.f136964b;
            if (j2 < 0 || j2 < j || j2 - j > 1000000000) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final float mo97633a() {
            if (m109582c()) {
                return -1.0f;
            }
            return ((float) (this.f136964b - this.f136963a)) * 1.0f;
        }
    }

    static {
        Covode.recordClassIndex(70605);
    }

    /* renamed from: a */
    public final void mo97631a() {
        if (this.f136946a && !this.f136961s) {
            this.f136962t.f136963a = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo97632b() {
        if (this.f136946a && !this.f136961s) {
            this.f136961s = true;
            this.f136951f = 0;
            this.f136962t.f136964b = System.currentTimeMillis();
        }
    }

    public C60097j(String str) {
        this.f136960o = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo97629a(AbstractC60086f fVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", this.f136960o);
            jSONObject.put("model_name", this.f136948c);
            jSONObject.put("sdk_duration", Float.valueOf(this.f136962t.mo97633a()));
            jSONObject.put("sdk_success", this.f136951f);
            if (fVar != null) {
                fVar.mo97616a(true, jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo97630a(C60100k kVar, AbstractC60086f fVar) {
        float f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("scene", this.f136960o);
            jSONObject.put("model_name", this.f136948c);
            jSONObject.put("run_count", this.f136947b);
            jSONObject.put("duration", Float.valueOf(this.f136952g.mo97633a()));
            jSONObject.put("data_cost", Float.valueOf(this.f136953h.mo97633a()));
            jSONObject.put("success", this.f136954i);
            jSONObject.put("sdk_success", this.f136955j);
            if (kVar != null) {
                String str = kVar.f136965a;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("s_result", str);
                Float f2 = kVar.f136967c;
                if (f2 == null) {
                    f2 = kVar.mo97635a();
                }
                if (f2 != null) {
                    f = f2.floatValue();
                } else {
                    f = 0.0f;
                }
                jSONObject.put("f_result", Float.valueOf(f));
            }
            if (fVar != null) {
                fVar.mo97616a(false, jSONObject);
            }
        } catch (JSONException unused) {
        }
        this.f136952g.mo97634b();
        this.f136953h.mo97634b();
        this.f136956k = null;
        this.f136957l = null;
        this.f136958m = null;
        this.f136959n = null;
        return jSONObject;
    }
}
