package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.share.model.ShortenModel;
import p4560f.p4561a.AbstractC88973n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.al */
public final class C68869al {

    /* renamed from: a */
    public static final C68869al f154042a = new C68869al();

    /* renamed from: b */
    private static final IShortenUrlApi f154043b = ((IShortenUrlApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(IShortenUrlApi.class));

    private C68869al() {
    }

    static {
        Covode.recordClassIndex(81170);
    }

    /* renamed from: a */
    public static AbstractC88973n<ShortenModel> m121542a(EnumC69509z zVar, String str, String str2) {
        C89219l.m154721d(zVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return f154043b.getShareLinkShortenUel(zVar.ordinal(), str, str2);
    }
}
