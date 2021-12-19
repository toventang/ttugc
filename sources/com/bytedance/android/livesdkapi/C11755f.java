package com.bytedance.android.livesdkapi;

import android.content.Context;
import android.util.Pair;
import com.bytedance.android.live.base.p178b.AbstractC2955a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.other.LiveSettingsWriteDelayTimeSetting;
import com.bytedance.android.livesdk.p447ak.C6765b;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdkapi.host.AbstractC11797b;
import com.bytedance.android.livesdkapi.host.AbstractC11799c;
import com.bytedance.android.livesdkapi.host.AbstractC11802d;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.android.livesdkapi.host.AbstractC11806f;
import com.bytedance.android.livesdkapi.host.AbstractC11807g;
import com.bytedance.android.livesdkapi.host.AbstractC11808h;
import com.bytedance.android.livesdkapi.host.AbstractC11812i;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.p675c.AbstractC11616a;
import com.bytedance.android.livesdkapi.service.AbstractC11845c;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.google.gson.C28022o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdkapi.f */
public final class C11755f {

    /* renamed from: a */
    public static volatile boolean f28118a;

    /* renamed from: b */
    private static volatile boolean f28119b;

    static {
        Covode.recordClassIndex(13445);
    }

    private C11755f() {
    }

    /* renamed from: a */
    public static AbstractC11846d m20713a() {
        if (!f28118a) {
            return null;
        }
        return C6765b.m14482a();
    }

    /* renamed from: a */
    public static void m20715a(AbstractC11845c cVar) {
        MethodCollector.m26663i(12685);
        if (!f28119b) {
            synchronized (C11755f.class) {
                try {
                    if (!f28119b) {
                        C6193a.m13436a(IHostAction.class, cVar.mo18952j());
                        C6193a.m13436a(IHostContext.class, cVar.mo18943a());
                        C6193a.m13436a(AbstractC2955a.class, cVar.mo18946d());
                        C6193a.m13436a(IHostNetwork.class, cVar.mo18951i());
                        C6193a.m13436a(AbstractC11807g.class, cVar.mo18947e());
                        C6193a.m13436a(IHostPlugin.class, cVar.mo18948f());
                        C6193a.m13436a(IHostApp.class, cVar.mo18945c());
                        C6193a.m13436a(IHostShare.class, cVar.mo18950h());
                        C6193a.m13436a(IHostUser.class, cVar.mo18954l());
                        C6193a.m13436a(AbstractC11797b.class, cVar.mo18944b());
                        C6193a.m13436a(IHostWallet.class, cVar.mo18949g());
                        C6193a.m13436a(AbstractC11815j.class, cVar.mo18953k());
                        C6193a.m13436a(AbstractC11816k.class, cVar.mo18955m());
                        C6193a.m13436a(AbstractC11803e.class, cVar.mo18956n());
                        C6193a.m13436a(AbstractC11799c.class, cVar.mo18958p());
                        C6193a.m13436a(AbstractC11808h.class, cVar.mo18959q());
                        C6193a.m13436a(AbstractC11802d.class, null);
                        C6193a.m13436a(AbstractC11806f.class, null);
                        C6193a.m13436a(AbstractC11616a.class, cVar.mo18957o());
                        C6193a.m13436a(AbstractC11812i.class, cVar.mo18960r());
                        m20716a("com.bytedance.android.live.service.initializer.ServiceInitializer", "init");
                        f28119b = true;
                    }
                } finally {
                    MethodCollector.m26664o(12685);
                }
            }
            return;
        }
        MethodCollector.m26664o(12685);
    }

    /* renamed from: a */
    public static void m20714a(Context context, C28022o oVar) {
        if (context != null && oVar != null) {
            AbstractC88979t.m154307b(LiveSettingsWriteDelayTimeSetting.INSTANCE.getValue(), TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C11759g(oVar), C11195i.f26823a);
        }
    }

    /* renamed from: a */
    public static void m20716a(String str, String str2) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, new Class[0]);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            Object[] objArr = new Object[0];
            Pair<Boolean, Object> a = C15346a.m28238a(declaredMethod, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_livesdkapi_TTLiveSDK_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                Object obj = a.second;
                return;
            }
            C15346a.m28242a(declaredMethod.invoke(null, objArr), declaredMethod, new Object[]{null, objArr}, "com_bytedance_android_livesdkapi_TTLiveSDK_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
