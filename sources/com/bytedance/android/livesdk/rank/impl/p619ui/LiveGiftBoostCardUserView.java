package com.bytedance.android.livesdk.rank.impl.p619ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.gift.p548d.C8797a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ui.LiveGiftBoostCardUserView */
public final class LiveGiftBoostCardUserView extends View {

    /* renamed from: a */
    ArrayList<String> f25373a = new ArrayList<>();

    /* renamed from: b */
    private Paint f25374b;

    /* renamed from: c */
    private Paint f25375c;

    /* renamed from: d */
    private Paint f25376d;

    /* renamed from: e */
    private ArrayList<Float> f25377e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<Float> f25378f = new ArrayList<>();

    /* renamed from: g */
    private Float f25379g;

    /* renamed from: h */
    private Float f25380h;

    /* renamed from: i */
    private float f25381i;

    /* renamed from: j */
    private float f25382j;

    /* renamed from: k */
    private final float f25383k;

    /* renamed from: l */
    private final float f25384l;

    /* renamed from: m */
    private final int f25385m = m19099a(2);

    /* renamed from: n */
    private final float f25386n;

    /* renamed from: o */
    private final float f25387o = 2.0f;

    /* renamed from: p */
    private final int f25388p = m19099a(75);

    /* renamed from: q */
    private final String f25389q = "#33FF5A2C";

    /* renamed from: r */
    private final String f25390r = "#00000000";

    /* renamed from: s */
    private Float f25391s;

    /* renamed from: t */
    private Float f25392t;

    /* renamed from: u */
    private C88411a f25393u = new C88411a();

    /* renamed from: v */
    private boolean f25394v = C3966y.m9672g();

    static {
        Covode.recordClassIndex(12127);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25393u.mo142944a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25393u.mo142945a(C6779a.m14563a().mo13052a(C8797a.class).mo143289d(new C10552a(this)));
    }

