package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bn */
public final class C50131bn extends PopupWindow {

    /* renamed from: a */
    public AbstractC50132a f115722a;

    /* renamed from: b */
    private final Runnable f115723b = new RunnableC50134c(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bn$a */
    public interface AbstractC50132a {
        static {
            Covode.recordClassIndex(59258);
        }

        /* renamed from: a */
        void mo84892a();
    }

    static {
        Covode.recordClassIndex(59257);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bn$c */
    static final class RunnableC50134c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50131bn f115725a;

        static {
            Covode.recordClassIndex(59260);
        }

        RunnableC50134c(C50131bn bnVar) {
            this.f115725a = bnVar;
        }

        public final void run() {
            this.f115725a.mo85273a();
        }
    }

    /* renamed from: a */
    public final void mo85273a() {
        try {
            dismiss();
        } catch (Exception unused) {
        }
        AbstractC50132a aVar = this.f115722a;
        if (aVar != null) {
            aVar.mo84892a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bn$b */
    public static final class RunnableC50133b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50131bn f115724a;

        static {
            Covode.recordClassIndex(59259);
        }

        RunnableC50133b(C50131bn bnVar) {
            this.f115724a = bnVar;
        }

        public final void run() {
            if (Build.VERSION.SDK_INT >= 21) {
                View contentView = this.f115724a.getContentView();
                C89219l.m154716b(contentView, "");
                LinearLayout linearLayout = (LinearLayout) contentView.findViewById(R.id.sa);
                C89219l.m154716b(linearLayout, "");
                Drawable background = linearLayout.getBackground();
                Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                View contentView2 = this.f115724a.getContentView();
                C89219l.m154716b(contentView2, "");
                LinearLayout linearLayout2 = (LinearLayout) contentView2.findViewById(R.id.sa);
                C89219l.m154716b(linearLayout2, "");
                ObjectAnimator duration = ObjectAnimator.ofArgb(background, C19386b.f45894a, 0, linearLayout2.getResources().getColor(R.color.bj)).setDuration(300L);
                C89219l.m154716b(duration, "");
                View contentView3 = this.f115724a.getContentView();
                C89219l.m154716b(contentView3, "");
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(contentView3.findViewById(R.id.bh1), "alpha", 0.0f, 1.0f).setDuration(300L);
                C89219l.m154716b(duration2, "");
                View contentView4 = this.f115724a.getContentView();
                C89219l.m154716b(contentView4, "");
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(contentView4.findViewById(R.id.ajd), "alpha", 0.0f, 1.0f).setDuration(300L);
                C89219l.m154716b(duration3, "");
                duration3.setStartDelay(150);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(duration, duration2, duration3);
                animatorSet.start();
            }
        }
    }

    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        getContentView().removeCallbacks(this.f115723b);
    }

    public C50131bn(Context context) {
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4345);
        setContentView(LayoutInflater.from(context).inflate(R.layout.tb, (ViewGroup) null));
        setWidth((int) C13628n.m24520b(context, 180.0f));
        setHeight(-2);
        setAnimationStyle(R.style.vz);
        MethodCollector.m26664o(4345);
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        getContentView().post(new RunnableC50133b(this));
        getContentView().removeCallbacks(this.f115723b);
        getContentView().postDelayed(this.f115723b, 3000);
    }
}
