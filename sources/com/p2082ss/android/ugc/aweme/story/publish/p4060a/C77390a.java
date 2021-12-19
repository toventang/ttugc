package com.p2082ss.android.ugc.aweme.story.publish.p4060a;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scheduler.AbstractC67333k;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77399b;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77409c;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.a.a */
public final class C77390a {

    /* renamed from: a */
    static final AtomicInteger f173638a = new AtomicInteger(0);

    /* renamed from: b */
    static final CopyOnWriteArrayList<String> f173639b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    static final CopyOnWriteArrayList<C77409c> f173640c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public static final ConcurrentHashMap<String, C77409c> f173641d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final C77390a f173642e = new C77390a();

    /* renamed from: f */
    private static volatile boolean f173643f;

    /* renamed from: g */
    private static final AbstractC89244h f173644g = C89250i.m154773a((AbstractC89171a) C77392b.f173648a);

    /* renamed from: h */
    private static final AbstractC89244h f173645h = C89250i.m154773a((AbstractC89171a) C77397f.f173654a);

    /* renamed from: i */
    private static final AbstractC89244h f173646i = C89250i.m154773a((AbstractC89171a) C77394c.f173650a);

    /* renamed from: a */
    public static C77399b m135322a() {
        return (C77399b) f173646i.getValue();
    }

    /* renamed from: d */
    private static AbstractC63269z.AbstractC63271b m135333d() {
        return (AbstractC63269z.AbstractC63271b) f173644g.getValue();
    }

    /* renamed from: e */
    private static C77397f.C773981 m135335e() {
        return (C77397f.C773981) f173645h.getValue();
    }

    private C77390a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.a$b */
    static final class C77392b extends AbstractC89220m implements AbstractC89171a<C773931> {

        /* renamed from: a */
        public static final C77392b f173648a = new C77392b();

        static {
            Covode.recordClassIndex(90423);
        }

