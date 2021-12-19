package com.bytedance.ies.bullet.kit.lynx.model;

import android.util.Pair;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16380d;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16384h;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16386i;
import com.bytedance.ies.bullet.kit.lynx.api.BulletLynxProp;
import com.bytedance.ies.bullet.kit.lynx.api.BulletLynxUIMethod;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap;
import com.bytedance.ies.bullet.kit.lynx.api.C16381e;
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

/* renamed from: com.bytedance.ies.bullet.kit.lynx.model.a */
public final class C16431a {

    /* renamed from: a */
    public static final C16431a f39489a = new C16431a();

    private C16431a() {
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.a$a */
    public static final class C16432a extends C28463a {

        /* renamed from: a */
        final /* synthetic */ AbstractC16380d f39490a;

        static {
            Covode.recordClassIndex(18740);
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
            BulletLynxProp bulletLynxProp;
            C89219l.m154719c(jVar, "");
            AbstractC16380d dVar = this.f39490a;
            new C16381e(jVar.getBaseContext());
            AbstractC16386i<? extends View> a = dVar.mo26011a();
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
                    if ((annotation instanceof BulletLynxProp) || (annotation instanceof BulletLynxUIMethod)) {
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
                    if (!(annotation2 instanceof BulletLynxProp)) {
                        i2++;
                    } else if (annotation2 != null && (bulletLynxProp = (BulletLynxProp) annotation2) != null) {
                        linkedHashMap.put(bulletLynxProp.name(), method2);
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
                    if (!(annotation3 instanceof BulletLynxUIMethod)) {
                        i3++;
                    } else if (annotation3 != null) {
                        a.mo26015b().put(method2.getName(), method2);
                    }
                }
            }
            new C16433a(a, linkedHashMap);
            LynxBehaviorFactoryKt$transform$3 lynxBehaviorFactoryKt$transform$3 = new LynxBehaviorFactoryKt$transform$3(a, jVar, jVar);
            try {
                if (!a.mo26015b().isEmpty()) {
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

        /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.a$a$a */
        public static final class C16433a extends AbstractC16384h.C16385a {

            /* renamed from: a */
            final /* synthetic */ AbstractC16386i f39491a;

            /* renamed from: b */
            final /* synthetic */ Map f39492b;

            static {
                Covode.recordClassIndex(18741);
            }

            /* renamed from: a */
            private static Object m30515a(Method method, Object obj, Object[] objArr) {
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_ies_bullet_kit_lynx_model_LynxBehaviorFactory$createLynxBehavior$1$createUI$1$3_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    return a.second;
                }
                Object invoke = method.invoke(obj, objArr);
                C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_ies_bullet_kit_lynx_model_LynxBehaviorFactory$createLynxBehavior$1$createUI$1$3_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                return invoke;
            }

            C16433a(AbstractC16386i<? extends View> iVar, Map map) {
                this.f39491a = iVar;
                this.f39492b = map;
            }

            @Override // com.bytedance.ies.bullet.kit.lynx.api.AbstractC16384h.C16385a, com.bytedance.ies.bullet.kit.lynx.api.AbstractC16384h
            /* renamed from: a */
            public final void mo26013a(String str, Object obj) {
                C89219l.m154719c(str, "");
                if (this.f39492b.get(str) != null) {
                    Object obj2 = this.f39492b.get(str);
                    if (obj2 == null) {
                        C89219l.m154707a();
                    }
                    Method method = (Method) obj2;
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    C89219l.m154709a((Object) parameterTypes, "");
                    if (parameterTypes.length == 1) {
                        try {
                            if (!C89219l.m154714a(parameterTypes[0], BulletReadableMap.class) || !(obj instanceof ReadableMap)) {
                                m30515a(method, this.f39491a, new Object[]{obj});
                                return;
                            }
                            m30515a(method, this.f39491a, new Object[]{C16434b.m30519a((ReadableMap) obj)});
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16432a(AbstractC16380d dVar, String str, boolean z) {
            super(str, z);
            this.f39490a = dVar;
        }
    }

    static {
        Covode.recordClassIndex(18739);
    }

    /* renamed from: a */
    public static C28463a m30510a(AbstractC16380d dVar) {
        C89219l.m154719c(dVar, "");
        return new C16432a(dVar, dVar.f39371a, dVar.f39372b);
    }
}
