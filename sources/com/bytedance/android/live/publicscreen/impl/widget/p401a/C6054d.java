package com.bytedance.android.live.publicscreen.impl.widget.p401a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.publicscreen.impl.model.C6030p;
import com.bytedance.android.live.publicscreen.impl.widget.p402b.C6070f;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p387a.AbstractC5858a;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.a.d */
public final class C6054d extends AbstractC5858a<C6030p, C6070f> {
    static {
        Covode.recordClassIndex(6671);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        Boolean bool;
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        C5889g gVar = this.f14720a;
        if (gVar == null) {
            C89219l.m154710a("publicScreenContext");
        }
        DataChannel dataChannel = gVar.f14755l;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9076co.class)) == null || bool.booleanValue()) {
            i = R.layout.b9n;
        } else {
            i = R.layout.b9o;
        }
        View a = C1764a.m5927a(layoutInflater, i, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C6070f(a);
    }
}
