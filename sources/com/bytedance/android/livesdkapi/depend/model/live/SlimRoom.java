package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.utils.C9913b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class SlimRoom {
    @AbstractC27891c(mo46611a = "client_version")
    String clientVersion;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    long f27943id;
    @AbstractC27891c(mo46611a = "live_type_screenshot")
    public boolean isScreenshot;
    @AbstractC27891c(mo46611a = "live_type_third_party")
    public boolean isThirdParty;
    @AbstractC27891c(mo46611a = "common_label_list")
    String labels;
    @AbstractC27891c(mo46611a = "layout")
    public long layout;
    @AbstractC27891c(mo46611a = "link_mic")
    C11692a linkMic;
    @AbstractC27891c(mo46611a = "live_type_audio")
    boolean liveTypeAudio;
    @AbstractC27891c(mo46611a = "mask_layer")
    public MaskLayer maskLayer;
    @AbstractC27891c(mo46611a = "orientation")
    int orientation;
    @AbstractC27891c(mo46611a = "owner_user_id")
    long ownerUserId;
    @AbstractC27891c(mo46611a = "os_type")
    int platform;
    @AbstractC27891c(mo46611a = "private_info")
    String privateInfo;
    @AbstractC27891c(mo46611a = "stream_url")
    StreamUrl streamUrl;
    @AbstractC27891c(mo46611a = "warning_tag")
    public WarningTag warningTag;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$a */
    public static class C11692a {
        @AbstractC27891c(mo46611a = "show_user_list")

        /* renamed from: a */
        public List<User> f27944a;
        @AbstractC27891c(mo46611a = "audience_id_list")

        /* renamed from: b */
        public List<Long> f27945b;
        @AbstractC27891c(mo46611a = "followed_count")

        /* renamed from: c */
        public int f27946c;

        static {
            Covode.recordClassIndex(13374);
        }
    }

    static {
        Covode.recordClassIndex(13373);
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public long getId() {
        return this.f27943id;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLayout() {
        return this.layout;
    }

    public C11692a getLinkMic() {
        return this.linkMic;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getPrivateInfo() {
        return this.privateInfo;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public boolean isLiveTypeScreenshot() {
        return this.isScreenshot;
    }

    public String buildPullUrl() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return buildPullUrl(streamUrl2.f27964r);
    }

    public String getSdkParams() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return getSdkParams(streamUrl2.f27964r);
    }

    public C11738s getStreamUrlExtra() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return streamUrl2.f27958l;
    }

    public C11738s getStreamUrlExtraSafely() {
        C11738s streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new C11738s();
        }
        return streamUrlExtra;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || streamUrl2.f27961o == null || this.streamUrl.f27961o.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.f27961o.getDefaultQuality().sdkKey;
    }

    public void init() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 != null) {
            streamUrl2.mo18683b();
            if (this.streamUrl.f27961o != null) {
                this.streamUrl.mo18684c();
            }
        }
    }

    public String getMultiStreamData() {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || streamUrl2.f27961o == null || this.streamUrl.f27961o.getPullData() == null) {
            return null;
        }
        return this.streamUrl.f27961o.getPullData().getStreamData();
    }

    public EnumC11728i getStreamType() {
        if (this.layout == 1) {
            return EnumC11728i.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return EnumC11728i.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return EnumC11728i.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return EnumC11728i.AUDIO;
        }
        return EnumC11728i.VIDEO;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setId(long j) {
        this.f27943id = j;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLayout(long j) {
        this.layout = j;
    }

    public void setLinkMic(C11692a aVar) {
        this.linkMic = aVar;
    }

    public void setLiveTypeScreenshot(boolean z) {
        this.isScreenshot = z;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setPrivateInfo(String str) {
        this.privateInfo = str;
    }

    public void setStreamUrl(StreamUrl streamUrl2) {
        this.streamUrl = streamUrl2;
    }

    public String getSdkParams(String str) {
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null) {
            return null;
        }
        return streamUrl2.sdkParamsMap.get(str);
    }

    public String buildPullUrl(String str) {
        String str2;
        StreamUrl streamUrl2 = this.streamUrl;
        if (streamUrl2 == null || (str2 = streamUrl2.qualityMap.get(str)) == null) {
            return null;
        }
        C9913b bVar = new C9913b(str2);
        bVar.mo16612a("anchor_device_platform", this.platform);
        bVar.mo16614a("anchor_version", this.clientVersion);
        bVar.mo16613a("room_id", this.f27943id);
        bVar.mo16613a("anchor_id", this.ownerUserId);
        return bVar.mo16611a();
    }
}
