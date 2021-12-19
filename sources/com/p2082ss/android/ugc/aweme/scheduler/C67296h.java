package com.p2082ss.android.ugc.aweme.scheduler;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scheduler.C67327j;
import com.p2082ss.android.ugc.aweme.scheduler.RunnableC67311i;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C70646dq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.h */
public final class C67296h {

    /* renamed from: a */
    public static final C67334l f150793a = new C67334l(1, 1, true, true);

    /* renamed from: b */
    public static final ExecutorService f150794b;

    /* renamed from: c */
    static final ReentrantLock f150795c = new ReentrantLock();

    /* renamed from: d */
    static String f150796d;

    /* renamed from: e */
    static final ArrayList<AbstractC72639k> f150797e = new ArrayList<>();

    /* renamed from: f */
    public static AbstractC67290d f150798f;

    /* renamed from: g */
    static volatile RunnableC67311i f150799g;

    /* renamed from: h */
    public static final C67296h f150800h = new C67296h();

    /* renamed from: i */
    private static final boolean f150801i = SettingsManager.m29616a().mo25400a("enable_new_publish_when_null_id", false);

    /* renamed from: j */
    private static final boolean f150802j = SettingsManager.m29616a().mo25400a("enable_all_schedule_alog", false);

    /* renamed from: k */
    private static final C67291e f150803k = new C67291e();

    /* renamed from: l */
    private static final ParallelPublishCallback f150804l;

    private C67296h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$a */
    public static final class RunnableC67297a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC72639k f150805a;

        /* renamed from: b */
        final /* synthetic */ String f150806b;

        static {
            Covode.recordClassIndex(78920);
        }

        RunnableC67297a(AbstractC72639k kVar, String str) {
            this.f150805a = kVar;
            this.f150806b = str;
        }

