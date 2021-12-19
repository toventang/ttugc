package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.gift.C4343s;
import com.bytedance.android.livesdk.C7249c;
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

public class MessageBlockWidget extends LiveRecyclableWidget implements View.OnClickListener, AbstractC33974au {

    /* renamed from: a */
    ImageView f20205a;

    static {
        Covode.recordClassIndex(8961);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bfp;
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
            this.dataChannel.mo28319c(C7249c.class);
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28319c(C4343s.class);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        getView().setOnClickListener(this);
        this.f20205a = (ImageView) getView().findViewById(R.id.xw);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C8192r(this));
        if (this.dataChannel != null) {
            this.dataChannel.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C8193s(this));
        }
        this.f20205a.setImageResource(2131234733);
    }
}
