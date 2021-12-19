package com.bytedance.ies.xelement.p1364b;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.b.a */
public final class C18993a extends C18995b {

    /* renamed from: a */
    public static final C18994a f44964a = new C18994a((byte) 0);

    static {
        Covode.recordClassIndex(21742);
    }

    /* renamed from: com.bytedance.ies.xelement.b.a$a */
    public static final class C18994a {
        static {
            Covode.recordClassIndex(21743);
        }

        private C18994a() {
        }

        public /* synthetic */ C18994a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18993a(AbstractC28520j jVar, int i) {
        super("x_audio_error", i, jVar);
        C89219l.m154719c(jVar, "");
    }

    /* renamed from: a */
    public final void mo30148a(int i, String str, boolean z, String str2, String str3, Integer num) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        JSONObject jSONObject = new JSONObject();
        m35269a(jSONObject, "code", String.valueOf(i));
        m35269a(jSONObject, "playerType", str);
        m35269a(jSONObject, "autoPlay", String.valueOf(z));
        m35269a(jSONObject, "message", str2);
        if (str3 != null) {
            m35269a(jSONObject, "src", str3);
        }
        if (num != null) {
            m35269a(jSONObject, "playStatus", String.valueOf(num.intValue()));
        }
        mo30149a(jSONObject);
        mo30150b(jSONObject);
    }
}
