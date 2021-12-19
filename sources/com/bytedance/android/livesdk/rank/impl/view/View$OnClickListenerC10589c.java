package com.bytedance.android.livesdk.rank.impl.view;

import android.content.DialogInterface;
import android.view.View;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4336l;
import com.bytedance.android.live.gift.C4344t;
import com.bytedance.android.livesdk.gift.p544b.C8789a;
import com.bytedance.android.livesdk.gift.p544b.C8793b;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.rank.impl.view.c */
public final /* synthetic */ class View$OnClickListenerC10589c implements View.OnClickListener {

    /* renamed from: a */
    private final SelfRankInfoView f25565a;

    /* renamed from: b */
    private final C8789a.EnumC8790a f25566b;

    static {
        Covode.recordClassIndex(12177);
    }

    public View$OnClickListenerC10589c(SelfRankInfoView selfRankInfoView, C8789a.EnumC8790a aVar) {
        this.f25565a = selfRankInfoView;
        this.f25566b = aVar;
    }

    public final void onClick(View view) {
        SelfRankInfoView selfRankInfoView = this.f25565a;
        C8789a.EnumC8790a aVar = this.f25566b;
        if (aVar == C8789a.EnumC8790a.GREY) {
            if (C8793b.m17101a(false, true, (selfRankInfoView.f25510o == null || selfRankInfoView.f25510o.getRoomAuthStatus() == null || !selfRankInfoView.f25510o.getRoomAuthStatus().isEnableGift()) ? false : true) != C8793b.EnumC8794a.TOAST) {
                String a = C1764a.m5928a(selfRankInfoView.getContext().getResources().getString(R.string.gin), new Object[]{LowAgeAnchorLimitSetting.INSTANCE.getValue()});
                DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(selfRankInfoView.getContext());
                aVar2.f22256m = true;
                aVar2.f22245b = a;
                aVar2.mo15244a(R.string.gjt, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC10590d(selfRankInfoView), false).mo15249b(R.string.gju, DialogInterface$OnClickListenerC10591e.f25568a, false).mo15247a().show();
            } else if (selfRankInfoView.f25510o != null && selfRankInfoView.f25510o.getRoomAuthStatus() != null && selfRankInfoView.f25510o.getRoomAuthStatus().getRoomAuthOffReasons() != null && selfRankInfoView.f25510o.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
                C11226ao.m19883a(C3966y.m9669e(), selfRankInfoView.f25510o.getRoomAuthStatus().getRoomAuthOffReasons().getGift(), 0);
                if (selfRankInfoView.f25508m != null) {
                    selfRankInfoView.f25508m.mo28320c(C4336l.class, true);
                }
            }
        } else if (aVar == C8789a.EnumC8790a.SHOW && selfRankInfoView.f25508m != null) {
            C8803g gVar = new C8803g();
            gVar.f21680b = "active_user_rank";
            selfRankInfoView.f25508m.mo28320c(C4344t.class, gVar);
            selfRankInfoView.f25509n.dismiss();
        }
    }
}
