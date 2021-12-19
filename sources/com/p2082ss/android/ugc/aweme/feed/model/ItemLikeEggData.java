package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ItemLikeEggData */
public class ItemLikeEggData implements Serializable {
    @AbstractC27891c(mo46611a = "file_type")
    public String fileType;
    @AbstractC27891c(mo46611a = "material_url")
    public String materialUrl;

    static {
        Covode.recordClassIndex(58719);
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }
}
