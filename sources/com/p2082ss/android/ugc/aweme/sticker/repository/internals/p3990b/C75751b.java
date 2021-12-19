package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3990b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75370g;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75378e;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75708n;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75710p;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75715t;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75690ab;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75691ac;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.b */
public final class C75751b implements AbstractC75708n {

    /* renamed from: a */
    public final HashMap<String, Effect> f170169a = new HashMap<>();

    /* renamed from: b */
    private final AbstractC75710p f170170b;

    /* renamed from: c */
    private final AbstractC89171a<AbstractC75715t> f170171c;

    /* renamed from: d */
    private final AbstractC75378e f170172d;

    /* renamed from: e */
    private final AbstractC89171a<AbstractC84398d> f170173e;

    static {
        Covode.recordClassIndex(88685);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.b$d */
    static final /* synthetic */ class C75755d extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(88689);
        }

        C75755d(AbstractC75379f fVar) {
            super(0, fVar, AbstractC75379f.class, "onFailed", "onFailed()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((AbstractC75379f) this.receiver).mo118939a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.b$b */
    static final /* synthetic */ class C75753b extends C89217j implements AbstractC89172b<Integer, C89391z> {
        static {
            Covode.recordClassIndex(88687);
        }

        C75753b(AbstractC75379f fVar) {
            super(1, fVar, AbstractC75379f.class, "onProgress", "onProgress(I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            ((AbstractC75379f) this.receiver).mo118940a(num.intValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.b$a */
    public static final class C75752a implements AbstractC84447f<C75691ac, Effect, C75690ab> {

        /* renamed from: a */
        final /* synthetic */ C75751b f170174a;

        /* renamed from: b */
        final /* synthetic */ AbstractC84447f f170175b;

        static {
            Covode.recordClassIndex(88686);
        }

        C75752a(C75751b bVar, AbstractC84447f fVar) {
            this.f170174a = bVar;
            this.f170175b = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119502a(C75691ac acVar, int i) {
            C89219l.m154721d(acVar, "");
            this.f170175b.mo119502a(acVar, i);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119504a(C75691ac acVar, Effect effect) {
            C89219l.m154721d(acVar, "");
            C89219l.m154721d(effect, "");
            this.f170175b.mo119504a(acVar, effect);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Exception, java.lang.Object, long] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119503a(C75691ac acVar, Exception exc, C75690ab abVar, long j) {
            C89219l.m154721d(acVar, "");
            C89219l.m154721d(abVar, "");
            this.f170175b.mo119503a((Object) acVar, exc, (Object) abVar, j);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, long] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119505a(C75691ac acVar, Effect effect, C75690ab abVar, long j) {
            C75691ac acVar2 = acVar;
            C89219l.m154721d(acVar2, "");
            C89219l.m154721d(effect, "");
            C89219l.m154721d(abVar, "");
            this.f170174a.f170169a.put(acVar2.f170122a.getId(), acVar2.f170122a);
            this.f170175b.mo119505a(acVar2, effect, abVar, j);
        }
    }

    /* renamed from: a */
    private final void m132907a(C75691ac acVar, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        this.f170173e.invoke().mo78915b(acVar.f170122a, iEffectDownloadProgressListener);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.b.b$c */
    static final /* synthetic */ class C75754c extends C89217j implements AbstractC89183m<AbstractC75370g, String, C89391z> {
        static {
            Covode.recordClassIndex(88688);
        }

        C75754c(AbstractC75379f fVar) {
            super(2, fVar, AbstractC75379f.class, "onSuccess", "onSuccess(Lcom/ss/android/ugc/aweme/sticker/IStickerMusic;Ljava/lang/String;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC75370g gVar, String str) {
            AbstractC75370g gVar2 = gVar;
            C89219l.m154721d(gVar2, "");
            ((AbstractC75379f) this.receiver).mo118941a(gVar2, str);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75708n
    /* renamed from: a */
    public final boolean mo119435a(Effect effect, boolean z) {
        C89219l.m154721d(effect, "");
        return this.f170169a.containsKey(effect.getId());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84448g
    /* renamed from: a */
    public final /* synthetic */ void mo119501a(C75691ac acVar, AbstractC84447f<C75691ac, Effect, C75690ab> fVar) {
        List<String> music;
        String str;
        C75691ac acVar2 = acVar;
        C89219l.m154721d(acVar2, "");
        C89219l.m154721d(fVar, "");
        boolean a = this.f170170b.mo119439a(acVar2.f170122a);
        C75752a aVar = new C75752a(this, fVar);
        Effect effect = acVar2.f170122a;
        if (C75466g.m132366r(effect) && (music = effect.getMusic()) != null && !music.isEmpty()) {
            this.f170172d.mo118938a(effect);
            C75758e eVar = new C75758e(acVar2, aVar);
            if (a) {
                eVar.onSuccess(acVar2.f170122a);
            } else {
                m132907a(acVar2, eVar);
            }
            List<String> music2 = acVar2.f170122a.getMusic();
            if (music2 == null || (str = (String) C89070n.m154583g((List) music2)) == null) {
                eVar.mo118939a();
            } else {
                this.f170171c.invoke().mo118602a(str, !mo119435a(acVar2.f170122a, false), new C75753b(eVar), new C75754c(eVar), new C75755d(eVar));
            }
        } else if (a) {
            aVar.mo119505a(acVar2, acVar2.f170122a, new C75690ab(0, 7), 0);
        } else {
            m132907a(acVar2, new C75757d(acVar2, aVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.sticker.repository.a.t> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75751b(AbstractC75710p pVar, AbstractC89171a<? extends AbstractC75715t> aVar, AbstractC75378e eVar, AbstractC89171a<? extends AbstractC84398d> aVar2) {
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar2, "");
        this.f170170b = pVar;
        this.f170171c = aVar;
        this.f170172d = eVar;
        this.f170173e = aVar2;
    }
}
