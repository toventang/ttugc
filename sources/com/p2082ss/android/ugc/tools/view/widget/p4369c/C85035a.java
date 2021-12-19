package com.p2082ss.android.ugc.tools.view.widget.p4369c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.tools.view.style.C84981g;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.c.a */
public class C85035a extends FrameLayout {

    /* renamed from: A */
    private final int f190245A;

    /* renamed from: B */
    private final boolean f190246B;

    /* renamed from: a */
    private View f190247a;

    /* renamed from: b */
    private CircleDraweeView f190248b;

    /* renamed from: c */
    public final boolean f190249c;

    /* renamed from: d */
    private FrameLayout f190250d;

    /* renamed from: e */
    private View f190251e;

    /* renamed from: f */
    private TextView f190252f;

    /* renamed from: g */
    private View f190253g;

    /* renamed from: h */
    private View f190254h;

    /* renamed from: i */
    private ColorStateList f190255i;

    /* renamed from: j */
    private final ColorStateList f190256j;

    /* renamed from: k */
    private boolean f190257k;

    /* renamed from: l */
    private final boolean f190258l;

    /* renamed from: m */
    private final int f190259m;

    /* renamed from: n */
    private final int f190260n;

    /* renamed from: o */
    private final int f190261o;

    /* renamed from: p */
    private final int f190262p;

    /* renamed from: q */
    private final boolean f190263q;

    /* renamed from: r */
    private final int f190264r;

    /* renamed from: s */
    private final int f190265s;

    /* renamed from: t */
    private final int f190266t;

    /* renamed from: u */
    private final boolean f190267u;

    /* renamed from: v */
    private final boolean f190268v;

    /* renamed from: w */
    private final int f190269w;

    /* renamed from: x */
    private final int f190270x;

    /* renamed from: y */
    private final int f190271y;

    /* renamed from: z */
    private final int f190272z;

