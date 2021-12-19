package com.bytedance.android.live.liveinteract.multilive.p341a.p349h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.p261b.C4423l;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.livesdk.p561j.C9073cl;
import com.bytedance.android.livesdk.p561j.C9074cm;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.b */
public final class C5451b extends AbstractC5449a {

    /* renamed from: a */
    public static final int f14021a = C3966y.m9653a(64.0f);

    /* renamed from: b */
    public static final int f14022b = C3966y.m9653a(170.0f);

    /* renamed from: c */
    public static final C5452a f14023c = new C5452a((byte) 0);

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11259a() {
        return R.layout.bc8;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a
    /* renamed from: b */
    public final int mo11261b() {
        return R.layout.bc2;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: d */
    public final boolean mo11263d() {
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.b$a */
    public static final class C5452a {
        static {
            Covode.recordClassIndex(6047);
        }

        private C5452a() {
        }

        public /* synthetic */ C5452a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: c */
    public final EnumC4422k mo11262c() {
        return EnumC4422k.FLOATING_FIX;
    }

    /* renamed from: f */
    public final void mo11264f() {
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup != null) {
            viewGroup.post(new RunnableC5453b(this));
        }
    }

    /* renamed from: g */
    public final void mo11265g() {
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup != null) {
            viewGroup.post(new RunnableC5458g(this));
        }
    }

    static {
        Covode.recordClassIndex(6046);
    }

    /* renamed from: h */
    public final double mo11266h() {
        int i;
        double d;
        FrameLayout frameLayout;
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null || (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d37)) == null) {
            i = 0;
        } else {
            i = frameLayout.getHeight();
        }
        if (i == 0) {
            d = (double) ((C3966y.m9662b() - f14022b) - f14021a);
            Double.isNaN(d);
        } else {
            d = (double) i;
            Double.isNaN(d);
        }
        return d / 0.7560780122896072d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r2 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r4 != 0) goto L_0x002d;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double mo11267i() {
        /*
            r5 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.f14261h
            java.lang.Class<com.bytedance.android.live.liveinteract.api.at> r0 = com.bytedance.android.live.liveinteract.api.C4406at.class
            java.lang.Object r2 = r1.mo28318b(r0)
            h.p r2 = (p4600h.C89378p) r2
            r4 = 0
            if (r2 == 0) goto L_0x0029
            java.lang.Object r0 = r2.getFirst()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x003c
            int r1 = r0.intValue()
        L_0x0019:
            java.lang.Object r0 = r2.getSecond()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0025
            int r4 = r0.intValue()
        L_0x0025:
            if (r1 == 0) goto L_0x0029
            if (r4 != 0) goto L_0x002d
        L_0x0029:
            r1 = 480(0x1e0, float:6.73E-43)
            r4 = 864(0x360, float:1.211E-42)
        L_0x002d:
            double r2 = r5.mo11266h()
            double r0 = (double) r1
            java.lang.Double.isNaN(r0)
            double r2 = r2 * r0
            double r0 = (double) r4
            java.lang.Double.isNaN(r0)
            double r2 = r2 / r0
            return r2
        L_0x003c:
            r1 = 0
            if (r2 == 0) goto L_0x0025
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.p341a.p349h.C5451b.mo11267i():double");
    }

    /* renamed from: j */
    public final int mo11268j() {
        double c = (double) C89271h.m154772c(C3966y.m9664c(), C3966y.m9662b());
        if (c <= mo11267i()) {
            return 0;
        }
        double i = mo11267i();
        Double.isNaN(c);
        return (int) ((c - i) / 2.0d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.b$b */
    public static final class RunnableC5453b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5451b f14024a;

        static {
            Covode.recordClassIndex(6048);
        }

        RunnableC5453b(C5451b bVar) {
            this.f14024a = bVar;
        }

        public final void run() {
            FrameLayout frameLayout;
            Integer valueOf;
            View findViewById;
            View findViewById2;
            ViewGroup.LayoutParams layoutParams;
            View findViewById3;
            View findViewById4;
            ViewGroup.LayoutParams layoutParams2;
            View findViewById5;
            View findViewById6;
            ViewGroup.LayoutParams layoutParams3;
            ViewGroup viewGroup = this.f14024a.f14257d;
            if (viewGroup != null && (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d37)) != null && (valueOf = Integer.valueOf(frameLayout.getHeight())) != null) {
                int intValue = valueOf.intValue();
                ViewGroup viewGroup2 = this.f14024a.f14257d;
                if (!(viewGroup2 == null || (findViewById6 = viewGroup2.findViewById(R.id.amw)) == null || (layoutParams3 = findViewById6.getLayoutParams()) == null)) {
                    double d = (double) intValue;
                    Double.isNaN(d);
                    layoutParams3.width = (int) (d * 0.004424778761061947d);
                }
                ViewGroup viewGroup3 = this.f14024a.f14257d;
                if (!(viewGroup3 == null || (findViewById5 = viewGroup3.findViewById(R.id.amw)) == null)) {
                    findViewById5.requestLayout();
                }
                ViewGroup viewGroup4 = this.f14024a.f14257d;
                if (!(viewGroup4 == null || (findViewById4 = viewGroup4.findViewById(R.id.amm)) == null || (layoutParams2 = findViewById4.getLayoutParams()) == null)) {
                    double d2 = (double) intValue;
                    Double.isNaN(d2);
                    layoutParams2.height = (int) (d2 * 0.004424778761061947d);
                }
                ViewGroup viewGroup5 = this.f14024a.f14257d;
                if (!(viewGroup5 == null || (findViewById3 = viewGroup5.findViewById(R.id.amm)) == null)) {
                    findViewById3.requestLayout();
                }
                ViewGroup viewGroup6 = this.f14024a.f14257d;
                if (!(viewGroup6 == null || (findViewById2 = viewGroup6.findViewById(R.id.amn)) == null || (layoutParams = findViewById2.getLayoutParams()) == null)) {
                    double d3 = (double) intValue;
                    Double.isNaN(d3);
                    layoutParams.height = (int) (d3 * 0.004424778761061947d);
                }
                ViewGroup viewGroup7 = this.f14024a.f14257d;
                if (viewGroup7 != null && (findViewById = viewGroup7.findViewById(R.id.amn)) != null) {
                    findViewById.requestLayout();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.b$g */
    public static final class RunnableC5458g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5451b f14029a;

        static {
            Covode.recordClassIndex(6053);
        }

        RunnableC5458g(C5451b bVar) {
            this.f14029a = bVar;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            FrameLayout frameLayout;
            ViewGroup.LayoutParams layoutParams2;
            View findViewById;
            View findViewById2;
            View findViewById3;
            View findViewById4;
            View findViewById5;
            View findViewById6;
            View findViewById7;
            View findViewById8;
            FrameLayout frameLayout2;
            FrameLayout frameLayout3;
            ViewGroup viewGroup = this.f14029a.f14257d;
            ViewGroup.LayoutParams layoutParams3 = null;
            if (viewGroup == null || (frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d38)) == null) {
                layoutParams = null;
            } else {
                layoutParams = frameLayout3.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            aVar.width = C89241a.m154729a(this.f14029a.mo11267i() * 0.24044241404183697d);
            ViewGroup viewGroup2 = this.f14029a.f14257d;
            if (!(viewGroup2 == null || (frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.d38)) == null)) {
                frameLayout2.setLayoutParams(aVar);
            }
            EnumC4422k kVar = EnumC4422k.FLOATING_FIX;
            ViewGroup viewGroup3 = this.f14029a.f14257d;
            if (viewGroup3 != null) {
                frameLayout = (FrameLayout) viewGroup3.findViewById(R.id.d37);
            } else {
                frameLayout = null;
            }
            this.f14029a.f14261h.mo28320c(C4403aq.class, new C4423l(kVar, frameLayout, this.f14029a.f14258e, false, C89241a.m154729a(this.f14029a.mo11267i()), C89241a.m154729a(this.f14029a.mo11266h()), C5451b.f14021a, this.f14029a.mo11268j(), false, 256));
            C5451b bVar = this.f14029a;
            if (C89219l.m154714a(bVar.f14261h.mo28318b(C9074cm.class), (Object) true)) {
                return;
            }
            if (bVar.mo11268j() == 0) {
                ViewGroup viewGroup4 = bVar.f14257d;
                if (!(viewGroup4 == null || (findViewById8 = viewGroup4.findViewById(R.id.c82)) == null)) {
                    C89393b.m154949a(findViewById8);
                }
                ViewGroup viewGroup5 = bVar.f14257d;
                if (viewGroup5 != null && (findViewById7 = viewGroup5.findViewById(R.id.dk9)) != null) {
                    C89393b.m154949a(findViewById7);
                    return;
                }
                return;
            }
            ViewGroup viewGroup6 = bVar.f14257d;
            if (!(viewGroup6 == null || (findViewById6 = viewGroup6.findViewById(R.id.c82)) == null)) {
                C89393b.m154951c(findViewById6);
            }
            ViewGroup viewGroup7 = bVar.f14257d;
            if (viewGroup7 == null || (findViewById5 = viewGroup7.findViewById(R.id.c82)) == null) {
                layoutParams2 = null;
            } else {
                layoutParams2 = findViewById5.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
            aVar2.width = bVar.mo11268j();
            ViewGroup viewGroup8 = bVar.f14257d;
            if (!(viewGroup8 == null || (findViewById4 = viewGroup8.findViewById(R.id.c82)) == null)) {
                findViewById4.setLayoutParams(aVar2);
            }
            ViewGroup viewGroup9 = bVar.f14257d;
            if (!(viewGroup9 == null || (findViewById3 = viewGroup9.findViewById(R.id.dk9)) == null)) {
                C89393b.m154951c(findViewById3);
            }
            ViewGroup viewGroup10 = bVar.f14257d;
            if (!(viewGroup10 == null || (findViewById2 = viewGroup10.findViewById(R.id.dk9)) == null)) {
                layoutParams3 = findViewById2.getLayoutParams();
            }
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar3 = (ConstraintLayout.C0547a) layoutParams3;
            aVar3.width = bVar.mo11268j();
            ViewGroup viewGroup11 = bVar.f14257d;
            if (viewGroup11 != null && (findViewById = viewGroup11.findViewById(R.id.dk9)) != null) {
                findViewById.setLayoutParams(aVar3);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.b$c */
    static final class View$OnClickListenerC5454c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5451b f14025a;

        static {
            Covode.recordClassIndex(6049);
        }

        View$OnClickListenerC5454c(C5451b bVar) {
            this.f14025a = bVar;
        }

        public final void onClick(View view) {
            this.f14025a.mo11255a(1);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.b$d */
    static final class View$OnClickListenerC5455d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5451b f14026a;

        static {
            Covode.recordClassIndex(6050);
        }

        View$OnClickListenerC5455d(C5451b bVar) {
            this.f14026a = bVar;
        }

        public final void onClick(View view) {
            this.f14026a.mo11255a(2);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.b$e */
    static final class View$OnClickListenerC5456e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5451b f14027a;

        static {
            Covode.recordClassIndex(6051);
        }

        View$OnClickListenerC5456e(C5451b bVar) {
            this.f14027a = bVar;
        }

        public final void onClick(View view) {
            this.f14027a.mo11255a(3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5451b(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.b$f */
    static final class C5457f extends AbstractC89220m implements AbstractC89172b<C89378p<? extends Boolean, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5451b f14028a;

        static {
            Covode.recordClassIndex(6052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5457f(C5451b bVar) {
            super(1);
            this.f14028a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89378p<? extends Boolean, ? extends Integer> pVar) {
            C89378p<? extends Boolean, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            if (!((Boolean) pVar2.getFirst()).booleanValue()) {
                this.f14028a.mo11264f();
                this.f14028a.mo11265g();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b, com.bytedance.android.live.liveinteract.multilive.p341a.p349h.AbstractC5449a
    /* renamed from: a */
    public final void mo11256a(ViewGroup viewGroup) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        C89219l.m154721d(viewGroup, "");
        super.mo11256a(viewGroup);
        mo11265g();
        ViewGroup viewGroup2 = this.f14257d;
        if (!(viewGroup2 == null || (frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.av0)) == null)) {
            frameLayout3.setOnClickListener(new View$OnClickListenerC5454c(this));
        }
        ViewGroup viewGroup3 = this.f14257d;
        if (!(viewGroup3 == null || (frameLayout2 = (FrameLayout) viewGroup3.findViewById(R.id.av1)) == null)) {
            frameLayout2.setOnClickListener(new View$OnClickListenerC5455d(this));
        }
        ViewGroup viewGroup4 = this.f14257d;
        if (!(viewGroup4 == null || (frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.av2)) == null)) {
            frameLayout.setOnClickListener(new View$OnClickListenerC5456e(this));
        }
        mo11264f();
        this.f14261h.mo28310a(C9073cl.class, (AbstractC89172b) new C5457f(this));
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11260a(View view, int i) {
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null) {
            return -1;
        }
        mo11265g();
        int c = mo11392c(i);
        int i2 = 3;
        if (c == 1) {
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d38);
            C89219l.m154716b(frameLayout, "");
            FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.av0);
            C89219l.m154716b(frameLayout2, "");
            m11951a(frameLayout, frameLayout2, view);
            i2 = 1;
        } else if (c == 2) {
            FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d39);
            C89219l.m154716b(frameLayout3, "");
            FrameLayout frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.av1);
            C89219l.m154716b(frameLayout4, "");
            m11951a(frameLayout3, frameLayout4, view);
            i2 = 2;
        } else if (c != 3) {
            i2 = super.mo11260a(view, i);
        } else {
            FrameLayout frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
            C89219l.m154716b(frameLayout5, "");
            FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.av2);
            C89219l.m154716b(frameLayout6, "");
            m11951a(frameLayout5, frameLayout6, view);
        }
        mo11396o();
        return i2;
    }

    /* renamed from: a */
    private static void m11951a(ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        MethodCollector.m26663i(5354);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, m12159n());
            C89393b.m154949a(viewGroup2);
        }
        MethodCollector.m26664o(5354);
    }
}
