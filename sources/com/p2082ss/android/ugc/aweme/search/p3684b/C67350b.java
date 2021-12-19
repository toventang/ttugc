package com.p2082ss.android.ugc.aweme.search.p3684b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.b.b */
public final class C67350b {

    /* renamed from: a */
    public static final C67350b f150919a = new C67350b();

    /* renamed from: b */
    private static final AbstractC89244h f150920b = C89250i.m154773a((AbstractC89171a) C67351a.f150921a);

    /* renamed from: b */
    private static int m119404b() {
        return ((Number) f150920b.getValue()).intValue();
    }

    private C67350b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.b.b$a */
    static final class C67351a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C67351a f150921a = new C67351a();

        static {
            Covode.recordClassIndex(78981);
        }

        C67351a() {
            super(0);
        }

        /* renamed from: a */
        private static int m119406a() {
            try {
                return C16048b.m29633a().mo25412a(true, "bellagio_search_for_accounts_music_tags", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m119406a());
        }
    }

    /* renamed from: a */
    public static boolean m119403a() {
        if (m119404b() == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(78980);
    }

    /* renamed from: a */
    public final String mo106246a(int i) {
        int i2;
        if (m119403a()) {
            i2 = R.string.fi;
        } else {
            i2 = R.string.dqd;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.intValue();
            if (i == C67458j.f151135d) {
                i2 = R.string.fgt;
            }
            String b = C34722h.m70923b(i2);
            C89219l.m154716b(b, "");
            return b;
        }
        String b2 = C34722h.m70923b(i2);
        C89219l.m154716b(b2, "");
        return b2;
    }
}
