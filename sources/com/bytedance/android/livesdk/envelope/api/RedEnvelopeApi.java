package com.bytedance.android.livesdk.envelope.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.envelope.p520a.C8429e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88403ab;

public interface RedEnvelopeApi {

    /* renamed from: a */
    public static final C8433a f20862a = C8433a.f20863a;

    static {
        Covode.recordClassIndex(9278);
    }

    @AbstractC22000h(mo35789a = "/webcast/envelope/list/")
    AbstractC88403ab<C5832d<C8429e>> getRedEnvelopList(@AbstractC22018z(mo35807a = "room_id") String str);

    /* renamed from: com.bytedance.android.livesdk.envelope.api.RedEnvelopeApi$a */
    public static final class C8433a {

        /* renamed from: a */
        static final /* synthetic */ C8433a f20863a = new C8433a();

        private C8433a() {
        }

        static {
            Covode.recordClassIndex(9279);
        }
    }
}
