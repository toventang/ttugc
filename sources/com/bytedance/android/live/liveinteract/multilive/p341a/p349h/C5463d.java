package com.bytedance.android.live.liveinteract.multilive.p341a.p349h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.p261b.C4420i;
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
import p4600h.p4619j.C89271h;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.d */
public final class C5463d extends AbstractC5449a {
    static {
        Covode.recordClassIndex(6058);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11259a() {
        return R.layout.bc_;
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

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: c */
    public final EnumC4422k mo11262c() {
        return EnumC4422k.GRID_FIX;
    }

    /* renamed from: f */
    public final void mo11264f() {
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup != null) {
            viewGroup.post(new RunnableC5469f(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.d$f */
    public static final class RunnableC5469f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5463d f14039a;

        static {
            Covode.recordClassIndex(6064);
        }

        RunnableC5469f(C5463d dVar) {
            this.f14039a = dVar;
        }

        public final void run() {
            FrameLayout frameLayout;
            EnumC4422k kVar = EnumC4422k.GRID_FIX;
            ViewGroup viewGroup = this.f14039a.f14257d;
            if (viewGroup != null) {
                frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d37);
            } else {
                frameLayout = null;
            }
            this.f14039a.f14261h.mo28320c(C4403aq.class, new C4423l(kVar, frameLayout, this.f14039a.f14258e, false, 0, 0, 0, 0, false, 504));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.d$a */
    static final class View$OnClickListenerC5464a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5463d f14034a;

        static {
            Covode.recordClassIndex(6059);
        }

        View$OnClickListenerC5464a(C5463d dVar) {
            this.f14034a = dVar;
        }

        public final void onClick(View view) {
            this.f14034a.mo11255a(1);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.d$b */
    static final class View$OnClickListenerC5465b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5463d f14035a;

        static {
            Covode.recordClassIndex(6060);
        }

        View$OnClickListenerC5465b(C5463d dVar) {
            this.f14035a = dVar;
        }

        public final void onClick(View view) {
            this.f14035a.mo11255a(2);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.d$c */
    static final class View$OnClickListenerC5466c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5463d f14036a;

        static {
            Covode.recordClassIndex(6061);
        }

        View$OnClickListenerC5466c(C5463d dVar) {
            this.f14036a = dVar;
        }

        public final void onClick(View view) {
            this.f14036a.mo11255a(3);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.d$d */
    static final class C5467d extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5463d f14037a;

        static {
            Covode.recordClassIndex(6062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5467d(C5463d dVar) {
            super(1);
            this.f14037a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f14037a.mo11279b(num.intValue());
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5463d(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.d$e */
    static final class C5468e extends AbstractC89220m implements AbstractC89172b<C89378p<? extends Boolean, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5463d f14038a;

        static {
            Covode.recordClassIndex(6063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5468e(C5463d dVar) {
            super(1);
            this.f14038a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89378p<? extends Boolean, ? extends Integer> pVar) {
            C89378p<? extends Boolean, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            if (!((Boolean) pVar2.getFirst()).booleanValue()) {
                this.f14038a.mo11279b(((Number) pVar2.getSecond()).intValue());
                this.f14038a.mo11264f();
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
        mo11264f();
        ViewGroup viewGroup2 = this.f14257d;
        if (!(viewGroup2 == null || (frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.av0)) == null)) {
            frameLayout3.setOnClickListener(new View$OnClickListenerC5464a(this));
        }
        ViewGroup viewGroup3 = this.f14257d;
        if (!(viewGroup3 == null || (frameLayout2 = (FrameLayout) viewGroup3.findViewById(R.id.av1)) == null)) {
            frameLayout2.setOnClickListener(new View$OnClickListenerC5465b(this));
        }
        ViewGroup viewGroup4 = this.f14257d;
        if (!(viewGroup4 == null || (frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.av2)) == null)) {
            frameLayout.setOnClickListener(new View$OnClickListenerC5466c(this));
        }
        this.f14261h.mo28310a(C4420i.class, (AbstractC89172b) new C5467d(this)).mo28310a(C9073cl.class, (AbstractC89172b) new C5468e(this));
    }

    /* renamed from: b */
    public final void mo11279b(int i) {
        View findViewById;
        View findViewById2;
        ViewGroup.LayoutParams layoutParams;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        if (i > 0 && !C89219l.m154714a(this.f14261h.mo28318b(C9074cm.class), (Object) true)) {
            int c = C89271h.m154772c(C3966y.m9664c(), C3966y.m9662b());
            if (i < c) {
                int i2 = (c - i) / 2;
                ViewGroup viewGroup = this.f14257d;
                if (!(viewGroup == null || (findViewById8 = viewGroup.findViewById(R.id.c82)) == null)) {
                    C89393b.m154951c(findViewById8);
                }
                ViewGroup viewGroup2 = this.f14257d;
                ViewGroup.LayoutParams layoutParams2 = null;
                if (viewGroup2 == null || (findViewById7 = viewGroup2.findViewById(R.id.c82)) == null) {
                    layoutParams = null;
                } else {
                    layoutParams = findViewById7.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
                aVar.width = i2;
                ViewGroup viewGroup3 = this.f14257d;
                if (!(viewGroup3 == null || (findViewById6 = viewGroup3.findViewById(R.id.c82)) == null)) {
                    findViewById6.setLayoutParams(aVar);
                }
                ViewGroup viewGroup4 = this.f14257d;
                if (!(viewGroup4 == null || (findViewById5 = viewGroup4.findViewById(R.id.dk9)) == null)) {
                    C89393b.m154951c(findViewById5);
                }
                ViewGroup viewGroup5 = this.f14257d;
                if (!(viewGroup5 == null || (findViewById4 = viewGroup5.findViewById(R.id.dk9)) == null)) {
                    layoutParams2 = findViewById4.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
                aVar2.width = i2;
                ViewGroup viewGroup6 = this.f14257d;
                if (viewGroup6 != null && (findViewById3 = viewGroup6.findViewById(R.id.dk9)) != null) {
                    findViewById3.setLayoutParams(aVar2);
                    return;
                }
                return;
            }
            ViewGroup viewGroup7 = this.f14257d;
            if (!(viewGroup7 == null || (findViewById2 = viewGroup7.findViewById(R.id.c82)) == null)) {
                C89393b.m154949a(findViewById2);
            }
            ViewGroup viewGroup8 = this.f14257d;
            if (viewGroup8 != null && (findViewById = viewGroup8.findViewById(R.id.dk9)) != null) {
                C89393b.m154949a(findViewById);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11260a(View view, int i) {
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null) {
            return -1;
        }
        mo11264f();
        int c = mo11392c(i);
        int i2 = 3;
        if (c == 1) {
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d38);
            C89219l.m154716b(frameLayout, "");
            FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.av0);
            C89219l.m154716b(frameLayout2, "");
            m11972a(frameLayout, frameLayout2, view);
            i2 = 1;
        } else if (c == 2) {
            FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d39);
            C89219l.m154716b(frameLayout3, "");
            FrameLayout frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.av1);
            C89219l.m154716b(frameLayout4, "");
            m11972a(frameLayout3, frameLayout4, view);
            i2 = 2;
        } else if (c != 3) {
            i2 = super.mo11260a(view, i);
        } else {
            FrameLayout frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
            C89219l.m154716b(frameLayout5, "");
            FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.av2);
            C89219l.m154716b(frameLayout6, "");
            m11972a(frameLayout5, frameLayout6, view);
        }
        mo11396o();
        return i2;
    }

    /* renamed from: a */
    private static void m11972a(ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        MethodCollector.m26663i(5068);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, m12159n());
            C89393b.m154949a(viewGroup2);
        }
        MethodCollector.m26664o(5068);
    }
}
