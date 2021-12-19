package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.d */
public final class C78727d {
    static {
        Covode.recordClassIndex(91870);
    }

    /* renamed from: a */
    public static final Bitmap m137385a(Bitmap bitmap) {
        MethodCollector.m26663i(2924);
        C89219l.m154721d(bitmap, "");
        Matrix matrix = new Matrix();
        matrix.postScale(256.0f / ((float) bitmap.getWidth()), 256.0f / ((float) bitmap.getHeight()));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        C89219l.m154716b(createBitmap, "");
        MethodCollector.m26664o(2924);
        return createBitmap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <E> List<E> m137386a(List<E> list, int i) {
        C89219l.m154721d(list, "");
        if (list.size() <= i) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        float size = (((float) (list.size() - 1)) * 1.0f) / ((float) (i - 1));
        int i2 = 0;
        int i3 = i - 2;
        if (i3 >= 0) {
            while (true) {
                arrayList.add(list.get(Math.round(((float) i2) * size)));
                if (i2 == i3) {
                    break;
                }
                i2++;
            }
        }
        arrayList.add(C89070n.m154586h((List) list));
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[SYNTHETIC, Splitter:B:40:0x0095] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m137387a(android.graphics.Bitmap r7, java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.C78727d.m137387a(android.graphics.Bitmap, java.lang.String, java.lang.String):boolean");
    }
}
