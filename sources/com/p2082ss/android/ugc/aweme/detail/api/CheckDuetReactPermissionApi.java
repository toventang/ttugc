package com.p2082ss.android.ugc.aweme.detail.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70661b;

/* renamed from: com.ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi */
public final class CheckDuetReactPermissionApi {

    /* renamed from: a */
    public static final String f96098a = "https://api.tiktokv.com";

    /* renamed from: b */
    public static final C41107a f96099b = new C41107a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi$CheckDuetReactPermissionRequest */
    public interface CheckDuetReactPermissionRequest {
        static {
            Covode.recordClassIndex(48983);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/permission/check/")
        AbstractC21983b<C70661b> checkDuetReactPermission(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "check_type") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi$a */
    public static final class C41107a {
        static {
            Covode.recordClassIndex(48984);
        }

        private C41107a() {
        }

        public /* synthetic */ C41107a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(48982);
    }
}
