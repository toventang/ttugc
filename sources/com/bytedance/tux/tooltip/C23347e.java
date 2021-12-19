package com.bytedance.tux.tooltip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.tooltip.e */
public final class C23347e {

    /* renamed from: f */
    public static final C23348a f55348f = new C23348a((byte) 0);

    /* renamed from: n */
    private static final int f55349n = Color.parseColor("#FF00C6E9");

    /* renamed from: a */
    public final C23351g f55350a = new C23351g();

    /* renamed from: b */
    public int f55351b;

    /* renamed from: c */
    public final Context f55352c;

    /* renamed from: d */
    public C23346d f55353d;

    /* renamed from: e */
    public final AbstractC23317a f55354e;

    /* renamed from: g */
    private int f55355g;

    /* renamed from: h */
    private int f55356h;

    /* renamed from: i */
    private int f55357i;

    /* renamed from: j */
    private int f55358j;

    /* renamed from: k */
    private final int f55359k;

    /* renamed from: l */
    private final View f55360l;

    /* renamed from: m */
    private final boolean f55361m;

    /* renamed from: com.bytedance.tux.tooltip.e$a */
    public static final class C23348a {
        static {
            Covode.recordClassIndex(27301);
        }

        private C23348a() {
        }

        public /* synthetic */ C23348a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(27300);
    }

