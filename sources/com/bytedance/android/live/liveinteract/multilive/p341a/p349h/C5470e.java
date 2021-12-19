package com.bytedance.android.live.liveinteract.multilive.p341a.p349h;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.p261b.C4420i;
import com.bytedance.android.live.liveinteract.api.p261b.C4423l;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.livesdk.p561j.C9073cl;
import com.bytedance.android.livesdk.p561j.C9074cm;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.e */
public final class C5470e extends AbstractC5449a {
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a */
    public C5271a f14040a;

    static {
        Covode.recordClassIndex(6065);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11259a() {
        return R.layout.bc9;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: d */
    public final boolean mo11263d() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: c */
    public final EnumC4422k mo11262c() {
        return EnumC4422k.GRID;
    }

    /* renamed from: f */
    public final void mo11264f() {
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup != null) {
            viewGroup.post(new RunnableC5473c(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.e$c */
    public static final class RunnableC5473c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5470e f14043a;

        static {
            Covode.recordClassIndex(6068);
        }

        RunnableC5473c(C5470e eVar) {
            this.f14043a = eVar;
        }

        public final void run() {
            FrameLayout frameLayout;
            boolean z;
            View findViewById;
            DataChannel dataChannel = this.f14043a.f14261h;
            EnumC4422k kVar = EnumC4422k.GRID;
            ViewGroup viewGroup = this.f14043a.f14257d;
            if (viewGroup != null) {
                frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d37);
            } else {
                frameLayout = null;
            }
            boolean z2 = this.f14043a.f14258e;
            ViewGroup viewGroup2 = this.f14043a.f14257d;
            if (viewGroup2 == null || (findViewById = viewGroup2.findViewById(R.id.el3)) == null || findViewById.getVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            dataChannel.mo28320c(C4403aq.class, new C4423l(kVar, frameLayout, z2, false, 0, 0, 0, 0, z, 240));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.e$a */
    static final class C5471a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5470e f14041a;

        static {
            Covode.recordClassIndex(6066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5471a(C5470e eVar) {
            super(1);
            this.f14041a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f14041a.mo11284b(num.intValue());
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5470e(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
        C4431e.f12034a.mo10201a(this);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.e$b */
    static final class C5472b extends AbstractC89220m implements AbstractC89172b<C89378p<? extends Boolean, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5470e f14042a;

        static {
            Covode.recordClassIndex(6067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5472b(C5470e eVar) {
            super(1);
            this.f14042a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89378p<? extends Boolean, ? extends Integer> pVar) {
            C89378p<? extends Boolean, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            if (!((Boolean) pVar2.getFirst()).booleanValue()) {
                this.f14042a.mo11284b(((Number) pVar2.getSecond()).intValue());
                this.f14042a.mo11264f();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b, com.bytedance.android.live.liveinteract.multilive.p341a.p349h.AbstractC5449a
    /* renamed from: a */
    public final void mo11256a(ViewGroup viewGroup) {
        View findViewById;
        View findViewById2;
        C89219l.m154721d(viewGroup, "");
        super.mo11256a(viewGroup);
        ViewGroup viewGroup2 = this.f14257d;
        if (!(viewGroup2 == null || (findViewById2 = viewGroup2.findViewById(R.id.el3)) == null)) {
            findViewById2.setVisibility(8);
        }
        ViewGroup viewGroup3 = this.f14257d;
        if (!(viewGroup3 == null || (findViewById = viewGroup3.findViewById(R.id.wo)) == null)) {
            findViewById.setVisibility(8);
        }
        mo11264f();
        this.f14261h.mo28310a(C4420i.class, (AbstractC89172b) new C5471a(this)).mo28310a(C9073cl.class, (AbstractC89172b) new C5472b(this));
    }

    /* renamed from: b */
    public final void mo11284b(int i) {
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
    public final void mo11274a(View view) {
        MethodCollector.m26663i(5495);
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null) {
            MethodCollector.m26664o(5495);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (C89219l.m154714a(parent, viewGroup.findViewById(R.id.d38))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d38)).removeView(view);
            } else if (C89219l.m154714a(parent, viewGroup.findViewById(R.id.d39))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d39)).removeView(view);
            } else if (C89219l.m154714a(parent, viewGroup.findViewById(R.id.d3_))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d3_)).removeView(view);
            }
        }
        ViewGroup viewGroup2 = this.f14257d;
        if (viewGroup2 != null) {
            ArrayList<View> c = m12156c(viewGroup2);
            int size = c.size();
            if (size == 0) {
                FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.d38);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(8);
                FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.d39);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setVisibility(8);
                FrameLayout frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.d3_);
                C89219l.m154716b(frameLayout3, "");
                frameLayout3.setVisibility(8);
                View findViewById = viewGroup2.findViewById(R.id.el3);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = viewGroup2.findViewById(R.id.wo);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                View findViewById3 = viewGroup2.findViewById(R.id.cyj);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
                View findViewById4 = viewGroup2.findViewById(R.id.cyk);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(8);
                }
                View findViewById5 = viewGroup2.findViewById(R.id.cyg);
                if (findViewById5 != null) {
                    findViewById5.setVisibility(8);
                }
            } else if (size == 1) {
                FrameLayout frameLayout4 = (FrameLayout) viewGroup2.findViewById(R.id.d38);
                C89219l.m154716b(frameLayout4, "");
                frameLayout4.setVisibility(8);
                FrameLayout frameLayout5 = (FrameLayout) viewGroup2.findViewById(R.id.d3_);
                C89219l.m154716b(frameLayout5, "");
                frameLayout5.setVisibility(8);
                FrameLayout frameLayout6 = (FrameLayout) viewGroup2.findViewById(R.id.d39);
                C89219l.m154716b(frameLayout6, "");
                frameLayout6.setVisibility(0);
                View view2 = c.get(0);
                C89219l.m154716b(view2, "");
                m12155a(view2, (FrameLayout) viewGroup2.findViewById(R.id.d39));
                View findViewById6 = viewGroup2.findViewById(R.id.cyj);
                if (findViewById6 != null) {
                    findViewById6.setVisibility(8);
                }
                View findViewById7 = viewGroup2.findViewById(R.id.cyk);
                if (findViewById7 != null) {
                    findViewById7.setVisibility(8);
                }
                View findViewById8 = viewGroup2.findViewById(R.id.cyg);
                if (findViewById8 != null) {
                    findViewById8.setVisibility(0);
                }
            } else if (size == 2) {
                FrameLayout frameLayout7 = (FrameLayout) viewGroup2.findViewById(R.id.d38);
                C89219l.m154716b(frameLayout7, "");
                frameLayout7.setVisibility(8);
                FrameLayout frameLayout8 = (FrameLayout) viewGroup2.findViewById(R.id.d39);
                C89219l.m154716b(frameLayout8, "");
                frameLayout8.setVisibility(0);
                FrameLayout frameLayout9 = (FrameLayout) viewGroup2.findViewById(R.id.d3_);
                if (frameLayout9 != null) {
                    frameLayout9.setVisibility(0);
                }
                View view3 = c.get(0);
                C89219l.m154716b(view3, "");
                m12155a(view3, (FrameLayout) viewGroup2.findViewById(R.id.d39));
                View view4 = c.get(1);
                C89219l.m154716b(view4, "");
                m12155a(view4, (FrameLayout) viewGroup2.findViewById(R.id.d3_));
                View findViewById9 = viewGroup2.findViewById(R.id.cyj);
                if (findViewById9 != null) {
                    findViewById9.setVisibility(8);
                }
                View findViewById10 = viewGroup2.findViewById(R.id.cyk);
                if (findViewById10 != null) {
                    findViewById10.setVisibility(0);
                }
                View findViewById11 = viewGroup2.findViewById(R.id.cyg);
                if (findViewById11 != null) {
                    findViewById11.setVisibility(0);
                }
            }
            mo11264f();
        }
        C5271a aVar = this.f14040a;
        if (aVar == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        if (aVar.f13641l == 0) {
            C5271a aVar2 = this.f14040a;
            if (aVar2 == null) {
                C89219l.m154710a("mMultiGuestDataHolder");
            }
            aVar2.mo11109a(EnumC4422k.NORMAL);
        }
        MethodCollector.m26664o(5495);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11260a(View view, int i) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View childAt;
        View childAt2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        FrameLayout frameLayout5;
        MethodCollector.m26663i(5384);
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null) {
            MethodCollector.m26664o(5384);
            return -1;
        }
        View findViewById = viewGroup.findViewById(R.id.el3);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = viewGroup.findViewById(R.id.wo);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        mo11264f();
        FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.d38);
        if (frameLayout6 == null || frameLayout6.getChildCount() != 0 || (frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d39)) == null || frameLayout5.getChildCount() != 0) {
            FrameLayout frameLayout7 = (FrameLayout) viewGroup.findViewById(R.id.d38);
            if (frameLayout7 == null || frameLayout7.getChildCount() != 0 || (frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d39)) == null || frameLayout3.getChildCount() <= 0 || (frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.d3_)) == null || frameLayout4.getChildCount() != 0) {
                FrameLayout frameLayout8 = (FrameLayout) viewGroup.findViewById(R.id.d38);
                if (frameLayout8 == null || frameLayout8.getChildCount() != 0 || (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d39)) == null || frameLayout.getChildCount() <= 0 || (frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.d3_)) == null || frameLayout2.getChildCount() <= 0) {
                    int a = super.mo11260a(view, i);
                    MethodCollector.m26664o(5384);
                    return a;
                }
                FrameLayout frameLayout9 = (FrameLayout) viewGroup.findViewById(R.id.d39);
                if (!(frameLayout9 == null || (childAt2 = frameLayout9.getChildAt(0)) == null)) {
                    m12155a(childAt2, (FrameLayout) viewGroup.findViewById(R.id.d38));
                }
                FrameLayout frameLayout10 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                if (!(frameLayout10 == null || (childAt = frameLayout10.getChildAt(0)) == null)) {
                    m12155a(childAt, (FrameLayout) viewGroup.findViewById(R.id.d39));
                }
                FrameLayout frameLayout11 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                if (frameLayout11 != null) {
                    frameLayout11.setVisibility(0);
                }
                FrameLayout frameLayout12 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                if (frameLayout12 != null) {
                    frameLayout12.addView(view, m12159n());
                }
                View findViewById3 = viewGroup.findViewById(R.id.cyj);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(0);
                }
                MethodCollector.m26664o(5384);
                return 3;
            }
            FrameLayout frameLayout13 = (FrameLayout) viewGroup.findViewById(R.id.d38);
            C89219l.m154716b(frameLayout13, "");
            frameLayout13.setVisibility(8);
            FrameLayout frameLayout14 = (FrameLayout) viewGroup.findViewById(R.id.d39);
            C89219l.m154716b(frameLayout14, "");
            frameLayout14.setVisibility(0);
            FrameLayout frameLayout15 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
            if (frameLayout15 != null) {
                frameLayout15.setVisibility(0);
            }
            FrameLayout frameLayout16 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
            if (frameLayout16 != null) {
                frameLayout16.addView(view, m12159n());
            }
            View findViewById4 = viewGroup.findViewById(R.id.cyk);
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
            }
            MethodCollector.m26664o(5384);
            return 2;
        }
        FrameLayout frameLayout17 = (FrameLayout) viewGroup.findViewById(R.id.d38);
        C89219l.m154716b(frameLayout17, "");
        frameLayout17.setVisibility(8);
        FrameLayout frameLayout18 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
        C89219l.m154716b(frameLayout18, "");
        frameLayout18.setVisibility(8);
        FrameLayout frameLayout19 = (FrameLayout) viewGroup.findViewById(R.id.d39);
        C89219l.m154716b(frameLayout19, "");
        frameLayout19.setVisibility(0);
        ((FrameLayout) viewGroup.findViewById(R.id.d39)).addView(view, m12159n());
        View findViewById5 = viewGroup.findViewById(R.id.cyg);
        if (findViewById5 != null) {
            findViewById5.setVisibility(0);
        }
        MethodCollector.m26664o(5384);
        return 1;
    }
}
