package com.p2082ss.android.ugc.aweme.homepage.story.container;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.container.h */
public final class C53055h {

    /* renamed from: a */
    public static AbstractC53045c f121995a;

    /* renamed from: b */
    static boolean f121996b = C53057i.f122002a;

    /* renamed from: c */
    public static final boolean f121997c;

    /* renamed from: d */
    static final boolean f121998d;

    /* renamed from: e */
    public static final C53055h f121999e = new C53055h();

    /* renamed from: f */
    private static final AbstractC89244h f122000f = C89250i.m154773a((AbstractC89171a) C53056a.f122001a);

    /* renamed from: a */
    public static boolean m98053a() {
        return ((Boolean) f122000f.getValue()).booleanValue();
    }

    private C53055h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.h$a */
    static final class C53056a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C53056a f122001a = new C53056a();

        static {
            Covode.recordClassIndex(62601);
        }

        C53056a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(62600);
        boolean z2 = true;
        if (!C77260g.f173332a.mo120146a() || C76660b.m134241a() == 5) {
            z = false;
        } else {
            z = true;
        }
        f121997c = z;
        if (!(C76660b.m134241a() == 6 || C76660b.m134241a() == 7)) {
            z2 = false;
        }
        f121998d = z2;
    }

    /* renamed from: b */
    public static void m98054b(String str) {
        C89219l.m154721d(str, "");
        m98053a();
    }

    /* renamed from: a */
    public static void m98052a(String str) {
        C89219l.m154721d(str, "");
        if (!m98053a()) {
            C51423a.m95784a(4, "StoryContainer", str);
        }
    }

    /* renamed from: a */
    public static String m98051a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        if (eVar != null) {
            String f = Hox.C15490a.m28529a(eVar).mo25219f(C34792be.f82124c);
            if (C89219l.m154714a((Object) f, (Object) "page_feed") && f != null) {
                String f2 = Hox.C15490a.m28529a(eVar).mo25219f(f);
                if (C89219l.m154714a((Object) f2, (Object) "HOME") && f2 != null) {
                    return Hox.C15490a.m28529a(eVar).mo25219f(f2);
                }
            }
        }
        return "";
    }
}
