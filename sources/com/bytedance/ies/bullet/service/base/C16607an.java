package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.an */
public final class C16607an {

    /* renamed from: l */
    public static final C16608a f39735l = new C16608a((byte) 0);

    /* renamed from: a */
    public String f39736a;

    /* renamed from: b */
    public String f39737b;

    /* renamed from: c */
    public AbstractC16640d f39738c;

    /* renamed from: d */
    public String f39739d;

    /* renamed from: e */
    public String f39740e;

    /* renamed from: f */
    public String f39741f;

    /* renamed from: g */
    public JSONObject f39742g;

    /* renamed from: h */
    public JSONObject f39743h;

    /* renamed from: i */
    public Boolean f39744i;

    /* renamed from: j */
    public JSONObject f39745j;

    /* renamed from: k */
    public JSONObject f39746k;

    static {
        Covode.recordClassIndex(19044);
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.an$a */
    public static final class C16608a {
        static {
            Covode.recordClassIndex(19045);
        }

        private C16608a() {
        }

        public /* synthetic */ C16608a(byte b) {
            this();
        }
    }

    private C16607an(String str, JSONObject jSONObject, Boolean bool) {
        C89219l.m154719c(str, "");
        this.f39739d = str;
        this.f39740e = null;
        this.f39741f = null;
        this.f39742g = jSONObject;
        this.f39743h = null;
        this.f39744i = bool;
        this.f39745j = null;
        this.f39746k = null;
        this.f39737b = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16607an(String str, JSONObject jSONObject, Boolean bool, int i) {
        this(str, (i & 8) != 0 ? null : jSONObject, (i & 32) != 0 ? false : bool);
    }
}
