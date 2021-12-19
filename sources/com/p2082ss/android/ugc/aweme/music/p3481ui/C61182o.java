package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.music.C60789f;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.o */
public final /* synthetic */ class C61182o {
    static {
        Covode.recordClassIndex(71787);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.ui.o$b */
    public static final class C61191b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ AbstractC88969g f138925a;

        /* renamed from: b */
        final /* synthetic */ String f138926b;

        /* renamed from: c */
        final /* synthetic */ Effect f138927c;

        /* renamed from: d */
        final /* synthetic */ Context f138928d;

        /* renamed from: e */
        final /* synthetic */ Map f138929e;

        static {
            Covode.recordClassIndex(71796);
        }

        C61191b(AbstractC88969g gVar, String str, Effect effect, Context context, Map map) {
            this.f138925a = gVar;
            this.f138926b = str;
            this.f138927c = effect;
            this.f138928d = context;
            this.f138929e = map;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C61198q> vVar) {
            C89219l.m154721d(vVar, "");
            IAVEffectService effectService = AVExternalServiceImpl.m113114a().abilityService().effectService();
            final C611921 r3 = new AbstractC89172b<Effect, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61182o.C61191b.C611921 */

                /* renamed from: a */
                final /* synthetic */ C61191b f138930a;

                static {
                    Covode.recordClassIndex(71797);
                }

                {
                    this.f138930a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Effect effect) {
                    mo98724a(effect);
                    return C89391z.f203057a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.l.g */
                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public final void mo98724a(Effect effect) {
                    this.f138930a.f138925a.onNext(new C61197p(-101, -104, effect, 8));
                    AbstractC88982v vVar = vVar;
                    vVar.mo143031a(new C61198q(null, null, null, null, effect, -105, null, 79));
                    vVar.mo143023a();
                }
            };
            if (TextUtils.isEmpty(this.f138926b)) {
                r3.mo98724a(null);
                return;
            }
            Effect effect = this.f138927c;
            if (effect == null) {
                effectService.buildEffectPlatform(this.f138928d, new IAVEffectService.IAVEffectReadyCallback<AbstractC46415f>(this) {
                    /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61182o.C61191b.C611932 */

                    /* renamed from: a */
                    final /* synthetic */ C61191b f138932a;

                    static {
                        Covode.recordClassIndex(71798);
                    }

                    /* renamed from: com.ss.android.ugc.aweme.music.ui.o$b$2$a */
                    public static final class C61194a implements IFetchEffectListListener {

                        /* renamed from: a */
                        final /* synthetic */ C611932 f138934a;

                        static {
                            Covode.recordClassIndex(71799);
                        }

                        C61194a(C611932 r1) {
                            this.f138934a = r1;
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            r3.mo98724a(null);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* synthetic */ void onSuccess(List<Effect> list) {
                            Effect effect;
                            List<Effect> list2 = list;
                            C611921 r1 = r3;
                            if (list2 != null) {
                                effect = list2.get(0);
                            } else {
                                effect = null;
                            }
                            r1.mo98724a(effect);
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                    public final /* synthetic */ void finish(AbstractC46415f fVar) {
                        AbstractC46415f fVar2 = fVar;
                        if (fVar2 != null) {
                            String str = this.f138932a.f138926b;
                            if (str == null) {
                                C89219l.m154715b();
                            }
                            fVar2.mo78912a(C89070n.m154516a(str), this.f138932a.f138929e, false, (IFetchEffectListListener) new C61194a(this));
                        }
                    }

                    {
                        this.f138932a = r1;
                    }
                }, null);
            } else {
                r3.mo98724a(effect);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.ui.o$a */
    public static final class C61183a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ String f138908a;

        /* renamed from: b */
        final /* synthetic */ Effect f138909b;

        /* renamed from: c */
        final /* synthetic */ AbstractC88969g f138910c;

        /* renamed from: d */
        final /* synthetic */ Context f138911d;

        /* renamed from: e */
        final /* synthetic */ Map f138912e;

        static {
            Covode.recordClassIndex(71788);
        }

        C61183a(String str, Effect effect, AbstractC88969g gVar, Context context, Map map) {
            this.f138908a = str;
            this.f138909b = effect;
            this.f138910c = gVar;
            this.f138911d = context;
            this.f138912e = map;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C61198q> vVar) {
            C89219l.m154721d(vVar, "");
            final C611841 r1 = new AbstractC89172b<Effect, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61182o.C61183a.C611841 */

                static {
                    Covode.recordClassIndex(71789);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Effect effect) {
                    mo98721a(effect);
                    return C89391z.f203057a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public final void mo98721a(Effect effect) {
                    AbstractC88982v vVar = vVar;
                    vVar.mo143031a(new C61198q(null, null, null, null, effect, 100, null, 79));
                    vVar.mo143023a();
                }
            };
            final C611852 r5 = new AbstractC89183m<Effect, ExceptionResult, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61182o.C61183a.C611852 */

                static {
                    Covode.recordClassIndex(71790);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(Effect effect, ExceptionResult exceptionResult) {
                    mo98722a(effect, exceptionResult);
                    return C89391z.f203057a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public final void mo98722a(Effect effect, ExceptionResult exceptionResult) {
                    C89219l.m154721d(exceptionResult, "");
                    AbstractC88982v vVar = vVar;
                    vVar.mo143031a(new C61198q(null, null, null, null, effect, -103, exceptionResult, 15));
                    vVar.mo143023a();
                }
            };
            if (TextUtils.isEmpty(this.f138908a)) {
                r5.mo98722a(this.f138909b, new ExceptionResult(-1));
                return;
            }
            final IAVEffectService effectService = AVExternalServiceImpl.m113114a().abilityService().effectService();
            final C611863 r3 = new AbstractC89172b<Effect, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61182o.C61183a.C611863 */

                /* renamed from: a */
                final /* synthetic */ C61183a f138915a;

                static {
                    Covode.recordClassIndex(71791);
                }

                {
                    this.f138915a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Effect effect) {
                    mo98723a(effect);
                    return C89391z.f203057a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.l.g */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public final void mo98723a(final Effect effect) {
                    this.f138915a.f138910c.onNext(new C61197p(-101, -104, effect, 8));
                    effectService.buildEffectPlatform(this.f138915a.f138911d, new IAVEffectService.IAVEffectReadyCallback<AbstractC46415f>(this) {
                        /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61182o.C61183a.C611863.C611871 */

                        /* renamed from: a */
                        final /* synthetic */ C611863 f138919a;

                        static {
                            Covode.recordClassIndex(71792);
                        }

                        /* renamed from: com.ss.android.ugc.aweme.music.ui.o$a$3$1$a */
                        public static final class C61188a implements IEffectDownloadProgressListener {

                            /* renamed from: a */
                            final /* synthetic */ C611871 f138921a;

                            static {
                                Covode.recordClassIndex(71793);
                            }

                            C61188a(C611871 r1) {
                                this.f138921a = r1;
                            }

                            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.l.g */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onStart(Effect effect) {
                                C89219l.m154721d(effect, "");
                                this.f138921a.f138919a.f138915a.f138910c.onNext(new C61197p(-101, -102, effect, 8));
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final /* synthetic */ void onSuccess(Effect effect) {
                                Effect effect2 = effect;
                                C89219l.m154721d(effect2, "");
                                r1.mo98721a(effect2);
                            }

                            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                                C89219l.m154721d(exceptionResult, "");
                                r5.mo98722a(effect, exceptionResult);
                            }

                            /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: f.a.l.g */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                            public final void onProgress(Effect effect, int i, long j) {
                                C89219l.m154721d(effect, "");
                                this.f138921a.f138919a.f138915a.f138910c.onNext(new C61197p(-101, i, effect, j));
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                        public final /* synthetic */ void finish(AbstractC46415f fVar) {
                            AbstractC46415f fVar2 = fVar;
                            if (fVar2 == null) {
                                return;
                            }
                            if (fVar2.mo78914a(effect)) {
                                r1.mo98721a(effect);
                                return;
                            }
                            C61188a aVar = new C61188a(this);
                            IAVEffectService iAVEffectService = effectService;
                            String str = this.f138919a.f138915a.f138908a;
                            if (str == null) {
                                C89219l.m154715b();
                            }
                            iAVEffectService.fetchEffectResource(str, true, this.f138919a.f138915a.f138912e, fVar2, aVar);
                        }

                        {
                            this.f138919a = r1;
                        }
                    }, null);
                }
            };
            Effect effect = this.f138909b;
            if (effect == null) {
                effectService.buildEffectPlatform(this.f138911d, new IAVEffectService.IAVEffectReadyCallback<AbstractC46415f>(this) {
                    /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61182o.C61183a.C611894 */

                    /* renamed from: a */
                    final /* synthetic */ C61183a f138922a;

                    static {
                        Covode.recordClassIndex(71794);
                    }

                    /* renamed from: com.ss.android.ugc.aweme.music.ui.o$a$4$a */
                    public static final class C61190a implements IFetchEffectListListener {

                        /* renamed from: a */
                        final /* synthetic */ C611894 f138924a;

                        static {
                            Covode.recordClassIndex(71795);
                        }

                        C61190a(C611894 r1) {
                            this.f138924a = r1;
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            r3.mo98723a(null);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* synthetic */ void onSuccess(List<Effect> list) {
                            Effect effect;
                            List<Effect> list2 = list;
                            C611863 r1 = r3;
                            if (list2 != null) {
                                effect = list2.get(0);
                            } else {
                                effect = null;
                            }
                            r1.mo98723a(effect);
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                    public final /* synthetic */ void finish(AbstractC46415f fVar) {
                        AbstractC46415f fVar2 = fVar;
                        if (fVar2 != null) {
                            String str = this.f138922a.f138908a;
                            if (str == null) {
                                C89219l.m154715b();
                            }
                            fVar2.mo78912a(C89070n.m154516a(str), this.f138922a.f138912e, false, (IFetchEffectListListener) new C61190a(this));
                        }
                    }

                    {
                        this.f138922a = r1;
                    }
                }, null);
            } else {
                r3.mo98723a(effect);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.ui.o$c */
    public static final class C61195c<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ MusicModel f138935a;

        /* renamed from: b */
        final /* synthetic */ C60789f f138936b;

        /* renamed from: c */
        final /* synthetic */ AbstractC88969g f138937c;

        static {
            Covode.recordClassIndex(71800);
        }

        C61195c(MusicModel musicModel, C60789f fVar, AbstractC88969g gVar) {
            this.f138935a = musicModel;
            this.f138936b = fVar;
            this.f138937c = gVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C61198q> vVar) {
            C89219l.m154721d(vVar, "");
            MusicModel musicModel = this.f138935a;
            if (musicModel == null) {
                vVar.mo143031a(new C61198q(null, null, -103, null, null, null, null, 123));
                vVar.mo143023a();
            } else if (!this.f138936b.mo98201a(musicModel, new AbstractC61065b(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61182o.C61195c.C611961 */

                /* renamed from: a */
                final /* synthetic */ C61195c f138938a;

                static {
                    Covode.recordClassIndex(71801);
                }

                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: a */
                public final void mo69324a() {
                }

                /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: f.a.l.g */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: b */
                public final void mo69328b() {
                    this.f138938a.f138937c.onNext(new C61197p(-100, -102, (Effect) null, 12));
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: f.a.l.g */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: a */
                public final void mo69325a(int i) {
                    this.f138938a.f138937c.onNext(new C61197p(-100, i, (Effect) null, 12));
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: a */
                public final void mo69326a(C84125a aVar) {
                    C89219l.m154721d(aVar, "");
                    vVar.mo143031a(new C61198q(null, null, -103, aVar, null, null, null, 115));
                    vVar.mo143023a();
                }

                {
                    this.f138938a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
                /* renamed from: a */
                public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
                    C89219l.m154721d(str, "");
                    vVar.mo143031a(new C61198q(str, musicWaveBean, 100, null, null, null, null, 120));
                    vVar.mo143023a();
                }
            }, true, true)) {
                vVar.mo143031a(new C61198q(null, null, -103, new C84125a(-1, "don`t start download music"), null, null, null, 115));
                vVar.mo143023a();
            }
        }
    }

    /* renamed from: a */
    public static final AbstractC88979t<C61198q> m110813a(C60789f fVar, MusicModel musicModel, AbstractC88969g<C61197p> gVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(gVar, "");
        AbstractC88979t<C61198q> a = AbstractC88979t.m154294a(new C61195c(musicModel, fVar, gVar));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final AbstractC88979t<C61198q> m110812a(Context context, String str, Effect effect, AbstractC88969g<C61197p> gVar, Map<String, String> map) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(gVar, "");
        AbstractC88979t<C61198q> a = AbstractC88979t.m154294a(new C61183a(str, effect, gVar, context, map));
        C89219l.m154716b(a, "");
        return a;
    }
}
