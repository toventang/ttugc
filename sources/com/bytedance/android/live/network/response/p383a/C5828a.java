package com.bytedance.android.live.network.response.p383a;

import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;

/* renamed from: com.bytedance.android.live.network.response.a.a */
public final class C5828a {

    /* renamed from: a */
    public int f14687a;

    /* renamed from: b */
    public String f14688b;

    /* renamed from: c */
    public String f14689c;

    /* renamed from: d */
    public String f14690d;

    /* renamed from: e */
    public long f14691e;

    /* renamed from: f */
    public String f14692f;

    static {
        Covode.recordClassIndex(6435);
    }

    private C5828a() {
    }

    /* renamed from: a */
    static C5828a m12764a(C2730f fVar) {
        C5828a aVar = new C5828a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f14687a = (int) fVar.mo7314f();
                        break;
                    case 2:
                        aVar.f14688b = fVar.mo7312d();
                        break;
                    case 3:
                        aVar.f14689c = fVar.mo7312d();
                        break;
                    case 4:
                        aVar.f14690d = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f14691e = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f14692f = fVar.mo7312d();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                if (aVar.f14687a == -1) {
                    throw new IOException("Invalid protobuf data: missing header.statusCode!");
                } else if (aVar.f14691e != -1) {
                    return aVar;
                } else {
                    throw new IOException("Invalid protobuf data: missing header.now!");
                }
            }
        }
    }
}
