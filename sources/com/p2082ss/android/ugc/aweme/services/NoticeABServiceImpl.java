package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.NoticeABServiceImpl */
public final class NoticeABServiceImpl implements NoticeABService {
    static {
        Covode.recordClassIndex(79695);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService
    public final int getEnablePushGuide() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService
    public final int getShowRedDotType() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService
    public final boolean isEnableMultiAccountLogin() {
        AbstractC34892bo b = C31575b.m65860b();
        C89219l.m154716b(b, "");
        return b.isEnableMultiAccountLogin();
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3509ab.NoticeABService
    public final boolean isFtcBindEnable() {
        return C16048b.m29633a().mo25421a(true, "ftc_bind_enable", false);
    }

    public static NoticeABService createNoticeABServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(8568);
        Object a = C81908b.m141854a(NoticeABService.class, z);
        if (a != null) {
            NoticeABService noticeABService = (NoticeABService) a;
            MethodCollector.m26664o(8568);
            return noticeABService;
        }
        if (C81908b.f183351dv == null) {
            synchronized (NoticeABService.class) {
                try {
                    if (C81908b.f183351dv == null) {
                        C81908b.f183351dv = new NoticeABServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8568);
                    throw th;
                }
            }
        }
        NoticeABServiceImpl noticeABServiceImpl = (NoticeABServiceImpl) C81908b.f183351dv;
        MethodCollector.m26664o(8568);
        return noticeABServiceImpl;
    }
}
