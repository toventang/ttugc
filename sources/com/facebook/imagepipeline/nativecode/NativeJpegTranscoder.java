package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.common.p1832d.C24083b;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.C24610q;
import com.facebook.imagepipeline.p1892q.AbstractC24649b;
import com.facebook.imagepipeline.p1892q.C24648a;
import com.facebook.imagepipeline.p1892q.C24651d;
import com.facebook.imageutils.C24658b;
import com.facebook.p1870h.C24313b;
import com.facebook.p1870h.C24314c;
import java.io.InputStream;
import java.io.OutputStream;

public class NativeJpegTranscoder implements AbstractC24649b {
    private int mMaxBitmapSize;
    private boolean mResizingEnabled;
    private boolean mUseDownsamplingRatio;

    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @Override // com.facebook.imagepipeline.p1892q.AbstractC24649b
    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    static {
        Covode.recordClassIndex(28778);
        C24658b.m47175a("imagepipeline");
    }

    @Override // com.facebook.imagepipeline.p1892q.AbstractC24649b
    public boolean canTranscode(C24314c cVar) {
        if (cVar == C24313b.f57651a) {
            return true;
        }
        return false;
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
    }

    @Override // com.facebook.imagepipeline.p1892q.AbstractC24649b
    public boolean canResize(C24456e eVar, C24364e eVar2, C24363d dVar) {
        if (eVar2 == null) {
            eVar2 = C24364e.f57783b;
        }
        if (C24651d.m47159a(eVar2, dVar, eVar, this.mResizingEnabled) < 8) {
            return true;
        }
        return false;
    }

    public static void transcodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        MethodCollector.m26663i(6987);
        boolean z6 = true;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24091i.m45620a(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C24091i.m45620a(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C24091i.m45620a(z4);
        if (i < 0 || i > 270 || i % 90 != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        C24091i.m45620a(z5);
        if (i2 == 8 && i == 0) {
            z6 = false;
        }
        C24091i.m45621a(z6, "no transformation requested");
        nativeTranscodeJpeg((InputStream) C24091i.m45617a(inputStream), (OutputStream) C24091i.m45617a(outputStream), i, i2, i3);
        MethodCollector.m26664o(6987);
    }

    public static void transcodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        MethodCollector.m26663i(7142);
        boolean z6 = false;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24091i.m45620a(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C24091i.m45620a(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C24091i.m45620a(z4);
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                z5 = true;
                break;
            default:
                z5 = false;
                break;
        }
        C24091i.m45620a(z5);
        if (!(i2 == 8 && i == 1)) {
            z6 = true;
        }
        C24091i.m45621a(z6, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) C24091i.m45617a(inputStream), (OutputStream) C24091i.m45617a(outputStream), i, i2, i3);
        MethodCollector.m26664o(7142);
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.imagepipeline.p1892q.AbstractC24649b
    public C24648a transcode(C24456e eVar, OutputStream outputStream, C24364e eVar2, C24363d dVar, C24314c cVar, Integer num) {
        if (num == null) {
            num = 85;
        }
        if (eVar2 == null) {
            eVar2 = C24364e.f57783b;
        }
        int a = C24610q.m47101a(eVar2, dVar, eVar, this.mMaxBitmapSize);
        try {
            int a2 = C24651d.m47159a(eVar2, dVar, eVar, this.mResizingEnabled);
            int i = 1;
            int max = Math.max(1, 8 / a);
            if (this.mUseDownsamplingRatio) {
                a2 = max;
            }
            InputStream b = eVar.mo40301b();
            if (C24651d.f58569a.contains(Integer.valueOf(eVar.mo40306e()))) {
                transcodeJpegWithExifOrientation(b, outputStream, C24651d.m47162b(eVar2, eVar), a2, num.intValue());
            } else {
                transcodeJpeg(b, outputStream, C24651d.m47160a(eVar2, eVar), a2, num.intValue());
            }
            C24083b.m45600a(b);
            if (a != 1) {
                i = 0;
            }
            return new C24648a(i);
        } catch (Throwable th) {
            C24083b.m45600a((InputStream) null);
            throw th;
        }
    }
}
