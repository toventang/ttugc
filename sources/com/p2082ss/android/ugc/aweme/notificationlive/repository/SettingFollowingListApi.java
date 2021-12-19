package com.p2082ss.android.ugc.aweme.notificationlive.repository;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51104c;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.repository.SettingFollowingListApi */
public interface SettingFollowingListApi {

    /* renamed from: a */
    public static final C62563a f141884a = C62563a.f141885a;

    static {
        Covode.recordClassIndex(73359);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/user/following/list/")
    AbstractC88979t<C51104c> queryFollowingList(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "offset") int i2, @AbstractC89736t(mo144292a = "source_type") int i3);

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.repository.SettingFollowingListApi$a */
    public static final class C62563a {

        /* renamed from: a */
        static final /* synthetic */ C62563a f141885a = new C62563a();

        private C62563a() {
        }

        static {
            Covode.recordClassIndex(73360);
        }
    }
}
