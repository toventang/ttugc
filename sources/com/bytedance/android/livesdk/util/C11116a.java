package com.bytedance.android.livesdk.util;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28023p;
import com.google.gson.C28024q;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.util.a */
public final class C11116a {

    /* renamed from: a */
    private static C28024q f26724a = new C28024q();

    static {
        Covode.recordClassIndex(12740);
    }

    /* renamed from: a */
    public static String m19747a(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return C4139e.C4140a.f11575b.mo46674b(obj);
        } catch (Throwable th) {
            throw new C28023p(th);
        }
    }

    /* renamed from: a */
    public static <T> T m19746a(String str, Type type) {
        if (str == null) {
            return null;
        }
        try {
            return (T) C4139e.C4140a.f11575b.mo46671a(str, type);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m19745a(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) C4139e.C4140a.f11575b.mo46670a(str, (Class) cls);
        } catch (Throwable th) {
            throw new C28023p(th);
        }
    }

    /* renamed from: b */
    public static <T> List<T> m19748b(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC28019l> it = C28024q.m56139a(str).mo46790k().iterator();
        while (it.hasNext()) {
            arrayList.add(C4139e.C4140a.f11575b.mo46667a(it.next(), (Class) cls));
        }
        return arrayList;
    }
}
