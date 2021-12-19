package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0792v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.C26634a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p1951a.C26555a;
import com.google.android.material.p1960i.C26650c;
import java.util.ArrayList;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout.AbstractC0556a {

    /* renamed from: a */
    public final C26650c f62808a;

    /* renamed from: b */
    public final C26594a f62809b;

    /* renamed from: c */
    public Animator f62810c;

    /* renamed from: d */
    public Animator f62811d;

    /* renamed from: e */
    public Animator f62812e;

    /* renamed from: f */
    public int f62813f;

    /* renamed from: g */
    public boolean f62814g;

    /* renamed from: h */
    AnimatorListenerAdapter f62815h;

    /* renamed from: i */
    private final int f62816i;

    /* renamed from: j */
    private boolean f62817j;

    static {
        Covode.recordClassIndex(32028);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setTitle(CharSequence charSequence) {
    }

    public final int getFabAlignmentMode() {
        return this.f62813f;
    }

    public final boolean getHideOnScroll() {
        return this.f62817j;
    }

    private float getFabTranslationX() {
        return (float) m52718a(this.f62813f);
    }

    public final ColorStateList getBackgroundTint() {
        return this.f62808a.f63060i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0556a
    public final CoordinatorLayout.AbstractC0557b<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public final float getCradleVerticalOffset() {
        return this.f62809b.f62832d;
    }

    public final float getFabCradleMargin() {
        return this.f62809b.f62830b;
    }

    public final float getFabCradleRoundedCornerRadius() {
        return this.f62809b.f62829a;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: b */
        private final Rect f62826b = new Rect();

        static {
            Covode.recordClassIndex(32033);
        }

        public Behavior() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        /* renamed from: a */
        public final /* synthetic */ void mo43864a(BottomAppBar bottomAppBar) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            super.mo43864a(bottomAppBar2);
            FloatingActionButton a = bottomAppBar2.mo43871a();
            if (a != null) {
                a.clearAnimation();
                a.animate().translationY(bottomAppBar2.getFabTranslationY()).setInterpolator(C26555a.f62658d).setDuration(225);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        /* renamed from: b */
        public final /* synthetic */ void mo43865b(BottomAppBar bottomAppBar) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            super.mo43865b(bottomAppBar2);
            FloatingActionButton a = bottomAppBar2.mo43871a();
            if (a != null) {
                a.mo44026a(this.f62826b);
                float measuredHeight = (float) (a.getMeasuredHeight() - this.f62826b.height());
                a.clearAnimation();
                a.animate().translationY(((float) (-a.getPaddingBottom())) + measuredHeight).setInterpolator(C26555a.f62657c).setDuration(175);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo2524a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton a = bottomAppBar.mo43871a();
            if (a != null) {
                ((CoordinatorLayout.C0560e) a.getLayoutParams()).f2419d = 17;
                AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.f62815h;
                C26634a impl = a.getImpl();
                if (impl.f63007t != null) {
                    impl.f63007t.remove(animatorListenerAdapter);
                }
                AnimatorListenerAdapter animatorListenerAdapter2 = bottomAppBar.f62815h;
                C26634a impl2 = a.getImpl();
                if (impl2.f63006s != null) {
                    impl2.f63006s.remove(animatorListenerAdapter2);
                }
                AnimatorListenerAdapter animatorListenerAdapter3 = bottomAppBar.f62815h;
                C26634a impl3 = a.getImpl();
                if (impl3.f63007t == null) {
                    impl3.f63007t = new ArrayList<>();
                }
                impl3.f63007t.add(animatorListenerAdapter3);
                AnimatorListenerAdapter animatorListenerAdapter4 = bottomAppBar.f62815h;
                C26634a impl4 = a.getImpl();
                if (impl4.f63006s == null) {
                    impl4.f63006s = new ArrayList<>();
                }
                impl4.f63006s.add(animatorListenerAdapter4);
                Rect rect = this.f62826b;
                rect.set(0, 0, a.getMeasuredWidth(), a.getMeasuredHeight());
                a.mo44027b(rect);
                bottomAppBar.setFabDiameter(this.f62826b.height());
            }
            if ((bottomAppBar.f62810c == null || !bottomAppBar.f62810c.isRunning()) && ((bottomAppBar.f62812e == null || !bottomAppBar.f62812e.isRunning()) && (bottomAppBar.f62811d == null || !bottomAppBar.f62811d.isRunning()))) {
                bottomAppBar.mo43873b();
            }
            coordinatorLayout.mo2469a(bottomAppBar, i);
            return super.mo2524a(coordinatorLayout, (View) bottomAppBar, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final /* synthetic */ boolean mo2531a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (!bottomAppBar.getHideOnScroll() || !super.mo2531a(coordinatorLayout, bottomAppBar, view2, view3, i, i2)) {
                return false;
            }
            return true;
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.bottomappbar.BottomAppBar.SavedState.C265931 */

            static {
                Covode.recordClassIndex(32035);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f62827a;

        /* renamed from: b */
        boolean f62828b;

        static {
            Covode.recordClassIndex(32034);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f62827a);
            parcel.writeInt(this.f62828b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.f62827a = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f62828b = z;
        }
    }

    /* renamed from: c */
    private boolean m52719c() {
        FloatingActionButton a = mo43871a();
        if (a == null || !a.getImpl().mo44095f()) {
            return false;
        }
        return true;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f62827a = this.f62813f;
        savedState.f62828b = this.f62814g;
        return savedState;
    }

    /* renamed from: a */
    public final FloatingActionButton mo43871a() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo2478c(this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo43873b() {
        float f;
        this.f62809b.f62833e = getFabTranslationX();
        FloatingActionButton a = mo43871a();
        C26650c cVar = this.f62808a;
        if (!this.f62814g || !m52719c()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        cVar.mo44108a(f);
        if (a != null) {
            a.setTranslationY(getFabTranslationY());
            a.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m52719c()) {
                mo43872a(actionMenuView, 0, false);
            } else {
                mo43872a(actionMenuView, this.f62813f, this.f62814g);
            }
        }
    }

    public final float getFabTranslationY() {
        boolean z = this.f62814g;
        FloatingActionButton a = mo43871a();
        if (a == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        a.mo44026a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) a.getMeasuredHeight();
        }
        float height2 = (float) (a.getHeight() - rect.bottom);
        float height3 = (float) (a.getHeight() - rect.height());
        float f = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float paddingBottom = height3 - ((float) a.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (!z) {
            f = paddingBottom;
        }
        return f2 + f;
    }

    public final void setHideOnScroll(boolean z) {
        this.f62817j = z;
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        C0705a.m2496a(this.f62808a, colorStateList);
    }

    /* renamed from: a */
    private int m52718a(int i) {
        boolean z;
        int i2 = 1;
        if (C0792v.m2768e(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f62816i;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3089d);
        this.f62813f = savedState.f62827a;
        this.f62814g = savedState.f62828b;
    }

    public final void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.f62809b.f62832d = f;
            this.f62808a.invalidateSelf();
        }
    }

    public final void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.f62809b.f62830b = f;
            this.f62808a.invalidateSelf();
        }
    }

    public final void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.f62809b.f62829a = f;
            this.f62808a.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setFabDiameter(int i) {
        float f = (float) i;
        if (f != this.f62809b.f62831c) {
            this.f62809b.f62831c = f;
            this.f62808a.invalidateSelf();
        }
    }

    public final void setFabAlignmentMode(int i) {
        final int i2;
        if (this.f62813f != i && C0792v.m2788v(this)) {
            Animator animator = this.f62811d;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f62814g) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f62809b.f62833e, (float) m52718a(i));
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.bottomappbar.BottomAppBar.C265902 */

                    static {
                        Covode.recordClassIndex(32030);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BottomAppBar.this.f62809b.f62833e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        BottomAppBar.this.f62808a.invalidateSelf();
                    }
                });
                ofFloat.setDuration(300L);
                arrayList.add(ofFloat);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mo43871a(), "translationX", (float) m52718a(i));
            ofFloat2.setDuration(300L);
            arrayList.add(ofFloat2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f62811d = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.google.android.material.bottomappbar.BottomAppBar.C265891 */

                static {
                    Covode.recordClassIndex(32029);
                }

                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.f62811d = null;
                }
            });
            this.f62811d.start();
        }
        final boolean z = this.f62814g;
        if (C0792v.m2788v(this)) {
            Animator animator2 = this.f62812e;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (!m52719c()) {
                z = false;
                i2 = 0;
            } else {
                i2 = i;
            }
            final ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if ((this.f62814g || (z && m52719c())) && (this.f62813f == 1 || i2 == 1)) {
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat4.addListener(new AnimatorListenerAdapter() {
                        /* class com.google.android.material.bottomappbar.BottomAppBar.C265924 */

                        /* renamed from: a */
                        public boolean f62821a;

                        static {
                            Covode.recordClassIndex(32032);
                        }

                        public final void onAnimationCancel(Animator animator) {
                            this.f62821a = true;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!this.f62821a) {
                                BottomAppBar.this.mo43872a(actionMenuView, i2, z);
                            }
                        }
                    });
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150L);
                    animatorSet2.playSequentially(ofFloat4, ofFloat3);
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat3);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f62812e = animatorSet3;
            animatorSet3.addListener(new AnimatorListenerAdapter() {
                /* class com.google.android.material.bottomappbar.BottomAppBar.C265913 */

                static {
                    Covode.recordClassIndex(32031);
                }

                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.f62812e = null;
                }
            });
            this.f62812e.start();
        }
        this.f62813f = i;
    }

    /* renamed from: a */
    public final void mo43872a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2;
        int left;
        float f;
        int right;
        if (C0792v.m2768e(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0376b) && (((Toolbar.C0376b) childAt.getLayoutParams()).f637a & 8388615) == 8388611) {
                if (z2) {
                    right = childAt.getLeft();
                } else {
                    right = childAt.getRight();
                }
                i2 = Math.max(i2, right);
            }
        }
        if (z2) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        int i4 = i2 - left;
        if (i != 1 || !z) {
            f = 0.0f;
        } else {
            f = (float) i4;
        }
        actionMenuView.setTranslationX(f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Animator animator = this.f62810c;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f62812e;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f62811d;
        if (animator3 != null) {
            animator3.cancel();
        }
        mo43873b();
    }
}
