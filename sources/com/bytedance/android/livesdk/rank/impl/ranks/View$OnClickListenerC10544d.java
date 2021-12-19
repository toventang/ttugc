package com.bytedance.android.livesdk.rank.impl.ranks;

import android.view.View;
import com.bytedance.android.livesdk.model.message.C9682bo;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.ranks.C10473a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.d */
final /* synthetic */ class View$OnClickListenerC10544d implements View.OnClickListener {

    /* renamed from: a */
    private final RankEntranceWidget f25353a;

    static {
        Covode.recordClassIndex(12119);
    }

    View$OnClickListenerC10544d(RankEntranceWidget rankEntranceWidget) {
        this.f25353a = rankEntranceWidget;
    }

    public final void onClick(View view) {
        C10546f fVar = this.f25353a.f25210b;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (C9682bo boVar : fVar.f25355a) {
            arrayList.add(Integer.valueOf(boVar.f23562e));
        }
        ((C10473a.AbstractC10474a) fVar.f38654y).mo17310a(arrayList);
        C10497b b = ((C10473a.AbstractC10474a) fVar.f38654y).mo17313b();
        if (b != null) {
            String rankName = EnumC10345i.HOURLY_RANK.getRankName();
            if (b.f25269a == EnumC10345i.WEEKLY_RANK.getType()) {
                rankName = EnumC10345i.WEEKLY_RANK.getRankName();
            }
            C6501b.C6502a.m13948a("livesdk_hourly_rank_entrance_click").mo12643a(fVar.f18624w).mo12651a("user_type", fVar.f25357c ? "anchor" : "user").mo12651a("rank_type", rankName).mo12655b();
        }
    }
}
