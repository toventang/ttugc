package com.p2082ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.watermark.r */
public final class C81508r {
    static {
        Covode.recordClassIndex(94881);
    }

    /* renamed from: a */
    public static String[] m141344a(C81507q[] qVarArr, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < qVarArr.length; i++) {
            String path = new File(str, str2 + i + ".png").getPath();
            if (qVarArr[i].mo125225a(path)) {
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
