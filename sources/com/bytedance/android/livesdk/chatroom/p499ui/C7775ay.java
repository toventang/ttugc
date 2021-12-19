package com.bytedance.android.livesdk.chatroom.p499ui;

import android.util.SparseBooleanArray;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ay */
final /* synthetic */ class C7775ay implements AbstractC88433f {

    /* renamed from: a */
    private final C7770at f19296a;

    static {
        Covode.recordClassIndex(8570);
    }

    C7775ay(C7770at atVar) {
        this.f19296a = atVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7770at atVar = this.f19296a;
        C8454g gVar = (C8454g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f20901a;
        boolean z = gVar.f20903c;
        sparseBooleanArray.get(0);
        boolean z2 = sparseBooleanArray.get(2);
        View findViewById = atVar.f19284H.findViewById(R.id.ek7);
        View findViewById2 = atVar.f19284H.findViewById(R.id.fbx);
        if (findViewById != null && findViewById2 != null) {
            C7573e.m15564a(atVar.getContext(), findViewById, !z2, z);
        }
    }
}
