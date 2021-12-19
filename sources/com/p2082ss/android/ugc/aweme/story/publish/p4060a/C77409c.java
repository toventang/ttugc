package com.p2082ss.android.ugc.aweme.story.publish.p4060a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.scheduler.C67286a;
import com.p2082ss.android.ugc.aweme.scheduler.C67294f;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72606ah;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72677p;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.a.c */
public final class C77409c extends AbstractC72639k {

    /* renamed from: h */
    public static final C77410a f173683h = new C77410a((byte) 0);

    /* renamed from: a */
    public final List<AbstractC72639k> f173684a;

    /* renamed from: b */
    public final Set<AbstractC72639k> f173685b;

    /* renamed from: c */
    public volatile AbstractC72685x f173686c;

    /* renamed from: d */
    public final String f173687d;

    /* renamed from: e */
    public final Bundle f173688e;

    /* renamed from: f */
    public String f173689f = null;

    /* renamed from: g */
    public final AbstractC89172b<C77409c, C89391z> f173690g;

    /* renamed from: i */
    private int f173691i;

    /* renamed from: j */
    private volatile int f173692j;

    /* renamed from: k */
    private final AbstractC89244h f173693k;

    static {
        Covode.recordClassIndex(90440);
    }

    /* renamed from: a */
    public final C72678q mo121043a() {
        return (C72678q) this.f173693k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$a */
    public static final class C77410a {
        static {
            Covode.recordClassIndex(90441);
        }

        private C77410a() {
        }

        public /* synthetic */ C77410a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo121047b() {
        this.f173686c = AbstractC72685x.C72687b.f162962a;
        this.f173692j = 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$i */
    static final class C77418i extends AbstractC89220m implements AbstractC89171a<C72678q> {

        /* renamed from: a */
        final /* synthetic */ C77409c f173708a;

        static {
            Covode.recordClassIndex(90449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77418i(C77409c cVar) {
            super(0);
            this.f173708a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C72678q invoke() {
            return C67286a.m119212a(this.f173708a.f173688e);
        }
    }

    /* renamed from: c */
    private static boolean m135353c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$b */
    public static final class C77411b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC72639k f173694a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72685x f173695b;

        static {
            Covode.recordClassIndex(90442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77411b(AbstractC72639k kVar, AbstractC72685x xVar) {
            super(0);
            this.f173694a = kVar;
            this.f173695b = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f173694a.onFinish(((AbstractC72685x.C72686a) this.f173695b).f162960a, ((AbstractC72685x.C72686a) this.f173695b).f162961b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$c */
    public static final class C77412c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC72639k f173696a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72685x f173697b;

        static {
            Covode.recordClassIndex(90443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77412c(AbstractC72639k kVar, AbstractC72685x xVar) {
            super(0);
            this.f173696a = kVar;
            this.f173697b = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f173696a.onProgress(((AbstractC72685x.C72689d) this.f173697b).f162964a, ((AbstractC72685x.C72689d) this.f173697b).f162965b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    private static boolean m135354d() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean c = m135353c();
        C58029j.f132253e = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$e */
    public static final class C77414e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77409c f173699a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f173700b;

        static {
            Covode.recordClassIndex(90445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77414e(C77409c cVar, AbstractC89172b bVar) {
            super(0);
            this.f173699a = cVar;
            this.f173700b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll(this.f173699a.f173684a);
            for (Object obj : arrayList) {
                this.f173700b.invoke(obj);
            }
            return C89391z.f203057a;
        }
    }

    public final String toString() {
        return "TaskInfo[scheduleId:" + this.f173687d + ",taskId:" + this.f173689f + ",state:" + this.f173686c + ']';
    }

    /* renamed from: a */
    private static String m135349a(int i) {
        String string = C63247i.f143610a.getString(i);
        C89219l.m154716b(string, "");
        return string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$d */
    public static final class C77413d extends AbstractC89220m implements AbstractC89172b<AbstractC72639k, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C77409c f173698a;

        static {
            Covode.recordClassIndex(90444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77413d(C77409c cVar) {
            super(1);
            this.f173698a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC72639k kVar) {
            C89219l.m154721d(kVar, "");
            return Boolean.valueOf(!this.f173698a.f173685b.contains(kVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$f */
    static final class C77415f extends AbstractC89220m implements AbstractC89172b<AbstractC72639k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC72623d f173701a;

        /* renamed from: b */
        final /* synthetic */ Object f173702b;

        static {
            Covode.recordClassIndex(90446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77415f(AbstractC72623d dVar, Object obj) {
            super(1);
            this.f173701a = dVar;
            this.f173702b = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC72639k kVar) {
            AbstractC72639k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            kVar2.onFinish(this.f173701a, this.f173702b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$g */
    static final class C77416g extends AbstractC89220m implements AbstractC89172b<AbstractC72639k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f173703a;

        /* renamed from: b */
        final /* synthetic */ Object f173704b;

        static {
            Covode.recordClassIndex(90447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77416g(int i, Object obj) {
            super(1);
            this.f173703a = i;
            this.f173704b = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC72639k kVar) {
            AbstractC72639k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            kVar2.onProgress(this.f173703a, this.f173704b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$h */
    static final class C77417h extends AbstractC89220m implements AbstractC89172b<AbstractC72639k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f173705a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72606ah f173706b;

        /* renamed from: c */
        final /* synthetic */ Object f173707c;

        static {
            Covode.recordClassIndex(90448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77417h(String str, AbstractC72606ah ahVar, Object obj) {
            super(1);
            this.f173705a = str;
            this.f173706b = ahVar;
            this.f173707c = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC72639k kVar) {
            AbstractC72639k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            kVar2.onStageUpdate(this.f173705a, this.f173706b, this.f173707c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.c$j */
    public static final class C77419j extends AbstractC89220m implements AbstractC89172b<AbstractC72639k, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC74304x f173709a;

        static {
            Covode.recordClassIndex(90450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77419j(AbstractC74304x xVar) {
            super(1);
            this.f173709a = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC72639k kVar) {
            boolean z;
            AbstractC72639k kVar2 = kVar;
            C89219l.m154721d(kVar2, "");
            if (!(kVar2 instanceof C67294f) || !C89219l.m154714a(((C67294f) kVar2).f150790a, this.f173709a)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private final void m135351a(AbstractC89172b<? super AbstractC72639k, C89391z> bVar) {
        C31098f.m64301a(new C77414e(this, bVar));
    }

    /* renamed from: a */
    private final void m135352a(String str) {
        C84911q.m145921a("StoryScheduleTask," + str + " | " + this);
    }

    /* renamed from: a */
    private static String m135350a(C72677p pVar) {
        Throwable th;
        String str;
        Throwable th2 = null;
        if (pVar != null) {
            th = pVar.f162926d;
        } else {
            th = null;
        }
        if (th instanceof C34485a) {
            Throwable th3 = pVar.f162926d;
            Objects.requireNonNull(th3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            str = ((C34485a) th3).getErrorMsg();
        } else {
            str = null;
        }
        if ((pVar == null || !pVar.f162925c) && m135354d()) {
            if (pVar != null) {
                th2 = pVar.f162926d;
            }
            if (C65630a.m117453b(th2) == 100101) {
                str = m135349a((int) R.string.g5j);
            }
        } else {
            str = m135349a((int) R.string.g5g);
        }
        if (str == null || str.length() == 0) {
            return m135349a((int) R.string.g5f);
        }
        return str;
    }

    /* renamed from: a */
    public final void mo121044a(AbstractC72639k kVar) {
        C89219l.m154721d(kVar, "");
        m135352a("removeCallback,callback:" + kVar.getClass());
        this.f173684a.remove(kVar);
        this.f173685b.remove(kVar);
    }

    /* renamed from: a */
    public final boolean mo121046a(boolean z) {
        m135352a("destroy");
        AbstractC72685x xVar = this.f173686c;
        if (z || (xVar instanceof AbstractC72685x.C72686a)) {
            this.f173692j = 0;
            if ((!(xVar instanceof AbstractC72685x.C72686a) || !(((AbstractC72685x.C72686a) xVar).f162960a instanceof AbstractC72623d.C72626c)) && !z) {
                C89070n.m154537a((List) this.f173684a, (AbstractC89172b) new C77413d(this));
            } else {
                this.f173684a.clear();
                this.f173685b.clear();
            }
            return true;
        }
        m135352a("directly quit destroy,forceClear:".concat(String.valueOf(z)));
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onProgress(int i, Object obj) {
        super.onProgress(i, obj);
        if (this.f173686c instanceof AbstractC72685x.C72689d) {
            AbstractC72685x xVar = this.f173686c;
            Objects.requireNonNull(xVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.PublishState.Running");
            if (((AbstractC72685x.C72689d) xVar).f162964a >= i) {
                return;
            }
        }
        this.f173686c = new AbstractC72685x.C72689d(i, obj);
        m135352a("onProgressUpdate:".concat(String.valueOf(i)));
        m135351a(new C77416g(i, obj));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onFinish(AbstractC72623d dVar, Object obj) {
        C89219l.m154721d(dVar, "");
        super.onFinish(dVar, obj);
        m135352a("onFinish");
        boolean z = dVar instanceof AbstractC72623d.C72625b;
        if (z) {
            if (this.f173691i <= 0) {
                m135352a("disable auto retry caused by task configure.");
            } else if (!(this.f173686c instanceof AbstractC72685x.C72689d)) {
                m135352a("disable auto retry caused by task is not running");
            } else {
                C40964c cVar = C40964c.C40968c.f95804a;
                C89219l.m154716b(cVar, "");
                if (cVar.mo70144a()) {
                    m135352a("disable auto retry caused by app in in background");
                } else {
                    int i = this.f173692j;
                    this.f173692j = i + 1;
                    if (i >= this.f173691i) {
                        m135352a("disable auto retry caused by time reach.retryTime:" + this.f173691i + ",current:" + this.f173692j);
                    } else {
                        this.f173690g.invoke(this);
                        return;
                    }
                }
            }
        }
        this.f173692j = 0;
        this.f173686c = new AbstractC72685x.C72686a(dVar, obj);
        if (z) {
            C72677p pVar = ((AbstractC72623d.C72625b) dVar).f162805a;
            dVar = new AbstractC72623d.C72625b(new C72677p(m135350a(pVar), pVar.f162924b, pVar.f162925c, pVar.f162926d, pVar.f162927e));
        } else if (dVar instanceof AbstractC72623d.C72624a) {
            dVar = new AbstractC72623d.C72625b(new C72677p(m135350a((C72677p) null), "", false, new Throwable("auto cancel"), null));
        }
        m135351a(new C77415f(dVar, obj));
    }

    /* renamed from: a */
    public final void mo121045a(AbstractC72639k kVar, boolean z) {
        C89219l.m154721d(kVar, "");
        m135352a("addCallback,callback:" + kVar.getClass() + ",isPermanent:" + z);
        AbstractC72685x xVar = this.f173686c;
        if (xVar instanceof AbstractC72685x.C72686a) {
            C31098f.m64301a(new C77411b(kVar, xVar));
            return;
        }
        this.f173684a.add(kVar);
        if (z) {
            this.f173685b.add(kVar);
        }
        if ((xVar instanceof AbstractC72685x.C72689d) && ((AbstractC72685x.C72689d) xVar).f162964a > 0) {
            C31098f.m64301a(new C77412c(kVar, xVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onStageUpdate(String str, AbstractC72606ah ahVar, Object obj) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(ahVar, "");
        super.onStageUpdate(str, ahVar, obj);
        m135351a(new C77417h(str, ahVar, obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.story.publish.a.c, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C77409c(String str, Bundle bundle, String str2, AbstractC89172b<? super C77409c, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(bVar, "");
        this.f173687d = str;
        this.f173688e = bundle;
        this.f173690g = bVar;
        this.f173691i = bundle.getInt("extra_auto_retry", 0);
        this.f173684a = new ArrayList();
        this.f173685b = new LinkedHashSet();
        this.f173686c = AbstractC72685x.C72687b.f162962a;
        this.f173693k = C89250i.m154773a((AbstractC89171a) new C77418i(this));
    }
}
