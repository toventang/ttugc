package com.bytedance.android.live.liveinteract.multilive.anchor.p355f;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.p261b.C4423l;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.h */
public final class C5532h extends AbstractC5612a {
    static {
        Covode.recordClassIndex(6127);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11259a() {
        return R.layout.bca;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a
    /* renamed from: b */
    public final int mo11261b() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: d */
    public final boolean mo11263d() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: c */
    public final EnumC4422k mo11262c() {
        return EnumC4422k.NORMAL;
    }

    /* renamed from: f */
    private final void m12055f() {
        this.f14261h.mo28320c(C4403aq.class, new C4423l(EnumC4422k.NORMAL, null, false, false, 0, 0, 0, 0, false, 510));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5532h(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final void mo11256a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        super.mo11256a(viewGroup);
        m12055f();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11260a(View view, int i) {
        C89219l.m154721d(view, "");
        m12055f();
        return -1;
    }
}
