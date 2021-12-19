package com.p2082ss.android.ugc.aweme.userservice.jedi.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi */
public interface JediFollowApi {

    /* renamed from: a */
    public static final C80119a f179522a = C80119a.f179523a;

    static {
        Covode.recordClassIndex(93359);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/commit/follow/user/")
    AbstractC88979t<FollowStatus> follow(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "type") int i, @AbstractC89736t(mo144292a = "channel_id") int i2, @AbstractC89736t(mo144292a = "from") Integer num, @AbstractC89736t(mo144292a = "item_id") String str3, @AbstractC89736t(mo144292a = "from_pre") Integer num2, @AbstractC89736t(mo144292a = "video_link_id") String str4, @AbstractC89736t(mo144292a = "video_link_item_id") String str5, @AbstractC89736t(mo144292a = "link_sharer") Integer num3);

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi$a */
    public static final class C80119a {

        /* renamed from: a */
        static final /* synthetic */ C80119a f179523a = new C80119a();

        private C80119a() {
        }

        static {
            Covode.recordClassIndex(93360);
        }
    }
}
