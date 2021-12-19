package com.p2082ss.android.ugc.aweme.feed.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.C43044dj;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a.AbstractC49787b;

/* renamed from: com.ss.android.ugc.aweme.feed.api.IFeedModuleService */
public interface IFeedModuleService {
    static {
        Covode.recordClassIndex(57092);
    }

    /* renamed from: a */
    C43044dj mo80447a(Context context);

    /* renamed from: b */
    AbstractC35329by mo80448b(Context context);

    boolean canResumePlay();

    boolean fullscreenShowLive();

    Integer getInsertIndex(int i, Aweme aweme);

    void maybeMonitorTimeSpend(Aweme aweme, Long l);

    AbstractC49787b newTopNoticeFeedManager(Activity activity, View view);
}
