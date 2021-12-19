package com.p2082ss.avframework.effect;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.EarlyAVLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.avframework.effect.VideoEffectUtilsWrapper */
public class VideoEffectUtilsWrapper {
    public static final Object[] NO_ARGS = new Object[0];
    private static VideoEffectUtilsWrapper mVideoEffectUtilsWrapper;
    Class<?> mEffectSdk;
    private List<ListenerHandler> mListenerHandlerList = new ArrayList();
    Class<?> mMessageCenter;
    Class<?> mMessageCenterListener;
    Method mMethodEffectSdkFlushAlgorithmModelFiles;
    Method mMethodMessageCenterAddListener;
    Method mMethodMessageCenterRemoveListener;
    Class<?> mResourceFinder;
    Method mResourceFinderCreateNativeFinder;
    Method mResourceFinderRelease;

    /* renamed from: com_ss_avframework_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke */
    private static Object m147769xc687d858(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_avframework_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_avframework_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.effect.VideoEffectUtilsWrapper$ListenerHandler */
    public class ListenerHandler implements InvocationHandler {
        private WeakReference<Object> mEffectListener;
        private IVideoEffectProcessor.EffectMsgListener mEffectMsgListener;

        static {
            Covode.recordClassIndex(99935);
        }

        public Object getEffectListener() {
            return this.mEffectListener.get();
        }

        public void setEffectListener(WeakReference<Object> weakReference) {
            this.mEffectListener = weakReference;
        }

        public boolean sameEffectMsgListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
            if (effectMsgListener == this.mEffectMsgListener) {
                return true;
            }
            return false;
        }

        public ListenerHandler(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
            this.mEffectMsgListener = effectMsgListener;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String str;
            boolean z = true;
            if (method.getName().equals("onMessageReceived")) {
                AVLog.m147805d("VideoEffectUtilsWrapper", "invoke method:" + method + " args " + objArr.length + " listener " + this.mEffectMsgListener);
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                int intValue3 = ((Integer) objArr[2]).intValue();
                if (objArr[3] == null) {
                    str = "";
                } else {
                    str = (String) objArr[3];
                }
                IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mEffectMsgListener;
                if (effectMsgListener != null) {
                    effectMsgListener.onMessageReceived(intValue, intValue2, intValue3, str);
                }
                return obj;
            }
            if (objArr == null) {
                objArr = VideoEffectUtilsWrapper.NO_ARGS;
            }
            if (objArr.length == 0 && method.getName().equals("hashCode")) {
                return Integer.valueOf(hashCode());
            }
            if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
                Object obj2 = objArr[0];
                if (obj2 == null) {
                    return false;
                }
                if (obj == obj2) {
                    return true;
                }
                if (!VideoEffectUtilsWrapper.isProxyOfSameInterfaces(obj2, obj.getClass()) || !equals(Proxy.getInvocationHandler(obj2))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (objArr.length != 0 || !method.getName().equals("toString")) {
                return obj;
            } else {
                return toString();
            }
        }
    }

    static {
        Covode.recordClassIndex(99934);
    }

    public static boolean haveEffect() {
        return get().onHaveEffect();
    }

    private boolean onHaveEffect() {
        if (this.mEffectSdk == null || this.mMethodEffectSdkFlushAlgorithmModelFiles == null) {
            return false;
        }
        return true;
    }

    public static VideoEffectUtilsWrapper get() {
        MethodCollector.m26663i(1106);
        synchronized (VideoEffectUtilsWrapper.class) {
            try {
                if (mVideoEffectUtilsWrapper == null) {
                    mVideoEffectUtilsWrapper = new VideoEffectUtilsWrapper();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(1106);
                throw th;
            }
        }
        VideoEffectUtilsWrapper videoEffectUtilsWrapper = mVideoEffectUtilsWrapper;
        MethodCollector.m26664o(1106);
        return videoEffectUtilsWrapper;
    }

    public static List<String> getEffectLibs() {
        try {
            return (List) Class.forName("com.bef.effectsdk.EffectSDKBuildConfig").getMethod("getEffectLibs", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            EarlyAVLog.println(6, "VideoEffectUtilsWrapper", Log.getStackTraceString(th), th);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private VideoEffectUtilsWrapper() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.effect.VideoEffectUtilsWrapper.<init>():void");
    }

    public static void addMessageCenterListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        get().addListener(effectMsgListener);
    }

    public static void removeMessageCenterListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        get().removeListener(effectMsgListener);
    }

    private ListenerHandler popListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        MethodCollector.m26663i(1375);
        ListenerHandler findListener = findListener(effectMsgListener);
        if (findListener != null) {
            synchronized (this.mListenerHandlerList) {
                try {
                    this.mListenerHandlerList.remove(findListener);
                } finally {
                    MethodCollector.m26664o(1375);
                }
            }
        }
        return findListener;
    }

    private ListenerHandler findListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        MethodCollector.m26663i(1379);
        synchronized (this.mListenerHandlerList) {
            try {
                for (ListenerHandler listenerHandler : this.mListenerHandlerList) {
                    if (listenerHandler.sameEffectMsgListener(effectMsgListener)) {
                        return listenerHandler;
                    }
                }
                MethodCollector.m26664o(1379);
                return null;
            } finally {
                MethodCollector.m26664o(1379);
            }
        }
    }

