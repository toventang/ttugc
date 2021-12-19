package com.google.p1914a.p1916b.p1917a.p1918a.p1919a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1914a.p1915a.C25054a;
import com.google.p1914a.p1915a.C25056c;
import java.util.List;

/* renamed from: com.google.a.b.a.a.a.a */
public final class C25057a extends C25054a implements AbstractC25058b {
    static {
        Covode.recordClassIndex(30421);
    }

    public C25057a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
        MethodCollector.m26663i(9969);
        MethodCollector.m26664o(9969);
    }

    @Override // com.google.p1914a.p1916b.p1917a.p1918a.p1919a.AbstractC25058b
    /* renamed from: a */
    public final void mo40972a(String str, Bundle bundle, AbstractC25060d dVar) {
        MethodCollector.m26663i(13867);
        Parcel a = mo40965a();
        a.writeString(str);
        C25056c.m48027a(a, bundle);
        C25056c.m48026a(a, dVar);
        mo40968b(2, a);
        MethodCollector.m26664o(13867);
    }

    @Override // com.google.p1914a.p1916b.p1917a.p1918a.p1919a.AbstractC25058b
    /* renamed from: a */
    public final void mo40973a(String str, List<Bundle> list, Bundle bundle, AbstractC25060d dVar) {
        MethodCollector.m26663i(13298);
        Parcel a = mo40965a();
        a.writeString(str);
        a.writeTypedList(list);
        C25056c.m48027a(a, bundle);
        C25056c.m48026a(a, dVar);
        mo40968b(1, a);
        MethodCollector.m26664o(13298);
    }
}
