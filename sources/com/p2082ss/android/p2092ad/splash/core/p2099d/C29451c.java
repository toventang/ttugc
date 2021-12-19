package com.p2082ss.android.p2092ad.splash.core.p2099d;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ad.splash.core.d.c */
public final class C29451c extends ViewPager {

    /* renamed from: a */
    private boolean f69969a = true;

    /* renamed from: b */
    private GestureDetector f69970b;

    static {
        Covode.recordClassIndex(35845);
    }

    public final void setEnableScroll(boolean z) {
        this.f69969a = z;
    }

    public final void setGestureDetector(GestureDetector gestureDetector) {
        this.f69970b = gestureDetector;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public C29451c(Context context) {
        super(context);
        setPageTransformer(true, new C29452a());
        setOverScrollMode(2);
    }

    /* renamed from: a */
    private MotionEvent m58993a(MotionEvent motionEvent) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
        return motionEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f69969a) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(m58993a(motionEvent));
        m58993a(motionEvent);
        return onInterceptTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f69969a) {
            return false;
        }
        this.f69970b.onTouchEvent(motionEvent);
        return super.onTouchEvent(m58993a(motionEvent));
    }

    /* renamed from: com.ss.android.ad.splash.core.d.c$a */
    public static class C29452a implements ViewPager.AbstractC1580f {
        static {
            Covode.recordClassIndex(35846);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1580f
        /* renamed from: a */
        public final void mo5330a(View view, float f) {
            if (f < -1.0f || f > 1.0f) {
                view.setAlpha(0.0f);
                return;
            }
            view.setAlpha(1.0f);
            view.setTranslationX(((float) view.getWidth()) * (-f));
            view.setTranslationY(f * ((float) view.getHeight()));
        }
    }
}
