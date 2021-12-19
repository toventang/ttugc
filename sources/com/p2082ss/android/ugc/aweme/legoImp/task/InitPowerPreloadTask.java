package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17776a;
import com.bytedance.ies.powerpreload.C17782b;
import com.bytedance.ies.powerpreload.C17796c;
import com.bytedance.ies.powerpreload.C17807d;
import com.bytedance.ies.powerpreload.C17813e;
import com.bytedance.ies.powerpreload.C17814f;
import com.bytedance.ies.powerpreload.p1242a.C17778a;
import com.bytedance.ies.powerpreload.p1242a.C17779b;
import com.bytedance.ies.powerpreload.p1243b.C17795j;
import com.bytedance.ies.powerpreload.p1245d.C17808a;
import com.bytedance.ies.powerpreload.p1245d.C17811b;
import com.bytedance.ies.powerpreload.task.AbstractC17826d;
import com.bytedance.ies.powerpreload.task.AbstractRunnableC17828f;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.RouteManager;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.net.preload.C61454a;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61482f;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask */
public final class InitPowerPreloadTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C58345a f132860a = new C58345a((byte) 0);

    static {
        Covode.recordClassIndex(68483);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask$a */
    public static final class C58345a {
        static {
            Covode.recordClassIndex(68484);
        }

        private C58345a() {
        }

        public /* synthetic */ C58345a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask$b */
    public static final class C58346b extends AbsOpenResultCallback {
        static {
            Covode.recordClassIndex(68485);
        }

        C58346b() {
        }

        @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
        public final void onOpen(Intent intent) {
            C17808a a;
            super.onOpen(intent);
            if (intent != null) {
                intent.putExtra("EXTRA_PRELOAD_PAGE_START_TIME", SystemClock.elapsedRealtime());
                if (C61482f.m111327a()) {
                    T t = null;
                    if (C17796c.C17797a.m32994a() && (a = C17808a.C17809a.m32999a()) != null) {
                        C89219l.m154719c(intent, "");
                        C17811b bVar = a.f42501a;
                        C89219l.m154719c(intent, "");
                        C89219l.m154719c(intent, "");
                        Uri data = intent.getData();
                        ComponentName component = intent.getComponent();
                        String className = component != null ? component.getClassName() : null;
                        if ((data != null && data.isOpaque()) || !C17796c.C17797a.m32994a()) {
                            return;
                        }
                        if (data != null) {
                            if (className != null) {
                                String uri = data.toString();
                                C89219l.m154709a((Object) uri, "");
                                C89219l.m154719c(uri, "");
                                Uri parse = Uri.parse(uri);
                                String a2 = C89219l.m154704a(parse.getAuthority(), (Object) parse.getPath());
                                for (T t2 : C17813e.f42505a) {
                                    Iterator<T> it = t2.f42496e.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Uri parse2 = Uri.parse(it.next());
                                            if (C89219l.m154714a((Object) a2, (Object) C89219l.m154704a(parse2.getAuthority(), (Object) parse2.getPath()))) {
                                                List<String> list = t2.f42495d;
                                                List<String> list2 = t2.f42496e;
                                                String str = t2.f42497f;
                                                String str2 = t2.f42498g;
                                                C89219l.m154719c(list, "");
                                                C89219l.m154719c(list2, "");
                                                C17807d dVar = new C17807d(list, list2, str, str2);
                                                if (C89219l.m154714a((Object) dVar.f42497f, (Object) className)) {
                                                    try {
                                                        C17776a.m32979a(intent);
                                                        C17782b bVar2 = bVar.f42504a;
                                                        if (bVar2 == null) {
                                                            C89219l.m154710a("preloadProxy");
                                                        }
                                                        bVar2.mo28252a(dVar, C17811b.m33000a(intent));
                                                        return;
                                                    } catch (Exception e) {
                                                        C17778a.m32984a(e);
                                                        return;
                                                    }
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (className != null) {
                            C89219l.m154719c(className, "");
                            Iterator<T> it2 = C17813e.f42505a.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                T next = it2.next();
                                if (C89219l.m154714a((Object) next.f42497f, (Object) className)) {
                                    t = next;
                                    break;
                                }
                            }
                            T t3 = t;
                            if (t3 != null) {
                                try {
                                    C17776a.m32979a(intent);
                                    C17782b bVar3 = bVar.f42504a;
                                    if (bVar3 == null) {
                                        C89219l.m154710a("preloadProxy");
                                    }
                                    bVar3.mo28252a(t3, C17811b.m33000a(intent));
                                } catch (Exception e2) {
                                    C17778a.m32984a(e2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask$d */
    public static final class C58348d implements AbstractC17826d<AbstractC88403ab<?>> {

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask$d$a */
        static final class C58349a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ AbstractRunnableC17828f.AbstractC17829a f132862a;

            static {
                Covode.recordClassIndex(68488);
            }

            C58349a(AbstractRunnableC17828f.AbstractC17829a aVar) {
                this.f132862a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask$d$b */
        static final class C58350b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ AbstractRunnableC17828f.AbstractC17829a f132863a;

            static {
                Covode.recordClassIndex(68489);
            }

            C58350b(AbstractRunnableC17828f.AbstractC17829a aVar) {
                this.f132863a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(68487);
        }

        C58348d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.powerpreload.task.f$a] */
        @Override // com.bytedance.ies.powerpreload.task.AbstractC17826d
        /* renamed from: a */
        public final /* synthetic */ void mo28289a(AbstractC88403ab<?> abVar, AbstractRunnableC17828f.AbstractC17829a aVar) {
            AbstractC88403ab<?> abVar2 = abVar;
            C89219l.m154721d(abVar2, "");
            abVar2.mo142909a(C88946a.m154209a(C40780g.m82241a())).mo142924c(new C58349a(aVar)).mo142920b((AbstractC88433f<? super Object>) new C58350b(aVar)).mo142926c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask$e */
    public static final class C58351e implements AbstractC17826d<Future<?>> {
        static {
            Covode.recordClassIndex(68490);
        }

        C58351e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.powerpreload.task.f$a] */
        @Override // com.bytedance.ies.powerpreload.task.AbstractC17826d
        /* renamed from: a */
        public final /* synthetic */ void mo28289a(Future<?> future, AbstractRunnableC17828f.AbstractC17829a aVar) {
            Future<?> future2 = future;
            C89219l.m154721d(future2, "");
            future2.get();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask$c */
    static final class C58347c extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C58347c f132861a = new C58347c();

        static {
            Covode.recordClassIndex(68486);
        }

        C58347c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            ExecutorService a = C40780g.m82241a();
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        Application a = C17879g.m33104a();
        C89219l.m154716b(a, "");
        C17779b.C17780a aVar = new C17779b.C17780a(a);
        C58347c cVar = C58347c.f132861a;
        C89219l.m154719c(cVar, "");
        aVar.f42458c = cVar;
        IRetrofitFactory a2 = RetrofitFactory.m33635a();
        C89219l.m154716b(a2, "");
        C89219l.m154719c(a2, "");
        aVar.f42457b.f42474a = a2;
        aVar.f42456a = false;
        C17779b.C17780a a3 = aVar.mo28250a(AbstractC88403ab.class, new C58348d()).mo28250a(Future.class, new C58351e());
        if (a3.f42458c == null) {
            a3.f42458c = C17779b.C17780a.C17781a.f42461a;
        }
        Application application = a3.f42460e;
        boolean z = a3.f42456a;
        C17795j jVar = a3.f42457b;
        AbstractC89171a<? extends ExecutorService> aVar2 = a3.f42458c;
        if (aVar2 == null) {
            C89219l.m154707a();
        }
        C17779b bVar = new C17779b(application, z, jVar, aVar2, a3.f42459d, (byte) 0);
        C89219l.m154719c(bVar, "");
        C17796c cVar2 = (C17796c) new C17814f(new C17796c.C17797a.C17798a(bVar)).mo28277a(bVar);
        C89219l.m154719c(cVar2, "");
        C17796c.f42476a = cVar2;
        bVar.f42454d.invoke().execute(C17796c.C17797a.RunnableC17799b.f42483a);
        if (C17796c.f42476a == null) {
            C89219l.m154710a("instance");
        }
        C61454a.f139507b = new C61454a.C61455a();
        RouteManager.getInstance().addGlobalResultCallback(new C58346b());
    }
}
