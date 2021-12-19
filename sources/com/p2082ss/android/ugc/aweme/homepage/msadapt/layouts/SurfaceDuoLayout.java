package com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.core.EnumC52983b;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts.EnumC52990a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout */
public class SurfaceDuoLayout extends LinearLayout {

    /* renamed from: a */
    private C52993c f121837a;

    /* renamed from: b */
    private final C52988a f121838b;

    static {
        Covode.recordClassIndex(62525);
    }

    public SurfaceDuoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final C52988a getConfig() {
        return this.f121838b;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout$a */
    public static final class C52988a {

        /* renamed from: a */
        public int f121839a;

        /* renamed from: b */
        public int f121840b;

        /* renamed from: c */
        public int f121841c;

        /* renamed from: d */
        public int f121842d;

        /* renamed from: e */
        public boolean f121843e;

        /* renamed from: f */
        public int f121844f;

        /* renamed from: g */
        public boolean f121845g;

        static {
            Covode.recordClassIndex(62526);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C52988a)) {
                return false;
            }
            C52988a aVar = (C52988a) obj;
            return this.f121839a == aVar.f121839a && this.f121840b == aVar.f121840b && this.f121841c == aVar.f121841c && this.f121842d == aVar.f121842d && this.f121843e == aVar.f121843e && this.f121844f == aVar.f121844f && this.f121845g == aVar.f121845g;
        }

