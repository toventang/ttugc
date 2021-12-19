package com.p2082ss.android.ugc.aweme.video.simplayer;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.i */
public final class C81009i {

    /* renamed from: a */
    public final String f181077a = "SimLifecycleManager";

    /* renamed from: b */
    public boolean f181078b;

    /* renamed from: c */
    OnUIPlayListener f181079c;

    /* renamed from: d */
    OnUIPlayListener f181080d;

    /* renamed from: e */
    public int f181081e = 1;

    /* renamed from: f */
    final AbstractC89244h f181082f = C89250i.m154773a((AbstractC89171a) C81011b.f181085a);

    static {
        Covode.recordClassIndex(94327);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simplayer.i$b */
    static final class C81011b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C81011b f181085a = new C81011b();

        static {
            Covode.recordClassIndex(94329);
        }

        C81011b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            C84199c cVar = C84199c.f187979a;
            C89219l.m154709a((Object) cVar, "");
            boolean z = true;
            if (cVar.getPlayerBackgroundSleepStrategy() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final OnUIPlayListener mo124472a(OnUIPlayListener onUIPlayListener) {
        this.f181078b = false;
        return (OnUIPlayListener) Proxy.newProxyInstance(OnUIPlayListener.class.getClassLoader(), new Class[]{OnUIPlayListener.class}, new C81010a(this, onUIPlayListener));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.simplayer.i$a */
    public static final class C81010a implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ C81009i f181083a;

        /* renamed from: b */
        final /* synthetic */ OnUIPlayListener f181084b;

        static {
            Covode.recordClassIndex(94328);
        }

        C81010a(C81009i iVar, OnUIPlayListener onUIPlayListener) {
            this.f181083a = iVar;
            this.f181084b = onUIPlayListener;
        }

        /* renamed from: a */
        private static Object m140625a(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_video_simplayer_LifecycleManager$createProxyListener$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_video_simplayer_LifecycleManager$createProxyListener$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z;
            C89219l.m154709a((Object) method, "");
            String name = method.getName();
            C89219l.m154709a((Object) name, "");
            if (C89219l.m154714a((Object) name, (Object) "equals")) {
                return Boolean.valueOf(C89219l.m154714a(this.f181084b, objArr[0]));
            }
            if (C89219l.m154714a((Object) name, (Object) "hashCode")) {
                return Integer.valueOf(this.f181084b.hashCode());
            }
            if ((!C89219l.m154714a((Object) name, (Object) "onPlayProgressChange")) && (!C89219l.m154714a((Object) name, (Object) "onBufferedPercent")) && (!C89219l.m154714a((Object) name, (Object) "onBufferedTimeMs"))) {
                C89219l.m154714a((Object) name, (Object) "toString");
            }
            if (!C89219l.m154714a((Object) name, (Object) "onRenderFirstFrame") || objArr == null || objArr.length <= 1) {
                z = false;
            } else {
                z = true;
            }
            boolean a = C89219l.m154714a((Object) name, (Object) "onPreparePlay");
            if (!this.f181083a.f181078b) {
                OnUIPlayListener onUIPlayListener = this.f181084b;
                if (objArr == null) {
                    objArr = new Object[0];
                }
                return m140625a(method, onUIPlayListener, Arrays.copyOf(objArr, objArr.length));
            } else if (z) {
                Method method2 = this.f181084b.getClass().getMethod("onResumePlay", String.class);
                C89219l.m154709a((Object) method2, "");
                method2.invoke(this.f181084b, objArr[0]);
                this.f181083a.f181078b = false;
                method2.getName();
                return 0;
            } else if (!a) {
                return null;
            } else {
                if (this.f181083a.f181081e > 0) {
                    C81009i iVar = this.f181083a;
                    iVar.f181081e--;
                    return null;
                }
                this.f181083a.f181078b = false;
                this.f181083a.f181081e = 1;
                OnUIPlayListener onUIPlayListener2 = this.f181084b;
                if (objArr == null) {
                    objArr = new Object[0];
                }
                return m140625a(method, onUIPlayListener2, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }
}
