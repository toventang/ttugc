package com.bytedance.android.live.liveinteract.multilive.p341a.p349h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.p261b.C4423l;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.livesdk.p561j.C9073cl;
import com.bytedance.android.monitor.p714l.C11947a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.c */
public final class C5459c extends AbstractC5449a {
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a */
    public C5271a f14030a;

    static {
        Covode.recordClassIndex(6054);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11259a() {
        return R.layout.bc7;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: d */
    public final boolean mo11263d() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: c */
    public final EnumC4422k mo11262c() {
        return EnumC4422k.FLOATING;
    }

    /* renamed from: f */
    public final void mo11264f() {
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup != null) {
            viewGroup.post(new RunnableC5462c(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.c$c */
    public static final class RunnableC5462c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5459c f14033a;

        static {
            Covode.recordClassIndex(6057);
        }

        RunnableC5462c(C5459c cVar) {
            this.f14033a = cVar;
        }

        public final void run() {
            FrameLayout frameLayout;
            DataChannel dataChannel = this.f14033a.f14261h;
            EnumC4422k kVar = EnumC4422k.FLOATING;
            ViewGroup viewGroup = this.f14033a.f14257d;
            if (viewGroup != null) {
                frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d37);
            } else {
                frameLayout = null;
            }
            dataChannel.mo28320c(C4403aq.class, new C4423l(kVar, frameLayout, this.f14033a.f14258e, false, 0, 0, 0, 0, false, 496));
        }
    }

    /* renamed from: g */
    public final int mo11275g() {
        Integer num;
        int intValue;
        FrameLayout frameLayout;
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null || (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d37)) == null) {
            num = null;
        } else {
            num = Integer.valueOf(frameLayout.getHeight());
        }
        int d = C3966y.m9656a(C11947a.m21084a(this.f14257d.getContext())).heightPixels - C3966y.m9666d();
        if (num == null || (intValue = num.intValue()) == 0) {
            return d;
        }
        return intValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r2 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r4 != 0) goto L_0x002d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double mo11276h() {
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
            if (r0 == 0) goto L_0x003f
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
            int r0 = r5.mo11275g()
            int r0 = r0 * r1
            double r2 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r0
            double r0 = (double) r4
            java.lang.Double.isNaN(r0)
            double r2 = r2 / r0
            return r2
        L_0x003f:
            r1 = 0
            if (r2 == 0) goto L_0x0025
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.p341a.p349h.C5459c.mo11276h():double");
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.c$a */
    static final class RunnableC5460a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5459c f14031a;

        static {
            Covode.recordClassIndex(6055);
        }

        RunnableC5460a(C5459c cVar) {
            this.f14031a = cVar;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            ViewGroup.LayoutParams layoutParams3;
            FrameLayout frameLayout;
            FrameLayout frameLayout2;
            FrameLayout frameLayout3;
            FrameLayout frameLayout4;
            FrameLayout frameLayout5;
            FrameLayout frameLayout6;
            View findViewById;
            View findViewById2;
            ViewGroup viewGroup = this.f14031a.f14257d;
            ViewGroup.LayoutParams layoutParams4 = null;
            if (viewGroup == null || (findViewById2 = viewGroup.findViewById(R.id.wo)) == null) {
                layoutParams = null;
            } else {
                layoutParams = findViewById2.getLayoutParams();
            }
            if (!(layoutParams instanceof ConstraintLayout.C0547a)) {
                layoutParams = null;
            }
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            if (aVar != null) {
                double g = (double) this.f14031a.mo11275g();
                Double.isNaN(g);
                aVar.height = C89241a.m154729a(g * 0.10098522167487685d);
                ViewGroup viewGroup2 = this.f14031a.f14257d;
                if (!(viewGroup2 == null || (findViewById = viewGroup2.findViewById(R.id.wo)) == null)) {
                    findViewById.setLayoutParams(aVar);
                }
                C5459c cVar = this.f14031a;
                double g2 = (double) cVar.mo11275g();
                Double.isNaN(g2);
                int a = C89241a.m154729a(g2 * 0.1921182266009852d);
                ViewGroup viewGroup3 = cVar.f14257d;
                if (viewGroup3 == null || (frameLayout6 = (FrameLayout) viewGroup3.findViewById(R.id.d3_)) == null) {
                    layoutParams2 = null;
                } else {
                    layoutParams2 = frameLayout6.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
                aVar2.width = C89241a.m154729a(cVar.mo11276h() * 0.2660164043449346d);
                aVar2.height = a;
                double g3 = (double) cVar.mo11275g();
                Double.isNaN(g3);
                aVar2.bottomMargin = (int) (g3 * 0.007389162561576354d);
                aVar2.rightMargin = (int) (cVar.mo11276h() * 0.017734426956328972d);
                ViewGroup viewGroup4 = cVar.f14257d;
                if (!(viewGroup4 == null || (frameLayout5 = (FrameLayout) viewGroup4.findViewById(R.id.d3_)) == null)) {
                    frameLayout5.setLayoutParams(aVar2);
                }
                ViewGroup viewGroup5 = cVar.f14257d;
                if (viewGroup5 == null || (frameLayout4 = (FrameLayout) viewGroup5.findViewById(R.id.d39)) == null) {
                    layoutParams3 = null;
                } else {
                    layoutParams3 = frameLayout4.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar3 = (ConstraintLayout.C0547a) layoutParams3;
                aVar3.height = a;
                double g4 = (double) cVar.mo11275g();
                Double.isNaN(g4);
                aVar3.bottomMargin = (int) (g4 * 0.007389162561576354d);
                ViewGroup viewGroup6 = cVar.f14257d;
                if (!(viewGroup6 == null || (frameLayout3 = (FrameLayout) viewGroup6.findViewById(R.id.d39)) == null)) {
                    frameLayout3.setLayoutParams(aVar3);
                }
                ViewGroup viewGroup7 = cVar.f14257d;
                if (!(viewGroup7 == null || (frameLayout2 = (FrameLayout) viewGroup7.findViewById(R.id.d38)) == null)) {
                    layoutParams4 = frameLayout2.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar4 = (ConstraintLayout.C0547a) layoutParams4;
                aVar4.height = a;
                ViewGroup viewGroup8 = cVar.f14257d;
                if (viewGroup8 != null && (frameLayout = (FrameLayout) viewGroup8.findViewById(R.id.d38)) != null) {
                    frameLayout.setLayoutParams(aVar4);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5459c(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
        C4431e.f12034a.mo10201a(this);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.c$b */
    static final class C5461b extends AbstractC89220m implements AbstractC89172b<C89378p<? extends Boolean, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5459c f14032a;

        static {
            Covode.recordClassIndex(6056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5461b(C5459c cVar) {
            super(1);
            this.f14032a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89378p<? extends Boolean, ? extends Integer> pVar) {
            C89378p<? extends Boolean, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            if (!((Boolean) pVar2.getFirst()).booleanValue()) {
                this.f14032a.mo11264f();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b, com.bytedance.android.live.liveinteract.multilive.p341a.p349h.AbstractC5449a
    /* renamed from: a */
    public final void mo11256a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        super.mo11256a(viewGroup);
        mo11264f();
        ViewGroup viewGroup2 = this.f14257d;
        if (viewGroup2 != null) {
            viewGroup2.post(new RunnableC5460a(this));
        }
        this.f14261h.mo28310a(C9073cl.class, (AbstractC89172b) new C5461b(this));
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final void mo11274a(View view) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        C89219l.m154721d(view, "");
        super.mo11274a(view);
        ViewGroup viewGroup2 = this.f14257d;
        if (viewGroup2 != null) {
            int i = 0;
            for (T t : m12156c(viewGroup2)) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (i2 == 1) {
                    ViewGroup viewGroup3 = this.f14257d;
                    if (viewGroup3 != null) {
                        frameLayout = (FrameLayout) viewGroup3.findViewById(R.id.d38);
                        m12155a((View) t2, frameLayout);
                        i = i2;
                    }
                } else if (i2 == 2) {
                    ViewGroup viewGroup4 = this.f14257d;
                    if (viewGroup4 != null) {
                        frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.d39);
                        m12155a((View) t2, frameLayout);
                        i = i2;
                    }
                } else if (i2 == 3 && (viewGroup = this.f14257d) != null) {
                    frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                    m12155a((View) t2, frameLayout);
                    i = i2;
                }
                frameLayout = null;
                m12155a((View) t2, frameLayout);
                i = i2;
            }
        }
        C5271a aVar = this.f14030a;
        if (aVar == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        if (aVar.f13641l == 0) {
            C5271a aVar2 = this.f14030a;
            if (aVar2 == null) {
                C89219l.m154710a("mMultiGuestDataHolder");
            }
            aVar2.mo11109a(EnumC4422k.NORMAL);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11260a(View view, int i) {
        C89219l.m154721d(view, "");
        mo11264f();
        return super.mo11260a(view, i);
    }
}
