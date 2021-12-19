package com.p2082ss.android.ugc.aweme.services.effect;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.p3875u.C73298a;
import com.p2082ss.android.ugc.aweme.sticker.C75414m;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.services.effect.EffectService */
public class EffectService implements IEffectService {
    private static EffectService sInstance;
    private File MV_RES_CACHE_FILE = new File(C63238c.f143566D.mo73308d().mo101651a().mo101658b());

    static {
        Covode.recordClassIndex(79774);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public String getLiveStickerPannel() {
        return "livestreaming";
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public String getCacheDir() {
        return EffectPlatform.f108127a.getAbsolutePath();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public ArrayList<String> getDraftEffectList() {
        return EffectPlatform.m89512e();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public String getModelCacheDir() {
        return EffectPlatform.f108128b.getAbsolutePath();
    }

    private EffectService() {
    }

    public static EffectService getInstance() {
        MethodCollector.m26663i(11201);
        if (sInstance == null) {
            synchronized (EffectService.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new EffectService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11201);
                    throw th;
                }
            }
        }
        EffectService effectService = sInstance;
        MethodCollector.m26664o(11201);
        return effectService;
    }

    private AbstractC75374c getStickerFetch(AbstractC46415f fVar) {
        return C75414m.m132242a(fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public AbstractC46415f createMvEffectPlatform(Context context) {
        return createMvEffectPlatform(context, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public AbstractC46415f createFontEffectPlatform(Context context) {
        return C46404c.m89554a(context, new EffectService$$Lambda$2(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C89391z lambda$createFontEffectPlatform$2$EffectService(EffectPlatformBuilder effectPlatformBuilder) {
        effectPlatformBuilder.setCacheDir(new File(C63247i.f143610a.getFilesDir(), "font"));
        setFontEffectPlatformCacheSize(effectPlatformBuilder);
        return C89391z.f203057a;
    }

    private void setFontEffectPlatformCacheSize(EffectPlatformBuilder effectPlatformBuilder) {
        if (C16048b.m29633a().mo25421a(true, "creative_tools_open_font_cache", false)) {
            effectPlatformBuilder.setEffectMaxCacheSize(C16048b.m29633a().mo25413a(true, "creative_tool_font_cache_threshold", 838860800L) * 1048576);
        }
    }

    private void setMvEffectPlatformCacheSize(EffectPlatformBuilder effectPlatformBuilder) {
        if (C16048b.m29633a().mo25421a(true, "creative_tools_open_mv_cache", false)) {
            effectPlatformBuilder.setEffectMaxCacheSize(C16048b.m29633a().mo25413a(true, "creative_tool_mv_cache_threshold", 838860800L) * 1048576);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public AbstractC46415f createEffectPlatform(Context context, String str) {
        return C46404c.m89554a(context, new EffectService$$Lambda$0(str));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public AbstractC46415f createMvEffectPlatform(Context context, String str) {
        return C46404c.m89554a(context, new EffectService$$Lambda$1(this, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C89391z lambda$createMvEffectPlatform$1$EffectService(String str, EffectPlatformBuilder effectPlatformBuilder) {
        if (str != null) {
            effectPlatformBuilder.setRegion(str);
        }
        effectPlatformBuilder.setCacheDir(this.MV_RES_CACHE_FILE);
        setMvEffectPlatformCacheSize(effectPlatformBuilder);
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public void fetchEffectWithMusicBind(AbstractC46415f fVar, String str, String str2, IFetchEffectListener iFetchEffectListener) {
        getStickerFetch(fVar).mo118936a(str, str2, iFetchEffectListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public void fetchEffectWithMusicBind(AbstractC46415f fVar, String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        getStickerFetch(fVar).mo118937a(str, map, iFetchEffectListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public void getVideoCoverByCallback(List<EffectPointModel> list, FilterBean filterBean, float f, int i, boolean z, C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        C73298a.m129356a(list, C50648c.m94911b(filterBean), f, i, z, C43225d.m86338h(cVar), onVideoCoverCallback);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService
    public void getVideoCoverByCallback(final List<EffectPointModel> list, final String str, final float f, final int i, final boolean z, final EditPreviewInfo editPreviewInfo, final IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        C63238c.f143570H.mo101685a(new AbstractC63212bb.AbstractC63213a() {
            /* class com.p2082ss.android.ugc.aweme.services.effect.EffectService.C678781 */

            static {
                Covode.recordClassIndex(79778);
            }

            public void onCancel() {
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
            public void onSuccess() {
                C73298a.m129356a(list, str, f, i, z, editPreviewInfo, onVideoCoverCallback);
            }
        });
    }
}