    private synchronized void removeListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        ListenerHandler popListener;
        MethodCollector.m26663i(1373);
        AVLog.ioi("VideoEffectUtilsWrapper", "Remove listener: ".concat(String.valueOf(effectMsgListener)));
        if (!(this.mMethodMessageCenterRemoveListener == null || (popListener = popListener(effectMsgListener)) == null)) {
            try {
                AVLog.ioi("VideoEffectUtilsWrapper", "Remove listener " + popListener.getEffectListener());
                m147769xc687d858(this.mMethodMessageCenterRemoveListener, null, new Object[]{popListener.getEffectListener()});
                popListener.setEffectListener(null);
                MethodCollector.m26664o(1373);
                return;
            } catch (Throwable th) {
                AVLog.ioi("VideoEffectUtilsWrapper", "RemoveListener failed " + Log.getStackTraceString(th));
            }
        }
        MethodCollector.m26664o(1373);
    }

    private synchronized void addListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        ListenerHandler listenerHandler;
        Object newProxyInstance;
        MethodCollector.m26663i(1349);
        AVLog.iod("VideoEffectUtilsWrapper", "Add listener: ".concat(String.valueOf(effectMsgListener)));
        if (findListener(effectMsgListener) != null) {
            AVLog.m147809w("VideoEffectUtilsWrapper", "Already exist listener");
            MethodCollector.m26664o(1349);
            return;
        }
        if (!(this.mMethodMessageCenterAddListener == null || effectMsgListener == null || (newProxyInstance = Proxy.newProxyInstance(VideoEffectUtilsWrapper.class.getClassLoader(), new Class[]{this.mMessageCenterListener}, (listenerHandler = new ListenerHandler(effectMsgListener)))) == null)) {
            try {
                AVLog.ioi("VideoEffectUtilsWrapper", "Add listener ".concat(String.valueOf(newProxyInstance)));
                m147769xc687d858(this.mMethodMessageCenterAddListener, null, new Object[]{newProxyInstance});
                listenerHandler.setEffectListener(new WeakReference<>(newProxyInstance));
                synchronized (this.mListenerHandlerList) {
                    try {
                        this.mListenerHandlerList.add(listenerHandler);
                    } finally {
                        MethodCollector.m26664o(1349);
                    }
                }
                return;
            } catch (Throwable th) {
                AVLog.ioe("VideoEffectUtilsWrapper", "AddListener failed " + Log.getStackTraceString(th));
            }
        }
        MethodCollector.m26664o(1349);
    }

    public static void flushAlgorithmModelFiles(Context context, String str) {
        get().onFlushAlgorithmModelFiles(context, str);
    }

    public static Object createResourceFinder(AssetManager assetManager, String str) {
        return get().onCreateResourceFinder(assetManager, str);
    }

    public static long createNativeResourceFinder(Object obj, long j) {
        if (!(obj == null || get().mResourceFinderCreateNativeFinder == null)) {
            try {
                Object com_ss_avframework_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke = m147769xc687d858(get().mResourceFinderCreateNativeFinder, obj, new Object[]{Long.valueOf(j)});
                if (com_ss_avframework_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke instanceof Long) {
                    return ((Long) com_ss_avframework_effect_VideoEffectUtilsWrapper_java_lang_reflect_Method_invoke).longValue();
                }
            } catch (Throwable th) {
                AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(th));
            }
        }
        return 0;
    }

    public static boolean isProxyOfSameInterfaces(Object obj, Class<?> cls) {
        if (cls.isInstance(obj)) {
            return true;
        }
        if (!Proxy.isProxyClass(obj.getClass()) || !Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces())) {
            return false;
        }
        return true;
    }

    public static void releaseFinder(Object obj, long j) {
        if (obj != null && get().mResourceFinderRelease != null) {
            try {
                m147769xc687d858(get().mResourceFinderRelease, obj, new Object[]{Long.valueOf(j)});
            } catch (Throwable th) {
                AVLog.ioe("VideoEffectUtilsWrapper", Log.getStackTraceString(th));
            }
        }
    }

    private Object onCreateResourceFinder(AssetManager assetManager, String str) {
        Throwable th;
        Class<?> cls = this.mResourceFinder;
        if (cls == null || assetManager == null) {
            th = null;
        } else {
            try {
                return cls.getConstructor(AssetManager.class, String.class).newInstance(assetManager, str);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (th != null) {
            AVLog.ioe("VideoEffectUtilsWrapper", "Create effectsdk resourcefinder failed " + Log.getStackTraceString(th));
        }
        return null;
    }

    private void onFlushAlgorithmModelFiles(Context context, String str) {
        Method method;
        if (context != null && (method = this.mMethodEffectSdkFlushAlgorithmModelFiles) != null) {
            try {
                m147769xc687d858(method, null, new Object[]{context, str});
            } catch (Throwable th) {
                AVLog.ioe("VideoEffectUtilsWrapper", "onFlushAlgorithmModelFiles failed ctx " + context + " path " + str + " cause:" + Log.getStackTraceString(th));
            }
        }
    }
}
