package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.AbstractC25449e;
import com.google.android.gms.common.api.internal.AbstractC25462m;
import com.google.android.gms.common.internal.C25545h;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class AbstractC25544g<T extends IInterface> extends AbstractC25526c<T> implements C25335a.AbstractC25343f, C25545h.AbstractC25546a {

    /* renamed from: a */
    private final Set<Scope> f60607a;

    /* renamed from: r */
    public final C25539d f60608r;

    /* renamed from: s */
    private final Account f60609s;

    static {
        Covode.recordClassIndex(30947);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: n */
    public final Account mo41791n() {
        return this.f60609s;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: r */
    public final Set<Scope> mo41795r() {
        return this.f60607a;
    }

    @Override // com.google.android.gms.common.api.C25335a.AbstractC25343f, com.google.android.gms.common.internal.AbstractC25526c
    /* renamed from: e */
    public int mo41416e() {
        return super.mo41416e();
    }

    @Override // com.google.android.gms.common.api.C25335a.AbstractC25343f
    /* renamed from: l */
    public final Set<Scope> mo41497l() {
        if (mo41787i()) {
            return this.f60607a;
        }
        return Collections.emptySet();
    }

    public AbstractC25544g(Context context, Looper looper, int i, C25539d dVar, AbstractC25357i.AbstractC25359b bVar, AbstractC25357i.AbstractC25360c cVar) {
        this(context, looper, i, dVar, (AbstractC25449e) bVar, (AbstractC25462m) cVar);
    }

    public AbstractC25544g(Context context, Looper looper, int i, C25539d dVar, AbstractC25449e eVar, AbstractC25462m mVar) {
        this(context, looper, AbstractC25547i.m49290a(context), GoogleApiAvailability.getInstance(), i, dVar, (AbstractC25449e) C25565r.m49314a(eVar), (AbstractC25462m) C25565r.m49314a(mVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AbstractC25544g(android.content.Context r14, android.os.Looper r15, com.google.android.gms.common.internal.AbstractC25547i r16, com.google.android.gms.common.GoogleApiAvailability r17, int r18, com.google.android.gms.common.internal.C25539d r19, com.google.android.gms.common.api.internal.AbstractC25449e r20, com.google.android.gms.common.api.internal.AbstractC25462m r21) {
        /*
            r13 = this;
            r3 = r13
            r11 = 0
            r0 = r20
            if (r0 != 0) goto L_0x003e
            r10 = r11
        L_0x0007:
            r0 = r21
            if (r0 != 0) goto L_0x0038
        L_0x000b:
            r1 = r19
            java.lang.String r12 = r1.f60592h
            r4 = r13
            r8 = r17
            r7 = r16
            r6 = r15
            r5 = r14
            r9 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r3.f60608r = r1
            android.accounts.Account r0 = r1.f60585a
            r3.f60609s = r0
            java.util.Set<com.google.android.gms.common.api.Scope> r2 = r1.f60587c
            java.util.Iterator r1 = r2.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0044
            goto L_0x0027
        L_0x0038:
            com.google.android.gms.common.internal.x r11 = new com.google.android.gms.common.internal.x
            r11.<init>(r0)
            goto L_0x000b
        L_0x003e:
            com.google.android.gms.common.internal.w r10 = new com.google.android.gms.common.internal.w
            r10.<init>(r0)
            goto L_0x0007
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expanding scopes is not permitted, use implied scopes instead"
            r1.<init>(r0)
            throw r1
        L_0x004c:
            r3.f60607a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC25544g.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.i, com.google.android.gms.common.GoogleApiAvailability, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.e, com.google.android.gms.common.api.internal.m):void");
    }
}
