package com.bytedance.helios.sdk.p1097d;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.d.g */
public final class C15402g extends AbstractC15412n {
    static {
        Covode.recordClassIndex(17654);
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final int[] mo25138a() {
        return C15401f.f37602c;
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15412n
    /* renamed from: b */
    public final String mo25146b() {
        return C15401f.f37600a;
    }

    public C15402g() {
        mo25154a(C15401f.f37603d);
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15412n
    /* renamed from: b */
    public final List<Integer> mo25147b(int i) {
        switch (i) {
            case 100401:
                return C89070n.m154516a((Object) 100400);
            case 100403:
                return C89070n.m154522b(100402, 100400);
            case 100501:
                return C89070n.m154516a((Object) 100500);
            case 100503:
                return C89070n.m154516a((Object) 100502);
            default:
                return C89086z.INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final void mo25135a(C15397d dVar, Throwable th) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(th, "");
        C15400e eVar = (C15400e) this.f37577a.get(dVar.f37587d);
        if (eVar.f37596b == 3) {
            switch (dVar.f37587d) {
                case 100404:
                case 100405:
                    mo25155b(dVar);
                    return;
                case 102200:
                    C89219l.m154709a((Object) eVar, "");
                    mo25153a(eVar, dVar, C89070n.m154516a((Object) 100400));
                    return;
                case 102201:
                    C89219l.m154709a((Object) eVar, "");
                    mo25153a(eVar, dVar, C89070n.m154516a((Object) 100401));
                    return;
                case 102202:
                    C89219l.m154709a((Object) eVar, "");
                    mo25153a(eVar, dVar, C89070n.m154522b(100400, 100402));
                    return;
                default:
                    return;
            }
        } else {
            C89219l.m154709a((Object) eVar, "");
            mo25152a(eVar, dVar, th);
        }
    }
}
