package com.bytedance.android.live.network.response.p383a;

import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.IOException;

/* renamed from: com.bytedance.android.live.network.response.a.b */
public final class C5829b {
    @AbstractC27891c(mo46611a = "header")

    /* renamed from: a */
    public C5828a f14693a;
    @AbstractC27891c(mo46611a = "body")

    /* renamed from: b */
    public byte[] f14694b;

    static {
        Covode.recordClassIndex(6436);
    }

    private C5829b() {
    }

    /* renamed from: a */
    public static C5829b m12765a(C2730f fVar) {
        C5829b bVar = new C5829b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                break;
            } else if (b == 1) {
                bVar.f14693a = C5828a.m12764a(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f14694b = fVar.mo7311c();
            }
        }
        fVar.mo7309a(a);
        if (bVar.f14693a != null) {
            return bVar;
        }
        throw new IOException("Invalid protobuf data: response.header is null!");
    }
}
