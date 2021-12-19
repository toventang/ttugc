package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.Cursor;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.p1928e.C25154a;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;
import java.util.ArrayList;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.r */
final /* synthetic */ class C25201r implements C25188h.AbstractC25189a {

    /* renamed from: a */
    static final C25201r f59672a = new C25201r();

    static {
        Covode.recordClassIndex(30567);
    }

    private C25201r() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        byte[] decode;
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            AbstractC25162k.AbstractC25163a a = AbstractC25162k.m48261d().mo41125a(cursor.getString(1)).mo41124a(C25154a.m48225a(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                decode = null;
            } else {
                decode = Base64.decode(string, 0);
            }
            arrayList.add(a.mo41126a(decode).mo41127a());
        }
        return arrayList;
    }
}
