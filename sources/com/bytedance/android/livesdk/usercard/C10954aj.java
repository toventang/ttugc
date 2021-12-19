package com.bytedance.android.livesdk.usercard;

import android.content.Context;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p403q.AbstractC6091a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.usercard.aj */
public class C10954aj implements AbstractC6091a {
    static {
        Covode.recordClassIndex(12569);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p403q.AbstractC6091a
    public void configProfileHelper(C10935a aVar, DataChannel dataChannel, boolean z, AbstractC1204m mVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(mVar, "");
        new UserProfilePresenter(aVar, dataChannel, z, mVar);
    }

    public DialogInterface$OnCancelListenerC0944d getUserCardDialog(Context context, boolean z, long j, long j2, UserProfileEvent userProfileEvent) {
        boolean z2;
        C89219l.m154721d(context, "");
        Room room = new Room();
        room.setId(j2);
        View$OnClickListenerC10973o oVar = new View$OnClickListenerC10973o();
        oVar.f26406D = z;
        oVar.f26420e = j;
        if (C11115u.m19743a().mo17915b().mo13161c() == j) {
            z2 = true;
        } else {
            z2 = false;
        }
        oVar.f26425j = z2;
        oVar.f26422g = room;
        oVar.f26418c = new C10992x();
        oVar.f26419d = new C10985v(context, room, j);
        oVar.f26404B = C11279p.m20001a(context);
        oVar.f26408F = userProfileEvent;
        oVar.mo9929d();
        C89219l.m154716b(oVar, "");
        return oVar;
    }

    @Override // com.bytedance.android.live.p403q.AbstractC6091a
    public DialogInterface$OnCancelListenerC0944d getUserCardDialog(Context context, boolean z, long j, Room room, User user, String str, UserProfileEvent userProfileEvent) {
        boolean z2;
        C89219l.m154721d(context, "");
        View$OnClickListenerC10973o oVar = new View$OnClickListenerC10973o();
        oVar.f26406D = z;
        oVar.f26420e = j;
        if (C11115u.m19743a().mo17915b().mo13161c() == j) {
            z2 = true;
        } else {
            z2 = false;
        }
        oVar.f26425j = z2;
        oVar.f26422g = room;
        oVar.f26423h = user;
        oVar.f26418c = new C10992x();
        oVar.f26419d = new C10985v(context, room, j);
        oVar.f26417b = 1;
        oVar.f26430t = str;
        oVar.f26404B = C11279p.m20001a(context);
        oVar.f26408F = userProfileEvent;
        oVar.mo9929d();
        C89219l.m154716b(oVar, "");
        return oVar;
    }
}
