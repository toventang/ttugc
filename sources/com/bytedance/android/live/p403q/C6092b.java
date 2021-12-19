package com.bytedance.android.live.p403q;

import android.content.Context;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.q.b */
public class C6092b implements AbstractC6091a {
    static {
        Covode.recordClassIndex(6709);
    }

    @Override // com.bytedance.android.live.p403q.AbstractC6091a
    public void configProfileHelper(C10935a aVar, DataChannel dataChannel, boolean z, AbstractC1204m mVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(mVar, "");
    }

    public DialogInterface$OnCancelListenerC0944d getUserCardDialog(Context context, boolean z, long j, long j2, UserProfileEvent userProfileEvent) {
        C89219l.m154721d(context, "");
        return null;
    }

    @Override // com.bytedance.android.live.p403q.AbstractC6091a
    public DialogInterface$OnCancelListenerC0944d getUserCardDialog(Context context, boolean z, long j, Room room, User user, String str, UserProfileEvent userProfileEvent) {
        C89219l.m154721d(context, "");
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }
}
