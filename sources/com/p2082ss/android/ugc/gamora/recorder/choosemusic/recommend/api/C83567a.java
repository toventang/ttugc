package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model.C83621a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a */
public final class C83567a {
    static {
        Covode.recordClassIndex(97454);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a$f */
    public static final class CallableC83573f<V> implements Callable {

        /* renamed from: a */
        public static final CallableC83573f f186611a = new CallableC83573f();

        static {
            Covode.recordClassIndex(97460);
        }

        CallableC83573f() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a$c */
    public static final class C83570c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f186608a;

        static {
            Covode.recordClassIndex(97457);
        }

        public C83570c(AbstractC89172b bVar) {
            this.f186608a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f186608a.invoke(C83621a.f186689e);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a$h */
    public static final class C83575h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C83575h f186613a = new C83575h();

        static {
            Covode.recordClassIndex(97462);
        }

        C83575h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            C89219l.m154721d(arrayList, "");
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a$b */
    public static final class C83569b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f186607a;

        static {
            Covode.recordClassIndex(97456);
        }

        public C83569b(AbstractC89172b bVar) {
            this.f186607a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC89172b bVar = this.f186607a;
            C89219l.m154716b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a$d */
    public static final class C83571d<T> implements AbstractC88407af {

        /* renamed from: a */
        public static final C83571d f186609a = new C83571d();

        static {
            Covode.recordClassIndex(97458);
        }

        C83571d() {
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<List<SimpleMusic>> adVar) {
            C89219l.m154721d(adVar, "");
            adVar.mo142931a(C89086z.INSTANCE);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a$e */
    public static final class C83572e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ RecommendMusicApi f186610a;

        static {
            Covode.recordClassIndex(97459);
        }

        public C83572e(RecommendMusicApi recommendMusicApi) {
            this.f186610a = recommendMusicApi;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            return this.f186610a.getMusicDetail(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a$g */
    public static final class C83574g<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        public static final C83574g f186612a = new C83574g();

        static {
            Covode.recordClassIndex(97461);
        }

        C83574g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            C89219l.m154721d(obj2, "");
            list.add(obj2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.a$a */
    public static final class C83568a<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C83568a f186606a = new C83568a();

        static {
            Covode.recordClassIndex(97455);
        }

        C83568a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            List list = (List) obj;
            RecommendMusic recommendMusic = (RecommendMusic) obj2;
            C89219l.m154721d(list, "");
            C89219l.m154721d(recommendMusic, "");
            return new C83621a(recommendMusic, list);
        }
    }
}
