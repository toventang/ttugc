package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import okhttp3.C90040c;
import okhttp3.C90208y;
import p4640l.AbstractC89744e;
import p4640l.C89782m;
import p4640l.p4641a.p4642a.C89710a;

/* renamed from: com.snapchat.kit.sdk.core.networking.a */
public class C29025a {

    /* renamed from: a */
    public final C27910f f68573a;

    /* renamed from: b */
    public final C29027c f68574b;

    /* renamed from: c */
    public final C29034i f68575c;

    /* renamed from: d */
    private final C90040c f68576d;

    /* renamed from: e */
    private final C29031g f68577e;

    static {
        Covode.recordClassIndex(35358);
    }

    /* renamed from: a */
    public static <T> T m58019a(String str, Class<T> cls) {
        C27917g gVar = new C27917g();
        gVar.f65567g = true;
        return (T) new C89782m.C89784a().mo144323a(str).mo144325a(new C90208y.C90210a().mo145103d()).mo144324a(C89710a.m155747a(gVar.mo46682b())).mo144326a().mo144318a(cls);
    }

    /* renamed from: a */
    public final <T> T mo50701a(AbstractC29036k kVar, String str, Class<T> cls, AbstractC89744e.AbstractC89745a aVar) {
        C90208y.C90210a a = new C90208y.C90210a().mo145091a(this.f68576d).mo145096a(kVar);
        if (str.startsWith("https://api.snapkit.com")) {
            a.mo145092a(C29040n.m58030a());
        }
        return (T) new C89782m.C89784a().mo144323a(str).mo144325a(a.mo145103d()).mo144324a(aVar).mo144326a().mo144318a(cls);
    }

    C29025a(C90040c cVar, C27910f fVar, C29027c cVar2, C29031g gVar, C29034i iVar) {
        this.f68576d = cVar;
        this.f68573a = fVar;
        this.f68574b = cVar2;
        this.f68577e = gVar;
        this.f68575c = iVar;
    }
}
