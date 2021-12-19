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

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.c */
public final class C5521c extends AbstractC5527g {
    static {
        Covode.recordClassIndex(6116);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11259a() {
        return R.layout.bc_;
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
        return EnumC4422k.GRID_FIX;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5521c(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
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
            m12036a(frameLayout, frameLayout2, view);
            i2 = 1;
        } else if (c == 2) {
            FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d39);
            C89219l.m154716b(frameLayout3, "");
            FrameLayout frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.av1);
            C89219l.m154716b(frameLayout4, "");
            m12036a(frameLayout3, frameLayout4, view);
            i2 = 2;
        } else if (c != 3) {
            i2 = super.mo11260a(view, i);
        } else {
            FrameLayout frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
            C89219l.m154716b(frameLayout5, "");
            FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.av2);
            C89219l.m154716b(frameLayout6, "");
            m12036a(frameLayout5, frameLayout6, view);
        }
        mo11396o();
        return i2;
    }

    /* renamed from: a */
    private static void m12036a(ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        MethodCollector.m26663i(6499);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, m12159n());
            C89393b.m154949a(viewGroup2);
        }
        MethodCollector.m26664o(6499);
    }
}
