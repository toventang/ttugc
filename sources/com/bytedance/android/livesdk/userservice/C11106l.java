package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.userservice.l */
final /* synthetic */ class C11106l implements AbstractC88433f {

    /* renamed from: a */
    private final C11092c f26710a;

    /* renamed from: b */
    private final int f26711b;

    /* renamed from: c */
    private final long f26712c;

    /* renamed from: d */
    private final long f26713d;

    static {
        Covode.recordClassIndex(12729);
    }

    C11106l(C11092c cVar, int i, long j, long j2) {
        this.f26710a = cVar;
        this.f26711b = i;
        this.f26712c = j;
        this.f26713d = j2;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String str;
        String str2;
        C11092c cVar = this.f26710a;
        int i = this.f26711b;
        long j = this.f26712c;
        long j2 = this.f26713d;
        Throwable th = (Throwable) obj;
        if (cVar.f26670a != null) {
            long id = cVar.f26670a.getId();
            if (i == 1) {
                str = "ttlive_follow";
            } else {
                str = "ttlive_unfollow";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("proponent_id", Long.valueOf(id));
            hashMap.put("adopter_id", Long.valueOf(j));
            hashMap.put("room_id", Long.valueOf(j2));
            if (th != null) {
                str2 = th.getMessage();
                if (th instanceof C2908a) {
                    hashMap.put("error_code", Integer.valueOf(((C2908a) th).getErrorCode()));
                }
            } else {
                str2 = "";
            }
            hashMap.put("error_msg", str2);
            C3868c.m9491a(C6542d.m13984a(str), 1, hashMap);
            C3868c.m9491a(C6542d.m13985b(str), 1, hashMap);
        }
    }
}
