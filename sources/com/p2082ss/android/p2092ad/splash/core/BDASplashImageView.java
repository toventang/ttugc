package com.p2082ss.android.p2092ad.splash.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29457c;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ad.splash.core.BDASplashImageView */
public class BDASplashImageView extends ImageView {

    /* renamed from: a */
    public C29455b f69769a;

    /* renamed from: b */
    private AbstractC29541p f69770b;

    /* renamed from: c */
    private float f69771c;

    /* renamed from: d */
    private float f69772d;

    static {
        Covode.recordClassIndex(35780);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    public boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: package-private */
    public void setInteraction(AbstractC29541p pVar) {
        this.f69770b = pVar;
    }

    public BDASplashImageView(Context context) {
        super(context);
        MethodCollector.m26663i(13238);
        MethodCollector.m26664o(13238);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.f69769a.f70039q != 4) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f69771c = motionEvent.getX();
            this.f69772d = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            C29457c.C29458a aVar = new C29457c.C29458a();
            float f = this.f69771c;
            float f2 = this.f69772d;
            int width = getWidth();
            int height = getHeight();
            float f3 = (float) width;
            if (f3 > 0.0f) {
                float f4 = (float) height;
                if (f4 > 0.0f) {
                    float f5 = f / f3;
                    float f6 = f2 / f4;
                    int i3 = 2;
                    if (f5 < 0.33f) {
                        i2 = 0;
                    } else if (0.33f > f5 || f5 > 0.67f) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    if (f6 < 0.33f) {
                        i3 = 0;
                    } else if (0.33f <= f6 && f6 <= 0.67f) {
                        i3 = 1;
                    }
                    i = (i3 * 3) + i2;
                    aVar.f70059a = i;
                    this.f69770b.mo51661a(this.f69769a, aVar.mo51556a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo51557a());
                }
            }
            i = -1;
            aVar.f70059a = i;
            this.f69770b.mo51661a(this.f69769a, aVar.mo51556a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo51557a());
        }
        return true;
    }

    public BDASplashImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(13304);
        MethodCollector.m26664o(13304);
    }
}