    /* renamed from: e */
    private final int m43979e() {
        if (!this.f55361m) {
            return this.f55351b;
        }
        int i = this.f55351b;
        Context context = this.f55352c;
        int i2 = 0;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = context.getResources().getDimensionPixelSize(identifier);
        }
        return i + i2;
    }

    /* renamed from: f */
    private final int m43980f() {
        int i;
        Resources resources = this.f55352c.getResources();
        C89219l.m154709a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i2 = 0;
        if (displayMetrics != null) {
            i = displayMetrics.heightPixels;
        } else {
            i = 0;
        }
        Context context = this.f55352c;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = context.getResources().getDimensionPixelSize(identifier);
        }
        return i + i2;
    }

    /* renamed from: a */
    public final boolean mo38058a() {
        this.f55360l.measure(0, 0);
        this.f55357i = this.f55360l.getMeasuredWidth();
        this.f55358j = this.f55360l.getMeasuredHeight();
        if (this.f55353d.f55324c == null) {
            return m43978a(this.f55353d.f55326e, this.f55350a, 0, 0, this.f55353d.f55339r, this.f55353d.f55340s);
        }
        View view = this.f55353d.f55324c;
        if (view == null) {
            C89219l.m154707a();
        }
        int width = view.getWidth();
        View view2 = this.f55353d.f55324c;
        if (view2 == null) {
            C89219l.m154707a();
        }
        int height = view2.getHeight();
        int[] iArr = new int[2];
        View view3 = this.f55353d.f55324c;
        if (view3 == null) {
            C89219l.m154707a();
        }
        view3.getLocationInWindow(iArr);
        return m43978a(this.f55353d.f55326e, this.f55350a, width, height, iArr[0], iArr[1]);
    }

    /* renamed from: b */
    public final void mo38059b() {
        if (C23163i.m43663a(this.f55352c)) {
            if (this.f55353d.f55326e == EnumC23352h.START) {
                this.f55353d.mo38055a(EnumC23352h.END);
            } else if (this.f55353d.f55326e == EnumC23352h.END) {
                this.f55353d.mo38055a(EnumC23352h.START);
            }
            if (this.f55353d.f55326e == EnumC23352h.TOP || this.f55353d.f55326e == EnumC23352h.BOTTOM) {
                C23346d dVar = this.f55353d;
                dVar.f55329h = -dVar.f55329h;
            }
            C23346d dVar2 = this.f55353d;
            dVar2.f55327f = -dVar2.f55327f;
            int i = Build.VERSION.SDK_INT;
            FrameLayout frameLayout = (FrameLayout) this.f55360l.findViewById(R.id.acq);
            C89219l.m154709a((Object) frameLayout, "");
            frameLayout.setLayoutDirection(1);
        }
    }

    /* renamed from: c */
    public final void mo38060c() {
        this.f55354e.mo38002a(this.f55353d.f55347z);
        this.f55354e.mo38003a(this.f55353d.f55320A);
        this.f55351b = this.f55353d.f55331j;
        if (this.f55359k > this.f55353d.f55331j) {
            this.f55351b = this.f55359k;
        }
        this.f55351b -= this.f55359k;
        if (this.f55353d.f55330i < 0 && this.f55353d.f55330i != -1001) {
            this.f55353d.f55330i = 5000;
        }
        if (this.f55353d.f55333l < 0) {
            this.f55353d.f55333l = 300;
        }
        this.f55354e.mo38005a(this.f55353d.f55343v);
        this.f55354e.mo38008b(this.f55353d.f55344w);
        this.f55354e.mo38006a(this.f55353d.f55346y, this.f55353d.f55345x);
    }

    /* renamed from: d */
    public final void mo38061d() {
        int i;
        MethodCollector.m26663i(7509);
        if (Build.VERSION.SDK_INT < 21) {
            ImageView imageView = (ImageView) this.f55360l.findViewById(R.id.la);
            C89219l.m154709a((Object) imageView, "");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) this.f55360l.findViewById(R.id.kw);
            C89219l.m154709a((Object) imageView2, "");
            imageView2.setVisibility(8);
            ImageView imageView3 = (ImageView) this.f55360l.findViewById(R.id.l8);
            C89219l.m154709a((Object) imageView3, "");
            imageView3.setVisibility(8);
            ImageView imageView4 = (ImageView) this.f55360l.findViewById(R.id.kz);
            C89219l.m154709a((Object) imageView4, "");
            imageView4.setVisibility(8);
        }
        if (this.f55353d.f55341t != null) {
            ((FrameLayout) this.f55360l.findViewById(R.id.ade)).removeAllViews();
            ((FrameLayout) this.f55360l.findViewById(R.id.ade)).addView(this.f55353d.f55341t);
            FrameLayout frameLayout = (FrameLayout) this.f55360l.findViewById(R.id.ade);
            C89219l.m154709a((Object) frameLayout, "");
            frameLayout.setBackground(null);
            this.f55353d.f55335n = false;
        } else {
            if (this.f55353d.f55342u != null) {
                ((FrameLayout) this.f55360l.findViewById(R.id.acq)).removeAllViews();
                ((FrameLayout) this.f55360l.findViewById(R.id.acq)).addView(this.f55353d.f55342u);
            }
            if (this.f55353d.f55323b == null) {
                C23346d dVar = this.f55353d;
                Context context = this.f55352c;
                int[] iArr = {R.attr.gm, R.attr.gn, R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu};
                C89219l.m154709a((Object) iArr, "");
                Integer a = C23155d.m43642a(context, iArr, 0);
                if (a != null) {
                    i = a.intValue();
                } else {
                    i = f55349n;
                }
                dVar.f55323b = Integer.valueOf(i);
            }
            Integer num = this.f55353d.f55323b;
            if (num != null) {
                Drawable a2 = C23009f.m43397a(new C23349b(num.intValue())).mo37389a(this.f55352c);
                FrameLayout frameLayout2 = (FrameLayout) this.f55360l.findViewById(R.id.ade);
                C89219l.m154709a((Object) frameLayout2, "");
                frameLayout2.setBackground(a2);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f55360l.findViewById(R.id.l9);
        C89219l.m154709a((Object) relativeLayout, "");
        relativeLayout.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f55360l.findViewById(R.id.l6);
        C89219l.m154709a((Object) relativeLayout2, "");
        relativeLayout2.setVisibility(8);
        RelativeLayout relativeLayout3 = (RelativeLayout) this.f55360l.findViewById(R.id.kx);
        C89219l.m154709a((Object) relativeLayout3, "");
        relativeLayout3.setVisibility(8);
        RelativeLayout relativeLayout4 = (RelativeLayout) this.f55360l.findViewById(R.id.ku);
        C89219l.m154709a((Object) relativeLayout4, "");
        relativeLayout4.setVisibility(8);
        if (this.f55353d.f55335n) {
            int i2 = C23350f.f55367e[this.f55353d.f55326e.ordinal()];
            if (i2 == 1) {
                RelativeLayout relativeLayout5 = (RelativeLayout) this.f55360l.findViewById(R.id.ku);
                C89219l.m154709a((Object) relativeLayout5, "");
                relativeLayout5.setVisibility(0);
                Integer num2 = this.f55353d.f55323b;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    Drawable a3 = C0643b.m2369a(this.f55352c, 2131230735);
                    if (a3 == null) {
                        C89219l.m154707a();
                    }
                    Drawable e = C0705a.m2506e(a3);
                    C0705a.m2494a(e, intValue);
                    ((ImageView) this.f55360l.findViewById(R.id.kv)).setImageDrawable(e);
                    MethodCollector.m26664o(7509);
                    return;
                }
                MethodCollector.m26664o(7509);
                return;
            } else if (i2 == 2) {
                RelativeLayout relativeLayout6 = (RelativeLayout) this.f55360l.findViewById(R.id.kx);
                C89219l.m154709a((Object) relativeLayout6, "");
                relativeLayout6.setVisibility(0);
                Integer num3 = this.f55353d.f55323b;
                if (num3 != null) {
                    int intValue2 = num3.intValue();
                    Drawable a4 = C0643b.m2369a(this.f55352c, 2131230740);
                    if (a4 == null) {
                        C89219l.m154707a();
                    }
                    Drawable e2 = C0705a.m2506e(a4);
                    C0705a.m2494a(e2, intValue2);
                    ((ImageView) this.f55360l.findViewById(R.id.ky)).setImageDrawable(e2);
                    MethodCollector.m26664o(7509);
                    return;
                }
                MethodCollector.m26664o(7509);
                return;
            } else if (i2 == 3) {
                RelativeLayout relativeLayout7 = (RelativeLayout) this.f55360l.findViewById(R.id.l6);
                C89219l.m154709a((Object) relativeLayout7, "");
                relativeLayout7.setVisibility(0);
                Integer num4 = this.f55353d.f55323b;
                if (num4 != null) {
                    int intValue3 = num4.intValue();
                    Drawable a5 = C0643b.m2369a(this.f55352c, 2131230740);
                    if (a5 == null) {
                        C89219l.m154707a();
                    }
                    Drawable e3 = C0705a.m2506e(a5);
                    C0705a.m2494a(e3, intValue3);
                    ((ImageView) this.f55360l.findViewById(R.id.l7)).setImageDrawable(e3);
                    MethodCollector.m26664o(7509);
                    return;
                }
                MethodCollector.m26664o(7509);
                return;
            } else if (i2 == 4) {
                RelativeLayout relativeLayout8 = (RelativeLayout) this.f55360l.findViewById(R.id.l9);
                C89219l.m154709a((Object) relativeLayout8, "");
                relativeLayout8.setVisibility(0);
                Integer num5 = this.f55353d.f55323b;
                if (num5 != null) {
                    int intValue4 = num5.intValue();
                    Drawable a6 = C0643b.m2369a(this.f55352c, 2131230735);
                    if (a6 == null) {
                        C89219l.m154707a();
                    }
                    Drawable e4 = C0705a.m2506e(a6);
                    C0705a.m2494a(e4, intValue4);
                    ((ImageView) this.f55360l.findViewById(R.id.l_)).setImageDrawable(e4);
                    MethodCollector.m26664o(7509);
                    return;
                }
            }
        }
        MethodCollector.m26664o(7509);
    }

    /* renamed from: a */
    public final void mo38056a(C23346d dVar) {
        C89219l.m154719c(dVar, "");
        this.f55353d = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.tooltip.e$b */
    public static final class C23349b extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f55362a;

        static {
            Covode.recordClassIndex(27302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23349b(int i) {
            super(1);
            this.f55362a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154719c(eVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            eVar2.f54462a = Integer.valueOf(this.f55362a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m43976a(EnumC23352h hVar, C23351g gVar) {
        int i;
        int i2 = C23350f.f55366d[hVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            int i3 = this.f55355g;
            float f = ((float) gVar.f55370c) - (((float) i3) / 2.0f);
            int i4 = this.f55351b;
            int i5 = this.f55359k;
            if (f < ((float) (i4 + i5))) {
                f = ((float) i4) + ((float) i5);
            } else {
                float f2 = ((float) i3) + f + ((float) i5);
                Resources resources = this.f55352c.getResources();
                C89219l.m154709a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int i6 = 0;
                if (displayMetrics != null) {
                    i = displayMetrics.widthPixels;
                } else {
                    i = 0;
                }
                if (f2 > ((float) (i - this.f55351b))) {
                    Resources resources2 = this.f55352c.getResources();
                    C89219l.m154709a((Object) resources2, "");
                    DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
                    if (displayMetrics2 != null) {
                        i6 = displayMetrics2.widthPixels;
                    }
                    f = ((float) ((i6 - this.f55351b) - this.f55355g)) - ((float) this.f55359k);
                }
            }
            int i7 = gVar.f55368a;
            int i8 = this.f55359k;
            if (f < ((float) (i7 + i8))) {
                gVar.f55368a = C89241a.m154730a(f) - this.f55359k;
            } else if (((float) this.f55355g) + f + ((float) i8) > ((float) (gVar.f55368a + this.f55357i))) {
                gVar.f55368a = ((C89241a.m154730a(f) + this.f55355g) + this.f55359k) - this.f55357i;
            }
            gVar.f55370c = C89241a.m154730a((((float) this.f55355g) / 2.0f) + f);
            float f3 = (f - ((float) gVar.f55368a)) - ((float) this.f55359k);
            if (hVar == EnumC23352h.TOP) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f55360l.findViewById(R.id.ku);
                C89219l.m154709a((Object) relativeLayout, "");
                relativeLayout.setX(f3);
                return;
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f55360l.findViewById(R.id.l9);
            C89219l.m154709a((Object) relativeLayout2, "");
            relativeLayout2.setX(f3);
        } else if (i2 == 3 || i2 == 4) {
            float f4 = ((float) gVar.f55371d) - (((float) this.f55355g) / 2.0f);
            int e = m43979e();
            int i9 = this.f55359k;
            if (f4 < ((float) (e + i9))) {
                f4 = ((float) m43979e()) + ((float) this.f55359k);
            } else if (((float) this.f55355g) + f4 + ((float) i9) > ((float) (m43980f() - this.f55351b))) {
                f4 = ((float) ((m43980f() - this.f55351b) - this.f55355g)) - ((float) this.f55359k);
            }
            int i10 = gVar.f55369b;
            int i11 = this.f55359k;
            if (f4 < ((float) (i10 + i11))) {
                gVar.f55369b = ((int) f4) - i11;
            } else {
                float f5 = ((float) this.f55355g) + f4 + ((float) i11);
                int i12 = gVar.f55369b;
                int i13 = this.f55358j;
                if (f5 > ((float) (i12 + i13))) {
                    gVar.f55369b = ((((int) f4) + this.f55355g) + this.f55359k) - i13;
                }
            }
            gVar.f55371d = C89241a.m154730a((((float) this.f55355g) / 2.0f) + f4);
            float f6 = (f4 - ((float) gVar.f55369b)) - ((float) this.f55359k);
            if (hVar == EnumC23352h.START) {
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f55360l.findViewById(R.id.kx);
                C89219l.m154709a((Object) relativeLayout3, "");
                relativeLayout3.setY(f6);
                return;
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) this.f55360l.findViewById(R.id.l6);
            C89219l.m154709a((Object) relativeLayout4, "");
            relativeLayout4.setY(f6);
        }
    }

    /* renamed from: a */
    public final void mo38057a(C23351g gVar, boolean z) {
        AnimatorSet animatorSet;
        C89219l.m154719c(gVar, "");
        if (this.f55353d.f55334m) {
            if (this.f55353d.f55321B != null) {
                AbstractC89183m<? super View, ? super Boolean, AnimatorSet> mVar = this.f55353d.f55321B;
                if (mVar == null) {
                    C89219l.m154707a();
                }
                animatorSet = mVar.invoke(this.f55360l, Boolean.valueOf(z));
            } else {
                float f = 1.0f;
                float f2 = 0.0f;
                if (z) {
                    f = 0.0f;
                    f2 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f55360l, "scaleX", f, f2);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f55360l, "scaleY", f, f2);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f55360l, "alpha", f, f2);
                animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                if (z) {
                    animatorSet.setInterpolator(this.f55353d.f55336o);
                } else {
                    animatorSet.setInterpolator(this.f55353d.f55337p);
                }
            }
            animatorSet.setDuration(this.f55353d.f55333l);
            this.f55360l.setPivotX((float) (gVar.f55370c - gVar.f55368a));
            this.f55360l.setPivotY((float) (gVar.f55371d - gVar.f55369b));
            animatorSet.start();
        }
    }

    /* renamed from: a */
    private final boolean m43977a(EnumC23352h hVar, C23351g gVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (i == 0) {
            int i6 = C23350f.f55364b[hVar.ordinal()];
            if (i6 == 1 || i6 == 2) {
                if (gVar.f55369b < m43979e()) {
                    gVar.f55369b = m43979e();
                    return false;
                } else if (gVar.f55369b + this.f55358j <= m43980f() - this.f55351b) {
                    return true;
                } else {
                    gVar.f55369b = (m43980f() - this.f55351b) - this.f55358j;
                    return false;
                }
            } else if (i6 == 3 || i6 == 4) {
                if (gVar.f55369b < m43979e()) {
                    gVar.f55369b = m43979e();
                } else if (gVar.f55369b + this.f55358j > m43980f() - this.f55351b) {
                    gVar.f55369b = (m43980f() - this.f55358j) - this.f55351b;
                }
            }
        } else {
            int i7 = C23350f.f55365c[hVar.ordinal()];
            if (i7 == 1 || i7 == 2) {
                int i8 = gVar.f55368a;
                int i9 = this.f55351b;
                if (i8 < i9) {
                    gVar.f55368a = i9;
                } else {
                    int i10 = gVar.f55368a + this.f55357i;
                    Resources resources = this.f55352c.getResources();
                    C89219l.m154709a((Object) resources, "");
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        i2 = displayMetrics.widthPixels;
                    } else {
                        i2 = 0;
                    }
                    if (i10 > i2 - this.f55351b) {
                        Resources resources2 = this.f55352c.getResources();
                        C89219l.m154709a((Object) resources2, "");
                        DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
                        if (displayMetrics2 != null) {
                            i5 = displayMetrics2.widthPixels;
                        }
                        gVar.f55368a = (i5 - this.f55357i) - this.f55351b;
                    }
                }
            } else if (i7 == 3 || i7 == 4) {
                int i11 = gVar.f55368a;
                int i12 = this.f55351b;
                if (i11 < i12) {
                    gVar.f55368a = i12;
                    return false;
                }
                int i13 = gVar.f55368a + this.f55357i;
                Resources resources3 = this.f55352c.getResources();
                C89219l.m154709a((Object) resources3, "");
                DisplayMetrics displayMetrics3 = resources3.getDisplayMetrics();
                if (displayMetrics3 != null) {
                    i3 = displayMetrics3.widthPixels;
                } else {
                    i3 = 0;
                }
                if (i13 <= i3 - this.f55351b) {
                    return true;
                }
                Resources resources4 = this.f55352c.getResources();
                C89219l.m154709a((Object) resources4, "");
                DisplayMetrics displayMetrics4 = resources4.getDisplayMetrics();
                if (displayMetrics4 != null) {
                    i4 = displayMetrics4.widthPixels;
                } else {
                    i4 = 0;
                }
                gVar.f55368a = (i4 - this.f55357i) - this.f55351b;
                return false;
            }
        }
        return true;
    }

    public C23347e(Context context, C23346d dVar, AbstractC23317a aVar, View view, boolean z) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(view, "");
        this.f55352c = context;
        this.f55353d = dVar;
        this.f55354e = aVar;
        this.f55360l = view;
        this.f55361m = z;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f55355g = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        this.f55356h = C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system3.getDisplayMetrics()));
        this.f55359k = a;
        this.f55351b = a;
    }

    /* renamed from: a */
    private final boolean m43978a(EnumC23352h hVar, C23351g gVar, int i, int i2, int i3, int i4) {
        int i5 = C23350f.f55363a[hVar.ordinal()];
        if (i5 == 1) {
            int i6 = ((i3 + i3) + i) / 2;
            gVar.f55368a = (i6 - (this.f55357i / 2)) + this.f55353d.f55327f;
            gVar.f55369b = ((i4 - this.f55358j) + this.f55353d.f55328g) - this.f55356h;
            m43977a(hVar, gVar, 1);
            gVar.f55370c = i6 + this.f55353d.f55329h;
            gVar.f55371d = (i4 + this.f55353d.f55328g) - this.f55356h;
            m43976a(hVar, gVar);
            return m43977a(hVar, gVar, 0);
        } else if (i5 == 2) {
            gVar.f55368a = ((i3 - this.f55357i) + this.f55353d.f55327f) - this.f55356h;
            int i7 = ((i4 + i4) + i2) / 2;
            gVar.f55369b = (i7 - (this.f55358j / 2)) + this.f55353d.f55328g;
            m43977a(hVar, gVar, 0);
            gVar.f55370c = (i3 + this.f55353d.f55327f) - this.f55356h;
            gVar.f55371d = i7 + this.f55353d.f55329h;
            m43976a(hVar, gVar);
            return m43977a(hVar, gVar, 1);
        } else if (i5 == 3) {
            gVar.f55368a = i3 + i + this.f55353d.f55327f + this.f55356h;
            int i8 = ((i4 + i4) + i2) / 2;
            gVar.f55369b = (i8 - (this.f55358j / 2)) + this.f55353d.f55328g;
            m43977a(hVar, gVar, 0);
            gVar.f55370c = gVar.f55368a + this.f55353d.f55327f;
            gVar.f55371d = i8 + this.f55353d.f55329h;
            m43976a(hVar, gVar);
            return m43977a(hVar, gVar, 1);
        } else if (i5 == 4) {
            int i9 = ((i3 + i3) + i) / 2;
            gVar.f55368a = (i9 - (this.f55357i / 2)) + this.f55353d.f55327f;
            int i10 = i4 + i2;
            gVar.f55369b = this.f55353d.f55328g + i10 + this.f55356h;
            m43977a(hVar, gVar, 1);
            gVar.f55370c = i9 + this.f55353d.f55329h;
            gVar.f55371d = i10 + this.f55353d.f55328g + this.f55356h;
            m43976a(hVar, gVar);
            return m43977a(this.f55353d.f55326e, gVar, 0);
        } else {
            throw new C89376n();
        }
    }
}
