package com.p2082ss.android.ugc.aweme.effect;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p1999a.C27245k;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73833z;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ss.android.ugc.aweme.effect.VEEffectSeekLayout */
public class VEEffectSeekLayout extends RelativeLayout {

    /* renamed from: a */
    public int f107819a;

    /* renamed from: b */
    public ArrayList<EffectPointModel> f107820b;

    /* renamed from: c */
    public int f107821c;

    /* renamed from: d */
    public AbstractC73833z f107822d;

    /* renamed from: e */
    public int f107823e;

    /* renamed from: f */
    private VEEffectSeekBar f107824f;

    /* renamed from: g */
    private TextView f107825g;

    /* renamed from: h */
    private TextView f107826h;

    /* renamed from: i */
    private FrameLayout f107827i;

    /* renamed from: j */
    private int f107828j;

    static {
        Covode.recordClassIndex(54838);
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        return this.f107820b;
    }

    public int getCursorPosition() {
        return mo78713a(this.f107827i, 1);
    }

    public int getCursorOffsetTime() {
        return (int) ((((float) ((int) C13628n.m24520b(getContext(), 21.0f))) / ((float) C46351d.f108045a)) * ((float) this.f107828j));
    }

    public void setOnCursorSeekListener(AbstractC73833z zVar) {
        this.f107822d = zVar;
    }

    /* renamed from: a */
    public final void mo78719a(boolean z) {
        this.f107824f.mo78706a(z);
    }

    public void setNormalColor(int i) {
        this.f107824f.setNormalColor(i);
    }

    public void setOverlayColor(int i) {
        this.f107824f.setOverlayColor(i);
    }

    /* renamed from: a */
    public final void mo78714a(int i) {
        this.f107820b.remove(m89255e(i));
        this.f107824f.postInvalidate();
    }

    /* renamed from: b */
    public final int mo78721b(int i) {
        float b;
        if (i == 1) {
            b = C13628n.m24520b(getContext(), 4.0f);
        } else {
            b = C13628n.m24520b(getContext(), 30.0f);
        }
        return (int) b;
    }

    public void setStartTime(int i) {
        if (i > this.f107828j - getCursorOffsetTime()) {
            i = this.f107828j;
        }
        this.f107826h.setText(m89254d(i));
    }

    public void setVideoDuration(int i) {
        VEEffectSeekBar vEEffectSeekBar = this.f107824f;
        if (vEEffectSeekBar != null) {
            this.f107828j = i;
            vEEffectSeekBar.setDuration(i);
            this.f107825g.setText(m89254d(i));
        }
    }

    /* renamed from: d */
    private static String m89254d(int i) {
        StringBuilder sb = new StringBuilder();
        double d = (double) i;
        Double.isNaN(d);
        String sb2 = sb.append((int) Math.floor(d / 1000.0d)).toString();
        if (sb2.length() < 2) {
            sb2 = "0".concat(String.valueOf(sb2));
        }
        return "00:".concat(String.valueOf(sb2));
    }

