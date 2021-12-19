package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse */
public class ShareStateResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "share_user")
    public C55275a[] mShareUserStructs;

    static {
        Covode.recordClassIndex(65025);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse$a */
    public static class C55275a implements Serializable {
        @AbstractC27891c(mo46611a = "sec_user_id")

        /* renamed from: a */
        String f126383a;
        @AbstractC27891c(mo46611a = "follow_status")

        /* renamed from: b */
        int f126384b = -1;
        @AbstractC27891c(mo46611a = "share_status")

        /* renamed from: c */
        int f126385c = 2;

        static {
            Covode.recordClassIndex(65026);
        }

        public int getFollowStatus() {
            return this.f126384b;
        }

        public String getSecUserId() {
            return this.f126383a;
        }

        public int getShareStatus() {
            return this.f126385c;
        }

        public String toUidString() {
            return "ShareUserStruct{sec_user_id=" + this.f126383a + ", follow_status=" + this.f126384b + ", share_status=" + this.f126385c + '}';
        }
    }
}
