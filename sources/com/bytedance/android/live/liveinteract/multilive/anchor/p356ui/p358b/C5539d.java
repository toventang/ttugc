package com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p357a.C5534b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.d */
public final class C5539d extends AbstractC5535a<C5534b, C5537c> {

    /* renamed from: a */
    private final AbstractC5542g f14122a;

    static {
        Covode.recordClassIndex(6134);
    }

    public C5539d(AbstractC5542g gVar) {
        C89219l.m154721d(gVar, "");
        this.f14122a = gVar;
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bc3, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C5537c(a, this.f14122a);
    }
}
