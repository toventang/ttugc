package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28031v;
import com.google.gson.C28024q;
import com.google.gson.internal.C28009k;
import com.google.gson.internal.bind.C27949i;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;

/* renamed from: com.ss.android.ugc.aweme.utils.dx */
public final class C80365dx extends AbstractC28031v<String> {
    static {
        Covode.recordClassIndex(93633);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ String read(C27897a aVar) {
        AbstractC28019l a = C28009k.m56099a(aVar);
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ void write(C27900c cVar, String str) {
        C27949i.f65708X.write(cVar, C28024q.m56139a(str));
    }
}
