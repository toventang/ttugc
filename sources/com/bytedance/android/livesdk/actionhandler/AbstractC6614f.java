package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.actionhandler.f */
public interface AbstractC6614f {
    static {
        Covode.recordClassIndex(7352);
    }

    boolean canHandle(Uri uri);

    boolean handle(Context context, Uri uri);

    boolean handle(Context context, Uri uri, Map<String, String> map);
}
