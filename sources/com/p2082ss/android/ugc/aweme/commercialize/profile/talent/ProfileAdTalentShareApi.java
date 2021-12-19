package com.p2082ss.android.ugc.aweme.commercialize.profile.talent;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a.C38484d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.talent.ProfileAdTalentShareApi */
public interface ProfileAdTalentShareApi {

    /* renamed from: a */
    public static final C38476a f90882a = C38476a.f90884b;

    static {
        Covode.recordClassIndex(45985);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/commerce/profile/ad/")
    AbstractFutureC27655q<C38484d> getTalentProfileAd(@AbstractC22018z(mo35807a = "sec_uid") String str, @AbstractC22018z(mo35807a = "item_ids") String str2, @AbstractC22018z(mo35807a = "index") int i, @AbstractC22018z(mo35807a = "source") int i2, @AbstractC22018z(mo35807a = "last_ad_show_gap") Integer num);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.talent.ProfileAdTalentShareApi$a */
    public static final class C38476a {

        /* renamed from: a */
        static final String f90883a = ("https://" + C17867d.f42587k.f42569a);

        /* renamed from: b */
        static final /* synthetic */ C38476a f90884b = new C38476a();

        private C38476a() {
        }

        static {
            Covode.recordClassIndex(45986);
        }
    }
}
