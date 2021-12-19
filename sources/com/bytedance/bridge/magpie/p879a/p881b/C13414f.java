package com.bytedance.bridge.magpie.p879a.p881b;

import android.net.Uri;
import android.util.LruCache;
import com.bytedance.bridge.magpie.C13402a;
import com.bytedance.bridge.magpie.p879a.C13415c;
import com.bytedance.bridge.magpie.p879a.p880a.C13405b;
import com.bytedance.bridge.magpie.p879a.p880a.C13407c;
import com.bytedance.bridge.magpie.p879a.p882c.C13425f;
import com.bytedance.bridge.magpie.p883b.C13428a;
import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.bridge.magpie.p884c.C13435a;
import com.bytedance.bridge.magpie.p886e.C13453e;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.a.b.f */
public final class C13414f implements AbstractC13411c {

    /* renamed from: a */
    private final C13402a f32713a;

    static {
        Covode.recordClassIndex(15414);
    }

    public C13414f(C13402a aVar) {
        C89219l.m154719c(aVar, "");
        this.f32713a = aVar;
    }

    @Override // com.bytedance.bridge.magpie.p879a.p881b.AbstractC13411c
    /* renamed from: a */
    public final boolean mo21641a(C13428a aVar) {
        C13407c cVar;
        C13431b a;
        C89219l.m154719c(aVar, "");
        String str = aVar.f32734c;
        String str2 = aVar.f32738g;
        String str3 = aVar.f32733b;
        C13405b bVar = C13425f.f32728b.get(str2);
        boolean z = true;
        C13431b.EnumC13432a aVar2 = null;
        if (bVar != null) {
            C89219l.m154719c(str, "");
            Uri parse = Uri.parse(str);
            C89219l.m154709a((Object) parse, "");
            String scheme = parse.getScheme();
            String authority = parse.getAuthority();
            String builder = new Uri.Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
            C89219l.m154709a((Object) builder, "");
            if (authority == null || authority.length() == 0) {
                cVar = new C13407c(C13431b.EnumC13432a.PUBLIC, null, null, 6);
            } else {
                LruCache<String, C13407c> lruCache = bVar.f32704a;
                if (lruCache == null || (cVar = lruCache.get(builder)) == null) {
                    cVar = bVar.mo21627a(builder);
                }
            }
            if (!cVar.f32709c.contains(str3)) {
                if (cVar.f32708b.contains(str3)) {
                    aVar2 = C13431b.EnumC13432a.PRIVATE;
                } else {
                    C13435a aVar3 = this.f32713a.f32692a;
                    if (!(aVar3 == null || (a = aVar3.mo21659a(str2, str3)) == null || cVar.f32707a.compareTo((Enum) a.f32746b) < 0)) {
                        aVar2 = cVar.f32707a;
                    }
                }
            }
        }
        boolean contains = C13415c.f32715b.contains(str3);
        if (aVar2 == null && (!contains || C13431b.EnumC13432a.PUBLIC == null)) {
            z = false;
        }
        C13453e.m24179c("MagpiePermission", "StandardAuthFilter doAuthFilter result = ".concat(String.valueOf(z)));
        return z;
    }
}
