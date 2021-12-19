package com.p2082ss.avframework.transport;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.Transport;
import com.p2082ss.avframework.engine.VsyncModule;
import com.p2082ss.avframework.statics.StaticsReport;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.LibraryLoader;
import com.p2082ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.transport.LibRTMPTransport */
public class LibRTMPTransport extends NativeTransport {
    private VsyncModule mVsyncModule;

    static {
        Covode.recordClassIndex(100710);
    }

    private native int nativeAddSeiField(String str, Object obj, int i, long j, boolean z, boolean z2, int i2);

    private native void nativeAddUserMetaData(String str, String str2, int i);

    private native void nativeCreateNative(boolean z, boolean z2, String str);

    private native String nativeGetDnsIP();

    private native long nativeGetInt64Value(int i);

    private native String nativeGetLocalIP();

    private native String nativeGetRemoteIP();

    private native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private native void nativeInitRtsJniEnv(Context context);

    private native int nativeSendSeiMsg(String str);

    private native boolean nativeSetupUrl(String str);

    private native void nativeStartTransportInDebug();

    private native void nativeStopTransportInDebug();

    @Override // com.p2082ss.avframework.engine.Transport
    public VsyncModule getVsyncModule() {
        return this.mVsyncModule;
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public String getDnsIP() {
        MethodCollector.m26663i(3097);
        String nativeGetDnsIP = nativeGetDnsIP();
        MethodCollector.m26664o(3097);
        return nativeGetDnsIP;
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public String getLocalIP() {
        MethodCollector.m26663i(3092);
        String nativeGetLocalIP = nativeGetLocalIP();
        MethodCollector.m26664o(3092);
        return nativeGetLocalIP;
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public String getRemoteIP() {
        MethodCollector.m26663i(3087);
        String nativeGetRemoteIP = nativeGetRemoteIP();
        MethodCollector.m26664o(3087);
        return nativeGetRemoteIP;
    }

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(3256);
        VsyncModule vsyncModule = this.mVsyncModule;
        if (vsyncModule != null) {
            vsyncModule.release();
            this.mVsyncModule = null;
        }
        super.release();
        MethodCollector.m26664o(3256);
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public synchronized void startTransportInDebug() {
        MethodCollector.m26663i(3261);
        nativeStartTransportInDebug();
        MethodCollector.m26664o(3261);
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public synchronized void stopTransportInDebug() {
        MethodCollector.m26663i(3259);
        nativeStopTransportInDebug();
        MethodCollector.m26664o(3259);
    }

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public long getInt64Value(int i) {
        MethodCollector.m26663i(3198);
        long nativeGetInt64Value = nativeGetInt64Value(i);
        MethodCollector.m26664o(3198);
        return nativeGetInt64Value;
    }

    @Override // com.p2082ss.avframework.statics.StaticsReport.StaticReportInterface, com.p2082ss.avframework.engine.Transport
    public boolean getStaticsReport(StaticsReport staticsReport) {
        MethodCollector.m26663i(3083);
        super.getStaticsReport(staticsReport);
        boolean nativeGetStaticsReport = nativeGetStaticsReport(staticsReport);
        MethodCollector.m26664o(3083);
        return nativeGetStaticsReport;
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public int sendSeiMsg(String str) {
        MethodCollector.m26663i(3060);
        if (str == null) {
            MethodCollector.m26664o(3060);
            return -2;
        }
        int nativeSendSeiMsg = nativeSendSeiMsg(str);
        MethodCollector.m26664o(3060);
        return nativeSendSeiMsg;
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public synchronized void setVysncModule(VsyncModule vsyncModule) {
        MethodCollector.m26663i(3203);
        VsyncModule vsyncModule2 = this.mVsyncModule;
        if (vsyncModule2 != null) {
            vsyncModule2.release();
        }
        this.mVsyncModule = vsyncModule;
        MethodCollector.m26664o(3203);
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public boolean setupUrl(String str) {
        boolean z;
        String str2;
        MethodCollector.m26663i(3058);
        if (str != null) {
            z = nativeSetupUrl(str);
        } else {
            z = false;
        }
        AVLog.iod("LibRTMPTransport", "Setup url ".concat(String.valueOf(str)));
        TEBundle parameter = getParameter();
        StringBuilder sb = new StringBuilder("config:");
        if (parameter != null) {
            str2 = parameter.toString();
        } else {
            str2 = "null";
        }
        AVLog.iod("LibRTMPTransport", sb.append(str2).toString());
        MethodCollector.m26664o(3058);
        return z;
    }

    @Override // com.p2082ss.avframework.transport.NativeTransport, com.p2082ss.avframework.engine.Transport
    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i) {
        super.sendPacket(buffer, i);
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public int addSeiField(String str, Object obj, int i) {
        return addSeiField(str, obj, i, 0, true, true);
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public void addUserMetaData(String str, String str2, int i) {
        MethodCollector.m26663i(3079);
        nativeAddUserMetaData(str, str2, i);
        MethodCollector.m26664o(3079);
    }

    public LibRTMPTransport(boolean z, boolean z2, boolean z3) {
        MethodCollector.m26663i(3048);
        String str = "LibRTMPTransport";
        if (z3) {
            try {
                boolean loadLibrary = LibraryLoader.loadLibrary("volcenginertc");
                AVLog.ioi(str, "RtcNativeLibraryLoader load(" + "volcenginertc" + "): " + loadLibrary);
                if (loadLibrary) {
                    nativeInitRtsJniEnv(ContextUtils.getApplicationContext());
                    str = "RTSTransport";
                }
            } catch (Exception e) {
                AVLog.logToIODevice(6, str, "RtcNativeLibraryLoader load(" + "volcenginertc" + ") error", e);
            }
        }
        nativeCreateNative(z, z2, str);
        MethodCollector.m26663i(3048);
        MethodCollector.m26664o(3048);
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2) {
        return addSeiField(str, obj, i, j, z, z2, 0);
    }

    @Override // com.p2082ss.avframework.engine.Transport
    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2, int i2) {
        MethodCollector.m26663i(3077);
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (!byteBuffer.isDirect() || byteBuffer.remaining() != byteBuffer.capacity()) {
                AVLog.ioe("LibRTMPTransport", "A DirectByteBuffer is needed and its remaining size should equals to its capacity.");
                MethodCollector.m26664o(3077);
                return -1;
            }
        } else if (str == null || str.isEmpty()) {
            AVLog.logToIODevice2(6, "LibRTMPTransport", "When value is not a ByteBuffer, a valid key should be specified.", null, "LibRTMPTransport.java::addSeiField", 10000);
            MethodCollector.m26664o(3077);
            return -2;
        } else if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
            AVLog.ioe("LibRTMPTransport", "Unsupported value type: " + obj.getClass().getName());
            MethodCollector.m26664o(3077);
            return -3;
        } else if ((i2 & 1 & 1) > 0 && !(obj instanceof JSONObject)) {
            AVLog.ioe("LibRTMPTransport", "value type must be JSONObject when seiFlag is:1");
            MethodCollector.m26664o(3077);
            return -4;
        }
        int nativeAddSeiField = nativeAddSeiField(str, obj, i, j, z, z2, i2);
        MethodCollector.m26664o(3077);
        return nativeAddSeiField;
    }
}
