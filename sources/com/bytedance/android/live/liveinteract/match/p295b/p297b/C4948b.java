package com.bytedance.android.live.liveinteract.match.p295b.p297b;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4956g;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4959j;
import com.bytedance.android.live.liveinteract.match.p304c.C5009a;
import com.bytedance.android.livesdk.model.message.p578b.C9631a;
import com.bytedance.android.livesdk.model.message.p578b.C9642h;
import com.bytedance.android.livesdk.model.message.p578b.C9644i;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11695b;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11697d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.b.b.b */
public final class C4948b {

    /* renamed from: a */
    public C9644i f12912a;

    /* renamed from: b */
    public boolean f12913b;

    /* renamed from: c */
    public boolean f12914c;

    /* renamed from: d */
    public C9642h f12915d;

    /* renamed from: e */
    public C9642h f12916e;

    /* renamed from: f */
    public C11695b f12917f;

    /* renamed from: g */
    public C11695b f12918g;

    /* renamed from: h */
    public long f12919h;

    /* renamed from: i */
    public long f12920i;

    /* renamed from: j */
    public boolean f12921j;

    /* renamed from: k */
    public boolean f12922k;

    /* renamed from: l */
    public boolean f12923l;

    /* renamed from: m */
    public boolean f12924m;

    /* renamed from: n */
    public long f12925n;

    /* renamed from: o */
    public long f12926o;

    /* renamed from: p */
    public long f12927p;

    /* renamed from: q */
    public long f12928q;

    /* renamed from: r */
    public C9631a f12929r;

    /* renamed from: s */
    public boolean f12930s;

    /* renamed from: t */
    public Map<Long, Long> f12931t = new HashMap();

    /* renamed from: u */
    public C11697d f12932u;

    /* renamed from: v */
    public C11697d f12933v;

    /* renamed from: w */
    public final String f12934w;

    /* renamed from: x */
    private long f12935x;

    static {
        Covode.recordClassIndex(5531);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C4948b) && C89219l.m154714a(this.f12934w, ((C4948b) obj).f12934w);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f12934w;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BattleDataModel(stateKey=" + this.f12934w + ")";
    }

    /* renamed from: b */
    public final long mo10677b() {
        C9644i iVar = this.f12912a;
        if (iVar != null) {
            return iVar.f23494b;
        }
        return this.f12935x;
    }

    /* renamed from: c */
    public final long mo10679c() {
        C9644i iVar = this.f12912a;
        if (iVar != null) {
            return iVar.f23493a;
        }
        return C4384b.C4385a.m10496a().f11957e;
    }

    /* renamed from: d */
    public final boolean mo10680d() {
        if (mo10677b() > 0 || mo10672a().compareTo((Enum) EnumC4949c.NORMAL) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final EnumC4949c mo10672a() {
        EnumC4949c cVar;
        EnumC4949c cVar2;
        C4384b a = C4384b.C4385a.m10496a();
        if (C89219l.m154714a((Object) "data_battle_state", (Object) this.f12934w)) {
            DataChannel dataChannel = a.f11951an;
            if (dataChannel == null || (cVar2 = (EnumC4949c) dataChannel.mo28318b(C4959j.class)) == null) {
                return EnumC4949c.NORMAL;
            }
            return cVar2;
        }
        DataChannel dataChannel2 = a.f11951an;
        if (dataChannel2 == null || (cVar = (EnumC4949c) dataChannel2.mo28318b(C4956g.class)) == null) {
            return EnumC4949c.NORMAL;
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo10673a(long j) {
        C4384b.C4385a.m10496a().f11946ai = j;
        this.f12935x = j;
    }

    public C4948b(String str) {
        C89219l.m154721d(str, "");
        this.f12934w = str;
    }

    /* renamed from: a */
    public final boolean mo10675a(EnumC4949c cVar) {
        C89219l.m154721d(cVar, "");
        if (mo10672a().compareTo((Enum) cVar) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo10678b(boolean z, String str) {
        C89219l.m154721d(str, "");
        C3854a.m9453a(4, "BattleDataModelReset", "key = " + this.f12934w + "  source = " + str);
        mo10674a(z, str);
        mo10676a(EnumC4949c.NORMAL, true);
    }

    /* renamed from: a */
    public final void mo10674a(boolean z, String str) {
        long j;
        boolean z2;
        C89219l.m154721d(str, "");
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            long ownerUserId = room.getOwnerUserId();
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            if (b != null) {
                j = b.mo13161c();
            } else {
                j = 0;
            }
            if (ownerUserId == j) {
                z2 = true;
            } else {
                z2 = false;
            }
            C5009a aVar = C5009a.f13036g;
            C89219l.m154721d(str, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "source", str);
            if (z2) {
                C5009a.m11205a(aVar, "data_reset", jSONObject, z, 8);
            } else {
                aVar.mo10708a("data_reset", jSONObject, 0);
            }
        }
        this.f12935x = 0;
        this.f12913b = false;
        this.f12926o = 0;
        this.f12927p = 0;
        this.f12928q = 0;
        this.f12919h = 0;
        this.f12920i = 0;
        this.f12925n = 0;
        this.f12914c = false;
        this.f12912a = null;
        this.f12915d = null;
        this.f12916e = null;
        this.f12921j = false;
        this.f12922k = false;
        this.f12923l = false;
        this.f12924m = false;
        this.f12932u = null;
        this.f12933v = null;
        this.f12929r = null;
        this.f12930s = false;
        this.f12917f = null;
        this.f12918g = null;
    }

    /* renamed from: a */
    public final boolean mo10676a(EnumC4949c cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        EnumC4949c a = mo10672a();
        C3854a.m9453a(4, "BattleDataTag", "updateState, old State = " + a + "; targetState = " + cVar);
        if (!z && cVar.compareTo((Enum) a) <= 0) {
            return false;
        }
        C3854a.m9453a(4, "BattleDataTag", "updateState, success targetState = ".concat(String.valueOf(cVar)));
        C4384b a2 = C4384b.C4385a.m10496a();
        if (C89219l.m154714a((Object) "data_battle_state", (Object) this.f12934w)) {
            DataChannel dataChannel = a2.f11951an;
            if (dataChannel == null) {
                return true;
            }
            dataChannel.mo28315b(C4959j.class, cVar);
            return true;
        }
        DataChannel dataChannel2 = a2.f11951an;
        if (dataChannel2 == null) {
            return true;
        }
        dataChannel2.mo28315b(C4956g.class, cVar);
        return true;
    }
}
