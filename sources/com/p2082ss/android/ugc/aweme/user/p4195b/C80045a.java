package com.p2082ss.android.ugc.aweme.user.p4195b;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.C43200dr;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.user.C80057d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.user.b.a */
public final class C80045a {

    /* renamed from: a */
    public static final String f179363a = "https://api.tiktokv.com/aweme/v1/friend/register/notice/";

    static {
        Covode.recordClassIndex(93276);
    }

    /* renamed from: a */
    public static void m138782a(Handler handler, final String str) {
        C34608n.m70658a().mo61083a(handler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.user.p4195b.C80045a.CallableC800483 */

            /* renamed from: b */
            final /* synthetic */ boolean f179370b = false;

            static {
                Covode.recordClassIndex(93279);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C80057d.m138792a(str, this.f179370b);
            }
        }, 112);
    }

    /* renamed from: a */
    public static void m138786a(Handler handler, final Map<String, String> map, int i) {
        C34608n.m70658a().mo61083a(handler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.user.p4195b.C80045a.CallableC800472 */

            static {
                Covode.recordClassIndex(93278);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C80057d.m138791a(map);
            }
        }, i);
    }

    /* renamed from: a */
    public static void m138784a(Handler handler, String str, String str2, int i, int i2) {
        m138785a(handler, str, str2, i, i2, false);
    }

    /* renamed from: a */
    public static void m138783a(Handler handler, final String str, final int i, final String str2, final List<C29934d> list, int i2) {
        C34608n.m70658a().mo61083a(handler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.user.p4195b.C80045a.CallableC800494 */

            static {
                Covode.recordClassIndex(93280);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C43200dr.f100694b.mo58682a(str, i, str2, AvatarUri.class, "data", list);
            }
        }, i2);
    }

    /* renamed from: a */
    public static void m138785a(Handler handler, final String str, final String str2, final int i, int i2, final boolean z) {
        C34608n.m70658a().mo61083a(handler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.user.p4195b.C80045a.CallableC800461 */

            static {
                Covode.recordClassIndex(93277);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                String str2 = str;
                String str3 = str2;
                int i = i;
                boolean z = z;
                HashMap hashMap = new HashMap();
                hashMap.put("page_from", String.valueOf(i));
                if (str2.equals("unique_id")) {
                    hashMap.put("login_name", str3);
                    hashMap.put("mt_update_username", "mt_update_username");
                    return C80057d.m138791a(hashMap);
                }
                hashMap.put(str2, str3);
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put("confirmed", str);
                return C80057d.m138791a(hashMap);
            }
        }, i2);
    }
}
