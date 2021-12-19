package com.p2082ss.android.ugc.aweme.detail.p2751ui.p2752a;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.a.a */
public final class C41346a {

    /* renamed from: c */
    public static final C41347a f96505c = new C41347a((byte) 0);

    /* renamed from: a */
    public ValueAnimator f96506a;

    /* renamed from: b */
    public boolean f96507b;

    static {
        Covode.recordClassIndex(49241);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.a.a$a */
    public static final class C41347a {
        static {
            Covode.recordClassIndex(49242);
        }

        private C41347a() {
        }

        public /* synthetic */ C41347a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.a.a$b */
    public static final class C41348b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f96508a;

        static {
            Covode.recordClassIndex(49243);
        }

        public C41348b(View view) {
            this.f96508a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            this.f96508a.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: b */
    private static boolean m83215b(View view) {
        if (view.getVisibility() == 0 && (view instanceof SimpleDraweeView)) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
            if (simpleDraweeView.getDrawable() != null) {
                Drawable drawable = simpleDraweeView.getDrawable();
                C89219l.m154716b(drawable, "");
                if (!drawable.isVisible()) {
                    simpleDraweeView.getDrawable().setVisible(true, false);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo70633a(View view) {
        if (!(view instanceof ViewGroup)) {
            return m83215b(view);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                mo70633a(childAt);
            } else {
                C89219l.m154716b(childAt, "");
                z = m83215b(childAt);
            }
        }
        return z;
    }
}
