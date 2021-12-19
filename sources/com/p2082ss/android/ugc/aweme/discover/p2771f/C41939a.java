package com.p2082ss.android.ugc.aweme.discover.p2771f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.f.a */
public final class C41939a {

    /* renamed from: a */
    public static final C41939a f97819a = new C41939a();

    /* renamed from: b */
    private static final AbstractC89244h f97820b = C89250i.m154773a((AbstractC89171a) C41940a.f97821a);

    /* renamed from: c */
    private static int m83977c() {
        return ((Number) f97820b.getValue()).intValue();
    }

    private C41939a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.f.a$a */
    static final class C41940a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C41940a f97821a = new C41940a();

        static {
            Covode.recordClassIndex(49867);
        }

        C41940a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "discover_add_find_friend_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(49866);
    }

    /* renamed from: b */
    public final boolean mo71095b() {
        if (!m83976a() || m83977c() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m83976a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin() || C80580in.m139689d() || FriendsServiceImpl.m96115u().mo87338r()) {
            return false;
        }
        if (m83977c() == 1 || m83977c() == 2) {
            return true;
        }
        return false;
    }
}
