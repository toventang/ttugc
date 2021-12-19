package com.bytedance.geckox.settings.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import java.util.Map;

public class GlobalConfigSettings {
    @AbstractC27891c(mo46611a = "settings_config")
    private GlobalConfig globalConfig;
    @AbstractC27891c(mo46611a = "req_meta")
    private ReqMeta reqMeta;
    @AbstractC27891c(mo46611a = "resource_meta")
    private ResourceMeta resourceMeta;
    @AbstractC27891c(mo46611a = "version")
    private int version;

    static {
        Covode.recordClassIndex(17162);
    }

    public static class AccessKeyMetaInfo {
        @AbstractC27891c(mo46611a = "channels")
        private Map<String, ChannelMetaInfo> channels;
        @AbstractC27891c(mo46611a = "config")
        private CurrentLevelConfig config;

        static {
            Covode.recordClassIndex(17163);
        }

        public Map<String, ChannelMetaInfo> getChannels() {
            return this.channels;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class CDNFallBackConfig {
        @AbstractC27891c(mo46611a = "domains")
        private List<String> domains;
        @AbstractC27891c(mo46611a = "max_attempts")
        private int maxAttempts;
        @AbstractC27891c(mo46611a = "shuffle")
        private int shuffle;

        static {
            Covode.recordClassIndex(17164);
        }

        public List<String> getDomains() {
            return this.domains;
        }

        public int getMaxAttempts() {
            return this.maxAttempts;
        }

        public int getShuffle() {
            return this.shuffle;
        }
    }

    public static class ChannelMetaInfo {
        @AbstractC27891c(mo46611a = "config")
        private CurrentLevelConfig config;

        static {
            Covode.recordClassIndex(17165);
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class CurrentLevelConfig {
        @AbstractC27891c(mo46611a = "cdn_fallback")
        private CDNFallBackConfig cdnFallback;
        @AbstractC27891c(mo46611a = "pipeline")
        private List<PipelineStep> pipeline;
        @AbstractC27891c(mo46611a = "prefix_2_ak")
        private Map<String, String> prefix2AccessKey;

        static {
            Covode.recordClassIndex(17166);
        }

        public CDNFallBackConfig getCdnFallback() {
            return this.cdnFallback;
        }

        public List<PipelineStep> getPipeline() {
            return this.pipeline;
        }

        public Map<String, String> getPrefix2AccessKey() {
            return this.prefix2AccessKey;
        }
    }

    public static class GeckoPollingConfig {
        @AbstractC27891c(mo46611a = "combine")
        private List<SyncItem> combine;
        @AbstractC27891c(mo46611a = "interval")
        private int interval;

        static {
            Covode.recordClassIndex(17167);
        }

        public List<SyncItem> getCombine() {
            return this.combine;
        }

        public int getInterval() {
            return this.interval;
        }
    }

    public static class GlobalConfig {
        @AbstractC27891c(mo46611a = "check_update")
        private SettingsPollingConfig checkUpdate;
        @AbstractC27891c(mo46611a = "host_app_id")
        private List<String> hostAppId;
        @AbstractC27891c(mo46611a = "poll_enable")
        private int pollEnable;

        static {
            Covode.recordClassIndex(17168);
        }

        public SettingsPollingConfig getCheckUpdate() {
            return this.checkUpdate;
        }

        public List<String> getHostAppId() {
            return this.hostAppId;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }
    }

    public static class LazyItem {
        @AbstractC27891c(mo46611a = "channels")
        private List<String> channels;
        @AbstractC27891c(mo46611a = "groups")
        private List<String> groups;

        static {
            Covode.recordClassIndex(17169);
        }

        public List<String> getChannels() {
            return this.channels;
        }

        public List<String> getGroups() {
            return this.groups;
        }
    }

    public static class PipelineStep {
        @AbstractC27891c(mo46611a = "no_cache")
        private int noCache;
        @AbstractC27891c(mo46611a = StringSet.type)
        private int type;
        @AbstractC27891c(mo46611a = "update")
        private int update;

        static {
            Covode.recordClassIndex(17170);
        }

        public int getNoCache() {
            return this.noCache;
        }

        public int getType() {
            return this.type;
        }

        public int getUpdate() {
            return this.update;
        }
    }

    public enum PipelineType {
        GECKO(1),
        CDN(2),
        BUILTIN(3);
        
        private int val;

        public final int getVal() {
            return this.val;
        }

        static {
            Covode.recordClassIndex(17171);
        }

        private PipelineType(int i) {
            this.val = i;
        }
    }

    public static class ReqMeta {
        @AbstractC27891c(mo46611a = "aks")
        private List<String> aks;
        @AbstractC27891c(mo46611a = "check_update")
        private Map<String, GeckoPollingConfig> checkUpdate;
        @AbstractC27891c(mo46611a = "enable")
        private int enable;
        @AbstractC27891c(mo46611a = "fre_control_enable")
        private int freControlEnable;
        @AbstractC27891c(mo46611a = "lazy")
        private Map<String, LazyItem> lazy;
        @AbstractC27891c(mo46611a = "poll_enable")
        private int pollEnable;
        @AbstractC27891c(mo46611a = "queue")
        private List<RequestConfig> queue;

        static {
            Covode.recordClassIndex(17172);
        }

        public List<String> getAks() {
            return this.aks;
        }

        public Map<String, GeckoPollingConfig> getCheckUpdate() {
            return this.checkUpdate;
        }

        public int getEnable() {
            return this.enable;
        }

        public int getFreControlEnable() {
            return this.freControlEnable;
        }

        public Map<String, LazyItem> getLazy() {
            return this.lazy;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }

        public List<RequestConfig> getQueue() {
            return this.queue;
        }
    }

    public static class RequestConfig {
        @AbstractC27891c(mo46611a = "delay")
        private long delay;
        @AbstractC27891c(mo46611a = "sync")
        private List<SyncItem> sync;

        static {
            Covode.recordClassIndex(17173);
        }

        public long getDelay() {
            return this.delay;
        }

        public List<SyncItem> getSync() {
            return this.sync;
        }
    }

    public static class ResourceMeta {
        @AbstractC27891c(mo46611a = "access_keys")
        private Map<String, AccessKeyMetaInfo> accessKeys;
        @AbstractC27891c(mo46611a = "config")
        private CurrentLevelConfig config;

        static {
            Covode.recordClassIndex(17174);
        }

        public Map<String, AccessKeyMetaInfo> getAccessKeys() {
            return this.accessKeys;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class SettingsPollingConfig {
        @AbstractC27891c(mo46611a = "interval")
        private long interval;

        static {
            Covode.recordClassIndex(17175);
        }

        public long getInterval() {
            return this.interval;
        }
    }

    public static class SyncItem {
        @AbstractC27891c(mo46611a = "ak")

        /* renamed from: ak */
        private String f36686ak;
        @AbstractC27891c(mo46611a = "group")
        private List<String> group;
        @AbstractC27891c(mo46611a = "target")
        private List<String> target;

        static {
            Covode.recordClassIndex(17176);
        }

        public SyncItem() {
        }

        public String getAccessKey() {
            return this.f36686ak;
        }

        public List<String> getGroup() {
            return this.group;
        }

        public List<String> getTarget() {
            return this.target;
        }

        public SyncItem(String str, List<String> list, List<String> list2) {
            this.f36686ak = str;
            this.group = list;
            this.target = list2;
        }
    }

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public ReqMeta getReqMeta() {
        return this.reqMeta;
    }

    public ResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    public int getVersion() {
        return this.version;
    }
}
