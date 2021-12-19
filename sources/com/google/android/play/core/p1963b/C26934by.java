package com.google.android.play.core.p1963b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;

/* renamed from: com.google.android.play.core.b.by */
public final class C26934by extends C26927br implements AbstractC26937ca {
    static {
        Covode.recordClassIndex(32409);
    }

    C26934by(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        MethodCollector.m26663i(12465);
        MethodCollector.m26664o(12465);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26937ca
    /* renamed from: a */
    public final void mo44639a(String str, List<Bundle> list, Bundle bundle, AbstractC26939cc ccVar) {
        MethodCollector.m26663i(12578);
        Parcel a = mo44630a();
        a.writeString(str);
        a.writeTypedList(list);
        C26929bt.m53498a(a, bundle);
        a.writeStrongBinder(ccVar);
        mo44631a(14, a);
        MethodCollector.m26664o(12578);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26937ca
    /* renamed from: a */
    public final void mo44638a(String str, Bundle bundle, AbstractC26939cc ccVar) {
        MethodCollector.m26663i(12682);
        Parcel a = mo44630a();
        a.writeString(str);
        C26929bt.m53498a(a, bundle);
        a.writeStrongBinder(ccVar);
        mo44631a(5, a);
        MethodCollector.m26664o(12682);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26937ca
    /* renamed from: a */
    public final void mo44637a(String str, Bundle bundle, Bundle bundle2, AbstractC26939cc ccVar) {
        MethodCollector.m26663i(12797);
        Parcel a = mo44630a();
        a.writeString(str);
        C26929bt.m53498a(a, bundle);
        C26929bt.m53498a(a, bundle2);
        a.writeStrongBinder(ccVar);
        mo44631a(6, a);
        MethodCollector.m26664o(12797);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26937ca
    /* renamed from: b */
    public final void mo44640b(String str, Bundle bundle, Bundle bundle2, AbstractC26939cc ccVar) {
        MethodCollector.m26663i(12798);
        Parcel a = mo44630a();
        a.writeString(str);
        C26929bt.m53498a(a, bundle);
        C26929bt.m53498a(a, bundle2);
        a.writeStrongBinder(ccVar);
        mo44631a(7, a);
        MethodCollector.m26664o(12798);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26937ca
    /* renamed from: c */
    public final void mo44642c(String str, Bundle bundle, Bundle bundle2, AbstractC26939cc ccVar) {
        MethodCollector.m26663i(12799);
        Parcel a = mo44630a();
        a.writeString(str);
        C26929bt.m53498a(a, bundle);
        C26929bt.m53498a(a, bundle2);
        a.writeStrongBinder(ccVar);
        mo44631a(9, a);
        MethodCollector.m26664o(12799);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26937ca
    /* renamed from: b */
    public final void mo44641b(String str, Bundle bundle, AbstractC26939cc ccVar) {
        MethodCollector.m26663i(12800);
        Parcel a = mo44630a();
        a.writeString(str);
        C26929bt.m53498a(a, bundle);
        a.writeStrongBinder(ccVar);
        mo44631a(10, a);
        MethodCollector.m26664o(12800);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.play.core.b.cc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.p1963b.AbstractC26937ca
    /* renamed from: d */
    public final void mo44643d(String str, Bundle bundle, Bundle bundle2, AbstractC26939cc ccVar) {
        MethodCollector.m26663i(12801);
        Parcel a = mo44630a();
        a.writeString(str);
        C26929bt.m53498a(a, bundle);
        C26929bt.m53498a(a, bundle2);
        a.writeStrongBinder(ccVar);
        mo44631a(11, a);
        MethodCollector.m26664o(12801);
    }
}
