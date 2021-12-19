package com.bytedance.geckox;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import java.util.HashMap;
import java.util.Map;

public class OptionCheckUpdateParams {
    private Map<String, Map<String, Object>> customParam = new HashMap();
    private boolean enableDownloadAutoRetry = true;
    private boolean enableRetry = true;
    private boolean enableThrottle = true;
    private boolean innerRequestByUser = false;
    private boolean lazyUpdate;
    private AbstractC14933a listener;
    private LoopInterval.EnumC15000a loopLevel;
    private int updatePriority = 1;

    public interface ChannelUpdatePriority {
        static {
            Covode.recordClassIndex(16980);
        }
    }

    public interface CustomValue {
        static {
            Covode.recordClassIndex(16981);
        }

        Object getValue();
    }

    static {
        Covode.recordClassIndex(16979);
    }

    public int getChannelUpdatePriority() {
        return this.updatePriority;
    }

    public Map<String, Map<String, Object>> getCustomParam() {
        return this.customParam;
    }

    public boolean getInnerRequestByUser() {
        return this.innerRequestByUser;
    }

    public AbstractC14933a getListener() {
        return this.listener;
    }

    public LoopInterval.EnumC15000a getLoopLevel() {
        return this.loopLevel;
    }

    public boolean isEnableDownloadAutoRetry() {
        return this.enableDownloadAutoRetry;
    }

    public boolean isEnableRetry() {
        return this.enableRetry;
    }

    public boolean isEnableThrottle() {
        return this.enableThrottle;
    }

    public boolean isLazyUpdate() {
        return this.lazyUpdate;
    }

    public OptionCheckUpdateParams setChannelUpdatePriority(int i) {
        this.updatePriority = i;
        return this;
    }

    public OptionCheckUpdateParams setCustomParam(Map<String, Map<String, Object>> map) {
        this.customParam = map;
        return this;
    }

    public OptionCheckUpdateParams setEnableDownloadAutoRetry(boolean z) {
        this.enableDownloadAutoRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableRetry(boolean z) {
        this.enableRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableThrottle(boolean z) {
        this.enableThrottle = z;
        return this;
    }

    public OptionCheckUpdateParams setInnerRequestByUser(boolean z) {
        this.innerRequestByUser = z;
        return this;
    }

    public OptionCheckUpdateParams setLazyUpdate(boolean z) {
        this.lazyUpdate = z;
        return this;
    }

    public OptionCheckUpdateParams setListener(AbstractC14933a aVar) {
        this.listener = aVar;
        return this;
    }

    public OptionCheckUpdateParams setLoopLevel(LoopInterval.EnumC15000a aVar) {
        this.loopLevel = aVar;
        return this;
    }
}
