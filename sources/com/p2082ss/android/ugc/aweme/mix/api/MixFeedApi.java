package com.p2082ss.android.ugc.aweme.mix.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59395a;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59397c;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59398d;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59399e;
import com.p2082ss.android.ugc.aweme.mix.api.response.PlaylistTimeGapInterceptor;
import com.p2082ss.android.ugc.aweme.mix.model.C59864a;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.api.MixFeedApi */
public interface MixFeedApi {

    /* renamed from: a */
    public static final C59385a f135671a = C59385a.f135672a;

    static {
        Covode.recordClassIndex(69774);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/mix/check/")
    AbstractC88979t<C59395a> checkPlaylistName(@AbstractC22018z(mo35807a = "check_type") int i, @AbstractC22018z(mo35807a = "name") String str);

    @AbstractC22000h(mo35789a = "/tiktok/v1/mix/candidate/")
    AbstractC88403ab<C59397c> getMixCandidateFeeds(@AbstractC22018z(mo35807a = "cursor") long j);

    @AbstractC22000h(mo35789a = "/tiktok/v1/mix/detail/")
    AbstractC88403ab<C59398d> getMixDetail(@AbstractC22018z(mo35807a = "uid") String str, @AbstractC22018z(mo35807a = "sec_uid") String str2, @AbstractC22018z(mo35807a = "mix_id") String str3);

    @AbstractC22000h(mo35789a = "/tiktok/v1/mix/videos/")
    AbstractC88403ab<C59399e> getMixVideos(@AbstractC22018z(mo35807a = "mix_id") String str, @AbstractC22018z(mo35807a = "item_id") String str2, @AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "pull_type") int i2);

    @AbstractC22000h(mo35789a = "/tiktok/v1/mix/videos/")
    AbstractC88979t<C59399e> getMixVideos(@AbstractC22018z(mo35807a = "mix_id") String str, @AbstractC22018z(mo35807a = "item_id") String str2, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "pull_type") int i, @AbstractC22018z(mo35807a = "uid") String str3, @AbstractC22018z(mo35807a = "sec_uid") String str4);

    @AbstractC22000h(mo35789a = "/tiktok/v1/mix/videos/")
    AbstractC88979t<C59399e> getMixVideos2(@AbstractC22018z(mo35807a = "mix_id") String str, @AbstractC22018z(mo35807a = "item_id") String str2, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "pull_type") int i, @AbstractC22018z(mo35807a = "uid") String str3, @AbstractC22018z(mo35807a = "sec_uid") String str4);

    @AbstractC22000h(mo35789a = "/tiktok/v1/mix/list/")
    AbstractC88403ab<C59864a> getUserMixList(@AbstractC22018z(mo35807a = "uid") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "sec_uid") String str2);

    @AbstractC22012t(mo35799a = "/tiktok/v1/mix/manage/")
    @AbstractC21999g
    AbstractC88403ab<C59396b> manageMixFeed(@AbstractC21997e(mo35786a = "operation") int i, @AbstractC21997e(mo35786a = "mix_id") String str, @AbstractC21997e(mo35786a = "item_ids") String str2, @AbstractC21997e(mo35786a = "add_ids") String str3, @AbstractC21997e(mo35786a = "remove_ids") String str4, @AbstractC21997e(mo35786a = "name") String str5);

    @AbstractC22000h(mo35789a = "/aweme/v1/search/loadmore/")
    AbstractC88403ab<C59864a> searchLodeMore(@AbstractC22018z(mo35807a = "id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "type") int i2, @AbstractC22018z(mo35807a = "keyword") String str2);

    /* renamed from: com.ss.android.ugc.aweme.mix.api.MixFeedApi$a */
    public static final class C59385a {

        /* renamed from: a */
        static final /* synthetic */ C59385a f135672a = new C59385a();

        private C59385a() {
        }

        static {
            Covode.recordClassIndex(69775);
        }

        /* renamed from: a */
        public static MixFeedApi m109095a() {
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28825a((AbstractC22021a) new PlaylistTimeGapInterceptor()).mo28832d().mo28858a(MixFeedApi.class);
            C89219l.m154716b(a, "");
            return (MixFeedApi) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.api.MixFeedApi$b */
    public enum EnumC59386b {
        MIXCREATE(1),
        MIXDELETE(2),
        RENAME(3),
        VIDEOADD(10),
        VIDEOREMOVE(11),
        VIDEOCOMMITCHANGES(12);
        

        /* renamed from: b */
        private int f135674b;

        public final int getOperation() {
            return this.f135674b;
        }

        static {
            Covode.recordClassIndex(69776);
        }

        public final void setOperation(int i) {
            this.f135674b = i;
        }

        private EnumC59386b(int i) {
            this.f135674b = i;
        }
    }
}
