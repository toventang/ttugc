package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.CloseUtil */
public class CloseUtil {
    static {
        Covode.recordClassIndex(95503);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
