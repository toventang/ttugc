package com.bytedance.android.live.wallet.p417d;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.wallet.AbstractC6366h;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.livesdk.wallet.C11317f;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.live.wallet.d.c */
public final class C6335c implements AbstractC6366h {

    /* renamed from: a */
    private final long f15837a;

    /* renamed from: b */
    private final long f15838b;

    static {
        Covode.recordClassIndex(7057);
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6366h
    /* renamed from: b */
    public final int mo12386b() {
        return 10002;
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6366h
    /* renamed from: a */
    public final AbstractC88979t<C5832d<C11317f>> mo12385a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("package_id", String.valueOf(this.f15837a));
        hashMap.put("anchor_id", String.valueOf(this.f15838b));
        return ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).buyWard(hashMap);
    }

    public C6335c(long j, long j2) {
        this.f15837a = j;
        this.f15838b = j2;
    }
}
