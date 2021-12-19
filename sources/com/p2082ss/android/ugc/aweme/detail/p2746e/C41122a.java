package com.p2082ss.android.ugc.aweme.detail.p2746e;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.C41127g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.main.experiment.C59081b;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.e.a */
public final class C41122a {

    /* renamed from: a */
    public static final C41122a f96119a = new C41122a();

    private C41122a() {
    }

    static {
        Covode.recordClassIndex(49002);
    }

    /* renamed from: b */
    private static boolean m82822b(String str) {
        if (2 != C59081b.m108558a() || !TextUtils.equals(str, "from_follow_tab")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m82821a(String str) {
        if (m82822b(str) || TextUtils.equals("from_nearby", str) || TextUtils.equals("from_search", str) || TextUtils.equals("from_search_similar_aweme", str) || C41127g.m82827a(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo70373a(Aweme aweme, String str, int i, String str2, long j, boolean z, int i2, C49812b bVar) {
        String str3;
        if (aweme != null) {
            if (m82821a(str) || TextUtils.equals("from_search_jedi", str) || TextUtils.equals("potential_friends", str) || TextUtils.equals("from_no_request", str) || TextUtils.equals("from_commerce_seed", str) || TextUtils.equals("from_commerce_bill_share", str) || TextUtils.equals("from_anchor_video", str) || TextUtils.equals("from_profile_self", str) || TextUtils.equals("from_profile_other", str) || TextUtils.equals("from_commerce_banner", str) || TextUtils.equals("from_visual_search_result", str) || TextUtils.equals("from_familiar_tab", str) || TextUtils.equals("from_channel", str) || TextUtils.equals("from_search_commodity", str) || TextUtils.equals("from_mix_detail", str) || TextUtils.equals("from_trending_inflow", str) || TextUtils.equals("from_search_live", str) || TextUtils.equals("from_follow_often_watch", str) || TextUtils.equals("from_search_continuous_loading_card", str)) {
                C49672ag agVar = new C49672ag(21, aweme);
                agVar.f114319e = str;
                agVar.f114322h = i;
                agVar.f114327m = z;
                if (C41127g.m82827a(str)) {
                    AbstractC80747i O = C81079v.m140776O();
                    C89219l.m154716b(O, "");
                    agVar.f114325k = O.mo123891n();
                    AbstractC80747i O2 = C81079v.m140776O();
                    C89219l.m154716b(O2, "");
                    agVar.f114326l = O2.mo123892o();
                    agVar.f114320f = str2;
                }
                agVar.f114321g = j;
                agVar.f114323i = i2;
                Bundle bundle = new Bundle();
                if (bVar != null) {
                    str3 = bVar.getSearchType();
                } else {
                    str3 = null;
                }
                bundle.putString("key_search_type", str3);
                agVar.f114317c = bundle;
                AbstractC81915c.m141874a(agVar);
            }
        }
    }
}
