package com.bytedance.android.live.liveinteract.multilive.p362e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.p261b.C4423l;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5517c;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5698a;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.p561j.C9006a;
import com.bytedance.android.livesdk.p561j.C9116ea;
import com.bytedance.android.livesdk.p561j.C9117eb;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9133o;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a */
public abstract class AbstractC5612a implements AbstractC5622b {

    /* renamed from: a */
    private View f14256a;

    /* renamed from: d */
    public ViewGroup f14257d;

    /* renamed from: e */
    public boolean f14258e = true;

    /* renamed from: f */
    public C5698a f14259f;

    /* renamed from: g */
    C5631d f14260g;

    /* renamed from: h */
    public final DataChannel f14261h;

    static {
        Covode.recordClassIndex(6209);
    }

    /* renamed from: b */
    public int mo11261b() {
        return 0;
    }

    /* renamed from: n */
    public static FrameLayout.LayoutParams m12159n() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    /* renamed from: k */
    public final void mo11393k() {
        FrameLayout e = mo11309e();
        if (e != null) {
            e.post(new RunnableC5613a(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: l */
    public final void mo11394l() {
        FrameLayout e = mo11309e();
        if (e != null) {
            e.post(new RunnableC5620h(this));
        }
    }

    /* renamed from: e */
    public FrameLayout mo11309e() {
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup != null) {
            return (FrameLayout) viewGroup.findViewById(R.id.d37);
        }
        return null;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$b */
    static final class RunnableC5614b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f14263a;

        /* renamed from: b */
        final /* synthetic */ int f14264b;

        /* renamed from: c */
        final /* synthetic */ AbstractC5612a f14265c;

        /* renamed from: d */
        final /* synthetic */ RelativeLayout.LayoutParams f14266d;

        static {
            Covode.recordClassIndex(6211);
        }

        RunnableC5614b(int i, int i2, AbstractC5612a aVar, RelativeLayout.LayoutParams layoutParams) {
            this.f14263a = i;
            this.f14264b = i2;
            this.f14265c = aVar;
            this.f14266d = layoutParams;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            View findViewById;
            View findViewById2;
            ViewGroup viewGroup = this.f14265c.f14257d;
            if (viewGroup == null || (findViewById2 = viewGroup.findViewById(R.id.el3)) == null) {
                layoutParams = null;
            } else {
                layoutParams = findViewById2.getLayoutParams();
                if (layoutParams != null) {
                    int i = this.f14263a;
                    int i2 = this.f14264b;
                    if (i <= i2) {
                        i = i2;
                    }
                    layoutParams.height = i;
                }
            }
            ViewGroup viewGroup2 = this.f14265c.f14257d;
            if (viewGroup2 != null && (findViewById = viewGroup2.findViewById(R.id.el3)) != null) {
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$d */
    public static final class RunnableC5616d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC5612a f14268a;

        /* renamed from: b */
        final /* synthetic */ int f14269b;

        static {
            Covode.recordClassIndex(6213);
        }

        RunnableC5616d(AbstractC5612a aVar, int i) {
            this.f14268a = aVar;
            this.f14269b = i;
        }

        public final void run() {
            ViewGroup viewGroup;
            View findViewById;
            ViewGroup.LayoutParams layoutParams;
            View findViewById2;
            View findViewById3;
            int i = this.f14269b;
            ViewGroup viewGroup2 = this.f14268a.f14257d;
            if ((viewGroup2 == null || (findViewById3 = viewGroup2.findViewById(R.id.el3)) == null || i != findViewById3.getHeight()) && (viewGroup = this.f14268a.f14257d) != null && (findViewById = viewGroup.findViewById(R.id.el3)) != null && (layoutParams = findViewById.getLayoutParams()) != null) {
                layoutParams.height = this.f14269b;
                ViewGroup viewGroup3 = this.f14268a.f14257d;
                if (viewGroup3 != null && (findViewById2 = viewGroup3.findViewById(R.id.el3)) != null) {
                    findViewById2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$h */
    static final class RunnableC5620h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC5612a f14273a;

        static {
            Covode.recordClassIndex(6217);
        }

        RunnableC5620h(AbstractC5612a aVar) {
            this.f14273a = aVar;
        }

        public final void run() {
            View view;
            FrameLayout e = this.f14273a.mo11309e();
            if (e == null || e.getChildCount() != 0) {
                FrameLayout e2 = this.f14273a.mo11309e();
                C5631d dVar = null;
                if (e2 != null) {
                    view = e2.getChildAt(0);
                } else {
                    view = null;
                }
                if (view instanceof C5631d) {
                    dVar = view;
                }
                C5631d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.mo11411a();
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo11397p() {
        float f;
        int a;
        float f2;
        if (!LiveBannerExperiment.isNewBannerEnable()) {
            if (C11279p.m20029f()) {
                f2 = 143.0f;
            } else {
                f2 = 152.0f;
            }
            a = C3966y.m9653a(f2);
        } else {
            if (C11279p.m20029f()) {
                f = 129.0f;
            } else {
                f = 138.0f;
            }
            a = C3966y.m9653a(f);
        }
        mo11255a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$a */
    public static final class RunnableC5613a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC5612a f14262a;

        static {
            Covode.recordClassIndex(6210);
        }

        RunnableC5613a(AbstractC5612a aVar) {
            this.f14262a = aVar;
        }

        public final void run() {
            FrameLayout e;
            MethodCollector.m26663i(4362);
            if (C4431e.f12034a.mo10200a().isEmpty()) {
                MethodCollector.m26664o(4362);
                return;
            }
            AbstractC5612a aVar = this.f14262a;
            Context context = null;
            if (aVar.f14257d != null) {
                if (aVar.f14260g == null) {
                    ViewGroup viewGroup = aVar.f14257d;
                    if (viewGroup == null || (context = viewGroup.getContext()) == null) {
                        C89219l.m154715b();
                    }
                    aVar.f14260g = new C5631d(context, aVar.f14261h, aVar.f14258e);
                }
                C5631d dVar = aVar.f14260g;
                if (dVar != null) {
                    FrameLayout e2 = this.f14262a.mo11309e();
                    if (e2 == null) {
                        MethodCollector.m26664o(4362);
                        return;
                    } else if (e2.getChildCount() != 0 || (e = this.f14262a.mo11309e()) == null) {
                        MethodCollector.m26664o(4362);
                        return;
                    } else {
                        e.addView(dVar);
                        MethodCollector.m26664o(4362);
                        return;
                    }
                }
            }
            MethodCollector.m26664o(4362);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$c */
    public static final class RunnableC5615c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC5612a f14267a;

        static {
            Covode.recordClassIndex(6212);
        }

        RunnableC5615c(AbstractC5612a aVar) {
            this.f14267a = aVar;
        }

        public final void run() {
            boolean z;
            boolean z2;
            View findViewById;
            EnumC4422k c = this.f14267a.mo11262c();
            FrameLayout e = this.f14267a.mo11309e();
            Boolean bool = (Boolean) this.f14267a.f14261h.mo28318b(C9119ed.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            ViewGroup viewGroup = this.f14267a.f14257d;
            if (viewGroup == null || (findViewById = viewGroup.findViewById(R.id.el3)) == null || findViewById.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f14267a.f14261h.mo28320c(C4403aq.class, new C4423l(c, e, false, z, 0, 0, 0, 0, z2, 244));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$i */
    public static final class RunnableC5621i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC5612a f14274a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f14275b;

        static {
            Covode.recordClassIndex(6218);
        }

        RunnableC5621i(AbstractC5612a aVar, ViewGroup viewGroup) {
            this.f14274a = aVar;
            this.f14275b = viewGroup;
        }

        public final void run() {
            View childAt;
            if (this.f14275b.getChildCount() != 0 && (childAt = this.f14275b.getChildAt(0)) != null && (childAt instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                if (viewGroup.getChildCount() > 0) {
                    View childAt2 = viewGroup.getChildAt(0);
                    C89219l.m154716b(childAt2, "");
                    ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                    if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                        layoutParams = null;
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (layoutParams2 != null) {
                        if ((this.f14274a.mo11262c() == EnumC4422k.GRID_FIX || this.f14274a.mo11262c() == EnumC4422k.GRID) && !C5517c.m12024a(childAt2)) {
                            layoutParams2.gravity = 49;
                            layoutParams2.topMargin = C3966y.m9653a(78.0f);
                        } else {
                            layoutParams2.gravity = 17;
                        }
                        childAt2.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo11395m() {
        boolean z;
        if (mo11262c() == EnumC4422k.NORMAL) {
            EnumC4422k c = mo11262c();
            FrameLayout e = mo11309e();
            Boolean bool = (Boolean) this.f14261h.mo28318b(C9119ed.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.f14261h.mo28320c(C4403aq.class, new C4423l(c, e, false, z, 0, 0, 0, 0, false, 500));
            return;
        }
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup != null) {
            viewGroup.post(new RunnableC5615c(this));
        }
    }

    /* renamed from: q */
    public final void mo11398q() {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        Boolean bool = (Boolean) this.f14261h.mo28318b(C9006a.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean bool2 = (Boolean) this.f14261h.mo28318b(C9116ea.class);
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        Boolean bool3 = (Boolean) this.f14261h.mo28318b(C9133o.class);
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        if (!z && !z2 && !z3) {
            if (C11279p.m20029f()) {
                f = 129.0f;
            } else {
                f = 138.0f;
            }
            mo11255a(C3966y.m9653a(f));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: o */
    public final void mo11396o() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        FrameLayout frameLayout5;
        FrameLayout frameLayout6;
        FrameLayout frameLayout7;
        FrameLayout frameLayout8;
        FrameLayout frameLayout9;
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null || (frameLayout8 = (FrameLayout) viewGroup.findViewById(R.id.d38)) == null || frameLayout8.getChildCount() != 1) {
            ViewGroup viewGroup2 = this.f14257d;
            if (!(viewGroup2 == null || (frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.av0)) == null)) {
                C89393b.m154951c(frameLayout);
            }
        } else {
            ViewGroup viewGroup3 = this.f14257d;
            if (!(viewGroup3 == null || (frameLayout9 = (FrameLayout) viewGroup3.findViewById(R.id.av0)) == null)) {
                C89393b.m154949a(frameLayout9);
            }
        }
        ViewGroup viewGroup4 = this.f14257d;
        if (viewGroup4 == null || (frameLayout6 = (FrameLayout) viewGroup4.findViewById(R.id.d39)) == null || frameLayout6.getChildCount() != 1) {
            ViewGroup viewGroup5 = this.f14257d;
            if (!(viewGroup5 == null || (frameLayout2 = (FrameLayout) viewGroup5.findViewById(R.id.av1)) == null)) {
                C89393b.m154951c(frameLayout2);
            }
        } else {
            ViewGroup viewGroup6 = this.f14257d;
            if (!(viewGroup6 == null || (frameLayout7 = (FrameLayout) viewGroup6.findViewById(R.id.av1)) == null)) {
                C89393b.m154949a(frameLayout7);
            }
        }
        ViewGroup viewGroup7 = this.f14257d;
        if (viewGroup7 == null || (frameLayout4 = (FrameLayout) viewGroup7.findViewById(R.id.d3_)) == null || frameLayout4.getChildCount() != 1) {
            ViewGroup viewGroup8 = this.f14257d;
            if (viewGroup8 != null && (frameLayout3 = (FrameLayout) viewGroup8.findViewById(R.id.av2)) != null) {
                C89393b.m154951c(frameLayout3);
                return;
            }
            return;
        }
        ViewGroup viewGroup9 = this.f14257d;
        if (viewGroup9 != null && (frameLayout5 = (FrameLayout) viewGroup9.findViewById(R.id.av2)) != null) {
            C89393b.m154949a(frameLayout5);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final void mo11390a(C5698a aVar) {
        C89219l.m154721d(aVar, "");
        this.f14259f = aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: b */
    public void mo11258b(boolean z) {
        this.f14258e = z;
    }

    public AbstractC5612a(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f14261h = dataChannel;
    }

    /* renamed from: d */
    private final void m12157d(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.post(new RunnableC5621i(this, viewGroup));
        }
    }

    /* renamed from: e */
    private static View m12158e(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$e */
    public static final class C5617e extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5612a f14270a;

        static {
            Covode.recordClassIndex(6214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5617e(AbstractC5612a aVar) {
            super(1);
            this.f14270a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f14270a.mo11397p();
            } else {
                this.f14270a.mo11398q();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$f */
    public static final class C5618f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5612a f14271a;

        static {
            Covode.recordClassIndex(6215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5618f(AbstractC5612a aVar) {
            super(1);
            this.f14271a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f14271a.mo11397p();
            } else {
                this.f14271a.mo11398q();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: b */
    public final void mo11391b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        ViewGroup viewGroup2 = this.f14257d;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        viewGroup.removeView(this.f14257d);
    }

    /* renamed from: a */
    private final void mo11255a(int i) {
        View findViewById;
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup != null) {
            viewGroup.post(new RunnableC5616d(this, i));
        }
        ViewGroup viewGroup2 = this.f14257d;
        if (viewGroup2 != null && (findViewById = viewGroup2.findViewById(R.id.el3)) != null && findViewById.getVisibility() == 0) {
            mo11395m();
        }
    }

    /* renamed from: c */
    public static ArrayList<View> m12156c(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        ArrayList<View> arrayList = new ArrayList<>();
        View e = m12158e((ViewGroup) viewGroup.findViewById(R.id.d38));
        if (e != null) {
            arrayList.add(e);
        }
        View e2 = m12158e((ViewGroup) viewGroup.findViewById(R.id.d39));
        if (e2 != null) {
            arrayList.add(e2);
        }
        View e3 = m12158e((ViewGroup) viewGroup.findViewById(R.id.d3_));
        if (e3 != null) {
            arrayList.add(e3);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.e.a$g */
    public static final class C5619g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5612a f14272a;

        static {
            Covode.recordClassIndex(6216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5619g(AbstractC5612a aVar) {
            super(1);
            this.f14272a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean z;
            View findViewById;
            float f;
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = (Boolean) this.f14272a.f14261h.mo28318b(C9006a.class);
            boolean z2 = false;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            Boolean bool3 = (Boolean) this.f14272a.f14261h.mo28318b(C9116ea.class);
            if (bool3 != null) {
                z2 = bool3.booleanValue();
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f14272a.f14261h.mo28318b(C9117eb.class);
            if (z || z2 || !booleanValue) {
                this.f14272a.mo11398q();
            } else {
                AbstractC5612a aVar = this.f14272a;
                if (layoutParams != null) {
                    if (C11279p.m20029f()) {
                        f = 129.0f;
                    } else {
                        f = 138.0f;
                    }
                    int a = C3966y.m9653a(f);
                    int a2 = layoutParams.height + layoutParams.topMargin + C3966y.m9653a(2.0f);
                    ViewGroup viewGroup = aVar.f14257d;
                    if (viewGroup != null) {
                        viewGroup.post(new RunnableC5614b(a2, a, aVar, layoutParams));
                    }
                }
                ViewGroup viewGroup2 = aVar.f14257d;
                if (!(viewGroup2 == null || (findViewById = viewGroup2.findViewById(R.id.el3)) == null || findViewById.getVisibility() != 0)) {
                    aVar.mo11395m();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final int mo11392c(int i) {
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d38);
        if (frameLayout != null && frameLayout.getChildCount() == 0) {
            arrayList.add(1);
        }
        FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.d39);
        if (frameLayout2 != null && frameLayout2.getChildCount() == 0) {
            arrayList.add(2);
        }
        FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
        if (frameLayout3 != null && frameLayout3.getChildCount() == 0) {
            arrayList.add(3);
        }
        if (arrayList.contains(Integer.valueOf(i))) {
            return i;
        }
        if (arrayList.size() <= 0) {
            return -1;
        }
        Object obj = arrayList.get(0);
        C89219l.m154716b(obj, "");
        return ((Number) obj).intValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public void mo11274a(View view) {
        ViewParent parent;
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup != null && (parent = view.getParent()) != null) {
            if (C89219l.m154714a(parent, viewGroup.findViewById(R.id.d38))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d38)).removeView(view);
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.av0);
                C89219l.m154716b(frameLayout, "");
                C89393b.m154951c(frameLayout);
            } else if (C89219l.m154714a(parent, viewGroup.findViewById(R.id.d39))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d39)).removeView(view);
                FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.av1);
                C89219l.m154716b(frameLayout2, "");
                C89393b.m154951c(frameLayout2);
            } else if (C89219l.m154714a(parent, viewGroup.findViewById(R.id.d3_))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d3_)).removeView(view);
                FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.av2);
                C89219l.m154716b(frameLayout3, "");
                C89393b.m154951c(frameLayout3);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public void mo11256a(ViewGroup viewGroup) {
        Context context;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C89219l.m154721d(viewGroup, "");
        Context context2 = viewGroup.getContext();
        ViewGroup viewGroup2 = this.f14257d;
        if (viewGroup2 != null && C89219l.m154714a(viewGroup2.getParent(), viewGroup)) {
            viewGroup.removeView(this.f14257d);
        }
        if (this.f14257d == null) {
            ViewGroup viewGroup3 = (ViewGroup) C1764a.m5927a(LayoutInflater.from(context2), mo11259a(), viewGroup, false);
            this.f14257d = viewGroup3;
            if (!(viewGroup3 == null || (context = viewGroup3.getContext()) == null)) {
                View a = m12153a(context, viewGroup3);
                this.f14256a = a;
                if (a != null) {
                    FrameLayout frameLayout3 = (FrameLayout) viewGroup3.findViewById(R.id.av0);
                    if (frameLayout3 != null) {
                        frameLayout3.addView(m12153a(context, viewGroup3));
                    }
                    FrameLayout frameLayout4 = (FrameLayout) viewGroup3.findViewById(R.id.av1);
                    if (frameLayout4 != null) {
                        frameLayout4.addView(m12153a(context, viewGroup3));
                    }
                    FrameLayout frameLayout5 = (FrameLayout) viewGroup3.findViewById(R.id.av2);
                    if (frameLayout5 != null) {
                        frameLayout5.addView(m12153a(context, viewGroup3));
                    }
                    ViewGroup viewGroup4 = this.f14257d;
                    FrameLayout frameLayout6 = null;
                    if (viewGroup4 != null) {
                        frameLayout = (FrameLayout) viewGroup4.findViewById(R.id.av0);
                    } else {
                        frameLayout = null;
                    }
                    m12157d(frameLayout);
                    ViewGroup viewGroup5 = this.f14257d;
                    if (viewGroup5 != null) {
                        frameLayout2 = (FrameLayout) viewGroup5.findViewById(R.id.av1);
                    } else {
                        frameLayout2 = null;
                    }
                    m12157d(frameLayout2);
                    ViewGroup viewGroup6 = this.f14257d;
                    if (viewGroup6 != null) {
                        frameLayout6 = (FrameLayout) viewGroup6.findViewById(R.id.av2);
                    }
                    m12157d(frameLayout6);
                }
            }
        }
        viewGroup.addView(this.f14257d);
        ViewGroup viewGroup7 = this.f14257d;
        if (viewGroup7 != null) {
            viewGroup7.setVisibility(0);
        }
        mo11395m();
        this.f14261h.mo28314b(C9116ea.class, (AbstractC89172b) new C5617e(this)).mo28314b(C9006a.class, (AbstractC89172b) new C5618f(this)).mo28314b(C9133o.class, (AbstractC89172b) new C5619g(this));
    }

    /* renamed from: a */
    private final View m12153a(Context context, ViewGroup viewGroup) {
        if (mo11261b() == 0) {
            return null;
        }
        return C1764a.m5927a(LayoutInflater.from(context), mo11261b(), (ViewGroup) viewGroup.findViewById(R.id.av0), false);
    }

    /* renamed from: a */
    public static void m12155a(View view, FrameLayout frameLayout) {
        C89219l.m154721d(view, "");
        if (frameLayout != null && !C89219l.m154714a(view.getParent(), frameLayout)) {
            boolean z = view instanceof C5235a;
            if (z) {
                ((C5235a) view).setAdjustParent(true);
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            View e = m12158e(frameLayout);
            if (e != null && (e instanceof C5235a)) {
                ((C5235a) e).setAdjustParent(true);
            }
            frameLayout.removeAllViews();
            frameLayout.addView(view, m12159n());
            if (z) {
                ((C5235a) view).setAdjustParent(false);
            }
            frameLayout.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public int mo11260a(View view, int i) {
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null) {
            return -1;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d38);
        if (frameLayout == null || frameLayout.getChildCount() != 0) {
            FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.d39);
            if (frameLayout2 == null || frameLayout2.getChildCount() != 0) {
                FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                if (frameLayout3 == null || frameLayout3.getChildCount() != 0) {
                    return -1;
                }
                ((FrameLayout) viewGroup.findViewById(R.id.d3_)).addView(view, m12159n());
                return 3;
            }
            ((FrameLayout) viewGroup.findViewById(R.id.d39)).addView(view, m12159n());
            return 2;
        }
        ((FrameLayout) viewGroup.findViewById(R.id.d38)).addView(view, m12159n());
        return 1;
    }
}
