package com.p2082ss.android.ugc.aweme.challenge.recommend.p2453a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.challenge.recommend.a.a */
public final class C35538a {
    @AbstractC27891c(mo46611a = "mark")

    /* renamed from: a */
    public int f83806a;
    @AbstractC27891c(mo46611a = "pos")

    /* renamed from: b */
    public int f83807b;
    @AbstractC27891c(mo46611a = "ch_info")

    /* renamed from: c */
    public Challenge f83808c;
    @AbstractC27891c(mo46611a = "ad_data")

    /* renamed from: d */
    public C35539a f83809d;

    static {
        Covode.recordClassIndex(42756);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.a.a$a */
    public static class C35539a implements C80735b.AbstractC80736a {
        @AbstractC27891c(mo46611a = "creative_id")

        /* renamed from: a */
        public long f83810a;
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: b */
        public String f83811b;
        @AbstractC27891c(mo46611a = "log_extra")

        /* renamed from: c */
        public String f83812c;
        @AbstractC27891c(mo46611a = "is_preview")

        /* renamed from: d */
        public boolean f83813d;

        static {
            Covode.recordClassIndex(42757);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.hashtag.C80735b.AbstractC80736a
        /* renamed from: a */
        public final void mo62517a(Context context, int i) {
            HashMap hashMap = new HashMap();
            int i2 = i + 1;
            hashMap.put("topic_order", Integer.valueOf(i2));
            C38182f.C38184b a = C38182f.m77418a();
            a.f90211a = "launch_ad";
            a.f90212b = "show";
            a.mo66504c("topic").mo66506e(this.f83812c).mo66490a(Long.valueOf(this.f83810a)).mo66491a(hashMap).mo66495a(context);
            C18129a.m33747a("launch_ad", "show", String.valueOf(this.f83810a), this.f83812c, "0").mo28900b("refer", "topic").mo28897a("topic_order", Integer.valueOf(i2)).mo28902c();
        }

        @Override // com.p2082ss.android.ugc.aweme.video.hashtag.C80735b.AbstractC80736a
        /* renamed from: b */
        public final void mo62518b(Context context, int i) {
            HashMap hashMap = new HashMap();
            int i2 = i + 1;
            hashMap.put("topic_order", Integer.valueOf(i2));
            C38182f.C38184b a = C38182f.m77418a();
            a.f90211a = "launch_ad";
            a.f90212b = "click";
            a.mo66504c("topic").mo66506e(this.f83812c).mo66490a(Long.valueOf(this.f83810a)).mo66491a(hashMap).mo66495a(context);
            C18129a.m33747a("launch_ad", "click", String.valueOf(this.f83810a), this.f83812c, "0").mo28900b("refer", "topic").mo28897a("topic_order", Integer.valueOf(i2)).mo28902c();
        }
    }
}
