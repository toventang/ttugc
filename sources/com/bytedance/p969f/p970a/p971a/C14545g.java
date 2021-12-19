package com.bytedance.p969f.p970a.p971a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.f.a.a.g */
public final class C14545g implements InvocationHandler {

    /* renamed from: a */
    private AbstractC14551i f35162a = null;

    /* renamed from: b */
    private GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a f35163b;

    static {
        Covode.recordClassIndex(16632);
    }

    /* renamed from: a */
    private static Object m26579a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_createx_editor_gesture_GestureInteractItemInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_createx_editor_gesture_GestureInteractItemInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    C14545g(GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a aVar) {
        this.f35163b = aVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (method.getReturnType().equals(Boolean.TYPE)) {
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        return false;
                    }
                }
            }
            AbstractC14551i iVar = this.f35162a;
            if (iVar != null) {
                z = ((Boolean) m26579a(method, iVar, objArr)).booleanValue();
            } else {
                z = false;
            }
            GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a aVar = this.f35163b;
            if (aVar != null) {
                z2 = ((Boolean) m26579a(method, aVar, objArr)).booleanValue();
            } else {
                z2 = false;
            }
            if (z || z2) {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
        if (objArr != null) {
            for (Object obj3 : objArr) {
                if (obj3 == null) {
                    return null;
                }
            }
        }
        AbstractC14551i iVar2 = this.f35162a;
        if (iVar2 != null) {
            m26579a(method, iVar2, objArr);
        }
        GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a aVar2 = this.f35163b;
        if (aVar2 != null) {
            m26579a(method, aVar2, objArr);
        }
        return null;
    }
}
