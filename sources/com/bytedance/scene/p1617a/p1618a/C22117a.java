package com.bytedance.scene.p1617a.p1618a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.p048g.p049a.p050a.C0995b;
import androidx.p048g.p049a.p050a.C0996c;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.p1617a.AbstractC22139e;
import com.bytedance.scene.p1617a.C22116a;
import com.bytedance.scene.p1617a.C22144f;

/* renamed from: com.bytedance.scene.a.a.a */
public final class C22117a extends AbstractC22139e {

    /* renamed from: b */
    private C22118b f52299b = new C22118b();

    static {
        Covode.recordClassIndex(25921);
    }

    @Override // com.bytedance.scene.p1617a.AbstractC22139e
    /* renamed from: a */
    public final boolean mo36307a() {
        return true;
    }

    @Override // com.bytedance.scene.p1617a.AbstractC22139e
    /* renamed from: a */
    public final Animator mo36306a(C22116a aVar, C22116a aVar2) {
        if (aVar2.f52298d) {
            return this.f52299b.mo36306a(aVar, aVar2);
        }
        View view = aVar.f52296b;
        View view2 = aVar2.f52296b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 1.0f);
        ofFloat.setInterpolator(new C0995b());
        ofFloat.setDuration(120L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f, 1.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat2.setDuration(120L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, ((float) view2.getHeight()) * 0.08f, 0.0f);
        ofFloat3.setInterpolator(new DecelerateInterpolator(2.5f));
        ofFloat3.setDuration(200L);
        return C22144f.m41623a(ofFloat, ofFloat2, ofFloat3);
    }

    @Override // com.bytedance.scene.p1617a.AbstractC22139e
    /* renamed from: b */
    public final Animator mo36308b(C22116a aVar, C22116a aVar2) {
        if (aVar.f52298d) {
            return this.f52299b.mo36308b(aVar, aVar2);
        }
        View view = aVar2.f52296b;
        View view2 = aVar.f52296b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150L);
        ofFloat.setStartDelay(50);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f, ((float) view.getHeight()) * 0.08f);
        ofFloat2.setInterpolator(new AccelerateInterpolator(2.0f));
        ofFloat2.setDuration(200L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.ALPHA, 0.7f, 1.0f);
        ofFloat3.setInterpolator(new C0996c());
        ofFloat3.setDuration(200L);
        return C22144f.m41623a(ofFloat, ofFloat2, ofFloat3);
    }
}
