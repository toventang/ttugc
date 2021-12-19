package com.p2082ss.android.medialib.p2155b;

import android.media.ExifInterface;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.ss.android.medialib.b.b */
public class C29987b {

    /* renamed from: a */
    private static final String f71539a = C29987b.class.getSimpleName();

    static {
        Covode.recordClassIndex(36439);
    }

    /* renamed from: a */
    public static int m60521a(String str) {
        ExifInterface exifInterface;
        try {
            exifInterface = new ExifInterface(str);
        } catch (IOException e) {
            e.printStackTrace();
            exifInterface = null;
        }
        if (exifInterface == null) {
            return 0;
        }
        int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
        if (attributeInt == 3) {
            return LiveFeedRefreshTimeSetting.DEFAULT;
        }
        if (attributeInt == 6) {
            return 90;
        }
        if (attributeInt != 8) {
            return 0;
        }
        return 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r2 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[SYNTHETIC, Splitter:B:28:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088 A[SYNTHETIC, Splitter:B:33:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009c A[SYNTHETIC, Splitter:B:43:0x009c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m60522a(android.graphics.Bitmap r7, java.lang.String r8, android.graphics.Bitmap.CompressFormat r9) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.medialib.p2155b.C29987b.m60522a(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat):void");
    }
}
