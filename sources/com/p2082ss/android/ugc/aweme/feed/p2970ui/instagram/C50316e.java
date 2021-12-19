package com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.List;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.e */
public final class C50316e {
    @AbstractC27891c(mo46611a = "enable_platforms")

    /* renamed from: a */
    public List<String> f116188a;
    @AbstractC27891c(mo46611a = "platform_configs")

    /* renamed from: b */
    public C28022o f116189b;

    static {
        Covode.recordClassIndex(59444);
    }

    /* renamed from: a */
    public final C50314c mo85490a(String str) {
        C89219l.m154721d(str, "");
        C28022o oVar = this.f116189b;
        if (oVar == null) {
            return null;
        }
        Locale locale = Locale.ENGLISH;
        C89219l.m154716b(locale, "");
        String upperCase = str.toUpperCase(locale);
        C89219l.m154716b(upperCase, "");
        AbstractC28019l c = oVar.mo46803c(upperCase);
        if (c == null) {
            return null;
        }
        return (C50314c) C80342dg.m139300a().mo46667a(c, C50314c.class);
    }
}
