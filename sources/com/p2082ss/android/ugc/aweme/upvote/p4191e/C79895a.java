package com.p2082ss.android.ugc.aweme.upvote.p4191e;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.e.a */
public final class C79895a {

    /* renamed from: a */
    public static final C79895a f179134a = new C79895a();

    /* renamed from: b */
    private static final AbstractC89244h f179135b = C89250i.m154773a((AbstractC89171a) C79896a.f179136a);

    /* renamed from: a */
    public static Keva m138659a() {
        return (Keva) f179135b.getValue();
    }

    private C79895a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.e.a$a */
    static final class C79896a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C79896a f179136a = new C79896a();

        static {
            Covode.recordClassIndex(93121);
        }

        C79896a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("upvote_repo");
        }
    }

    /* renamed from: b */
    public static boolean m138661b() {
        return m138659a().getBoolean(m138660a("has_displayed_comment_panel_"), false);
    }

    /* renamed from: c */
    public static void m138662c() {
        m138659a().storeBoolean(m138660a("has_displayed_comment_panel_"), true);
    }

    /* renamed from: d */
    public static int m138663d() {
        return m138659a().getInt(m138660a("publish_anim_shown_count_"), 0);
    }

    static {
        Covode.recordClassIndex(93120);
    }

    /* renamed from: a */
    public static String m138660a(String str) {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return str + g.getCurUserId();
    }
}