    private final void getMinMaxData() {
        ArrayList<String> arrayList = this.f25373a;
        int size = arrayList.size();
        float f = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            String str = arrayList.get(i);
            C89219l.m154716b(str, "");
            if (f < Float.parseFloat(str)) {
                String str2 = arrayList.get(i);
                C89219l.m154716b(str2, "");
                f = Float.parseFloat(str2);
            }
            String str3 = arrayList.get(i);
            C89219l.m154716b(str3, "");
            if (f2 > Float.parseFloat(str3)) {
                String str4 = arrayList.get(i);
                C89219l.m154716b(str4, "");
                f2 = Float.parseFloat(str4);
            }
        }
        this.f25381i = f;
        this.f25382j = f2;
    }

    private final void getDataCoordination() {
        float f;
        this.f25377e.clear();
        this.f25378f.clear();
        int size = this.f25373a.size();
        for (int i = 0; i < size; i++) {
            ArrayList<Float> arrayList = this.f25377e;
            Float f2 = this.f25379g;
            float f3 = 0.0f;
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = 0.0f;
            }
            float f4 = this.f25384l;
            float f5 = this.f25386n;
            arrayList.add(Float.valueOf(((((f - (f4 * 2.0f)) - f5) / ((float) (size - 1))) * ((float) i)) + f4 + f5));
            ArrayList<Float> arrayList2 = this.f25378f;
            Float f6 = this.f25380h;
            if (f6 != null) {
                f3 = f6.floatValue();
            }
            float f7 = ((f3 - (this.f25383k * 2.0f)) - ((float) this.f25385m)) - ((float) this.f25388p);
            float f8 = this.f25381i;
            String str = this.f25373a.get(i);
            C89219l.m154716b(str, "");
            arrayList2.add(Float.valueOf(((f7 * (f8 - Float.parseFloat(str))) / (this.f25381i - this.f25382j)) + this.f25383k + ((float) this.f25388p)));
        }
        this.f25391s = (Float) Collections.max(this.f25378f);
        this.f25392t = (Float) Collections.min(this.f25378f);
    }

    /* renamed from: a */
    private final int m19099a(int i) {
        Context context = getContext();
        C89219l.m154716b(context, "");
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (int) ((((float) i) * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ui.LiveGiftBoostCardUserView$a */
    static final class C10552a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveGiftBoostCardUserView f25395a;

        static {
            Covode.recordClassIndex(12128);
        }

        C10552a(LiveGiftBoostCardUserView liveGiftBoostCardUserView) {
            this.f25395a = liveGiftBoostCardUserView;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            LiveGiftBoostCardUserView liveGiftBoostCardUserView = this.f25395a;
            Iterator<Long> it = ((C8797a) obj).f21674a.iterator();
            C89219l.m154716b(it, "");
            liveGiftBoostCardUserView.f25373a.clear();
            while (it.hasNext()) {
                liveGiftBoostCardUserView.f25373a.add(String.valueOf(it.next().longValue()));
            }
            liveGiftBoostCardUserView.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float floatValue;
        float floatValue2;
        float f3;
        float floatValue3;
        float f4;
        float f5;
        float f6;
        float floatValue4;
        float f7;
        float f8;
        float floatValue5;
        float floatValue6;
        float f9;
        float f10;
        MethodCollector.m26663i(2373);
        super.onDraw(canvas);
        if (canvas != null) {
            if (this.f25373a.size() < 2) {
                MethodCollector.m26664o(2373);
                return;
            }
            getMinMaxData();
            getDataCoordination();
            int size = this.f25373a.size() - 2;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    Paint paint = this.f25374b;
                    if (paint != null) {
                        if (this.f25394v) {
                            Float f11 = this.f25379g;
                            if (f11 != null) {
                                f10 = f11.floatValue();
                            } else {
                                f10 = 0.0f;
                            }
                            Float f12 = this.f25377e.get(i);
                            C89219l.m154716b(f12, "");
                            floatValue5 = f10 - f12.floatValue();
                        } else {
                            Float f13 = this.f25377e.get(i);
                            C89219l.m154716b(f13, "");
                            floatValue5 = f13.floatValue();
                        }
                        Float f14 = this.f25378f.get(i);
                        C89219l.m154716b(f14, "");
                        float floatValue7 = f14.floatValue();
                        if (this.f25394v) {
                            Float f15 = this.f25379g;
                            if (f15 != null) {
                                f9 = f15.floatValue();
                            } else {
                                f9 = 0.0f;
                            }
                            Float f16 = this.f25377e.get(i + 1);
                            C89219l.m154716b(f16, "");
                            floatValue6 = f9 - f16.floatValue();
                        } else {
                            Float f17 = this.f25377e.get(i + 1);
                            C89219l.m154716b(f17, "");
                            floatValue6 = f17.floatValue();
                        }
                        Float f18 = this.f25378f.get(i + 1);
                        C89219l.m154716b(f18, "");
                        canvas.drawLine(floatValue5, floatValue7, floatValue6, f18.floatValue(), paint);
                    }
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            if (this.f25377e.size() < 2 || this.f25378f.size() < 2) {
                MethodCollector.m26664o(2373);
                return;
            }
            Float f19 = this.f25377e.get(0);
            C89219l.m154716b(f19, "");
            float floatValue8 = f19.floatValue();
            Float f20 = this.f25392t;
            if (f20 != null) {
                f = f20.floatValue();
            } else {
                f = 0.0f;
            }
            Float f21 = this.f25377e.get(0);
            C89219l.m154716b(f21, "");
            float floatValue9 = f21.floatValue();
            Float f22 = this.f25391s;
            if (f22 != null) {
                f2 = f22.floatValue();
            } else {
                f2 = 0.0f;
            }
            LinearGradient linearGradient = new LinearGradient(floatValue8, f, floatValue9, f2, Color.parseColor(this.f25389q), Color.parseColor(this.f25390r), Shader.TileMode.CLAMP);
            Paint paint2 = this.f25375c;
            if (paint2 != null) {
                paint2.setShader(linearGradient);
            }
            Path path = new Path();
            if (this.f25394v) {
                Float f23 = this.f25379g;
                if (f23 != null) {
                    f8 = f23.floatValue();
                } else {
                    f8 = 0.0f;
                }
                Float f24 = this.f25377e.get(0);
                C89219l.m154716b(f24, "");
                floatValue = f8 - f24.floatValue();
            } else {
                Float f25 = this.f25377e.get(0);
                C89219l.m154716b(f25, "");
                floatValue = f25.floatValue();
            }
            Float f26 = this.f25378f.get(0);
            C89219l.m154716b(f26, "");
            path.moveTo(floatValue, f26.floatValue());
            int size2 = this.f25373a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (this.f25394v) {
                    Float f27 = this.f25379g;
                    if (f27 != null) {
                        f7 = f27.floatValue();
                    } else {
                        f7 = 0.0f;
                    }
                    Float f28 = this.f25377e.get(i2);
                    C89219l.m154716b(f28, "");
                    floatValue4 = f7 - f28.floatValue();
                } else {
                    Float f29 = this.f25377e.get(i2);
                    C89219l.m154716b(f29, "");
                    floatValue4 = f29.floatValue();
                }
                Float f30 = this.f25378f.get(i2);
                C89219l.m154716b(f30, "");
                path.lineTo(floatValue4, f30.floatValue());
            }
            if (this.f25394v) {
                Float f31 = this.f25379g;
                if (f31 != null) {
                    f6 = f31.floatValue();
                } else {
                    f6 = 0.0f;
                }
                Float f32 = this.f25377e.get(this.f25373a.size() - 1);
                C89219l.m154716b(f32, "");
                floatValue2 = f6 - f32.floatValue();
            } else {
                Float f33 = this.f25377e.get(this.f25373a.size() - 1);
                C89219l.m154716b(f33, "");
                floatValue2 = f33.floatValue();
            }
            Float f34 = this.f25380h;
            if (f34 != null) {
                f3 = f34.floatValue();
            } else {
                f3 = 0.0f - this.f25383k;
            }
            path.lineTo(floatValue2, f3);
            if (this.f25394v) {
                Float f35 = this.f25379g;
                if (f35 != null) {
                    f5 = f35.floatValue();
                } else {
                    f5 = 0.0f;
                }
                Float f36 = this.f25377e.get(0);
                C89219l.m154716b(f36, "");
                floatValue3 = f5 - f36.floatValue();
            } else {
                Float f37 = this.f25377e.get(0);
                C89219l.m154716b(f37, "");
                floatValue3 = f37.floatValue();
            }
            Float f38 = this.f25380h;
            if (f38 != null) {
                f4 = f38.floatValue();
            } else {
                f4 = 0.0f - this.f25383k;
            }
            path.lineTo(floatValue3, f4);
            path.close();
            Paint paint3 = this.f25375c;
            if (paint3 != null) {
                canvas.drawPath(path, paint3);
                MethodCollector.m26664o(2373);
                return;
            }
        }
        MethodCollector.m26664o(2373);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(1645);
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        this.f25379g = Float.valueOf((float) measuredWidth);
        this.f25380h = Float.valueOf((float) measuredHeight);
        Paint paint = this.f25374b;
        if (paint != null) {
            paint.setStrokeCap(Paint.Cap.ROUND);
        }
        Paint paint2 = this.f25374b;
        if (paint2 != null) {
            paint2.setStrokeWidth(this.f25387o);
            MethodCollector.m26664o(1645);
            return;
        }
        MethodCollector.m26664o(1645);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveGiftBoostCardUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(2738);
        setBackgroundColor(-1);
        this.f25374b = new Paint();
        this.f25375c = new Paint();
        this.f25376d = new Paint();
        Paint paint = this.f25375c;
        if (paint != null) {
            paint.setAntiAlias(true);
        }
        Paint paint2 = this.f25375c;
        if (paint2 != null) {
            paint2.setStrokeWidth(3.0f);
        }
        Paint paint3 = this.f25375c;
        if (paint3 != null) {
            paint3.setStyle(Paint.Style.FILL);
        }
        Paint paint4 = this.f25375c;
        if (paint4 != null) {
            paint4.setTextSize(20.0f);
        }
        Paint paint5 = this.f25374b;
        if (paint5 != null) {
            paint5.setColor(Color.parseColor("#FF5A2C"));
        }
        Paint paint6 = this.f25374b;
        if (paint6 != null) {
            paint6.setAntiAlias(true);
        }
        setBackground(context.getResources().getDrawable(R.drawable.btp));
        MethodCollector.m26664o(2738);
    }
}
