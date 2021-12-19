package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class SubscribeBadge {
    @AbstractC27891c(mo46611a = "origin_img")
    ImageModel originImage;
    @AbstractC27891c(mo46611a = "preview_img")
    ImageModel previewImage;

    static {
        Covode.recordClassIndex(3450);
    }

    public ImageModel getOriginImage() {
        return this.originImage;
    }

    public ImageModel getPreviewImage() {
        return this.previewImage;
    }

    public void setOriginImage(ImageModel imageModel) {
        this.originImage = imageModel;
    }

    public void setPreviewImage(ImageModel imageModel) {
        this.previewImage = imageModel;
    }
}
