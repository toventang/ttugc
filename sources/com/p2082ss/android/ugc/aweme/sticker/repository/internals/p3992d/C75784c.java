package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3992d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75370g;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75377d;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75378e;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75379f;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75709o;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75715t;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.c */
public final class C75784c implements AbstractC75377d {

    /* renamed from: a */
    AbstractC75378e f170236a = new C75785a();

    /* renamed from: b */
    public final AbstractC75709o f170237b;

    /* renamed from: c */
    final AbstractC75715t f170238c;

    static {
        Covode.recordClassIndex(88718);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.c$a */
    public static final class C75785a implements AbstractC75378e {
        static {
            Covode.recordClassIndex(88719);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75378e
        /* renamed from: a */
        public final boolean mo118938a(Effect effect) {
            C89219l.m154721d(effect, "");
            return false;
        }

        C75785a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.c$d */
    static final /* synthetic */ class C75788d extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(88722);
        }

        C75788d(AbstractC75379f fVar) {
            super(0, fVar, AbstractC75379f.class, "onFailed", "onFailed()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((AbstractC75379f) this.receiver).mo118939a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.c$e */
    public static final class C75789e implements IFetchEffectListListener {

        /* renamed from: a */
        final /* synthetic */ C75784c f170239a;

        /* renamed from: b */
        final /* synthetic */ IFetchEffectListener f170240b;

        static {
            Covode.recordClassIndex(88723);
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.c$e$a */
        public static final class C75790a implements IEffectDownloadProgressListener {

            /* renamed from: a */
            final /* synthetic */ C75789e f170241a;

            /* renamed from: b */
            final /* synthetic */ List f170242b;

            static {
                Covode.recordClassIndex(88724);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
            public final void onProgress(Effect effect, int i, long j) {
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
                this.f170241a.f170240b.onStart(effect);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
                this.f170241a.f170240b.onSuccess(effect);
            }

            C75790a(C75789e eVar, List list) {
                this.f170241a = eVar;
                this.f170242b = list;
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C89219l.m154721d(exceptionResult, "");
                this.f170241a.f170240b.onFail(effect, exceptionResult);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
        public final void onFail(ExceptionResult exceptionResult) {
            IFetchEffectListener iFetchEffectListener = this.f170240b;
            if (exceptionResult == null) {
                exceptionResult = new ExceptionResult(-1, new IllegalStateException("get effect info error"));
            }
            iFetchEffectListener.onFail(null, exceptionResult);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            List<String> music;
            String str;
            List<Effect> list2 = list;
            if (list2 == null || !(!list2.isEmpty())) {
                onFail(new ExceptionResult(-1, new IllegalStateException("get effect info error")));
                return;
            }
            Effect effect = list2.get(0);
            C75784c cVar = this.f170239a;
            if (effect == null || !C75466g.m132366r(effect) || (music = effect.getMusic()) == null || music.isEmpty()) {
                this.f170239a.f170237b.mo119436a(effect, this.f170240b);
                return;
            }
            cVar.f170236a.mo118938a(effect);
            C75778b bVar = new C75778b(effect, new C75790a(this, list2));
            List<String> music2 = effect.getMusic();
            if (music2 == null || (str = music2.get(0)) == null) {
                bVar.mo118939a();
            } else {
                this.f170239a.f170238c.mo118602a(str, true, new C75786b(bVar), new C75787c(bVar), new C75788d(bVar));
            }
            this.f170239a.f170237b.mo119436a(effect, bVar);
        }

        C75789e(C75784c cVar, IFetchEffectListener iFetchEffectListener) {
            this.f170239a = cVar;
            this.f170240b = iFetchEffectListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.c$b */
    static final /* synthetic */ class C75786b extends C89217j implements AbstractC89172b<Integer, C89391z> {
        static {
            Covode.recordClassIndex(88720);
        }

        C75786b(AbstractC75379f fVar) {
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

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.c$c */
    static final /* synthetic */ class C75787c extends C89217j implements AbstractC89183m<AbstractC75370g, String, C89391z> {
        static {
            Covode.recordClassIndex(88721);
        }

        C75787c(AbstractC75379f fVar) {
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

    public C75784c(AbstractC75709o oVar, AbstractC75715t tVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(tVar, "");
        this.f170237b = oVar;
        this.f170238c = tVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c
    /* renamed from: a */
    public final void mo118936a(String str, String str2, IFetchEffectListener iFetchEffectListener) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iFetchEffectListener, "");
        HashMap hashMap = new HashMap();
        hashMap.put("scene", str2);
        mo118937a(str, hashMap, iFetchEffectListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c
    /* renamed from: a */
    public final void mo118937a(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iFetchEffectListener, "");
        this.f170237b.mo119438a(C89070n.m154516a(str), false, map, new C75789e(this, iFetchEffectListener));
    }
}
