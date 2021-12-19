package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.x */
final /* synthetic */ class C25207x implements C25188h.AbstractC25189a {

    /* renamed from: a */
    static final C25207x f59680a = new C25207x();

    static {
        Covode.recordClassIndex(30573);
    }

    private C25207x() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }
}
