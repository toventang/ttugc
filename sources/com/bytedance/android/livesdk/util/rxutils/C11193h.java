package com.bytedance.android.livesdk.util.rxutils;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.h */
public final class C11193h implements AbstractC88434g<AbstractC88979t<Throwable>, AbstractC88984x<?>> {

    /* renamed from: a */
    public final int f26819a = 3;

    /* renamed from: b */
    public final long f26820b;

    /* renamed from: c */
    public int f26821c;

    static {
        Covode.recordClassIndex(12820);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final /* synthetic */ AbstractC88984x<?> apply(AbstractC88979t<Throwable> tVar) {
        return tVar.mo143267a((AbstractC88434g<? super Throwable, ? extends AbstractC88984x<? extends R>>) new AbstractC88434g<Throwable, AbstractC88984x<?>>() {
            /* class com.bytedance.android.livesdk.util.rxutils.C11193h.C111941 */

            static {
                Covode.recordClassIndex(12821);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
                if (r2.getStatusCode() <= 599) goto L_0x001a;
             */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ p4560f.p4561a.AbstractC88984x<?> apply(java.lang.Throwable r5) {
                /*
                    r4 = this;
                    java.lang.Throwable r5 = (java.lang.Throwable) r5
                    boolean r0 = r5 instanceof com.bytedance.android.live.base.model.p180b.C2963a
                    r3 = 1
                    if (r0 == 0) goto L_0x001f
                    r2 = r5
                    com.bytedance.android.live.base.model.b.a r2 = (com.bytedance.android.live.base.model.p180b.C2963a) r2
                    int r1 = r2.getStatusCode()
                    r0 = 500(0x1f4, float:7.0E-43)
                    if (r1 < r0) goto L_0x001f
                    int r1 = r2.getStatusCode()
                    r0 = 599(0x257, float:8.4E-43)
                    if (r1 > r0) goto L_0x001f
                L_0x001a:
                    f.a.t r0 = p4560f.p4561a.AbstractC88979t.m154302a(r5)
                    return r0
                L_0x001f:
                    com.bytedance.android.livesdk.util.rxutils.h r0 = com.bytedance.android.livesdk.util.rxutils.C11193h.this
                    int r1 = r0.f26821c
                    int r1 = r1 + r3
                    r0.f26821c = r1
                    com.bytedance.android.livesdk.util.rxutils.h r0 = com.bytedance.android.livesdk.util.rxutils.C11193h.this
                    int r0 = r0.f26819a
                    if (r1 > r0) goto L_0x001a
                    com.bytedance.android.livesdk.util.rxutils.h r0 = com.bytedance.android.livesdk.util.rxutils.C11193h.this
                    long r1 = r0.f26820b
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                    f.a.t r0 = p4560f.p4561a.AbstractC88979t.m154307b(r1, r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.util.rxutils.C11193h.C111941.apply(java.lang.Object):java.lang.Object");
            }
        }, false);
    }

    public C11193h(long j) {
        this.f26820b = j <= 0 ? 500 : j;
    }
}
