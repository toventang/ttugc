package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveNewFirstRechargeWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: a */
    private View f24392a;

    static {
        Covode.recordClassIndex(11598);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bfy;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.f24392a = findViewById(R.id.feu);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View view = this.f24392a;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC10042a(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.olddialog.widget.LiveNewFirstRechargeWidget$a */
    static final class View$OnClickListenerC10042a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveNewFirstRechargeWidget f24393a;

        static {
            Covode.recordClassIndex(11599);
        }

        View$OnClickListenerC10042a(LiveNewFirstRechargeWidget liveNewFirstRechargeWidget) {
            this.f24393a = liveNewFirstRechargeWidget;
        }

        public final void onClick(View view) {
            C8729d dVar = C8729d.f21542u;
            View view2 = this.f24393a.contentView;
            C89219l.m154716b(view2, "");
            dVar.mo15003a(view2.getContext(), "first_recharge");
        }
    }
}
