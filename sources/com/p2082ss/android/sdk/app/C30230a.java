package com.p2082ss.android.sdk.app;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.p1117b.C16054a;
import com.bytedance.keva.Keva;
import com.bytedance.p1007g.AbstractC14862g;
import com.p2082ss.android.common.applog.AppLog;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.sdk.app.a */
final /* synthetic */ class C30230a implements AbstractC14862g {

    /* renamed from: a */
    static final AbstractC14862g f72114a = new C30230a();

    static {
        Covode.recordClassIndex(36740);
    }

    private C30230a() {
    }

    @Override // com.bytedance.p1007g.AbstractC14862g
    /* renamed from: a */
    public final void mo23896a(String str) {
        C89219l.m154719c(str, "");
        if (str.length() > 0) {
            List<String> b = C89361p.m154915b(str, new String[]{","});
            Keva keva = C16054a.f38671a;
            if (b != null) {
                Object[] array = b.toArray(new String[0]);
                if (array != null) {
                    keva.storeStringArray("__client_exp_vids", (String[]) array);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        } else {
            C16054a.f38671a.storeStringArray("__client_exp_vids", new String[0]);
        }
        AppLog.setAbSDKVersion(C16054a.m29674c());
    }
}
