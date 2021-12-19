package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.s */
final /* synthetic */ class C25202s implements C25188h.AbstractC25189a {

    /* renamed from: a */
    static final C25202s f59673a = new C25202s();

    static {
        Covode.recordClassIndex(30568);
    }

    private C25202s() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
