package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.usercard.ai */
public final class C10953ai {
    static {
        Covode.recordClassIndex(12568);
    }

    /* renamed from: a */
    public static final EnumC10960d m19573a(User user, boolean z) {
        C89219l.m154721d(user, "");
        if (!m19574b(user, z)) {
            return EnumC10960d.GONE;
        }
        AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
        C89219l.m154716b(a, "");
        if (((AbstractC4409b) a).getSocialInvitingUserId().contains(Long.valueOf(user.getId()))) {
            return EnumC10960d.GRAYED;
        }
        AbstractC2953a a2 = C6193a.m13435a(AbstractC4409b.class);
        C89219l.m154716b(a2, "");
        if (((AbstractC4409b) a2).getSocialLocalInviteUIDs().contains(Long.valueOf(user.getId()))) {
            return EnumC10960d.GRAYED;
        }
        return EnumC10960d.ACTIVE;
    }

    /* renamed from: b */
    private static final boolean m19574b(User user, boolean z) {
        AbstractC2994b bVar;
        Long l;
        Long l2;
        User owner;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        Long l3 = null;
        if (b != null) {
            bVar = b.mo13147a();
        } else {
            bVar = null;
        }
        if (room != null) {
            try {
                l = Long.valueOf(room.getOwnerUserId());
            } catch (IllegalStateException unused) {
                return false;
            }
        } else {
            l = null;
        }
        if (l == null) {
            throw new IllegalStateException("Required value was null.".toString());
        } else if (bVar == null || Long.valueOf(bVar.getId()) == null) {
            throw new IllegalStateException("Required value was null.".toString());
        } else if (!z) {
            return false;
        } else {
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            if (bVar != null) {
                l3 = Long.valueOf(bVar.getId());
            }
            if (!C89219l.m154714a(l2, l3) || user.getSecret() == 1 || room == null || (owner = room.getOwner()) == null || owner.getSecret() == 1) {
                return false;
            }
            AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
            C89219l.m154716b(a, "");
            if (((AbstractC4409b) a).getSocialOnlineUserIds().size() >= 4) {
                return false;
            }
            AbstractC2953a a2 = C6193a.m13435a(AbstractC4409b.class);
            C89219l.m154716b(a2, "");
            if (((AbstractC4409b) a2).getSocialOnlineAndWaitingUserId().contains(Long.valueOf(user.getId()))) {
                return false;
            }
            return true;
        }
    }
}
