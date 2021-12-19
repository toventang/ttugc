package com.p2082ss.android.ugc.aweme.qrcode.p3656e;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.e.a */
public final class C66398a {

    /* renamed from: a */
    public static final C66398a f149301a = new C66398a();

    /* renamed from: com.ss.android.ugc.aweme.qrcode.e.a$a */
    public static final class C66399a extends C27895a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(77931);
        }

        C66399a() {
        }
    }

    private C66398a() {
    }

    static {
        Covode.recordClassIndex(77930);
    }

    /* renamed from: a */
    public static final Map<String, Object> m118091a(String str) {
        C89219l.m154721d(str, "");
        try {
            return (Map) new C27910f().mo46671a(C36132v.m73608b(str, "meta_params"), new C66399a().type);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
