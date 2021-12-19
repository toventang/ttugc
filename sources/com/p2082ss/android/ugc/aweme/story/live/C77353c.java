package com.p2082ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.Live;
import com.p2082ss.android.ugc.aweme.live.deeplink.AbstractC58600a;
import com.p2082ss.android.ugc.aweme.live.deeplink.C58601b;
import com.p2082ss.android.ugc.aweme.live.livehostimpl.C58680e;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.story.live.c */
public final class C77353c implements AbstractC77352b {
    static {
        Covode.recordClassIndex(90382);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b
    /* renamed from: b */
    public final void mo120928b() {
        Live.switchLocale();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b
    /* renamed from: c */
    public final AbstractC58600a mo120929c() {
        return C58601b.f133467a;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b
    /* renamed from: a */
    public final String mo120925a() {
        return Live.getLiveDomain();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b
    /* renamed from: a */
    public final boolean mo120927a(User user) {
        return Live.showLive(user);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b
    /* renamed from: a */
    public final void mo120926a(String str, Bundle bundle, Context context) {
        new C58680e().openLiveBrowser(str, bundle, context);
    }
}
