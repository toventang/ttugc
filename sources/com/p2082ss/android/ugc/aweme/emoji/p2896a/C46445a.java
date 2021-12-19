package com.p2082ss.android.ugc.aweme.emoji.p2896a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.emoji.a.a */
public final class C46445a {

    /* renamed from: a */
    public static final boolean f108217a = false;

    /* renamed from: b */
    public static final C46445a f108218b = new C46445a();

    /* renamed from: c */
    private static final AbstractC89244h f108219c = C89250i.m154773a((AbstractC89171a) C46446a.f108220a);

    /* renamed from: a */
    public static boolean m89641a() {
        return ((Boolean) f108219c.getValue()).booleanValue();
    }

    private C46445a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.a.a$a */
    static final class C46446a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46446a f108220a = new C46446a();

        static {
            Covode.recordClassIndex(55029);
        }

        C46446a() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m89642a() {
            try {
                return SettingsManager.m29616a().mo25400a("im_emoji_compat_text_view_enable", false);
            } catch (Throwable unused) {
                return C46445a.f108217a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m89642a());
        }
    }

    static {
        Covode.recordClassIndex(55028);
    }
}
