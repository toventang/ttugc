package com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.f */
public final class C5541f extends AbstractC5535a<C7666e, C5545j> {

    /* renamed from: a */
    public final DataChannel f14123a;

    /* renamed from: b */
    public final AbstractC5543h f14124b;

    static {
        Covode.recordClassIndex(6136);
    }

    public C5541f(DataChannel dataChannel, AbstractC5543h hVar) {
        this.f14123a = dataChannel;
        this.f14124b = hVar;
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bc5, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C5545j(a, this.f14123a, this.f14124b);
    }
}
