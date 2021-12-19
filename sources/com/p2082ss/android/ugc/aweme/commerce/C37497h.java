package com.p2082ss.android.ugc.aweme.commerce;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.h */
public final class C37497h implements Serializable {
    @AbstractC27891c(mo46611a = "commerce_info")

    /* renamed from: a */
    private final C37495f f88508a;
    @AbstractC27891c(mo46611a = "permissions")

    /* renamed from: b */
    private final List<C37496g> f88509b;

    static {
        Covode.recordClassIndex(44884);
    }

    public final C37495f getCommerceInfo() {
        return this.f88508a;
    }

    public final List<C37496g> getPermissions() {
        return this.f88509b;
    }

    public final boolean hasPermission(String str) {
        List<C37496g> list;
        if (str != null && str.length() != 0 && (list = this.f88509b) != null && !list.isEmpty()) {
            Iterator<T> it = this.f88509b.iterator();
            while (true) {
                String str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t = next;
                if (t != null) {
                    str2 = t.getKey();
                }
                if (TextUtils.equals(str, str2)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
