package com.bytedance.jedi.p1445a.p1454g.p1455a;

import com.bytedance.covode.number.Covode;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.jedi.a.g.a.d */
public final class C20199d {
    static {
        Covode.recordClassIndex(23707);
    }

    /* renamed from: a */
    private static String m38195a(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.bytedance.jedi.model.guava.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(String.valueOf(str)), (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }

    /* renamed from: a */
    static String m38196a(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        int i = 0;
        do {
            objArr[0] = m38195a(objArr[0]);
            i++;
        } while (i <= 0);
        StringBuilder sb = new StringBuilder(valueOf.length() + 16);
        int i2 = 0;
        int i3 = 0;
        do {
            int indexOf = valueOf.indexOf("%s", 0);
            if (indexOf == -1) {
                break;
            }
            sb.append((CharSequence) valueOf, 0, indexOf);
            i2++;
            sb.append(objArr[0]);
            i3 = indexOf + 2;
        } while (i2 <= 0);
        sb.append((CharSequence) valueOf, i3, valueOf.length());
        if (i2 <= 0) {
            sb.append(" [");
            sb.append(objArr[0]);
            sb.append(']');
        }
        return sb.toString();
    }
}
