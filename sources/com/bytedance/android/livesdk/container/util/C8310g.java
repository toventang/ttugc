package com.bytedance.android.livesdk.container.util;

import android.net.Uri;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.C28022o;
import java.util.Set;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.util.g */
public final class C8310g {

    /* renamed from: a */
    public static final C8310g f20583a = new C8310g();

    private C8310g() {
    }

    static {
        Covode.recordClassIndex(9147);
    }

    /* renamed from: a */
    public static final C28022o m16461a(Uri uri) {
        Long l;
        User owner;
        FollowInfo followInfo;
        User owner2;
        String valueOf;
        String str;
        C89219l.m154721d(uri, "");
        C28022o oVar = new C28022o();
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                oVar.mo46801a(t, uri.getQueryParameter(t));
            }
            String str2 = "0";
            if (!oVar.mo46802b("room_id")) {
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room == null || (str = String.valueOf(room.getId())) == null) {
                    str = str2;
                }
                oVar.mo46801a("room_id", str);
            }
            if (!oVar.mo46802b("user_id")) {
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                oVar.mo46801a("user_id", String.valueOf(b.mo13161c()));
            }
            if (!oVar.mo46802b("anchor_id")) {
                Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (!(room2 == null || (owner2 = room2.getOwner()) == null || (valueOf = String.valueOf(owner2.getId())) == null)) {
                    str2 = valueOf;
                }
                oVar.mo46801a("anchor_id", str2);
            }
            if (!oVar.mo46802b("follow_status")) {
                Room room3 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room3 == null || (owner = room3.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
                    l = null;
                } else {
                    l = Long.valueOf(followInfo.getFollowStatus());
                }
                oVar.mo46800a("follow_status", l);
            }
            C11870f fVar = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar, "");
            EnterRoomLinkSession a = fVar.mo19010a();
            C89219l.m154716b(a, "");
            EnterRoomConfig.RoomsData roomsData = a.f28391b.f28233c;
            if (!oVar.mo46802b("enter_from_merge")) {
                oVar.mo46801a("enter_from_merge", roomsData.f28293J);
            }
            if (!oVar.mo46802b("enter_method")) {
                oVar.mo46801a("enter_method", roomsData.f28295L);
            }
            if (!oVar.mo46802b("action_type")) {
                oVar.mo46801a("action_type", roomsData.f28296M);
            }
            C89379q.m157068constructorimpl(uri);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        return oVar;
    }
}
