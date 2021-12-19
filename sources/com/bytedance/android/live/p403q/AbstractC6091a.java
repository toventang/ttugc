package com.bytedance.android.live.p403q;

import android.content.Context;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.live.q.a */
public interface AbstractC6091a extends AbstractC2953a {
    static {
        Covode.recordClassIndex(6708);
    }

    void configProfileHelper(C10935a aVar, DataChannel dataChannel, boolean z, AbstractC1204m mVar);

    DialogInterface$OnCancelListenerC0944d getUserCardDialog(Context context, boolean z, long j, Room room, User user, String str, UserProfileEvent userProfileEvent);
}
