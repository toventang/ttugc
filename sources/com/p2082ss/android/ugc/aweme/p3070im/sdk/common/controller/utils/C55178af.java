package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.af */
public final class C55178af {

    /* renamed from: a */
    public static final C55178af f126233a = new C55178af();

    /* renamed from: b */
    private static final AbstractC89244h f126234b = C89250i.m154773a((AbstractC89171a) C55181b.f126239a);

    /* renamed from: c */
    private static final AbstractC89244h f126235c = C89250i.m154773a((AbstractC89171a) C55179a.f126237a);

    /* renamed from: d */
    private static final AbstractC89244h f126236d = C89250i.m154773a((AbstractC89171a) C55183c.f126241a);

    private C55178af() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.af$a */
    static final class C55179a extends AbstractC89220m implements AbstractC89171a<C22999a> {

        /* renamed from: a */
        public static final C55179a f126237a = new C55179a();

        static {
            Covode.recordClassIndex(64924);
        }

        C55179a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C22999a invoke() {
            return C23005c.m43393a(C551801.f126238a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.af$b */
    static final class C55181b extends AbstractC89220m implements AbstractC89171a<C22999a> {

        /* renamed from: a */
        public static final C55181b f126239a = new C55181b();

        static {
            Covode.recordClassIndex(64926);
        }

        C55181b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C22999a invoke() {
            return C23005c.m43393a(C551821.f126240a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.af$c */
    static final class C55183c extends AbstractC89220m implements AbstractC89171a<C22999a> {

        /* renamed from: a */
        public static final C55183c f126241a = new C55183c();

        static {
            Covode.recordClassIndex(64928);
        }

        C55183c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C22999a invoke() {
            return C23005c.m43393a(C551841.f126242a);
        }
    }

    static {
        Covode.recordClassIndex(64923);
    }

    /* renamed from: a */
    public static final boolean m100885a(TuxIconView tuxIconView, IMUser iMUser) {
        C89219l.m154721d(tuxIconView, "");
        tuxIconView.setVisibility(0);
        if (iMUser != null) {
            if (TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason()) && iMUser.getVerificationType() == 2) {
                tuxIconView.setTuxIcon((C22999a) f126234b.getValue());
            } else if (!TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason())) {
                tuxIconView.setTuxIcon((C22999a) f126235c.getValue());
            } else if (C55076b.m100725d().isUserVerified(iMUser)) {
                tuxIconView.setTuxIcon((C22999a) f126236d.getValue());
            }
            return true;
        }
        tuxIconView.setVisibility(8);
        return false;
    }
}
