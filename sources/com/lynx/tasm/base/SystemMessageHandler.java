package com.lynx.tasm.base;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SystemMessageHandler extends Handler {

    /* renamed from: a */
    private long f66916a;

    /* renamed from: b */
    private boolean f66917b = true;

    /* renamed from: c */
    private Method f66918c;

    /* renamed from: d */
    private boolean f66919d;

    static {
        Covode.recordClassIndex(34443);
    }

    private native void nativeRunWork(long j);

    private void stop() {
        this.f66917b = false;
    }

    private void scheduleWork() {
        sendMessage(m56863a());
    }

    /* renamed from: a */
    private Message m56863a() {
        Message obtain = Message.obtain();
        obtain.what = 1;
        if (Build.VERSION.SDK_INT >= 22) {
            obtain.setAsynchronous(true);
        } else {
            if (!this.f66919d) {
                if (Build.VERSION.SDK_INT < 22) {
                    try {
                        this.f66918c = Class.forName("android.os.Message").getMethod("setAsynchronous", Boolean.TYPE);
                    } catch (ClassNotFoundException e) {
                        LLog.m56856a(6, "SystemMessageHandler", "Failed to find android.os.Message class:".concat(String.valueOf(e)));
                    } catch (NoSuchMethodException e2) {
                        LLog.m56856a(6, "SystemMessageHandler", "Failed to load Message.setAsynchronous method:".concat(String.valueOf(e2)));
                    } catch (RuntimeException e3) {
                        LLog.m56856a(6, "SystemMessageHandler", "Exception while loading Message.setAsynchronous method: ".concat(String.valueOf(e3)));
                    }
                }
                this.f66919d = true;
            }
            Method method = this.f66918c;
            if (method != null) {
                try {
                    Object[] objArr = {true};
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obtain, objArr}, 110000, "java.lang.Object", true, "com_lynx_tasm_base_SystemMessageHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        Object obj = a.second;
                    } else {
                        C15346a.m28242a(method.invoke(obtain, objArr), method, new Object[]{obtain, objArr}, "com_lynx_tasm_base_SystemMessageHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    }
                } catch (IllegalAccessException unused) {
                    LLog.m56856a(6, "SystemMessageHandler", "Illegal access to asynchronous message creation, disabling.");
                    this.f66918c = null;
                } catch (IllegalArgumentException unused2) {
                    LLog.m56856a(6, "SystemMessageHandler", "Illegal argument for asynchronous message creation, disabling.");
                    this.f66918c = null;
                } catch (InvocationTargetException unused3) {
                    LLog.m56856a(6, "SystemMessageHandler", "Invocation exception during asynchronous message creation, disabling.");
                    this.f66918c = null;
                } catch (RuntimeException unused4) {
                    LLog.m56856a(6, "SystemMessageHandler", "Runtime exception during asynchronous message creation, disabling.");
                    this.f66918c = null;
                }
            }
        }
        return obtain;
    }

    public static SystemMessageHandler create(long j) {
        return new SystemMessageHandler(j);
    }

    private SystemMessageHandler(long j) {
        this.f66916a = j;
    }

    public void handleMessage(Message message) {
        MethodCollector.m26663i(1507);
        if (this.f66917b) {
            TraceEvent.m56864a(0, "Looper::handleMessage");
            nativeRunWork(this.f66916a);
            TraceEvent.m56869b(0, "Looper::handleMessage");
        }
        MethodCollector.m26664o(1507);
    }
}