        public final void run() {
            C67296h.m119239b(this.f150805a, this.f150806b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$d */
    static final class RunnableC67300d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RunnableC67311i f150811a;

        static {
            Covode.recordClassIndex(78923);
        }

        RunnableC67300d(RunnableC67311i iVar) {
            this.f150811a = iVar;
        }

        public final void run() {
            RunnableC67311i iVar = this.f150811a;
            if (iVar != null) {
                iVar.mo106147b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$c */
    public static final class RunnableC67299c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC72639k f150810a;

        static {
            Covode.recordClassIndex(78922);
        }

        RunnableC67299c(AbstractC72639k kVar) {
            this.f150810a = kVar;
        }

        public final void run() {
            RunnableC67311i iVar = C67296h.f150799g;
            if (iVar != null) {
                iVar.mo106142a(this.f150810a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$h */
    static final class C67304h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C67304h f150815a = new C67304h();

        static {
            Covode.recordClassIndex(78927);
        }

        C67304h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC67290d dVar = C67296h.f150798f;
            if (dVar != null) {
                dVar.mo106126a();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$i */
    public static final class RunnableC67305i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72678q f150816a;

        /* renamed from: b */
        final /* synthetic */ RunnableC67311i f150817b;

        static {
            Covode.recordClassIndex(78928);
        }

        RunnableC67305i(C72678q qVar, RunnableC67311i iVar) {
            this.f150816a = qVar;
            this.f150817b = iVar;
        }

        public final void run() {
            this.f150817b.f150829a.mo106151a(this.f150816a);
            this.f150817b.mo106141a();
        }
    }

    /* renamed from: f */
    public static final int m119246f() {
        if (C68747m.m121180a()) {
            return C67327j.f150875b.mo106168b();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$j */
    static final class RunnableC67306j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f150818a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72639k f150819b;

        static {
            Covode.recordClassIndex(78929);
        }

        RunnableC67306j(String str, AbstractC72639k kVar) {
            this.f150818a = str;
            this.f150819b = kVar;
        }

        public final void run() {
            C67327j jVar = C67327j.f150875b;
            String str = this.f150818a;
            if (str == null) {
                C89219l.m154715b();
            }
            AbstractC72639k kVar = this.f150819b;
            ExecutorService executorService = C67296h.f150794b;
            C89219l.m154716b(executorService, "");
            jVar.mo106165a(str, kVar, executorService);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$l */
    public static final class RunnableC67308l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC74304x f150822a;

        /* renamed from: b */
        final /* synthetic */ String f150823b = null;

        static {
            Covode.recordClassIndex(78931);
        }

        public RunnableC67308l(AbstractC74304x xVar) {
            this.f150822a = xVar;
        }

        public final void run() {
            RunnableC67311i iVar = C67296h.f150799g;
            if (iVar != null) {
                iVar.mo106144a(this.f150822a);
            }
            C67327j jVar = C67327j.f150875b;
            String str = this.f150823b;
            AbstractC74304x<C69831ai> xVar = this.f150822a;
            ExecutorService executorService = C67296h.f150794b;
            C89219l.m154716b(executorService, "");
            jVar.mo106166a(str, xVar, executorService);
        }
    }

    /* renamed from: c */
    public static final void m119241c() {
        RunnableC67311i iVar;
        if (C68747m.m121180a() && (iVar = f150799g) != null) {
            f150794b.execute(new RunnableC67303g(iVar));
        }
    }

    /* renamed from: d */
    public static final void m119244d() {
        if (C68747m.m121180a()) {
            C67327j jVar = C67327j.f150875b;
            ExecutorService executorService = f150794b;
            C89219l.m154716b(executorService, "");
            jVar.mo106167a(executorService);
            return;
        }
        f150794b.execute(new RunnableC67302f(null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$b */
    public static final class RunnableC67298b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RunnableC67311i.C67312a f150807a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72685x f150808b;

        /* renamed from: c */
        final /* synthetic */ AbstractC72639k f150809c;

        static {
            Covode.recordClassIndex(78921);
        }

        RunnableC67298b(RunnableC67311i.C67312a aVar, AbstractC72685x xVar, AbstractC72639k kVar) {
            this.f150807a = aVar;
            this.f150808b = xVar;
            this.f150809c = kVar;
        }

        public final void run() {
            this.f150809c.onFinish(((AbstractC72685x.C72686a) this.f150808b).f162960a, ((AbstractC72685x.C72686a) this.f150808b).f162961b);
            C73991bj.m130133d("PublishScheduler | addCallback direct finish " + this.f150807a.f150839a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$g */
    public static final class RunnableC67303g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RunnableC67311i f150814a;

        static {
            Covode.recordClassIndex(78926);
        }

        RunnableC67303g(RunnableC67311i iVar) {
            this.f150814a = iVar;
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            this.f150814a.mo106147b();
            C67296h.f150795c.lock();
            try {
                C67296h.f150797e.clear();
                C67296h.f150796d = null;
                C67296h.f150795c.unlock();
                C67296h.f150799g = null;
            } catch (Throwable th) {
                C67296h.f150795c.unlock();
                throw th;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$k */
    static final class RunnableC67307k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f150820a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72639k f150821b;

        static {
            Covode.recordClassIndex(78930);
        }

        RunnableC67307k(String str, AbstractC72639k kVar) {
            this.f150820a = str;
            this.f150821b = kVar;
        }

        public final void run() {
            Iterator<T> it = C67296h.f150793a.mo106182b(this.f150820a).iterator();
            while (it.hasNext()) {
                RunnableC67311i iVar = it.next().f150843e;
                if (iVar != null) {
                    iVar.mo106148b(this.f150821b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$m */
    public static final class RunnableC67309m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f150824a = null;

        /* renamed from: b */
        final /* synthetic */ AbstractC74304x f150825b;

        static {
            Covode.recordClassIndex(78932);
        }

        public RunnableC67309m(AbstractC74304x xVar) {
            this.f150825b = xVar;
        }

        public final void run() {
            Iterator<T> it = C67296h.f150793a.mo106182b(this.f150824a).iterator();
            while (it.hasNext()) {
                RunnableC67311i iVar = it.next().f150843e;
                if (iVar != null) {
                    iVar.mo106144a(this.f150825b);
                }
            }
        }
    }

    /* renamed from: b */
    public static final RunnableC67311i m119237b() {
        if (C68747m.m121180a()) {
            RunnableC67311i iVar = f150799g;
            f150799g = null;
            f150794b.execute(new RunnableC67300d(iVar));
            return iVar;
        }
        f150794b.execute(new RunnableC67301e());
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$e */
    static final class RunnableC67301e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f150812a = null;

        static {
            Covode.recordClassIndex(78924);
        }

        RunnableC67301e() {
        }

        public final void run() {
            List<RunnableC67311i.C67312a> b = C67296h.f150793a.mo106182b(this.f150812a);
            ArrayList<RunnableC67311i.C67312a> arrayList = new ArrayList();
            for (T t : b) {
                if (!(t.f150840b instanceof AbstractC72685x.C72686a)) {
                    arrayList.add(t);
                }
            }
            for (RunnableC67311i.C67312a aVar : arrayList) {
                RunnableC67311i iVar = aVar.f150843e;
                if (iVar != null) {
                    iVar.mo106147b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$f */
    public static final class RunnableC67302f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f150813a = null;

        static {
            Covode.recordClassIndex(78925);
        }

        RunnableC67302f(String str) {
        }

        public final void run() {
            List<RunnableC67311i.C67312a> b = C67296h.f150793a.mo106182b(this.f150813a);
            ArrayList<RunnableC67311i.C67312a> arrayList = new ArrayList();
            for (T t : b) {
                if (!(t.f150840b instanceof AbstractC72685x.C72686a)) {
                    arrayList.add(t);
                }
            }
            for (RunnableC67311i.C67312a aVar : arrayList) {
                RunnableC67311i iVar = aVar.f150843e;
                if (iVar != null) {
                    iVar.mo106147b();
                }
            }
        }
    }

    static {
        ParallelPublishCallback parallelPublishCallback;
        Covode.recordClassIndex(78919);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
        a.f95504b = "PublishScheduler";
        f150794b = C40780g.m82242a(a.mo70028a());
        if (C68747m.m121182c()) {
            parallelPublishCallback = new ParallelPublishCallback(C67304h.f150815a);
        } else {
            parallelPublishCallback = new ParallelPublishCallback(null, 1, null);
        }
        f150804l = parallelPublishCallback;
    }

    /* renamed from: e */
    public static final boolean m119245e() {
        boolean z = false;
        if (!C68747m.m121180a()) {
            List<RunnableC67311i.C67312a> b = f150793a.mo106182b(null);
            if (!(b instanceof Collection) || !b.isEmpty()) {
                Iterator<T> it = b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(it.next().f150840b instanceof AbstractC72685x.C72686a)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            C73991bj.m130133d("PublishScheduler | isPublishing publishId:" + ((String) null) + " result:" + z);
            return z;
        } else if (!C67327j.f150875b.mo106170c() && f150799g == null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    public static final synchronized void m119247g() {
        synchronized (C67296h.class) {
            MethodCollector.m26663i(7061);
            if (!C67327j.f150875b.mo106170c()) {
                MethodCollector.m26664o(7061);
            } else if (C68747m.m121182c()) {
                C67295g.m119228a("PublishScheduler force pause");
                C67327j.f150875b.mo106163a(C67327j.C67332e.f150888a);
                MethodCollector.m26664o(7061);
            } else {
                if (C68747m.m121181b()) {
                    C67295g.m119228a("PublishScheduler force cancel");
                    m119244d();
                }
                MethodCollector.m26664o(7061);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.h$n */
    public static final class RunnableC67310n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RunnableC67311i.C67312a f150826a;

        /* renamed from: b */
        final /* synthetic */ String f150827b;

        /* renamed from: c */
        final /* synthetic */ C72678q f150828c;

        static {
            Covode.recordClassIndex(78933);
        }

        RunnableC67310n(RunnableC67311i.C67312a aVar, String str, C72678q qVar) {
            this.f150826a = aVar;
            this.f150827b = str;
            this.f150828c = qVar;
        }

        public final void run() {
            RunnableC67311i iVar;
            this.f150826a.mo106151a(this.f150828c);
            AbstractC72685x xVar = this.f150826a.f150840b;
            if (xVar instanceof AbstractC72685x.C72687b) {
                C67296h.m119240b("ReStartNewPublish " + this.f150827b);
            } else if (xVar instanceof AbstractC72685x.C72686a) {
                AbstractC72623d dVar = ((AbstractC72685x.C72686a) xVar).f162960a;
                if (dVar instanceof AbstractC72623d.C72626c) {
                    C67296h.m119240b("ReStartAlreadySuccessPublish " + this.f150827b);
                } else if (dVar instanceof AbstractC72623d.C72624a) {
                    C73991bj.m130128a("PublishScheduler | reStart Cancel Publish, reStart new. old:" + this.f150827b + " new:" + C67296h.m119232a(this.f150828c));
                } else if (dVar instanceof AbstractC72623d.C72625b) {
                    C73991bj.m130128a("PublishScheduler | reStart Failed Publish, reStart new. old:" + this.f150827b + " new:" + C67296h.m119232a(this.f150828c));
                }
            } else if ((xVar instanceof AbstractC72685x.C72689d) && (iVar = this.f150826a.f150843e) != null) {
                iVar.mo106141a();
            }
        }
    }

    /* renamed from: a */
    public static final synchronized void m119234a() {
        synchronized (C67296h.class) {
            MethodCollector.m26663i(10766);
            if (C67327j.f150875b.mo106168b() > 0) {
                if (C67327j.f150875b.mo106170c()) {
                    C67295g.m119228a("PublishSchedule startCacheTask taskIsRunning");
                    MethodCollector.m26664o(10766);
                    return;
                }
                if (C68747m.m121182c()) {
                    List<RunnableC67311i.C67312a> list = C67327j.f150874a;
                    C89219l.m154716b(list, "");
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().f150840b instanceof AbstractC72685x.C72688c) {
                            C67295g.m119228a("PublishSchedule startCacheTask PublishTaskList.taskResume");
                            List<RunnableC67311i.C67312a> list2 = C67327j.f150874a;
                            C89219l.m154716b(list2, "");
                            for (T t : list2) {
                                if (t.f150840b instanceof AbstractC72685x.C72688c) {
                                    C73991bj.m130128a("PublishParallel taskResume id=" + t.f150839a);
                                    RunnableC67311i iVar = t.f150843e;
                                    if (iVar != null) {
                                        if (iVar.f150833e) {
                                            C67295g.m119228a("PublishParallel PublishTask(" + iVar.f150829a.f150839a + ") invoke resume");
                                            AbstractC67289c cVar = iVar.f150831c;
                                            if (cVar != null) {
                                                cVar.mo106125d();
                                            }
                                            iVar.f150833e = false;
                                        }
                                        MethodCollector.m26664o(10766);
                                        return;
                                    }
                                    MethodCollector.m26664o(10766);
                                    return;
                                }
                            }
                            MethodCollector.m26664o(10766);
                            return;
                        }
                    }
                }
                RunnableC67311i.C67312a a = C67327j.f150875b.mo106160a();
                if (a != null && a.f150843e == null) {
                    C72678q qVar = a.f150844f;
                    boolean z = f150802j;
                    C67291e eVar = f150803k;
                    C67334l lVar = f150793a;
                    ExecutorService executorService = f150794b;
                    C89219l.m154716b(executorService, "");
                    RunnableC67311i iVar2 = new RunnableC67311i("PublishScheduler", qVar, z, eVar, lVar, executorService);
                    C89219l.m154721d(a, "");
                    iVar2.f150829a = a;
                    C67295g.m119228a("PublishParallel startCacheTask new task  id=" + a.f150839a);
                    a.f150843e = iVar2;
                }
                f150795c.lock();
                RunnableC67311i iVar3 = null;
                if (a != null) {
                    try {
                        if (C89219l.m154714a((Object) f150796d, (Object) a.f150839a)) {
                            StringBuilder sb = new StringBuilder("PublishParallel startCacheTask oldPublishRecord.addcallback=");
                            ArrayList<AbstractC72639k> arrayList = f150797e;
                            C67295g.m119228a(sb.append(arrayList.size()).toString());
                            for (T t2 : arrayList) {
                                RunnableC67311i iVar4 = a.f150843e;
                                if (iVar4 == null) {
                                    C89219l.m154715b();
                                }
                                iVar4.mo106142a((AbstractC72639k) t2);
                            }
                            f150796d = null;
                            StringBuilder sb2 = new StringBuilder("cancelTaskCallbackList  size=");
                            ArrayList<AbstractC72639k> arrayList2 = f150797e;
                            C67295g.m119228a(sb2.append(arrayList2.size()).toString());
                            arrayList2.clear();
                        }
                    } catch (Throwable th) {
                        f150795c.unlock();
                        MethodCollector.m26664o(10766);
                        throw th;
                    }
                }
                f150795c.unlock();
                C67295g.m119228a(new StringBuilder("PublishParallel startCacheTask execute task id=").append(a != null ? a.f150839a : null).toString());
                ExecutorService executorService2 = f150794b;
                if (a != null) {
                    iVar3 = a.f150843e;
                }
                executorService2.execute(iVar3);
            }
            MethodCollector.m26664o(10766);
        }
    }

    /* renamed from: a */
    public static final C72678q m119229a(String str) {
        if (C68747m.m121180a()) {
            return C67327j.f150875b.mo106161a(str);
        }
        RunnableC67311i.C67312a a = f150793a.mo106178a(str);
        if (a != null) {
            return a.f150844f;
        }
        return null;
    }

    /* renamed from: b */
    public static final Bitmap m119236b(C72678q qVar) {
        C89219l.m154721d(qVar, "");
        if (!(qVar.f162938k instanceof VideoPublishEditModel)) {
            return null;
        }
        BaseShortVideoContext baseShortVideoContext = qVar.f162938k;
        Objects.requireNonNull(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        return C70646dq.m124867a((VideoPublishEditModel) baseShortVideoContext);
    }

    /* renamed from: c */
    public static void m119243c(String str) {
        C89219l.m154721d(str, "");
        C73991bj.m130133d("PublishScheduler | ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public static final synchronized String m119230a(Bundle bundle) {
        String str;
        synchronized (C67296h.class) {
            MethodCollector.m26663i(9834);
            C89219l.m154721d(bundle, "");
            C73991bj.m130128a("PublishScheduler addPublishTask");
            C72678q a = C67286a.m119212a(bundle);
            if ((a.f162938k instanceof VideoPublishEditModel) && C68747m.m121180a()) {
                C63244g.m114602a().mo73287o().mo104793m().mo104827b(a.f162938k.getDraftPrimaryKey());
            }
            boolean z = f150802j;
            C67291e eVar = f150803k;
            C67334l lVar = f150793a;
            ExecutorService executorService = f150794b;
            C89219l.m154716b(executorService, "");
            RunnableC67311i iVar = new RunnableC67311i("PublishScheduler", a, z, eVar, lVar, executorService);
            iVar.mo106142a(f150804l);
            C73991bj.m130128a("ParallelPublish  PublishScheduler  addPublishTask id=" + iVar.f150829a.f150839a);
            C67327j.f150875b.mo106162a(iVar.f150829a);
            str = iVar.f150829a.f150839a;
            MethodCollector.m26664o(9834);
        }
        return str;
    }

    /* renamed from: c */
    public static final void m119242c(Bundle bundle) {
        String str;
        RunnableC67311i.C67312a aVar;
        C89219l.m154721d(bundle, "");
        if (m119246f() == 0) {
            C72678q a = C67286a.m119212a(bundle);
            boolean z = f150802j;
            C67291e eVar = f150803k;
            C67334l lVar = f150793a;
            ExecutorService executorService = f150794b;
            C89219l.m154716b(executorService, "");
            RunnableC67311i iVar = new RunnableC67311i("PublishScheduler", a, z, eVar, lVar, executorService);
            f150799g = iVar;
            iVar.mo106142a(f150804l);
            StringBuilder sb = new StringBuilder("PublishParallel PublishScheduler PrePublishTask id=");
            RunnableC67311i iVar2 = f150799g;
            if (iVar2 == null || (aVar = iVar2.f150829a) == null) {
                str = null;
            } else {
                str = aVar.f150839a;
            }
            C67295g.m119228a(sb.append(str).toString());
            executorService.execute(f150799g);
        }
    }

    /* renamed from: a */
    public static String m119232a(C72678q qVar) {
        boolean z = f150802j;
        C67291e eVar = f150803k;
        C67334l lVar = f150793a;
        ExecutorService executorService = f150794b;
        C89219l.m154716b(executorService, "");
        RunnableC67311i iVar = new RunnableC67311i("PublishScheduler", qVar, z, eVar, lVar, executorService);
        if (!lVar.mo106181a(iVar.f150829a)) {
            return null;
        }
        executorService.execute(iVar);
        C73991bj.m130128a("PublishScheduler | startNewPublish creationId:" + qVar.f162929b + ' ' + "publishId:" + iVar.f150829a.f150839a);
        return iVar.f150829a.f150839a;
    }

    /* renamed from: b */
    public static final synchronized String m119238b(Bundle bundle) {
        String str;
        RunnableC67311i.C67312a aVar;
        synchronized (C67296h.class) {
            MethodCollector.m26663i(10139);
            C89219l.m154721d(bundle, "");
            RunnableC67311i iVar = f150799g;
            if (iVar == null) {
                MethodCollector.m26664o(10139);
                return "";
            }
            f150799g = null;
            C67327j.f150875b.mo106162a(iVar.f150829a);
            C72678q a = C67286a.m119212a(bundle);
            StringBuilder sb = new StringBuilder("ParallelPublish startPreStartTask execute task id=");
            RunnableC67311i iVar2 = f150799g;
            if (iVar2 == null || (aVar = iVar2.f150829a) == null) {
                str = null;
            } else {
                str = aVar.f150839a;
            }
            C73991bj.m130128a(sb.append(str).toString());
            f150795c.lock();
            try {
                if (C89219l.m154714a((Object) f150796d, (Object) iVar.f150829a.f150839a)) {
                    Iterator<T> it = f150797e.iterator();
                    while (it.hasNext()) {
                        iVar.mo106142a((AbstractC72639k) it.next());
                    }
                    f150796d = null;
                    StringBuilder sb2 = new StringBuilder("cancelTaskCallbackList  size=");
                    ArrayList<AbstractC72639k> arrayList = f150797e;
                    C73991bj.m130128a(sb2.append(arrayList.size()).toString());
                    arrayList.clear();
                }
                f150795c.unlock();
                f150794b.execute(new RunnableC67305i(a, iVar));
                String str2 = iVar.f150829a.f150839a;
                MethodCollector.m26664o(10139);
                return str2;
            } catch (Throwable th) {
                f150795c.unlock();
                MethodCollector.m26664o(10139);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static final void m119240b(String str) {
        C89219l.m154721d(str, "");
        C73991bj.m130131b("PublishScheduler | ".concat(String.valueOf(str)));
        C40971f.m82489a("PublishScheduler|".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public static final String m119231a(Bundle bundle, String str) {
        C89219l.m154721d(bundle, "");
        return f150800h.m119233a(C67286a.m119212a(bundle), str);
    }

    /* renamed from: a */
    public static final void m119235a(AbstractC72639k kVar, String str) {
        C89219l.m154721d(kVar, "");
        C73991bj.m130133d("PublishScheduler | addCallback call ".concat(String.valueOf(str)));
        f150794b.execute(new RunnableC67297a(kVar, str));
    }

    /* renamed from: b */
    public static void m119239b(AbstractC72639k kVar, String str) {
        String str2;
        RunnableC67311i.C67312a aVar;
        C89219l.m154721d(kVar, "");
        if (!C68747m.m121180a()) {
            RunnableC67311i.C67312a a = f150793a.mo106178a(str);
            if (a != null) {
                AbstractC72685x xVar = a.f150840b;
                if (xVar instanceof AbstractC72685x.C72686a) {
                    ExecutorC34605m.f81660a.execute(new RunnableC67298b(a, xVar, kVar));
                    return;
                }
                RunnableC67311i iVar = a.f150843e;
                if (iVar != null) {
                    iVar.mo106142a(kVar);
                    C73991bj.m130133d("PublishScheduler | addCallback success " + a.f150839a);
                }
            }
        } else if (str != null) {
            RunnableC67311i iVar2 = f150799g;
            if (iVar2 == null || (aVar = iVar2.f150829a) == null) {
                str2 = null;
            } else {
                str2 = aVar.f150839a;
            }
            if (C89219l.m154714a((Object) str2, (Object) str)) {
                f150794b.execute(new RunnableC67299c(kVar));
            }
            C67327j.f150875b.mo106164a(str, kVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.String m119233a(com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.scheduler.C67296h.m119233a(com.ss.android.ugc.aweme.shortvideo.publish.q, java.lang.String):java.lang.String");
    }
}
