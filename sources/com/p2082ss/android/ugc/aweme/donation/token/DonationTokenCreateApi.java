package com.p2082ss.android.ugc.aweme.donation.token;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.token.DonationTokenCreateApi */
public interface DonationTokenCreateApi {

    /* renamed from: a */
    public static final C43149a f100552a = C43149a.f100553a;

    static {
        Covode.recordClassIndex(51322);
    }

    @AbstractC22012t(mo35799a = "/webcast/room/token_create/")
    @AbstractC21999g
    AbstractC88979t<DonationTokenResponse> tokenCreate(@AbstractC21997e(mo35786a = "item_type") int i, @AbstractC21997e(mo35786a = "item_id") Long l, @AbstractC21997e(mo35786a = "sec_uid") String str, @AbstractC21997e(mo35786a = "extra") String str2);

    /* renamed from: com.ss.android.ugc.aweme.donation.token.DonationTokenCreateApi$a */
    public static final class C43149a {

        /* renamed from: a */
        static final /* synthetic */ C43149a f100553a = new C43149a();

        private C43149a() {
        }

        static {
            Covode.recordClassIndex(51323);
        }

        /* renamed from: a */
        public static DonationTokenCreateApi m86049a() {
            String str;
            IRetrofitFactory a = RetrofitFactory.m33635a();
            if (C58071d.m104909c()) {
                str = "https://webcast.tiktokv.com";
            } else {
                str = "https://webcast-va.tiktokv.com";
            }
            Object a2 = a.mo28817b(str).mo28832d().mo28858a(DonationTokenCreateApi.class);
            C89219l.m154716b(a2, "");
            return (DonationTokenCreateApi) a2;
        }
    }
}
