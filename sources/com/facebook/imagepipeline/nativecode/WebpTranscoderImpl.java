package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1840l.C24138c;
import com.facebook.p1870h.C24313b;
import com.facebook.p1870h.C24314c;
import java.io.InputStream;
import java.io.OutputStream;

public class WebpTranscoderImpl implements AbstractC24633c {
    static {
        Covode.recordClassIndex(28780);
    }

    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i);

    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream);

    @Override // com.facebook.imagepipeline.nativecode.AbstractC24633c
    public boolean isWebpNativelySupported(C24314c cVar) {
        if (cVar == C24313b.f57656f) {
            int i = Build.VERSION.SDK_INT;
            return true;
        } else if (cVar == C24313b.f57657g || cVar == C24313b.f57658h || cVar == C24313b.f57659i) {
            return C24138c.f57084c;
        } else {
            if (cVar == C24313b.f57660j) {
                return false;
            }
            throw new IllegalArgumentException("Image format is not a WebP.");
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.AbstractC24633c
    public void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(7292);
        C24632b.m47148a();
        nativeTranscodeWebpToPng((InputStream) C24091i.m45617a(inputStream), (OutputStream) C24091i.m45617a(outputStream));
        MethodCollector.m26664o(7292);
    }

    @Override // com.facebook.imagepipeline.nativecode.AbstractC24633c
    public void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) {
        MethodCollector.m26663i(7149);
        C24632b.m47148a();
        nativeTranscodeWebpToJpeg((InputStream) C24091i.m45617a(inputStream), (OutputStream) C24091i.m45617a(outputStream), i);
        MethodCollector.m26664o(7149);
    }
}
