package com.p2082ss.android.ugc.aweme.inbox.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.inbox.api.MultiApiManager */
public final class MultiApiManager {

    /* renamed from: a */
    public static final MultiApiManager f128466a = new MultiApiManager();

    /* renamed from: b */
    private static final AbstractC89244h f128467b = C89250i.m154773a((AbstractC89171a) C56313a.f128468a);

    /* renamed from: com.ss.android.ugc.aweme.inbox.api.MultiApiManager$API */
    public interface API {
        static {
            Covode.recordClassIndex(66132);
        }

        @AbstractC89722f(mo144276a = "/aweme/janus/v1/notice/multi/")
        AbstractC88979t<NoticeCombineResponse> fetchCombineNotice(@AbstractC89736t(mo144292a = "live_entrance") int i, @AbstractC89736t(mo144292a = "req_from") String str, @AbstractC89736t(mo144292a = "is_draw") long j, @AbstractC89736t(mo144292a = "content_type") int i2, @AbstractC89736t(mo144292a = "channel_id") int i3, @AbstractC89736t(mo144292a = "count") int i4, @AbstractC21987aa Map<String, String> map);

        @AbstractC89722f(mo144276a = "/tiktok/notice/follow_page/v1/")
        AbstractC88979t<FollowPageResponse> fetchFollowPageData(@AbstractC89736t(mo144292a = "need_follow_request") boolean z, @AbstractC89736t(mo144292a = "is_mark_read") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "notice_max_time") long j, @AbstractC89736t(mo144292a = "notice_min_time") long j2, @AbstractC89736t(mo144292a = "follow_req_offset") long j3);

        @AbstractC89722f(mo144276a = "/aweme/v1/notice/multi/")
        AbstractC88979t<NoticeListsResponse> fetchGroupNotice(@AbstractC89736t(mo144292a = "group_list") String str);
    }

    /* renamed from: a */
    public static API m102308a() {
        return (API) f128467b.getValue();
    }

    private MultiApiManager() {
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.api.MultiApiManager$a */
    static final class C56313a extends AbstractC89220m implements AbstractC89171a<API> {

        /* renamed from: a */
        public static final C56313a f128468a = new C56313a();

        static {
            Covode.recordClassIndex(66133);
        }

        C56313a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ API invoke() {
            return RetrofitFactory.m33635a().mo28816a(C56314a.f128469a).mo28858a(API.class);
        }
    }

    static {
        Covode.recordClassIndex(66131);
    }
}
