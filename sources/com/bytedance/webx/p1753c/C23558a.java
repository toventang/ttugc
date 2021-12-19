package com.bytedance.webx.p1753c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.p1753c.p1754a.AbstractC23561b;
import com.bytedance.webx.p1753c.p1754a.C23560a;
import com.bytedance.webx.p1753c.p1754a.C23562c;
import java.util.Arrays;

/* renamed from: com.bytedance.webx.c.a */
public final class C23558a {

    /* renamed from: a */
    private static C23563b f55803a = new C23563b();

    /* renamed from: com.bytedance.webx.c.a$a */
    public static class C23559a {

        /* renamed from: a */
        public int f55804a = 3;

        /* renamed from: b */
        public int f55805b;

        /* renamed from: c */
        public long f55806c;

        /* renamed from: d */
        public int f55807d = -1;

        /* renamed from: e */
        public String f55808e;

        /* renamed from: f */
        public int f55809f;

        /* renamed from: g */
        public Bitmap.Config f55810g;

        static {
            Covode.recordClassIndex(27657);
        }
    }

    static {
        Covode.recordClassIndex(27656);
    }

    /* renamed from: a */
    public static C23559a m44305a(View view) {
        return m44306a(view, new C23560a());
    }

    /* renamed from: a */
    private static C23559a m44306a(View view, AbstractC23561b bVar) {
        int i;
        int i2;
        C23559a aVar = new C23559a();
        int i3 = 0;
        if (view == null) {
            aVar.f55807d = 1;
            aVar.f55808e = "view is null.";
            aVar.f55804a = 3;
            return aVar;
        }
        Context context = view.getContext();
        if (context == null || context.getResources() == null) {
            aVar.f55807d = 4;
            aVar.f55808e = "context or context.getResources is null";
            aVar.f55804a = 3;
            return aVar;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            aVar.f55807d = 4;
            aVar.f55808e = "width and height must be > 0";
            aVar.f55804a = 3;
            return aVar;
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            aVar.f55807d = 2;
            aVar.f55808e = "current thread is not main thread.";
            aVar.f55804a = 3;
            return aVar;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                C23562c a = bVar.mo38640a(view);
                Bitmap bitmap = a.f55814a;
                if (bitmap != null) {
                    aVar.f55810g = bitmap.getConfig();
                    int width2 = bitmap.getWidth();
                    int height2 = bitmap.getHeight();
                    if (width2 > 0 && height2 > 0) {
                        int pixel = bitmap.getPixel(0, 0);
                        aVar.f55805b = pixel;
                        f55803a.f55816a = pixel;
                        C23563b bVar2 = f55803a;
                        int width3 = bitmap.getWidth();
                        int height3 = bitmap.getHeight();
                        if (width3 > 0 && height3 > 0) {
                            if (bVar2.f55816a == 0) {
                                i2 = bitmap.getPixel(0, 0);
                            } else {
                                i2 = bVar2.f55816a;
                            }
                            int[] iArr = new int[width3];
                            Arrays.fill(iArr, i2);
                            int[] iArr2 = new int[width3];
                            while (true) {
                                bitmap.getPixels(iArr2, 0, width3, 0, i3, width3, 1);
                                if (Arrays.equals(iArr, iArr2)) {
                                    i3++;
                                    if (i3 >= height3) {
                                        Integer.toHexString(i2);
                                        i = 1;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            aVar.f55804a = i;
                        }
                        i = 2;
                        aVar.f55804a = i;
                    }
                } else {
                    aVar.f55807d = 3;
                    aVar.f55808e = "bitmap is null.";
                    aVar.f55804a = 3;
                }
                aVar.f55809f = a.f55815b;
                aVar.f55806c = System.currentTimeMillis() - currentTimeMillis2;
                return aVar;
            } catch (Throwable th) {
                aVar.f55807d = 4;
                aVar.f55808e = th.getMessage();
                aVar.f55804a = 3;
                aVar.f55806c = System.currentTimeMillis() - currentTimeMillis;
                return aVar;
            }
        }
    }
}
