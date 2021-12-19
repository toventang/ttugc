package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.o */
final /* synthetic */ class RunnableC50402o implements Runnable {

    /* renamed from: a */
    private final C50339m f116361a;

    /* renamed from: b */
    private final FollowStatus f116362b;

    /* renamed from: c */
    private final Aweme f116363c;

    static {
        Covode.recordClassIndex(59534);
    }

    RunnableC50402o(C50339m mVar, FollowStatus followStatus, Aweme aweme) {
        this.f116361a = mVar;
        this.f116362b = followStatus;
        this.f116363c = aweme;
    }

    public final void run() {
        C50339m mVar = this.f116361a;
        FollowStatus followStatus = this.f116362b;
        Aweme aweme = this.f116363c;
        if (!TextUtils.isEmpty(followStatus.userId) && TextUtils.equals(C59208ac.m108758a(aweme), followStatus.userId)) {
            if (aweme.getAuthor() != null) {
                aweme.getAuthor().setFollowStatus(followStatus.followStatus);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("aweme_state", mVar.f113953L);
            hashMap.put("event_type_state", mVar.f113954M);
            if (followStatus.followFrom == 13 || followStatus.followFrom == 18) {
                mVar.mo85516b();
            } else {
                mVar.mo85515a(followStatus.followStatus, hashMap);
            }
        }
    }
}
