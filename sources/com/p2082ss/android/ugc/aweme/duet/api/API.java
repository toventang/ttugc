package com.p2082ss.android.ugc.aweme.duet.api;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.duet.p2814a.C43253a;
import com.p2082ss.android.ugc.aweme.duet.p2814a.C43256c;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.duet.api.API */
public interface API {
    static {
        Covode.recordClassIndex(51460);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/anchor/aweme/")
    AbstractFutureC27655q<C43253a> getDuetDetailList(@AbstractC89736t(mo144292a = "anchor_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") long j2, @AbstractC89736t(mo144292a = "top_item_ids") String str2, @AbstractC89736t(mo144292a = "anchor_type") int i);

    @AbstractC89722f(mo144276a = "/tiktok/v1/duet/detail/")
    AbstractFutureC27655q<C43256c> getDuetDetailModel(@AbstractC89736t(mo144292a = "origin_item_id") String str);
}
