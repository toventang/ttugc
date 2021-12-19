package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.gift.C4343s;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.C6781an;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LockScreenWidget extends LiveRecyclableWidget implements View.OnClickListener, AbstractC33974au {

    /* renamed from: a */
    ImageView f20203a;

    /* renamed from: b */
    boolean f20204b;

    static {
        Covode.recordClassIndex(8960);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bg7;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
    }

    public void onClick(View view) {
        if (this.dataChannel != null) {
            this.dataChannel.mo28319c(C6781an.class);
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28319c(C4343s.class);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        getView().setOnClickListener(this);
        this.f20203a = (ImageView) getView().findViewById(R.id.xw);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        int i;
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C8185m(this));
        if (this.dataChannel != null) {
            this.dataChannel.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C8186n(this));
            if (getView() != null && (getView().getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getView().getLayoutParams();
                boolean a = C6229a.m13521a(getContext());
                int i2 = -1;
                if (a) {
                    i = -1;
                } else {
                    i = 0;
                }
                layoutParams.addRule(9, i);
                if (a) {
                    i2 = 0;
                }
                layoutParams.addRule(11, i2);
                getView().setLayoutParams(layoutParams);
            }
        }
        this.f20203a.setImageResource(R.drawable.c7m);
    }
}
