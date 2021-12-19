package com.p2082ss.android.ugc.aweme.canvas;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.d */
public final class C35373d implements AbstractC35372c {

    /* renamed from: a */
    public static final C35374a f83457a = new C35374a((byte) 0);

    static {
        Covode.recordClassIndex(42544);
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.d$a */
    public static final class C35374a {
        static {
            Covode.recordClassIndex(42545);
        }

        private C35374a() {
        }

        public /* synthetic */ C35374a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.canvas.AbstractC35372c
    /* renamed from: a */
    public final C89378p<Integer, Integer> mo62280a(Bitmap bitmap) {
        C89219l.m154721d(bitmap, "");
        int width = bitmap.getWidth();
        double height = (double) bitmap.getHeight();
        Double.isNaN(height);
        Integer valueOf = Integer.valueOf(m72400a(bitmap, new Rect(0, 0, width, (int) (height * 0.1d))));
        int height2 = bitmap.getHeight();
        double height3 = (double) bitmap.getHeight();
        Double.isNaN(height3);
        return C89387v.m154943a(valueOf, Integer.valueOf(m72400a(bitmap, new Rect(0, height2 - ((int) (height3 * 0.1d)), bitmap.getWidth(), bitmap.getHeight()))));
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.d$b */
    public static final class C35375b<T> implements Comparator {
        static {
            Covode.recordClassIndex(42546);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t2.f83431b), Integer.valueOf(t.f83431b));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m72400a(android.graphics.Bitmap r18, android.graphics.Rect r19) {
        /*
        // Method dump skipped, instructions count: 664
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.canvas.C35373d.m72400a(android.graphics.Bitmap, android.graphics.Rect):int");
    }
}
