package com.google.android.play.core.p1963b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.android.play.core.b.bu */
public final class C26930bu extends C26927br implements AbstractC26931bv {
    static {
        Covode.recordClassIndex(32405);
    }

    public C26930bu(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        MethodCollector.m26663i(12462);
        MethodCollector.m26664o(12462);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.bx */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26931bv
    /* renamed from: a */
    public final void mo44635a(String str, Bundle bundle, AbstractC26933bx bxVar) {
        MethodCollector.m26663i(12463);
        Parcel a = mo44630a();
        a.writeString(str);
        C26929bt.m53498a(a, bundle);
        a.writeStrongBinder(bxVar);
        mo44631a(2, a);
        MethodCollector.m26664o(12463);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.bx */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26931bv
    /* renamed from: b */
    public final void mo44636b(String str, Bundle bundle, AbstractC26933bx bxVar) {
        MethodCollector.m26663i(12464);
        Parcel a = mo44630a();
        a.writeString(str);
        C26929bt.m53498a(a, bundle);
        a.writeStrongBinder(bxVar);
        mo44631a(3, a);
        MethodCollector.m26664o(12464);
    }
}
