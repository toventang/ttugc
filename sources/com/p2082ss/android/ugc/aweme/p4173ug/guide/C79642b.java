package com.p2082ss.android.ugc.aweme.p4173ug.guide;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39191c;
import com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.b */
public final class C79642b {

    /* renamed from: d */
    public static boolean f178719d = true;

    /* renamed from: e */
    public static final C79643a f178720e = new C79643a((byte) 0);

    /* renamed from: a */
    public float f178721a;

    /* renamed from: b */
    public int f178722b;

    /* renamed from: c */
    public final AbstractC39191c f178723c;

    /* renamed from: f */
    private ValueAnimator f178724f;

    /* renamed from: g */
    private final LoadMoreFrameLayout f178725g;

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$a */
    public static final class C79643a {
        static {
            Covode.recordClassIndex(92859);
        }

        private C79643a() {
        }

        public /* synthetic */ C79643a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(92858);
    }

    /* renamed from: a */
    public final void mo123198a() {
        f178719d = false;
        PagerAdapter adapter = this.f178723c.getAdapter();
        C89219l.m154716b(adapter, "");
        if (adapter.getCount() - 1 == this.f178723c.getCurrentItem()) {
            this.f178725g.mo85756g();
            return;
        }
        ValueAnimator valueAnimator = this.f178724f;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            View childAt = this.f178723c.getChildAt(0);
            C89219l.m154716b(childAt, "");
            this.f178721a = (((float) childAt.getHeight()) * -1.0f) / 100.0f;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
            this.f178724f = ofInt;
            if (ofInt != null) {
                ofInt.addUpdateListener(new C79644b(this));
            }
            ValueAnimator valueAnimator2 = this.f178724f;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new C79645c(this));
            }
            ValueAnimator valueAnimator3 = this.f178724f;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$c */
    public static final class C79645c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C79642b f178727a;

        static {
            Covode.recordClassIndex(92861);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C79645c(C79642b bVar) {
            this.f178727a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f178727a.f178723c.mo67983c();
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f178727a.f178723c.mo67981b()) {
                this.f178727a.f178723c.mo67987d();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f178727a.f178723c.mo67981b()) {
                this.f178727a.f178723c.mo67987d();
            }
            this.f178727a.f178722b = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$b */
    public static final class C79644b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C79642b f178726a;

        static {
            Covode.recordClassIndex(92860);
        }

        C79644b(C79642b bVar) {
            this.f178726a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f178726a.f178723c.mo67981b()) {
                AbstractC39191c cVar = this.f178726a.f178723c;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                cVar.mo67970a(((float) (((Integer) animatedValue).intValue() - this.f178726a.f178722b)) * this.f178726a.f178721a);
            }
            C79642b bVar = this.f178726a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            bVar.f178722b = ((Integer) animatedValue2).intValue();
        }
    }

    public C79642b(AbstractC39191c cVar, LoadMoreFrameLayout loadMoreFrameLayout) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(loadMoreFrameLayout, "");
        this.f178723c = cVar;
        this.f178725g = loadMoreFrameLayout;
    }
}
