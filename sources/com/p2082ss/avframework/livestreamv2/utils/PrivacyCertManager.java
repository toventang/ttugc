package com.p2082ss.avframework.livestreamv2.utils;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.TECameraCapture;
import com.p2082ss.avframework.utils.AVLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.avframework.livestreamv2.utils.PrivacyCertManager */
public class PrivacyCertManager {
    private static int classAvailable = -1;
    public static Class<?> clazzPrivacyCert;
    public static String dataTypeAudio;
    public static String dataTypeVideo;
    private static PrivacyCertManager instance;
    public static Method methodCheckCert;
    private static Method methodConnect;
    private static Method methodDisconnect;
    private static Method methodSwitchCamera;
    private ThreadLocal<CertUnit>[] certList = new ThreadLocal[2];
    private final Object certListFence = new Object();

    /* renamed from: com_ss_avframework_livestreamv2_utils_PrivacyCertManager_java_lang_reflect_Method_invoke */
    private static Object m147790x6057f590(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_avframework_livestreamv2_utils_PrivacyCertManager_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_avframework_livestreamv2_utils_PrivacyCertManager_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: com.ss.avframework.livestreamv2.utils.PrivacyCertManager$CertUnit */
    public static class CertUnit {
        private static int isPrivacyCertAvailable = -1;
        public Object cert;
        public int certType;
        public String methodName;

        /* renamed from: com_ss_avframework_livestreamv2_utils_PrivacyCertManager$CertUnit_java_lang_reflect_Method_invoke */
        private static Object m147791x57cfdd1e(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_avframework_livestreamv2_utils_PrivacyCertManager$CertUnit_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_avframework_livestreamv2_utils_PrivacyCertManager$CertUnit_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        static {
            Covode.recordClassIndex(100625);
        }

        public void check() {
            int i = isPrivacyCertAvailable;
            if (i != 0) {
                if (i == -1) {
                    try {
                        Class<?> cls = Class.forName("com.bytedance.bpea.entry.auth.privacy.PrivacyCertAuthEntry");
                        if (PrivacyCertManager.clazzPrivacyCert == null) {
                            PrivacyCertManager.clazzPrivacyCert = Class.forName("com.bytedance.bpea.basics.PrivacyCert");
                        }
                        if (PrivacyCertManager.methodCheckCert == null) {
                            PrivacyCertManager.methodCheckCert = cls.getMethod("checkSDKCert", PrivacyCertManager.clazzPrivacyCert, String[].class, String.class, String.class);
                        }
                        if (PrivacyCertManager.dataTypeAudio == null || PrivacyCertManager.dataTypeVideo == null) {
                            Class<?> cls2 = Class.forName("com.bytedance.bpea.entry.common.DataType");
                            Field declaredField = cls2.getDeclaredField("AUDIO");
                            Field declaredField2 = cls2.getDeclaredField("VIDEO");
                            PrivacyCertManager.dataTypeAudio = (String) declaredField.get(cls2);
                            PrivacyCertManager.dataTypeVideo = (String) declaredField2.get(cls2);
                        }
                        isPrivacyCertAvailable = 1;
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        isPrivacyCertAvailable = 0;
                    } catch (NoSuchMethodException e2) {
                        e2.printStackTrace();
                        isPrivacyCertAvailable = 0;
                    }
                }
                String dataType = getDataType(this.certType);
                if (isPrivacyCertAvailable > 0 && PrivacyCertManager.methodCheckCert != null && dataType != null) {
                    if (this.cert == null || PrivacyCertManager.clazzPrivacyCert.isInstance(this.cert)) {
                        AVLog.ioi("PrivacyCertManager", "checkSDKCert(" + this.cert + ", \"" + dataType + "\", \"LiveCore\", \"" + this.methodName + "\")");
                        m147791x57cfdd1e(PrivacyCertManager.methodCheckCert, null, new Object[]{this.cert, new String[]{dataType}, "LiveCore", this.methodName});
                    }
                }
            }
        }

        private String getDataType(int i) {
            if (i == 0) {
                return PrivacyCertManager.dataTypeVideo;
            }
            if (i != 1) {
                return null;
            }
            return PrivacyCertManager.dataTypeAudio;
        }

        public CertUnit(int i, Object obj, String str) {
            this.certType = i;
            this.cert = obj;
            this.methodName = str;
        }
    }

    static {
        Covode.recordClassIndex(100624);
    }

    public static synchronized PrivacyCertManager getInstance() {
        PrivacyCertManager privacyCertManager;
        synchronized (PrivacyCertManager.class) {
            MethodCollector.m26663i(2926);
            if (instance == null) {
                instance = new PrivacyCertManager();
            }
            privacyCertManager = instance;
            MethodCollector.m26664o(2926);
        }
        return privacyCertManager;
    }

    /* renamed from: com.ss.avframework.livestreamv2.utils.PrivacyCertManager$RunnableWithCert */
    public static class RunnableWithCert implements Runnable {
        private HashMap<Integer, CertUnit> certMap = new HashMap<>();
        private Runnable runnable;

        static {
            Covode.recordClassIndex(100626);
        }

        public void run() {
            for (Map.Entry<Integer, CertUnit> entry : this.certMap.entrySet()) {
                PrivacyCertManager.getInstance().saveCert(entry.getKey().intValue(), entry.getValue());
            }
            Runnable runnable2 = this.runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
            for (Integer num : this.certMap.keySet()) {
                PrivacyCertManager.getInstance().popCert(num.intValue());
            }
        }

        public RunnableWithCert(Runnable runnable2, int[] iArr) {
            this.runnable = runnable2;
            for (int i : iArr) {
                if (i >= 0 && i < 2) {
                    this.certMap.put(Integer.valueOf(i), PrivacyCertManager.getInstance().popCert(i));
                }
            }
        }
    }

    private static void getClasses() {
        try {
            if (classAvailable == -1) {
                if (clazzPrivacyCert == null) {
                    clazzPrivacyCert = Class.forName("com.bytedance.bpea.basics.PrivacyCert");
                }
                if (methodConnect == null) {
                    methodConnect = TECameraCapture.class.getMethod("connect", C30933l.class, clazzPrivacyCert);
                }
                if (methodDisconnect == null) {
                    methodDisconnect = TECameraCapture.class.getMethod("disConnect", clazzPrivacyCert);
                }
                if (methodSwitchCamera == null) {
                    methodSwitchCamera = TECameraCapture.class.getMethod("switchCamera", Integer.TYPE, clazzPrivacyCert);
                }
                classAvailable = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            classAvailable = 0;
        }
    }

    public CertUnit popCert(int i) {
        MethodCollector.m26663i(3061);
        CertUnit certUnit = null;
        if (i < 0 || i >= 2) {
            MethodCollector.m26664o(3061);
            return null;
        }
        synchronized (this.certListFence) {
            try {
                ThreadLocal<CertUnit>[] threadLocalArr = this.certList;
                if (threadLocalArr[i] != null) {
                    this.certList[i].set(null);
                    certUnit = threadLocalArr[i].get();
                }
            } finally {
                MethodCollector.m26664o(3061);
            }
        }
        return certUnit;
    }

    public static void cameraDisconnectWithCert(TECameraCapture tECameraCapture) {
        CertUnit popCert = getInstance().popCert(0);
        if (popCert != null) {
            getClasses();
            try {
                if (classAvailable > 0 && (popCert.cert == null || clazzPrivacyCert.isInstance(popCert.cert))) {
                    AVLog.ioi("PrivacyCertManager", "TECameraCapture.disConnect with PrivacyCert");
                    m147790x6057f590(methodDisconnect, tECameraCapture, new Object[]{popCert.cert});
                    return;
                }
            } catch (Exception e) {
                AVLog.logToIODevice(6, "PrivacyCertManager", "cameraDisconnectWithCert failed", e);
                AVLog.logKibana(6, "PrivacyCertManager", "cameraDisconnectWithCert failed", e);
            }
        }
        tECameraCapture.disConnect();
    }

    public static int cameraConnectWithCert(TECameraCapture tECameraCapture, C30933l lVar) {
        CertUnit popCert = getInstance().popCert(0);
        if (popCert != null) {
            getClasses();
            try {
                if (classAvailable > 0 && (popCert.cert == null || clazzPrivacyCert.isInstance(popCert.cert))) {
                    AVLog.ioi("PrivacyCertManager", "TECameraCapture.connect with PrivacyCert");
                    return ((Integer) m147790x6057f590(methodConnect, tECameraCapture, new Object[]{lVar, popCert.cert})).intValue();
                }
            } catch (Exception e) {
                AVLog.logToIODevice(6, "PrivacyCertManager", "cameraConnectWithCert failed", e);
                AVLog.logKibana(6, "PrivacyCertManager", "cameraConnectWithCert failed", e);
                return -1128616532;
            }
        }
        return tECameraCapture.connect(lVar);
    }

    public static void switchCameraWithCert(TECameraCapture tECameraCapture, int i) {
        CertUnit popCert = getInstance().popCert(0);
        if (popCert != null) {
            getClasses();
            try {
                if (classAvailable > 0 && (popCert.cert == null || clazzPrivacyCert.isInstance(popCert.cert))) {
                    AVLog.ioi("PrivacyCertManager", "TECameraCapture.switchCamera with PrivacyCert");
                    m147790x6057f590(methodSwitchCamera, tECameraCapture, new Object[]{Integer.valueOf(i), popCert.cert});
                    return;
                }
            } catch (Exception e) {
                AVLog.logToIODevice(6, "PrivacyCertManager", "switchCameraWithCert failed", e);
                AVLog.logKibana(6, "PrivacyCertManager", "switchCameraWithCert failed", e);
                return;
            }
        }
        tECameraCapture.switchCamera(i);
    }

    public void saveCert(int i, CertUnit certUnit) {
        MethodCollector.m26663i(3057);
        if (i < 0 || i >= 2) {
            MethodCollector.m26664o(3057);
            return;
        }
        synchronized (this.certListFence) {
            try {
                ThreadLocal<CertUnit>[] threadLocalArr = this.certList;
                if (!(threadLocalArr[i] == null || threadLocalArr[i].get() == null)) {
                    AVLog.ioe("PrivacyCertManager", "save cert while it's not emptied before.");
                    AVLog.logKibana(6, "PrivacyCertManager", "save cert while it's not emptied before.", new Throwable());
                }
                ThreadLocal<CertUnit>[] threadLocalArr2 = this.certList;
                if (threadLocalArr2[i] == null) {
                    threadLocalArr2[i] = new ThreadLocal<>();
                }
                this.certList[i].set(certUnit);
            } finally {
                MethodCollector.m26664o(3057);
            }
        }
    }

    public void saveCert(int i, Object obj, String str) {
        saveCert(i, new CertUnit(i, obj, str));
    }
}
