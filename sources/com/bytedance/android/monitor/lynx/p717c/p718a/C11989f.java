package com.bytedance.android.monitor.lynx.p717c.p718a;

import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.c.a.f */
public final class C11989f extends AbstractC11908b {

    /* renamed from: e */
    public static final C11990a f28723e = new C11990a((byte) 0);

    /* renamed from: b */
    public String f28724b = "lynx_error";

    /* renamed from: c */
    public int f28725c;

    /* renamed from: d */
    public String f28726d;

    static {
        Covode.recordClassIndex(13715);
    }

    /* renamed from: com.bytedance.android.monitor.lynx.c.a.f$a */
    public static final class C11990a {
        static {
            Covode.recordClassIndex(13716);
        }

        private C11990a() {
        }

        public /* synthetic */ C11990a(byte b) {
            this();
        }
    }

    public C11989f() {
        super("nativeError");
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C11950d.m21101a(jSONObject, "scene", this.f28724b);
        C11950d.m21098a(jSONObject, "error_code", this.f28725c);
        C11950d.m21101a(jSONObject, "error_msg", this.f28726d);
    }
}
