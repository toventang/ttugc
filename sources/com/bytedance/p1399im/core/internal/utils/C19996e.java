package com.bytedance.p1399im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.AbstractC19481b;
import com.bytedance.p1399im.core.p1404a.AbstractC19495i;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.IMCMD;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.utils.e */
public class C19996e {

    /* renamed from: a */
    static final String f47537a = C19996e.class.getSimpleName();

    /* renamed from: a */
    public static String m37749a(int i) {
        return i != 0 ? i != 6 ? i != 9 ? i != 2 ? i != 3 ? i != 4 ? "other" : "manual" : "net" : "cursor" : "migrate" : "token" : "init";
    }

    /* renamed from: a */
    public static boolean m37752a(long j, long j2) {
        return (j & j2) == j2;
    }

    /* renamed from: b */
    public static String m37758b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static int[] m37756a() {
        int[] iArr = C19483d.m36365a().mo31141b().f46280t;
        return iArr == null ? C19483d.m36365a().mo31141b().f46279s : iArr;
    }

    /* renamed from: a */
    public static boolean m37754a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String valueOf = String.valueOf(C19483d.m36365a().f46157b.mo27953a());
        String[] split = str.split(",");
        for (String str2 : split) {
            if (str2 != null && (str2.equals(valueOf) || str2.equals("0"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m37755a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", f47537a, e);
            return z;
        }
    }

    /* renamed from: a */
    public static boolean m37753a(Integer num) {
        if (num == null) {
            return false;
        }
        if (IMCMD.REPORT_CLIENT_METRICS.getValue() == num.intValue() || IMCMD.BROADCAST_RECV_MESSAGE.getValue() == num.intValue()) {
            return true;
        }
        AbstractC19495i iVar = C19483d.m36365a().f46163h;
        return iVar != null && iVar.mo27978a(num);
    }

    static {
        Covode.recordClassIndex(22841);
    }

    /* renamed from: b */
    public static int m37757b() {
        int[] a = m37756a();
        if (a == null) {
            return 0;
        }
        return a.length;
    }

    /* renamed from: c */
    public static long m37759c() {
        AbstractC19481b bVar = C19483d.m36365a().f46157b;
        if (bVar == null) {
            return 0;
        }
        return bVar.mo27953a();
    }

    /* renamed from: a */
    public static int m37747a(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public static String m37750a(Object obj) {
        try {
            return C19999h.f47538a.mo46674b(obj);
        } catch (Throwable th) {
            C19512f.m36457b("imsdk", "toJson", th);
            return "";
        }
    }

    /* renamed from: a */
    public static float m37745a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", f47537a, e);
            return f;
        }
    }

    /* renamed from: a */
    public static int m37746a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", f47537a, e);
            return i;
        }
    }

    /* renamed from: a */
    public static long m37748a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            C19512f.m36457b("imsdk", f47537a, e);
            return j;
        }
    }

    /* renamed from: a */
    public static String m37751a(List list, String str) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
