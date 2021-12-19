package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.tools.view.p4365d.AbstractC84953a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.b */
public final class C85024b extends ScrollView implements AbstractC84953a, AbstractC85057l {

    /* renamed from: A */
    private boolean f190204A;

    /* renamed from: a */
    private C85008a f190205a;

    /* renamed from: b */
    private int f190206b;

    /* renamed from: c */
    private int f190207c;

    /* renamed from: d */
    private LinearLayout f190208d;

    /* renamed from: e */
    private ImageView f190209e;

    /* renamed from: f */
    private AVTextView f190210f;

    /* renamed from: g */
    private AVTextView f190211g;

    /* renamed from: h */
    private View f190212h;

    /* renamed from: i */
    private AVTextView f190213i;

    /* renamed from: j */
    private int f190214j;

    /* renamed from: k */
    private int f190215k;

    /* renamed from: l */
    private int f190216l;

    /* renamed from: m */
    private int f190217m;

    /* renamed from: n */
    private int f190218n;

    /* renamed from: o */
    private int f190219o;

    /* renamed from: p */
    private int f190220p;

    /* renamed from: q */
    private int f190221q;

    /* renamed from: r */
    private int f190222r;

    /* renamed from: s */
    private int f190223s;

    /* renamed from: t */
    private boolean f190224t;

    /* renamed from: u */
    private boolean f190225u;

    /* renamed from: v */
    private View.OnClickListener f190226v;

    /* renamed from: w */
    private int f190227w;

    /* renamed from: x */
    private boolean f190228x;

    /* renamed from: y */
    private int f190229y;

    /* renamed from: z */
    private int f190230z;

    static {
        Covode.recordClassIndex(99045);
    }

