package com.bytedance.p969f.p970a.p971a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.f.a.a.d */
public final class C14542d implements InvocationHandler {

    /* renamed from: a */
    private C14540c f35154a;

    /* renamed from: b */
    private AbstractC14543e f35155b;

    /* renamed from: c */
    private boolean f35156c;

    static {
        Covode.recordClassIndex(16629);
    }

    /* renamed from: a */
    private static Object m26558a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_createx_editor_gesture_GestureDelegateInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_createx_editor_gesture_GestureDelegateInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public C14542d(C14540c cVar, AbstractC14543e eVar) {
        this.f35154a = cVar;
        this.f35155b = eVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC14543e eVar;
        boolean z = false;
        if (method.getReturnType().equals(Boolean.TYPE)) {
            int i = 0;
            while (true) {
                if (i >= this.f35154a.f35151b.size()) {
                    break;
                }
                C14544f fVar = this.f35154a.f35151b.get(i);
                if (((Boolean) m26558a(method, fVar, objArr)).booleanValue()) {
                    if (method.getName().equals("onDown") && (eVar = this.f35155b) != null) {
                        eVar.mo23386a(fVar);
                    }
                    if (this.f35156c) {
                        C89219l.m154721d("handleBoolean: methodName=" + method.getName() + ",i=" + i + ",size=" + this.f35154a.f35151b.size() + ",item=" + fVar, "");
                    }
                    z = true;
                } else {
                    i++;
                }
            }
            return Boolean.valueOf(z);
        }
        int size = this.f35154a.f35151b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C14544f fVar2 = this.f35154a.f35151b.get(i2);
            m26558a(method, fVar2, objArr);
            if (this.f35156c) {
                C89219l.m154721d("i=" + i2 + ",size=" + size + ",methodName=" + method.getName() + ",item=" + fVar2, "");
            }
        }
        return null;
    }
}
