package com.p2082ss.avframework.livestreamv2.utils;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.TextureBufferImpl;
import com.p2082ss.avframework.buffer.VideoFrame;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.ss.avframework.livestreamv2.utils.DebugHelper */
public class DebugHelper {
    static {
        Covode.recordClassIndex(100618);
    }

    public static Bitmap convertFrameVideoFrame(VideoFrame videoFrame) {
        boolean z;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (!(buffer instanceof TextureBufferImpl)) {
            return null;
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) buffer;
        int textureId = textureBufferImpl.getTextureId();
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (textureBufferImpl.getType() == VideoFrame.TextureBuffer.Type.OES) {
            z = true;
        } else {
            z = false;
        }
        return convertFromTexture(textureId, rotatedWidth, rotatedHeight, z);
    }

    public static boolean writeToFile(VideoFrame.I420Buffer i420Buffer, String str) {
        MethodCollector.m26663i(3067);
        try {
            FileChannel channel = new FileOutputStream(new File("/sdcard/" + str + ".yuv"), false).getChannel();
            channel.write(i420Buffer.getDataY());
            channel.write(i420Buffer.getDataU());
            channel.write(i420Buffer.getDataV());
            channel.close();
            MethodCollector.m26664o(3067);
            return true;
        } catch (IOException unused) {
            MethodCollector.m26664o(3067);
            return false;
        }
    }

    public static Bitmap convertFromTexture(int i, int i2, int i3, boolean z) {
        int i4;
        MethodCollector.m26663i(2935);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
        allocateDirect.clear();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i5 = iArr[0];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, IntBuffer.wrap(iArr2));
        int i6 = iArr2[0];
        GLES20.glBindFramebuffer(36160, i5);
        int i7 = 3553;
        if (z) {
            i4 = 36197;
        } else {
            i4 = 3553;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, i4, i, 0);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, allocateDirect);
        if (z) {
            i7 = 36197;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, i7, 0, 0);
        GLES20.glBindFramebuffer(36160, i6);
        allocateDirect.clear();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        MethodCollector.m26664o(2935);
        return createBitmap;
    }
}
