package com.bytedance.android.monitorV2.lynx.p743c.p745b;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.c.b.e */
public final class C12169e extends AbstractC12067b {

    /* renamed from: e */
    public static final C12170a f29288e = new C12170a((byte) 0);

    /* renamed from: b */
    public String f29289b = "lynx_error";

    /* renamed from: c */
    public int f29290c;

    /* renamed from: d */
    public String f29291d;

    static {
        Covode.recordClassIndex(13898);
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.c.b.e$a */
    public static final class C12170a {
        static {
            Covode.recordClassIndex(13899);
        }

        private C12170a() {
        }

        public /* synthetic */ C12170a(byte b) {
            this();
        }
    }

    public C12169e() {
        super("nativeError");
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C12130f.m21652a(jSONObject, "scene", this.f29289b);
        C12130f.m21649a(jSONObject, "error_code", this.f29290c);
        C12130f.m21652a(jSONObject, "error_msg", this.f29291d);
    }
}
