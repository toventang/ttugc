package com.p2082ss.android.ugc.aweme.feed.background;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1370a.C19064a;
import com.bytedance.ies.xelement.p1364b.AbstractC18997c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.background.d */
public final class C49287d implements AbstractC18997c, ActivityStack.AbstractC80170b {

    /* renamed from: a */
    private final AbstractC89244h f113293a = C89250i.m154773a((AbstractC89171a) C49288a.f113294a);

    static {
        Covode.recordClassIndex(58085);
    }

    /* renamed from: c */
    private final C19064a<AbstractC18997c.AbstractC18998a> m92323c() {
        return (C19064a) this.f113293a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.d$a */
    static final class C49288a extends AbstractC89220m implements AbstractC89171a<C19064a<AbstractC18997c.AbstractC18998a>> {

        /* renamed from: a */
        public static final C49288a f113294a = new C49288a();

        static {
            Covode.recordClassIndex(58086);
        }

        C49288a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19064a<AbstractC18997c.AbstractC18998a> invoke() {
            return new C19064a();
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c
    public final boolean bq_() {
        return ActivityStack.isAppBackGround();
    }

    public C49287d() {
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.ActivityStack.AbstractC80170b
    /* renamed from: a */
    public final void mo69456a() {
        m92323c().mo30411a(C49289b.f113295a);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.ActivityStack.AbstractC80170b
    /* renamed from: b */
    public final void mo69457b() {
        m92323c().mo30411a(C49290c.f113296a);
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c
    public final void br_() {
        if (C17873f.f42636l) {
            Context a = C17867d.m33078a();
            Object a2 = m92322a(a, "activity");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) a2;
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                activityManager.moveTaskToFront(topActivity.getTaskId(), 0);
                return;
            }
            Intent launchIntentForPackage = a.getPackageManager().getLaunchIntentForPackage(a.getPackageName());
            if (launchIntentForPackage != null) {
                C84349a.m145093a(launchIntentForPackage, a);
                a.startActivity(launchIntentForPackage);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.d$c */
    static final class C49290c extends AbstractC89220m implements AbstractC89172b<AbstractC18997c.AbstractC18998a, C89391z> {

        /* renamed from: a */
        public static final C49290c f113296a = new C49290c();

        static {
            Covode.recordClassIndex(58088);
        }

        C49290c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC18997c.AbstractC18998a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.background.d$b */
    static final class C49289b extends AbstractC89220m implements AbstractC89172b<AbstractC18997c.AbstractC18998a, C89391z> {

        /* renamed from: a */
        public static final C49289b f113295a = new C49289b();

        static {
            Covode.recordClassIndex(58087);
        }

        C49289b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC18997c.AbstractC18998a aVar) {
            AbstractC18997c.AbstractC18998a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo29904c();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c
    /* renamed from: a */
    public final void mo30151a(AbstractC18997c.AbstractC18998a aVar) {
        C89219l.m154721d(aVar, "");
        m92323c().mo30412a(aVar);
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c
    /* renamed from: b */
    public final void mo30152b(AbstractC18997c.AbstractC18998a aVar) {
        C89219l.m154721d(aVar, "");
        m92323c().mo30413b(aVar);
    }

    /* renamed from: a */
    private static Object m92322a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3790);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(3790);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
