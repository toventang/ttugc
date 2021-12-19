package com.p2082ss.android.ugc.aweme.kids.choosemusic.activity;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.activity.a */
final /* synthetic */ class View$OnClickListenerC57188a implements View.OnClickListener {

    /* renamed from: a */
    private final ChooseMusicActivity f130227a;

    static {
        Covode.recordClassIndex(67091);
    }

    View$OnClickListenerC57188a(ChooseMusicActivity chooseMusicActivity) {
        this.f130227a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f130227a;
        chooseMusicActivity.mo94386a();
        chooseMusicActivity.finish();
    }
}
