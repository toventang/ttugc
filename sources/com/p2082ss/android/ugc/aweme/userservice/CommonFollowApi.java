package com.p2082ss.android.ugc.aweme.userservice;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61615a;
import com.p2082ss.android.ugc.aweme.notice.repo.p3515a.C61616b;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.userservice.CommonFollowApi */
public final class CommonFollowApi {

    /* renamed from: a */
    public static final FollowService f179483a = ((FollowService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getApiUrlPrefix()).create(FollowService.class));

    /* renamed from: com.ss.android.ugc.aweme.userservice.CommonFollowApi$FollowService */
    public interface FollowService {
        static {
            Covode.recordClassIndex(93339);
        }

        @AbstractC22000h(mo35789a = "/aweme/v3/f2f/follow/")
        AbstractFutureC27655q<FollowStatus> face2FaceFollow(@AbstractC22018z(mo35807a = "user_id") String str, @AbstractC22018z(mo35807a = "sec_user_id") String str2);

        @AbstractC22000h(mo35789a = "/aweme/v1/commit/follow/user/")
        AbstractFutureC27655q<FollowStatus> follow(@AbstractC21987aa Map<String, String> map);

        @AbstractC22000h(mo35789a = "/aweme/v1/remove/follower/")
        AbstractC88979t<BaseResponse> remove(@AbstractC22018z(mo35807a = "user_id") String str, @AbstractC22018z(mo35807a = "sec_user_id") String str2);
    }

    static {
        Covode.recordClassIndex(93338);
    }

    /* renamed from: a */
    public static FollowStatus m138860a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4, Map<String, String> map) {
        C61615a aVar;
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2) || C52912c.f121688a.f121689b.getSecIdSwitch().intValue() == 0) {
            hashMap.put("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("sec_user_id", str2);
        }
        hashMap.put(StringSet.type, String.valueOf(i));
        hashMap.put("channel_id", String.valueOf(i3));
        hashMap.put("city", str4);
        if (i2 != -1) {
            hashMap.put("from", String.valueOf(i2));
            hashMap.put("from_pre", String.valueOf(i4));
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("item_id", str3);
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        if (C61616b.m111627a(str) != null) {
            C61615a a = C61616b.m111627a(str);
            if (a != null) {
                C61615a.m111626a(a);
            }
            hashMap.put("link_sharer", "1");
            Integer.valueOf(1);
        }
        C61616b.m111629b(str);
        C61615a b = C61616b.m111629b(str);
        if (b != null) {
            aVar = C61615a.m111626a(b);
        } else {
            aVar = null;
        }
        hashMap.put("link_sharer", "0");
        Integer num = 0;
        if (aVar != null) {
            hashMap.put("video_link_id", aVar.f139820b);
            hashMap.put("video_link_item_id", aVar.f139821c);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        FollowStatus followStatus = f179483a.follow(hashMap).get();
        if ((followStatus.followStatus == 1 || followStatus.followerStatus == 4) && num != null) {
            if (num.intValue() == 1) {
                C61616b.m111628a(str, null);
            } else if (num.intValue() == 0) {
                C61616b.m111630b(str, null);
            }
        }
        followStatus.secUserId = str2;
        followStatus.userId = str;
        return followStatus;
    }
}
