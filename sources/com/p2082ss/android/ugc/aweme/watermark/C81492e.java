package com.p2082ss.android.ugc.aweme.watermark;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71848m;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71850o;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.watermark.e */
public final class C81492e {
    static {
        Covode.recordClassIndex(94865);
    }

    /* renamed from: a */
    public static String[] m141306a(C81489c[] cVarArr, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cVarArr.length; i++) {
            String path = new File(str, str2 + i + ".png").getPath();
            if (cVarArr[i].mo125202a(path)) {
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static C81489c[] m141305a(int i, int i2, String str, boolean z, boolean z2, boolean z3, C81490d dVar) {
        boolean z4;
        List<C71848m> a = C71850o.m126875a(dVar.f182198b);
        if (C13617h.m24465a(a)) {
            return m141307b(i, i2, str, z, z2, z3, dVar);
        }
        String concat = "@".concat(String.valueOf(str));
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < a.size(); i3++) {
            C81489c cVar = new C81489c();
            String str2 = a.get(i3).f161018b;
            if (!z2 || C63238c.f143582i.mo93759a() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            cVar.mo125201a(i, i2, concat, str2, z, z4, z3, dVar);
            arrayList.add(cVar);
        }
        return (C81489c[]) arrayList.toArray(new C81489c[arrayList.size()]);
    }

    /* renamed from: b */
    private static C81489c[] m141307b(int i, int i2, String str, boolean z, boolean z2, boolean z3, C81490d dVar) {
        boolean z4;
        C81489c cVar;
        MethodCollector.m26663i(8004);
        TypedArray obtainTypedArray = C63238c.f143574a.getResources().obtainTypedArray(R.array.b1);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        ArrayList arrayList = new ArrayList();
        String concat = "@".concat(String.valueOf(str));
        for (int i3 = 0; i3 < length; i3++) {
            C81489c cVar2 = new C81489c();
            iArr[i3] = obtainTypedArray.getResourceId(i3, 0);
            int i4 = iArr[i3];
            if (!z2 || C63238c.f143582i.mo93759a() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(C63238c.f143574a.getResources(), i4, null);
            if (!z4) {
                cVar = cVar2;
                cVar2.mo125200a(i, i2, concat, decodeResource, z, z3, dVar);
            } else {
                cVar = cVar2;
                concat = concat;
                cVar.mo125199a(i, i2, concat, decodeResource, z, z3);
            }
            arrayList.add(cVar);
        }
        obtainTypedArray.recycle();
        C81489c[] cVarArr = (C81489c[]) arrayList.toArray(new C81489c[arrayList.size()]);
        MethodCollector.m26664o(8004);
        return cVarArr;
    }
}
