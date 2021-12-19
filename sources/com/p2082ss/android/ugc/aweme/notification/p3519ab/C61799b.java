package com.p2082ss.android.ugc.aweme.notification.p3519ab;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService;
import com.p2082ss.android.ugc.aweme.services.NoticeABServiceImpl;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.notification.ab.b */
public final class C61799b implements NoticeABService {

    /* renamed from: a */
    public static final C61799b f140285a = new C61799b();

    /* renamed from: b */
    private static final AbstractC89244h f140286b = C89250i.m154773a((AbstractC89171a) C61800a.f140287a);

    /* renamed from: a */
    private static NoticeABService m111862a() {
        return (NoticeABService) f140286b.getValue();
    }

    private C61799b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.ab.b$a */
    static final class C61800a extends AbstractC89220m implements AbstractC89171a<NoticeABService> {

        /* renamed from: a */
        public static final C61800a f140287a = new C61800a();

        static {
            Covode.recordClassIndex(72534);
        }

        C61800a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NoticeABService invoke() {
            return NoticeABServiceImpl.createNoticeABServicebyMonsterPlugin(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService
    public final int getEnablePushGuide() {
        return m111862a().getEnablePushGuide();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService
    public final int getShowRedDotType() {
        return m111862a().getShowRedDotType();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService
    public final boolean isEnableMultiAccountLogin() {
        return m111862a().isEnableMultiAccountLogin();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService
    public final boolean isFtcBindEnable() {
        return m111862a().isFtcBindEnable();
    }

    static {
        Covode.recordClassIndex(72533);
    }
}
