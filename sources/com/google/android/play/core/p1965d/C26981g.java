package com.google.android.play.core.p1965d;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.d.g */
public final class C26981g implements AbstractC26983i {

    /* renamed from: a */
    final /* synthetic */ Set f63873a;

    /* renamed from: b */
    final /* synthetic */ C26992r f63874b;

    /* renamed from: c */
    final /* synthetic */ C26986l f63875c;

    static {
        Covode.recordClassIndex(32457);
    }

    C26981g(C26986l lVar, Set set, C26992r rVar) {
        this.f63875c = lVar;
        this.f63873a = set;
        this.f63874b = rVar;
    }

    @Override // com.google.android.play.core.p1965d.AbstractC26983i
    /* renamed from: a */
    public final void mo44690a(ZipFile zipFile, Set<C26985k> set) {
        Set set2 = this.f63873a;
        C26986l lVar = this.f63875c;
        C26992r rVar = this.f63874b;
        HashSet hashSet = new HashSet();
        lVar.mo44692a(rVar, set, new C26982h(hashSet, rVar, zipFile));
        set2.addAll(hashSet);
    }
}
