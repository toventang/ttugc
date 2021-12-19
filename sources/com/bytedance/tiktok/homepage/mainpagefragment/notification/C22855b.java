package com.bytedance.tiktok.homepage.mainpagefragment.notification;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62230g;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.b */
public final class C22855b {

    /* renamed from: a */
    public static final C22855b f53975a = new C22855b();

    /* renamed from: b */
    private static final AbstractC89244h f53976b = C89250i.m154773a((AbstractC89171a) C22857b.f53979a);

    /* renamed from: c */
    private static final AbstractC89244h f53977c = C89250i.m154773a((AbstractC89171a) C22856a.f53978a);

    /* renamed from: a */
    public static boolean m43079a() {
        return ((Boolean) f53976b.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static boolean m43080b() {
        return ((Boolean) f53977c.getValue()).booleanValue();
    }

    private C22855b() {
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.b$a */
    static final class C22856a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C22856a f53978a = new C22856a();

        static {
            Covode.recordClassIndex(26757);
        }

        C22856a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C62230g.m112530a());
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.notification.b$b */
    static final class C22857b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C22857b f53979a = new C22857b();

        static {
            Covode.recordClassIndex(26758);
        }

        C22857b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C68432f.f153189a.mo108865b());
        }
    }

    static {
        Covode.recordClassIndex(26756);
    }
}
