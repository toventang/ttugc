package com.p2082ss.android.ugc.aweme.common.p2630b;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.b.a */
public final class C39086a<T> implements AbstractC39087b<String, T> {
    static {
        Covode.recordClassIndex(46702);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.reflect.Type] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2630b.AbstractC39087b
    /* renamed from: a */
    public final /* synthetic */ Object mo67837a(String str, Type type) {
        String str2 = str;
        C89219l.m154721d(str2, "");
        C89219l.m154721d(type, "");
        C27910f G = C63244g.m114602a().mo73261G();
        C27895a<?> aVar = C27895a.get(type);
        C89219l.m154716b(aVar, "");
        return G.mo46671a(str2, aVar.type);
    }
}
