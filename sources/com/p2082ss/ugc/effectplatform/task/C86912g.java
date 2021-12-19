package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86838c;
import com.p2082ss.ugc.effectplatform.model.C86839d;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4440a.C86693b;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g;
import com.p2082ss.ugc.effectplatform.p4453j.C86811b;
import com.p2082ss.ugc.effectplatform.task.p4459c.C86904a;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4519d.p4520a.p4521a.C87990c;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4522b.p4525c.C87998a;
import p4519d.p4520a.p4522b.p4525c.C88003f;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.g */
public final class C86912g extends AbstractC86891b {

    /* renamed from: d */
    public static final C86913a f195956d = new C86913a((byte) 0);

    /* renamed from: a */
    public final Effect f195957a;

    /* renamed from: b */
    public final C86687a f195958b;

    /* renamed from: c */
    public final String f195959c;

    /* renamed from: f */
    private final List<String> f195960f;

    /* renamed from: g */
    private final C87991a<C86880aj<C86904a>> f195961g;

    /* renamed from: h */
    private final C87998a f195962h;

    /* renamed from: i */
    private final C86838c f195963i;

    static {
        Covode.recordClassIndex(102677);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.g$a */
    public static final class C86913a {
        static {
            Covode.recordClassIndex(102678);
        }

        private C86913a() {
        }

        public /* synthetic */ C86913a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.g$d */
    static final class C86920d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86912g f195974a;

        static {
            Covode.recordClassIndex(102685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86920d(C86912g gVar) {
            super(0);
            this.f195974a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f195974a.f195958b.f195443K.mo140037b(this.f195974a.f195959c);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
        m150523a(new C86920d(this));
    }

    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b, p4519d.p4520a.p4533f.AbstractC88065d
    public final void cancel() {
        V v = this.f195961g.f199870a;
        if (v != null) {
            v.f195893f = true;
        }
        super.cancel();
    }

    /* renamed from: com.ss.ugc.effectplatform.task.g$b */
    static final class C86914b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86912g f195964a;

        static {
            Covode.recordClassIndex(102679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86914b(C86912g gVar) {
            super(0);
            this.f195964a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C86840e eVar = new C86840e(10017);
            C86811b.m150374a(this.f195964a.f195957a, eVar);
            AbstractC86796e a = this.f195964a.f195958b.f195443K.mo140035a(this.f195964a.f195959c);
            if (!(a instanceof AbstractC86798g)) {
                a = null;
            }
            AbstractC86798g gVar = (AbstractC86798g) a;
            if (gVar != null) {
                gVar.onFail(this.f195964a.f195957a, eVar);
            }
            this.f195964a.f195958b.f195443K.mo140037b(this.f195964a.f195959c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.g$c */
    public static final class C86915c implements AbstractC86881ak<C86904a> {

        /* renamed from: a */
        final /* synthetic */ C86912g f195965a;

        static {
            Covode.recordClassIndex(102680);
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: b */
        public final void mo140583b(C86880aj<C86904a> ajVar) {
            C89219l.m154719c(ajVar, "");
        }

        /* renamed from: com.ss.ugc.effectplatform.task.g$c$a */
        static final class C86916a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C86915c f195966a;

            /* renamed from: b */
            final /* synthetic */ C86840e f195967b;

            static {
                Covode.recordClassIndex(102681);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C86916a(C86915c cVar, C86840e eVar) {
                super(0);
                this.f195966a = cVar;
                this.f195967b = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C86811b.m150374a(this.f195966a.f195965a.f195957a, this.f195967b);
                AbstractC86796e a = this.f195966a.f195965a.f195958b.f195443K.mo140035a(this.f195966a.f195965a.f195959c);
                if (!(a instanceof AbstractC86798g)) {
                    a = null;
                }
                AbstractC86798g gVar = (AbstractC86798g) a;
                if (gVar != null) {
                    gVar.onFail(this.f195966a.f195965a.f195957a, this.f195967b);
                }
                this.f195966a.f195965a.f195958b.f195443K.mo140037b(this.f195966a.f195965a.f195959c);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.ugc.effectplatform.task.g$c$b */
        static final class C86917b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C86915c f195968a;

            /* renamed from: b */
            final /* synthetic */ int f195969b;

            /* renamed from: c */
            final /* synthetic */ long f195970c;

            static {
                Covode.recordClassIndex(102682);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C86917b(C86915c cVar, int i, long j) {
                super(0);
                this.f195968a = cVar;
                this.f195969b = i;
                this.f195970c = j;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                String a;
                C87990c<AbstractC86798g> cVar;
                Effect effect = this.f195968a.f195965a.f195957a;
                int i = this.f195969b;
                long j = this.f195970c;
                if (!(effect == null || (a = C86839d.m150405a(effect)) == null || (cVar = C86811b.f195721b.get(a)) == null)) {
                    Iterator<T> it = cVar.iterator();
                    while (it.hasNext()) {
                        it.next().onProgress(effect, i, j);
                    }
                }
                AbstractC86796e a2 = this.f195968a.f195965a.f195958b.f195443K.mo140035a(this.f195968a.f195965a.f195959c);
                if (!(a2 instanceof AbstractC86798g)) {
                    a2 = null;
                }
                AbstractC86798g gVar = (AbstractC86798g) a2;
                if (gVar != null) {
                    gVar.onProgress(this.f195968a.f195965a.f195957a, this.f195969b, this.f195970c);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.ugc.effectplatform.task.g$c$c */
        static final class C86918c extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C86915c f195971a;

            /* renamed from: b */
            final /* synthetic */ C86904a f195972b;

            static {
                Covode.recordClassIndex(102683);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C86918c(C86915c cVar, C86904a aVar) {
                super(0);
                this.f195971a = cVar;
                this.f195972b = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                String a;
                Effect effect = this.f195971a.f195965a.f195957a;
                if (!(effect == null || (a = C86839d.m150405a(effect)) == null)) {
                    C87990c<AbstractC86798g> cVar = C86811b.f195721b.get(a);
                    if (cVar != null) {
                        Iterator<T> it = cVar.iterator();
                        while (it.hasNext()) {
                            it.next().onSuccess(effect);
                        }
                    }
                    C86811b.f195721b.remove(a);
                    C86811b.f195720a.remove(a);
                }
                AbstractC86796e a2 = this.f195971a.f195965a.f195958b.f195443K.mo140035a(this.f195971a.f195965a.f195959c);
                if (!(a2 instanceof AbstractC86798g)) {
                    a2 = null;
                }
                AbstractC86798g gVar = (AbstractC86798g) a2;
                if (gVar != null) {
                    gVar.onSuccess(this.f195972b.f195935c);
                }
                this.f195971a.f195965a.f195958b.f195443K.mo140037b(this.f195971a.f195965a.f195959c);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.ugc.effectplatform.task.g$c$d */
        static final class C86919d extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C86915c f195973a;

            static {
                Covode.recordClassIndex(102684);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C86919d(C86915c cVar) {
                super(0);
                this.f195973a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                String a;
                C87990c<AbstractC86798g> cVar;
                Effect effect = this.f195973a.f195965a.f195957a;
                if (!(effect == null || (a = C86839d.m150405a(effect)) == null || (cVar = C86811b.f195721b.get(a)) == null)) {
                    Iterator<T> it = cVar.iterator();
                    while (it.hasNext()) {
                        it.next().onStart(effect);
                    }
                }
                AbstractC86796e a2 = this.f195973a.f195965a.f195958b.f195443K.mo140035a(this.f195973a.f195965a.f195959c);
                if (!(a2 instanceof AbstractC86798g)) {
                    a2 = null;
                }
                AbstractC86798g gVar = (AbstractC86798g) a2;
                if (gVar != null) {
                    gVar.onStart(this.f195973a.f195965a.f195957a);
                }
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C86915c(C86912g gVar) {
            this.f195965a = gVar;
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: a */
        public final void mo140579a(C86880aj<C86904a> ajVar) {
            C89219l.m154719c(ajVar, "");
            C86912g.m150523a(new C86919d(this));
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: a */
        public final void mo140581a(C86880aj<C86904a> ajVar, C86840e eVar) {
            C89219l.m154719c(ajVar, "");
            C89219l.m154719c(eVar, "");
            this.f195965a.mo140610a(false, eVar);
            C88060b.m153135a("DownloadEffectTask", "fetchEffect: " + this.f195965a.f195957a.getName() + " onFailed");
            C86912g.m150523a(new C86916a(this, eVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.effectplatform.task.aj, java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: a */
        public final /* synthetic */ void mo140582a(C86880aj<C86904a> ajVar, C86904a aVar) {
            C86904a aVar2 = aVar;
            C89219l.m154719c(ajVar, "");
            C89219l.m154719c(aVar2, "");
            this.f195965a.mo140610a(true, null);
            C88060b.m153135a("DownloadEffectTask", "fetchEffect: " + this.f195965a.f195957a.getName() + " onSuccess");
            C86912g.m150523a(new C86918c(this, aVar2));
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: a */
        public final void mo140580a(C86880aj<C86904a> ajVar, int i, long j) {
            C89219l.m154719c(ajVar, "");
            C86912g.m150523a(new C86917b(this, i, j));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        if (this.f195962h.mo142589a()) {
            C86693b bVar = new C86693b(this.f195957a, this.f195960f, this.f195958b.f195453i);
            if (C87993b.m153064a(this.f195958b.f195466v) == null) {
                m150523a(new C86914b(this));
                return;
            }
            C87991a<C86880aj<C86904a>> aVar = this.f195961g;
            V v = this.f195958b.f195466v.f199870a;
            aVar.f199870a = v != null ? (V) v.mo78960a(bVar) : null;
            C86904a aVar2 = new C86904a(this.f195957a);
            aVar2.f195933a = 0;
            aVar2.f195934b = 0L;
            V v2 = this.f195961g.f199870a;
            if (v2 != null) {
                v2.mo140598a(new C86915c(this));
            }
            V v3 = this.f195961g.f199870a;
            if (v3 != null) {
                v3.mo140577a();
            }
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: f */
    public final void mo140604f() {
        String a;
        C88003f fVar = C86922h.f195977a;
        fVar.f199879a.lock();
        try {
            if (C86811b.m150376a(C86839d.m150405a(this.f195957a))) {
                C88060b.m153135a("DownloadEffectTask", "effect: " + this.f195957a.getEffect_id() + ", name: " + this.f195957a.getName() + ", " + C86839d.m150405a(this.f195957a) + " is now downloading, add in listener");
                AbstractC86796e a2 = this.f195958b.f195443K.mo140035a(this.f195959c);
                if (!(a2 instanceof AbstractC86798g)) {
                    a2 = null;
                }
                AbstractC86798g gVar = (AbstractC86798g) a2;
                if (gVar != null) {
                    gVar.onStart(this.f195957a);
                    C86811b.m150373a(this.f195957a, new C86921e(gVar, this));
                }
                this.f195962h.mo142588a(false);
            } else {
                this.f195962h.mo142588a(true);
                Effect effect = this.f195957a;
                if (!(effect == null || (a = C86839d.m150405a(effect)) == null)) {
                    C86811b.f195720a.put(a, effect);
                }
                C88060b.m153135a("DownloadEffectTask", "effect: " + this.f195957a.getEffect_id() + ", name: " + this.f195957a.getName() + ", " + C86839d.m150405a(this.f195957a) + " added in download list!");
            }
        } finally {
            fVar.f199879a.unlock();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.g$e */
    public static final class C86921e implements AbstractC86798g {

        /* renamed from: a */
        final /* synthetic */ AbstractC86798g f195975a;

        /* renamed from: b */
        final /* synthetic */ C86912g f195976b;

        static {
            Covode.recordClassIndex(102686);
        }

        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(Effect effect) {
            this.f195975a.onSuccess(effect);
            this.f195976b.f195958b.f195443K.mo140037b(this.f195976b.f195959c);
        }

        C86921e(AbstractC86798g gVar, C86912g gVar2) {
            this.f195975a = gVar;
            this.f195976b = gVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(Effect effect, C86840e eVar) {
            C89219l.m154719c(eVar, "");
            this.f195975a.onFail(effect, eVar);
            this.f195976b.f195958b.f195443K.mo140037b(this.f195976b.f195959c);
        }

        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g
        public final void onProgress(Effect effect, int i, long j) {
            this.f195975a.onProgress(effect, i, j);
        }
    }

    /* renamed from: a */
    public final void mo140610a(boolean z, C86840e eVar) {
        C86838c cVar;
        String sb;
        String str;
        if (!(this.f195958b.f195463s.f199870a == null || (cVar = this.f195963i) == null)) {
            if (C89219l.m154714a((Object) "beautify", (Object) cVar.getPanel()) || C89219l.m154714a((Object) "beautifynew", (Object) this.f195963i.getPanel())) {
                int i = !z ? 1 : 0;
                StringBuilder sb2 = new StringBuilder();
                List<String> list = this.f195960f;
                if (list != null) {
                    for (String str2 : list) {
                        sb2.append(str2);
                        sb2.append(",");
                    }
                }
                V v = this.f195958b.f195463s.f199870a;
                if (v != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("effect_id", this.f195957a.getEffect_id());
                    hashMap.put("effect_name", this.f195957a.getName());
                    String str3 = this.f195958b.f195455k;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = str4;
                    }
                    hashMap.put("app_id", str3);
                    String str5 = this.f195958b.f195446b;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    hashMap.put("access_key", str5);
                    hashMap.put("download_urls", sb2.toString());
                    String panel = this.f195963i.getPanel();
                    if (panel == null) {
                        panel = str4;
                    }
                    hashMap.put("panel", panel);
                    if (eVar == null) {
                        sb = str4;
                    } else {
                        sb = new StringBuilder().append(eVar.f195756a).toString();
                    }
                    hashMap.put("error_code", sb);
                    if (!(eVar == null || (str = eVar.f195757b) == null)) {
                        str4 = str;
                    }
                    hashMap.put("error_msg", str4);
                    hashMap.put("effect_platform_type", 1);
                    v.monitorStatusRate("effect_resource_download_success_rate", i, hashMap);
                }
            }
        }
    }

    public /* synthetic */ C86912g(Effect effect, C86687a aVar, String str) {
        this(effect, aVar, str, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86912g(Effect effect, C86687a aVar, String str, C86838c cVar) {
        super(str);
        C89219l.m154719c(effect, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        this.f195957a = effect;
        this.f195958b = aVar;
        this.f195959c = str;
        this.f195963i = cVar;
        this.f195960f = C86993j.m150666b(effect.getFile_url());
        this.f195961g = new C87991a<>(null);
        this.f195962h = new C87998a(true);
    }
}
