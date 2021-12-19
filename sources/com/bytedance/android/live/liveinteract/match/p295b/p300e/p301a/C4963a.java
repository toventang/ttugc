package com.bytedance.android.live.liveinteract.match.p295b.p300e.p301a;

import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.C9615ao;
import com.bytedance.android.livesdk.model.message.p578b.C9636b;
import com.bytedance.android.livesdk.model.message.p578b.C9637c;
import com.bytedance.android.livesdk.model.message.p578b.C9639e;
import com.bytedance.android.livesdk.model.message.p578b.C9640f;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.b.e.a.a */
public final class C4963a implements AbstractC5859b<C9615ao> {
    static {
        Covode.recordClassIndex(5546);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.sdk.message.data.IMessage, com.bytedance.android.live.publicscreen.a.g] */
    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5859b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo10373a(C9615ao aoVar, C5889g gVar) {
        return m11163a(aoVar, gVar);
    }

    /* renamed from: a */
    private static boolean m11163a(C9615ao aoVar, C5889g gVar) {
        C9640f fVar;
        C9640f fVar2;
        C9640f fVar3;
        C9640f fVar4;
        C9640f fVar5;
        String str;
        String str2;
        C89219l.m154721d(aoVar, "");
        C89219l.m154721d(gVar, "");
        if (aoVar.f23365a == 0) {
            try {
                C9637c cVar = aoVar.f23366f;
                if (cVar == null || (fVar4 = cVar.f23480a) == null || fVar4.f23487a == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C9637c cVar2 = aoVar.f23366f;
                if (cVar2 == null || (fVar5 = cVar2.f23481b) == null || fVar5.f23487a == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                HashMap hashMap = new HashMap();
                C5703b.m12466a(hashMap);
                C5703b.m12475b(hashMap);
                hashMap.put("connection_type", C5703b.EnumC5706c.ANCHOR.getType());
                C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
                if (C4384b.C4385a.m10496a().f11969q) {
                    str = "inviter";
                } else {
                    str = "invitee";
                }
                hashMap.put("anchor_type", str);
                hashMap.put("channel_id", String.valueOf(C4384b.C4385a.m10496a().f11957e));
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room != null) {
                    RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                    C89219l.m154716b(roomAuthStatus, "");
                    if (roomAuthStatus.isEnableGift()) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    hashMap.put("is_from_gift_permission", str2);
                }
                C5703b.m12465a("livesdk_pk_guide_show", hashMap);
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() == 2 && aoVar.f23365a == 4) {
            C9639e eVar = aoVar.f23370j;
            if (eVar == null || (fVar2 = eVar.f23483a) == null || fVar2.f23487a == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C9639e eVar2 = aoVar.f23370j;
            if (eVar2 == null || (fVar3 = eVar2.f23484b) == null || fVar3.f23487a == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C9639e eVar3 = aoVar.f23370j;
            if (eVar3 == null || eVar3.f23485c == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C6805b<Boolean> bVar = AbstractC6804a.f17037ck;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            if (!a.booleanValue()) {
                try {
                    throw new IllegalStateException("Check failed.".toString());
                } catch (IllegalArgumentException | IllegalStateException unused2) {
                    return true;
                }
            } else if (!gVar.f14752i || !aoVar.f23370j.f23486d) {
                return false;
            } else {
                return true;
            }
        } else {
            if (aoVar.f23365a == 3) {
                try {
                    C9636b bVar2 = aoVar.f23369i;
                    if (bVar2 != null && (fVar = bVar2.f23479a) != null && fVar.f23487a != null) {
                        return false;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } catch (IllegalArgumentException unused3) {
                }
            }
            return true;
        }
    }
}
