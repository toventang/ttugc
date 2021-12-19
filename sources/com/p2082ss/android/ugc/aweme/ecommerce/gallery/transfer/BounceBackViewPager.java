package com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import dmt.viewpager.DmtRtlViewPager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.BounceBackViewPager */
public final class BounceBackViewPager extends DmtRtlViewPager {

    /* renamed from: e */
    public static final C44494a f103716e = new C44494a((byte) 0);

    /* renamed from: a */
    public ViewPager.AbstractC1579e f103717a;

    /* renamed from: b */
    public int f103718b;

    /* renamed from: c */
    public float f103719c;

    /* renamed from: d */
    public int f103720d;

    /* renamed from: f */
    private final OverScrollEffect f103721f;

    /* renamed from: m */
    private final Camera f103722m;

    /* renamed from: n */
    private float f103723n;

    /* renamed from: o */
    private int f103724o;

    /* renamed from: p */
    private final int f103725p;

    /* renamed from: q */
    private float f103726q;

    /* renamed from: r */
    private int f103727r;

    static {
        Covode.recordClassIndex(52841);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.BounceBackViewPager$OverScrollEffect */
    final class OverScrollEffect {
        private Animator mAnimator;
        private float mOverscroll;

        static {
            Covode.recordClassIndex(52842);
        }

        public final float getMOverscroll() {
            return this.mOverscroll;
        }

        public final boolean isOverScrolling() {
            PagerAdapter adapter = BounceBackViewPager.this.getAdapter();
            if (adapter == null) {
                return false;
            }
            if (BounceBackViewPager.this.f103718b == 0 && this.mOverscroll < 0.0f) {
                return true;
            }
            if (adapter.getCount() - 1 != BounceBackViewPager.this.f103718b || this.mOverscroll <= 0.0f) {
                return false;
            }
            return true;
        }

        public final void onRelease() {
            Animator animator = this.mAnimator;
            if (animator == null || !animator.isRunning()) {
                startAnimation(0.0f);
                return;
            }
            Animator animator2 = this.mAnimator;
            if (animator2 != null) {
                animator2.addListener(new C44493a(this));
            }
            Animator animator3 = this.mAnimator;
            if (animator3 != null) {
                animator3.cancel();
            }
        }

        public final void setMOverscroll(float f) {
            this.mOverscroll = f;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.BounceBackViewPager$OverScrollEffect$a */
        public static final class C44493a implements Animator.AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ OverScrollEffect f103728a;

            static {
                Covode.recordClassIndex(52843);
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

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C44493a(OverScrollEffect overScrollEffect) {
                this.f103728a = overScrollEffect;
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                this.f103728a.startAnimation(0.0f);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OverScrollEffect() {
        }

        public final void setPull(float f) {
            this.mOverscroll = f;
            BounceBackViewPager.this.mo61357a();
        }

        public final void startAnimation(float f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "pull", this.mOverscroll, f);
            this.mAnimator = ofFloat;
            if (ofFloat != null) {
                ofFloat.setInterpolator(new DecelerateInterpolator());
            }
            float abs = Math.abs(f - this.mOverscroll);
            Animator animator = this.mAnimator;
            if (animator != null) {
                animator.setDuration((long) (((float) BounceBackViewPager.this.getOverScrollAnimationDuration()) * abs));
            }
            Animator animator2 = this.mAnimator;
            if (animator2 != null) {
                animator2.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.BounceBackViewPager$a */
    public static final class C44494a {
        static {
            Covode.recordClassIndex(52844);
        }

        private C44494a() {
        }

        public /* synthetic */ C44494a(byte b) {
            this();
        }
    }

    public final int getOverScrollAnimationDuration() {
        return this.f103727r;
    }

    public final float getOverScrollTranslation() {
        return this.f103726q;
    }

    /* renamed from: a */
    public final void mo61357a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).invalidate();
        }
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public final void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        this.f103717a = eVar;
    }

    public final void setOverScrollAnimationDuration(int i) {
        this.f103727r = i;
    }

    public final void setOverScrollTranslation(int i) {
        this.f103726q = (float) i;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.BounceBackViewPager$b */
    final class C44495b implements ViewPager.AbstractC1579e {
        static {
            Covode.recordClassIndex(52845);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C44495b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            ViewPager.AbstractC1579e eVar = BounceBackViewPager.this.f103717a;
            if (eVar != null) {
                eVar.onPageSelected(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            ViewPager.AbstractC1579e eVar = BounceBackViewPager.this.f103717a;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i);
            }
            if (i == 0) {
                BounceBackViewPager.this.f103719c = 0.0f;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            ViewPager.AbstractC1579e eVar = BounceBackViewPager.this.f103717a;
            if (eVar != null) {
                eVar.onPageScrolled(i, f, i2);
            }
            BounceBackViewPager.this.f103718b = i;
            BounceBackViewPager.this.f103719c = f;
            BounceBackViewPager.this.f103720d = i;
            BounceBackViewPager.this.mo61357a();
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        try {
            z = super.dispatchTouchEvent(motionEvent);
            return z;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return z;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e2.printStackTrace();
            return z;
        }
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        try {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f103723n = motionEvent.getX();
                this.f103724o = motionEvent.getPointerId(0);
            } else if (action == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f103723n = motionEvent.getX(actionIndex);
                this.f103724o = motionEvent.getPointerId(actionIndex);
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BounceBackViewPager(Context context) {
        super(context, null);
        if (context == null) {
            C89219l.m154715b();
        }
        this.f103721f = new OverScrollEffect();
        this.f103722m = new Camera();
        setStaticTransformationsEnabled(true);
        this.f103725p = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        super.setOnPageChangeListener(new C44495b());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.pa, R.attr.pb});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f103726q = obtainStyledAttributes.getDimension(1, 400.0f);
        this.f103727r = obtainStyledAttributes.getInt(0, 400);
        obtainStyledAttributes.recycle();
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int i2 = this.f103724o;
                    if (i2 != -1) {
                        float x = motionEvent.getX(motionEvent.findPointerIndex(i2));
                        float f = this.f103723n - x;
                        getScrollX();
                        int width = getWidth();
                        int pageMargin = getPageMargin() + width;
                        PagerAdapter adapter = getAdapter();
                        if (adapter == null) {
                            C89219l.m154715b();
                        }
                        int count = adapter.getCount() - 1;
                        int currentItem = getCurrentItem();
                        float max = (float) Math.max(0, (currentItem - 1) * pageMargin);
                        float f2 = (float) pageMargin;
                        float min = ((float) Math.min(currentItem + 1, count)) * f2;
                        if (this.f103719c != 0.0f) {
                            this.f103723n = x;
                        } else if (currentItem == 0) {
                            if (max == 0.0f) {
                                this.f103721f.setPull((f + ((float) this.f103725p)) / ((float) width));
                            }
                        } else if (count == currentItem && min == ((float) count) * f2) {
                            this.f103721f.setPull((f - ((float) this.f103725p)) / ((float) width));
                        }
                    } else {
                        this.f103721f.onRelease();
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f103723n = motionEvent.getX(actionIndex);
                        this.f103724o = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        int action2 = (motionEvent.getAction() & 65280) >> 8;
                        if (motionEvent.getPointerId(action2) == this.f103724o) {
                            if (action2 == 0) {
                                i = 1;
                            }
                            this.f103723n = motionEvent.getX(i);
                            this.f103724o = motionEvent.getPointerId(i);
                        }
                    }
                    i = 1;
                }
            }
            this.f103724o = -1;
            this.f103721f.onRelease();
            i = 1;
        } else {
            this.f103723n = motionEvent.getX();
            this.f103724o = motionEvent.getPointerId(0);
            i = 1;
        }
        if (!this.f103721f.isOverScrolling() || i != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean getChildStaticTransformation(View view, Transformation transformation) {
        boolean z;
        float max;
        C89219l.m154721d(view, "");
        C89219l.m154721d(transformation, "");
        if (view.getWidth() == 0) {
            return false;
        }
        int i = this.f103718b;
        if (i != 0) {
            PagerAdapter adapter = getAdapter();
            if (adapter == null) {
                C89219l.m154715b();
            }
            if (i != adapter.getCount() - 1) {
                z = false;
                if (this.f103721f.isOverScrolling() || !z) {
                    return false;
                }
                float width = ((float) getWidth()) / 2.0f;
                int height = getHeight() / 2;
                transformation.getMatrix().reset();
                float f = this.f103726q;
                if (this.f103721f.getMOverscroll() > 0.0f) {
                    max = Math.min(this.f103721f.getMOverscroll(), 1.0f);
                } else {
                    max = Math.max(this.f103721f.getMOverscroll(), -1.0f);
                }
                this.f103722m.save();
                this.f103722m.translate(-(f * max), 0.0f, 0.0f);
                this.f103722m.getMatrix(transformation.getMatrix());
                this.f103722m.restore();
                float f2 = (float) height;
                transformation.getMatrix().preTranslate(-width, -f2);
                transformation.getMatrix().postTranslate(width, f2);
                if (getChildCount() == 1) {
                    invalidate();
                } else {
                    view.invalidate();
                }
                return true;
            }
        }
        z = true;
        if (this.f103721f.isOverScrolling()) {
        }
        return false;
    }
}
