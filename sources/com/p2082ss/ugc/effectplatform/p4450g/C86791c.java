package com.p2082ss.ugc.effectplatform.p4450g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86697a;
import com.p2082ss.ugc.effectplatform.util.C86981b;
import java.util.Arrays;
import p4519d.p4520a.p4530d.p4531a.C88041a;
import p4519d.p4520a.p4530d.p4531a.EnumC88043b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.g.c */
public final class C86791c {
    static {
        Covode.recordClassIndex(102490);
    }

    /* renamed from: a */
    public static final String m150338a(AbstractC86697a aVar) {
        C89219l.m154719c(aVar, "");
        if (!aVar.available()) {
            return "";
        }
        C88041a aVar2 = new C88041a();
        byte[] bArr = new byte[1024];
        int read = aVar.read(bArr, 0, 1024);
        while (read >= 0) {
            aVar2.mo142609a(bArr, 0, read);
            read = aVar.read(bArr, 0, 1024);
        }
        aVar.close();
        byte[] copyOf = Arrays.copyOf(aVar2.f199947a, aVar2.f199948b);
        C89219l.m154709a((Object) copyOf, "");
        return C86981b.m150635a(copyOf, EnumC88043b.Utf8);
    }
}
