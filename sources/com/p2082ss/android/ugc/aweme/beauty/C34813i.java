package com.p2082ss.android.ugc.aweme.beauty;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4092a.AbstractC77890d;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.beauty.i */
public final class C34813i {

    /* renamed from: a */
    public static final C34813i f82240a = new C34813i();

    /* renamed from: b */
    private static ArrayList<UlikeBeautyData> f82241b = new ArrayList<>();

    private C34813i() {
    }

    static {
        Covode.recordClassIndex(41817);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.beauty.UlikeBeautyData> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        if (r1 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
        r2 = ((java.lang.Iterable) r6.getValue()).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        if (r2.hasNext() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fb, code lost:
        r1 = r2.next();
        r0 = (com.p2082ss.android.ugc.aweme.beauty.UlikeBeautyData) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0102, code lost:
        if (r0 == null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        r0 = r0.getUlikeBeautyExtra();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        if (r0 == null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010e, code lost:
        if (r0.getAbGroup() != 0) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        if (r1 == null) goto L_0x00b8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.p2082ss.android.ugc.aweme.beauty.UlikeBeautyData> m71122a(java.util.ArrayList<com.p2082ss.android.ugc.aweme.beauty.UlikeBeautyData> r8) {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.beauty.C34813i.m71122a(java.util.ArrayList):java.util.ArrayList");
    }

    /* renamed from: a */
    public static final boolean m71123a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC77890d dVar = C77886a.f174755l;
        if (dVar == null || !dVar.mo121539a()) {
            return false;
        }
        return C84902i.m145892a(m71124b(str, str2) + File.separator + "config.json");
    }

    /* renamed from: b */
    public static final String m71124b(String str, String str2) {
        T t;
        T t2;
        String str3;
        ComposerBeautyExtra ulikeBeautyExtra;
        String str4;
        String str5;
        ComposerBeautyExtra ulikeBeautyExtra2;
        ComposerBeautyExtra ulikeBeautyExtra3;
        ArrayList<UlikeBeautyData> a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        ArrayList<UlikeBeautyData> arrayList = f82241b;
        if ((arrayList == null || arrayList.isEmpty()) && (a = C34811h.m71121a()) != null) {
            f82241b = a;
        }
        ArrayList<UlikeBeautyData> arrayList2 = f82241b;
        if (arrayList2 == null) {
            return null;
        }
        ArrayList<UlikeBeautyData> a2 = m71122a(arrayList2);
        Iterator<T> it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t3 = t;
            if (t3 == null || (ulikeBeautyExtra3 = t3.getUlikeBeautyExtra()) == null) {
                str4 = null;
            } else {
                str4 = ulikeBeautyExtra3.getResourceType();
            }
            if (TextUtils.equals(str4, str2)) {
                if (t3 == null || (ulikeBeautyExtra2 = t3.getUlikeBeautyExtra()) == null) {
                    str5 = null;
                } else {
                    str5 = ulikeBeautyExtra2.getGender();
                }
                if (TextUtils.equals(str5, str)) {
                    break;
                }
            }
        }
        T t4 = t;
        if (t4 == null) {
            Iterator<T> it2 = a2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it2.next();
                T t5 = t2;
                if (t5 == null || (ulikeBeautyExtra = t5.getUlikeBeautyExtra()) == null) {
                    str3 = null;
                } else {
                    str3 = ulikeBeautyExtra.getResourceType();
                }
                if (TextUtils.equals(str3, str2)) {
                    break;
                }
            }
            t4 = t2;
            if (t4 == null) {
                return null;
            }
        }
        return t4.getUnzipPath();
    }
}
