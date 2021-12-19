package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Color;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.p229d.AbstractC4051b;
import com.bytedance.android.live.p379n.C5766ab;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.p561j.C9020an;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9124f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class FullVideoButtonWidget extends RoomWidget implements AbstractC33974au {

    /* renamed from: a */
    long f19912a;

    /* renamed from: b */
    boolean f19913b;

    /* renamed from: c */
    boolean f19914c;

    static {
        Covode.recordClassIndex(8796);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.baw;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.widget.Widget
    public boolean shouldAttach() {
        if (this.dataChannel == null) {
            return false;
        }
        Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
        if (LiveMtMockLandscapeSetting.INSTANCE.getValue()) {
            return true;
        }
        if (room == null || room.isStar() || ((!room.isThirdParty && !room.isScreenshot) || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.isEnableLandscape())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            getView().setBackgroundColor(Color.parseColor("#2B2B2B"));
        }
        getView().findViewById(R.id.blc).setBackgroundResource(2131234680);
        getView().findViewById(R.id.blc).setVisibility(0);
        this.f19912a = ((Long) this.dataChannel.mo28318b(C9096dh.class)).longValue();
        this.dataChannel.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C8088bk(this)).mo28313b((AbstractC1204m) this, C5766ab.class, (AbstractC89172b) new C8089bl(this)).mo28313b((AbstractC1204m) this, C9020an.class, (AbstractC89172b) new C8090bm(this)).mo28309a((AbstractC1204m) this, C9124f.class, (AbstractC89172b) new C8091bn(this));
        getView().findViewById(R.id.blc).setOnClickListener(new View$OnClickListenerC8092bo(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        attach();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public void onVisibilityToUser(boolean z) {
        super.onVisibilityToUser(z);
        if (z) {
            String valueOf = String.valueOf(this.f19912a);
            AbstractC4051b bVar = (AbstractC4051b) C6193a.m13435a(AbstractC4051b.class);
            if (bVar != null) {
                bVar.reportAudienceRotateBtnShow(String.valueOf(valueOf));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14289a(Boolean bool) {
        int i;
        if (isViewValid() && bool != null) {
            View findViewById = getView().findViewById(R.id.blc);
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }
}
