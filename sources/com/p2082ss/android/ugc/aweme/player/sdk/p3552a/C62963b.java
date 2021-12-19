package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63055a;
import com.p2082ss.ttvideoengine.p4417j.C86514c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.b */
public final class C62963b {

    /* renamed from: a */
    public static final C62963b f142910a = new C62963b();

    private C62963b() {
    }

    static {
        Covode.recordClassIndex(73800);
    }

    /* renamed from: a */
    public static List<C86514c> m113416a(List<C63055a> list) {
        C89219l.m154719c(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            C86514c.C86515a aVar = new C86514c.C86515a();
            aVar.f194726b = t.f143225b;
            aVar.f194725a = t.f143224a;
            aVar.f194728d = t.f143227d;
            Integer num = t.f143226c;
            if (num != null) {
                aVar.f194729e = num.intValue();
            }
            Float f = t.f143228e;
            if (f != null) {
                aVar.f194730f = f.floatValue();
            }
            Float f2 = t.f143229f;
            if (f2 != null) {
                aVar.f194731g = f2.floatValue();
            }
            String str = t.f143230g;
            if (str != null) {
                aVar.f194732h = str;
            }
            C86514c cVar = new C86514c();
            cVar.f194717a = aVar.f194725a;
            cVar.f194718b = aVar.f194726b;
            cVar.f194719c = aVar.f194727c;
            cVar.f194720d = aVar.f194728d;
            cVar.f194721e = aVar.f194729e;
            cVar.f194722f = aVar.f194730f;
            cVar.f194723g = aVar.f194731g;
            cVar.f194724h = aVar.f194732h;
            C89219l.m154709a((Object) cVar, "");
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
