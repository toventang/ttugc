package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.twitter.sdk.android.core.AbstractC87793j;
import com.twitter.sdk.android.core.C87686e;
import com.twitter.sdk.android.core.C87691i;
import com.twitter.sdk.android.core.C87808q;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C87730i;
import com.twitter.sdk.android.core.internal.C87733l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.a */
public class C87754a extends C87785t {

    /* renamed from: b */
    private static volatile ScheduledExecutorService f199319b;

    /* renamed from: c */
    private final AbstractC87793j<? extends C87691i<TwitterAuthToken>> f199320c;

    /* renamed from: d */
    private final String f199321d;

    /* renamed from: e */
    private final Context f199322e;

    static {
        Covode.recordClassIndex(103752);
    }

    /* renamed from: a */
    private C87691i m152724a() {
        return this.f199320c.mo142121a();
    }

    /* renamed from: b */
    private String m152727b() {
        return this.f199322e.getResources().getConfiguration().locale.getLanguage();
    }

    /* renamed from: c */
    private static ScheduledExecutorService m152728c() {
        MethodCollector.m26663i(5060);
        if (f199319b == null) {
            synchronized (C87754a.class) {
                try {
                    if (f199319b == null) {
                        ThreadFactory a = C87730i.m152681a("scribe");
                        C40787l.C40788a a2 = C40787l.m82269a(EnumC40793o.SCHEDULED);
                        a2.f95505c = 1;
                        a2.f95509g = a;
                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C40780g.m82242a(a2.mo70028a());
                        C87730i.m152682a("scribe", scheduledExecutorService);
                        f199319b = scheduledExecutorService;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5060);
                    throw th;
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService2 = f199319b;
        MethodCollector.m26664o(5060);
        return scheduledExecutorService2;
    }

    /* renamed from: a */
    private static long m152723a(C87691i iVar) {
        if (iVar != null) {
            return iVar.f199193b;
        }
        return 0;
    }

    /* renamed from: a */
    private void m152726a(C87787v vVar) {
        super.mo142254a(vVar, m152723a(m152724a()));
    }

    /* renamed from: a */
    public final void mo142208a(C87764e... eVarArr) {
        int i = 0;
        do {
            m152725a(eVarArr[0], Collections.emptyList());
            i++;
        } while (i <= 0);
    }

    /* renamed from: a */
    private void m152725a(C87764e eVar, List<Object> list) {
        m152726a(C87789w.m152800a(eVar, "", System.currentTimeMillis(), m152727b(), this.f199321d, list));
    }

    public C87754a(Context context, AbstractC87793j<? extends C87691i<TwitterAuthToken>> jVar, C87686e eVar, C87733l lVar, C87786u uVar) {
        this(context, C87808q.m152816a().f199464e, jVar, eVar, lVar, uVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C87754a(android.content.Context r10, com.twitter.sdk.android.core.TwitterAuthConfig r11, com.twitter.sdk.android.core.AbstractC87793j<? extends com.twitter.sdk.android.core.C87691i<com.twitter.sdk.android.core.TwitterAuthToken>> r12, com.twitter.sdk.android.core.C87686e r13, com.twitter.sdk.android.core.internal.C87733l r14, com.twitter.sdk.android.core.internal.scribe.C87786u r15) {
        /*
            r9 = this;
            java.util.concurrent.ScheduledExecutorService r2 = m152728c()
            com.twitter.sdk.android.core.internal.scribe.v$a r4 = new com.twitter.sdk.android.core.internal.scribe.v$a
            com.google.gson.g r1 = new com.google.gson.g
            r1.<init>()
            com.google.gson.d r0 = com.google.gson.EnumC27902d.LOWER_CASE_WITH_UNDERSCORES
            r1.f65562b = r0
            com.google.gson.f r0 = r1.mo46682b()
            r4.<init>(r0)
            r0 = r9
            r7 = r13
            r6 = r12
            r3 = r15
            r1 = r10
            r8 = r14
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f199322e = r1
            r9.f199320c = r6
            boolean r0 = r8.f199258a
            if (r0 == 0) goto L_0x0033
            com.twitter.sdk.android.core.internal.b r0 = r8.mo142179b()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r0.f199234a
        L_0x0030:
            r9.f199321d = r0
            return
        L_0x0033:
            r0 = 0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.internal.scribe.C87754a.<init>(android.content.Context, com.twitter.sdk.android.core.TwitterAuthConfig, com.twitter.sdk.android.core.j, com.twitter.sdk.android.core.e, com.twitter.sdk.android.core.internal.l, com.twitter.sdk.android.core.internal.scribe.u):void");
    }
}
