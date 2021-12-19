package com.bytedance.android.live.wallet.p417d;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.wallet.AbstractC6366h;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.livesdk.wallet.C11317f;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.live.wallet.d.a */
public final class C6333a implements AbstractC6366h {

    /* renamed from: a */
    long f15834a;

    /* renamed from: b */
    long f15835b;

    static {
        Covode.recordClassIndex(7055);
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6366h
    /* renamed from: b */
    public final int mo12386b() {
        return 10001;
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6366h
    /* renamed from: a */
    public final AbstractC88979t<C5832d<C11317f>> mo12385a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("activities_id", String.valueOf(this.f15834a));
        hashMap.put("item_id", String.valueOf(this.f15835b));
        return ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).buyPackage(hashMap);
    }

    public C6333a(long j, long j2) {
        this.f15834a = j;
        this.f15835b = j2;
    }
}
