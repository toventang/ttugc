package com.bytedance.android.livesdk.usercard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class LivingView extends FrameLayout {

    /* renamed from: a */
    private static final int f26282a = C3966y.m9653a(32.0f);

    /* renamed from: b */
    private static final int f26283b = C3966y.m9653a(40.0f);

    /* renamed from: c */
    private static final int f26284c = C3966y.m9653a(48.0f);

    /* renamed from: d */
    private static final int f26285d = C3966y.m9653a(56.0f);

    /* renamed from: e */
    private static final int f26286e = C3966y.m9653a(64.0f);

    /* renamed from: f */
    private static final int f26287f = C3966y.m9653a(68.0f);

    /* renamed from: g */
    private static final int f26288g = C3966y.m9653a(72.0f);

    /* renamed from: h */
    private static final int f26289h = C3966y.m9653a(80.0f);

    /* renamed from: i */
    private static final int f26290i = C3966y.m9653a(13.0f);

    /* renamed from: j */
    private static final int f26291j = C3966y.m9653a(33.0f);

    /* renamed from: k */
    private static final int f26292k = C3966y.m9653a(14.0f);

    /* renamed from: l */
    private static final int f26293l = C3966y.m9653a(50.0f);

    /* renamed from: m */
    private static final int f26294m = C3966y.m9653a(20.0f);

    /* renamed from: n */
    private static final int f26295n = C3966y.m9653a(49.5f);

    /* renamed from: o */
    private static final int f26296o = C3966y.m9653a(21.0f);

    /* renamed from: p */
    private TextView f26297p;

    /* renamed from: q */
    private C10951ah f26298q;

    static {
        Covode.recordClassIndex(12552);
    }

    public LivingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        MethodCollector.m26663i(3669);
        this.f26297p.setTextColor(C3966y.m9663b((int) R.color.xu));
        this.f26297p.setBackgroundResource(2131234224);
        this.f26297p.setText(R.string.gis);
        this.f26297p.setGravity(17);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i5 = layoutParams.width;
        int i6 = layoutParams.height;
        float f = 10.0f;
        int i7 = 0;
        if (i5 == f26282a) {
            i4 = C3966y.m9653a(5.0f);
            i7 = i5 - (i4 * 2);
            i3 = f26290i;
            f = 8.0f;
        } else {
            if (i5 == f26283b) {
                i7 = f26291j;
                i3 = f26292k;
                i4 = (i5 - i7) / 2;
            } else if (i5 == f26284c) {
                i4 = C3966y.m9653a(8.0f);
                i3 = (int) (((float) C3966y.m9653a(6.0f)) + C3966y.m9661b(10.0f));
                i7 = i5 - (i4 * 2);
            } else if (i5 == f26285d) {
                i7 = f26291j;
                i3 = f26292k;
                i4 = (i5 - i7) / 2;
            } else {
                if (i5 == f26287f) {
                    i5 += C3966y.m9653a(8.0f);
                    i6 += C3966y.m9653a(8.0f);
                } else if (i5 == f26288g) {
                    i7 = f26293l;
                    i3 = f26294m;
                    f = 12.0f;
                    i4 = (i5 - i7) / 2;
                } else if (i5 == f26289h) {
                    i5 += C3966y.m9653a(8.0f);
                    i6 += C3966y.m9653a(8.0f);
                    f = 13.5f;
                    i7 = f26295n;
                    i3 = f26296o;
                    i4 = (i5 - i7) / 2;
                }
                i3 = 0;
                f = 0.0f;
                i4 = 0;
            }
            f = 9.0f;
        }
        this.f26298q.getLayoutParams().width = i5;
        this.f26298q.getLayoutParams().height = i6;
        this.f26297p.setTextSize(f);
        this.f26297p.getLayoutParams().width = i7;
        this.f26297p.getLayoutParams().height = i3;
        if (this.f26297p.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) this.f26297p.getLayoutParams()).topMargin = i6 - i3;
            ((FrameLayout.LayoutParams) this.f26297p.getLayoutParams()).leftMargin = i4;
            ((FrameLayout.LayoutParams) this.f26297p.getLayoutParams()).rightMargin = i4;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        MethodCollector.m26664o(3669);
    }

    private LivingView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, -1);
        MethodCollector.m26663i(3482);
        this.f26297p = new LiveTextView(context);
        C10951ah ahVar = new C10951ah(context);
        this.f26298q = ahVar;
        addView(ahVar);
        addView(this.f26297p);
        this.f26297p.setVisibility(8);
        this.f26298q.setVisibility(8);
        MethodCollector.m26664o(3482);
    }
}
