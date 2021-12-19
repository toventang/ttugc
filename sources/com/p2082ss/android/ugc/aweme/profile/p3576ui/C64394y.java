package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import p078c.p080b.C1756d;
import p078c.p083d.C1762a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.y */
public final class C64394y {

    /* renamed from: a */
    public static final C64394y f145999a = new C64394y();

    private C64394y() {
    }

    static {
        Covode.recordClassIndex(75848);
    }

    /* renamed from: a */
    public static int m116284a(Context context, Uri uri) {
        ExifInterface exifInterface;
        C89219l.m154721d(context, "");
        C89219l.m154721d(uri, "");
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                exifInterface = new ExifInterface(C1756d.m5891a(context, uri));
            } else {
                exifInterface = new ExifInterface(C1762a.m5918a(context, uri));
            }
            int attributeInt = exifInterface.getAttributeInt("Orientation", 1);
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
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m116285b(android.content.Context r5, android.net.Uri r6) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.C64394y.m116285b(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[SYNTHETIC, Splitter:B:21:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c A[SYNTHETIC, Splitter:B:30:0x006c] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m116286c(android.content.Context r9, android.net.Uri r10) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.C64394y.m116286c(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }
}
