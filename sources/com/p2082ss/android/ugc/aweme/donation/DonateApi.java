package com.p2082ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.donation.DonateApi */
public interface DonateApi {
    static {
        Covode.recordClassIndex(51276);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/donate/item/")
    AbstractFutureC27655q<C43112b> getDonateDetail(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "cursor") Integer num, @AbstractC89736t(mo144292a = "ngo_id") Integer num2, @AbstractC89736t(mo144292a = "sec_uid") String str2, @AbstractC89736t(mo144292a = "item_id") Long l, @AbstractC89736t(mo144292a = "item_type") Integer num3, @AbstractC89736t(mo144292a = "extra") String str3, @AbstractC89736t(mo144292a = "should_fetch_top_donor") boolean z);
}
