package com.lynx.tasm.behavior.utils;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LynxUIMethodsExecutor {

    /* renamed from: a */
    public static final Map<Class<?>, AbstractC28700a<?>> f67691a = new HashMap();

    static {
        Covode.recordClassIndex(34785);
    }

    public static class FallbackLynxUIMethodInvoker<T extends LynxBaseUI> implements AbstractC28700a<T> {

        /* renamed from: a */
        private Map<String, Method> f67692a;

        static {
            Covode.recordClassIndex(34786);
        }

        /* renamed from: a */
        private static Object m57476a(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_lynx_tasm_behavior_utils_LynxUIMethodsExecutor$FallbackLynxUIMethodInvoker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_lynx_tasm_behavior_utils_LynxUIMethodsExecutor$FallbackLynxUIMethodInvoker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        public FallbackLynxUIMethodInvoker(Class<? extends LynxBaseUI> cls) {
            this.f67692a = C28701b.m57482a(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.AbstractC28700a
        public void invoke(T t, String str, ReadableMap readableMap, Callback callback) {
            Method method = this.f67692a.get(str);
            if (method == null) {
                callback.invoke(3);
                return;
            }
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 0) {
                    m57476a(method, t, new Object[0]);
                } else if (parameterTypes.length == 1) {
                    if (parameterTypes[0] == ReadableMap.class) {
                        m57476a(method, t, new Object[]{readableMap});
                    } else if (parameterTypes[0] == Callback.class) {
                        m57476a(method, t, new Object[]{callback});
                    }
                } else if (parameterTypes[0] == ReadableMap.class && parameterTypes[1] == Callback.class) {
                    m57476a(method, t, new Object[]{readableMap, callback});
                } else {
                    callback.invoke(4);
                    LLog.m56856a(3, "FallbackMethodInvoker", "invoke target method: params invalid");
                }
            } catch (Exception e) {
                callback.invoke(1);
                LLog.m56859a("FallbackMethodInvoker", "invoke target method exception," + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static <T> T m57475a(Class<?> cls) {
        String str = cls.getName() + "$$MethodInvoker";
        try {
            return (T) Class.forName(str).newInstance();
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("Unable to instantiate methods invoker for ".concat(String.valueOf(str)), e);
        }
    }
}
