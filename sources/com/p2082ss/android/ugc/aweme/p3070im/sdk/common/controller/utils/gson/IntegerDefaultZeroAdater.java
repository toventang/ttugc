package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28026s;
import com.google.gson.C28025r;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.gson.IntegerDefaultZeroAdater */
public final class IntegerDefaultZeroAdater implements AbstractC28018k<Integer>, AbstractC28026s<Integer> {
    static {
        Covode.recordClassIndex(64958);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.AbstractC28026s
    /* renamed from: a */
    public final /* synthetic */ AbstractC28019l mo16610a(Integer num) {
        return new C28025r((Number) num);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Integer m100950a(com.google.gson.AbstractC28019l r2) {
        /*
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r2, r1)
            java.lang.String r0 = r2.mo46689c()     // Catch:{ Exception -> 0x0021 }
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r1)     // Catch:{ Exception -> 0x0021 }
            if (r0 != 0) goto L_0x001b
            java.lang.String r1 = r2.mo46689c()     // Catch:{ Exception -> 0x0021 }
            java.lang.String r0 = "null"
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)     // Catch:{ Exception -> 0x0021 }
            if (r0 == 0) goto L_0x0021
        L_0x001b:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0021 }
            return r0
        L_0x0021:
            int r0 = r2.mo46694g()     // Catch:{ NumberFormatException -> 0x002a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x002a:
            r1 = move-exception
            com.google.gson.t r0 = new com.google.gson.t
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.gson.IntegerDefaultZeroAdater.m100950a(com.google.gson.l):java.lang.Integer");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Integer mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m100950a(lVar);
    }
}
