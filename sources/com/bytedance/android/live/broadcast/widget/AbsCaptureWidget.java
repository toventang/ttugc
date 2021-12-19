package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public abstract class AbsCaptureWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    protected boolean f10367a;

    /* renamed from: b */
    protected AbstractC3055a f10368b;

    static {
        Covode.recordClassIndex(4270);
    }

    /* renamed from: b */
    public void mo9062b() {
        this.f10367a = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        if (!this.f10367a) {
            this.f10367a = true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        if (this.f10367a) {
            mo9062b();
        }
    }

    public AbsCaptureWidget(AbstractC3055a aVar) {
        this.f10368b = aVar;
    }
}
