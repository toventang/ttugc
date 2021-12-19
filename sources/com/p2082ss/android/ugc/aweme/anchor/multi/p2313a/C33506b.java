package com.p2082ss.android.ugc.aweme.anchor.multi.p2313a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.anchor.multi.a.b */
public final class C33506b {
    static {
        Covode.recordClassIndex(40366);
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.multi.a.b$a */
    static final class C33507a extends AbstractC89220m implements AbstractC89172b<AbstractC60201c, CharSequence> {

        /* renamed from: a */
        public static final C33507a f79603a = new C33507a();

        static {
            Covode.recordClassIndex(40367);
        }

        C33507a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(AbstractC60201c cVar) {
            AbstractC60201c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return cVar2.mo97872b().mo97903d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.multi.a.b$b */
    static final class C33508b extends AbstractC89220m implements AbstractC89172b<AbstractC60201c, CharSequence> {

        /* renamed from: a */
        public static final C33508b f79604a = new C33508b();

        static {
            Covode.recordClassIndex(40368);
        }

        C33508b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(AbstractC60201c cVar) {
            AbstractC60201c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return cVar2.mo97872b().mo97905f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.multi.a.b$c */
    static final class C33509c extends AbstractC89220m implements AbstractC89172b<AbstractC60201c, CharSequence> {

        /* renamed from: a */
        public static final C33509c f79605a = new C33509c();

        static {
            Covode.recordClassIndex(40369);
        }

        C33509c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(AbstractC60201c cVar) {
            AbstractC60201c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return cVar2.mo97872b().mo97904e();
        }
    }

    /* renamed from: a */
    public static final C33744d m68654a(C60202d dVar, AbstractC60201c cVar, boolean z) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        C33744d a = new C33744d().mo59983a("main_anchor_id", cVar.mo97872b().mo97899a()).mo59983a("main_anchor_name", cVar.mo97872b().mo97902c()).mo59983a("main_anchor_type", cVar.mo97872b().mo97901b()).mo59980a("multi_anchor", z ? 1 : 0).mo59983a("group_id", dVar.f137230b.getAid()).mo59983a("anchor_id", C89070n.m154551a(dVar.f137229a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C33507a.f79603a, 30)).mo59983a("anchor_name", C89070n.m154551a(dVar.f137229a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C33508b.f79604a, 30)).mo59983a("anchor_type", C89070n.m154551a(dVar.f137229a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C33509c.f79605a, 30));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    public static final C33744d m68655b(C60202d dVar, AbstractC60201c cVar, boolean z) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        if (C89070n.m154583g((List) dVar.f137229a) == null) {
            new C33744d();
        }
        C33744d a = new C33744d().mo59983a("main_anchor_id", ((AbstractC60201c) C89070n.m154579f((List) dVar.f137229a)).mo97872b().mo97899a()).mo59983a("main_anchor_name", ((AbstractC60201c) C89070n.m154579f((List) dVar.f137229a)).mo97872b().mo97902c()).mo59983a("main_anchor_type", ((AbstractC60201c) C89070n.m154579f((List) dVar.f137229a)).mo97872b().mo97901b()).mo59980a("multi_anchor", z ? 1 : 0).mo59983a("group_id", dVar.f137230b.getAid()).mo59983a("anchor_id", cVar.mo97872b().mo97899a()).mo59983a("anchor_name", cVar.mo97872b().mo97902c()).mo59983a("anchor_type", cVar.mo97872b().mo97901b());
        C89219l.m154716b(a, "");
        return a;
    }
}
