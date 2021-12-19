package com.p4501vk.api.sdk;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p4501vk.api.sdk.internal.AbstractC87900a;
import com.p4501vk.api.sdk.p4502a.C87821a;
import com.p4501vk.api.sdk.p4502a.C87825c;
import com.p4501vk.api.sdk.p4504c.C87854b;
import com.p4501vk.api.sdk.p4506e.C87875a;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.VK */
public final class C87816VK {

    /* renamed from: a */
    public static C87831b f199480a;

    /* renamed from: b */
    public static C87860d f199481b;

    /* renamed from: c */
    public static C87825c f199482c;

    /* renamed from: d */
    static final ArrayList<Object> f199483d = new ArrayList<>();

    /* renamed from: e */
    public static final C87816VK f199484e = new C87816VK();

    /* renamed from: f */
    private static int f199485f;

    private C87816VK() {
    }

    /* renamed from: a */
    public static final boolean m152827a() {
        C87825c cVar = f199482c;
        if (cVar == null) {
            C89219l.m154710a("authManager");
        }
        return cVar.mo142299a();
    }

    /* renamed from: b */
    public static void m152829b() {
        m152826a(new C87875a("stats.trackVisitor"));
    }

    static {
        Covode.recordClassIndex(103826);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.vk.api.sdk.VK$a */
    public static final class RunnableC87817a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC87900a f199486a;

        /* renamed from: b */
        final /* synthetic */ AbstractC87820a f199487b = null;

        static {
            Covode.recordClassIndex(103827);
        }

        RunnableC87817a(AbstractC87900a aVar) {
            this.f199486a = aVar;
        }

        public final void run() {
            try {
                AbstractC87900a aVar = this.f199486a;
                C89219l.m154719c(aVar, "");
                C87860d dVar = C87816VK.f199481b;
                if (dVar == null) {
                    C89219l.m154710a("apiManager");
                }
                final Object a = aVar.mo142383a(dVar);
                C87912l.m152930a(new Runnable(this) {
                    /* class com.p4501vk.api.sdk.C87816VK.RunnableC87817a.RunnableC878181 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC87817a f199488a;

                    static {
                        Covode.recordClassIndex(103828);
                    }

                    {
                        this.f199488a = r1;
                    }

                    public final void run() {
                    }
                });
            } catch (Exception e) {
                C87912l.m152930a(new Runnable(this) {
                    /* class com.p4501vk.api.sdk.C87816VK.RunnableC87817a.RunnableC878192 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC87817a f199490a;

                    static {
                        Covode.recordClassIndex(103829);
                    }

                    {
                        this.f199490a = r1;
                    }

                    public final void run() {
                        Exception exc = e;
                        if ((exc instanceof C87854b) && ((C87854b) exc).isInvalidCredentialsError()) {
                            C87825c cVar = C87816VK.f199482c;
                            if (cVar == null) {
                                C89219l.m154710a("authManager");
                            }
                            C87821a.C87822a.m152833a(cVar.f199506a);
                            Iterator<T> it = C87816VK.f199483d.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static final void m152824a(Context context) {
        C89219l.m154719c(context, "");
        m152825a(new C87831b(context, m152828b(context), new C87895g(context)));
        if (m152827a()) {
            m152829b();
        }
    }

    /* renamed from: a */
    private static void m152825a(C87831b bVar) {
        C89219l.m154719c(bVar, "");
        f199480a = bVar;
        f199481b = new C87860d(bVar);
        C87825c cVar = new C87825c(bVar.f199531q);
        f199482c = cVar;
        C87821a b = C87821a.C87822a.m152834b(cVar.f199506a);
        if (b != null) {
            C87860d dVar = f199481b;
            if (dVar == null) {
                C89219l.m154710a("apiManager");
            }
            dVar.mo142340a(b.f199495b, b.f199496c);
        }
    }

    /* renamed from: b */
    public static final int m152828b(Context context) {
        int i;
        C89219l.m154719c(context, "");
        int i2 = f199485f;
        if (i2 != 0) {
            return i2;
        }
        try {
            i = m152823a(context.getResources(), context.getResources().getIdentifier("com_vk_sdk_AppId", "integer", context.getPackageName()));
        } catch (Exception unused) {
            i = 0;
        }
        f199485f = i;
        if (i != 0) {
            return i;
        }
        throw new RuntimeException("<integer name=\"com_vk_sdk_AppId\">your_app_id</integer> is not found in your resources.xml");
    }

    /* renamed from: a */
    private static /* synthetic */ void m152826a(AbstractC87900a aVar) {
        C89219l.m154719c(aVar, "");
        C87912l.m152929a().submit(new RunnableC87817a(aVar));
    }

    /* renamed from: a */
    private static int m152823a(Resources resources, int i) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }
}
