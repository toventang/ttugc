package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.ColorSelectLayout */
public class ColorSelectLayout extends FrameLayout {

    /* renamed from: f */
    private static final int[] f107621f = {-1, -16777216, -1425344, -27843, -864954, -8863138, -8861530, -13265168, -14400333, -11053355, -469015, -5994149, -13479364, -13670003, -7170146, -13421773};

    /* renamed from: i */
    private static int f107622i = 16;

    /* renamed from: a */
    AbstractC46212a f107623a;

    /* renamed from: b */
    C46216c f107624b;

    /* renamed from: c */
    private Context f107625c;

    /* renamed from: d */
    private int f107626d;

    /* renamed from: e */
    private int f107627e = 80;

    /* renamed from: g */
    private List<C46214a> f107628g = new ArrayList();

    /* renamed from: h */
    private LinearLayout f107629h;

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.ColorSelectLayout$a */
    public interface AbstractC46212a {
        static {
            Covode.recordClassIndex(54772);
        }

        /* renamed from: a */
        void mo78443a(int i);
    }

    /* renamed from: a */
    public final void mo78437a() {
        for (C46214a aVar : this.f107628g) {
            if (aVar.f107650c) {
                m89127a((View) aVar, true);
                aVar.f107650c = false;
            }
        }
    }

    static {
        Covode.recordClassIndex(54771);
    }

    /* renamed from: b */
    private void m89128b() {
        MethodCollector.m26663i(10883);
        this.f107629h = new LinearLayout(getContext());
        this.f107624b = new C46216c(getContext());
        this.f107624b.addView(this.f107629h, new FrameLayout.LayoutParams(-1, -1));
        int i = 0;
        this.f107624b.setHorizontalScrollBarEnabled(false);
        addView(this.f107624b, new FrameLayout.LayoutParams(-1, -1));
        this.f107628g.clear();
        while (true) {
            int[] iArr = f107621f;
            if (i < iArr.length) {
                int i2 = this.f107627e;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
                C46214a aVar = new C46214a(this.f107625c);
                aVar.f107649b = iArr[i];
                aVar.f107648a.setColor(aVar.f107649b);
                aVar.invalidate();
                aVar.setTag(Integer.valueOf(iArr[i]));
                if (i == iArr.length - 1) {
                    layoutParams.rightMargin = (int) C84912r.m145930a(this.f107625c, 12.0f);
                } else {
                    layoutParams.rightMargin = this.f107626d;
                }
                if (i == 0) {
                    layoutParams.leftMargin = (int) C84912r.m145930a(this.f107625c, 16.0f);
                } else {
                    layoutParams.leftMargin = (int) C84912r.m145930a(this.f107625c, 2.0f);
                }
                layoutParams.gravity = 16;
                this.f107629h.addView(aVar, layoutParams);
                this.f107628g.add(aVar);
                aVar.setOnClickListener(new View$OnClickListenerC46215b(this, aVar));
                i++;
            } else {
                MethodCollector.m26664o(10883);
                return;
            }
        }
    }

    public void setColorChangeListener(AbstractC46212a aVar) {
        this.f107623a = aVar;
    }

    public void setSelectColorView(int i) {
        mo78437a();
        for (C46214a aVar : this.f107628g) {
            if (aVar != null && aVar.getColor() == i) {
                m89127a((View) aVar, false);
                aVar.f107650c = true;
                this.f107624b.mo78470a(aVar);
                return;
            }
        }
    }

    public void setDefault(int i) {
        mo78437a();
        C46214a aVar = this.f107628g.get(0);
        Iterator<C46214a> it = this.f107628g.iterator();
        while (true) {
            if (it.hasNext()) {
                C46214a next = it.next();
                if (next != null && next.getColor() == i) {
                    aVar = next;
                    break;
                }
            } else if (aVar == null) {
                return;
            }
        }
        m89127a((View) aVar, false);
        aVar.f107650c = true;
        C46216c cVar = this.f107624b;
        cVar.postDelayed(new RunnableC46218e(cVar, aVar), 100);
        int color = aVar.getColor();
        AbstractC46212a aVar2 = this.f107623a;
        if (aVar2 != null) {
            aVar2.mo78443a(color);
        }
    }

    /* renamed from: a */
    public final void mo78438a(boolean z, int i) {
        mo78437a();
        if (z) {
            setSelectColorView(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(10736);
        super.onMeasure(i, i2);
        this.f107627e = getMeasuredHeight();
        MethodCollector.m26664o(10736);
    }

    public ColorSelectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10735);
        this.f107625c = context;
        this.f107626d = (int) C84912r.m145930a(context, 6.0f);
        this.f107627e = (int) C84912r.m145930a(context, 30.0f);
        m89128b();
        MethodCollector.m26664o(10735);
    }

    /* renamed from: a */
    static void m89127a(View view, boolean z) {
        float f;
        float f2;
        float f3;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f4 = 1.2f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 1.2f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 1.2f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fArr2);
        animatorSet.setDuration(200L);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
