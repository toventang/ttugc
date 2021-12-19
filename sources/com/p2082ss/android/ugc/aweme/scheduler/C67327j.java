package com.p2082ss.android.ugc.aweme.scheduler;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.scheduler.RunnableC67311i;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.j */
public final class C67327j {

    /* renamed from: a */
    static final List<RunnableC67311i.C67312a> f150874a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public static final C67327j f150875b = new C67327j();

    private C67327j() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.j$b */
    public static final class RunnableC67329b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RunnableC67311i.C67312a f150879a;

        /* renamed from: b */
        final /* synthetic */ String f150880b;

        /* renamed from: c */
        final /* synthetic */ ExecutorService f150881c;

        /* renamed from: d */
        final /* synthetic */ AbstractC72639k f150882d;

        static {
            Covode.recordClassIndex(78952);
        }

        RunnableC67329b(RunnableC67311i.C67312a aVar, String str, ExecutorService executorService, AbstractC72639k kVar) {
            this.f150879a = aVar;
            this.f150880b = str;
            this.f150881c = executorService;
            this.f150882d = kVar;
        }

        public final void run() {
            RunnableC67311i iVar = this.f150879a.f150843e;
            if (iVar != null) {
                iVar.mo106148b(this.f150882d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.j$c */
    public static final class RunnableC67330c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RunnableC67311i.C67312a f150883a;

        /* renamed from: b */
        final /* synthetic */ String f150884b;

        /* renamed from: c */
        final /* synthetic */ ExecutorService f150885c;

        /* renamed from: d */
        final /* synthetic */ AbstractC74304x f150886d;

        static {
            Covode.recordClassIndex(78953);
        }

        RunnableC67330c(RunnableC67311i.C67312a aVar, String str, ExecutorService executorService, AbstractC74304x xVar) {
            this.f150883a = aVar;
            this.f150884b = str;
            this.f150885c = executorService;
            this.f150886d = xVar;
        }

        public final void run() {
            RunnableC67311i iVar = this.f150883a.f150843e;
            if (iVar != null) {
                iVar.mo106144a(this.f150886d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.j$a */
    public static final class RunnableC67328a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f150876a;

        /* renamed from: b */
        final /* synthetic */ ExecutorService f150877b;

        /* renamed from: c */
        final /* synthetic */ AbstractC74304x f150878c;

        static {
            Covode.recordClassIndex(78951);
        }

        RunnableC67328a(List list, ExecutorService executorService, AbstractC74304x xVar) {
            this.f150876a = list;
            this.f150877b = executorService;
            this.f150878c = xVar;
        }

        public final void run() {
            for (RunnableC67311i iVar : this.f150876a) {
                if (iVar != null) {
                    iVar.mo106144a(this.f150878c);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(78950);
    }

    /* renamed from: b */
    public final synchronized int mo106168b() {
        int size;
        MethodCollector.m26663i(8368);
        size = f150874a.size();
        MethodCollector.m26664o(8368);
        return size;
    }

    /* renamed from: a */
    public final synchronized RunnableC67311i.C67312a mo106160a() {
        MethodCollector.m26663i(7800);
        List<RunnableC67311i.C67312a> list = f150874a;
        if (list.size() > 0) {
            RunnableC67311i.C67312a aVar = list.get(0);
            MethodCollector.m26664o(7800);
            return aVar;
        }
        MethodCollector.m26664o(7800);
        return null;
    }

    /* renamed from: c */
    public final synchronized boolean mo106170c() {
        MethodCollector.m26663i(8370);
        List<RunnableC67311i.C67312a> list = f150874a;
        C89219l.m154716b(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f150840b instanceof AbstractC72685x.C72689d) {
                MethodCollector.m26664o(8370);
                return true;
            }
        }
        MethodCollector.m26664o(8370);
        return false;
    }

    /* renamed from: d */
    public final synchronized ArrayList<String> mo106171d() {
        ArrayList<String> arrayList;
        MethodCollector.m26663i(8372);
        arrayList = new ArrayList<>();
        List<RunnableC67311i.C67312a> list = f150874a;
        C89219l.m154716b(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String draftPrimaryKey = it.next().f150844f.f162938k.getDraftPrimaryKey();
            if (draftPrimaryKey == null) {
                draftPrimaryKey = "";
            }
            arrayList.add(draftPrimaryKey);
        }
        MethodCollector.m26664o(8372);
        return arrayList;
    }

    /* renamed from: f */
    public final synchronized String mo106173f() {
        T t;
        String str;
        MethodCollector.m26663i(8821);
        List<RunnableC67311i.C67312a> list = f150874a;
        C89219l.m154716b(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f150840b instanceof AbstractC72685x.C72689d) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (str = t2.f150839a) == null) {
            str = "";
        }
        MethodCollector.m26664o(8821);
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.j$d */
    public static final class RunnableC67331d implements Runnable {

        /* renamed from: a */
        public static final RunnableC67331d f150887a = new RunnableC67331d();

        static {
            Covode.recordClassIndex(78954);
        }

        RunnableC67331d() {
        }

        public final void run() {
            List<RunnableC67311i.C67312a> list = C67327j.f150874a;
            C89219l.m154716b(list, "");
            for (T t : list) {
                AbstractC72685x xVar = t.f150840b;
                if (xVar instanceof AbstractC72685x.C72689d) {
                    if (((AbstractC72685x.C72689d) xVar).f162964a < 60) {
                        C67295g.m119228a("PublishParallel cancelPublish id=" + t.f150839a);
                        RunnableC67311i iVar = t.f150843e;
                        if (iVar != null) {
                            iVar.mo106147b();
                        }
                    } else {
                        C67295g.m119228a("PublishParallel cancelPublish id=" + t.f150839a + " can't pause because its progress >= 60");
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final synchronized List<C72678q> mo106172e() {
        ArrayList arrayList;
        MethodCollector.m26663i(8668);
        arrayList = new ArrayList();
        List<RunnableC67311i.C67312a> list = f150874a;
        C89219l.m154716b(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f150844f);
        }
        C73991bj.m130128a("getAllPublishModel size=" + arrayList.size());
        MethodCollector.m26664o(8668);
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo106162a(RunnableC67311i.C67312a aVar) {
        MethodCollector.m26663i(7647);
        C89219l.m154721d(aVar, "");
        f150874a.add(aVar);
        MethodCollector.m26664o(7647);
    }

    /* renamed from: b */
    public final synchronized boolean mo106169b(RunnableC67311i.C67312a aVar) {
        boolean remove;
        MethodCollector.m26663i(7798);
        C89219l.m154721d(aVar, "");
        remove = f150874a.remove(aVar);
        MethodCollector.m26664o(7798);
        return remove;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.j$e */
    public static final class C67332e extends AbstractC89220m implements AbstractC89172b<RunnableC67311i.C67312a, C89391z> {

        /* renamed from: a */
        public static final C67332e f150888a = new C67332e();

        static {
            Covode.recordClassIndex(78955);
        }

        C67332e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RunnableC67311i.C67312a aVar) {
            RunnableC67311i.C67312a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            AbstractC72685x xVar = aVar2.f150840b;
            if (xVar instanceof AbstractC72685x.C72689d) {
                if (((AbstractC72685x.C72689d) xVar).f162964a < 60) {
                    C67295g.m119228a("PublishParallel taskPause id=" + aVar2.f150839a);
                    RunnableC67311i iVar = aVar2.f150843e;
                    if (iVar != null && !iVar.f150833e) {
                        C67295g.m119228a("PublishParallel PublishTask(" + iVar.f150829a.f150839a + ") invoke pause");
                        AbstractC67289c cVar = iVar.f150831c;
                        if (cVar != null) {
                            cVar.mo106124c();
                        }
                        iVar.f150833e = true;
                    }
                } else {
                    C67295g.m119228a("PublishParallel taskPause id=" + aVar2.f150839a + " can't pause because its progress >= 60");
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final synchronized C72678q mo106161a(String str) {
        MethodCollector.m26663i(8530);
        List<RunnableC67311i.C67312a> list = f150874a;
        C89219l.m154716b(list, "");
        for (T t : list) {
            if (C89219l.m154714a((Object) t.f150839a, (Object) str)) {
                C72678q qVar = t.f150844f;
                MethodCollector.m26664o(8530);
                return qVar;
            }
        }
        List<RunnableC67311i.C67312a> list2 = f150874a;
        if (list2.size() > 0) {
            C72678q qVar2 = list2.get(list2.size() - 1).f150844f;
            MethodCollector.m26664o(8530);
            return qVar2;
        }
        MethodCollector.m26664o(8530);
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo106163a(AbstractC89172b<? super RunnableC67311i.C67312a, C89391z> bVar) {
        MethodCollector.m26663i(8820);
        C89219l.m154721d(bVar, "");
        List<RunnableC67311i.C67312a> list = f150874a;
        C89219l.m154716b(list, "");
        for (T t : list) {
            C89219l.m154716b(t, "");
            bVar.invoke(t);
        }
        MethodCollector.m26664o(8820);
    }

    /* renamed from: a */
    public final synchronized void mo106167a(ExecutorService executorService) {
        MethodCollector.m26663i(8529);
        C89219l.m154721d(executorService, "");
        executorService.execute(RunnableC67331d.f150887a);
        MethodCollector.m26664o(8529);
    }

    /* renamed from: a */
    public final synchronized void mo106164a(String str, AbstractC72639k kVar) {
        RunnableC67311i iVar;
        MethodCollector.m26663i(7936);
        C89219l.m154721d(str, "");
        C89219l.m154721d(kVar, "");
        List<RunnableC67311i.C67312a> list = f150874a;
        C89219l.m154716b(list, "");
        for (T t : list) {
            if (C89219l.m154714a((Object) t.f150839a, (Object) str) && (iVar = t.f150843e) != null) {
                iVar.mo106142a(kVar);
            }
        }
        MethodCollector.m26664o(7936);
    }

    /* renamed from: a */
    public final synchronized void mo106165a(String str, AbstractC72639k kVar, ExecutorService executorService) {
        MethodCollector.m26663i(8088);
        C89219l.m154721d(str, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(executorService, "");
        List<RunnableC67311i.C67312a> list = f150874a;
        C89219l.m154716b(list, "");
        for (T t : list) {
            if (C89219l.m154714a((Object) t.f150839a, (Object) str)) {
                executorService.execute(new RunnableC67329b(t, str, executorService, kVar));
            }
        }
        MethodCollector.m26664o(8088);
    }

    /* renamed from: a */
    public final synchronized void mo106166a(String str, AbstractC74304x<C69831ai> xVar, ExecutorService executorService) {
        MethodCollector.m26663i(8233);
        C89219l.m154721d(xVar, "");
        C89219l.m154721d(executorService, "");
        if (str != null) {
            List<RunnableC67311i.C67312a> list = f150874a;
            C89219l.m154716b(list, "");
            for (T t : list) {
                if (C89219l.m154714a((Object) t.f150839a, (Object) str)) {
                    executorService.execute(new RunnableC67330c(t, str, executorService, xVar));
                }
            }
            MethodCollector.m26664o(8233);
            return;
        }
        List<RunnableC67311i.C67312a> list2 = f150874a;
        C89219l.m154716b(list2, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f150843e);
        }
        executorService.execute(new RunnableC67328a(arrayList, executorService, xVar));
        MethodCollector.m26664o(8233);
    }
}
