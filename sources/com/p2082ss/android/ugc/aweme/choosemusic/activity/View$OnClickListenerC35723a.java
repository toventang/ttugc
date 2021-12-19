package com.p2082ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.a */
final /* synthetic */ class View$OnClickListenerC35723a implements View.OnClickListener {

    /* renamed from: a */
    private final ChooseMusicActivity f84279a;

    static {
        Covode.recordClassIndex(42958);
    }

    View$OnClickListenerC35723a(ChooseMusicActivity chooseMusicActivity) {
        this.f84279a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f84279a;
        chooseMusicActivity.mo62766b();
        chooseMusicActivity.finish();
    }
}
