package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.b */
final /* synthetic */ class View$OnClickListenerC46491b implements View.OnClickListener {

    /* renamed from: a */
    private final Context f108350a;

    static {
        Covode.recordClassIndex(55076);
    }

    View$OnClickListenerC46491b(Context context) {
        this.f108350a = context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        Context context = this.f108350a;
        Intent buildIntent = SmartRouter.buildRoute(context, "emoji_manager").buildIntent();
        C84349a.m145093a(buildIntent, context);
        context.startActivity(buildIntent);
    }
}
