package com.bytedance.scene.ktx;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.C22114a;
import com.bytedance.scene.p1621c.AbstractC22148a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89230w;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.scene.ktx.c */
public final class C22228c {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f52567a = {new C89230w(C89204ab.m154670a(C22228c.class, "scene_ktx_release"), "HANDLER", "getHANDLER()Landroid/os/Handler;")};

    /* renamed from: b */
    private static final AbstractC89244h f52568b = C89250i.m154773a((AbstractC89171a) C22229a.f52569a);

    /* renamed from: a */
    public static final Handler m41827a() {
        return (Handler) f52568b.getValue();
    }

    /* renamed from: com.bytedance.scene.ktx.c$a */
    static final class C22229a extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C22229a f52569a = new C22229a();

        static {
            Covode.recordClassIndex(26037);
        }

        C22229a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        Covode.recordClassIndex(26036);
    }

    /* renamed from: a */
    public static final ActivityC0945e m41828a(AbstractC22219j jVar) {
        C89219l.m154719c(jVar, "");
        return (ActivityC0945e) jVar.f52549m;
    }

    /* renamed from: b */
    public static final ActivityC0945e m41832b(AbstractC22219j jVar) {
        C89219l.m154719c(jVar, "");
        Activity t = jVar.mo36486t();
        if (t != null) {
            return (ActivityC0945e) t;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: com.bytedance.scene.ktx.c$b */
    static final class C22230b implements AbstractC22148a {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f52570a;

        /* renamed from: b */
        final /* synthetic */ Intent f52571b;

        /* renamed from: c */
        final /* synthetic */ int f52572c = 1001;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f52573d;

        static {
            Covode.recordClassIndex(26038);
        }

        C22230b(AbstractC22219j jVar, Intent intent, AbstractC89183m mVar) {
            this.f52570a = jVar;
            this.f52571b = intent;
            this.f52573d = mVar;
        }

        @Override // com.bytedance.scene.p1621c.AbstractC22148a
        /* renamed from: a */
        public final void mo36334a(int i, Intent intent) {
            this.f52573d.invoke(Integer.valueOf(i), intent);
        }
    }

    /* renamed from: a */
    public static final void m41830a(AbstractC22219j jVar, Runnable runnable) {
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(runnable, "");
        AbstractC1196i lifecycle = jVar.getLifecycle();
        C89219l.m154709a((Object) lifecycle, "");
        if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            m41827a().post(runnable);
            jVar.getLifecycle().mo4012a(new SceneExtensionsKt$post$1(runnable));
        }
    }

    /* renamed from: a */
    public static final void m41829a(AbstractC22219j jVar, Intent intent, AbstractC89183m<? super Integer, ? super Intent, C89391z> mVar) {
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(intent, "");
        C89219l.m154719c(mVar, "");
        Activity activity = jVar.f52549m;
        if (activity != null) {
            C22114a.m41592a(activity, jVar, intent, new C22230b(jVar, intent, mVar));
        }
    }

    /* renamed from: a */
    public static final void m41831a(AbstractC22219j jVar, Runnable runnable, long j) {
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(runnable, "");
        AbstractC1196i lifecycle = jVar.getLifecycle();
        C89219l.m154709a((Object) lifecycle, "");
        if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
            m41827a().postDelayed(runnable, j);
            jVar.getLifecycle().mo4012a(new SceneExtensionsKt$postDelayed$1(runnable));
        }
    }
}
