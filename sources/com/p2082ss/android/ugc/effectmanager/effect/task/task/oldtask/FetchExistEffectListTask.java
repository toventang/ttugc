package com.p2082ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.NormalTask;
import com.p2082ss.android.ugc.effectmanager.common.utils.CloseUtil;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator;
import com.p2082ss.android.ugc.effectmanager.context.EffectContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectChannelTaskResult;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchExistEffectListTask */
public class FetchExistEffectListTask extends NormalTask {
    private List<Effect> allDownloadedCategoryEffects;
    private ICache mCache;
    private EffectContext mEffectContext;
    private IJsonConverter mJsonConverter = this.mEffectContext.getEffectConfiguration().getJsonConverter();
    private String panel;

    static {
        Covode.recordClassIndex(95705);
    }

    private EffectChannelModel getCachedChannelModel() {
        InputStream queryToStream = this.mCache.queryToStream(EffectCacheKeyGenerator.generatePanelKey(this.mEffectContext.getEffectConfiguration().getChannel(), this.panel));
        EffectChannelModel effectChannelModel = new EffectChannelModel();
        if (queryToStream != null) {
            try {
                effectChannelModel = (EffectChannelModel) this.mJsonConverter.convertJsonToObj(queryToStream, EffectChannelModel.class);
            } catch (Exception e) {
                EPLog.m141899e("FetchExistEffectListTask", Log.getStackTraceString(e));
            }
        }
        CloseUtil.close(queryToStream);
        return effectChannelModel;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse();
        effectChannelResponse.setPanel(this.panel);
        if (TextUtils.isEmpty(this.panel)) {
            sendMessage(14, new EffectChannelTaskResult(effectChannelResponse, new ExceptionResult(10007)));
            return;
        }
        EffectChannelResponse effectChannelResponse2 = new EffectChannelResponse();
        EffectChannelModel cachedChannelModel = getCachedChannelModel();
        if (cachedChannelModel == null) {
            sendMessage(14, new EffectChannelTaskResult(effectChannelResponse, new ExceptionResult(10004)));
        } else if (!cachedChannelModel.checkValued()) {
            sendMessage(14, new EffectChannelTaskResult(effectChannelResponse, null));
        } else {
            List<Effect> downloadedEffectList = getDownloadedEffectList(cachedChannelModel.getEffects());
            this.allDownloadedCategoryEffects = downloadedEffectList;
            if (downloadedEffectList.isEmpty()) {
                sendMessage(14, new EffectChannelTaskResult(effectChannelResponse, null));
                return;
            }
            effectChannelResponse2.setAllCategoryEffects(this.allDownloadedCategoryEffects);
            effectChannelResponse2.setCategoryResponseList(getCategoryEffectResponse(cachedChannelModel));
            effectChannelResponse2.setPanel(this.panel);
            effectChannelResponse2.setPanelModel(cachedChannelModel.getPanel());
            sendMessage(14, new EffectChannelTaskResult(effectChannelResponse2, null));
        }
    }

    private List<Effect> getCategoryAllEffects(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            for (Effect effect : this.allDownloadedCategoryEffects) {
                if (TextUtils.equals(str, effect.getEffectId())) {
                    arrayList.add(effect);
                }
            }
        }
        return arrayList;
    }

    private List<Effect> getDownloadedEffectList(List<Effect> list) {
        ArrayList arrayList = new ArrayList();
        for (Effect effect : list) {
            if (this.mCache.has(effect.getId())) {
                arrayList.add(effect);
            }
        }
        return arrayList;
    }

    private List<EffectCategoryResponse> getCategoryEffectResponse(EffectChannelModel effectChannelModel) {
        List<EffectCategoryModel> category = effectChannelModel.getCategory();
        ArrayList arrayList = new ArrayList();
        for (EffectCategoryModel effectCategoryModel : category) {
            if (effectCategoryModel.checkValued()) {
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
                effectCategoryResponse.setId(effectCategoryModel.getId());
                effectCategoryResponse.setName(effectCategoryModel.getName());
                effectCategoryResponse.setKey(effectCategoryModel.getKey());
                effectCategoryResponse.setTotalEffects(getCategoryAllEffects(effectCategoryModel.getEffects()));
                effectCategoryResponse.setTags(effectCategoryModel.getTags());
                effectCategoryResponse.setTags_update_time(effectCategoryModel.getTagsUpdateTime());
                effectCategoryResponse.setCollectionEffect(effectChannelModel.getCollection());
                effectCategoryResponse.setDefault(effectCategoryModel.isDefault());
                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                arrayList.add(effectCategoryResponse);
            }
        }
        return arrayList;
    }

    public FetchExistEffectListTask(String str, String str2, EffectContext effectContext, Handler handler) {
        super(handler, str2);
        this.panel = str;
        this.mEffectContext = effectContext;
        this.mCache = effectContext.getEffectConfiguration().getCache();
    }
}
