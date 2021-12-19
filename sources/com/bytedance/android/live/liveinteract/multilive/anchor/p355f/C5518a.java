package com.bytedance.android.live.liveinteract.multilive.anchor.p355f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.a */
public final class C5518a extends AbstractC5527g {
    static {
        Covode.recordClassIndex(6113);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11259a() {
        return R.layout.bc8;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a
    /* renamed from: b */
    public final int mo11261b() {
        return R.layout.bc1;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: d */
    public final boolean mo11263d() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: c */
    public final EnumC4422k mo11262c() {
        return EnumC4422k.FLOATING_FIX;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.a$a */
    static final class RunnableC5519a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5518a f14102a;

        static {
            Covode.recordClassIndex(6114);
        }

        RunnableC5519a(C5518a aVar) {
            this.f14102a = aVar;
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
            ViewGroup viewGroup = this.f14102a.f14257d;
            if (viewGroup != null && (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d37)) != null && (valueOf = Integer.valueOf(frameLayout.getHeight())) != null) {
                int intValue = valueOf.intValue();
                ViewGroup viewGroup2 = this.f14102a.f14257d;
                if (!(viewGroup2 == null || (findViewById6 = viewGroup2.findViewById(R.id.amw)) == null || (layoutParams3 = findViewById6.getLayoutParams()) == null)) {
                    double d = (double) intValue;
                    Double.isNaN(d);
                    layoutParams3.width = (int) (d * 0.004424778761061947d);
                }
                ViewGroup viewGroup3 = this.f14102a.f14257d;
                if (!(viewGroup3 == null || (findViewById5 = viewGroup3.findViewById(R.id.amw)) == null)) {
                    findViewById5.requestLayout();
                }
                ViewGroup viewGroup4 = this.f14102a.f14257d;
                if (!(viewGroup4 == null || (findViewById4 = viewGroup4.findViewById(R.id.amm)) == null || (layoutParams2 = findViewById4.getLayoutParams()) == null)) {
                    double d2 = (double) intValue;
                    Double.isNaN(d2);
                    layoutParams2.height = (int) (d2 * 0.004424778761061947d);
                }
                ViewGroup viewGroup5 = this.f14102a.f14257d;
                if (!(viewGroup5 == null || (findViewById3 = viewGroup5.findViewById(R.id.amm)) == null)) {
                    findViewById3.requestLayout();
                }
                ViewGroup viewGroup6 = this.f14102a.f14257d;
                if (!(viewGroup6 == null || (findViewById2 = viewGroup6.findViewById(R.id.amn)) == null || (layoutParams = findViewById2.getLayoutParams()) == null)) {
                    double d3 = (double) intValue;
                    Double.isNaN(d3);
                    layoutParams.height = (int) (d3 * 0.004424778761061947d);
                }
                ViewGroup viewGroup7 = this.f14102a.f14257d;
                if (!(viewGroup7 == null || (findViewById = viewGroup7.findViewById(R.id.amn)) == null)) {
                    findViewById.requestLayout();
                }
                this.f14102a.mo11395m();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5518a(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p355f.AbstractC5527g, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final void mo11256a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        super.mo11256a(viewGroup);
        ViewGroup viewGroup2 = this.f14257d;
        if (viewGroup2 != null) {
            viewGroup2.post(new RunnableC5519a(this));
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
        int c = mo11392c(i);
        int i2 = 3;
        if (c == 1) {
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d38);
            C89219l.m154716b(frameLayout, "");
            FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.av0);
            C89219l.m154716b(frameLayout2, "");
            m12025a(frameLayout, frameLayout2, view);
            i2 = 1;
        } else if (c == 2) {
            FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d39);
            C89219l.m154716b(frameLayout3, "");
            FrameLayout frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.av1);
            C89219l.m154716b(frameLayout4, "");
            m12025a(frameLayout3, frameLayout4, view);
            i2 = 2;
        } else if (c != 3) {
            i2 = super.mo11260a(view, i);
        } else {
            FrameLayout frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
            C89219l.m154716b(frameLayout5, "");
            FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.av2);
            C89219l.m154716b(frameLayout6, "");
            m12025a(frameLayout5, frameLayout6, view);
        }
        mo11396o();
        return i2;
    }

    /* renamed from: a */
    private static void m12025a(ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        MethodCollector.m26663i(8165);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, m12159n());
            C89393b.m154949a(viewGroup2);
        }
        MethodCollector.m26664o(8165);
    }
}
