package com.bytedance.android.livesdk.toolbar.p641a;

import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4336l;
import com.bytedance.android.live.gift.C4340p;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.gift.p544b.C8793b;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.toolbar.a.c */
public final class C10895c implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    private DataChannel f26183a;

    static {
        Covode.recordClassIndex(12503);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    public C10895c(DataChannel dataChannel) {
        this.f26183a = dataChannel;
    }

    public final void onClick(View view) {
        Room room;
        boolean z;
        DataChannel dataChannel = this.f26183a;
        boolean z2 = false;
        if (dataChannel != null) {
            z = ((Boolean) dataChannel.mo28318b(C9119ed.class)).booleanValue();
            room = (Room) this.f26183a.mo28318b(C9093de.class);
        } else {
            room = null;
            z = false;
        }
        if (!(room == null || room.getRoomAuthStatus() == null || !room.getRoomAuthStatus().isEnableGift())) {
            z2 = true;
        }
        if (C8793b.m17101a(z, true, z2) != C8793b.EnumC8794a.TOAST) {
            DataChannel dataChannel2 = this.f26183a;
            if (dataChannel2 != null) {
                dataChannel2.mo28319c(C4340p.class);
            }
        } else if (room != null && room.getRoomAuthStatus() != null && room.getRoomAuthStatus().getRoomAuthOffReasons() != null && room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
            C11226ao.m19883a(C3966y.m9669e(), room.getRoomAuthStatus().getRoomAuthOffReasons().getGift(), 0);
            DataChannel dataChannel3 = this.f26183a;
            if (dataChannel3 != null) {
                dataChannel3.mo28320c(C4336l.class, true);
            }
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        View findViewById = view.findViewById(R.id.ekk);
        if (findViewById != null) {
            findViewById.setAlpha(0.5f);
        }
        View findViewById2 = view.findViewById(R.id.ekj);
        if (findViewById2 != null) {
            findViewById2.setAlpha(0.3f);
        }
    }
}
