package com.bytedance.ies.p1208im.core.p1221b;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b;
import com.bytedance.ies.p1208im.core.api.p1210a.C17418c;
import com.bytedance.ies.p1208im.core.api.p1210a.EnumC17416a;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.ies.p1208im.core.api.p1217g.AbstractC17462b;
import com.bytedance.ies.p1208im.core.api.p1217g.C17464d;
import com.bytedance.ies.p1208im.core.api.p1217g.EnumC17463c;
import com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a;
import com.bytedance.ies.p1208im.core.api.p1220j.C17470b;
import com.bytedance.ies.p1208im.core.p1224e.C17514e;
import com.bytedance.ies.p1208im.core.p1225f.C17560d;
import com.bytedance.keva.Keva;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.b.c */
public final class C17486c implements AbstractC17417b, AbstractC17462b, AbstractC17469a {

    /* renamed from: a */
    public static volatile boolean f41858a;

    /* renamed from: b */
    public static final C17486c f41859b = new C17486c();

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27899a(String str) {
    }

    private C17486c() {
    }

    static {
        Covode.recordClassIndex(19975);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1217g.AbstractC17462b
    /* renamed from: a */
    public final void mo27778a(C17464d dVar) {
        C89219l.m154721d(dVar, "");
        C17415a.m32255b().mo27836b("PlatformManager", "onNetworkStateChanged: ".concat(String.valueOf(dVar)));
        if (dVar.f41821a == EnumC17463c.CONNECTED) {
            C17514e.m32489a(C17514e.EnumC17515a.NET);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27898a(C17470b bVar) {
        C89219l.m154721d(bVar, "");
        C17415a.m32255b().mo27836b("PlatformManager", "onStateChanged: " + bVar.f41827a);
        if (bVar.f41827a == EnumC13655c.CONNECTED) {
            C17514e.m32489a(C17514e.EnumC17515a.WS);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1220j.AbstractC17469a
    /* renamed from: a */
    public final void mo27897a(WsChannelMsg wsChannelMsg, C19608bd bdVar) {
        C89219l.m154721d(wsChannelMsg, "");
        C89219l.m154721d(wsChannelMsg, "");
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b
    /* renamed from: a */
    public final void mo27788a(EnumC17416a aVar, C17418c cVar) {
        String str;
        String str2 = "";
        C89219l.m154721d(aVar, str2);
        String string = Keva.getRepo("ies_im_core").getString("last_login_uid", str2);
        C89219l.m154716b(string, str2);
        if (cVar != null) {
            str = cVar.f41775a;
        } else {
            str = null;
        }
        Keva repo = Keva.getRepo("ies_im_core");
        if (str != null) {
            str2 = str;
        }
        repo.storeString("last_login_uid", str2);
        EnumC17416a aVar2 = EnumC17416a.UNKNOWN;
        if (!C17415a.m32258e().mo27822a() || str == null || str.length() == 0) {
            aVar2 = EnumC17416a.LOGOUT;
        } else if (string.length() == 0 && C17453a.m32409b(str)) {
            aVar2 = EnumC17416a.LOGIN;
        } else if (string.length() > 0 && C17453a.m32409b(str) && (!C89219l.m154714a((Object) string, (Object) str))) {
            aVar2 = EnumC17416a.SWITCH;
        }
        C17415a.m32255b().mo27836b("PlatformManager", "onAccountChange: " + aVar + ", " + aVar2 + ", " + string + ", " + str);
        if (aVar2 != EnumC17416a.UNKNOWN) {
            C17560d.f42010b.mo27788a(aVar2, cVar);
            HandlerC17488e.f41863c.mo27788a(aVar2, cVar);
        }
    }
}
