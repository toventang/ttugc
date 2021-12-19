package com.google.firebase.analytics;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.BinderC26218ov;
import com.google.android.gms.internal.measurement.C25939f;
import com.google.android.gms.internal.measurement.C26003h;
import com.google.android.gms.internal.measurement.C26057j;
import com.google.android.gms.internal.measurement.C26088k;
import com.google.android.gms.internal.measurement.C26223p;
import com.google.android.gms.internal.measurement.C26226q;
import com.google.android.gms.internal.measurement.C26227r;
import com.google.android.gms.internal.measurement.C26229t;
import com.google.android.gms.internal.measurement.C26230u;
import com.google.android.gms.internal.measurement.C26231v;
import com.google.android.gms.internal.measurement.C26234y;
import com.google.android.gms.internal.measurement.C26235z;
import com.google.android.gms.measurement.internal.AbstractC26438hi;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.analytics.c */
final class C27688c implements AbstractC26438hi {

    /* renamed from: a */
    private final /* synthetic */ C25939f f65087a;

    static {
        Covode.recordClassIndex(33269);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: e */
    public final long mo43365e() {
        return this.f65087a.mo42389a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: a */
    public final String mo43353a() {
        C25939f fVar = this.f65087a;
        BinderC26218ov ovVar = new BinderC26218ov();
        fVar.mo42391a(new C26231v(fVar, ovVar));
        return ovVar.mo42911a(500);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: b */
    public final String mo43359b() {
        C25939f fVar = this.f65087a;
        BinderC26218ov ovVar = new BinderC26218ov();
        fVar.mo42391a(new C26230u(fVar, ovVar));
        return ovVar.mo42911a(500);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: c */
    public final String mo43363c() {
        C25939f fVar = this.f65087a;
        BinderC26218ov ovVar = new BinderC26218ov();
        fVar.mo42391a(new C26229t(fVar, ovVar));
        return ovVar.mo42911a(50);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: d */
    public final String mo43364d() {
        C25939f fVar = this.f65087a;
        BinderC26218ov ovVar = new BinderC26218ov();
        fVar.mo42391a(new C26226q(fVar, ovVar));
        return ovVar.mo42911a(500);
    }

    C27688c(C25939f fVar) {
        this.f65087a = fVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: a */
    public final void mo43356a(Bundle bundle) {
        C25939f fVar = this.f65087a;
        fVar.mo42391a(new C26003h(fVar, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: b */
    public final void mo43360b(String str) {
        C25939f fVar = this.f65087a;
        fVar.mo42391a(new C26227r(fVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: c */
    public final int mo43362c(String str) {
        C25939f fVar = this.f65087a;
        BinderC26218ov ovVar = new BinderC26218ov();
        fVar.mo42391a(new C26235z(fVar, str, ovVar));
        Integer num = (Integer) BinderC26218ov.m51336a(ovVar.mo42913b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: a */
    public final void mo43357a(String str) {
        C25939f fVar = this.f65087a;
        fVar.mo42391a(new C26223p(fVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: a */
    public final List<Bundle> mo43354a(String str, String str2) {
        C25939f fVar = this.f65087a;
        BinderC26218ov ovVar = new BinderC26218ov();
        fVar.mo42391a(new C26057j(fVar, str, str2, ovVar));
        List<Bundle> list = (List) BinderC26218ov.m51336a(ovVar.mo42913b(5000), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: a */
    public final void mo43358a(String str, String str2, Bundle bundle) {
        this.f65087a.mo42394a(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: b */
    public final void mo43361b(String str, String str2, Bundle bundle) {
        C25939f fVar = this.f65087a;
        fVar.mo42391a(new C26088k(fVar, str, str2, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26438hi
    /* renamed from: a */
    public final Map<String, Object> mo43355a(String str, String str2, boolean z) {
        C25939f fVar = this.f65087a;
        BinderC26218ov ovVar = new BinderC26218ov();
        fVar.mo42391a(new C26234y(fVar, str, str2, z, ovVar));
        Bundle b = ovVar.mo42913b(5000);
        if (b == null || b.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b.size());
        for (String str3 : b.keySet()) {
            Object a = C25939f.m50212a(b, str3);
            if ((a instanceof Double) || (a instanceof Long) || (a instanceof String)) {
                hashMap.put(str3, a);
            }
        }
        return hashMap;
    }
}
