package com.google.android.play.core.p1963b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;

/* renamed from: com.google.android.play.core.b.ap */
public final class C26898ap extends C26927br implements AbstractC26899aq {
    static {
        Covode.recordClassIndex(32373);
    }

    public C26898ap(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        MethodCollector.m26663i(12516);
        MethodCollector.m26664o(12516);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.as */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26899aq
    /* renamed from: a */
    public final void mo44575a(String str, List<Bundle> list, Bundle bundle, AbstractC26901as asVar) {
        MethodCollector.m26663i(12517);
        Parcel a = mo44630a();
        a.writeString(str);
        a.writeTypedList(list);
        C26929bt.m53498a(a, bundle);
        a.writeStrongBinder(asVar);
        mo44631a(2, a);
        MethodCollector.m26664o(12517);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.as */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26899aq
    /* renamed from: a */
    public final void mo44573a(String str, int i, Bundle bundle, AbstractC26901as asVar) {
        MethodCollector.m26663i(12623);
        Parcel a = mo44630a();
        a.writeString(str);
        a.writeInt(i);
        C26929bt.m53498a(a, bundle);
        a.writeStrongBinder(asVar);
        mo44631a(4, a);
        MethodCollector.m26664o(12623);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.as */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26899aq
    /* renamed from: a */
    public final void mo44574a(String str, int i, AbstractC26901as asVar) {
        MethodCollector.m26663i(12741);
        Parcel a = mo44630a();
        a.writeString(str);
        a.writeInt(i);
        a.writeStrongBinder(asVar);
        mo44631a(5, a);
        MethodCollector.m26664o(12741);
    }
}