        C77392b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C773931 invoke() {
            return new AbstractC63269z.AbstractC63271b() {
                /* class com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77390a.C77392b.C773931 */

                /* renamed from: a */
                private final int f173649a = 3;

                static {
                    Covode.recordClassIndex(90424);
                }

                {
                    C63244g.m114602a().mo73255A();
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63271b
                /* renamed from: a */
                public final void mo101762a(int i, boolean z) {
                    if (i <= this.f173649a && z) {
                        C84911q.m145921a("ParallelStoryPublishScheduler:reset");
                        C77390a.m135332c();
                        C77390a.f173640c.clear();
                        Collection<C77409c> values = C77390a.f173641d.values();
                        C89219l.m154716b(values, "");
                        for (T t : values) {
                            if (!(t.f173686c instanceof AbstractC72685x.C72686a)) {
                                C77399b a = C77390a.m135322a();
                                a.mo121037b().execute(new C77399b.RunnableC77403d(a, t.f173689f));
                            }
                            t.mo121046a(true);
                        }
                        C77390a.f173641d.clear();
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.a$c */
    static final class C77394c extends AbstractC89220m implements AbstractC89171a<C77399b> {

        /* renamed from: a */
        public static final C77394c f173650a = new C77394c();

        static {
            Covode.recordClassIndex(90425);
        }

        C77394c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C77399b invoke() {
            return new C77399b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.a$f */
    static final class C77397f extends AbstractC89220m implements AbstractC89171a<C773981> {

        /* renamed from: a */
        public static final C77397f f173654a = new C77397f();

        static {
            Covode.recordClassIndex(90428);
        }

        C77397f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C773981 invoke() {
            return new AbstractC67333k() {
                /* class com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77390a.C77397f.C773981 */

                static {
                    Covode.recordClassIndex(90429);
                }

                @Override // com.p2082ss.android.ugc.aweme.scheduler.AbstractC67333k
                /* renamed from: a */
                public final boolean mo106120a(C72678q qVar, C72678q qVar2) {
                    C89219l.m154721d(qVar, "");
                    C89219l.m154721d(qVar2, "");
                    return C89219l.m154714a(qVar, qVar2);
                }
            };
        }
    }

    /* renamed from: f */
    private static void m135336f() {
        if (!f173643f) {
            f173643f = true;
            C63244g.m114602a().mo73255A().mo93899a(m135333d());
        }
    }

    /* renamed from: b */
    public static final boolean m135329b() {
        if (f173638a.get() != 0 || (!f173640c.isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m135332c() {
        C63244g.m114602a().mo73255A().mo93902b(m135333d());
        f173643f = false;
    }

    static {
        Covode.recordClassIndex(90421);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.a$e */
    public static final class C77396e extends AbstractC72639k {

        /* renamed from: a */
        final /* synthetic */ C77409c f173653a;

        static {
            Covode.recordClassIndex(90427);
        }

        C77396e(C77409c cVar) {
            this.f173653a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            super.onFinish(dVar, obj);
            if (this.f173653a.mo121046a(false)) {
                C77390a.m135322a().mo121034a(this.f173653a);
            }
            C77390a.m135322a().mo121034a(this);
            if (!C77390a.m135329b()) {
                C77390a.m135332c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.a$a */
    public static final class C77391a extends AbstractC89220m implements AbstractC89172b<C77409c, C89391z> {

        /* renamed from: a */
        public static final C77391a f173647a = new C77391a();

        static {
            Covode.recordClassIndex(90422);
        }

        C77391a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C77409c cVar) {
            C77409c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C77390a.f173642e.mo121031a(cVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final Bitmap m135321a(C72678q qVar) {
        C89219l.m154721d(qVar, "");
        m135322a();
        return C77399b.m135340a(qVar);
    }

    /* renamed from: b */
    public static final AbstractC72685x m135328b(String str) {
        C89219l.m154721d(str, "");
        C77409c cVar = f173641d.get(str);
        if (cVar != null) {
            return cVar.f173686c;
        }
        return null;
    }

    /* renamed from: c */
    public static final C72678q m135331c(String str) {
        C89219l.m154721d(str, "");
        C77409c cVar = f173641d.get(str);
        if (cVar != null) {
            return cVar.mo121043a();
        }
        return null;
    }

    /* renamed from: d */
    public static final C77409c m135334d(String str) {
        C89219l.m154721d(str, "");
        return f173641d.get(str);
    }

    /* renamed from: a */
    public static final C77409c m135323a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        String sb = new StringBuilder().append(SystemClock.elapsedRealtime()).append('_').append(bundle.hashCode()).toString();
        bundle.putBoolean("publish_story_mode", true);
        C77409c cVar = new C77409c(sb, bundle, null, C77391a.f173647a);
        f173641d.put(sb, cVar);
        return cVar;
    }

    /* renamed from: b */
    private static boolean m135330b(C77409c cVar) {
        String str = cVar.f173687d;
        if (f173640c.contains(cVar) || f173639b.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m135326a(AbstractC74304x<C69831ai> xVar) {
        C89219l.m154721d(xVar, "");
        Collection<C77409c> values = f173641d.values();
        C89219l.m154716b(values, "");
        boolean z = false;
        for (T t : values) {
            C89219l.m154721d(xVar, "");
            List<AbstractC72639k> list = t.f173684a;
            C77409c.C77419j jVar = new C77409c.C77419j(xVar);
            ListIterator<AbstractC72639k> listIterator = list.listIterator();
            boolean z2 = false;
            while (listIterator.hasNext()) {
                AbstractC72639k next = listIterator.next();
                if (((Boolean) jVar.invoke(next)).booleanValue()) {
                    t.f173685b.remove(next);
                    listIterator.remove();
                    z2 = true;
                }
            }
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static final boolean m135327a(String str) {
        C89219l.m154721d(str, "");
        C84911q.m145921a("ParallelStoryPublishScheduler,scheduleTask,scheduleId:".concat(String.valueOf(str)));
        C77409c cVar = f173641d.get(str);
        if (cVar != null) {
            cVar.mo121047b();
            C77390a aVar = f173642e;
            C89219l.m154716b(cVar, "");
            if (aVar.mo121031a(cVar).length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String mo121031a(C77409c cVar) {
        if (m135330b(cVar)) {
            C84911q.m145921a("ParallelStoryPublishScheduler," + cVar + " is existed.directly return.");
            return "";
        }
        m135336f();
        String str = cVar.f173687d;
        String a = m135322a().mo121033a(cVar.f173688e, cVar.f173689f, m135335e());
        cVar.f173689f = a;
        C84911q.m145921a("ParallelStoryPublishScheduler:start publish,scheduleId:" + str + ",taskId:" + a);
        if (a == null) {
            C84911q.m145927c("ParallelStoryPublishScheduler:start publish,create task failed,add to pending task");
            f173640c.add(cVar);
        } else {
            f173638a.incrementAndGet();
            f173639b.add(str);
            m135322a().mo121035a(new C77395d(str, a), a);
            m135322a().mo121035a(cVar, a);
            m135322a().mo121035a(new C77396e(cVar), a);
        }
        C84911q.m145921a("ParallelStoryPublishScheduler:startPublishReal,scheduleId:" + str + ",taskId:" + a);
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.a$d */
    public static final class C77395d extends AbstractC72639k {

        /* renamed from: a */
        final /* synthetic */ String f173651a;

        /* renamed from: b */
        final /* synthetic */ String f173652b;

        static {
            Covode.recordClassIndex(90426);
        }

        C77395d(String str, String str2) {
            this.f173651a = str;
            this.f173652b = str2;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            C84911q.m145921a("ParallelStoryPublishScheduler:publish task done.scheduleId:" + this.f173651a + ",taskId:" + this.f173652b + ",result:" + (dVar instanceof AbstractC72623d.C72626c));
            C77390a.f173639b.remove(this.f173651a);
            if (C77390a.f173638a.decrementAndGet() < 0) {
                C77390a.f173638a.set(0);
            }
            C77390a aVar = C77390a.f173642e;
            if (!C77390a.f173640c.isEmpty()) {
                C77409c remove = C77390a.f173640c.remove(0);
                C84911q.m145921a("ParallelStoryPublishScheduler:scheduleNext,scheduleId:" + remove.f173687d + ",pendingTaskSize:" + C77390a.f173640c.size());
                C89219l.m154716b(remove, "");
                aVar.mo121031a(remove);
            }
            C77390a.m135322a().mo121034a(this);
        }
    }

    /* renamed from: a */
    public static final boolean m135324a(AbstractC72639k kVar, String str) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(str, "");
        C77409c cVar = f173641d.get(str);
        if (cVar == null) {
            return false;
        }
        cVar.mo121044a(kVar);
        return true;
    }

    /* renamed from: a */
    public static final boolean m135325a(AbstractC72639k kVar, String str, boolean z) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(str, "");
        C77409c cVar = f173641d.get(str);
        if (cVar == null) {
            return false;
        }
        cVar.mo121045a(kVar, z);
        return true;
    }
}
