package com.p2082ss.android.ugc.aweme.music.p3465b;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.music.C60818j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.b.m */
public final /* synthetic */ class RunnableC60735m implements Runnable {

    /* renamed from: a */
    private final C60732l f138021a;

    /* renamed from: b */
    private final boolean f138022b;

    static {
        Covode.recordClassIndex(71291);
    }

    public RunnableC60735m(C60732l lVar, boolean z) {
        this.f138021a = lVar;
        this.f138022b = z;
    }

    public final void run() {
        MethodCollector.m26663i(7084);
        C60732l lVar = this.f138021a;
        boolean z = this.f138022b;
        if (lVar.f138013c != null) {
            RecyclerView.ViewHolder f = lVar.f138013c.mo4451f(lVar.f138012b);
            if (f instanceof C60818j) {
                C60818j jVar = (C60818j) f;
                if (z) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(jVar.itemView.getContext(), R.anim.da);
                    loadAnimation.setInterpolator(new LinearInterpolator());
                    jVar.f138215f.setImageResource(2131232639);
                    jVar.f138215f.startAnimation(loadAnimation);
                    MethodCollector.m26664o(7084);
                    return;
                }
                jVar.f138215f.clearAnimation();
                jVar.mo98227a(true);
            }
        }
        MethodCollector.m26664o(7084);
    }
}
