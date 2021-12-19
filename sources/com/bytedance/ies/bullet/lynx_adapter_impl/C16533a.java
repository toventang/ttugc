package com.bytedance.ies.bullet.lynx_adapter_impl;

import android.util.Pair;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.lynx.lynx_adapter.annotation.LynxPropWrapper;
import com.bytedance.ies.lynx.lynx_adapter.annotation.LynxUIMethodWrapper;
import com.bytedance.ies.lynx.lynx_adapter.p1229a.AbstractC17604a;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.AbstractC17608c;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.AbstractC17615i;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.C17610e;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.AbstractC28392a;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.a */
public final class C16533a {

    /* renamed from: a */
    public static final C16533a f39656a = new C16533a();

    private C16533a() {
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.a$a */
    public static final class C16534a extends C28463a {

        /* renamed from: a */
        final /* synthetic */ AbstractC17608c f39657a;

        static {
            Covode.recordClassIndex(18970);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: b */
        public final AbstractC28392a mo26076b() {
            return null;
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: b */
        public final LynxFlattenUI mo16278b(AbstractC28520j jVar) {
            return null;
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final ShadowNode mo16276a() {
            return new LynxBehaviorFactoryKt$transform$2();
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            LynxPropWrapper lynxPropWrapper;
            C89219l.m154719c(jVar, "");
            AbstractC17608c cVar = this.f39657a;
            new C17610e(jVar.getBaseContext());
            AbstractC17615i<? extends View> a = cVar.mo28032a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Method[] declaredMethods = a.getClass().getDeclaredMethods();
            C89219l.m154709a((Object) declaredMethods, "");
            ArrayList<Method> arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                C89219l.m154709a((Object) method, "");
                Annotation[] annotations = method.getAnnotations();
                C89219l.m154709a((Object) annotations, "");
                int length = annotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Annotation annotation = annotations[i];
                    if ((annotation instanceof LynxPropWrapper) || (annotation instanceof LynxUIMethodWrapper)) {
                        arrayList.add(method);
                    } else {
                        i++;
                    }
                }
            }
            for (Method method2 : arrayList) {
                C89219l.m154709a((Object) method2, "");
                Annotation[] annotations2 = method2.getAnnotations();
                C89219l.m154709a((Object) annotations2, "");
                int length2 = annotations2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    Annotation annotation2 = annotations2[i2];
                    if (!(annotation2 instanceof LynxPropWrapper)) {
                        i2++;
                    } else if (annotation2 != null && (lynxPropWrapper = (LynxPropWrapper) annotation2) != null) {
                        linkedHashMap.put(lynxPropWrapper.name(), method2);
                    }
                }
                Annotation[] annotations3 = method2.getAnnotations();
                C89219l.m154709a((Object) annotations3, "");
                int length3 = annotations3.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        break;
                    }
                    Annotation annotation3 = annotations3[i3];
                    if (!(annotation3 instanceof LynxUIMethodWrapper)) {
                        i3++;
                    } else if (annotation3 != null) {
                        a.mo28035b().put(method2.getName(), method2);
                    }
                }
            }
            new C16535a(a, linkedHashMap);
            LynxBehaviorFactoryKt$transform$3 lynxBehaviorFactoryKt$transform$3 = new LynxBehaviorFactoryKt$transform$3(a, jVar, jVar);
            try {
                if (!a.mo28035b().isEmpty()) {
                    Field declaredField = LynxUIMethodsExecutor.class.getDeclaredField("a");
                    C89219l.m154709a((Object) declaredField, "");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(null);
                    if (obj != null) {
                        ((HashMap) obj).put(lynxBehaviorFactoryKt$transform$3.getClass(), new LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1(a, lynxBehaviorFactoryKt$transform$3));
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return lynxBehaviorFactoryKt$transform$3;
        }

        /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.a$a$a */
        public static final class C16535a extends AbstractC17604a.C17605a {

            /* renamed from: a */
            final /* synthetic */ AbstractC17615i f39658a;

            /* renamed from: b */
            final /* synthetic */ Map f39659b;

            static {
                Covode.recordClassIndex(18971);
            }

            /* renamed from: a */
            private static Object m30711a(Method method, Object obj, Object[] objArr) {
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_ies_bullet_lynx_adapter_impl_LynxBehaviorFactory$createLynxBehavior$1$createUI$1$3_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    return a.second;
                }
                Object invoke = method.invoke(obj, objArr);
                C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_ies_bullet_lynx_adapter_impl_LynxBehaviorFactory$createLynxBehavior$1$createUI$1$3_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return invoke;
            }

            C16535a(AbstractC17615i<? extends View> iVar, Map map) {
                this.f39658a = iVar;
                this.f39659b = map;
            }

            @Override // com.bytedance.ies.lynx.lynx_adapter.p1229a.AbstractC17604a, com.bytedance.ies.lynx.lynx_adapter.p1229a.AbstractC17604a.C17605a
            /* renamed from: a */
            public final void mo26246a(String str, Object obj) {
                C89219l.m154719c(str, "");
                if (this.f39659b.get(str) != null) {
                    Object obj2 = this.f39659b.get(str);
                    if (obj2 == null) {
                        C89219l.m154707a();
                    }
                    Method method = (Method) obj2;
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        try {
                            if (C89219l.m154714a(parameterTypes[0], ReadableMapWrapper.class) && (obj instanceof ReadableMap)) {
                                m30711a(method, this.f39658a, new Object[]{C16536b.m30716a((ReadableMap) obj)});
                            } else if (!C89219l.m154714a(parameterTypes[0], ReadableArrayWrapper.class) || !(obj instanceof ReadableArray)) {
                                m30711a(method, this.f39658a, new Object[]{obj});
                            } else {
                                m30711a(method, this.f39658a, new Object[]{C16536b.m30715a((ReadableArray) obj)});
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16534a(AbstractC17608c cVar, String str, boolean z) {
            super(str, z);
            this.f39657a = cVar;
        }
    }

    static {
        Covode.recordClassIndex(18969);
    }

    /* renamed from: a */
    public static C28463a m30706a(AbstractC17608c cVar) {
        C89219l.m154719c(cVar, "");
        return new C16534a(cVar, cVar.f42095a, cVar.f42096b);
    }
}
