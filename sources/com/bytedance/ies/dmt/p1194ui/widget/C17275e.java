package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0823h;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.e */
public final class C17275e extends ScrollView implements AbstractC17178d, AbstractC17278g, AbstractC17279h {

    /* renamed from: A */
    private int f41367A;

    /* renamed from: B */
    private boolean f41368B;

    /* renamed from: a */
    private C17273d f41369a;

    /* renamed from: b */
    private int f41370b;

    /* renamed from: c */
    private int f41371c;

    /* renamed from: d */
    private LinearLayout f41372d;

    /* renamed from: e */
    private ImageView f41373e;

    /* renamed from: f */
    private DmtTextView f41374f;

    /* renamed from: g */
    private DmtTextView f41375g;

    /* renamed from: h */
    private View f41376h;

    /* renamed from: i */
    private DmtTextView f41377i;

    /* renamed from: j */
    private int f41378j;

    /* renamed from: k */
    private int f41379k;

    /* renamed from: l */
    private int f41380l;

    /* renamed from: m */
    private int f41381m;

    /* renamed from: n */
    private int f41382n;

    /* renamed from: o */
    private int f41383o;

    /* renamed from: p */
    private int f41384p;

    /* renamed from: q */
    private int f41385q;

    /* renamed from: r */
    private int f41386r;

    /* renamed from: s */
    private int f41387s;

    /* renamed from: t */
    private boolean f41388t;

    /* renamed from: u */
    private boolean f41389u;

    /* renamed from: v */
    private boolean f41390v;

    /* renamed from: w */
    private View.OnClickListener f41391w;

    /* renamed from: x */
    private int f41392x;

    /* renamed from: y */
    private boolean f41393y;

    /* renamed from: z */
    private int f41394z;

    static {
        Covode.recordClassIndex(19753);
    }

