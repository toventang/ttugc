package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckRequestBodyModel {
    @AbstractC27891c(mo46611a = "common")
    private Common common;
    @AbstractC27891c(mo46611a = "custom")
    private Map<String, Map<String, Object>> custom;
    @AbstractC27891c(mo46611a = "deployment")
    private Map<String, List<ChannelInfo>> deployment;
    @AbstractC27891c(mo46611a = "deployments")
    private Map<String, Object> deployments;
    @AbstractC27891c(mo46611a = "local")
    private Map<String, Map<String, LocalChannel>> local;
    @AbstractC27891c(mo46611a = "req_meta")
    private RequestMeta requestMeta;

    public static class Channels {
        @AbstractC27891c(mo46611a = "channels")
        public List<Channel> channels = new ArrayList();

        static {
            Covode.recordClassIndex(17090);
        }
    }

    public static class Group {
        @AbstractC27891c(mo46611a = "group_name")
        public String groupName;
        @AbstractC27891c(mo46611a = "target_channels")
        public List<TargetChannel> targetChannels;

        static {
            Covode.recordClassIndex(17091);
        }
    }

    public static class LocalChannel {
        @AbstractC27891c(mo46611a = "l_v")
        public Long localVersion;

        static {
            Covode.recordClassIndex(17093);
        }
    }

    public static class ProcessorParams {
        @AbstractC27891c(mo46611a = "domain")
        public String domain;

        static {
            Covode.recordClassIndex(17094);
        }
    }

    static {
        Covode.recordClassIndex(17087);
    }

    public enum GroupType {
        NORMAL("normal"),
        HIGHPRIORITY("high_priority");
        
        private String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(17092);
        }

        private GroupType(String str) {
            this.value = str;
        }
    }

    public static class RequestMeta {
        @AbstractC27891c(mo46611a = "combine_level")
        private String combineLevel;
        @AbstractC27891c(mo46611a = "req_type")
        private int reqType;
        @AbstractC27891c(mo46611a = "sync_task_id")
        private int syncTaskId;

        static {
            Covode.recordClassIndex(17095);
        }

        public String getCombineLevel() {
            return this.combineLevel;
        }

        public int getReqType() {
            return this.reqType;
        }

        public int getSyncTaskId() {
            return this.syncTaskId;
        }

        public void setCombineLevel(String str) {
            this.combineLevel = str;
        }

        public void setReqType(int i) {
            this.reqType = i;
        }

        public void setSyncTaskId(int i) {
            this.syncTaskId = i;
        }

        public RequestMeta(int i) {
            this.reqType = i;
        }
    }

    public static class TargetChannel {
        @AbstractC27891c(mo46611a = "c")
        public String channelName;
        @AbstractC27891c(mo46611a = "from")
        public List<String> from;
        @AbstractC27891c(mo46611a = "t_v")
        public Long targetVersion;

        static {
            Covode.recordClassIndex(17096);
        }

        public TargetChannel() {
        }

        public TargetChannel(String str) {
            this.channelName = str;
        }

        public TargetChannel(String str, Long l) {
            this.channelName = str;
            this.targetVersion = l;
        }
    }

    public void setCommon(Common common2) {
        this.common = common2;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setDeployments(Map<String, Object> map) {
        this.deployments = map;
    }

    public void setLocal(Map<String, Map<String, LocalChannel>> map) {
        this.local = map;
    }

    public void setRequestMeta(RequestMeta requestMeta2) {
        this.requestMeta = requestMeta2;
    }

    public static class Channel {
        @AbstractC27891c(mo46611a = "c")
        String channelName;
        @AbstractC27891c(mo46611a = "l_v")
        public String localVersion;

        static {
            Covode.recordClassIndex(17088);
        }

        public Channel(String str) {
            this.channelName = str;
        }
    }

    public static class ChannelInfo {
        @AbstractC27891c(mo46611a = "channel")
        private String channel;
        @AbstractC27891c(mo46611a = "local_version")
        private long localVersion;

        static {
            Covode.recordClassIndex(17089);
        }

        public ChannelInfo(String str, long j) {
            this.channel = str;
            this.localVersion = j;
        }
    }

    public void putChannelInfo(String str, List<ChannelInfo> list) {
        if (this.deployment == null) {
            this.deployment = new HashMap();
        }
        this.deployment.put(str, list);
    }
}
