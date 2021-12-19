package com.p2082ss.android.ugc.aweme.p3452ml.data;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2160ml.C30076d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.p3452ml.api.AbstractC60013b;
import com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLCommonService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLDataCenterService;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60030b;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60032c;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60035d;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60038e;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60041f;
import com.p2082ss.android.ugc.aweme.p3452ml.data.C60045g;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeatureFeedTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeaturePlayTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeatureTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeatureUserTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59978d;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60015b;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60016c;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ml.data.MLDataCenterServiceImpl */
public final class MLDataCenterServiceImpl extends MLDataCenterService implements AbstractC60013b {

    /* renamed from: a */
    private boolean f136712a;

    /* renamed from: b */
    private final C60041f f136713b = C60041f.C60043b.f136769a;

    /* renamed from: c */
    private final C60035d f136714c = C60035d.C60037b.f136754a;

    /* renamed from: d */
    private final C60045g f136715d = C60045g.C60047b.f136797a;

    /* renamed from: e */
    private final C60038e f136716e = C60038e.C60040b.f136760a;

    /* renamed from: f */
    private final C60032c f136717f = C60032c.C60034b.f136750a;

    static {
        Covode.recordClassIndex(70487);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final C30076d.AbstractC30077a getFeatureStaticGetter() {
        return this.f136717f;
    }

    /* renamed from: a */
    public static IMLDataCenterService m109517a() {
        MethodCollector.m26663i(13383);
        Object a = C81908b.m141854a(IMLDataCenterService.class, false);
        if (a != null) {
            IMLDataCenterService iMLDataCenterService = (IMLDataCenterService) a;
            MethodCollector.m26664o(13383);
            return iMLDataCenterService;
        }
        if (C81908b.f183302cz == null) {
            synchronized (IMLDataCenterService.class) {
                try {
                    if (C81908b.f183302cz == null) {
                        C81908b.f183302cz = new MLDataCenterServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13383);
                    throw th;
                }
            }
        }
        MLDataCenterService mLDataCenterService = (MLDataCenterService) C81908b.f183302cz;
        MethodCollector.m26664o(13383);
        return mLDataCenterService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final void checkAndInit() {
        if (!this.f136712a) {
            this.f136712a = true;
            if (MLDataCenterService.debug) {
                System.currentTimeMillis();
            }
            C60030b.f136743d.addAll(C60030b.f136740a);
            C60030b.f136743d.addAll(C60038e.f136757e);
            MLCommonService.C59997b.f136653a.addCommonEventListener("play_prepare", this);
            MLCommonService.C59997b.f136653a.addCommonEventListener("play_call_playtime", this);
            if (MLDataCenterService.debug) {
                System.currentTimeMillis();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
        if (inputFeaturesConfig != null) {
            FeaturePlayTypeConfig fTypePlay = inputFeaturesConfig.getFTypePlay();
            if (fTypePlay != null && fTypePlay.getEnable()) {
                this.f136713b.f136739a = true;
                C60030b.f136742c = true;
                C60041f fVar = this.f136713b;
                FeaturePlayTypeConfig fTypePlay2 = inputFeaturesConfig.getFTypePlay();
                if (fTypePlay2 != null && fTypePlay2.getEnable()) {
                    if (!TextUtils.isEmpty(fTypePlay2.getFeedRangeType())) {
                        fVar.f136767f = true;
                    }
                    if (fTypePlay2.containFeedRangeType("current")) {
                        fVar.f136768g = true;
                    }
                }
            }
            FeatureFeedTypeConfig fTypeFeed = inputFeaturesConfig.getFTypeFeed();
            if (fTypeFeed != null && fTypeFeed.getEnable()) {
                this.f136714c.f136739a = true;
            }
            FeatureUserTypeConfig fTypeUser = inputFeaturesConfig.getFTypeUser();
            if (fTypeUser != null && fTypeUser.getEnable()) {
                this.f136715d.f136739a = true;
                C60030b.f136742c = true;
            }
            FeatureTypeConfig fTypeGAction = inputFeaturesConfig.getFTypeGAction();
            if (fTypeGAction != null && fTypeGAction.getEnable()) {
                this.f136716e.f136739a = true;
                C60030b.f136742c = true;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final void traceMobClickEvent(String str, JSONObject jSONObject) {
        if (C60030b.f136742c && str != null && str.length() != 0 && jSONObject != null && C60030b.f136743d.contains(str)) {
            C59978d.m109498a(new C60030b.RunnableC60031a(str, jSONObject));
            if (C60030b.f136741b) {
                jSONObject.opt("group_id");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00de, code lost:
        if (r3 != null) goto L_0x00bd;
     */
    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.AbstractC60013b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97476a(java.lang.String r10, com.p2082ss.android.ugc.aweme.p3452ml.api.C60012a r11) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3452ml.data.MLDataCenterServiceImpl.mo97476a(java.lang.String, com.ss.android.ugc.aweme.ml.api.a):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    public final C60016c getFeedTrackRangeInfo(String str, int i, boolean z) {
        List<C60015b> a = this.f136713b.mo97490a(str, i, z);
        if (a == null) {
            return null;
        }
        C60016c cVar = new C60016c();
        for (C60015b bVar : a) {
            if (bVar != null) {
                cVar.f136697a += bVar.f136675a.get();
                cVar.f136698b += bVar.f136676b.get();
                cVar.f136699c += bVar.f136677c.get();
                cVar.f136700d += bVar.f136678d.get();
                cVar.f136701e.add(0, Long.valueOf(bVar.f136682h.get()));
            }
        }
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0322  */
    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLDataCenterService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean fillInputFeatures(java.util.Map<java.lang.String, java.lang.Object> r28, com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig r29, com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h r30) {
        /*
        // Method dump skipped, instructions count: 1529
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3452ml.data.MLDataCenterServiceImpl.fillInputFeatures(java.util.Map, com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig, com.ss.android.ugc.aweme.ml.infra.h):boolean");
    }
}
