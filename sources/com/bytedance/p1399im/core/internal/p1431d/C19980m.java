package com.bytedance.p1399im.core.internal.p1431d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.p1407c.C19512f;

/* renamed from: com.bytedance.im.core.internal.d.m */
public final class C19980m extends AbstractC19948a {

    /* renamed from: e */
    private C19978k f47498e;

    static {
        Covode.recordClassIndex(22824);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: c */
    public final String mo31825c() {
        return "IM-REQUEST-QUEUE-S";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: a */
    public final void mo31817a() {
        super.mo31817a();
        this.f47498e = null;
    }

    /* renamed from: f */
    private synchronized void m37706f() {
        MethodCollector.m26663i(8129);
        if (this.f47444d.isEmpty()) {
            C19512f.m36457b("imsdk", mo31823b() + "sendNextRequest, mQueue empty", (Throwable) null);
            MethodCollector.m26664o(8129);
        } else if (this.f47498e != null) {
            C19512f.m36457b("imsdk", mo31823b() + "sendNextRequest, has waitingItem", (Throwable) null);
            MethodCollector.m26664o(8129);
        } else {
            C19978k kVar = (C19978k) this.f47444d.peek();
            if (kVar == null) {
                C19512f.m36457b("imsdk", mo31823b() + "sendNextRequest, peeked item null", (Throwable) null);
                MethodCollector.m26664o(8129);
                return;
            }
            if (kVar.f47494r <= 0) {
                kVar.f47494r = SystemClock.uptimeMillis();
            }
            this.f47498e = kVar;
            mo31819a(kVar);
            MethodCollector.m26664o(8129);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: c */
    public final void mo31826c(C19978k kVar) {
        if (kVar == this.f47498e) {
            this.f47498e = null;
            m37706f();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: d */
    public final void mo31828d(C19978k kVar) {
        super.mo31828d(kVar);
        if (kVar == this.f47498e) {
            mo31832g(kVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: g */
    public final void mo31832g(C19978k kVar) {
        super.mo31832g(kVar);
        this.f47498e = null;
        m37706f();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: h */
    public final void mo31833h(C19978k kVar) {
        super.mo31833h(kVar);
        this.f47498e = null;
        m37706f();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a
    /* renamed from: b */
    public final void mo31824b(C19978k kVar) {
        if (!this.f47444d.contains(kVar)) {
            this.f47444d.add(kVar);
            kVar.f47493q = SystemClock.uptimeMillis();
        }
        if (mo31834i(kVar)) {
            m37706f();
        }
    }
}
