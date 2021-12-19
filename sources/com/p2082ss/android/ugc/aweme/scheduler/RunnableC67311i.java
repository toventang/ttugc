package com.p2082ss.android.ugc.aweme.scheduler;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.C0607l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.publish.C65682o;
import com.p2082ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;
import com.p2082ss.android.ugc.aweme.scheduler.C67291e;
import com.p2082ss.android.ugc.aweme.scheduler.PublishService;
import com.p2082ss.android.ugc.aweme.settings.C68742h;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72606ah;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.i */
public final class RunnableC67311i implements Runnable {

    /* renamed from: a */
    public C67312a f150829a;

    /* renamed from: b */
    public final C67336m f150830b;

    /* renamed from: c */
    AbstractC67289c f150831c;

    /* renamed from: d */
    public final List<AbstractC72639k> f150832d = new ArrayList();

    /* renamed from: e */
    boolean f150833e;

    /* renamed from: f */
    public final C67334l f150834f;

    /* renamed from: g */
    public final Executor f150835g;

    /* renamed from: h */
    private final ExecutorC34605m f150836h = ExecutorC34605m.f81660a;

    /* renamed from: i */
    private boolean f150837i;

    /* renamed from: j */
    private final C67291e f150838j;

    static {
        Covode.recordClassIndex(78934);
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.i$f */
    public static final class C67318f extends AbstractC72639k {

        /* renamed from: a */
        public boolean f150856a;

        /* renamed from: b */
        public final C40964c.C40967b f150857b;

        /* renamed from: c */
        final /* synthetic */ RunnableC67311i f150858c;

        static {
            Covode.recordClassIndex(78941);
        }

        /* renamed from: a */
        public final void mo106156a() {
            this.f150858c.mo106146a(false, true);
        }

        /* renamed from: com.ss.android.ugc.aweme.scheduler.i$f$a */
        public static final class C67319a extends C40964c.C40967b {

            /* renamed from: a */
            final /* synthetic */ C67318f f150859a;

            static {
                Covode.recordClassIndex(78942);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.C40967b, com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
            /* renamed from: a */
            public final void mo70154a() {
                super.mo70154a();
                if (this.f150859a.f150858c.f150829a.f150844f.f162930c == 0) {
                    this.f150859a.mo106156a();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C67319a(C67318f fVar) {
                this.f150859a = fVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C67318f(RunnableC67311i iVar) {
            this.f150858c = iVar;
            C67319a aVar = new C67319a(this);
            this.f150857b = aVar;
            C40964c.C40968c.f95804a.mo70143a(aVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            C40964c.C40968c.f95804a.mo70146b(this.f150857b);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onProgress(int i, Object obj) {
            if (this.f150858c.f150829a.f150844f.f162930c == 0 && !this.f150856a && C40964c.C40968c.f95804a.mo70144a()) {
                mo106156a();
                this.f150856a = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo106141a() {
        AbstractC67289c cVar = this.f150831c;
        if (cVar != null) {
            cVar.mo106121a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.i$c */
    public static final class C67314c extends AbstractC72639k {

        /* renamed from: a */
        public boolean f150848a;

        /* renamed from: b */
        public boolean f150849b;

        /* renamed from: c */
        public final C67315a f150850c;

        /* renamed from: d */
        final /* synthetic */ RunnableC67311i f150851d;

        static {
            Covode.recordClassIndex(78937);
        }

        /* renamed from: com.ss.android.ugc.aweme.scheduler.i$c$a */
        public static final class C67315a extends C40964c.C40967b {

            /* renamed from: a */
            final /* synthetic */ C67314c f150852a;

            static {
                Covode.recordClassIndex(78938);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2730de.C40964c.C40967b, com.p2082ss.android.ugc.aweme.p2730de.C40964c.AbstractC40966a
            /* renamed from: a */
            public final void mo70154a() {
                super.mo70154a();
                if (this.f150852a.f150851d.f150829a.f150844f.f162930c == 0) {
                    this.f150852a.mo106154a();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C67315a(C67314c cVar) {
                this.f150852a = cVar;
            }
        }

        /* renamed from: a */
        public final void mo106154a() {
            String str = this.f150851d.f150829a.f150839a;
            C89219l.m154721d(str, "");
            PublishService.C67284a.m119210a("show publishId:".concat(String.valueOf(str)));
            Context a = C40963b.m82473a();
            if (C65682o.m117576a(a, PublishService.class)) {
                PublishService.C67284a.m119210a("service is running");
            } else {
                Intent intent = new Intent(a, PublishService.class);
                intent.putExtra("PUBLISH_ID", str);
                if (Build.VERSION.SDK_INT >= 26) {
                    a.startForegroundService(intent);
                } else {
                    PublishService.C67284a.m119206a(a, intent);
                }
            }
            this.f150851d.mo106146a(true, true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C67314c(RunnableC67311i iVar) {
            this.f150851d = iVar;
            C67315a aVar = new C67315a(this);
            this.f150850c = aVar;
            C40964c.C40968c.f95804a.mo70143a(aVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            C40964c.C40968c.f95804a.mo70146b(this.f150850c);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onProgress(int i, Object obj) {
            if (this.f150851d.f150829a.f150844f.f162930c == 0) {
                if (!this.f150849b) {
                    if (C68747m.m121180a()) {
                        PublishService.C67284a.m119210a("clearProgress");
                        Context a = C40963b.m82473a();
                        PublishService.C67284a.m119209a(a);
                        C0607l.m2289a(a).mo2638a((String) null, 1);
                    } else {
                        PublishService.C67284a.m119208a();
                    }
                    this.f150849b = true;
                }
                if (!this.f150848a) {
                    C40964c cVar = C40964c.C40968c.f95804a;
                    C89219l.m154716b(cVar, "");
                    if (cVar.mo70144a()) {
                        mo106154a();
                        this.f150848a = true;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.i$b */
    public static final class RunnableC67313b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC72639k f150846a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72685x f150847b;

        static {
            Covode.recordClassIndex(78936);
        }

        RunnableC67313b(AbstractC72639k kVar, AbstractC72685x xVar) {
            this.f150846a = kVar;
            this.f150847b = xVar;
        }

        public final void run() {
            this.f150846a.onProgress(((AbstractC72685x.C72689d) this.f150847b).f162964a, ((AbstractC72685x.C72689d) this.f150847b).f162965b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.i$e */
    public static final class RunnableC67317e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f150854a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f150855b;

        static {
            Covode.recordClassIndex(78940);
        }

        RunnableC67317e(List list, AbstractC89172b bVar) {
            this.f150854a = list;
            this.f150855b = bVar;
        }

        public final void run() {
            for (Object obj : this.f150854a) {
                this.f150855b.invoke(obj);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.i$h */
    public static final class C67321h extends AbstractC72639k {

        /* renamed from: a */
        final /* synthetic */ RunnableC67311i f150861a;

        /* renamed from: b */
        private volatile AbstractC72685x f150862b;

        static {
            Covode.recordClassIndex(78944);
        }

        /* renamed from: com.ss.android.ugc.aweme.scheduler.i$h$a */
        static final class RunnableC67322a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C67321h f150863a;

            /* renamed from: b */
            final /* synthetic */ AbstractC72623d f150864b;

            /* renamed from: c */
            final /* synthetic */ Object f150865c;

            static {
                Covode.recordClassIndex(78945);
            }

            RunnableC67322a(C67321h hVar, AbstractC72623d dVar, Object obj) {
                this.f150863a = hVar;
                this.f150864b = dVar;
                this.f150865c = obj;
            }

            public final void run() {
                C67321h hVar = this.f150863a;
                if (hVar.mo106157a(hVar.f150861a.f150829a.f150840b, "finish on no running")) {
                    this.f150863a.f150861a.f150829a.mo106150a(this.f150864b, this.f150865c);
                    this.f150863a.f150861a.f150834f.mo106180a();
                    this.f150863a.f150861a.mo106145a(new AbstractC89172b<AbstractC72639k, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.scheduler.RunnableC67311i.C67321h.RunnableC67322a.C673231 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC67322a f150866a;

                        static {
                            Covode.recordClassIndex(78946);
                        }

                        {
                            this.f150866a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(AbstractC72639k kVar) {
                            AbstractC72639k kVar2 = kVar;
                            C89219l.m154721d(kVar2, "");
                            kVar2.onFinish(this.f150866a.f150864b, this.f150866a.f150865c);
                            return C89391z.f203057a;
                        }
                    });
                    this.f150863a.f150861a.f150832d.clear();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.scheduler.i$h$b */
        static final class RunnableC67324b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C67321h f150867a;

            /* renamed from: b */
            final /* synthetic */ int f150868b;

            /* renamed from: c */
            final /* synthetic */ Object f150869c;

            static {
                Covode.recordClassIndex(78947);
            }

            RunnableC67324b(C67321h hVar, int i, Object obj) {
                this.f150867a = hVar;
                this.f150868b = i;
                this.f150869c = obj;
            }

            public final void run() {
                C67321h hVar = this.f150867a;
                if (hVar.mo106157a(hVar.f150861a.f150829a.f150840b, "progress:" + this.f150868b + " on no running") && !(this.f150867a.f150861a.f150829a.f150840b instanceof AbstractC72685x.C72688c)) {
                    this.f150867a.f150861a.f150829a.mo106152a(new AbstractC72685x.C72689d(this.f150868b, this.f150869c));
                    this.f150867a.f150861a.mo106145a(new AbstractC89172b<AbstractC72639k, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.scheduler.RunnableC67311i.C67321h.RunnableC67324b.C673251 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC67324b f150870a;

                        static {
                            Covode.recordClassIndex(78948);
                        }

                        {
                            this.f150870a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(AbstractC72639k kVar) {
                            AbstractC72639k kVar2 = kVar;
                            C89219l.m154721d(kVar2, "");
                            kVar2.onProgress(this.f150870a.f150868b, this.f150870a.f150869c);
                            return C89391z.f203057a;
                        }
                    });
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C67321h(RunnableC67311i iVar) {
            this.f150861a = iVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.scheduler.i$h$c */
        static final class C67326c extends AbstractC89220m implements AbstractC89172b<AbstractC72639k, C89391z> {

            /* renamed from: a */
            final /* synthetic */ String f150871a;

            /* renamed from: b */
            final /* synthetic */ AbstractC72606ah f150872b;

            /* renamed from: c */
            final /* synthetic */ Object f150873c;

            static {
                Covode.recordClassIndex(78949);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C67326c(String str, AbstractC72606ah ahVar, Object obj) {
                super(1);
                this.f150871a = str;
                this.f150872b = ahVar;
                this.f150873c = obj;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC72639k kVar) {
                AbstractC72639k kVar2 = kVar;
                C89219l.m154721d(kVar2, "");
                kVar2.onStageUpdate(this.f150871a, this.f150872b, this.f150873c);
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public final boolean mo106157a(AbstractC72685x xVar, String str) {
            if (xVar instanceof AbstractC72685x.C72689d) {
                return true;
            }
            if (C68747m.m121180a() && (xVar instanceof AbstractC72685x.C72688c)) {
                return true;
            }
            this.f150861a.mo106143a(xVar, str);
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onProgress(int i, Object obj) {
            C67295g.m119228a("PublishParallel PublishTask(" + this.f150861a.f150829a.f150839a + ") onProgress " + i + " callbackList size " + this.f150861a.f150832d.size());
            this.f150861a.f150835g.execute(new RunnableC67324b(this, i, obj));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            C67295g.m119228a("PublishParallel PublishTask(" + this.f150861a.f150829a.f150839a + ") onFinish " + dVar + " callbackList size " + this.f150861a.f150832d.size());
            if (dVar instanceof AbstractC72623d.C72626c) {
                C67327j.f150875b.mo106169b(this.f150861a.f150829a);
                C67327j.f150875b.mo106168b();
            } else if (dVar instanceof AbstractC72623d.C72625b) {
                C84911q.m145921a("publishtask PublishCallback  onFinish=Failed publishid=" + this.f150861a.f150829a.f150839a);
                C67327j.f150875b.mo106169b(this.f150861a.f150829a);
                C67327j.f150875b.mo106168b();
            } else {
                C84911q.m145921a("publishtask PublishCallback  onFinish=Cancel publishid=" + this.f150861a.f150829a.f150839a);
                if (C68747m.m121180a() && C68747m.m121181b()) {
                    C67296h.f150795c.lock();
                    try {
                        C67296h.f150796d = this.f150861a.f150829a.f150839a;
                        Iterator<T> it = this.f150861a.f150832d.iterator();
                        while (it.hasNext()) {
                            C67296h.f150797e.add(it.next());
                        }
                        C84911q.m145921a("cancelTaskCallbackList  size=" + C67296h.f150797e.size());
                    } finally {
                        C67296h.f150795c.unlock();
                    }
                }
            }
            this.f150861a.f150835g.execute(new RunnableC67322a(this, dVar, obj));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onStageUpdate(String str, AbstractC72606ah ahVar, Object obj) {
            AbstractC72685x dVar;
            C89219l.m154721d(str, "");
            C89219l.m154721d(ahVar, "");
            int hashCode = str.hashCode();
            if (hashCode != -1653244709) {
                if (hashCode == 349916616 && str.equals("STAGE_SYNTHETIC_RESUME")) {
                    C67295g.m119228a("PublishParallel PublishTask(" + this.f150861a.f150829a.f150839a + ") resumed");
                    C67312a aVar = this.f150861a.f150829a;
                    if (this.f150862b != null) {
                        dVar = this.f150862b;
                        if (dVar == null) {
                            C89219l.m154715b();
                        }
                    } else {
                        dVar = new AbstractC72685x.C72689d(0, null);
                    }
                    aVar.mo106152a(dVar);
                    this.f150862b = null;
                }
            } else if (str.equals("STAGE_SYNTHETIC_PAUSE")) {
                C67295g.m119228a("PublishParallel PublishTask(" + this.f150861a.f150829a.f150839a + ") paused");
                AbstractC72685x xVar = this.f150861a.f150829a.f150840b;
                if (!C89219l.m154714a(xVar, AbstractC72685x.C72688c.f162963a)) {
                    this.f150862b = xVar;
                } else {
                    this.f150862b = null;
                }
                this.f150861a.f150829a.mo106152a(AbstractC72685x.C72688c.f162963a);
            }
            this.f150861a.mo106145a(new C67326c(str, ahVar, obj));
        }
    }

    /* renamed from: b */
    public final void mo106147b() {
        if (C68747m.m121180a()) {
            if (!this.f150837i) {
                this.f150837i = true;
            } else {
                return;
            }
        } else if (this.f150829a.f150840b instanceof AbstractC72685x.C72686a) {
            this.f150830b.mo106186b("finish need not cancel");
            return;
        }
        C39162r.m79460a("publish_service_cancel", new C84425b().mo129406a("invoke_type", "realStopPublish").f188764a);
        AbstractC67289c cVar = this.f150831c;
        if (cVar != null) {
            cVar.mo106123b();
        }
        this.f150829a.mo106150a(AbstractC72623d.C72624a.f162804a, null);
        mo106145a(C67316d.f150853a);
        this.f150834f.mo106183c(this.f150829a.f150839a);
    }

    public final void run() {
        if (C68747m.m121180a() || !(!C89219l.m154714a(this.f150829a.f150840b, AbstractC72685x.C72687b.f162962a))) {
            this.f150829a.mo106152a(new AbstractC72685x.C72689d(0, null));
            C67312a aVar = this.f150829a;
            String str = aVar.f150839a;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(str, "");
            IPublishServiceFactory a = PublishServiceFactoryImpl.m123157a();
            C67291e.C67292a aVar2 = new C67291e.C67292a(aVar, a, a.mo104631a(aVar.f150844f), str);
            this.f150831c = aVar2;
            aVar2.mo106122a(new C67321h(this));
            mo106146a(false, false);
            if (C68742h.m121175a() && !this.f150829a.f150844f.f162939l) {
                mo106142a(new C67314c(this));
            }
            if (!C68742h.m121175a()) {
                mo106142a(new C67318f(this));
                return;
            }
            return;
        }
        mo106143a(this.f150829a.f150840b, "start not new");
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.i$a */
    public static final class C67312a {

        /* renamed from: a */
        public final String f150839a;

        /* renamed from: b */
        public volatile AbstractC72685x f150840b = AbstractC72685x.C72687b.f162962a;

        /* renamed from: c */
        public long f150841c = -1;

        /* renamed from: d */
        public long f150842d = -1;

        /* renamed from: e */
        public RunnableC67311i f150843e;

        /* renamed from: f */
        public volatile C72678q f150844f;

        /* renamed from: g */
        private final boolean f150845g;

        static {
            Covode.recordClassIndex(78935);
        }

        /* renamed from: a */
        public final void mo106151a(C72678q qVar) {
            C89219l.m154721d(qVar, "");
            this.f150844f = qVar;
        }

        /* renamed from: a */
        public final void mo106152a(AbstractC72685x xVar) {
            RunnableC67311i iVar;
            C67336m mVar;
            C89219l.m154721d(xVar, "");
            this.f150840b = xVar;
            if ((xVar instanceof AbstractC72685x.C72689d) && this.f150841c == -1) {
                this.f150841c = SystemClock.uptimeMillis();
            }
            if ((this.f150845g || !(this.f150840b instanceof AbstractC72685x.C72689d)) && (iVar = this.f150843e) != null && (mVar = iVar.f150830b) != null) {
                mVar.mo106186b("change state to:" + this.f150840b);
            }
        }

        /* renamed from: a */
        public final void mo106150a(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            mo106152a(new AbstractC72685x.C72686a(dVar, obj));
            this.f150842d = SystemClock.uptimeMillis();
            this.f150843e = null;
        }

        public C67312a(C72678q qVar, RunnableC67311i iVar, boolean z) {
            C89219l.m154721d(qVar, "");
            this.f150844f = qVar;
            this.f150845g = z;
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            this.f150839a = uuid;
            this.f150843e = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.i$d */
    public static final class C67316d extends AbstractC89220m implements AbstractC89172b<AbstractC72639k, C89391z> {

        /* renamed from: a */
        public static final C67316d f150853a = new C67316d();

        static {
            Covode.recordClassIndex(78939);
        }

        C67316d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC72639k kVar) {
            AbstractC72639k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            kVar2.onFinish(AbstractC72623d.C72624a.f162804a, null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo106144a(AbstractC74304x<C69831ai> xVar) {
        C89219l.m154721d(xVar, "");
        m119248a(this.f150832d, new C67320g(xVar));
    }

    /* renamed from: b */
    public final void mo106148b(AbstractC72639k kVar) {
        C89219l.m154721d(kVar, "");
        this.f150832d.remove(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.scheduler.i$g */
    public static final class C67320g extends AbstractC89220m implements AbstractC89172b<AbstractC72639k, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC74304x f150860a;

        static {
            Covode.recordClassIndex(78943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67320g(AbstractC74304x xVar) {
            super(1);
            this.f150860a = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC72639k kVar) {
            boolean z;
            AbstractC72639k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            if (!(kVar2 instanceof C67294f) || !C89219l.m154714a(((C67294f) kVar2).f150790a, this.f150860a)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public final void mo106145a(AbstractC89172b<? super AbstractC72639k, C89391z> bVar) {
        if (!this.f150832d.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f150832d);
            this.f150836h.execute(new RunnableC67317e(arrayList, bVar));
        }
    }

    /* renamed from: a */
    public final void mo106142a(AbstractC72639k kVar) {
        C89219l.m154721d(kVar, "");
        this.f150832d.add(kVar);
        AbstractC72685x xVar = this.f150829a.f150840b;
        if ((xVar instanceof AbstractC72685x.C72689d) && ((AbstractC72685x.C72689d) xVar).f162964a > 0) {
            this.f150836h.execute(new RunnableC67313b(kVar, xVar));
        }
    }

    /* renamed from: a */
    private static boolean m119248a(List<AbstractC72639k> list, AbstractC89172b<? super AbstractC72639k, Boolean> bVar) {
        ListIterator<AbstractC72639k> listIterator = list.listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            if (bVar.invoke(listIterator.next()).booleanValue()) {
                listIterator.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo106143a(AbstractC72685x xVar, String str) {
        if (!(xVar instanceof AbstractC72685x.C72686a) || !C89219l.m154714a(((AbstractC72685x.C72686a) xVar).f162960a, AbstractC72623d.C72624a.f162804a)) {
            this.f150830b.mo106185a(str + ", require cancel, but state:" + xVar);
        }
    }

    /* renamed from: a */
    public final void mo106146a(boolean z, boolean z2) {
        BaseShortVideoContext baseShortVideoContext = this.f150829a.f150844f.f162938k;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            videoPublishEditModel.isOpenForegroundPublish = z;
            videoPublishEditModel.isBackgroundPublish = z2;
        }
    }

    public RunnableC67311i(String str, C72678q qVar, boolean z, C67291e eVar, C67334l lVar, Executor executor) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(executor, "");
        this.f150838j = eVar;
        this.f150834f = lVar;
        this.f150835g = executor;
        this.f150829a = new C67312a(qVar, this, z);
        this.f150830b = new C67336m(str + "-PublishTask-" + this.f150829a.f150839a);
    }
}
