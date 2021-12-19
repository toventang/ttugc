package com.p2082ss.android.ugc.aweme.profile.api;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeAdStatus;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.profile.C63420af;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63775e;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63782l;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import java.util.Map;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.AwemeApi */
public final class AwemeApi {

    /* renamed from: a */
    public static final String f143997a = (C29736b.f70924e + "/aweme/v1/aweme/post/");

    /* renamed from: b */
    public static final String f143998b = (C29736b.f70924e + "/aweme/v1/aweme/favorite/");

    /* renamed from: c */
    public static final String f143999c = (C29736b.f70924e + "/aweme/v1/aweme/listcollection/");

    /* renamed from: d */
    public static final String f144000d = (C29736b.f70924e + "/aweme/v1/private/aweme/");

    /* renamed from: e */
    public static final RealApi f144001e = ((RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.AwemeApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(74721);
        }

        @AbstractC89722f(mo144276a = "/aweme/v2/douplus/item/check/")
        AbstractFutureC27655q<AwemeAdStatus> checkItemAdStatus(@AbstractC89736t(mo144292a = "item_id") String str, @AbstractC89736t(mo144292a = "from_source") int i);

        @AbstractC89731o(mo144285a = "/aweme/v1/commit/dislike/item/")
        @AbstractC89721e
        AbstractC21983b<BaseResponse> disLikeAweme(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89720d Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(74720);
    }

    /* renamed from: a */
    public static Bundle m115005a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m115008a(int i) {
        if (i != 0) {
            if (i == 4) {
                return f143999c;
            }
            if (i != 11) {
                if (i != 14) {
                    return f143998b;
                }
                return f144000d;
            }
        }
        return f143997a;
    }

    /* renamed from: a */
    private static void m115010a(FeedItemList feedItemList, C29935e eVar) {
        AbstractC29926a[] a;
        if (feedItemList != null) {
            if (!(TextUtils.isEmpty("X-TT-LOGID") || eVar == null || (a = eVar.mo52261a("X-TT-LOGID")) == null)) {
                for (AbstractC29926a aVar : a) {
                    if ("X-TT-LOGID".equalsIgnoreCase(aVar.mo52240a())) {
                        feedItemList.setRequestId(aVar.mo52241b());
                        return;
                    }
                }
            }
            if (feedItemList.logPb != null) {
                feedItemList.setRequestId(feedItemList.logPb.getImprId());
            }
        }
    }

    /* renamed from: a */
    public static FeedItemList m115006a(boolean z, String str, String str2, int i, long j, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        C29935e eVar = new C29935e();
        C29844g gVar = new C29844g(f143998b);
        gVar.mo52128a("invalid_item_count", i3);
        gVar.mo52128a("is_hiding_invalid_item", i4);
        gVar.mo52129a("max_cursor", j);
        if ((TextUtils.isEmpty(str2) || C52912c.f121688a.f121689b.getSecIdSwitch().intValue() == 0) && !TextUtils.isEmpty(str)) {
            gVar.mo52130a("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            gVar.mo52130a("sec_user_id", str2);
        }
        gVar.mo52128a("count", i2);
        C63873h hVar = C63873h.f144797a;
        if (z) {
            i5 = 60;
        } else {
            i5 = 0;
        }
        String a = gVar.mo52126a();
        if (j <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) hVar.apiExecuteGetJSONObject(i5, a, FeedItemList.class, null, eVar, z2, null);
        m115010a(feedItemList, eVar);
        C63775e.m115330a(i, str, feedItemList);
        return feedItemList;
    }

    /* renamed from: a */
    static String m115009a(String str, String str2, int i, long j, int i2, int i3, int i4, Integer num) {
        String str3;
        String a = m115008a(i);
        C29844g gVar = new C29844g(a);
        if (i == 0) {
            gVar.mo52128a("source", 0);
        } else if (i == 11) {
            gVar.mo52128a("source", 1);
        }
        if (!TextUtils.isEmpty(a) && a.contains(f143997a)) {
            int[] a2 = C80397em.m139369a(101);
            int[] a3 = C80397em.m139369a(200);
            String str4 = "";
            if (a2 == null) {
                str3 = str4;
            } else {
                str3 = a2[0] + "_" + a2[1];
            }
            gVar.mo52130a("user_avatar_shrink", str3);
            if (a3 != null) {
                str4 = a3[0] + "_" + a3[1];
            }
            gVar.mo52130a("video_cover_shrink", str4);
        }
        C63420af.m114999a(gVar, num, i);
        if (i == 4) {
            gVar.mo52129a("cursor", j);
        } else {
            gVar.mo52129a("max_cursor", j);
            if ((TextUtils.isEmpty(str2) || C52912c.f121688a.f121689b.getSecIdSwitch().intValue() == 0) && !TextUtils.isEmpty(str)) {
                gVar.mo52130a("user_id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                gVar.mo52130a("sec_user_id", str2);
            }
            if (i == 1) {
                gVar.mo52128a("hotsoon_filtered_count", i3);
                gVar.mo52128a("hotsoon_has_more", i4);
            }
        }
        gVar.mo52128a("count", i2);
        return gVar.mo52126a();
    }

    /* renamed from: a */
    public static FeedItemList m115007a(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4, Integer num, C29935e eVar) {
        int i5;
        boolean z2;
        String a = m115009a(str, str2, i, j, i2, i3, i4, num);
        C63782l.m115338a();
        C63873h hVar = C63873h.f144797a;
        if (z) {
            i5 = 60;
        } else {
            i5 = 0;
        }
        if (j <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) hVar.apiExecuteGetJSONObject(i5, a, FeedItemList.class, null, eVar, z2, str3);
        m115010a(feedItemList, eVar);
        C63775e.m115330a(i, str, feedItemList);
        return feedItemList;
    }
}
