package com.p2082ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.d */
public final /* synthetic */ class View$OnClickListenerC35726d implements View.OnClickListener {

    /* renamed from: a */
    private final ChooseMusicActivity f84290a;

    static {
        Covode.recordClassIndex(42961);
    }

    View$OnClickListenerC35726d(ChooseMusicActivity chooseMusicActivity) {
        this.f84290a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f84290a;
        KeyboardUtils.m70897c(chooseMusicActivity.f84269a);
        C60826d.m110425a(chooseMusicActivity, chooseMusicActivity.f84271c);
        C35936b.m73310a(2);
    }
}
