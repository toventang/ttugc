package com.p2082ss.android.ugc.aweme.shortvideo.p3793af;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.af.b */
public final class C69823b {
    static {
        Covode.recordClassIndex(82229);
    }

    /* renamed from: a */
    public static boolean m123387a(String str) {
        File externalFilesDir = C63247i.f143610a.getExternalFilesDir(null);
        File filesDir = C63247i.f143610a.getFilesDir();
        if (externalFilesDir != null && str.startsWith(externalFilesDir.getAbsolutePath())) {
            return true;
        }
        if (filesDir == null || !str.startsWith(filesDir.getAbsolutePath())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int[] m123389b(String str) {
        int[] iArr = new int[6];
        if (str == null) {
            iArr[0] = 1;
            return iArr;
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null) {
            iArr[0] = 1;
        } else {
            iArr[0] = 0;
            iArr[1] = videoFileInfo.duration;
            if (videoFileInfo.rotation == 90 || videoFileInfo.rotation == 270) {
                iArr[2] = videoFileInfo.height;
                iArr[3] = videoFileInfo.width;
            } else {
                iArr[2] = videoFileInfo.width;
                iArr[3] = videoFileInfo.height;
            }
            iArr[4] = 80;
            iArr[5] = (videoFileInfo.height * iArr[4]) / videoFileInfo.width;
        }
        return iArr;
    }

    /* renamed from: a */
    public static boolean m123388a(String str, Context context) {
        if (str == null || m123387a(str)) {
            return C80720e.m139927b(str);
        }
        return m123386a(context, Uri.parse(str));
    }

    /* renamed from: a */
    public static boolean m123386a(Context context, Uri uri) {
        MethodCollector.m26663i(1148);
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
                MethodCollector.m26664o(1148);
                return true;
            }
            MethodCollector.m26664o(1148);
            return false;
        } catch (Exception e) {
            C84911q.m145926b("media uri legal error: " + e.toString());
            MethodCollector.m26664o(1148);
            return false;
        }
    }
}
