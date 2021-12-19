package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.gift.C4343s;
import com.bytedance.android.live.p229d.AbstractC4051b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.C6884au;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9128j;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class OrientationChangeWidget extends LiveRecyclableWidget implements View.OnClickListener, AbstractC33974au {
    static {
        Covode.recordClassIndex(8981);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bfr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        getView().setOnClickListener(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        Object b;
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C8195u(this));
        if (this.dataChannel != null) {
            this.dataChannel.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C8196v(this));
        }
        ((ImageView) getView().findViewById(R.id.bky)).setImageResource(2131234656);
        if (this.dataChannel != null && (b = this.dataChannel.mo28318b(C9096dh.class)) != null) {
            String valueOf = String.valueOf(b);
            AbstractC4051b bVar = (AbstractC4051b) C6193a.m13435a(AbstractC4051b.class);
            if (bVar != null) {
                bVar.reportAudienceRotateBtnShow(valueOf);
            }
        }
    }

    public void onClick(View view) {
        AbstractC4051b bVar;
        if (this.dataChannel != null) {
            this.dataChannel.mo28319c(C6884au.class);
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28319c(C4343s.class);
        }
        C6501b.C6502a.m13948a("livesdk_screen_rotate").mo12643a(this.dataChannel).mo12651a(StringSet.type, "landscape_to_portrait").mo12651a("room_orientation", "landscape").mo12654b("live").mo12656c("click").mo12658d("live_landscape").mo12655b();
        if (this.dataChannel != null) {
            Object b = this.dataChannel.mo28318b(C9096dh.class);
            Long l = (Long) this.dataChannel.mo28318b(C9128j.class);
            if (b != null && l != null && (bVar = (AbstractC4051b) C6193a.m13435a(AbstractC4051b.class)) != null) {
                bVar.reportAudienceRotateBtnClick(String.valueOf(b), l.longValue(), "0");
                this.dataChannel.mo28315b(C9128j.class, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
