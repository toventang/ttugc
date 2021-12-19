package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.AbstractC85305ac;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.ss.android.ttve.nativePort.TEVideoUtilsCallback */
public class TEVideoUtilsCallback {
    private AbstractC85305ac frameDataListener;
    private AbstractC85304ab frameListener;

    static {
        Covode.recordClassIndex(37315);
    }

    public AbstractC85304ab getFrameAvailableListener() {
        return this.frameListener;
    }

    public void setFrameDataListener(Object obj) {
        this.frameDataListener = (AbstractC85305ac) obj;
    }

    public void setListener(Object obj) {
        this.frameListener = (AbstractC85304ab) obj;
    }

    public static ByteBuffer allocateBuffer(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static ByteBuffer allocateFrame(int i, int i2) {
        return ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.LITTLE_ENDIAN);
    }

    public boolean onFrameAvailable(ByteBuffer byteBuffer, int i, int i2, int i3) {
        AbstractC85304ab abVar = this.frameListener;
        if (abVar == null || !abVar.processFrame(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        AbstractC85304ab abVar;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (abVar = tEVideoUtilsCallback.frameListener) == null || !abVar.processFrame(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable2(Object obj, byte[] bArr, int i, int i2, int i3) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        AbstractC85304ab abVar;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (abVar = tEVideoUtilsCallback.frameListener) == null || !abVar.processFrame(ByteBuffer.wrap(bArr), i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameDataAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback;
        AbstractC85305ac acVar;
        if (!(obj instanceof TEVideoUtilsCallback) || (tEVideoUtilsCallback = (TEVideoUtilsCallback) obj) == null || (acVar = tEVideoUtilsCallback.frameDataListener) == null || !acVar.mo130625a()) {
            return false;
        }
        return true;
    }
}
