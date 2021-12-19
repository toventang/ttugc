package net.openid.appauth;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashSet;

/* access modifiers changed from: package-private */
/* renamed from: net.openid.appauth.c */
public final class C89976c {
    static {
        Covode.recordClassIndex(106147);
    }

    /* renamed from: a */
    public static String m156115a(Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : iterable) {
            C90009p.m156200a(!TextUtils.isEmpty(str), "individual scopes cannot be null or empty");
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }
}
