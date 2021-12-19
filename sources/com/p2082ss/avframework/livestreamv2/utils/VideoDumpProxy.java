package com.p2082ss.avframework.livestreamv2.utils;

import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.utils.VideoDumpProxy */
public class VideoDumpProxy {
    public static Class<?> classRawVideoDumper;
    private static Constructor<?> constructorLiveCoreVideoDump;
    private static Constructor<?> constructorLiveStreamVideoDump;
    public static Constructor<?> constructorRawVideoDumper;
    public static String currentVideoSourceName;
    private static int isLiveCoreVideoDumpAvailable = -1;
    private static int isLiveStreamVideoDumpAvailable = -1;
    public static int isRawVideoDumperAvailable = -1;
    public static Method methodCheckFrameCount;
    public static Method methodOnTextureFrame;
    public static Method methodOnYuvFrame;
    public static Method methodRelease;
    public static Method methodUpdateDumpFile;
    public static final List<RawVideoDumperProxy> rawVideoDumperList = new ArrayList();

    /* renamed from: com.ss.avframework.livestreamv2.utils.VideoDumpProxy$1 */
    static /* synthetic */ class C860211 {
        static {
            Covode.recordClassIndex(100631);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.utils.VideoDumpProxy$VideoDumpEventListener */
    public interface VideoDumpEventListener {
        static {
            Covode.recordClassIndex(100633);
        }

        void onInfo(int i, Object... objArr);
    }

    /* renamed from: com.ss.avframework.livestreamv2.utils.VideoDumpProxy$VideoDumpEventListenerImpl */
    static class VideoDumpEventListenerImpl implements VideoDumpEventListener {
        static {
            Covode.recordClassIndex(100634);
        }

        private VideoDumpEventListenerImpl() {
        }

        /* synthetic */ VideoDumpEventListenerImpl(C860211 r1) {
            this();
        }

        @Override // com.p2082ss.avframework.livestreamv2.utils.VideoDumpProxy.VideoDumpEventListener
        public void onInfo(int i, Object... objArr) {
            MethodCollector.m26663i(2647);
            if (i == 0) {
                String str = null;
                String str2 = (String) objArr[0];
                if (str2 != null) {
                    try {
                        str = str2.substring(str2.lastIndexOf(47) + 1, str2.lastIndexOf(46));
                    } catch (Exception unused) {
                        str = str2;
                    }
                    Matcher matcher = Pattern.compile("_*\\d+x\\d+[x_]\\d+").matcher(str);
                    if (matcher.find()) {
                        str = str.substring(0, matcher.start());
                    }
                }
                VideoDumpProxy.currentVideoSourceName = str;
                synchronized (VideoDumpProxy.rawVideoDumperList) {
                    try {
                        for (RawVideoDumperProxy rawVideoDumperProxy : VideoDumpProxy.rawVideoDumperList) {
                            rawVideoDumperProxy.updateDumpFile(str);
                        }
                    } finally {
                        MethodCollector.m26664o(2647);
                    }
                }
            } else if (i == 1) {
                synchronized (VideoDumpProxy.rawVideoDumperList) {
                    try {
                        for (RawVideoDumperProxy rawVideoDumperProxy2 : VideoDumpProxy.rawVideoDumperList) {
                            rawVideoDumperProxy2.onVideoDumpParamsChange((JSONObject) objArr[0]);
                        }
                    } finally {
                        MethodCollector.m26664o(2647);
                    }
                }
            } else {
                MethodCollector.m26664o(2647);
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.utils.VideoDumpProxy$RawVideoDumperProxy */
    public static class RawVideoDumperProxy {
        private String mParamKey;
        private Object mRawVideoDumper;

        static {
            Covode.recordClassIndex(100632);
        }

        /* renamed from: com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke */
        private static Object m147792x306035c4(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        private boolean isValid() {
            if (VideoDumpProxy.isRawVideoDumperAvailable != 1 || this.mRawVideoDumper == null) {
                return false;
            }
            return true;
        }

        public void release() {
            MethodCollector.m26663i(2397);
            synchronized (VideoDumpProxy.rawVideoDumperList) {
                try {
                    VideoDumpProxy.rawVideoDumperList.remove(this);
                } catch (Throwable th) {
                    MethodCollector.m26664o(2397);
                    throw th;
                }
            }
            releaseRawVideoDumper();
            MethodCollector.m26664o(2397);
        }

        private void releaseRawVideoDumper() {
            if (isValid()) {
                Object obj = this.mRawVideoDumper;
                this.mRawVideoDumper = null;
                try {
                    if (VideoDumpProxy.methodRelease == null) {
                        VideoDumpProxy.methodRelease = VideoDumpProxy.classRawVideoDumper.getMethod("release", new Class[0]);
                    }
                    m147792x306035c4(VideoDumpProxy.methodRelease, obj, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public boolean checkFrameCount() {
            if (!isValid()) {
                return false;
            }
            try {
                if (VideoDumpProxy.methodCheckFrameCount == null) {
                    VideoDumpProxy.methodCheckFrameCount = VideoDumpProxy.classRawVideoDumper.getMethod("checkFrameCount", new Class[0]);
                }
                Boolean bool = (Boolean) m147792x306035c4(VideoDumpProxy.methodCheckFrameCount, this.mRawVideoDumper, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: package-private */
        public void onVideoDumpParamsChange(JSONObject jSONObject) {
            releaseRawVideoDumper();
            if (jSONObject != null && !jSONObject.isNull(this.mParamKey)) {
                createRawVideoDumper(jSONObject.optJSONObject(this.mParamKey));
            }
        }

        /* access modifiers changed from: package-private */
        public void updateDumpFile(String str) {
            if (isValid()) {
                try {
                    if (VideoDumpProxy.methodUpdateDumpFile == null) {
                        VideoDumpProxy.methodUpdateDumpFile = VideoDumpProxy.classRawVideoDumper.getMethod("updateDumpFile", String.class);
                    }
                    m147792x306035c4(VideoDumpProxy.methodUpdateDumpFile, this.mRawVideoDumper, new Object[]{str});
                } catch (Exception unused) {
                }
            }
        }

        private void createRawVideoDumper(JSONObject jSONObject) {
            if (VideoDumpProxy.isRawVideoDumperAvailable == -1) {
                try {
                    Class<?> cls = Class.forName("com.ss.avframework.livestreamv2.utils.VideoDumpDebug.RawVideoDumper");
                    VideoDumpProxy.classRawVideoDumper = cls;
                    VideoDumpProxy.constructorRawVideoDumper = cls.getConstructor(Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE);
                    VideoDumpProxy.isRawVideoDumperAvailable = 1;
                } catch (Exception unused) {
                    VideoDumpProxy.isRawVideoDumperAvailable = 0;
                }
            }
            if (VideoDumpProxy.isRawVideoDumperAvailable == 1) {
                try {
                    int optInt = jSONObject.optInt("startFrameCount");
                    int optInt2 = jSONObject.optInt("dumpFrameCount");
                    String optString = jSONObject.optString("dumpSaveDir");
                    boolean optBoolean = jSONObject.optBoolean("exclusiveFileName");
                    if (optInt >= 0 && optInt2 > 0 && !TextUtils.isEmpty(optString)) {
                        this.mRawVideoDumper = VideoDumpProxy.constructorRawVideoDumper.newInstance(Integer.valueOf(optInt), Integer.valueOf(optInt2), optString, Boolean.valueOf(optBoolean));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                updateDumpFile(VideoDumpProxy.currentVideoSourceName);
            }
        }

        public RawVideoDumperProxy(JSONObject jSONObject, String str) {
            MethodCollector.m26663i(1953);
            synchronized (VideoDumpProxy.rawVideoDumperList) {
                try {
                    VideoDumpProxy.rawVideoDumperList.add(this);
                } catch (Throwable th) {
                    MethodCollector.m26664o(1953);
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                this.mParamKey = str;
                createRawVideoDumper(jSONObject.optJSONObject(str));
                MethodCollector.m26664o(1953);
                return;
            }
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("param key is null");
            MethodCollector.m26664o(1953);
            throw androidRuntimeException;
        }

        public void onYuvFrame(ByteBuffer byteBuffer, int i, int i2, int i3, String str) {
            if (isValid()) {
                try {
                    if (VideoDumpProxy.methodOnYuvFrame == null) {
                        VideoDumpProxy.methodOnYuvFrame = VideoDumpProxy.classRawVideoDumper.getMethod("onYuvFrame", ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class);
                    }
                    m147792x306035c4(VideoDumpProxy.methodOnYuvFrame, this.mRawVideoDumper, new Object[]{byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str});
                } catch (Exception unused) {
                }
            }
        }

        public void onTextureFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, String str) {
            if (isValid()) {
                try {
                    if (VideoDumpProxy.methodOnTextureFrame == null) {
                        VideoDumpProxy.methodOnTextureFrame = VideoDumpProxy.classRawVideoDumper.getMethod("onTextureFrame", Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, float[].class, String.class);
                    }
                    Method method = VideoDumpProxy.methodOnTextureFrame;
                    try {
                        m147792x306035c4(method, this.mRawVideoDumper, new Object[]{Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fArr, str});
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        }

        public void onYuvFrame(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, String str) {
            if (isValid()) {
                try {
                    if (VideoDumpProxy.methodOnYuvFrame == null) {
                        VideoDumpProxy.methodOnYuvFrame = VideoDumpProxy.classRawVideoDumper.getMethod("onYuvFrame", ByteBuffer.class, Integer.TYPE, ByteBuffer.class, Integer.TYPE, ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class);
                    }
                    Method method = VideoDumpProxy.methodOnYuvFrame;
                    try {
                        m147792x306035c4(method, this.mRawVideoDumper, new Object[]{byteBuffer, Integer.valueOf(i), byteBuffer2, Integer.valueOf(i2), byteBuffer3, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str});
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(100630);
    }

    public static LiveCore createLiveCoreVideoDumpInstance(LiveCore.Builder builder) {
        if (isLiveCoreVideoDumpAvailable == -1) {
            try {
                constructorLiveCoreVideoDump = Class.forName("com.ss.avframework.livestreamv2.utils.VideoDumpDebug.LiveCoreVideoDump").getConstructor(LiveCore.Builder.class);
                isLiveCoreVideoDumpAvailable = 1;
            } catch (Exception unused) {
                isLiveCoreVideoDumpAvailable = 0;
            }
        }
        if (isLiveCoreVideoDumpAvailable != 1) {
            return null;
        }
        try {
            return (LiveCore) constructorLiveCoreVideoDump.newInstance(builder);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ILiveStream createLiveStreamVideoDumpInstance(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
        if (isLiveStreamVideoDumpAvailable == -1) {
            try {
                constructorLiveStreamVideoDump = Class.forName("com.ss.avframework.livestreamv2.utils.VideoDumpDebug.LiveStreamVideoDump").getConstructor(LiveStreamBuilder.class, Handler.class, Handler.class, AudioDeviceModule.class, IVideoEffectProcessor.class, VideoDumpEventListener.class);
                isLiveStreamVideoDumpAvailable = 1;
            } catch (Exception unused) {
                isLiveStreamVideoDumpAvailable = 0;
            }
        }
        if (isLiveStreamVideoDumpAvailable != 1) {
            return null;
        }
        try {
            VideoDumpEventListenerImpl videoDumpEventListenerImpl = new VideoDumpEventListenerImpl(null);
            return (ILiveStream) constructorLiveStreamVideoDump.newInstance(liveStreamBuilder, handler, handler2, audioDeviceModule, iVideoEffectProcessor, videoDumpEventListenerImpl);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
