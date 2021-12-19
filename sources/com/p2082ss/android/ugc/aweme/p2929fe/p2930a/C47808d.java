package com.p2082ss.android.ugc.aweme.p2929fe.p2930a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge2.EnumC18323ah;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.a.d */
public final class C47808d {

    /* renamed from: a */
    public static final C47808d f110760a = new C47808d();

    private C47808d() {
    }

    static {
        Covode.recordClassIndex(56434);
    }

    /* renamed from: a */
    public static final Map<String, String> m90825a(String str) {
        List list = null;
        if (C89219l.m154714a((Object) EnumC18323ah.PUBLIC.toString(), (Object) str)) {
            Object a = SettingsManager.m29616a().mo25396a("aweme_appinfo_safehost_fields", String[].class);
            if (!(a instanceof String[])) {
                a = null;
            }
            Object[] objArr = (Object[]) a;
            if (objArr != null) {
                list = C89064i.m154508i(objArr);
            }
        }
        Map<String, String> a2 = C47807c.m90824a(list);
        C89219l.m154716b(a2, "");
        return a2;
    }
}
