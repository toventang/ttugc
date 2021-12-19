package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.y */
final /* synthetic */ class C25208y implements C25188h.AbstractC25189a {

    /* renamed from: a */
    private final C25188h f59681a;

    /* renamed from: b */
    private final AbstractC25162k f59682b;

    static {
        Covode.recordClassIndex(30574);
    }

    C25208y(C25188h hVar, AbstractC25162k kVar) {
        this.f59681a = hVar;
        this.f59682b = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        MethodCollector.m26663i(3118);
        C25188h hVar = this.f59681a;
        Long a = C25188h.m48320a((SQLiteDatabase) obj, this.f59682b);
        if (a == null) {
            MethodCollector.m26664o(3118);
            return false;
        }
        Object a2 = C25188h.m48321a(hVar.mo41183c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{a.toString()}), C25202s.f59673a);
        MethodCollector.m26664o(3118);
        return a2;
    }
}
