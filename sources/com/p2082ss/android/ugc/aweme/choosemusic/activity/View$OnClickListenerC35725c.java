package com.p2082ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.c */
public final /* synthetic */ class View$OnClickListenerC35725c implements View.OnClickListener {

    /* renamed from: a */
    private final ChooseMusicActivity f84289a;

    static {
        Covode.recordClassIndex(42960);
    }

    View$OnClickListenerC35725c(ChooseMusicActivity chooseMusicActivity) {
        this.f84289a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f84289a;
        KeyboardUtils.m70897c(chooseMusicActivity.f84269a);
        new C79459a(chooseMusicActivity).mo123050a(R.string.czp).mo123053a();
    }
}