    /* renamed from: e */
    private EffectPointModel m89255e(int i) {
        try {
            ArrayList<EffectPointModel> arrayList = this.f107820b;
            C46326bl blVar = new C46326bl(i);
            Iterator<T> it = arrayList.iterator();
            C27245k.m54229a(it);
            C27245k.m54229a(blVar);
            while (it.hasNext()) {
                T next = it.next();
                if (blVar.mo45331a(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo78722c(int i) {
        int b = C46351d.f108045a - mo78721b(1);
        int i2 = (int) ((((float) i) / ((float) this.f107828j)) * ((float) b));
        if (i2 >= b) {
            i2 = this.f107819a + b;
        }
        if (i2 <= 0) {
            i2 = -this.f107819a;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f107827i.getLayoutParams();
        layoutParams.setMargins(i2, 0, 0, 0);
        this.f107827i.setLayoutParams(layoutParams);
        setStartTime(i);
    }

    public VEEffectSeekLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.VEEffectSeekLayout$a */
    class View$OnTouchListenerC46262a implements View.OnTouchListener {

        /* renamed from: b */
        private FrameLayout f107830b;

        /* renamed from: c */
        private RelativeLayout.LayoutParams f107831c;

        /* renamed from: d */
        private int f107832d = 1;

        static {
            Covode.recordClassIndex(54839);
        }

        View$OnTouchListenerC46262a(FrameLayout frameLayout) {
            this.f107830b = frameLayout;
            this.f107831c = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        }

        /* renamed from: a */
        private float m89266a(float f, int i) {
            int b = VEEffectSeekLayout.this.mo78721b(i);
            if (f < ((float) VEEffectSeekLayout.this.f107823e)) {
                return (float) (-VEEffectSeekLayout.this.f107819a);
            }
            if (f > ((float) (((int) C13628n.m24520b(VEEffectSeekLayout.this.getContext(), (float) (VEEffectSeekLayout.this.f107821c - 24))) - b))) {
                return ((C13628n.m24520b(VEEffectSeekLayout.this.getContext(), (float) VEEffectSeekLayout.this.f107821c) - ((float) (VEEffectSeekLayout.this.f107823e * 2))) - ((float) b)) + ((float) VEEffectSeekLayout.this.f107819a);
            }
            float f2 = f - ((float) VEEffectSeekLayout.this.f107823e);
            return f2 + (((float) VEEffectSeekLayout.this.f107819a) * (((2.0f * f2) / ((C13628n.m24520b(VEEffectSeekLayout.this.getContext(), (float) VEEffectSeekLayout.this.f107821c) - ((float) (VEEffectSeekLayout.this.f107823e * 2))) - ((float) b))) - 4.0f));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            if (r0 != 3) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.effect.VEEffectSeekLayout.View$OnTouchListenerC46262a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: a */
    public final void mo78715a(int i, int i2) {
        if (!this.f107820b.isEmpty()) {
            EffectPointModel e = m89255e(i);
            if (e != null) {
                e.setUiEndPoint(i2);
            }
            this.f107824f.postInvalidate();
        }
        mo78722c(i2);
    }

    /* renamed from: a */
    public final int mo78713a(FrameLayout frameLayout, int i) {
        if (frameLayout == null) {
            return 0;
        }
        int left = (int) ((((float) (frameLayout.getLeft() - this.f107823e)) / ((float) C46351d.f108045a)) * ((float) this.f107828j));
        int i2 = this.f107828j;
        int b = (int) ((((float) mo78721b(i)) / ((float) C46351d.f108045a)) * ((float) i2));
        if (left < 0) {
            return 0;
        }
        return left > i2 - b ? i2 : left;
    }

    /* renamed from: a */
    public final void mo78716a(int i, long j) {
        EffectPointModel e = m89255e(i);
        if (e != null) {
            e.setUiEndPoint((int) j);
            this.f107824f.postInvalidate();
        }
    }

    /* renamed from: a */
    public final void mo78718a(List<EffectPointModel> list, boolean z) {
        this.f107820b.clear();
        this.f107820b.addAll(list);
        this.f107824f.mo78705a(this.f107820b, z);
    }

    /* renamed from: a */
    public final void mo78720a(boolean z, int i) {
        this.f107824f.mo78707a(z, i);
    }

    private VEEffectSeekLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(6611);
        this.f107821c = C13628n.m24522c(context, (float) C13628n.m24504a(context));
        this.f107819a = (int) C13628n.m24520b(context, 0.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q9, R.attr.qp, R.attr.qq, R.attr.ux, R.attr.uy, R.attr.a1t, R.attr.a5e, R.attr.a5f, R.attr.a69, R.attr.a7h, R.attr.abt, R.attr.act, R.attr.af6});
            this.f107823e = Math.round(obtainStyledAttributes.getDimension(11, ((float) Math.round(obtainStyledAttributes.getDimension(5, 0.0f))) - ((float) C70082m.f156702d))) + C70082m.f156702d;
            obtainStyledAttributes.recycle();
        }
        int i = Build.VERSION.SDK_INT;
        setLayoutDirection(0);
        LayoutInflater.from(getContext()).inflate(R.layout.et, this);
        this.f107820b = new ArrayList<>();
        this.f107824f = (VEEffectSeekBar) findViewById(R.id.at6);
        this.f107825g = (TextView) findViewById(R.id.evt);
        this.f107826h = (TextView) findViewById(R.id.f4a);
        this.f107827i = (FrameLayout) findViewById(R.id.dl_);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6a});
        int color = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        this.f107824f.setNormalColor(color);
        this.f107827i.setOnTouchListener(new View$OnTouchListenerC46262a(this.f107827i));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f107827i.getLayoutParams();
        layoutParams.setMargins(-this.f107819a, 0, 0, 0);
        this.f107827i.setLayoutParams(layoutParams);
        ((ImageView) findViewById(R.id.eud)).setImageDrawable(C84916a.m145947a(0, -1, 1, (int) C13628n.m24520b(getContext(), 2.0f)));
        findViewById(R.id.u0).setBackground(C84916a.m145947a(C77795c.m135909a(), 0, (int) C13628n.m24520b(getContext(), 1.0f), 0));
        View findViewById = findViewById(R.id.at7);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        int i2 = this.f107823e;
        layoutParams2.rightMargin = i2;
        layoutParams2.leftMargin = i2;
        findViewById.setLayoutParams(layoutParams2);
        MethodCollector.m26664o(6611);
    }

    /* renamed from: a */
    public final void mo78717a(int i, long j, int i2, boolean z) {
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setIndex(i);
        int i3 = (int) j;
        effectPointModel.setUiStartPoint(i3);
        effectPointModel.setUiEndPoint(i3);
        effectPointModel.setSelectedColor(i2);
        effectPointModel.setFromEnd(z);
        this.f107820b.add(effectPointModel);
        this.f107824f.mo78705a(this.f107820b, z);
    }
}
