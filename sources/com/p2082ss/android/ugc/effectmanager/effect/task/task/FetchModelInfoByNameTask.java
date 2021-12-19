package com.p2082ss.android.ugc.effectmanager.effect.task.task;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.WeakHandler;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.effectmanager.link.model.host.Host;
import com.p2082ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult;
import com.p2082ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask */
public final class FetchModelInfoByNameTask extends NormalTask implements WeakHandler.IHandler {
    private final String bigVersion;
    private final int businessId;
    private final DownloadableModelConfig config;
    private final String modelName;
    private final String taskFlag;
    private final WeakHandler weakHandler;

    static {
        Covode.recordClassIndex(95684);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public final void execute() {
        runDirectly();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        p4600h.p4610e.C89146c.m154636a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse runDirectly() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask.runDirectly():com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse");
    }

    private final EffectRequest buildEffectRequest() {
        Map b = C89041ag.m154427b(C89387v.m154943a("sdk_version", this.config.getSdkVersion()), C89387v.m154943a("device_type", this.config.getDeviceType()), C89387v.m154943a("device_platform", "android"), C89387v.m154943a("status", String.valueOf(this.config.getModelFileEnv().ordinal())), C89387v.m154943a(StringSet.name, this.modelName));
        int i = this.businessId;
        if (i > 0) {
            b.put("busi_id", String.valueOf(i));
        }
        EffectConfiguration effectConfiguration = this.config.getEffectConfiguration();
        if (effectConfiguration != null) {
            b.putAll(EffectRequestUtil.INSTANCE.addCommonParams(effectConfiguration));
        }
        String str = this.bigVersion;
        if (str != null && (true ^ C89361p.m154870a((CharSequence) str))) {
            b.put("big_version", str);
        }
        Host host = this.config.getHosts().get(0);
        C89219l.m154709a((Object) host, "");
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(b, host.getItemName() + "/model/api/model"));
    }

    private final void onFail(ExceptionResult exceptionResult) {
        sendMessage(70, new FetchSingleAlgorithmModelTaskResult(null, exceptionResult));
    }

    private final void onSuccess(SingleAlgorithmModelResponse singleAlgorithmModelResponse) {
        sendMessage(70, new FetchSingleAlgorithmModelTaskResult(singleAlgorithmModelResponse, null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchModelInfoByNameTask(DownloadableModelConfig downloadableModelConfig, String str, int i, String str2, String str3, WeakHandler weakHandler2) {
        super(weakHandler2, str3);
        C89219l.m154719c(downloadableModelConfig, "");
        C89219l.m154719c(str, "");
        this.config = downloadableModelConfig;
        this.modelName = str;
        this.businessId = i;
        this.bigVersion = str2;
        this.taskFlag = str3;
        this.weakHandler = weakHandler2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchModelInfoByNameTask(DownloadableModelConfig downloadableModelConfig, String str, int i, String str2, String str3, WeakHandler weakHandler2, int i2, C89214g gVar) {
        this(downloadableModelConfig, str, i, (i2 & 8) != 0 ? null : str2, str3, weakHandler2);
    }
}
