package com.p2082ss.android.ugc.aweme.tools.mvtemplate.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.NoScrollViewPager;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78962g;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager */
public class MvThemeListViewPager extends NoScrollViewPager {

    /* renamed from: a */
    public boolean f177547a;

    /* renamed from: b */
    public AbstractC79007a f177548b;

    /* renamed from: c */
    private float f177549c;

    /* renamed from: d */
    private float f177550d;

    /* renamed from: e */
    private int f177551e;

    /* renamed from: f */
    private boolean f177552f;

    /* renamed from: g */
    private float f177553g;

    /* renamed from: h */
    private float f177554h;

    /* renamed from: i */
    private boolean f177555i = true;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager$a */
    public interface AbstractC79007a {
        static {
            Covode.recordClassIndex(92169);
        }

        /* renamed from: a */
        void mo122662a();

        /* renamed from: a */
        void mo122663a(float f);
    }

    static {
        Covode.recordClassIndex(92167);
    }

    public void setBounceScrollListener(AbstractC79007a aVar) {
        this.f177548b = aVar;
    }

    public void setHandleClickChange(boolean z) {
        this.f177555i = z;
    }

    /* renamed from: a */
    private boolean m137830a(MotionEvent motionEvent) {
        if ((this.f177551e != 0 || motionEvent.getX() <= this.f177553g) && (getAdapter() == null || this.f177551e != getAdapter().getCount() - 1 || motionEvent.getX() >= this.f177553g)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.NoScrollViewPager, androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f177553g = motionEvent.getX();
            this.f177551e = getCurrentItem();
            this.f177554h = getTranslationX();
        } else if (action == 2 && m137830a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.NoScrollViewPager, androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f177547a || getAdapter() == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            if (getTranslationX() != this.f177554h && this.f177552f) {
                ValueAnimator duration = ValueAnimator.ofFloat(getTranslationX(), this.f177554h).setDuration(200L);
                duration.addUpdateListener(new C79008a(this));
                duration.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager.C790061 */

                    static {
                        Covode.recordClassIndex(92168);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        MvThemeListViewPager.this.f177547a = false;
                        if (MvThemeListViewPager.this.f177548b != null) {
                            MvThemeListViewPager.this.f177548b.mo122662a();
                        }
                    }
                });
                duration.start();
                this.f177547a = true;
            }
            this.f177552f = false;
        } else if (action == 2 && m137830a(motionEvent)) {
            float x = motionEvent.getX();
            float f = x - this.f177553g;
            if (Math.abs(f) > 4.0f) {
                this.f177552f = true;
                float translationX = getTranslationX() + (f * 0.45f);
                AbstractC79007a aVar = this.f177548b;
                if (aVar != null) {
                    aVar.mo122663a(translationX);
                }
                setTranslationX(translationX);
                this.f177553g = x;
            }
        }
        if (this.f177552f || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        double d;
        double d2;
        int width;
        float rawX;
        MvThemeListViewPager mvThemeListViewPager = this;
        char c = 0;
        if (motionEvent.getAction() == 0) {
            mvThemeListViewPager.f177549c = motionEvent.getX();
            mvThemeListViewPager.f177550d = motionEvent.getY();
            AbstractC81915c.m141874a(new C78962g(C78962g.EnumC78964b.START, C78962g.EnumC78963a.MAIN_TEMPLATE, (byte) 0));
        } else {
            char c2 = 1;
            if (motionEvent.getAction() == 1 && mvThemeListViewPager.f177555i) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - mvThemeListViewPager.f177549c) > 60.0f || Math.abs(y - mvThemeListViewPager.f177550d) > 60.0f) {
                    super.dispatchTouchEvent(motionEvent);
                } else {
                    int childCount = getChildCount();
                    int currentItem = getCurrentItem();
                    int[] iArr = new int[2];
                    int i = 0;
                    while (true) {
                        if (i >= childCount) {
                            break;
                        }
                        View childAt = mvThemeListViewPager.getChildAt(i);
                        int intValue = ((Integer) childAt.getTag()).intValue();
                        childAt.getLocationOnScreen(iArr);
                        int i2 = iArr[c];
                        int i3 = iArr[c2];
                        int width2 = iArr[c] + childAt.getWidth();
                        int height = iArr[c2] + childAt.getHeight();
                        if (intValue < currentItem) {
                            double d3 = (double) width2;
                            double width3 = (double) (((float) childAt.getWidth()) * 0.100000024f);
                            Double.isNaN(width3);
                            double width4 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width4);
                            Double.isNaN(d3);
                            width2 = (int) (d3 - ((width3 * 0.5d) + (width4 * 0.5d)));
                            d = (double) i2;
                            double width5 = (double) (((float) childAt.getWidth()) * 0.100000024f);
                            Double.isNaN(width5);
                            double width6 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width6);
                            d2 = (width5 * 0.5d) + (width6 * 0.5d);
                            Double.isNaN(d);
                        } else if (intValue == currentItem) {
                            width = (int) (((float) i2) + (((float) childAt.getWidth()) * Math.abs(0.0f)));
                            rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            if (rawX > ((float) width) || rawX >= ((float) width2) || rawY <= ((float) i3) || rawY >= ((float) height)) {
                                i++;
                                c = 0;
                                c2 = 1;
                                mvThemeListViewPager = this;
                            } else {
                                int intValue2 = ((Integer) childAt.getTag()).intValue();
                                if (getCurrentItem() != intValue2) {
                                    setCurrentItem(intValue2, true);
                                }
                            }
                        } else {
                            double d4 = (double) width2;
                            double width7 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width7);
                            Double.isNaN(d4);
                            width2 = (int) (d4 - (width7 * 0.5d));
                            d = (double) i2;
                            double width8 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width8);
                            d2 = width8 * 0.5d;
                            Double.isNaN(d);
                        }
                        width = (int) (d - d2);
                        rawX = motionEvent.getRawX();
                        float rawY2 = motionEvent.getRawY();
                        if (rawX > ((float) width)) {
                        }
                        i++;
                        c = 0;
                        c2 = 1;
                        mvThemeListViewPager = this;
                    }
                    super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public MvThemeListViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
