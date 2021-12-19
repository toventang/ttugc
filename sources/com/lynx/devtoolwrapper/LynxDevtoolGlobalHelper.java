package com.lynx.devtoolwrapper;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LynxDevtoolGlobalHelper {
    private Object bridge;
    private Method enableTelemetryDebug;
    private Map<String, String> mAppInfo;
    private Context mContext;
    private Method prepareRemoteDebug;
    private Method registerCardListener;
    private boolean remoteDebugAvailable;
    private Method setAppInfo;
    private Method setContext;
    private Method shouldPrepareRemoteDebug;
    private Method showDebugView;
    private boolean telemetryAvailable;

    /* renamed from: com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper$1 */
    static /* synthetic */ class C283281 {
        static {
            Covode.recordClassIndex(34287);
        }
    }

    static {
        Covode.recordClassIndex(34286);
    }

    /* renamed from: com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke */
    private static Object m56640x2413ee19(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static LynxDevtoolGlobalHelper getInstance() {
        return C28329a.f66532a;
    }

    public boolean isRemoteDebugAvailable() {
        return this.remoteDebugAvailable;
    }

    public boolean isTelemetryAvailable() {
        return this.telemetryAvailable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper$a */
    public static class C28329a {

        /* renamed from: a */
        public static final LynxDevtoolGlobalHelper f66532a = new LynxDevtoolGlobalHelper(null);

        static {
            Covode.recordClassIndex(34288);
        }
    }

    private LynxDevtoolGlobalHelper() {
        HashMap hashMap = new HashMap();
        this.mAppInfo = hashMap;
        LynxEnv.m56706b();
        hashMap.put("sdkVersion", "2.1.5-rc.22-cxxshared");
        initTelemetry();
    }

    private void initTelemetry() {
        try {
            this.enableTelemetryDebug = Class.forName("com.lynx.devtool.helper.TelemetryConnector").getMethod("enableTelemetryDebug", new Class[0]);
            this.telemetryAvailable = true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }

    public void enableTelemetryDebug() {
        if (this.telemetryAvailable) {
            try {
                m56640x2413ee19(this.enableTelemetryDebug, null, new Object[0]);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    private boolean initRemoteDebugIfNecessary() {
        if (!LynxEnv.m56706b().mo48573f()) {
            Context context = this.mContext;
            if (context != null) {
                m56639x706d80e6(Toast.makeText(context, "Lynx initialization not finished!", 0));
            }
            LLog.m56856a(5, "LynxDevtoolGlobalHelper", "liblynx.so not loaded!");
            return false;
        } else if (this.remoteDebugAvailable) {
            return true;
        } else {
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxGlobalDebugBridge");
                Method method = cls.getMethod("getInstance", new Class[0]);
                this.shouldPrepareRemoteDebug = cls.getMethod("shouldPrepareRemoteDebug", String.class);
                this.prepareRemoteDebug = cls.getMethod("prepareRemoteDebug", String.class);
                this.setContext = cls.getMethod("setContext", Context.class);
                this.showDebugView = cls.getDeclaredMethod("showDebugView", ViewGroup.class);
                this.registerCardListener = cls.getDeclaredMethod("registerCardListener", AbstractC28335e.class);
                this.setAppInfo = cls.getDeclaredMethod("setAppInfo", Context.class, Map.class);
                this.bridge = method.invoke(null, new Object[0]);
                this.remoteDebugAvailable = true;
            } catch (ClassNotFoundException unused) {
                LLog.m56856a(5, "LynxDevtoolGlobalHelper", "Could not find LynxGlobalDebugBridge. Shall ignore this exception if expected.");
            } catch (NoSuchMethodException e) {
                LLog.m56856a(5, "LynxDevtoolGlobalHelper", e.toString());
            } catch (IllegalAccessException e2) {
                LLog.m56856a(5, "LynxDevtoolGlobalHelper", e2.toString());
            } catch (InvocationTargetException e3) {
                LLog.m56856a(5, "LynxDevtoolGlobalHelper", e3.toString());
            }
            return this.remoteDebugAvailable;
        }
    }

    /* synthetic */ LynxDevtoolGlobalHelper(C283281 r1) {
        this();
    }

    /* renamed from: com_lynx_devtoolwrapper_LynxDevtoolGlobalHelper_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_show */
    public static void m56639x706d80e6(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    public void registerCardListener(AbstractC28335e eVar) {
        if (initRemoteDebugIfNecessary()) {
            try {
                m56640x2413ee19(this.registerCardListener, this.bridge, new Object[]{eVar});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void showDebugView(ViewGroup viewGroup) {
        if (initRemoteDebugIfNecessary()) {
            try {
                m56640x2413ee19(this.showDebugView, this.bridge, new Object[]{viewGroup});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void setContext(Context context) {
        this.mContext = context;
        if (initRemoteDebugIfNecessary()) {
            try {
                m56640x2413ee19(this.setContext, this.bridge, new Object[]{context});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public boolean shouldPrepareRemoteDebug(String str) {
        if (!initRemoteDebugIfNecessary()) {
            return false;
        }
        try {
            return ((Boolean) m56640x2413ee19(this.shouldPrepareRemoteDebug, this.bridge, new Object[]{str})).booleanValue();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public boolean prepareRemoteDebug(String str) {
        if (!initRemoteDebugIfNecessary()) {
            return false;
        }
        if (!LynxEnv.m56706b().f66640g) {
            Context context = this.mContext;
            if (context != null) {
                m56639x706d80e6(Toast.makeText(context, "Debugging not supported in this package", 0));
            }
            LLog.m56856a(5, "LynxDevtoolGlobalHelper", "Debugging not supported in this package");
            return false;
        } else if (!LynxEnv.m56706b().mo48571d()) {
            Context context2 = this.mContext;
            if (context2 != null) {
                m56639x706d80e6(Toast.makeText(context2, "Devtool not enabled, turn on the switch!", 0));
            }
            LLog.m56856a(5, "LynxDevtoolGlobalHelper", "Devtool not enabled, turn on the switch!");
            return false;
        } else {
            setAppInfo(this.mContext, (Map<String, String>) null);
            try {
                return ((Boolean) m56640x2413ee19(this.prepareRemoteDebug, this.bridge, new Object[]{str})).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    public void setAppInfo(String str, String str2) {
        setAppInfo(null, str, str2);
    }

    public void setAppInfo(Context context, Map<String, String> map) {
        if (map != null) {
            this.mAppInfo.putAll(map);
        }
        if (initRemoteDebugIfNecessary()) {
            try {
                m56640x2413ee19(this.setAppInfo, this.bridge, new Object[]{context, this.mAppInfo});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void setAppInfo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("App", str);
        hashMap.put("AppVersion", str2);
        setAppInfo(context, hashMap);
    }
}
