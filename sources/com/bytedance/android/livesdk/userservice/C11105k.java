package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.userservice.k */
final /* synthetic */ class C11105k implements AbstractC88433f {

    /* renamed from: a */
    private final C11092c f26706a;

    /* renamed from: b */
    private final int f26707b;

    /* renamed from: c */
    private final long f26708c;

    /* renamed from: d */
    private final long f26709d;

    static {
        Covode.recordClassIndex(12728);
    }

    C11105k(C11092c cVar, int i, long j, long j2) {
        this.f26706a = cVar;
        this.f26707b = i;
        this.f26708c = j;
        this.f26709d = j2;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String str;
        C11092c cVar = this.f26706a;
        int i = this.f26707b;
        long j = this.f26708c;
        long j2 = this.f26709d;
        C11688a aVar = (C11688a) obj;
        cVar.f26671b.onFollowStatusChanged(aVar.f27934e, aVar.f27930a);
        cVar.f26674e.onNext(aVar);
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
            C3868c.m9491a(C6542d.m13984a(str), 0, hashMap);
        }
    }
}
