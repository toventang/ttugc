package com.p2082ss.android.ugc.aweme.effectplatforn;

import android.os.Build;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46414e;
import com.p2082ss.android.ugc.aweme.effectplatform.C46417h;
import com.p2082ss.android.ugc.aweme.effectplatform.C46439w;
import com.p2082ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import com.p2082ss.android.ugc.effectmanager.common.cache.EffectCacheManager;
import com.p2082ss.android.ugc.effectmanager.common.cache.EffectDiskLruCache;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.FileICache;
import com.p2082ss.android.ugc.effectmanager.common.task.SyncTask;
import com.p2082ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.p2082ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import com.p2082ss.android.ugc.effectmanager.link.model.host.Host;
import com.p2082ss.ugc.effectplatform.algorithm.C86704a;
import com.p2082ss.ugc.effectplatform.algorithm.C86709e;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.p2082ss.ugc.effectplatform.p4440a.AbstractC86691a;
import com.p2082ss.ugc.effectplatform.p4440a.C86693b;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86793b;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86794c;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.task.C86880aj;
import com.p2082ss.ugc.effectplatform.task.p4459c.C86904a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory */
public class EffectPlatformFactory implements IEffectPlatformFactory {

    /* renamed from: a */
    public static final C46440a f108211a = new C46440a((byte) 0);

