package com.bytedance.apm.agent.wrapper;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Pair;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TTToastWrapper {
    static {
        Covode.recordClassIndex(14092);
    }

    public static boolean initToastHook(Toast toast) {
        if (Build.VERSION.SDK_INT != 24 && Build.VERSION.SDK_INT != 25) {
            return true;
        }
        reflectAndoridNTNHandler(toast);
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class ProxyTNHandler extends Handler {
        private Method handleHideMethod;
        private Method handleShowMethod;
        private Object tnObject;

        static {
            Covode.recordClassIndex(14094);
        }

        /* renamed from: com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke */
        private static Object m22055xbcfc7e82(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        ProxyTNHandler(Object obj) {
            this.tnObject = obj;
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod("handleShow", IBinder.class);
                this.handleShowMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = obj.getClass().getDeclaredMethod("handleHide", new Class[0]);
                this.handleHideMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public void handleMessage(Message message) {
            Method method;
            int i = message.what;
            if (i == 0) {
                Object obj = message.obj;
                Method method2 = this.handleShowMethod;
                if (method2 != null) {
                    try {
                        m22055xbcfc7e82(method2, this.tnObject, new Object[]{obj});
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    } catch (WindowManager.BadTokenException e3) {
                        e3.printStackTrace();
                    }
                }
            } else if (i == 1) {
                Method method3 = this.handleHideMethod;
                if (method3 != null) {
                    try {
                        m22055xbcfc7e82(method3, this.tnObject, new Object[0]);
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e5) {
                        e5.printStackTrace();
                    }
                }
            } else if (i == 2 && (method = this.handleHideMethod) != null) {
                try {
                    m22055xbcfc7e82(method, this.tnObject, new Object[0]);
                } catch (IllegalAccessException e6) {
                    e6.printStackTrace();
                } catch (InvocationTargetException e7) {
                    e7.printStackTrace();
                }
            }
            super.handleMessage(message);
        }
    }

    private static boolean reflectAndoridNTNHandler(Toast toast) {
        Field field;
        Field declaredField;
        try {
            if (toast.getClass().getSuperclass() == null || !Toast.class.getName().equals(toast.getClass().getSuperclass().getName())) {
                field = toast.getClass().getDeclaredField("mTN");
            } else {
                field = toast.getClass().getSuperclass().getDeclaredField("mTN");
            }
            if (field == null) {
                return false;
            }
            field.setAccessible(true);
            Object obj = field.get(toast);
            if (obj == null || (declaredField = obj.getClass().getDeclaredField("mHandler")) == null) {
                return false;
            }
            declaredField.setAccessible(true);
            declaredField.set(obj, new ProxyTNHandler(obj));
            return true;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static Toast makeText(Context context, int i, int i2) {
        return makeText(context, ((Object) context.getResources().getText(i)) + "__wrapper", i2);
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i) {
        Toast makeText = Toast.makeText(context, ((Object) charSequence) + "__wrapper", i);
        initToastHook(makeText);
        return makeText;
    }
}
