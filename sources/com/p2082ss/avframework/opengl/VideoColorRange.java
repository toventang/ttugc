package com.p2082ss.avframework.opengl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.opengl.VideoColorRange */
public class VideoColorRange {
    private static int Rgb2YuvFormulaColorRange = -1;
    private static int Yuv2RgbFormulaColorRange = -1;

    private static native int nativeCheckYuv2RgbFormulaColorRange(int i);

    private static native int nativeCheckYuvFrameColorRange(ByteBuffer byteBuffer, int i, int i2);

    static {
        Covode.recordClassIndex(100673);
    }

    public static int checkRgb2YuvFormulaColorRange() {
        int i = Rgb2YuvFormulaColorRange;
        if (i != -1) {
            return i;
        }
        float[][] fArr = YuvConverter.RGB_TO_YUV_TRANSFORM_MATRIX;
        if (((fArr[0][0] * 1.0f) + (fArr[0][1] * 1.0f) + (fArr[0][2] * 1.0f) + fArr[0][3]) * 255.0f > 245.0f) {
            Rgb2YuvFormulaColorRange = 0;
        } else {
            Rgb2YuvFormulaColorRange = 1;
        }
        return Rgb2YuvFormulaColorRange;
    }

    public static int checkYuv2RgbFormulaColorRange(int i) {
        MethodCollector.m26663i(2014);
        if (Yuv2RgbFormulaColorRange == -1) {
            Yuv2RgbFormulaColorRange = nativeCheckYuv2RgbFormulaColorRange(i);
        }
        int i2 = Yuv2RgbFormulaColorRange;
        MethodCollector.m26664o(2014);
        return i2;
    }

    public static int checkYuvFrameColorRange(ByteBuffer byteBuffer, int i, int i2) {
        MethodCollector.m26663i(2013);
        if (byteBuffer == null || byteBuffer.capacity() < ((i * i2) * 3) / 2) {
            MethodCollector.m26664o(2013);
            return -1;
        }
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            allocateDirect.position(0);
            allocateDirect.put(byteBuffer);
            byteBuffer = allocateDirect;
        }
        int nativeCheckYuvFrameColorRange = nativeCheckYuvFrameColorRange(byteBuffer, i, i2);
        MethodCollector.m26664o(2013);
        return nativeCheckYuvFrameColorRange;
    }
}
