package com.bytedance.android.livesdk.toolbar.p641a;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4336l;
import com.bytedance.android.live.gift.C4340p;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.gift.p544b.C8793b;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p603q.C10145i;
import com.bytedance.android.livesdk.toolbar.C10892a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.toolbar.a.b */
public final class C10894b implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    private final DataChannel f26182a;

    static {
        Covode.recordClassIndex(12502);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    public C10894b(DataChannel dataChannel) {
        this.f26182a = dataChannel;
    }

    public final void onClick(View view) {
        Room room;
        boolean z;
        DataChannel dataChannel = this.f26182a;
        boolean z2 = false;
        if (dataChannel != null) {
            z = ((Boolean) dataChannel.mo28318b(C9119ed.class)).booleanValue();
            room = (Room) this.f26182a.mo28318b(C9093de.class);
        } else {
            room = null;
            z = false;
        }
        if (!(room == null || room.getRoomAuthStatus() == null || !room.getRoomAuthStatus().isEnableGift())) {
            z2 = true;
        }
        if (C8793b.m17101a(z, true, z2) != C8793b.EnumC8794a.TOAST) {
            DataChannel dataChannel2 = this.f26182a;
            if (dataChannel2 != null) {
                dataChannel2.mo28319c(C4340p.class);
            }
        } else if (room != null && room.getRoomAuthStatus() != null && room.getRoomAuthStatus().getRoomAuthOffReasons() != null && room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
            C11226ao.m19883a(C3966y.m9669e(), room.getRoomAuthStatus().getRoomAuthOffReasons().getGift(), 0);
            DataChannel dataChannel3 = this.f26182a;
            if (dataChannel3 != null) {
                dataChannel3.mo28320c(C4336l.class, true);
            }
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        MethodCollector.m26663i(5784);
        Boolean bool = (Boolean) dataChannel.mo28318b(C9114dz.class);
        if (bool != null && bool.booleanValue()) {
            C10892a.m19505a(view);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.addView(new C10145i(view.getContext(), dataChannel));
        frameLayout.setClipChildren(false);
        view.setAlpha(0.5f);
        MethodCollector.m26664o(5784);
    }
}
