package com.p2082ss.android.ugc.aweme.share.p3776ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;
import com.p2082ss.android.ugc.aweme.experiment.C46971gf;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ui.SharePublishLayout */
public final class SharePublishLayout extends PullUpLayout {

    /* renamed from: f */
    public AbstractC17242a f155205f;

    static {
        Covode.recordClassIndex(81818);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ui.SharePublishLayout$a */
    public static final class C69479a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ SharePublishLayout f155206a;

        /* renamed from: b */
        final /* synthetic */ boolean f155207b;

        static {
            Covode.recordClassIndex(81819);
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            if (this.f155207b) {
                AbstractC17242a aVar = this.f155206a.f155205f;
                if (aVar != null) {
                    aVar.mo27279b();
                    return;
                }
                return;
            }
            AbstractC17242a aVar2 = this.f155206a.f155205f;
            if (aVar2 != null) {
                aVar2.mo27278a();
            }
        }

        C69479a(SharePublishLayout sharePublishLayout, boolean z) {
            this.f155206a = sharePublishLayout;
            this.f155207b = z;
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout
    public final void setPullUpListener(AbstractC17242a aVar) {
        C89219l.m154721d(aVar, "");
        if (C46971gf.m90249b()) {
            this.f155205f = aVar;
        } else {
            super.setPullUpListener(aVar);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() != 2) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (!C46971gf.m90249b()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        float y = motionEvent.getY() - this.f41173b;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f41172a);
        C89219l.m154716b(viewConfiguration, "");
        if (y > ((float) viewConfiguration.getScaledTouchSlop())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() != 2) {
            return super.onTouchEvent(motionEvent);
        }
        if (!C46971gf.m90249b()) {
            return super.onTouchEvent(motionEvent);
        }
        if (!mo27264a(motionEvent)) {
            return false;
        }
        int max = (int) Math.max(0.0f, motionEvent.getY() - this.f41173b);
        View view = this.f41174c;
        if (view == null) {
            return true;
        }
        view.setTranslationY((float) max);
        return true;
    }

    public SharePublishLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout
    /* renamed from: a */
    public final void mo27262a(float f, boolean z) {
        ObjectAnimator ofFloat;
        if (C46971gf.m90249b()) {
            if (z) {
                View view = this.f41174c;
                View view2 = this.f41174c;
                C89219l.m154716b(view2, "");
                ofFloat = ObjectAnimator.ofFloat(view, "translationY", f, (float) view2.getHeight());
                C89219l.m154716b(ofFloat, "");
            } else {
                ofFloat = ObjectAnimator.ofFloat(this.f41174c, "translationY", f, 0.0f);
                C89219l.m154716b(ofFloat, "");
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.play(ofFloat);
            animatorSet.addListener(new C69479a(this, z));
            animatorSet.start();
            return;
        }
        super.mo27262a(f, z);
    }
}
