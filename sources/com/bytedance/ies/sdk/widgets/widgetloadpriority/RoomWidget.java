package com.bytedance.ies.sdk.widgets.widgetloadpriority;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.p561j.C9064cc;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.IUnLoadWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public abstract class RoomWidget extends LiveWidget implements IUnLoadWidget, AbstractC33974au {
    static {
        Covode.recordClassIndex(20460);
    }

    public void onGetRoomInfo(Room room) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public RoomWidget() {
        register(Room.class);
    }

    public boolean isVisibilityToUser() {
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            return C9064cc.m17355a(this.dataChannel);
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public <T> void onCustomInfoCallBack(T t) {
        if (t instanceof Room) {
            onGetRoomInfo(t);
        }
        super.onCustomInfoCallBack(t);
    }
}
