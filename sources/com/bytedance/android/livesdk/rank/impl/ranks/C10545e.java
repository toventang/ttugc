package com.bytedance.android.livesdk.rank.impl.ranks;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.e */
final /* synthetic */ class C10545e implements AbstractC88433f {

    /* renamed from: a */
    private final RankEntranceWidget f25354a;

    static {
        Covode.recordClassIndex(12120);
    }

    C10545e(RankEntranceWidget rankEntranceWidget) {
        this.f25354a = rankEntranceWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        RankEntranceWidget rankEntranceWidget = this.f25354a;
        C8454g gVar = (C8454g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f20901a;
        boolean z = false;
        boolean z2 = sparseBooleanArray.get(0);
        boolean z3 = sparseBooleanArray.get(2);
        boolean z4 = gVar.f20903c;
        Context context = rankEntranceWidget.context;
        View view = rankEntranceWidget.getView();
        if (!z2 && !z3) {
            z = true;
        }
        C7573e.m15564a(context, view, z, z4);
    }
}
