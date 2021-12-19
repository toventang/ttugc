package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28026s;
import com.google.gson.C28025r;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.gson.BooleanDefaultFalseAdapter */
public final class BooleanDefaultFalseAdapter implements AbstractC28018k<Boolean>, AbstractC28026s<Boolean> {
    static {
        Covode.recordClassIndex(64957);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.AbstractC28026s
    /* renamed from: a */
    public final /* synthetic */ AbstractC28019l mo16610a(Boolean bool) {
        return new C28025r(bool);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|(2:18|19)|20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        throw new com.google.gson.C28027t(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m100947a(com.google.gson.AbstractC28019l r3) {
        /*
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            java.lang.String r0 = r3.mo46689c()     // Catch:{ Exception -> 0x004c }
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r1)     // Catch:{ Exception -> 0x004c }
            r2 = 0
            if (r0 != 0) goto L_0x001c
            java.lang.String r1 = r3.mo46689c()     // Catch:{ Exception -> 0x004c }
            java.lang.String r0 = "null"
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)     // Catch:{ Exception -> 0x004c }
            if (r0 == 0) goto L_0x0021
        L_0x001c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x004c }
            return r0
        L_0x0021:
            java.lang.Number r0 = r3.mo46688b()     // Catch:{ Exception -> 0x004c }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x004c }
            if (r0 == 0) goto L_0x0031
            int r0 = r3.mo46694g()     // Catch:{ Exception -> 0x004c }
            if (r0 != 0) goto L_0x0036
        L_0x0031:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x004c }
            return r0
        L_0x0036:
            java.lang.Number r0 = r3.mo46688b()     // Catch:{ Exception -> 0x004c }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x004c }
            r1 = 1
            if (r0 == r1) goto L_0x0047
            int r0 = r3.mo46694g()     // Catch:{ Exception -> 0x004c }
            if (r0 != r1) goto L_0x004c
        L_0x0047:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x004c }
            return r0
        L_0x004c:
            boolean r0 = r3.mo46695h()     // Catch:{ UnsupportedOperationException -> 0x0055 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0055:
            r1 = move-exception
            com.google.gson.t r0 = new com.google.gson.t
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.gson.BooleanDefaultFalseAdapter.m100947a(com.google.gson.l):java.lang.Boolean");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28018k
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Boolean mo11581a(AbstractC28019l lVar, Type type, AbstractC28017j jVar) {
        return m100947a(lVar);
    }
}
