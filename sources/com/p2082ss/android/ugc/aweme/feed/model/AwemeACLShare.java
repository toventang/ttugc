package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeACLShare */
public final class AwemeACLShare implements Serializable {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "download_general")
    public ACLCommonShare downloadGeneral;
    @AbstractC27891c(mo46611a = "download_mask_panel")
    public ACLCommonShare downloadMaskPanel;
    @AbstractC27891c(mo46611a = "download_share_panel")
    public ACLCommonShare downloadSharePanel;
    @AbstractC27891c(mo46611a = "platform_list")
    public List<ACLCommonShare> platformList;
    @AbstractC27891c(mo46611a = "share_general")
    public ACLCommonShare shareGeneral;
    @AbstractC27891c(mo46611a = "share_list_status")
    public int shareListStatus;
    @AbstractC27891c(mo46611a = "share_third_platform")
    public ACLCommonShare shareThirdPlatform;

    static {
        Covode.recordClassIndex(58616);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeACLShare$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58617);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final ACLCommonShare getDownloadGeneral() {
        return this.downloadGeneral;
    }

    public final ACLCommonShare getDownloadMaskPanel() {
        return this.downloadMaskPanel;
    }

    public final ACLCommonShare getDownloadSharePanel() {
        return this.downloadSharePanel;
    }

    public final List<ACLCommonShare> getPlatformList() {
        return this.platformList;
    }

    public final ACLCommonShare getShareGeneral() {
        return this.shareGeneral;
    }

    public final int getShareListStatus() {
        return this.shareListStatus;
    }

    public final ACLCommonShare getShareThirdPlatform() {
        return this.shareThirdPlatform;
    }

    public final void setDownloadGeneral(ACLCommonShare aCLCommonShare) {
        this.downloadGeneral = aCLCommonShare;
    }

    public final void setDownloadMaskPanel(ACLCommonShare aCLCommonShare) {
        this.downloadMaskPanel = aCLCommonShare;
    }

    public final void setDownloadSharePanel(ACLCommonShare aCLCommonShare) {
        this.downloadSharePanel = aCLCommonShare;
    }

    public final void setPlatformList(List<ACLCommonShare> list) {
        this.platformList = list;
    }

    public final void setShareGeneral(ACLCommonShare aCLCommonShare) {
        this.shareGeneral = aCLCommonShare;
    }

    public final void setShareListStatus(int i) {
        this.shareListStatus = i;
    }

    public final void setShareThirdPlatform(ACLCommonShare aCLCommonShare) {
        this.shareThirdPlatform = aCLCommonShare;
    }
}
