package com.p2082ss.android.ugc.aweme.shortcut.p3785a.p3786a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.shortcut.C69711d;
import com.p2082ss.android.ugc.aweme.shortcut.C69712e;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortcut.a.a.a */
public final class C69707a implements AbstractC18293d {

    /* renamed from: a */
    public static final C69708a f155614a = new C69708a((byte) 0);

    static {
        Covode.recordClassIndex(82085);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortcut.a.a.a$a */
    public static final class C69708a {
        static {
            Covode.recordClassIndex(82086);
        }

        private C69708a() {
        }

        public /* synthetic */ C69708a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        long j;
        JSONObject jSONObject2;
        Long valueOf;
        if (hVar == null || (jSONObject2 = hVar.f43671d) == null || (valueOf = Long.valueOf(jSONObject2.optLong("withdrawal_amount"))) == null) {
            j = 0;
        } else {
            j = valueOf.longValue();
        }
        C69711d.m123121a(j);
        C69712e.m123124a(true);
    }
}
