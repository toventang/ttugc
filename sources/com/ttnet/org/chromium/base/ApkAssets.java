package com.ttnet.org.chromium.base;

import android.content.res.AssetFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;

public class ApkAssets {
    static {
        Covode.recordClassIndex(103323);
    }

    public static long[] open(String str) {
        MethodCollector.m26663i(3349);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = C87445c.f198342a.getAssets().openNonAssetFd(str);
            long[] jArr = {(long) assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            MethodCollector.m26664o(3349);
            return jArr;
        } catch (IOException e) {
            if (!e.getMessage().equals("")) {
                e.getMessage().equals(str);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused2) {
                }
            }
            MethodCollector.m26664o(3349);
            return jArr2;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            MethodCollector.m26664o(3349);
            throw th;
        }
    }
}
