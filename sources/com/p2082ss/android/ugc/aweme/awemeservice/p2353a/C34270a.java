package com.p2082ss.android.ugc.aweme.awemeservice.p2353a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.p2082ss.android.ugc.aweme.awemeservice.p2354b.C34289a;
import com.p2082ss.android.ugc.aweme.awemeservice.p2354b.C34290b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.Collection;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88935b;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.a */
public final class C34270a {

    /* renamed from: a */
    static AbstractC34277b<String> f81045a;

    /* renamed from: b */
    public static final AbstractC34277b<String> f81046b = new C34276a();

    /* renamed from: c */
    public static final C34270a f81047c = new C34270a();

    /* renamed from: com.ss.android.ugc.aweme.awemeservice.a.a$a */
    public static final class C34276a implements AbstractC34277b<String> {
        static {
            Covode.recordClassIndex(41217);
        }

        C34276a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
        /* renamed from: b */
        public final void mo60702b() {
            C34270a.f81045a.mo60702b();
        }

        @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
        /* renamed from: a */
        public final Collection<Aweme> mo60700a() {
            Collection<Aweme> a = C34270a.f81045a.mo60700a();
            C89219l.m154716b(a, "");
            return a;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
        /* renamed from: a */
        public final /* synthetic */ Aweme mo60699a(String str) {
            Aweme a = C34270a.f81045a.mo60699a(str);
            C89219l.m154716b(a, "");
            return a;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo60703b(String str) {
            return C34270a.f81045a.mo60703b(str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.aweme.feed.model.Aweme] */
        @Override // com.p2082ss.android.ugc.aweme.awemeservice.p2353a.AbstractC34277b
        /* renamed from: a */
        public final /* synthetic */ void mo60701a(String str, Aweme aweme) {
            if (aweme != null) {
                Aweme clone = aweme.clone();
                C89219l.m154716b(clone, "");
                C89219l.m154721d(clone, "");
                C34289a aVar = C34290b.f81078b;
                String aid = clone.getAid();
                C89219l.m154716b(aid, "");
                aVar.mo33457a(aid, clone);
            }
            C34270a.f81045a.mo60701a(str, aweme);
        }
    }

    private C34270a() {
    }

    static {
        AbstractC34277b<String> cVar;
        Covode.recordClassIndex(41211);
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
        if (createIMainServicebyMonsterPlugin.isReplaceAwemeCache()) {
            cVar = new C34279d();
        } else {
            cVar = new C34278c();
        }
        f81045a = cVar;
        C88935b.m154196a(C34290b.f81079c.mo33476a(true, new AbstractC20168e[0])).mo143292d(C342711.f81048a).mo143268a(C342722.f81049a).mo143292d(C342733.f81050a).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(C342744.f81051a, C342755.f81052a);
    }
}
