package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.C68052ce;
import com.p2082ss.android.ugc.aweme.video.C80665ad;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.d */
public class C22742d {

    /* renamed from: a */
    private Activity f53721a;

    static {
        Covode.recordClassIndex(26635);
    }

    /* renamed from: a */
    public final void mo37065a() {
        Intent intent = this.f53721a.getIntent();
        if (this.f53721a.isTaskRoot() && intent != null && intent.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction())) {
            C68052ce.f152437b.mo108670a();
        }
        C80665ad.f180352a = true;
    }

    public C22742d(Activity activity) {
        this.f53721a = activity;
    }
}
