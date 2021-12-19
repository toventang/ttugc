package com.bytedance.p1435io.prefetcher;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.io.prefetcher.a */
public final class C20062a {

    /* renamed from: a */
    public ArrayList<Pair<Long, Long>> f47739a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<Long> f47740b = new ArrayList<>();

    /* renamed from: c */
    public HashMap<Long, ArrayList<Boolean>> f47741c = new HashMap<>();

    /* renamed from: d */
    public String f47742d;

    static {
        Covode.recordClassIndex(23570);
    }

    /* renamed from: a */
    public static C20062a[] m38004a(File file, String str) {
        int i;
        File file2 = new File(file, "base.vdex");
        File file3 = new File(file, "base.odex");
        File file4 = new File(file, "base.art");
        if (file3.exists()) {
            i = 2;
        } else {
            i = 1;
        }
        if (file4.exists()) {
            i++;
        }
        if (file2.exists()) {
            i++;
        }
        C20062a[] aVarArr = new C20062a[i];
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            aVarArr[i2] = new C20062a();
        }
        aVarArr[0].f47742d = str;
        if (file3.exists()) {
            aVarArr[1].f47742d = file3.getAbsolutePath();
            if (System.currentTimeMillis() - file3.lastModified() < 5000) {
                z = true;
            }
        }
        if (file4.exists()) {
            aVarArr[2].f47742d = file4.getAbsolutePath();
            if (System.currentTimeMillis() - file4.lastModified() < 5000) {
                z = true;
            }
        }
        if (file2.exists()) {
            aVarArr[i - 1].f47742d = file2.getAbsolutePath();
            if (System.currentTimeMillis() - file2.lastModified() < 5000) {
                return null;
            }
        }
        if (z) {
            return null;
        }
        return aVarArr;
    }
}
