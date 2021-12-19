package com.p2082ss.android.ugc.gamora.editor.sticker.donation.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82775f;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationSearchApi */
public final class OrganizationSearchApi {

    /* renamed from: a */
    public static Api f184945a = ((Api) C63244g.m114602a().mo73257C().createRetrofit("https://api.tiktokv.com", false, Api.class));

    /* renamed from: b */
    public static final C82739a f184946b = new C82739a((byte) 0);

    /* renamed from: c */
    private static final String f184947c = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationSearchApi$Api */
    interface Api {
        static {
            Covode.recordClassIndex(96588);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/donation/ngo/search/")
        AbstractC88403ab<C82775f> getOrganizationList(@AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2, @AbstractC22018z(mo35807a = "keyword") String str);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationSearchApi$a */
    public static final class C82739a {
        static {
            Covode.recordClassIndex(96589);
        }

        private C82739a() {
        }

        public /* synthetic */ C82739a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88403ab<C82775f> m142898a(C82742c cVar) {
            C89219l.m154721d(cVar, "");
            return OrganizationSearchApi.f184945a.getOrganizationList(cVar.f184952a, cVar.f184953b, cVar.f184954c);
        }
    }

    static {
        Covode.recordClassIndex(96587);
    }
}
