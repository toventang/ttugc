package com.p2082ss.android.ugc.aweme.photo.p3547b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.photo.b.a */
public final class C62858a {
    static {
        Covode.recordClassIndex(73689);
    }

    /* renamed from: a */
    public static void m113275a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
    }
}
