package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.o */
public final class C45749o {

    /* renamed from: b */
    public static final C45750a f106556b = new C45750a((byte) 0);
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final int f106557a;

    static {
        Covode.recordClassIndex(54267);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.o$a */
    public static final class C45750a {
        static {
            Covode.recordClassIndex(54268);
        }

        private C45750a() {
        }

        public /* synthetic */ C45750a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C45749o m88335a(String str) {
            Object obj;
            C89219l.m154721d(str, "");
            try {
                obj = C80342dg.m139301a(str, C45749o.class);
            } catch (Exception unused) {
                obj = null;
            }
            C45749o oVar = (C45749o) obj;
            if (oVar == null) {
                return new C45749o(0);
            }
            return oVar;
        }
    }

    public C45749o(int i) {
        this.f106557a = i;
    }
}
