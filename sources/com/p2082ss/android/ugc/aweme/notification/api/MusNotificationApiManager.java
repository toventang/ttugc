package com.p2082ss.android.ugc.aweme.notification.api;

import androidx.lifecycle.C1213t;
import com.bytedance.android.livesdkapi.p700m.C11828a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61632g;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.EnumC61633h;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61804f;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80390ej;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager */
public final class MusNotificationApiManager {

    /* renamed from: a */
    public static NoticeApi f140430a;

    /* renamed from: b */
    private static NoticeWebcastApi f140431b;

    /* renamed from: c */
    private static final String f140432c;

    /* renamed from: com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager$NoticeApi */
    public interface NoticeApi {
        static {
            Covode.recordClassIndex(72595);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/notice/del/")
        C1731i<BaseResponse> deleteNotice(@AbstractC89736t(mo144292a = "notice_id") String str);

        @AbstractC89722f(mo144276a = "/aweme/janus/v1/notice/multi/")
        AbstractFutureC27655q<NoticeCombineResponse> fetchCombineNotice(@AbstractC89736t(mo144292a = "live_entrance") int i, @AbstractC89736t(mo144292a = "req_from") String str, @AbstractC89736t(mo144292a = "is_draw") long j, @AbstractC89736t(mo144292a = "content_type") int i2, @AbstractC89736t(mo144292a = "channel_id") int i3, @AbstractC89736t(mo144292a = "count") int i4, @AbstractC21987aa Map<String, String> map);

        @AbstractC89722f(mo144276a = "/aweme/v1/notice/multi/")
        AbstractFutureC27655q<NoticeListsResponse> fetchGroupNotice(@AbstractC89736t(mo144292a = "group_list") String str);

        @AbstractC89722f(mo144276a = "/aweme/janus/v1/notice/multi/feed/")
        C1731i<LiveNoticeMessageResponse> fetchLiveNotice(@AbstractC89736t(mo144292a = "req_from") String str, @AbstractC89736t(mo144292a = "is_draw") long j, @AbstractC89736t(mo144292a = "content_type") int i, @AbstractC89736t(mo144292a = "channel_id") int i2);

        @AbstractC89722f(mo144276a = "aweme/v1/report/inbox/notice/")
        AbstractFutureC27655q<NoticeListsResponse> fetchReportInboxNotice();

        @AbstractC89722f(mo144276a = "/pigeon/api/client/getLatestMessage/")
        AbstractFutureC27655q<NoticeListsResponse> fetchShopInboxNotice();

        @AbstractC89731o(mo144285a = "/tiktok/v1/sharer/link/notice/ignore/")
        AbstractC88410b ignoreLinkNotice(@AbstractC89736t(mo144292a = "link_id") String str);

        @AbstractC89731o(mo144285a = "/tiktok/notice/report/v1/")
        @AbstractC89721e
        AbstractC88979t<BaseResponse> reportNoticeAction(@AbstractC89719c(mo144273a = "nid") long j, @AbstractC89719c(mo144273a = "user_action") int i, @AbstractC89719c(mo144273a = "action_meta") String str);

        @AbstractC89722f(mo144276a = "/tiktok/user/relation/recommended_notice/update/v1")
        AbstractC88979t<BaseResponse> reportNoticeBoot();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager$NoticeWebcastApi */
    interface NoticeWebcastApi {
        static {
            Covode.recordClassIndex(72596);
        }

        @AbstractC89722f(mo144276a = "/webcast/tab/")
        C1731i<Object> fetchRecommendAvatars(@AbstractC89736t(mo144292a = "live_entrance") int i, @AbstractC21987aa Map<String, String> map);
    }

    static {
        String str;
        Covode.recordClassIndex(72592);
        String str2 = C61860a.f140443e;
        f140432c = str2;
        f140430a = (NoticeApi) C18097a.m33698a(str2 + "/", NoticeApi.class);
        if (C58071d.m104909c()) {
            str = "https://webcast.tiktokv.com";
        } else {
            str = "https://webcast-va.tiktokv.com";
        }
        f140431b = (NoticeWebcastApi) C18097a.m33698a(str, NoticeWebcastApi.class);
    }

    /* renamed from: a */
    public static void m111992a() {
        AbstractC88403ab.m153601a((AbstractC88984x) f140430a.reportNoticeBoot()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo116431a_(new AbstractC88406ae<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager.C618572 */

            static {
                Covode.recordClassIndex(72594);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* bridge */ /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            }
        });
    }

    /* renamed from: a */
    public static C1731i<BaseResponse> m111987a(String str) {
        return f140430a.deleteNotice(str);
    }

    /* renamed from: a */
    public static AbstractFutureC27655q<NoticeCombineResponse> m111988a(boolean z) {
        return f140430a.fetchCombineNotice(5, "tiktok_message", 0, 3, 81, !z ? 1 : 0, C11828a.m20830a(C17867d.m33078a()));
    }

    /* renamed from: a */
    public static NoticeListsResponse m111989a(List<C61632g> list) {
        try {
            return f140430a.fetchGroupNotice(C80342dg.m139300a().mo46674b(list)).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static NoticeListsResponse m111990a(List<C61632g> list, int i) {
        NoticeListsResponse noticeListsResponse;
        AbstractFutureC27655q<NoticeListsResponse> qVar;
        try {
            AbstractFutureC27655q<NoticeListsResponse> fetchGroupNotice = f140430a.fetchGroupNotice(C80342dg.m139300a().mo46674b(list));
            List<NoticeItems> list2 = null;
            if (i == 37) {
                try {
                    qVar = f140430a.fetchReportInboxNotice();
                } catch (Exception unused) {
                }
            } else {
                if (i == 599) {
                    qVar = f140430a.fetchShopInboxNotice();
                }
                noticeListsResponse = fetchGroupNotice.get();
                if (!C80390ej.m139366a(list2) && noticeListsResponse != null) {
                    noticeListsResponse.setCollapseNotices(list2);
                }
                return noticeListsResponse;
            }
            if (qVar != null) {
                list2 = qVar.get().getNotices();
            }
            noticeListsResponse = fetchGroupNotice.get();
            noticeListsResponse.setCollapseNotices(list2);
            return noticeListsResponse;
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static NoticeListsResponse m111991a(List<C61632g> list, C1213t<NoticeCombineDatas> tVar) {
        try {
            AbstractFutureC27655q<NoticeListsResponse> fetchGroupNotice = f140430a.fetchGroupNotice(C80342dg.m139300a().mo46674b(list));
            ArrayList arrayList = new ArrayList();
            try {
                NoticeCombineResponse noticeCombineResponse = m111988a(true).get();
                if (noticeCombineResponse != null) {
                    tVar.postValue(noticeCombineResponse.getData());
                    if (noticeCombineResponse.getData() != null) {
                        if (noticeCombineResponse.getData().getShopNotice() != null) {
                            arrayList.addAll(noticeCombineResponse.getData().getShopNotice());
                        }
                        if (C61804f.m111867a() && noticeCombineResponse.getData().getReportNotice() != null) {
                            arrayList.addAll(noticeCombineResponse.getData().getReportNotice());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            NoticeListsResponse noticeListsResponse = fetchGroupNotice.get();
            if (!C80390ej.m139366a(arrayList) && noticeListsResponse != null) {
                noticeListsResponse.setCollapseNotices(arrayList);
            }
            return noticeListsResponse;
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static void m111993a(long j, EnumC61633h hVar, String str) {
        AbstractC88403ab.m153601a((AbstractC88984x) f140430a.reportNoticeAction(j, hVar.getValue(), str)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo116431a_(new AbstractC88406ae<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager.C618561 */

            static {
                Covode.recordClassIndex(72593);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* bridge */ /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            }
        });
    }
}
