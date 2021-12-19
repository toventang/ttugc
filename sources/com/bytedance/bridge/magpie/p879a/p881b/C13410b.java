package com.bytedance.bridge.magpie.p879a.p881b;

import android.net.Uri;
import com.bytedance.bridge.magpie.C13402a;
import com.bytedance.bridge.magpie.p883b.C13428a;
import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.bridge.magpie.p884c.C13435a;
import com.bytedance.bridge.magpie.p886e.C13453e;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.a.b.b */
public final class C13410b implements AbstractC13411c {

    /* renamed from: a */
    private final C13402a f32711a;

    static {
        Covode.recordClassIndex(15410);
    }

    public C13410b(C13402a aVar) {
        C89219l.m154719c(aVar, "");
        this.f32711a = aVar;
    }

    @Override // com.bytedance.bridge.magpie.p879a.p881b.AbstractC13411c
    /* renamed from: a */
    public final boolean mo21641a(C13428a aVar) {
        C13431b a;
        C89219l.m154719c(aVar, "");
        Uri parse = Uri.parse(aVar.f32734c);
        C89219l.m154709a((Object) parse, "");
        String host = parse.getHost();
        String str = aVar.f32738g;
        String str2 = aVar.f32733b;
        boolean z = false;
        if (host == null) {
            C13435a aVar2 = this.f32711a.f32692a;
            if (!(aVar2 == null || (a = aVar2.mo21659a(str, str2)) == null || a.f32746b != C13431b.EnumC13432a.PUBLIC)) {
                z = true;
            }
            C13453e.m24179c("MagpiePermission", "EmptyHostAuthFilter doAuthFilter result = ".concat(String.valueOf(z)));
            return z;
        }
        C13453e.m24179c("MagpiePermission", "EmptyHostAuthFilter doAuthFilter result = false");
        return false;
    }
}
