package com.facebook.p1814a.p1822g;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23909c;
import com.facebook.p1814a.p1818c.C23912a;
import com.facebook.p1814a.p1822g.C23969c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.a.g.b */
public class C23968b {

    /* renamed from: a */
    private static final String f56734a = C23969c.class.getSimpleName();

    C23968b() {
    }

    static {
        Covode.recordClassIndex(28089);
    }

    /* renamed from: a */
    private static boolean m45321a(String str) {
        if (C24677a.m47209a(C23968b.class)) {
            return false;
        }
        try {
            C24768q a = C24770r.m47427a(str, false);
            if (a != null) {
                return a.f58753a;
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23968b.class);
            return false;
        }
    }

    /* renamed from: a */
    private static JSONArray m45320a(List<C23909c> list, String str) {
        if (C24677a.m47209a(C23968b.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            C23912a.m45217a(list);
            boolean a = m45321a(str);
            for (C23909c cVar : list) {
                if (cVar.isChecksumValid() && ((!cVar.getIsImplicit()) || (cVar.getIsImplicit() && a))) {
                    jSONArray.put(cVar.getJSONObject());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23968b.class);
            return null;
        }
    }

    /* renamed from: a */
    static Bundle m45319a(C23969c.EnumC23970a aVar, String str, List<C23909c> list) {
        if (C24677a.m47209a(C23968b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(list);
            Bundle bundle = new Bundle();
            bundle.putString("event", aVar.toString());
            bundle.putString("app_id", str);
            if (C23969c.EnumC23970a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray a = m45320a(arrayList, str);
                if (a.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", a.toString());
            }
            return bundle;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23968b.class);
            return null;
        }
    }
}
