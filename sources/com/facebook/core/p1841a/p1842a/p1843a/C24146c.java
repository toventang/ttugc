package com.facebook.core.p1841a.p1842a.p1843a;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.core.a.a.a.c */
public final class C24146c {
    static {
        Covode.recordClassIndex(28277);
    }

    /* renamed from: a */
    private static String m45759a(int i) {
        return "#" + Integer.toHexString(i);
    }

    /* renamed from: a */
    public static String m45760a(Resources resources, int i) {
        String str;
        if (resources == null) {
            try {
                return m45759a(i);
            } catch (Resources.NotFoundException unused) {
                return m45759a(i);
            }
        } else {
            String str2 = "";
            if (((i >>> 24) & 255) != 127) {
                str2 = resources.getResourcePackageName(i);
                str = ":";
            } else {
                str = str2;
            }
            String resourceTypeName = resources.getResourceTypeName(i);
            String resourceEntryName = resources.getResourceEntryName(i);
            StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
            sb.append("@");
            sb.append(str2);
            sb.append(str);
            sb.append(resourceTypeName);
            sb.append("/");
            sb.append(resourceEntryName);
            return sb.toString();
        }
    }
}
