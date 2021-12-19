package com.bytedance.ies.bullet.kit.lynx.model;

import android.util.Pair;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16379c;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16386i;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import java.lang.reflect.Method;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1 extends LynxUIMethodInvokerProxy {

    /* renamed from: a */
    final /* synthetic */ AbstractC16386i f39482a;

    /* renamed from: b */
    final /* synthetic */ LynxUI f39483b;

    static {
        Covode.recordClassIndex(18733);
    }

    /* renamed from: a */
    private static Object m30505a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_ies_bullet_kit_lynx_model_LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_ies_bullet_kit_lynx_model_LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    LynxBehaviorFactory$createLynxBehavior$1$createUI$2$1(AbstractC16386i iVar, LynxUI lynxUI) {
        this.f39482a = iVar;
        this.f39483b = lynxUI;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.model.LynxUIMethodInvokerProxy
    /* renamed from: a */
    public final void mo26066a(String str, ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        Method method = this.f39482a.mo26015b().get(str);
        if (method != null) {
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                C89219l.m154709a((Object) parameterTypes, "");
                if (parameterTypes.length == 0) {
                    m30505a(method, this.f39482a, new Object[0]);
                } else if (parameterTypes.length == 1) {
                    Class<?> cls = parameterTypes[0];
                    if (C89219l.m154714a(cls, ReadableMap.class)) {
                        m30505a(method, this.f39482a, new Object[]{readableMap});
                    } else if (C89219l.m154714a(cls, Callback.class)) {
                        m30505a(method, this.f39482a, new Object[]{callback});
                    } else if (C89219l.m154714a(cls, BulletReadableMap.class)) {
                        m30505a(method, this.f39482a, new Object[]{C16434b.m30519a(readableMap)});
                    } else if (C89219l.m154714a(cls, AbstractC16379c.class)) {
                        m30505a(method, this.f39482a, new Object[]{C16434b.m30521a(callback)});
                    }
                } else if (parameterTypes.length != 2) {
                    AbstractC16379c a = C16434b.m30521a(callback);
                    if (a != null) {
                        a.mo26010a(4);
                    }
                } else if (C89219l.m154714a(parameterTypes[0], ReadableMap.class) && C89219l.m154714a(parameterTypes[1], Callback.class)) {
                    m30505a(method, this.f39483b, new Object[]{readableMap, callback});
                } else if (C89219l.m154714a(parameterTypes[0], BulletReadableMap.class) && C89219l.m154714a(parameterTypes[1], AbstractC16379c.class)) {
                    m30505a(method, this.f39483b, new Object[]{C16434b.m30519a(readableMap), C16434b.m30521a(callback)});
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.lynx.tasm.behavior.ui.LynxBaseUI, java.lang.String, com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback] */
    @Override // com.bytedance.ies.bullet.kit.lynx.model.LynxUIMethodInvokerProxy, com.lynx.tasm.behavior.utils.AbstractC28700a
    public final /* synthetic */ void invoke(LynxUI<? extends View> lynxUI, String str, ReadableMap readableMap, Callback callback) {
        mo26066a(str, readableMap, callback);
    }
}
