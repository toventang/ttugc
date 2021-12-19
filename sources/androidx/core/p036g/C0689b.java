package androidx.core.p036g;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.g.b */
public final class C0689b {
    static {
        Covode.recordClassIndex(768);
    }

    /* renamed from: a */
    public static void m2445a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
