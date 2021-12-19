package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import com.p2082ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.p2082ss.android.ugc.effectmanager.common.utils.NetworkUtils;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.QueryVideoUsedStickerTaskResult;
import com.p2082ss.android.ugc.effectmanager.knadapt.AdapterExtKt;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.QueryVideoUsedStickerTask */
public class QueryVideoUsedStickerTask extends NormalTask {
    private EffectConfiguration configuration;
    private EffectContext effectContext;
    private Map<String, String> extraParams;
    private int mCurCnt;

    static {
        Covode.recordClassIndex(95712);
    }

    private EffectRequest createRequest() {
        HashMap<String, String> addCommonParams = EffectRequestUtil.INSTANCE.addCommonParams(this.configuration);
        Map<String, String> map = this.extraParams;
        if (map != null && !map.isEmpty()) {
            addCommonParams.putAll(this.extraParams);
        }
        return new EffectRequest("GET", NetworkUtils.buildRequestUrl(addCommonParams, this.effectContext.getBestHostUrl() + this.configuration.getApiAdress() + "/user/usedSticker"));
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectRequest createRequest = createRequest();
        while (true) {
            int i = this.mCurCnt;
            this.mCurCnt = i - 1;
            if (i != 0) {
                try {
                    if (isCanceled()) {
                        sendMessage(61, new QueryVideoUsedStickerTaskResult(null, new ExceptionResult(10001)));
                        return;
                    }
                    EffectListResponse effectListResponse = (EffectListResponse) AdapterExtKt.parse(this.configuration.getEffectNetWorker(), createRequest, this.configuration.getEffectNetWorker().execute(createRequest), this.configuration.getJsonConverter(), EffectListResponse.class);
                    if (effectListResponse != null && effectListResponse.checkValue()) {
                        String absolutePath = this.configuration.getEffectDir().getAbsolutePath();
                        EffectUtils.setEffectPath(absolutePath, effectListResponse.getData());
                        EffectUtils.setEffectPath(absolutePath, effectListResponse.getCollection());
                        sendMessage(61, new QueryVideoUsedStickerTaskResult(effectListResponse, null));
                        return;
                    } else if (this.mCurCnt == 0) {
                        sendMessage(61, new QueryVideoUsedStickerTaskResult(null, new ExceptionResult(10003)));
                    }
                } catch (Exception e) {
                    if (this.mCurCnt == 0 || (e instanceof StatusCodeException)) {
                        sendMessage(61, new QueryVideoUsedStickerTaskResult(null, new ExceptionResult(e)));
                        e.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        sendMessage(61, new QueryVideoUsedStickerTaskResult(null, new ExceptionResult(e)));
        e.printStackTrace();
    }

    public QueryVideoUsedStickerTask(EffectContext effectContext2, Map<String, String> map, Handler handler, String str) {
        super(handler, str);
        this.effectContext = effectContext2;
        EffectConfiguration effectConfiguration = effectContext2.getEffectConfiguration();
        this.configuration = effectConfiguration;
        this.mCurCnt = effectConfiguration.getRetryCount();
        this.extraParams = map;
    }
}
