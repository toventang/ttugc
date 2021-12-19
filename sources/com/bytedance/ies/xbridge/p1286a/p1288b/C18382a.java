package com.bytedance.ies.xbridge.p1286a.p1288b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18372a;
import com.bytedance.ies.xbridge.p1286a.p1289c.C18389a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.a.b.a */
public final class C18382a extends AbstractC18372a {
    static {
        Covode.recordClassIndex(21054);
    }

    @Override // com.bytedance.ies.xbridge.p1286a.p1287a.AbstractC18372a
    /* renamed from: a */
    public final void mo29414a(C18752c cVar, AbstractC18372a.AbstractC18373a aVar, EnumC18483e eVar) {
        IHostUserDepend iHostUserDepend;
        boolean z;
        C18465b bVar;
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if ((bVar2 == null || (iHostUserDepend = bVar2.f44105h) == null) && ((bVar = C18465b.f44096l) == null || (iHostUserDepend = bVar.f44105h) == null)) {
            aVar.mo29418a("hostUserDepend is null");
            return;
        }
        C18389a aVar2 = new C18389a();
        C18389a.C18391b bVar3 = new C18389a.C18391b();
        String userId = iHostUserDepend.getUserId();
        if (userId == null) {
            userId = "";
        }
        bVar3.f43976a = userId;
        String secUid = iHostUserDepend.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        bVar3.f43977b = secUid;
        String uniqueID = iHostUserDepend.getUniqueID();
        if (uniqueID == null) {
            uniqueID = "";
        }
        bVar3.f43978c = uniqueID;
        String nickname = iHostUserDepend.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        bVar3.f43979d = nickname;
        String avatarURL = iHostUserDepend.getAvatarURL();
        if (avatarURL == null) {
            avatarURL = "";
        }
        bVar3.f43980e = avatarURL;
        String boundPhone = iHostUserDepend.getBoundPhone();
        if (boundPhone == null) {
            boundPhone = "";
        }
        if (boundPhone.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        bVar3.f43981f = Boolean.valueOf(z);
        aVar2.f43974a = bVar3;
        aVar2.f43975b = Boolean.valueOf(iHostUserDepend.hasLogin());
        aVar.mo29417a(aVar2, "");
    }
}
