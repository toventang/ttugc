package com.google.android.play.core.p1965d;

import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.d.f */
public final class C26980f implements AbstractC26983i {

    /* renamed from: a */
    final /* synthetic */ C26992r f63869a;

    /* renamed from: b */
    final /* synthetic */ Set f63870b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f63871c;

    /* renamed from: d */
    final /* synthetic */ C26986l f63872d;

    static {
        Covode.recordClassIndex(32456);
    }

    C26980f(C26986l lVar, C26992r rVar, Set set, AtomicBoolean atomicBoolean) {
        this.f63872d = lVar;
        this.f63869a = rVar;
        this.f63870b = set;
        this.f63871c = atomicBoolean;
    }

    @Override // com.google.android.play.core.p1965d.AbstractC26983i
    /* renamed from: a */
    public final void mo44690a(ZipFile zipFile, Set<C26985k> set) {
        this.f63872d.mo44692a(this.f63869a, set, new C26979e(this));
    }
}