    /* renamed from: b */
    private void m31946b() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height >= 0) {
                this.f41370b = layoutParams.height;
            }
            if (layoutParams.height == -2) {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    /* renamed from: d */
    private void m31948d() {
        if (C0792v.m2768e(this) == 1) {
            int i = Build.VERSION.SDK_INT;
            setLayoutDirection(0);
            this.f41372d.setLayoutDirection(1);
        }
    }

    public final String getDescString() {
        DmtTextView dmtTextView = this.f41375g;
        if (dmtTextView == null || dmtTextView.getText() == null) {
            return "";
        }
        return this.f41375g.getText().toString();
    }

    /* renamed from: e */
    private void m31949e() {
        this.f41374f = (DmtTextView) findViewById(R.id.f63);
        if (this.f41369a.f41356o) {
            this.f41374f.setText(this.f41369a.f41346e);
        }
        if (this.f41369a.f41359r) {
            C0823h.m2907a(this.f41374f, (int) R.style.w9);
        }
        if (this.f41369a.f41360s) {
            this.f41376h = m31941a(this.f41369a, this.f41372d);
        }
        m31950f();
    }

    /* renamed from: f */
    private void m31950f() {
        this.f41375g = (DmtTextView) findViewById(R.id.ev0);
        if (this.f41369a.f41357p) {
            this.f41375g.setText(this.f41369a.f41347f);
            if (this.f41369a.f41358q) {
                this.f41375g.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    public final String getButtonString() {
        CharSequence text;
        View view = this.f41376h;
        if (view != null) {
            if (view instanceof C17277f) {
                return ((C17277f) view).getTextString();
            }
            if (!(view instanceof DmtTextView) || (text = ((DmtTextView) view).getText()) == null) {
                return "";
            }
            return text.toString();
        }
        return "";
    }

    /* renamed from: g */
    private void m31951g() {
        m31946b();
        this.f41389u = false;
        if (this.f41393y) {
            this.f41370b = C17234b.m31809c(getContext()) - this.f41367A;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.f41394z = iArr[1];
        }
        C17273d dVar = this.f41369a;
        if (dVar == null || this.f41370b < this.f41378j) {
            this.f41389u = true;
            return;
        }
        if (dVar.f41355n) {
            int i = (int) ((((float) this.f41370b) * 0.2f) + 0.5f);
            if (this.f41393y) {
                i -= this.f41394z;
            }
            m31943a(this.f41373e, i);
            if (this.f41369a.f41360s) {
                if (this.f41369a.f41362u) {
                    m31943a(this.f41376h, this.f41385q);
                } else {
                    int a = (((((((this.f41370b - i) - this.f41387s) - this.f41379k) - m31940a(this.f41374f)) - this.f41380l) - m31940a(this.f41375g)) - this.f41382n) - this.f41381m;
                    if (this.f41393y) {
                        a -= this.f41394z;
                    }
                    setButtonMargin(a);
                }
            }
        } else if (this.f41369a.f41356o) {
            int i2 = (int) ((((float) this.f41370b) * 0.3f) + 0.5f);
            if (this.f41393y) {
                i2 -= this.f41394z;
            }
            m31943a(this.f41374f, i2);
            if (this.f41369a.f41360s) {
                int a2 = (((((this.f41370b - i2) - m31940a(this.f41374f)) - this.f41380l) - m31940a(this.f41375g)) - this.f41382n) - this.f41381m;
                if (this.f41393y) {
                    a2 -= this.f41394z;
                }
                setButtonMargin(a2);
            }
        } else {
            int i3 = (int) ((((float) this.f41370b) * 0.3f) + 0.5f);
            if (this.f41393y) {
                i3 -= this.f41394z;
            }
            m31943a(this.f41375g, i3);
        }
        this.f41375g.requestLayout();
        if (this.f41394z != 0 && this.f41368B) {
            this.f41372d.setVisibility(0);
        }
        this.f41389u = true;
    }

    /* renamed from: h */
    private void m31952h() {
        int i;
        int color;
        int color2;
        int i2;
        int color3;
        int color4;
        int color5;
        if (this.f41372d != null && this.f41369a != null) {
            Resources resources = getResources();
            if (this.f41374f != null) {
                if (this.f41369a.f41359r) {
                    DmtTextView dmtTextView = this.f41374f;
                    if (this.f41392x == 0) {
                        color5 = resources.getColor(R.color.c4);
                    } else {
                        color5 = resources.getColor(R.color.aa);
                    }
                    dmtTextView.setTextColor(color5);
                } else {
                    DmtTextView dmtTextView2 = this.f41374f;
                    if (this.f41392x == 0) {
                        color4 = resources.getColor(R.color.bx);
                    } else {
                        color4 = resources.getColor(R.color.a_);
                    }
                    dmtTextView2.setTextColor(color4);
                }
            }
            DmtTextView dmtTextView3 = this.f41375g;
            if (dmtTextView3 != null) {
                if (this.f41392x == 0) {
                    color3 = resources.getColor(R.color.c4);
                } else {
                    color3 = resources.getColor(R.color.aa);
                }
                dmtTextView3.setTextColor(color3);
            }
            View view = this.f41376h;
            if (view == null) {
                return;
            }
            if (view instanceof C17277f) {
                ((C17277f) view).mo27128a(this.f41392x);
                return;
            }
            DmtTextView dmtTextView4 = (DmtTextView) view;
            if (this.f41369a.f41348g == EnumC17270a.SOLID) {
                if (this.f41392x == 0) {
                    i2 = R.drawable.cc2;
                } else {
                    i2 = R.drawable.cc1;
                }
                dmtTextView4.setBackgroundResource(i2);
            } else {
                if (this.f41392x == 0) {
                    i = R.drawable.cc0;
                } else {
                    i = R.drawable.cby;
                }
                dmtTextView4.setBackgroundResource(i);
            }
            if (this.f41369a.f41363v) {
                color = C0643b.m2378c(getContext(), this.f41369a.f41354m);
            } else if (this.f41369a.f41348g == EnumC17270a.SOLID) {
                if (this.f41392x == 0) {
                    color2 = resources.getColor(R.color.a9);
                } else {
                    color2 = resources.getColor(R.color.l);
                }
                dmtTextView4.setTextColor(color2);
                return;
            } else if (this.f41392x == 0) {
                color = resources.getColor(R.color.bx);
            } else {
                color = resources.getColor(R.color.a_);
            }
            dmtTextView4.setTextColor(color);
        }
    }

    /* renamed from: c */
    private void m31947c() {
        ViewGroup.LayoutParams layoutParams;
        m31946b();
        removeAllViews();
        setScrollY(0);
        if (this.f41393y) {
            this.f41370b = C17234b.m31809c(getContext()) - this.f41367A;
        }
        C17273d dVar = this.f41369a;
        if (dVar == null || this.f41370b < this.f41378j) {
            this.f41389u = false;
            return;
        }
        if (dVar.f41355n) {
            C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ael, this, true);
            this.f41372d = (LinearLayout) findViewById(R.id.c57);
            ImageView imageView = (ImageView) findViewById(R.id.bvb);
            this.f41373e = imageView;
            imageView.setImageDrawable(C0643b.m2369a(getContext(), this.f41369a.f41342a));
            m31949e();
            if (this.f41369a.f41362u) {
                this.f41377i = m31945b(this.f41369a, this.f41372d);
            }
            m31944a(this.f41372d);
            if (this.f41369a.f41344c > 0 && this.f41369a.f41345d > 0 && (layoutParams = this.f41373e.getLayoutParams()) != null) {
                layoutParams.height = this.f41369a.f41345d;
                layoutParams.width = this.f41369a.f41344c;
                this.f41373e.setLayoutParams(layoutParams);
            }
        } else if (this.f41369a.f41356o) {
            C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.aek, this, true);
            this.f41372d = (LinearLayout) findViewById(R.id.c57);
            m31949e();
            m31944a(this.f41372d);
        } else {
            C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.aej, this, true);
            this.f41372d = (LinearLayout) findViewById(R.id.c57);
            m31950f();
            m31944a(this.f41372d);
        }
        View.OnClickListener onClickListener = this.f41391w;
        if (onClickListener != null) {
            this.f41372d.setOnClickListener(onClickListener);
        }
        this.f41388t = true;
        m31952h();
        if (this.f41368B) {
            this.f41372d.setVisibility(4);
        }
        mo27467a(Boolean.valueOf(this.f41390v));
        m31948d();
        m31951g();
    }

    /* renamed from: a */
    public final void mo27466a() {
        if (this.f41369a == null) {
            return;
        }
        if (this.f41388t) {
            m31951g();
        } else {
            m31947c();
        }
    }

    public final void setSupportDelayVisible(boolean z) {
        this.f41368B = z;
    }

    public C17275e(Context context) {
        this(context, (byte) 0);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f41391w = onClickListener;
        LinearLayout linearLayout = this.f41372d;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.AbstractC17279h
    public final void setUseScreenHeight(int i) {
        this.f41393y = true;
        this.f41367A = i;
        mo27466a();
    }

    /* renamed from: a */
    private int m31940a(TextView textView) {
        textView.measure(View.MeasureSpec.makeMeasureSpec(this.f41371c - (this.f41386r * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    /* renamed from: a */
    private DmtTextView m31942a(C17273d dVar) {
        if (!dVar.f41360s) {
            return null;
        }
        if (dVar.f41348g == EnumC17270a.SOLID) {
            return new DmtTextView(new ContextThemeWrapper(getContext(), (int) R.style.w8));
        }
        return new DmtTextView(new ContextThemeWrapper(getContext(), (int) R.style.w7));
    }

    private void setButtonMargin(int i) {
        int i2 = this.f41381m;
        if (i >= i2) {
            int i3 = (int) ((((float) this.f41370b) * 0.2f) + 0.5f);
            if (i3 < i2) {
                m31943a(this.f41376h, i);
                return;
            }
            int i4 = i - (i3 - i2);
            if (i4 > i2) {
                m31943a(this.f41376h, i4);
                return;
            }
        }
        m31943a(this.f41376h, i2);
    }

    /* renamed from: a */
    private void m31944a(LinearLayout linearLayout) {
        MethodCollector.m26663i(8789);
        linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.f41381m));
        MethodCollector.m26664o(8789);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.AbstractC17278g
    public final void setStatus(C17273d dVar) {
        if (dVar != null) {
            this.f41369a = dVar;
            if (!dVar.f41360s || (this.f41369a.f41356o && this.f41369a.f41357p)) {
                if (this.f41369a.f41362u) {
                    if (TextUtils.isEmpty(this.f41369a.f41352k)) {
                        throw new IllegalArgumentException("extra text should not be empty String!");
                    } else if (!this.f41369a.f41355n || !this.f41369a.f41356o || !this.f41369a.f41357p || !this.f41369a.f41360s) {
                        throw new IllegalArgumentException("extra text must with all elements!");
                    }
                }
                if (this.f41369a.f41356o) {
                    if (TextUtils.isEmpty(this.f41369a.f41346e)) {
                        throw new IllegalArgumentException("title text should not be empty String!");
                    }
                } else if (this.f41369a.f41357p) {
                    if (TextUtils.isEmpty(this.f41369a.f41347f)) {
                        throw new IllegalArgumentException("desc text should not be empty String!");
                    } else if (this.f41369a.f41355n) {
                        throw new IllegalArgumentException("desc text should only have itself!");
                    }
                }
                this.f41388t = false;
                this.f41389u = false;
                if (this.f41370b > 0) {
                    m31947c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("button must with title and description!");
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public final void mo27128a(int i) {
        if (this.f41392x != i) {
            this.f41392x = i;
            m31952h();
        }
    }

    /* renamed from: a */
    public final void mo27467a(Boolean bool) {
        this.f41390v = bool.booleanValue();
        if (bool.booleanValue()) {
            DmtTextView dmtTextView = this.f41374f;
            if (dmtTextView != null) {
                dmtTextView.setTextColor(C0643b.m2378c(getContext(), R.color.a_));
            }
            DmtTextView dmtTextView2 = this.f41375g;
            if (dmtTextView2 != null) {
                dmtTextView2.setTextColor(C0643b.m2378c(getContext(), R.color.ac));
            }
            View view = this.f41376h;
            if (view != null && (view instanceof DmtTextView)) {
                if (this.f41369a.f41348g == EnumC17270a.SOLID) {
                    this.f41376h.setBackground(C0643b.m2369a(getContext(), (int) R.drawable.cc1));
                } else {
                    this.f41376h.setBackground(C0643b.m2369a(getContext(), (int) R.drawable.cbz));
                }
                if (!this.f41369a.f41363v) {
                    ((DmtTextView) this.f41376h).setTextColor(C0643b.m2378c(getContext(), R.color.a_));
                }
            }
        }
    }

    private C17275e(Context context, byte b) {
        this(context, (char) 0);
    }

    /* renamed from: a */
    private static void m31943a(View view, int i) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = i;
    }

    /* renamed from: b */
    private DmtTextView m31945b(C17273d dVar, LinearLayout linearLayout) {
        MethodCollector.m26663i(8632);
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), (int) R.style.w_));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.f41384p;
        linearLayout.addView(dmtTextView, layoutParams);
        dmtTextView.setText(dVar.f41352k);
        dmtTextView.setOnClickListener(this.f41369a.f41353l);
        MethodCollector.m26664o(8632);
        return dmtTextView;
    }

    private C17275e(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(8041);
        this.f41392x = C17175b.C17176a.f40922a.f40921a;
        m31946b();
        Resources resources = getContext().getResources();
        this.f41378j = resources.getDimensionPixelSize(R.dimen.h2);
        this.f41379k = resources.getDimensionPixelSize(R.dimen.h5);
        this.f41380l = resources.getDimensionPixelSize(R.dimen.gu);
        this.f41381m = resources.getDimensionPixelSize(R.dimen.h3);
        this.f41383o = resources.getDimensionPixelSize(R.dimen.gs);
        this.f41382n = resources.getDimensionPixelSize(R.dimen.gq);
        this.f41384p = resources.getDimensionPixelSize(R.dimen.gv);
        this.f41385q = resources.getDimensionPixelSize(R.dimen.gr);
        this.f41386r = resources.getDimensionPixelSize(R.dimen.jl);
        this.f41387s = resources.getDimensionPixelSize(R.dimen.gx);
        MethodCollector.m26664o(8041);
    }

    /* renamed from: a */
    private View m31941a(C17273d dVar, LinearLayout linearLayout) {
        MethodCollector.m26663i(8481);
        if (dVar.f41361t) {
            C17277f fVar = new C17277f(getContext());
            fVar.mo27474a(dVar.f41348g, dVar.f41349h, dVar.f41350i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f41383o, this.f41382n);
            layoutParams.gravity = 1;
            linearLayout.addView(fVar, layoutParams);
            fVar.setFontType(C17303d.f41573g);
            fVar.setOnClickListener(this.f41369a.f41351j);
            MethodCollector.m26664o(8481);
            return fVar;
        }
        DmtTextView a = m31942a(dVar);
        if (a != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f41383o, this.f41382n);
            layoutParams2.gravity = 1;
            linearLayout.addView(a, layoutParams2);
            a.setText(dVar.f41350i);
            a.setFontType(C17303d.f41573g);
            a.setOnClickListener(dVar.f41351j);
            MethodCollector.m26664o(8481);
            return a;
        }
        MethodCollector.m26664o(8481);
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f41370b != i2 || this.f41371c != i) {
            this.f41371c = i;
            this.f41370b = i2;
            LinearLayout linearLayout = this.f41372d;
            if (linearLayout == null) {
                mo27466a();
            } else {
                linearLayout.post(new Runnable() {
                    /* class com.bytedance.ies.dmt.p1194ui.widget.C17275e.RunnableC172761 */

                    static {
                        Covode.recordClassIndex(19754);
                    }

                    public final void run() {
                        C17275e.this.mo27466a();
                    }
                });
            }
        }
    }
}
