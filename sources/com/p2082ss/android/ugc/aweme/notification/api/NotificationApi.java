package com.p2082ss.android.ugc.aweme.notification.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.p2082ss.android.ugc.aweme.notification.bean.C61883o;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.notification.api.NotificationApi */
public final class NotificationApi {

    /* renamed from: a */
    public static final NotificationApi f140434a = new NotificationApi();

    /* renamed from: b */
    private static final AbstractC89244h f140435b = C89250i.m154773a((AbstractC89171a) C61859a.f140438a);

    /* renamed from: com.ss.android.ugc.aweme.notification.api.NotificationApi$Api */
    public interface Api {

        /* renamed from: a */
        public static final C61858a f140436a = C61858a.f140437a;

        static {
            Covode.recordClassIndex(72600);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/notice/del/")
        AbstractC88979t<BaseResponse> deleteNotice(@AbstractC89736t(mo144292a = "notice_id") String str);

        @AbstractC89722f(mo144276a = "/aweme/janus/v1/notice/multi/")
        AbstractC88979t<NoticeCombineResponse> fetchCombineNotice(@AbstractC89736t(mo144292a = "live_entrance") int i, @AbstractC89736t(mo144292a = "req_from") String str, @AbstractC89736t(mo144292a = "is_draw") long j, @AbstractC89736t(mo144292a = "content_type") int i2, @AbstractC89736t(mo144292a = "channel_id") int i3, @AbstractC89736t(mo144292a = "count") int i4, @AbstractC21987aa Map<String, String> map);

        @AbstractC89722f(mo144276a = "/aweme/v1/notice/multi/")
        AbstractC88979t<NoticeListsResponse> fetchGroupNotice(@AbstractC89736t(mo144292a = "group_list") String str);

        @AbstractC89722f(mo144276a = "/aweme/janus/v1/notice/multi/feed/")
        AbstractC88979t<LiveNoticeMessageResponse> fetchLiveNotice(@AbstractC89736t(mo144292a = "req_from") String str, @AbstractC89736t(mo144292a = "is_draw") long j, @AbstractC89736t(mo144292a = "content_type") int i, @AbstractC89736t(mo144292a = "channel_id") int i2);

        @AbstractC89722f(mo144276a = "aweme/v1/report/inbox/notice/")
        AbstractC88979t<NoticeListsResponse> fetchReportInboxNotice();

        @AbstractC89722f(mo144276a = "/pigeon/api/client/getLatestMessage/")
        AbstractC88979t<NoticeListsResponse> fetchShopInboxNotice();

        @AbstractC89722f(mo144276a = "/aweme/v1/promote/api/user/settings/")
        AbstractC88979t<C61883o> getSubscribeMarketingStatus();

        @AbstractC89731o(mo144285a = "/aweme/v1/promote/api/user/settings/")
        @AbstractC89721e
        AbstractC88979t<BaseResponse> setSubscribeMarketingStatus(@AbstractC21997e(mo35786a = "marketing_notification") int i);

        /* renamed from: com.ss.android.ugc.aweme.notification.api.NotificationApi$Api$a */
        public static final class C61858a {

            /* renamed from: a */
            static final /* synthetic */ C61858a f140437a = new C61858a();

            private C61858a() {
            }

            static {
                Covode.recordClassIndex(72601);
            }
        }
    }

    /* renamed from: a */
    public static Api m111994a() {
        return (Api) f140435b.getValue();
    }

    private NotificationApi() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.api.NotificationApi$a */
    static final class C61859a extends AbstractC89220m implements AbstractC89171a<Api> {

        /* renamed from: a */
        public static final C61859a f140438a = new C61859a();

        static {
            Covode.recordClassIndex(72602);
        }

        C61859a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.m33635a().mo28816a(C61860a.f140443e).mo28858a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(72599);
    }
}