    static {
        Covode.recordClassIndex(99056);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo129964a() {
        return R.layout.b3i;
    }

    /* access modifiers changed from: protected */
    public final View getDotView() {
        return this.f190254h;
    }

    public final TextView getTextView() {
        return this.f190252f;
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.c.a$a */
    public static class C85036a {

        /* renamed from: d */
        public boolean f190273d;

        /* renamed from: e */
        public int f190274e;

        /* renamed from: f */
        public int f190275f = -1;

        /* renamed from: g */
        public int f190276g;

        /* renamed from: h */
        public int f190277h;

        /* renamed from: i */
        public int f190278i;

        /* renamed from: j */
        public boolean f190279j = true;

        /* renamed from: k */
        public int f190280k = 4;

        /* renamed from: l */
        public int f190281l;

        /* renamed from: m */
        public int f190282m = R.color.te;

        /* renamed from: n */
        public boolean f190283n = true;

        /* renamed from: o */
        public boolean f190284o = true;

        /* renamed from: p */
        public boolean f190285p = true;

        /* renamed from: q */
        public int f190286q = 2;

        /* renamed from: r */
        public int f190287r = R.color.te;

        /* renamed from: s */
        public int f190288s = R.color.t7;

        /* renamed from: t */
        public int f190289t = 2;

        /* renamed from: u */
        public boolean f190290u;

        /* renamed from: v */
        public final Context f190291v;

        static {
            Covode.recordClassIndex(99057);
        }

        /* renamed from: c */
        public final int mo129973c() {
            int i = this.f190275f;
            if (i == -1) {
                return this.f190274e;
            }
            return i;
        }

        /* renamed from: b */
        public C85035a mo122016b() {
            return new C85035a(this.f190291v, this.f190273d, this.f190274e, this.f190276g, this.f190277h, this.f190278i, this.f190279j, this.f190280k, this.f190281l, this.f190282m, this.f190283n, this.f190284o, this.f190286q, this.f190287r, this.f190288s, this.f190289t, mo129973c(), this.f190285p, this.f190290u);
        }

        public C85036a(Context context) {
            C89219l.m154721d(context, "");
            this.f190291v = context;
        }
    }

    public final CircleDraweeView getImageView() {
        CircleDraweeView circleDraweeView = this.f190248b;
        if (circleDraweeView == null) {
            C89219l.m154710a("imageView");
        }
        return circleDraweeView;
    }

    private final View getBorderView() {
        GradientDrawable a;
        MethodCollector.m26663i(10416);
        if (this.f190268v && this.f190253g == null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            C89219l.m154721d(context, "");
            int a2 = (int) C84912r.m145930a(context, (float) this.f190269w);
            int i = a2 * 2;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f190260n + i, i + this.f190261o);
            View view = new View(context);
            view.setLayoutParams(layoutParams);
            int color = context.getResources().getColor(this.f190270x);
            if (this.f190258l) {
                a = C84966b.C84967a.m146038a().mo129752a(1).mo129755b(0).mo129753a(color, a2).mo129750a();
            } else {
                a = C84966b.C84967a.m146038a().mo129752a(0).mo129755b(0).mo129753a(color, a2).mo129751a((float) this.f190259m).mo129750a();
            }
            view.setBackground(a);
            FrameLayout frameLayout = this.f190250d;
            if (frameLayout == null) {
                C89219l.m154710a("imageLayoutContainer");
            }
            frameLayout.addView(view);
            this.f190253g = view;
        }
        View view2 = this.f190253g;
        MethodCollector.m26664o(10416);
        return view2;
    }

    /* access modifiers changed from: protected */
    public final void setDotView(View view) {
        this.f190254h = view;
    }

    public void setCustomSelected(boolean z) {
        mo122008a(z, false);
    }

    /* renamed from: a */
    public void mo122007a(boolean z) {
        int i;
        View view = this.f190254h;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo78372a(Context context) {
        C89219l.m154721d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setLayoutParams(layoutParams);
        styleTextView.setGravity(17);
        return styleTextView;
    }

    public void setText(CharSequence charSequence) {
        TextView textView;
        if (charSequence != null && charSequence.length() != 0 && (textView = this.f190252f) != null) {
            if (((int) textView.getPaint().measureText(charSequence, 0, charSequence.length())) <= this.f190260n) {
                textView.setGravity(17);
            } else if (this.f190267u) {
                textView.setGravity(8388611);
            } else {
                textView.setGravity(17);
            }
            textView.setText(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo122009b(Context context) {
        MethodCollector.m26663i(10720);
        C89219l.m154721d(context, "");
        int a = (int) C84912r.m145930a(context, 6.0f);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(a, a);
        View view = new View(context);
        view.setLayoutParams(layoutParams);
        int color = getResources().getColor(this.f190271y);
        view.setBackground(C84966b.C84967a.m146038a().mo129752a(1).mo129755b(color).mo129753a(color, (int) C84912r.m145930a(context, (float) this.f190272z)).mo129750a());
        MethodCollector.m26664o(10720);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo129967c(Context context) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        MethodCollector.m26663i(10419);
        C89219l.m154721d(context, "");
        FrameLayout frameLayout = new FrameLayout(context);
        View a = C1764a.m5927a(LayoutInflater.from(context), mo129964a(), frameLayout, false);
        if (this.f190249c) {
            i = -2;
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i);
        C89219l.m154716b(a, "");
        a.setLayoutParams(layoutParams2);
        frameLayout.addView(a);
        if (this.f190249c) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f190260n, this.f190261o);
        }
        frameLayout.setLayoutParams(layoutParams);
        MethodCollector.m26664o(10419);
        return frameLayout;
    }

    /* renamed from: a */
    private void mo122008a(boolean z, boolean z2) {
        View borderView;
        int i;
        if (this.f190257k != z || z2) {
            this.f190257k = z;
            TextView textView = this.f190252f;
            if (textView != null) {
                if (z) {
                    this.f190255i = textView.getTextColors();
                    textView.setTextColor(this.f190256j);
                    if (this.f190267u) {
                        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    }
                } else {
                    ColorStateList colorStateList = this.f190255i;
                    if (colorStateList != null) {
                        textView.setTextColor(colorStateList);
                    }
                }
                textView.setEllipsize(null);
            }
            if ((this.f190253g != null || z) && (borderView = getBorderView()) != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                borderView.setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public void mo129966a(LinearLayout linearLayout, boolean z) {
        int i;
        C89219l.m154721d(linearLayout, "");
        if (z) {
            i = -1;
        } else {
            i = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
    }

    /* renamed from: a */
    public void mo129965a(View view, FrameLayout frameLayout, int i, int i2, boolean z) {
        LinearLayout.LayoutParams layoutParams;
        C89219l.m154721d(view, "");
        C89219l.m154721d(frameLayout, "");
        if (z) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(i, i2);
        }
        layoutParams.gravity = 1;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(view.getLayoutParams());
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
    }

    public /* synthetic */ C85035a(Context context, boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, boolean z3, boolean z4, int i8, int i9, int i10, int i11) {
        this(context, z, i, i2, i3, i4, z2, i5, i6, i7, z3, z4, i8, i9, i10, i11, i, true, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C85035a(Context context, boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, boolean z3, boolean z4, int i8, int i9, int i10, int i11, int i12, boolean z5, boolean z6) {
        super(context);
        Drawable a;
        int i13;
        ColorStateList colorStateList;
        int i14 = i2;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11304);
        this.f190258l = z;
        this.f190259m = i;
        this.f190260n = i14;
        this.f190261o = i3;
        this.f190262p = i4;
        this.f190263q = z2;
        this.f190264r = i5;
        this.f190265s = i6;
        this.f190266t = i7;
        this.f190267u = z3;
        this.f190268v = z4;
        this.f190269w = i8;
        this.f190270x = i9;
        this.f190271y = i10;
        this.f190272z = i11;
        this.f190245A = i12;
        this.f190246B = z5;
        this.f190249c = z6;
        ColorStateList colorStateList2 = getResources().getColorStateList(i7);
        C89219l.m154716b(colorStateList2, "");
        this.f190256j = colorStateList2;
        this.f190247a = mo129967c(context);
        C89219l.m154721d(context, "");
        View view = this.f190247a;
        if (view == null) {
            C89219l.m154710a("imageViewContainer");
        }
        CircleDraweeView circleDraweeView = (CircleDraweeView) view.findViewById(R.id.at5);
        C24246a a2 = new C24247b(getResources()).mo39973a();
        C89219l.m154716b(a2, "");
        C24250e eVar = new C24250e();
        eVar.mo39982a(z);
        if (!z) {
            eVar.mo39978a((float) i12);
        }
        a2.mo39959a(eVar);
        int color = getResources().getColor(R.color.u_);
        if (i4 != 0) {
            a = C84981g.m146053a(getResources().getDrawable(i4), getResources().getColor(R.color.ua));
        } else if (z) {
            a = C84966b.C84967a.m146038a().mo129752a(1).mo129755b(color).mo129753a(color, 0).mo129750a();
        } else {
            a = C84966b.C84967a.m146038a().mo129752a(0).mo129755b(color).mo129753a(color, 0).mo129751a((float) i).mo129750a();
        }
        a2.mo39963b(a);
        a2.mo39968c(a);
        C89219l.m154716b(circleDraweeView, "");
        circleDraweeView.setHierarchy(a2);
        this.f190248b = circleDraweeView;
        if (z2) {
            this.f190251e = mo78372a(context);
            C89219l.m154721d(context, "");
            View view2 = this.f190251e;
            if (view2 != null) {
                TextView textView = (TextView) view2;
                if (z3) {
                    textView.setSingleLine();
                }
                this.f190252f = textView;
                if (textView != null) {
                    colorStateList = textView.getTextColors();
                } else {
                    colorStateList = null;
                }
                this.f190255i = colorStateList;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.m26664o(11304);
                throw nullPointerException;
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        mo129966a(linearLayout, z6);
        addView(linearLayout);
        int a3 = (int) C84912r.m145930a(context, (float) i8);
        if (z4) {
            i14 += a3 * 2;
            i13 = (a3 * 2) + i3;
        } else {
            i13 = i3;
        }
        this.f190250d = new FrameLayout(context);
        View view3 = this.f190247a;
        if (view3 == null) {
            C89219l.m154710a("imageViewContainer");
        }
        FrameLayout frameLayout = this.f190250d;
        if (frameLayout == null) {
            C89219l.m154710a("imageLayoutContainer");
        }
        mo129965a(view3, frameLayout, i14, i13, z6);
        FrameLayout frameLayout2 = this.f190250d;
        if (frameLayout2 == null) {
            C89219l.m154710a("imageLayoutContainer");
        }
        View view4 = this.f190247a;
        if (view4 == null) {
            C89219l.m154710a("imageViewContainer");
        }
        frameLayout2.addView(view4);
        View view5 = this.f190250d;
        if (view5 == null) {
            C89219l.m154710a("imageLayoutContainer");
        }
        linearLayout.addView(view5);
        View view6 = this.f190251e;
        if (view6 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view6.getLayoutParams());
            layoutParams.gravity = 1;
            layoutParams.topMargin = (int) C84912r.m145930a(context, (float) i5);
            layoutParams.bottomMargin = (int) C84912r.m145930a(context, (float) i6);
            view6.setLayoutParams(layoutParams);
            linearLayout.addView(view6);
        }
        if (z5) {
            View b = mo122009b(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(b.getLayoutParams());
            layoutParams2.gravity = 8388661;
            b.setLayoutParams(layoutParams2);
            linearLayout.addView(b);
            this.f190254h = b;
        }
        mo122008a(false, true);
        mo122007a(false);
        MethodCollector.m26664o(11304);
    }
}
