package com.p2082ss.ugc.effectplatform.task.p4458b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4449f.C86786f;
import com.p2082ss.ugc.effectplatform.util.C86994k;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4533f.AbstractC88064c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.b.b */
public final class C86895b implements AbstractC88064c<String, String> {

    /* renamed from: a */
    private final String f195916a;

    static {
        Covode.recordClassIndex(102660);
    }

    public C86895b(String str) {
        C89219l.m154719c(str, "");
        this.f195916a = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4519d.p4520a.p4533f.AbstractC88064c
    /* renamed from: a */
    public final /* synthetic */ String mo140606a(String str) {
        String str2 = str;
        C89219l.m154719c(str2, "");
        if (C86994k.m150675b(str2, this.f195916a)) {
            C88045d.m153119g(str2);
            return this.f195916a;
        }
        throw new C86786f("unzip file failed!");
    }
}
