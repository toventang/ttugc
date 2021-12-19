package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.u */
public final /* synthetic */ class View$OnClickListenerC54569u implements View.OnClickListener {

    /* renamed from: a */
    private final C54565s f125084a;

    /* renamed from: b */
    private final View.OnClickListener f125085b;

    static {
        Covode.recordClassIndex(64280);
    }

    View$OnClickListenerC54569u(C54565s sVar, View.OnClickListener onClickListener) {
        this.f125084a = sVar;
        this.f125085b = onClickListener;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C54565s sVar = this.f125084a;
        View.OnClickListener onClickListener = this.f125085b;
        Bundle bundle = new Bundle();
        bundle.putLong("ItemPosition", (long) sVar.f125075a);
        view.setTag(50331652, null);
        view.setTag(50331653, null);
        bundle.putSerializable("currentAweme", sVar.f125078y);
        view.setTag(50331652, bundle);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        long currentTimeMillis = System.currentTimeMillis() - sVar.f125063B;
        if (sVar.f125079z != null) {
            C39162r.m79460a("not_fullscreen_play_time", new C33744d().mo59983a("enter_from", "chat").mo59983a("group_id", sVar.f125079z.getItemId()).mo59981a("duration", currentTimeMillis).f79943a);
        }
    }
}
