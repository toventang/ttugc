package com.p2082ss.android.ugc.aweme.external.p2915a;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.jni.FrameThumb;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.external.p2915a.C47092e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.effect.EffectService;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.AbstractC73999bo;
import com.p2082ss.android.ugc.aweme.shortvideo.util.DefaultVideoCover;
import com.p2082ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.p2082ss.android.ugc.effectmanager.IFetchModelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.p4542av.video.p4546c.C88243b;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.a.a */
public final class C47052a implements IAVEffectService {
    static {
        Covode.recordClassIndex(55656);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$c */
    public static final class C47056c implements IAVEffectService.IAVEffectReadyCallback<AbstractC46415f> {
        static {
            Covode.recordClassIndex(55660);
        }

        C47056c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
        public final /* synthetic */ void finish(AbstractC46415f fVar) {
            AbstractC46415f fVar2 = fVar;
            if (fVar2 != null) {
                fVar2.mo78891a("default");
                fVar2.mo78891a("colorfilternew");
                fVar2.mo78891a("colorfilterexperiment");
                fVar2.mo78891a("mv");
                fVar2.mo78891a("infosticker");
                fVar2.mo78891a("infostickerv2");
                fVar2.mo78891a("emoji-android");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.external.a.a$b */
    public static final class C47055b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback f109608a;

        static {
            Covode.recordClassIndex(55659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47055b(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.f109608a = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f109608a.finish(null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$e */
    static final class C47059e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback f109612a;

        static {
            Covode.recordClassIndex(55663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47059e(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.f109612a = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback = this.f109612a;
            if (iAVEffectReadyCallback != null) {
                iAVEffectReadyCallback.finish(new String[0]);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$g */
    static final class C47062g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback f109615a;

        static {
            Covode.recordClassIndex(55666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47062g(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.f109615a = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f109615a.finish(null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$f */
    static final class C47060f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback f109613a;

        static {
            Covode.recordClassIndex(55664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47060f(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.f109613a = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C63238c.m114594d();
            DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
            C89219l.m154716b(instance, "");
            this.f109613a.finish(new C47061a(instance.getResourceFinder()));
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.a$f$a */
        public static final class C47061a implements IAVEffectService.ResourceFinder {

            /* renamed from: a */
            final /* synthetic */ DownloadableModelSupportResourceFinder f109614a;

            static {
                Covode.recordClassIndex(55665);
            }

            C47061a(DownloadableModelSupportResourceFinder downloadableModelSupportResourceFinder) {
                this.f109614a = downloadableModelSupportResourceFinder;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.ResourceFinder
            public final long createNativeResourceFinder(long j) {
                return this.f109614a.createNativeResourceFinder(j);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.ResourceFinder
            public final void release(long j) {
                this.f109614a.release(j);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void clearCacheInFTC() {
        Application application = C63238c.f143574a;
        C89219l.m154716b(application, "");
        buildEffectPlatform(application, new C47056c(), null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.external.a.a$a */
    public static final class C47053a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback f109604a;

        /* renamed from: b */
        final /* synthetic */ Context f109605b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f109606c;

        static {
            Covode.recordClassIndex(55657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47053a(IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback, Context context, AbstractC89172b bVar) {
            super(0);
            this.f109604a = iAVEffectReadyCallback;
            this.f109605b = context;
            this.f109606c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C88243b.C88244a aVar = C88243b.f200282d;
            Application application = C63238c.f143574a;
            C89219l.m154716b(application, "");
            aVar.mo142775a(application).mo142774b();
            this.f109604a.finish(C46404c.m89554a(this.f109605b, new AbstractC89172b<EffectPlatformBuilder, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.external.p2915a.C47052a.C47053a.C470541 */

                /* renamed from: a */
                final /* synthetic */ C47053a f109607a;

                static {
                    Covode.recordClassIndex(55658);
                }

                {
                    this.f109607a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(EffectPlatformBuilder effectPlatformBuilder) {
                    C89219l.m154721d(effectPlatformBuilder, "");
                    AbstractC89172b bVar = this.f109607a.f109606c;
                    if (bVar != null) {
                        bVar.invoke(effectPlatformBuilder);
                    }
                    return C89391z.f203057a;
                }
            }));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$d */
    static final class C47057d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ String[] f109609a;

        /* renamed from: b */
        final /* synthetic */ IAVEffectService.IAVEffectReadyCallback f109610b;

        static {
            Covode.recordClassIndex(55661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47057d(String[] strArr, IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback) {
            super(0);
            this.f109609a = strArr;
            this.f109610b = iAVEffectReadyCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C88243b.C88244a aVar = C88243b.f200282d;
            Application application = C63238c.f143574a;
            C89219l.m154716b(application, "");
            aVar.mo142775a(application).mo142774b();
            C63238c.m114594d();
            DownloadableModelSupport.getInstance().fetchResourcesNeededByRequirements(this.f109609a, new IFetchModelListener(this) {
                /* class com.p2082ss.android.ugc.aweme.external.p2915a.C47052a.C47057d.C470581 */

                /* renamed from: a */
                final /* synthetic */ C47057d f109611a;

                static {
                    Covode.recordClassIndex(55662);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f109611a = r1;
                }

                @Override // com.p2082ss.android.ugc.effectmanager.IFetchModelListener
                public final void onFailed(Exception exc) {
                    C89219l.m154721d(exc, "");
                    IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback = this.f109611a.f109610b;
                    if (iAVEffectReadyCallback != null) {
                        iAVEffectReadyCallback.finish(null);
                    }
                }

                @Override // com.p2082ss.android.ugc.effectmanager.IFetchModelListener
                public final void onSuccess(String[] strArr) {
                    C89219l.m154721d(strArr, "");
                    IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback = this.f109611a.f109610b;
                    if (iAVEffectReadyCallback != null) {
                        iAVEffectReadyCallback.finish(strArr);
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final boolean isEffectControlGame(Effect effect) {
        C89219l.m154721d(effect, "");
        return C72847c.m128639e(effect);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void provideResourceFinder(IAVEffectService.IAVEffectReadyCallback<IAVEffectService.ResourceFinder> iAVEffectReadyCallback) {
        C89219l.m154721d(iAVEffectReadyCallback, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = false;
        C47092e.C47093a a = aVar.mo79415a(new C47060f(iAVEffectReadyCallback));
        a.f109673a = new C47062g(iAVEffectReadyCallback);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectModel(String[] strArr, IAVEffectService.IAVEffectReadyCallback<String[]> iAVEffectReadyCallback) {
        C89219l.m154721d(strArr, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = false;
        C47092e.C47093a a = aVar.mo79415a(new C47057d(strArr, iAVEffectReadyCallback));
        a.f109673a = new C47059e(iAVEffectReadyCallback);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void buildEffectPlatform(Context context, IAVEffectService.IAVEffectReadyCallback<AbstractC46415f> iAVEffectReadyCallback, AbstractC89172b<? super EffectPlatformBuilder, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(iAVEffectReadyCallback, "");
        buildEffectPlatform(context, false, iAVEffectReadyCallback, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void buildEffectPlatform(Context context, boolean z, IAVEffectService.IAVEffectReadyCallback<AbstractC46415f> iAVEffectReadyCallback, AbstractC89172b<? super EffectPlatformBuilder, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(iAVEffectReadyCallback, "");
        C47092e.C47093a aVar = new C47092e.C47093a();
        aVar.f109675c = z;
        C47092e.C47093a a = aVar.mo79415a(new C47053a(iAVEffectReadyCallback, context, bVar));
        a.f109673a = new C47055b(iAVEffectReadyCallback);
        a.mo79416a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectListResource(List<String> list, Map<String, String> map, boolean z, AbstractC46415f fVar, IFetchEffectListListener iFetchEffectListListener) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(fVar, "");
        fVar.mo78912a(list, map, true, iFetchEffectListListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final void fetchEffectResource(String str, boolean z, Map<String, String> map, AbstractC46415f fVar, IFetchEffectListener iFetchEffectListener) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        if (z) {
            EffectService.getInstance().fetchEffectWithMusicBind(fVar, str, map, iFetchEffectListener);
        } else {
            fVar.mo78906a(str, map, iFetchEffectListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService
    public final AbstractC73999bo getVideoCoverBitmapCache(AbstractC1204m mVar, String str, int i, int i2, int i3) {
        AbstractC73999bo boVar;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        C30731d.m63114a();
        FrameThumb frameThumb = new FrameThumb();
        int[] initVideoToGraph = frameThumb.initVideoToGraph(str, i, i2);
        if (initVideoToGraph[0] == 0) {
            int i4 = initVideoToGraph[4];
            int i5 = initVideoToGraph[5];
            if (i3 >= 40) {
                boVar = new VideoCoverCacheImpl(mVar, frameThumb, str, i4, i5);
            } else {
                boVar = new DefaultVideoCover(mVar, frameThumb, str, i4, i5);
            }
        } else {
            boVar = null;
        }
        C89219l.m154716b(boVar, "");
        return boVar;
    }
}
