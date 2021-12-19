package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.ResourceListResponse;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.FetchResourceListTaskResult;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.CheckResourceListTask */
public class CheckResourceListTask extends NormalTask {
    private Map<String, String> extraParams;
    private EffectConfiguration mConfiguration;
    private EffectContext mContext;
    private int mCurCnt;

    static {
        Covode.recordClassIndex(95685);
    }

    private EffectRequest buildRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.mConfiguration);
        Map<String, String> map = this.extraParams;
        if (map != null) {
            addCommonParams.putAll(map);
        }
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, this.mContext.getBestHostUrl() + this.mConfiguration.getApiAdress() + "/moji/resource_lastest"));
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                try {
                    ResourceListResponse resourceListResponse = (ResourceListResponse) this.mConfiguration.getEffectNetWorker().execute(buildRequest(), this.mConfiguration.getJsonConverter(), ResourceListResponse.class);
                    if (resourceListResponse != null && resourceListResponse.checkValue()) {
                        sendMessage(24, new FetchResourceListTaskResult(resourceListResponse.getData()));
                        return;
                    }
                } catch (Exception e) {
                    if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                        sendMessage(24, new FetchResourceListTaskResult(new ExceptionResult(e)));
                        e.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        sendMessage(24, new FetchResourceListTaskResult(new ExceptionResult(e)));
        e.printStackTrace();
    }

    public CheckResourceListTask(EffectContext effectContext, Handler handler, String str, Map<String, String> map) {
        super(handler, str);
        this.extraParams = map;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mContext = effectContext;
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
    }
}
