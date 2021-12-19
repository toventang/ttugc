package com.bytedance.bpea.core.p872d;

import com.bytedance.bpea.basics.C13347h;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.d.a */
public final class C13382a {

    /* renamed from: a */
    public static final C13383a f32681a = new C13383a((byte) 0);

    static {
        Covode.recordClassIndex(15379);
    }

    /* renamed from: com.bytedance.bpea.core.d.a$a */
    public static final class C13383a {
        static {
            Covode.recordClassIndex(15380);
        }

        private C13383a() {
        }

        /* renamed from: a */
        public static C13347h m24066a() {
            return new C13347h(0, "success");
        }

        /* renamed from: b */
        public static C13347h m24069b() {
            return new C13347h(-1001, "cert content illegal");
        }

        public /* synthetic */ C13383a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C13347h m24067a(C13347h hVar) {
            C89219l.m154719c(hVar, "");
            hVar.f32618a.put("isInterrupt", true);
            return hVar;
        }

        /* renamed from: a */
        public static C13347h m24068a(JSONObject jSONObject) {
            C13347h a = m24066a();
            a.mo21571a("translationResult", jSONObject);
            return a;
        }
    }
}
