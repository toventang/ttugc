package com.p2082ss.android.ugc.aweme.i18n.language.p3063a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.i */
public final class C53449i {

    /* renamed from: a */
    public static final C53449i f122674a = new C53449i();

    private C53449i() {
    }

    static {
        Covode.recordClassIndex(63018);
    }

    /* renamed from: a */
    public static final int m98634a() {
        return m98636b().getInt("languageDialogShowState", 0);
    }

    /* renamed from: b */
    private static Keva m98636b() {
        Keva repoFromSp = Keva.getRepoFromSp(C17867d.m33078a(), "InitialChooseLanguagePreferences", 0);
        C89219l.m154716b(repoFromSp, "");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final void m98635a(int i) {
        m98636b().storeInt("languageDialogShowState", i);
    }
}
