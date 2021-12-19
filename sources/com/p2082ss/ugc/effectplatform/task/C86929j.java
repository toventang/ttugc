package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.UrlModel;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4444b.C86749c;
import com.p2082ss.ugc.effectplatform.p4444b.C86751d;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86735a;
import com.p2082ss.ugc.effectplatform.p4449f.C86787g;
import com.p2082ss.ugc.effectplatform.p4455l.C86824a;
import com.p2082ss.ugc.effectplatform.task.p4458b.C86895b;
import com.p2082ss.ugc.effectplatform.task.p4458b.C86896c;
import com.p2082ss.ugc.effectplatform.task.p4458b.C86901d;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import java.util.ArrayList;
import java.util.List;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4532e.C88060b;
import p4519d.p4520a.p4533f.AbstractC88064c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.task.j */
public final class C86929j extends C86880aj<Effect> {

    /* renamed from: a */
    public static final C86930a f195990a = new C86930a((byte) 0);

    /* renamed from: b */
    private final C86687a f195991b;

    /* renamed from: c */
    private final String f195992c;

    /* renamed from: d */
    private final Effect f195993d;

    static {
        Covode.recordClassIndex(102694);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.j$a */
    public static final class C86930a {
        static {
            Covode.recordClassIndex(102695);
        }

        private C86930a() {
        }

        public /* synthetic */ C86930a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final void m150558b() {
        if (C88045d.m153118f(this.f195993d.getTransResPath())) {
            C88045d.m153119g(this.f195993d.getTransResPath());
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.task.C86880aj
    /* renamed from: a */
    public final void mo140577a() {
        String uri;
        String str = this.f195992c;
        if (str == null || C89361p.m154870a((CharSequence) str)) {
            m150558b();
            throw new Exception("effectDir is null");
        }
        UrlModel trans_file_url = this.f195993d.getTrans_file_url();
        String str2 = null;
        if (trans_file_url != null && (uri = trans_file_url.getUri()) != null && !C89361p.m154870a((CharSequence) uri) && C89361p.m154870a((CharSequence) this.f195993d.getTransResPath())) {
            C86993j.m150660a(this.f195992c, this.f195993d);
        }
        C88060b.m153135a("DownloadTransResourceTask", "fetchEffect: " + this.f195993d.getEffect_id() + " name: " + this.f195993d.getName() + " download trans res: " + this.f195993d.getTransResPath());
        if (!C88045d.m153118f(this.f195993d.getTransResPath())) {
            C86824a.m150397a(this.f195992c, this.f195993d);
            List<String> b = C86993j.m150666b(this.f195993d.getTrans_file_url());
            if (b != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : b) {
                    if (!C89361p.m154870a((CharSequence) t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    String str3 = this.f195992c;
                    String transResPath = this.f195993d.getTransResPath();
                    UrlModel trans_file_url2 = this.f195993d.getTrans_file_url();
                    if (trans_file_url2 != null) {
                        str2 = trans_file_url2.getUri();
                    }
                    m150557a(str3, arrayList2, transResPath, str2);
                    return;
                }
            }
            m150558b();
            throw new C86787g("trans file url not exist");
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.j$b */
    public static final class C86931b implements AbstractC88064c<C86701e, String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88064c f195994a;

        /* renamed from: b */
        final /* synthetic */ AbstractC88064c f195995b;

        static {
            Covode.recordClassIndex(102696);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4519d.p4520a.p4533f.AbstractC88064c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo140606a(com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e r3) {
            /*
                r2 = this;
                d.a.f.c r0 = r2.f195994a
                java.lang.Object r1 = r0.mo140606a(r3)
                d.a.f.c r0 = r2.f195995b
                java.lang.Object r0 = r0.mo140606a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.task.C86929j.C86931b.mo140606a(java.lang.Object):java.lang.Object");
        }

        public C86931b(AbstractC88064c cVar, AbstractC88064c cVar2) {
            this.f195994a = cVar;
            this.f195995b = cVar2;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.j$c */
    public static final class C86932c implements AbstractC88064c<C86701e, String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC88064c f195996a;

        /* renamed from: b */
        final /* synthetic */ AbstractC88064c f195997b;

        static {
            Covode.recordClassIndex(102697);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4519d.p4520a.p4533f.AbstractC88064c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo140606a(com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e r3) {
            /*
                r2 = this;
                d.a.f.c r0 = r2.f195996a
                java.lang.Object r1 = r0.mo140606a(r3)
                d.a.f.c r0 = r2.f195997b
                java.lang.Object r0 = r0.mo140606a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.task.C86929j.C86932c.mo140606a(java.lang.Object):java.lang.Object");
        }

        public C86932c(AbstractC88064c cVar, AbstractC88064c cVar2) {
            this.f195996a = cVar;
            this.f195997b = cVar2;
        }
    }

    public C86929j(C86687a aVar, String str, Effect effect) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(effect, "");
        this.f195991b = aVar;
        this.f195992c = str;
        this.f195993d = effect;
    }

    /* renamed from: a */
    private final void m150557a(String str, List<String> list, String str2, String str3) {
        String d;
        if (!C88045d.m153118f(str)) {
            C88045d.m153117e(str);
        }
        Exception e = null;
        C86932c cVar = new C86932c(new C86931b(new C86901d(this.f195991b.f195462r.f199870a), new C86896c(str, str2 + ".zip", str3)), new C86895b(str2));
        for (String str4 : list) {
            try {
                cVar.mo140606a(new C86701e(str4, EnumC86699c.GET, null, null, false, 28));
                AbstractC86755f a = C86751d.m150298a(str);
                if (!(a == null || (d = C88045d.m153116d(this.f195993d.getTransResPath())) == null)) {
                    ((C86749c) a).mo140015g(C86735a.C86736a.m150258a(d));
                    return;
                }
                return;
            } catch (Exception e2) {
                e = e2;
            }
        }
        m150558b();
        if (e != null) {
            throw e;
        }
        throw new Exception("unknown exception");
    }
}
