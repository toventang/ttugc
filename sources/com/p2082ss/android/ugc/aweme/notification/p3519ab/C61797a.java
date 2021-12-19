package com.p2082ss.android.ugc.aweme.notification.p3519ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.notification.ab.a */
public final class C61797a {

    /* renamed from: a */
    public static final boolean f140281a = true;

    /* renamed from: b */
    public static final AbstractC89244h f140282b = C89250i.m154773a((AbstractC89171a) C61798a.f140284a);

    /* renamed from: c */
    public static final C61797a f140283c = new C61797a();

    private C61797a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.ab.a$a */
    static final class C61798a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C61798a f140284a = new C61798a();

        static {
            Covode.recordClassIndex(72532);
        }

        C61798a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("inbox_mus_use_has_more", true));
        }
    }

    static {
        Covode.recordClassIndex(72531);
    }
}
