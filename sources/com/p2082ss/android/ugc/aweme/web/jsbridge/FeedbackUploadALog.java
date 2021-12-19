package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16073e;
import com.bytedance.ies.abmock.C16075f;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2917f.p2918a.C47174a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.p2082ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80401eq;
import com.p2082ss.ttuploader.TTVideoInfo;
import com.p2082ss.ttuploader.TTVideoUploader;
import com.p2082ss.ttuploader.TTVideoUploaderListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p077b.C1743j;
import p078c.p080b.C1752a;
import p078c.p080b.C1755c;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog */
public class FeedbackUploadALog extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    private final String f182373a = "y+6T0b/qfIqkZDbYHfFiN/8XI5fyqrwX5d2WZ2NN3w==";

    /* renamed from: b */
    private final String f182374b = "y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s=";

    static {
        Covode.recordClassIndex(94945);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public FeedbackUploadALog() {
    }

    /* renamed from: d */
    private static boolean m141428d() {
        return SettingsManager.m29616a().mo25400a("abclone2_feedback", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ String mo79916c() {
        C1731i<TResult> iVar;
        MethodCollector.m26663i(7318);
        if (m141428d()) {
            Map<String, ConfigItem> map = C16075f.f38715a;
            JSONArray jSONArray = new JSONArray();
            for (String str : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                C16073e.m29864a();
                Object b = C16073e.m29869b(str, true);
                ConfigItem configItem = map.get(str);
                if (configItem != null) {
                    jSONObject.put("abKey", str);
                    jSONObject.put("filedTypedName", configItem.type.toString());
                    if (b == null || b.equals("null")) {
                        jSONObject.put("value", "null");
                    } else {
                        jSONObject.put("value", b.toString());
                    }
                    jSONArray.put(jSONObject);
                }
            }
            String jSONArray2 = jSONArray.toString();
            try {
                C1752a aVar = new C1752a("y+6T0b/qfIqkZDbYHfFiN/8XI5fyqrwX5d2WZ2NN3w==");
                if (!aVar.exists()) {
                    aVar.mkdir();
                }
                C1755c cVar = new C1755c("y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s=");
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(cVar));
                bufferedWriter.write(jSONArray2);
                bufferedWriter.close();
                cVar.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            IExternalUploaderService externalUploaderService = AVExternalServiceImpl.m113114a().externalUploaderService();
            final C1743j jVar = new C1743j();
            String sdkV4AuthKey = externalUploaderService.getSdkV4AuthKey();
            if (TextUtils.isEmpty(sdkV4AuthKey)) {
                externalUploaderService.cacheUploadAuthKeyConfig();
                jVar.mo5557b("Failed Upload Config: NO sdkV4AuthKey");
                iVar = jVar.f5610a;
            } else {
                ExternalUploadVideoConfig uploadVideoConfig = externalUploaderService.getUploadVideoConfig(sdkV4AuthKey);
                final TTVideoUploader tTVideoUploader = new TTVideoUploader(3);
                tTVideoUploader.setListener(new TTVideoUploaderListener() {
                    /* class com.p2082ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog.C815601 */

                    static {
                        Covode.recordClassIndex(94946);
                    }

                    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
                    public final String getStringFromExtern(int i) {
                        return null;
                    }

                    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
                    public final void onLog(int i, int i2, String str) {
                    }

                    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
                    public final void onUploadVideoStage(int i, long j) {
                    }

                    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
                    public final int videoUploadCheckNetState(int i, int i2) {
                        return 0;
                    }

                    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
                    public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
                        if (i == 0) {
                            jVar.mo5557b(tTVideoInfo.mTosKey);
                            tTVideoUploader.close();
                        } else if (i == 2) {
                            jVar.mo5557b("failed");
                            tTVideoUploader.close();
                        }
                    }
                });
                tTVideoUploader.setMaxFailTime(uploadVideoConfig.getMaxFailTime());
                tTVideoUploader.setSliceSize(uploadVideoConfig.getSliceSize());
                tTVideoUploader.setFileUploadDomain(uploadVideoConfig.getFileHostName());
                tTVideoUploader.setVideoUploadDomain(uploadVideoConfig.getVideoHostName());
                tTVideoUploader.setSliceTimeout(uploadVideoConfig.getSliceTimeout());
                tTVideoUploader.setPathName(new C1752a("y++T0b/oeIukZDfZHPFiNf8XI5fyqrwX5d2WZ2NN32Fsy5H77EPLLv3Kd2s=").getAbsolutePath());
                tTVideoUploader.setFileRetryCount(1);
                tTVideoUploader.setUserKey(uploadVideoConfig.getAppKey());
                tTVideoUploader.setAuthorization(uploadVideoConfig.getAuthorization());
                tTVideoUploader.setSocketNum(1);
                tTVideoUploader.start();
                iVar = jVar.f5610a;
            }
            iVar.mo5536a(10, TimeUnit.SECONDS);
            TResult d = iVar.mo5545d();
            MethodCollector.m26664o(7318);
            return d;
        }
        MethodCollector.m26664o(7318);
        return "null";
    }

    public FeedbackUploadALog(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static void m141427a(JSONObject jSONObject) {
        if (RuntimeBehaviorServiceImpl.m94812c().mo85867a()) {
            for (Map.Entry<String, String> entry : RuntimeBehaviorServiceImpl.m94812c().mo85868b().entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    static JSONObject m141426a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_from_h5", "true");
            String[] disableUploadRegion = C52912c.f121688a.f121689b.getFeedbackConf().getDisableUploadRegion();
            if (!(disableUploadRegion == null || disableUploadRegion.length == 0)) {
                jSONObject.put("disable_upload_region", C80342dg.m139300a().mo46674b(disableUploadRegion));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        m141427a(jSONObject);
        String a = C80401eq.m139376a();
        if (m141428d() && !TextUtils.isEmpty(str) && !"null".equals(str)) {
            try {
                jSONObject.put("abnor_abclone", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(a)) {
            try {
                jSONObject.put("logout_info", a);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        C1731i.m5640b(new CallableC81617o(this), C1731i.f5562a).mo5534a(new C81618p(this), C1731i.f5562a, null).mo5534a(new C81619q(aVar), C1731i.f5564c, null);
        C47174a.m90348a();
    }
}
