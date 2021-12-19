package com.p2082ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36179e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b */
public final class C37608b extends C49431d {
    static {
        Covode.recordClassIndex(45030);
    }

    /* renamed from: a */
    public final void mo65521a(C49672ag agVar) {
        Context d;
        Aweme aweme = (Aweme) agVar.f114316b;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            if (aweme.getAuthor() == null) {
                C13468b.m24209a("ECCommerce , author is null and awemeid is " + aweme.getAid());
            } else if (aweme.hasPromotion() && (d = mo81059d()) != null) {
                C49812b a = FeedParamProvider.C49809a.m93270a(d);
                if (!TextUtils.isEmpty(a.getEntranceInfo())) {
                    a.getEntranceInfo();
                    return;
                }
                try {
                    new JSONObject(a.getTracker()).optString("entrance_info");
                } catch (Exception unused) {
                }
            }
        }
    }

    public C37608b(String str, int i) {
        super(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: a */
    public final void mo65520a(Activity activity, Fragment fragment) {
        if (activity == null) {
            C36179e.m73733b("ATTACH ACTIVITY == NULL");
        }
        this.f113599b = activity;
        this.f113600c = fragment;
    }
}
