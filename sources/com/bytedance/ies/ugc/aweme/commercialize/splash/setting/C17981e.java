package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C28022o;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.e */
public final class C17981e {

    /* renamed from: a */
    public static final C28022o f42823a = new C28022o();

    /* renamed from: b */
    public static final C17981e f42824b = new C17981e();

    private C17981e() {
    }

    static {
        Covode.recordClassIndex(20602);
    }

    /* renamed from: a */
    public static final String m33500a() {
        Object obj;
        try {
            SettingsManager a = SettingsManager.m29616a();
            C28022o oVar = f42823a;
            C28022o oVar2 = (C28022o) a.mo25397a("splash_setting_json", C28022o.class, oVar);
            if (oVar2 != null) {
                oVar = oVar2;
            }
            obj = C89379q.m157068constructorimpl(oVar);
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        C28022o oVar3 = (C28022o) obj;
        if (oVar3 == null) {
            oVar3 = f42823a;
        }
        String oVar4 = oVar3.toString();
        C89219l.m154716b(oVar4, "");
        return oVar4;
    }
}
