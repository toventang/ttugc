package com.p2082ss.android.ugc.aweme.web;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40597b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.d */
public class C81542d extends AbstractC14933a {
    static {
        Covode.recordClassIndex(94920);
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24042a() {
        super.mo24042a();
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            f.mo59376a().mo59404a();
        }
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24045a(UpdatePackage updatePackage) {
        super.mo24045a(updatePackage);
        updatePackage.getChannel();
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            f.mo59376a().mo59411a(updatePackage.getChannel(), updatePackage.isPatchUpdate());
        }
        C40597b a = C40597b.C40599b.m81953a();
        String channel = updatePackage.getChannel();
        boolean isPatchUpdate = updatePackage.isPatchUpdate();
        C89219l.m154721d(channel, "");
        if (a.mo69758b(channel)) {
            a.mo69755a(channel).f95012a = System.currentTimeMillis();
            C40603d a2 = C40603d.C40604a.m81964a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_channel", channel);
            jSONObject.put("is_patch", String.valueOf(isPatchUpdate));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cold_start_to_download_start_interval", System.currentTimeMillis() - a.mo69754a());
            a2.m81959a((C40603d) "hybrid_monitor_gecko_event", "on_start_download", (String) jSONObject, jSONObject2);
        }
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: b */
    public final void mo24054b(UpdatePackage updatePackage) {
        super.mo24054b(updatePackage);
        updatePackage.getChannel();
        updatePackage.getVersion();
        C12290b.m22060a("aweme_service_gecko_activate_rate", 0, m141408a(updatePackage.getVersion(), (Throwable) null));
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            AbstractC33368e a = f.mo59376a();
            updatePackage.getVersion();
            a.mo59408a(updatePackage.getChannel());
        }
        TextUtils.equals(updatePackage.getChannel(), "rn_base_android");
        C40597b a2 = C40597b.C40599b.m81953a();
        updatePackage.getVersion();
        String channel = updatePackage.getChannel();
        C89219l.m154721d(channel, "");
        a2.mo69757b(channel, true, null);
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: c */
    public final void mo24056c(UpdatePackage updatePackage) {
        super.mo24056c(updatePackage);
        updatePackage.getChannel();
        updatePackage.getVersion();
        C12290b.m22060a("aweme_service_gecko_download_rate", 0, m141408a(updatePackage.getVersion(), (Throwable) null));
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            f.mo59376a().mo59405a(updatePackage.getVersion(), updatePackage.getChannel(), updatePackage.getFullPackage().getLength());
        }
        C40597b a = C40597b.C40599b.m81953a();
        updatePackage.getVersion();
        String channel = updatePackage.getChannel();
        C89219l.m154721d(channel, "");
        a.mo69756a(channel, true, null);
    }

    /* renamed from: a */
    private static JSONObject m141408a(long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        if (j != -1) {
            try {
                jSONObject.put("gecko_id", String.valueOf(j));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (th != null) {
            jSONObject.put("errorDesc", th.toString());
        }
        return jSONObject;
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24048a(UpdatePackage updatePackage, Throwable th) {
        super.mo24048a(updatePackage, th);
        updatePackage.getChannel();
        Log.getStackTraceString(th);
        C12290b.m22060a("aweme_service_gecko_activate_rate", 1, m141408a(updatePackage.getVersion(), th));
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            AbstractC33368e a = f.mo59376a();
            updatePackage.getVersion();
            a.mo59410a(updatePackage.getChannel(), th);
        }
        C40597b a2 = C40597b.C40599b.m81953a();
        updatePackage.getVersion();
        String channel = updatePackage.getChannel();
        C89219l.m154721d(channel, "");
        C89219l.m154721d(th, "");
        a2.mo69757b(channel, false, th);
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: b */
    public final void mo24055b(UpdatePackage updatePackage, Throwable th) {
        super.mo24055b(updatePackage, th);
        updatePackage.getChannel();
        Log.getStackTraceString(th);
        C12290b.m22060a("aweme_service_gecko_download_rate", 1, m141408a(updatePackage.getVersion(), th));
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            f.mo59376a().mo59406a(updatePackage.getVersion(), updatePackage.getChannel(), updatePackage.getFullPackage().getLength(), th);
        }
        C40597b a = C40597b.C40599b.m81953a();
        updatePackage.getVersion();
        String channel = updatePackage.getChannel();
        C89219l.m154721d(channel, "");
        C89219l.m154721d(th, "");
        a.mo69756a(channel, false, th);
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24052a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
        super.mo24052a(map, th);
        new StringBuilder("onCheckServerVersionFail: requestMap:").append(map).append(",Exception:").append(Log.getStackTraceString(th));
        C12290b.m22060a("aweme_service_gecko_check_update_rate", 1, m141408a(-1, th));
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
                IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                if (f != null) {
                    f.mo59376a().mo59413a((List<? extends Pair<String, Long>>) entry.getValue(), false);
                }
            }
        }
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public void mo24053a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        super.mo24053a(map, map2);
        new StringBuilder("onCheckServerVersionSuccess: requestMap:").append(map).append(",responseMap:").append(map2);
        C12290b.m22060a("aweme_service_gecko_check_update_rate", 0, m141408a(-1, (Throwable) null));
        if (!(map2 == null || map2.isEmpty())) {
            for (Map.Entry<String, List<UpdatePackage>> entry : map2.entrySet()) {
                List<UpdatePackage> value = entry.getValue();
                if (!C34717d.m70908a(value)) {
                    ArrayList arrayList = new ArrayList();
                    for (UpdatePackage updatePackage : value) {
                        arrayList.add(new Pair(updatePackage.getChannel(), Long.valueOf(updatePackage.getVersion())));
                    }
                    IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                    if (f != null) {
                        f.mo59376a().mo59413a((List<? extends Pair<String, Long>>) arrayList, true);
                    }
                }
            }
        }
    }
}