    /* renamed from: b */
    private void m146180b() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height >= 0) {
                this.f190206b = layoutParams.height;
            }
            if (layoutParams.height == -2) {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    /* renamed from: d */
    private void m146182d() {
        if (C0792v.m2768e(this) == 1) {
            int i = Build.VERSION.SDK_INT;
            setLayoutDirection(0);
            this.f190208d.setLayoutDirection(1);
        }
    }

    /* renamed from: f */
    private void m146184f() {
        this.f190211g = (AVTextView) findViewById(R.id.ev0);
        if (this.f190205a.f190180l) {
            this.f190211g.setText(this.f190205a.f190171c);
        }
    }

    /* renamed from: e */
    private void m146183e() {
        this.f190210f = (AVTextView) findViewById(R.id.f63);
        if (this.f190205a.f190179k) {
            this.f190210f.setText(this.f190205a.f190170b);
        }
        if (this.f190205a.f190181m) {
            this.f190212h = m146175a(this.f190205a, this.f190208d);
        }
        m146184f();
    }

    /* renamed from: c */
    private void m146181c() {
        m146180b();
        removeAllViews();
        setScrollY(0);
        if (this.f190228x) {
            this.f190206b = C70636dh.m124828a(getContext()) - this.f190230z;
        }
        C85008a aVar = this.f190205a;
        if (aVar == null || this.f190206b < this.f190214j) {
            this.f190225u = false;
            return;
        }
        if (aVar.f190178j) {
            C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b3f, this, true);
            this.f190208d = (LinearLayout) findViewById(R.id.c57);
            ImageView imageView = (ImageView) findViewById(R.id.bvb);
            this.f190209e = imageView;
            imageView.setImageDrawable(this.f190205a.f190169a);
            m146183e();
            if (this.f190205a.f190183o) {
                this.f190213i = m146179b(this.f190205a, this.f190208d);
            }
            m146178a(this.f190208d);
        } else if (this.f190205a.f190179k) {
            C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b3e, this, true);
            this.f190208d = (LinearLayout) findViewById(R.id.c57);
            m146183e();
            m146178a(this.f190208d);
        } else {
            C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b3b, this, true);
            this.f190208d = (LinearLayout) findViewById(R.id.c57);
            m146184f();
            m146178a(this.f190208d);
        }
        View.OnClickListener onClickListener = this.f190226v;
        if (onClickListener != null) {
            this.f190208d.setOnClickListener(onClickListener);
        }
        this.f190224t = true;
        m146186h();
        if (this.f190204A) {
            this.f190208d.setVisibility(4);
        }
        m146182d();
        m146185g();
    }

    /* renamed from: g */
    private void m146185g() {
        m146180b();
        this.f190225u = false;
        if (this.f190228x) {
            this.f190206b = C70636dh.m124828a(getContext()) - this.f190230z;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.f190229y = iArr[1];
        }
        C85008a aVar = this.f190205a;
        if (aVar == null || this.f190206b < this.f190214j) {
            this.f190225u = true;
            return;
        }
        if (aVar.f190178j) {
            int i = (int) ((((float) this.f190206b) * 0.2f) + 0.5f);
            if (this.f190228x) {
                i -= this.f190229y;
            }
            m146177a(this.f190209e, i);
            if (this.f190205a.f190181m) {
                if (this.f190205a.f190183o) {
                    m146177a(this.f190212h, this.f190221q);
                } else {
                    int a = (((((((this.f190206b - i) - this.f190223s) - this.f190215k) - m146174a(this.f190210f)) - this.f190216l) - m146174a(this.f190211g)) - this.f190218n) - this.f190217m;
                    if (this.f190228x) {
                        a -= this.f190229y;
                    }
                    setButtonMargin(a);
                }
            }
        } else if (this.f190205a.f190179k) {
            int i2 = (int) ((((float) this.f190206b) * 0.3f) + 0.5f);
            if (this.f190228x) {
                i2 -= this.f190229y;
            }
            m146177a(this.f190210f, i2);
            if (this.f190205a.f190181m) {
                int a2 = (((((this.f190206b - i2) - m146174a(this.f190210f)) - this.f190216l) - m146174a(this.f190211g)) - this.f190218n) - this.f190217m;
                if (this.f190228x) {
                    a2 -= this.f190229y;
                }
                setButtonMargin(a2);
            }
        } else {
            int i3 = (int) ((((float) this.f190206b) * 0.3f) + 0.5f);
            if (this.f190228x) {
                i3 -= this.f190229y;
            }
            m146177a(this.f190211g, i3);
        }
        this.f190211g.requestLayout();
        if (this.f190229y != 0 && this.f190204A) {
            this.f190208d.setVisibility(0);
        }
        this.f190225u = true;
    }

    /* renamed from: h */
    private void m146186h() {
        int i;
        int color;
        int i2;
        int i3;
        int color2;
        if (this.f190208d != null && this.f190205a != null) {
            Resources resources = getResources();
            AVTextView aVTextView = this.f190210f;
            if (aVTextView != null) {
                if (this.f190227w == 0) {
                    color2 = resources.getColor(R.color.bx);
                } else {
                    color2 = resources.getColor(R.color.a_);
                }
                aVTextView.setTextColor(color2);
            }
            AVTextView aVTextView2 = this.f190211g;
            if (aVTextView2 != null) {
                if (this.f190227w == 0) {
                    i3 = R.color.c4;
                } else {
                    i3 = R.color.aa;
                }
                aVTextView2.setTextColor(resources.getColor(i3));
            }
            View view = this.f190212h;
            if (view == null) {
                return;
            }
            if (view instanceof C85034c) {
                ((C85034c) view).mo129712a(this.f190227w);
                return;
            }
            AVTextView aVTextView3 = (AVTextView) view;
            if (this.f190205a.f190172d == EnumC85050h.SOLID) {
                if (this.f190227w == 0) {
                    i2 = R.drawable.bna;
                } else {
                    i2 = R.drawable.bn_;
                }
                aVTextView3.setBackgroundResource(i2);
                aVTextView3.setTextColor(resources.getColor(R.color.a9));
                return;
            }
            if (this.f190227w == 0) {
                i = R.drawable.bnb;
            } else {
                i = R.drawable.bn8;
            }
            aVTextView3.setBackgroundResource(i);
            if (this.f190227w == 0) {
                color = resources.getColor(R.color.bx);
            } else {
                color = resources.getColor(R.color.a_);
            }
            aVTextView3.setTextColor(color);
        }
    }

    /* renamed from: a */
    public final void mo129950a() {
        if (this.f190205a == null) {
            return;
        }
        if (this.f190224t) {
            m146185g();
        } else {
            m146181c();
        }
    }

    public final void setSupportDelayVisible(boolean z) {
        this.f190204A = z;
    }

    public C85024b(Context context) {
        this(context, (byte) 0);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f190226v = onClickListener;
        LinearLayout linearLayout = this.f190208d;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.AbstractC85057l
    public final void setUseScreenHeight(int i) {
        this.f190228x = true;
        this.f190230z = i;
        mo129950a();
    }

    /* renamed from: a */
    private int m146174a(TextView textView) {
        textView.measure(View.MeasureSpec.makeMeasureSpec(this.f190207c - (this.f190222r * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    /* renamed from: a */
    private AVTextView m146176a(C85008a aVar) {
        if (!aVar.f190181m) {
            return null;
        }
        if (aVar.f190172d == EnumC85050h.SOLID) {
            return new AVTextView(new ContextThemeWrapper(getContext(), (int) R.style.a1r));
        }
        return new AVTextView(new ContextThemeWrapper(getContext(), (int) R.style.a1q));
    }

    private void setButtonMargin(int i) {
        int i2 = this.f190217m;
        if (i >= i2) {
            int i3 = (int) ((((float) this.f190206b) * 0.2f) + 0.5f);
            if (i3 < i2) {
                m146177a(this.f190212h, i);
                return;
            }
            int i4 = i - (i3 - i2);
            if (i4 > i2) {
                m146177a(this.f190212h, i4);
                return;
            }
        }
        m146177a(this.f190212h, i2);
    }

    /* renamed from: a */
    private void m146178a(LinearLayout linearLayout) {
        MethodCollector.m26663i(421);
        linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.f190217m));
        MethodCollector.m26664o(421);
    }

    public final void setStatus(C85008a aVar) {
        if (aVar != null) {
            this.f190205a = aVar;
            if (!aVar.f190181m || (this.f190205a.f190179k && this.f190205a.f190180l)) {
                if (this.f190205a.f190183o) {
                    if (TextUtils.isEmpty(this.f190205a.f190176h)) {
                        throw new IllegalArgumentException("extra text should not be empty String!");
                    } else if (!this.f190205a.f190178j || !this.f190205a.f190179k || !this.f190205a.f190180l || !this.f190205a.f190181m) {
                        throw new IllegalArgumentException("extra text must with all elements!");
                    }
                }
                if (this.f190205a.f190179k) {
                    if (TextUtils.isEmpty(this.f190205a.f190170b)) {
                        throw new IllegalArgumentException("title text should not be empty String!");
                    } else if (!this.f190205a.f190180l) {
                        throw new IllegalArgumentException("title text must have a description!");
                    }
                } else if (this.f190205a.f190180l) {
                    if (TextUtils.isEmpty(this.f190205a.f190171c)) {
                        throw new IllegalArgumentException("desc text should not be empty String!");
                    } else if (this.f190205a.f190178j) {
                        throw new IllegalArgumentException("desc text should only have itself!");
                    }
                }
                this.f190224t = false;
                this.f190225u = false;
                if (this.f190206b > 0) {
                    m146181c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("button must with title and description!");
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4365d.AbstractC84953a
    /* renamed from: a */
    public final void mo129712a(int i) {
        if (this.f190227w != i) {
            this.f190227w = i;
            m146186h();
        }
    }

    private C85024b(Context context, byte b) {
        this(context, (char) 0);
    }

    /* renamed from: a */
    private static void m146177a(View view, int i) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = i;
    }

    /* renamed from: b */
    private AVTextView m146179b(C85008a aVar, LinearLayout linearLayout) {
        MethodCollector.m26663i(417);
        AVTextView aVTextView = new AVTextView(new ContextThemeWrapper(getContext(), (int) R.style.a1t));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.f190220p;
        linearLayout.addView(aVTextView, layoutParams);
        aVTextView.setText(aVar.f190176h);
        aVTextView.setOnClickListener(this.f190205a.f190177i);
        MethodCollector.m26664o(417);
        return aVTextView;
    }

    /* renamed from: a */
    private View m146175a(C85008a aVar, LinearLayout linearLayout) {
        MethodCollector.m26663i(411);
        if (aVar.f190182n) {
            C85034c cVar = new C85034c(getContext());
            cVar.mo129963a(aVar.f190172d, aVar.f190173e, aVar.f190174f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f190219o, this.f190218n);
            layoutParams.gravity = 1;
            linearLayout.addView(cVar, layoutParams);
            cVar.setOnClickListener(this.f190205a.f190175g);
            MethodCollector.m26664o(411);
            return cVar;
        }
        AVTextView a = m146176a(aVar);
        if (a != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f190219o, this.f190218n);
            layoutParams2.gravity = 1;
            linearLayout.addView(a, layoutParams2);
            a.setText(aVar.f190174f);
            a.setOnClickListener(aVar.f190175g);
            MethodCollector.m26664o(411);
            return a;
        }
        MethodCollector.m26664o(411);
        return null;
    }

    private C85024b(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(100);
        this.f190227w = C63244g.m114602a().mo73259E().mo93881a();
        m146180b();
        Resources resources = getContext().getResources();
        this.f190214j = resources.getDimensionPixelSize(R.dimen.c_);
        this.f190215k = resources.getDimensionPixelSize(R.dimen.cc);
        this.f190216l = resources.getDimensionPixelSize(R.dimen.c6);
        this.f190217m = resources.getDimensionPixelSize(R.dimen.ca);
        this.f190219o = resources.getDimensionPixelSize(R.dimen.c5);
        this.f190218n = resources.getDimensionPixelSize(R.dimen.c3);
        this.f190220p = resources.getDimensionPixelSize(R.dimen.c7);
        this.f190221q = resources.getDimensionPixelSize(R.dimen.c4);
        this.f190222r = resources.getDimensionPixelSize(R.dimen.cd);
        this.f190223s = resources.getDimensionPixelSize(R.dimen.c8);
        MethodCollector.m26664o(100);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f190206b != i2 || this.f190207c != i) {
            this.f190207c = i;
            this.f190206b = i2;
            LinearLayout linearLayout = this.f190208d;
            if (linearLayout == null) {
                mo129950a();
            } else {
                linearLayout.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.tools.view.widget.C85024b.RunnableC850251 */

                    static {
                        Covode.recordClassIndex(99046);
                    }

                    public final void run() {
                        C85024b.this.mo129950a();
                    }
                });
            }
        }
    }
}