    static {
        Covode.recordClassIndex(55021);
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory$a */
    public static final class C46440a {
        static {
            Covode.recordClassIndex(55022);
        }

        private C46440a() {
        }

        public /* synthetic */ C46440a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory$d */
    public static final class C46443d implements AbstractC46415f {

        /* renamed from: a */
        final /* synthetic */ AbstractC46415f f108214a;

        /* renamed from: b */
        private final /* synthetic */ AbstractC46415f f108215b;

        static {
            Covode.recordClassIndex(55025);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78885a(int i, String str, String str2, Integer num, Integer num2, AbstractC86796e<InfoStickerListResponse> eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(eVar, "");
            this.f108215b.mo78885a(i, str, str2, num, num2, eVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78886a(AbstractC1204m mVar) {
            this.f108215b.mo78886a(mVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78887a(Effect effect, IFetchEffectListener iFetchEffectListener) {
            this.f108215b.mo78887a(effect, iFetchEffectListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78888a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
            C89219l.m154721d(providerEffect, "");
            C89219l.m154721d(iDownloadProviderEffectListener, "");
            this.f108215b.mo78888a(providerEffect, iDownloadProviderEffectListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78889a(AbstractC86796e<RecommendSearchWordsResponse> eVar) {
            C89219l.m154721d(eVar, "");
            this.f108215b.mo78889a(eVar);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78890a(InfoStickerEffect infoStickerEffect, AbstractC86793b bVar) {
            C89219l.m154721d(infoStickerEffect, "");
            this.f108215b.mo78890a(infoStickerEffect, bVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78891a(String str) {
            C89219l.m154721d(str, "");
            this.f108215b.mo78891a(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78892a(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchEffectChannelListener, "");
            this.f108215b.mo78892a(str, iFetchEffectChannelListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78893a(String str, IFetchFavoriteList iFetchFavoriteList) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchFavoriteList, "");
            this.f108215b.mo78893a(str, iFetchFavoriteList);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78894a(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchCategoryEffectListener, "");
            this.f108215b.mo78894a(str, str2, i, i2, i3, str3, z, iFetchCategoryEffectListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78895a(String str, String str2, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(iSearchEffectListenerV2, "");
            this.f108215b.mo78895a(str, str2, i, i2, map, iSearchEffectListenerV2);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78896a(String str, String str2, int i, ICheckChannelListener iCheckChannelListener, Map<String, String> map) {
            C89219l.m154721d(iCheckChannelListener, "");
            this.f108215b.mo78896a(str, str2, i, iCheckChannelListener, map);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78897a(String str, String str2, IUpdateTagListener iUpdateTagListener) {
            C89219l.m154721d(iUpdateTagListener, "");
            this.f108215b.mo78897a(str, str2, iUpdateTagListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78898a(String str, String str2, String str3, int i, int i2, IFetchProviderEffect iFetchProviderEffect, boolean z) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchProviderEffect, "");
            this.f108215b.mo78898a(str, str2, str3, i, i2, iFetchProviderEffect, z);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78899a(String str, String str2, String str3, Integer num, Integer num2, AbstractC86796e<InfoStickerListResponse> eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(eVar, "");
            this.f108215b.mo78899a(str, str2, str3, num, num2, eVar);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78900a(String str, String str2, String str3, String str4, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(iSearchEffectListenerV2, "");
            this.f108215b.mo78900a(str, str2, str3, str4, i, i2, map, iSearchEffectListenerV2);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78901a(String str, String str2, Map<String, String> map, boolean z, AbstractC86794c cVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(cVar, "");
            this.f108215b.mo78901a(str, str2, map, z, cVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78902a(String str, String str2, boolean z, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchCategoryEffectListener, "");
            this.f108215b.mo78902a(str, str2, z, i, i2, i3, str3, iFetchCategoryEffectListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78903a(String str, String str2, boolean z, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
            C89219l.m154721d(iFetchProviderEffect, "");
            this.f108215b.mo78903a(str, str2, z, i, i2, iFetchProviderEffect);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78904a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
            C89219l.m154721d(iIsTagNeedUpdatedListener, "");
            this.f108215b.mo78904a(str, list, str2, iIsTagNeedUpdatedListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78905a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(iModFavoriteList, "");
            this.f108215b.mo78905a(str, list, z, iModFavoriteList);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78906a(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
            C89219l.m154721d(str, "");
            this.f108215b.mo78906a(str, map, iFetchEffectListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78907a(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchEffectChannelListener, "");
            this.f108215b.mo78907a(str, z, iFetchEffectChannelListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78908a(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
            C89219l.m154721d(str, "");
            this.f108215b.mo78908a(str, z, str2, i, i2, iFetchPanelInfoListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78909a(String str, boolean z, String str2, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchPanelInfoListener, "");
            this.f108215b.mo78909a(str, z, str2, i, i2, z2, iFetchPanelInfoListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78910a(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchEffectChannelListener, "");
            this.f108215b.mo78910a(str, z, z2, iFetchEffectChannelListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78911a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
            C89219l.m154721d(list, "");
            this.f108215b.mo78911a(list, map, iFetchEffectListByIdsListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78912a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener) {
            this.f108215b.mo78912a(list, map, z, iFetchEffectListListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final void mo78913a(Map<String, Object> map) {
            this.f108215b.mo78913a(map);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: b */
        public final void mo78915b(Effect effect, IFetchEffectListener iFetchEffectListener) {
            C89219l.m154721d(effect, "");
            C89219l.m154721d(iFetchEffectListener, "");
            this.f108215b.mo78915b(effect, iFetchEffectListener);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: b */
        public final boolean mo78916b(Effect effect) {
            return this.f108215b.mo78916b(effect);
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: c */
        public final EffectManager mo78917c() {
            return this.f108215b.mo78917c();
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: d */
        public final void mo78919d() {
            this.f108215b.mo78919d();
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f, com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        public final void destroy() {
            this.f108215b.destroy();
        }

        @Override // com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f
        /* renamed from: a */
        public final boolean mo78914a(Effect effect) {
            C30731d.m63114a();
            return this.f108214a.mo78914a(effect);
        }

        C46443d(AbstractC46415f fVar) {
            this.f108214a = fVar;
            this.f108215b = fVar;
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: c */
        public final boolean mo78918c(Effect effect) {
            C89219l.m154721d(effect, "");
            C30731d.m63114a();
            return this.f108214a.mo78918c(effect);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory$c */
    public static final class C46442c implements AbstractC86691a {

        /* renamed from: a */
        public final C86704a f108213a = C86709e.C86710a.m150208a().mo139950b();

        static {
            Covode.recordClassIndex(55024);
        }

        C46442c() {
        }

        @Override // com.p2082ss.ugc.effectplatform.p4440a.AbstractC86691a
        /* renamed from: a */
        public final C86880aj<C86904a> mo78960a(C86693b bVar) {
            C89219l.m154721d(bVar, "");
            C30731d.m63114a();
            return this.f108213a.mo78960a(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public List<Host> getDownloadableModelHosts() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Host("https://api.tiktokv.com"));
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory$b */
    public static final class C46441b implements EffectFetcher {

        /* renamed from: a */
        private final EffectFetcher f108212a;

        static {
            Covode.recordClassIndex(55023);
        }

        C46441b() {
            DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
            C89219l.m154716b(instance, "");
            this.f108212a = instance.getEffectFetcher();
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.bridge.EffectFetcher
        public final SyncTask<EffectTaskResult> fetchEffect(EffectFetcherArguments effectFetcherArguments) {
            C89219l.m154721d(effectFetcherArguments, "");
            C30731d.m63114a();
            SyncTask<EffectTaskResult> fetchEffect = this.f108212a.fetchEffect(effectFetcherArguments);
            C89219l.m154716b(fetchEffect, "");
            return fetchEffect;
        }
    }

    /* renamed from: a */
    public static IEffectPlatformFactory m89604a() {
        MethodCollector.m26663i(7508);
        Object a = C81908b.m141854a(IEffectPlatformFactory.class, false);
        if (a != null) {
            IEffectPlatformFactory iEffectPlatformFactory = (IEffectPlatformFactory) a;
            MethodCollector.m26664o(7508);
            return iEffectPlatformFactory;
        }
        if (C81908b.f183232bi == null) {
            synchronized (IEffectPlatformFactory.class) {
                try {
                    if (C81908b.f183232bi == null) {
                        C81908b.f183232bi = new EffectPlatformFactory();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7508);
                    throw th;
                }
            }
        }
        EffectPlatformFactory effectPlatformFactory = (EffectPlatformFactory) C81908b.f183232bi;
        MethodCollector.m26664o(7508);
        return effectPlatformFactory;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public List<Host> getHosts() {
        ArrayList arrayList = new ArrayList();
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            arrayList.add(new Host("https://api.tiktokv.com/tiktok/v1/kids"));
        } else {
            arrayList.add(new Host("https://api.tiktokv.com"));
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public AbstractC46415f create(EffectPlatformBuilder effectPlatformBuilder) {
        C89219l.m154721d(effectPlatformBuilder, "");
        C63244g.m114602a().mo73294v();
        EffectConfiguration.Builder createEffectConfigurationBuilder = createEffectConfigurationBuilder(effectPlatformBuilder);
        if (effectPlatformBuilder.getEffectFetcher() == null) {
            createEffectConfigurationBuilder.effectFetcher(new C46441b());
            if (C86709e.C86710a.m150209b()) {
                createEffectConfigurationBuilder.knEffectFetcher(new C46442c());
            }
        } else {
            createEffectConfigurationBuilder.effectFetcher(effectPlatformBuilder.getEffectFetcher());
        }
        AbstractC46415f create$default = IEffectPlatformFactory.DefaultImpls.create$default(this, createEffectConfigurationBuilder, C46444e.f108216a, false, 4, null);
        create$default.mo78913a(effectPlatformBuilder.getMonitorExtraParams());
        return new C46443d(create$default);
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory$e */
    static final class C46444e extends AbstractC89220m implements AbstractC89172b<EffectConfiguration, C89391z> {

        /* renamed from: a */
        public static final C46444e f108216a = new C46444e();

        static {
            Covode.recordClassIndex(55026);
        }

        C46444e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EffectConfiguration effectConfiguration) {
            EffectConfiguration effectConfiguration2 = effectConfiguration;
            C89219l.m154721d(effectConfiguration2, "");
            File effectDir = effectConfiguration2.getEffectDir();
            C89219l.m154716b(effectDir, "");
            String absolutePath = effectDir.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            C89219l.m154721d(absolutePath, "");
            boolean z = true;
            if (!C16048b.m29633a().mo25421a(true, "use_effect_lru_cache", true) || !C89361p.m154908a((CharSequence) absolutePath, (CharSequence) "files/effect", false)) {
                z = false;
            }
            if (z) {
                if (effectConfiguration2.getDraftList() == null) {
                    effectConfiguration2.setDraftList(EffectPlatform.m89512e());
                }
                if (EffectCacheManager.Companion.getInstance().getCache(absolutePath) == null) {
                    try {
                        EffectCacheManager.Companion.getInstance().setCache(absolutePath, new EffectDiskLruCache(effectConfiguration2, 0, 2, null));
                    } catch (Exception unused) {
                        EffectCacheManager instance = EffectCacheManager.Companion.getInstance();
                        File effectDir2 = effectConfiguration2.getEffectDir();
                        C89219l.m154716b(effectDir2, "");
                        String absolutePath2 = effectDir2.getAbsolutePath();
                        C89219l.m154716b(absolutePath2, "");
                        instance.setCache(absolutePath, new FileICache(absolutePath2));
                    }
                }
                effectConfiguration2.setCache(EffectCacheManager.Companion.getInstance().getCache(absolutePath));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public EffectConfiguration.Builder createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder) {
        String serverDeviceId;
        C89219l.m154721d(effectPlatformBuilder, "");
        if (effectPlatformBuilder.getContext() != null) {
            if (effectPlatformBuilder.getRegion() == null) {
                String a = C63244g.m114602a().mo73297y().mo93847a();
                if (a == null) {
                    a = "";
                }
                effectPlatformBuilder.setRegion(a);
            }
            if (effectPlatformBuilder.getAccessKey() == null) {
                effectPlatformBuilder.setAccessKey(C63244g.m114602a().mo73278f().mo73332a());
            }
            if (effectPlatformBuilder.getCacheDir() == null) {
                effectPlatformBuilder.setCacheDir(EffectPlatform.f108127a);
            }
            if (C89219l.m154714a(effectPlatformBuilder.getCacheDir(), EffectPlatform.f108127a) && C16048b.m29633a().mo25421a(true, "creative_tools_open_effect_cache", false)) {
                effectPlatformBuilder.setEffectMaxCacheSize(C16048b.m29633a().mo25413a(true, "creative_tool_effect_cache_threshold", 838860800L) * 1048576);
            }
            if (effectPlatformBuilder.getSdkVersion() == null) {
                effectPlatformBuilder.setSdkVersion(C63244g.m114602a().mo73278f().mo73333b());
            }
            if (effectPlatformBuilder.getChannel() == null) {
                String j = C63244g.m114602a().mo73295w().mo93781j();
                C63244g.m114602a();
                C89219l.m154716b(j, "");
                effectPlatformBuilder.setChannel(j);
            }
            if (effectPlatformBuilder.getAppVersion() == null) {
                effectPlatformBuilder.setAppVersion(C63244g.m114602a().mo73295w().mo93780i());
            }
            if (effectPlatformBuilder.getAppID() == null) {
                String a2 = EffectPlatform.m89510a();
                C89219l.m154716b(a2, "");
                effectPlatformBuilder.setAppID(a2);
            }
            if (effectPlatformBuilder.getAppLanguage() == null) {
                effectPlatformBuilder.setAppLanguage(IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage());
            }
            if (effectPlatformBuilder.getSystemLanguage() == null) {
                effectPlatformBuilder.setSystemLanguage(IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getSysLanguage());
            }
            if (effectPlatformBuilder.getRetryCount() == null) {
                effectPlatformBuilder.setRetryCount(1);
            }
            if (effectPlatformBuilder.getHosts() == null) {
                effectPlatformBuilder.setHosts(getHosts());
            }
            if (effectPlatformBuilder.getEffectNetWorker() == null) {
                effectPlatformBuilder.setEffectNetWorker(new C46439w());
            }
            if (effectPlatformBuilder.getExecutorService() == null) {
                effectPlatformBuilder.setExecutorService(C40780g.m82241a());
            }
            if (effectPlatformBuilder.getJsonConverter() == null) {
                effectPlatformBuilder.setJsonConverter(C46417h.m89587a());
            }
            if (effectPlatformBuilder.getRequestStrategy() == null) {
                effectPlatformBuilder.setRequestStrategy(2);
            }
            if (effectPlatformBuilder.getEffectMaxCacheSize() <= 0) {
                effectPlatformBuilder.setEffectMaxCacheSize(838860800);
            }
            EffectConfiguration.Builder monitorService = new EffectConfiguration.Builder().accessKey(effectPlatformBuilder.getAccessKey()).channel(effectPlatformBuilder.getChannel()).sdkVersion(effectPlatformBuilder.getSdkVersion()).appVersion(effectPlatformBuilder.getAppVersion()).platform("android").deviceType(Build.MODEL).JsonConverter(effectPlatformBuilder.getJsonConverter()).monitorService(new C46414e());
            if (AppLog.getServerDeviceId() == null) {
                serverDeviceId = "0";
            } else {
                serverDeviceId = AppLog.getServerDeviceId();
            }
            EffectConfiguration.Builder sysLanguage = monitorService.deviceId(serverDeviceId).appID(effectPlatformBuilder.getAppID()).appLanguage(effectPlatformBuilder.getAppLanguage()).sysLanguage(effectPlatformBuilder.getSystemLanguage());
            Integer retryCount = effectPlatformBuilder.getRetryCount();
            C89219l.m154716b(retryCount, "");
            EffectConfiguration.Builder effectFetcher = sysLanguage.retryCount(retryCount.intValue()).effectDir(effectPlatformBuilder.getCacheDir()).effectNetWorker(effectPlatformBuilder.getEffectNetWorker()).region(effectPlatformBuilder.getRegion()).hosts(effectPlatformBuilder.getHosts()).context(effectPlatformBuilder.getContext()).executor(effectPlatformBuilder.getExecutorService()).effectFetcher(effectPlatformBuilder.getEffectFetcher());
            Integer requestStrategy = effectPlatformBuilder.getRequestStrategy();
            C89219l.m154716b(requestStrategy, "");
            EffectConfiguration.Builder effectMaxCacheSize = effectFetcher.requestStrategy(requestStrategy.intValue()).effectMaxCacheSize(effectPlatformBuilder.getEffectMaxCacheSize());
            C63244g.m114602a();
            C89219l.m154716b(effectMaxCacheSize, "");
            return effectMaxCacheSize;
        }
        throw new IllegalArgumentException("context is null.".toString());
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public AbstractC46415f create(EffectConfiguration.Builder builder, AbstractC89172b<? super EffectConfiguration, C89391z> bVar, boolean z) {
        C89219l.m154721d(builder, "");
        EffectConfiguration build = builder.build();
        if (bVar != null) {
            C89219l.m154716b(build, "");
            bVar.invoke(build);
        }
        return new EffectPlatform(build);
    }
}
