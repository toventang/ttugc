package com.p2082ss.android.ugc.aweme.notice.repo.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p2082ss.android.ugc.aweme.notice.repo.p3516b.C61617a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NotificationApi */
public final class NotificationApi {

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.api.NotificationApi$INotificationApi */
    public interface INotificationApi {
        static {
            Covode.recordClassIndex(72312);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/feedback/cancel/")
        AbstractC21983b<String> cancelFeedback();

        @AbstractC22000h(mo35789a = "/aweme/v1/notice/count/")
        AbstractC21983b<NoticeList> query(@AbstractC22018z(mo35807a = "source") int i);
    }

    static {
        Covode.recordClassIndex(72311);
    }

    /* renamed from: a */
    public static NoticeList m111631a(int i) {
        return ((INotificationApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C61617a.C61618a.f139828c).create(INotificationApi.class)).query(i).execute().f52262b;
    }
}
