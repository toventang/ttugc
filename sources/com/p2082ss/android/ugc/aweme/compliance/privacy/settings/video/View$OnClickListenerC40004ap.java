package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.ap */
final /* synthetic */ class View$OnClickListenerC40004ap implements View.OnClickListener {

    /* renamed from: a */
    private final C39986a f94025a;

    /* renamed from: b */
    private final String f94026b;

    static {
        Covode.recordClassIndex(47770);
    }

    View$OnClickListenerC40004ap(C39986a aVar, String str) {
        this.f94025a = aVar;
        this.f94026b = str;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        Fragment fragment = this.f94025a;
        String str = this.f94026b;
        if (fragment.getParentFragment() instanceof C23226a) {
            fragment = fragment.getParentFragment();
        }
        new C23144b(fragment).mo37635a(str).mo37637b();
    }
}
