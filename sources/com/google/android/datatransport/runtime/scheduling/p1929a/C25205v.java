package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.v */
public final /* synthetic */ class C25205v implements C25188h.AbstractC25189a {

    /* renamed from: a */
    static final C25205v f59678a = new C25205v();

    static {
        Covode.recordClassIndex(30571);
    }

    private C25205v() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }
}
