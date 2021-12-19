package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.C0569a;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f */
public final class C73772f {
    static {
        Covode.recordClassIndex(86511);
    }

    /* renamed from: a */
    public static final boolean m129821a() {
        return m129823a("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: a */
    public static final boolean m129823a(String str) {
        C89219l.m154721d(str, "");
        return m129825a(new String[]{str});
    }

    /* renamed from: b */
    public static final String[] m129828b(String[] strArr) {
        C89219l.m154721d(strArr, "");
        return m129826a(strArr, m129829c(strArr));
    }

    /* renamed from: a */
    public static final boolean m129824a(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static int[] m129829c(String[] strArr) {
        C89219l.m154721d(strArr, "");
        Context a = C40963b.m82473a();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C0643b.m2367a(a, str)));
        }
        return C89070n.m154578e((Collection<Integer>) arrayList);
    }

    /* renamed from: a */
    public static final boolean m129825a(String[] strArr) {
        C89219l.m154721d(strArr, "");
        return m129824a(m129829c(strArr));
    }

    /* renamed from: a */
    public static final boolean m129822a(Activity activity, String[] strArr) {
        boolean z;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(strArr, "");
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            String str = strArr[i];
            if (C0643b.m2367a(activity, str) != 0 && !C0569a.m2183a(activity, str)) {
                z = false;
                break;
            }
            i++;
        }
        if (!C63238c.f143566D.mo73307c().mo101671a() || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final C89378p<String, Boolean>[] m129827b(String[] strArr, int[] iArr) {
        boolean z;
        if (strArr == null || strArr.length == 0 || iArr == null || iArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArr[i];
            int i3 = i2 + 1;
            if (i2 <= iArr.length) {
                if (iArr[i2] == 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C89378p(str, Boolean.valueOf(z)));
            }
            i++;
            i2 = i3;
        }
        Object[] array = arrayList.toArray(new C89378p[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (C89378p[]) array;
    }

    /* renamed from: a */
    public static final String[] m129826a(String[] strArr, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        if (!(iArr == null || strArr == null)) {
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = iArr[i];
                int i4 = i2 + 1;
                if (i2 <= strArr.length && i3 == -1) {
                    arrayList.add(strArr[i2]);
                }
                i++;
                i2 = i4;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }
}
