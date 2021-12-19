package com.bytedance.helios.sdk;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.helios.sdk.b */
public final class C15370b extends CopyOnWriteArrayList<C15372c> {
    static {
        Covode.recordClassIndex(17622);
    }

    public final C15372c last() {
        if (!isEmpty()) {
            return (C15372c) get(size() - 1);
        }
        return null;
    }

    /* renamed from: a */
    private boolean m28276a(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, ((C15372c) it.next()).f37496a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C15372c) {
            return super.contains(obj);
        }
        if (obj instanceof String) {
            return m28276a((String) obj);
        }
        if (obj instanceof Activity) {
            return m28276a(obj.toString());
        }
        return false;
    }

    public final void remove(Activity activity) {
        for (int size = size() - 1; size >= 0; size--) {
            if (TextUtils.equals(activity.toString(), ((C15372c) get(size)).f37496a)) {
                remove(size);
                return;
            }
        }
    }

    public final void add(Activity activity, AbstractC1196i.EnumC1198a aVar) {
        String obj = activity.toString();
        Iterator it = iterator();
        while (it.hasNext()) {
            C15372c cVar = (C15372c) it.next();
            if (TextUtils.equals(obj, cVar.f37496a)) {
                if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE || aVar == AbstractC1196i.EnumC1198a.ON_START || aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
                    remove(cVar);
                    cVar.f37497b = aVar;
                    add(cVar);
                    return;
                }
                cVar.f37497b = aVar;
                return;
            }
        }
        add(new C15372c(activity, aVar));
        if (size() > 10) {
            remove(0);
        }
    }
}
