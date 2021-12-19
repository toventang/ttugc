package com.p2082ss.android.ugc.aweme.discover.p2778l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.discover.l.a */
public final class C42183a {

    /* renamed from: a */
    public static boolean f98315a;

    /* renamed from: b */
    public static final C42183a f98316b = new C42183a();

    private C42183a() {
    }

    static {
        Covode.recordClassIndex(50122);
    }

    /* renamed from: a */
    public static final boolean m84435a() {
        if (C16048b.m29633a().mo25412a(true, "discover_speed_detail", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m84436b() {
        if (!m84435a() || f98315a) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m84434a(com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a<com.p2082ss.android.ugc.aweme.feed.model.Aweme, ?> r3, java.util.List<? extends com.p2082ss.android.ugc.aweme.feed.model.Aweme> r4) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
            boolean r0 = m84435a()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            java.util.Iterator r2 = r4.iterator()
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p2082ss.android.ugc.aweme.feed.model.Aweme) r1
            if (r1 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getAuthor()
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r1.getStatistics()
            if (r0 != 0) goto L_0x0010
        L_0x002a:
            return
        L_0x002b:
            com.p2082ss.android.ugc.aweme.music.service.C61067d.m110614a(r3, r4)
            com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService r0 = com.p2082ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl.m72554b()
            r0.mo62372a(r3, r4)
            if (r3 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.profile.IProfileService r0 = com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl.m114884g()
            r0.mobRefreshInProfileAweme(r3, r4)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2778l.C42183a.m84434a(com.ss.android.ugc.aweme.common.e.a, java.util.List):void");
    }
}
