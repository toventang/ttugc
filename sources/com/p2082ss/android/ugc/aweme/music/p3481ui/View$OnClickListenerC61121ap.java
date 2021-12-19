package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.RessoCollectInfo;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ap */
final /* synthetic */ class View$OnClickListenerC61121ap implements View.OnClickListener {

    /* renamed from: a */
    private final RessoCollectInfo f138796a;

    /* renamed from: b */
    private final Context f138797b;

    static {
        Covode.recordClassIndex(71724);
    }

    View$OnClickListenerC61121ap(RessoCollectInfo ressoCollectInfo, Context context) {
        this.f138796a = ressoCollectInfo;
        this.f138797b = context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        RessoCollectInfo ressoCollectInfo = this.f138796a;
        Context context = this.f138797b;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(ressoCollectInfo.getDeepLink()));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.moonvideo.android.resso");
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }
}
