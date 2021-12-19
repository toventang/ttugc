package com.p2082ss.android.ugc.aweme.notification.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.notification.bean.C61870e;
import com.p2082ss.android.ugc.aweme.notification.bean.C61889s;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.notification.api.NoticeApiManager */
public final class NoticeApiManager {

    /* renamed from: a */
    public static NoticeApi f140433a = ((NoticeApi) RetrofitFactory.m33635a().mo28816a(C61860a.f140443e).mo28858a(NoticeApi.class));

    /* renamed from: com.ss.android.ugc.aweme.notification.api.NoticeApiManager$NoticeApi */
    public interface NoticeApi {
        static {
            Covode.recordClassIndex(72598);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/digg/list/")
        C1731i<C61870e> fetchLikeList(@AbstractC89736t(mo144292a = "max_cursor") long j, @AbstractC89736t(mo144292a = "min_cursor") long j2, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "is_new") boolean z, @AbstractC89736t(mo144292a = "digg_type") int i2, @AbstractC89736t(mo144292a = "ref_id") String str);

        @AbstractC89722f(mo144276a = "/tiktok/cla/translation_like/list/v1/")
        C1731i<C61889s> fetchTranslationLikeList(@AbstractC89736t(mo144292a = "subtitle_id") String str, @AbstractC89736t(mo144292a = "item_id") String str2, @AbstractC89736t(mo144292a = "offset") long j, @AbstractC89736t(mo144292a = "max_cursor") long j2);
    }

    static {
        Covode.recordClassIndex(72597);
    }
}
