package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.c */
public final class DialogC70499c extends Dialog {

    /* renamed from: a */
    private final LottieAnimationView f157551a;

    /* renamed from: b */
    private boolean f157552b;

    static {
        Covode.recordClassIndex(82948);
    }

    public final void dismiss() {
        this.f157551a.mo5836d();
        this.f157552b = false;
        super.dismiss();
    }

    public final void show() {
        if (!this.f157552b) {
            this.f157551a.mo5826a();
            this.f157552b = true;
        }
        super.show();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC70499c(Context context) {
        super(context, R.style.gd);
        C89219l.m154721d(context, "");
        setContentView(R.layout.aib);
        View findViewById = findViewById(R.id.bw0);
        C89219l.m154716b(findViewById, "");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        this.f157551a = lottieAnimationView;
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        lottieAnimationView.setAnimation("stickpoint_switch_music_loading.json");
        lottieAnimationView.getAnimation();
        lottieAnimationView.setRepeatCount(-1);
    }
}
