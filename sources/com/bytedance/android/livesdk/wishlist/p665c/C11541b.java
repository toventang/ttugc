package com.bytedance.android.livesdk.wishlist.p665c;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.message.p578b.C9644i;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.C11735p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11696c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.wishlist.c.b */
public final class C11541b {
    static {
        Covode.recordClassIndex(13200);
    }

    /* renamed from: a */
    public static final void m20374a() {
        long j;
        boolean z;
        C11735p linkMicInfo;
        C11696c cVar;
        C9644i iVar;
        AbstractC6872f b;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        long j2 = 0;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C11115u a = C11115u.m19743a();
        if (!(a == null || (b = a.mo17915b()) == null)) {
            j2 = b.mo13161c();
        }
        boolean z2 = false;
        if (j == j2) {
            z = true;
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!z) {
            Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (!(room2 == null || (linkMicInfo = room2.getLinkMicInfo()) == null || (cVar = linkMicInfo.f28083e) == null || (iVar = cVar.f27984c) == null || iVar.f23497e <= 0)) {
                z2 = true;
            }
            if (z2) {
                linkedHashMap.put("connection_type", "manual_pk");
            } else if (room2 != null) {
                if (room2.getLinkMicInfo() != null) {
                    linkedHashMap.put("connection_type", "anchor");
                } else if (room2 != null && room2.isWithLinkMic()) {
                    linkedHashMap.put("connection_type", "audience");
                }
            }
        }
        C6501b.C6502a.m13948a("livesdk_wishlist_entrance_show").mo12639a().mo12652a(m20373a(true)).mo12652a((Map<String, String>) linkedHashMap).mo12655b();
    }

    /* renamed from: a */
    public static final void m20375a(int i) {
        C6501b.C6502a.m13948a("livesdk_wishlist_all_finished").mo12639a().mo12645a("support_user", i).mo12655b();
    }

    /* renamed from: a */
    public static final Map<String, String> m20373a(boolean z) {
        long j;
        boolean z2;
        String str;
        String str2;
        AbstractC6872f b;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        long j2 = 0;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C11115u a = C11115u.m19743a();
        if (!(a == null || (b = a.mo17915b()) == null)) {
            j2 = b.mo13161c();
        }
        HashMap hashMap = new HashMap();
        if (j == j2) {
            z2 = true;
            str = "anchor";
        } else {
            z2 = false;
            str = "user";
        }
        hashMap.put("user_type", str);
        hashMap.put("user_id", String.valueOf(j2));
        String b2 = m20376b(z);
        AbstractC4409b bVar = (AbstractC4409b) C6193a.m13435a(AbstractC4409b.class);
        if (bVar == null || (str2 = bVar.getCurrentInviteeList()) == null) {
            str2 = "";
        }
        hashMap.put("connection_type", b2);
        if (z2 && (!C89219l.m154714a((Object) b2, (Object) "normal")) && !TextUtils.isEmpty(str2)) {
            hashMap.put("invitee_list", str2);
        }
        return hashMap;
    }

    /* renamed from: b */
    private static final String m20376b(boolean z) {
        long j;
        long j2;
        AbstractC6872f b;
        if (z) {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                j = room.getOwnerUserId();
            } else {
                j = 0;
            }
            C11115u a = C11115u.m19743a();
            if (a == null || (b = a.mo17915b()) == null) {
                j2 = 0;
            } else {
                j2 = b.mo13161c();
            }
            if (!(j == j2 || room == null || room.getLinkMicInfo() == null)) {
                C11735p linkMicInfo = room.getLinkMicInfo();
                C89219l.m154716b(linkMicInfo, "");
                if (linkMicInfo.f28079a <= 0 || linkMicInfo.f28080b <= 0) {
                    if (linkMicInfo.f28082d == null || linkMicInfo.f28082d.size() <= 0) {
                        return "normal";
                    }
                    return "audience";
                } else if (linkMicInfo.f28083e != null) {
                    return "manual_pk";
                } else {
                    return "anchor";
                }
            }
            return "normal";
        }
        AbstractC4409b bVar = (AbstractC4409b) C6193a.m13435a(AbstractC4409b.class);
        if (bVar != null) {
            if (bVar.isBattling()) {
                return "manual_pk";
            }
            if (bVar.getLinkedGuestNum() > 0) {
                return "audience";
            }
            if (bVar.isInCoHost()) {
                return "anchor";
            }
        }
        return "normal";
    }
}