        public final int hashCode() {
            int i = ((((((this.f121839a * 31) + this.f121840b) * 31) + this.f121841c) * 31) + this.f121842d) * 31;
            boolean z = this.f121843e;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (((i + i3) * 31) + this.f121844f) * 31;
            if (!this.f121845g) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public final String toString() {
            return "Config(singleScreenLayoutId=" + this.f121839a + ", dualScreenStartLayoutId=" + this.f121840b + ", dualScreenEndLayoutId=" + this.f121841c + ", dualPortraitSingleLayoutId=" + this.f121842d + ", isDualPortraitSingleContainer=" + this.f121843e + ", dualLandscapeSingleLayoutId=" + this.f121844f + ", isDualLandscapeSingleContainer=" + this.f121845g + ")";
        }

        private C52988a() {
            this.f121839a = -1;
            this.f121840b = -1;
            this.f121841c = -1;
            this.f121842d = -1;
            this.f121843e = false;
            this.f121844f = -1;
            this.f121845g = false;
        }

        public /* synthetic */ C52988a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout$b */
    public final class C52989b {

        /* renamed from: a */
        final /* synthetic */ SurfaceDuoLayout f121846a;

        /* renamed from: b */
        private final int f121847b = 84;

        /* renamed from: c */
        private final C52988a f121848c;

        /* renamed from: d */
        private final EnumC52990a f121849d;

        static {
            Covode.recordClassIndex(62527);
        }

        /* renamed from: b */
        private final void m97923b() {
            MethodCollector.m26663i(10207);
            FrameLayout a = m97920a(this.f121849d);
            View inflate = LayoutInflater.from(this.f121846a.getContext()).inflate(this.f121848c.f121840b, (ViewGroup) null);
            View inflate2 = LayoutInflater.from(this.f121846a.getContext()).inflate(this.f121848c.f121841c, (ViewGroup) null);
            Resources resources = this.f121846a.getResources();
            C89219l.m154716b(resources, "");
            int i = resources.getConfiguration().orientation;
            if (i == 1) {
                this.f121846a.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                C89219l.m154716b(inflate, "");
                inflate.setLayoutParams(layoutParams);
                C89219l.m154716b(inflate2, "");
                inflate2.setLayoutParams(layoutParams);
            } else if (i == 2) {
                this.f121846a.setOrientation(0);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1, 1.0f);
                C89219l.m154716b(inflate, "");
                inflate.setLayoutParams(layoutParams2);
                C89219l.m154716b(inflate2, "");
                inflate2.setLayoutParams(layoutParams2);
            }
            this.f121846a.addView(inflate);
            this.f121846a.addView(a);
            this.f121846a.addView(inflate2);
            MethodCollector.m26664o(10207);
        }

        /* renamed from: a */
        private final void m97921a() {
            View inflate;
            MethodCollector.m26663i(10048);
            ConstraintLayout constraintLayout = new ConstraintLayout(this.f121846a.getContext());
            constraintLayout.setId(View.generateViewId());
            constraintLayout.setLayoutParams(new ConstraintLayout.C0547a(-1, -1));
            m97922a(m97920a(this.f121849d), constraintLayout);
            Resources resources = this.f121846a.getResources();
            C89219l.m154716b(resources, "");
            int i = resources.getConfiguration().orientation;
            if (i == 1) {
                inflate = LayoutInflater.from(this.f121846a.getContext()).inflate(this.f121848c.f121844f, (ViewGroup) null);
                inflate.setId(View.generateViewId());
                inflate.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
                C89219l.m154716b(inflate, "");
            } else if (i != 2) {
                inflate = new FrameLayout(this.f121846a.getContext());
            } else {
                inflate = LayoutInflater.from(this.f121846a.getContext()).inflate(this.f121848c.f121842d, (ViewGroup) null);
                inflate.setId(View.generateViewId());
                inflate.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
                C89219l.m154716b(inflate, "");
            }
            m97922a(inflate, constraintLayout);
            this.f121846a.addView(constraintLayout);
            MethodCollector.m26664o(10048);
        }

        /* renamed from: a */
        private final FrameLayout m97920a(EnumC52990a aVar) {
            MethodCollector.m26663i(9889);
            FrameLayout frameLayout = new FrameLayout(this.f121846a.getContext());
            frameLayout.setId(View.generateViewId());
            Resources resources = this.f121846a.getResources();
            C89219l.m154716b(resources, "");
            int i = resources.getConfiguration().orientation;
            if (i == 1) {
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f121847b));
            } else if (i == 2) {
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(this.f121847b, -1));
            }
            int i2 = C52992b.f121853b[aVar.ordinal()];
            if (i2 == 1) {
                frameLayout.setBackground(new ColorDrawable(C0643b.m2378c(this.f121846a.getContext(), R.color.a2)));
            } else if (i2 == 2) {
                frameLayout.setBackground(new ColorDrawable(C0643b.m2378c(this.f121846a.getContext(), R.color.l)));
            }
            MethodCollector.m26664o(9889);
            return frameLayout;
        }

        /* renamed from: a */
        private static void m97922a(View view, ConstraintLayout constraintLayout) {
            constraintLayout.addView(view);
            C0550b bVar = new C0550b();
            bVar.mo2451a(constraintLayout);
            bVar.mo2449a(view.getId(), 3, 0, 3, 0);
            bVar.mo2449a(view.getId(), 1, 0, 1, 0);
            bVar.mo2449a(view.getId(), 2, 0, 2, 0);
            bVar.mo2449a(view.getId(), 4, 0, 4, 0);
            bVar.mo2454b(constraintLayout);
        }

        public C52989b(SurfaceDuoLayout surfaceDuoLayout, C52988a aVar, EnumC52983b bVar, EnumC52990a aVar2) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(aVar2, "");
            this.f121846a = surfaceDuoLayout;
            MethodCollector.m26663i(10210);
            this.f121848c = aVar;
            this.f121849d = aVar2;
            int i = C52992b.f121852a[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    surfaceDuoLayout.setWeightSum(2.0f);
                    surfaceDuoLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    Resources resources = surfaceDuoLayout.getResources();
                    C89219l.m154716b(resources, "");
                    if (resources.getConfiguration().orientation != 2) {
                        Resources resources2 = surfaceDuoLayout.getResources();
                        C89219l.m154716b(resources2, "");
                        if (resources2.getConfiguration().orientation == 1) {
                            if (aVar.f121844f != -1) {
                                m97921a();
                                MethodCollector.m26664o(10210);
                                return;
                            }
                            m97923b();
                        }
                    } else if (aVar.f121842d != -1) {
                        m97921a();
                        MethodCollector.m26664o(10210);
                        return;
                    } else {
                        m97923b();
                        MethodCollector.m26664o(10210);
                        return;
                    }
                }
                MethodCollector.m26664o(10210);
                return;
            }
            View inflate = LayoutInflater.from(surfaceDuoLayout.getContext()).inflate(aVar.f121839a, (ViewGroup) null);
            C89219l.m154716b(inflate, "");
            inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            surfaceDuoLayout.setOrientation(1);
            surfaceDuoLayout.addView(inflate);
            MethodCollector.m26664o(10210);
        }
    }

    /* renamed from: a */
    private void m97919a(C52988a aVar) {
        Context context = getContext();
        C89219l.m154716b(context, "");
        this.f121837a = new C52993c(context, this, aVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r1 != 3) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r13) {
        /*
        // Method dump skipped, instructions count: 432
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* renamed from: a */
    private final TypedArray m97917a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.s3, R.attr.s4, R.attr.s5, R.attr.s6, R.attr.xm, R.attr.xn, R.attr.aca, R.attr.acb, R.attr.acc, R.attr.acd, R.attr.ace, R.attr.acr, R.attr.ajg, R.attr.ajh}, 0, 0);
        C89219l.m154716b(obtainStyledAttributes, "");
        try {
            this.f121838b.f121839a = obtainStyledAttributes.getResourceId(11, -1);
            this.f121838b.f121840b = obtainStyledAttributes.getResourceId(3, -1);
            this.f121838b.f121841c = obtainStyledAttributes.getResourceId(2, -1);
            this.f121838b.f121842d = obtainStyledAttributes.getResourceId(1, -1);
            this.f121838b.f121843e = obtainStyledAttributes.getBoolean(5, false);
            this.f121838b.f121844f = obtainStyledAttributes.getResourceId(0, -1);
            this.f121838b.f121845g = obtainStyledAttributes.getBoolean(4, false);
            return obtainStyledAttributes;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private final void m97918a(TypedArray typedArray, C52988a aVar) {
        boolean z;
        Integer valueOf = Integer.valueOf(typedArray.getResourceId(10, -1));
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z && valueOf != null) {
            aVar.f121839a = valueOf.intValue();
        }
        Integer valueOf2 = Integer.valueOf(typedArray.getResourceId(9, -1));
        if (!(valueOf2.intValue() == -1 || valueOf2 == null)) {
            aVar.f121840b = valueOf2.intValue();
        }
        Integer valueOf3 = Integer.valueOf(typedArray.getResourceId(8, -1));
        if (!(valueOf3.intValue() == -1 || valueOf3 == null)) {
            aVar.f121841c = valueOf3.intValue();
        }
        Integer valueOf4 = Integer.valueOf(typedArray.getInteger(7, -1));
        if (!(valueOf4.intValue() == -1 || valueOf4 == null)) {
            aVar.f121842d = valueOf4.intValue();
        }
        Integer valueOf5 = Integer.valueOf(typedArray.getInteger(6, -1));
        if (!(valueOf5.intValue() == -1 || valueOf5 == null)) {
            aVar.f121844f = valueOf5.intValue();
        }
        int resourceId = typedArray.getResourceId(13, EnumC52983b.SINGLE_SCREEN.ordinal());
        EnumC52983b[] values = EnumC52983b.values();
        for (EnumC52983b bVar : values) {
            if (bVar.getId() == resourceId) {
                new C52989b(this, aVar, bVar, EnumC52990a.C52991a.m97924a(typedArray.getResourceId(12, EnumC52990a.BLACK.ordinal())));
                return;
            }
        }
        throw new IllegalArgumentException("The ScreenMode id doesn't exit");
    }

    private /* synthetic */ SurfaceDuoLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, new C52988a((byte) 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SurfaceDuoLayout(Context context, AttributeSet attributeSet, C52988a aVar) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(10515);
        this.f121838b = aVar;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setGravity(80);
        if (attributeSet != null) {
            TypedArray a = m97917a(context, attributeSet);
            if (isInEditMode()) {
                m97918a(a, aVar);
                MethodCollector.m26664o(10515);
                return;
            }
            m97919a(aVar);
            MethodCollector.m26664o(10515);
            return;
        }
        m97919a(aVar);
        MethodCollector.m26664o(10515);
    }
}
