package com.p2082ss.ugc.effectplatform.task.p4457a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.algorithm.C86712f;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4440a.C86693b;
import com.p2082ss.ugc.effectplatform.p4444b.C86734a;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.task.AbstractC86881ak;
import com.p2082ss.ugc.effectplatform.task.C86861aa;
import com.p2082ss.ugc.effectplatform.task.C86880aj;
import com.p2082ss.ugc.effectplatform.task.p4459c.C86904a;
import com.p2082ss.ugc.effectplatform.util.C86980a;
import java.util.List;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.a.a */
public final class C86855a extends C86880aj<C86904a> {

    /* renamed from: e */
    public static final C86856a f195809e = new C86856a((byte) 0);

    /* renamed from: a */
    public final C86861aa f195810a;

    /* renamed from: b */
    public final C86712f f195811b;

    /* renamed from: c */
    public final C86734a f195812c;

    /* renamed from: d */
    public final C86687a f195813d;

    /* renamed from: g */
    private final C86880aj<C86904a> f195814g;

    /* renamed from: h */
    private final C86693b f195815h;

    static {
        Covode.recordClassIndex(102620);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.a.a$a */
    public static final class C86856a {
        static {
            Covode.recordClassIndex(102621);
        }

        private C86856a() {
        }

        public /* synthetic */ C86856a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.task.C86880aj
    /* renamed from: a */
    public final void mo140577a() {
        try {
            mo140594a(this);
            C86693b bVar = this.f195815h;
            if (bVar != null) {
                mo140578a(bVar);
            }
            C86880aj<C86904a> ajVar = this.f195814g;
            if (ajVar != null) {
                ajVar.mo140577a();
            }
        } catch (Exception e) {
            mo140596a((C86880aj) this, new C86840e(e));
            mo140599b(this);
        } catch (Throwable th) {
            mo140599b(this);
            throw th;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.a.a$b */
    public static final class C86857b implements AbstractC86881ak<C86904a> {

        /* renamed from: a */
        final /* synthetic */ C86855a f195816a;

        static {
            Covode.recordClassIndex(102622);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C86857b(C86855a aVar) {
            this.f195816a = aVar;
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: a */
        public final void mo140579a(C86880aj<C86904a> ajVar) {
            C89219l.m154719c(ajVar, "");
            this.f195816a.mo140594a(ajVar);
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: b */
        public final void mo140583b(C86880aj<C86904a> ajVar) {
            C89219l.m154719c(ajVar, "");
            this.f195816a.mo140599b(ajVar);
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: a */
        public final void mo140581a(C86880aj<C86904a> ajVar, C86840e eVar) {
            C89219l.m154719c(ajVar, "");
            C89219l.m154719c(eVar, "");
            this.f195816a.mo140596a((C86880aj) ajVar, eVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.effectplatform.task.aj, java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: a */
        public final /* synthetic */ void mo140582a(C86880aj<C86904a> ajVar, C86904a aVar) {
            C89219l.m154719c(ajVar, "");
            C89219l.m154719c(aVar, "");
            this.f195816a.mo140597a(ajVar, aVar);
        }

        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86881ak
        /* renamed from: a */
        public final void mo140580a(C86880aj<C86904a> ajVar, int i, long j) {
            C89219l.m154719c(ajVar, "");
            this.f195816a.mo140595a(ajVar, i, j);
        }
    }

    /* renamed from: a */
    public final void mo140578a(C86693b bVar) {
        List list;
        Effect effect = bVar.f195505a;
        try {
            if (C86980a.m150631a(effect)) {
                StringBuilder append = new StringBuilder("Effect Requirements Decrypt Failed, effect: ").append(effect.getEffect_id()).append(", name: ").append(effect.getName()).append(", toDownloadRequirements: ");
                List<String> requirements_sec = effect.getRequirements_sec();
                if (requirements_sec != null) {
                    list = C89070n.m154590j(requirements_sec);
                } else {
                    list = null;
                }
                throw new IllegalArgumentException(append.append(list).toString());
            }
            new C86859c(this.f195813d, this.f195810a, this.f195811b, this.f195812c, C86980a.m150632a(bVar.f195505a, this.f195813d.f195461q), 0, 64).run();
        } catch (Exception e) {
            V v = this.f195813d.f195463s.f199870a;
            if (v != null) {
                C86802b.m150358c(v, false, this.f195813d, effect.getEffect_id(), C89041ag.m154412a(C89387v.m154943a("error_code", 10018)), "download effect failed because of model fetcher failed! detail: " + e.getMessage());
            }
            throw e;
        }
    }

    public C86855a(C86880aj<C86904a> ajVar, C86693b bVar, C86861aa aaVar, C86712f fVar, C86734a aVar, C86687a aVar2) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        this.f195814g = ajVar;
        this.f195815h = bVar;
        this.f195810a = aaVar;
        this.f195811b = fVar;
        this.f195812c = aVar;
        this.f195813d = aVar2;
        if (ajVar != null) {
            ajVar.mo140598a(new C86857b(this));
        }
    }
}
