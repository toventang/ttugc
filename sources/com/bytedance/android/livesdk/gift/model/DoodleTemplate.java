package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class DoodleTemplate {
    @AbstractC27891c(mo46611a = "template_id")

    /* renamed from: id */
    public long f21688id;
    @AbstractC27891c(mo46611a = "image")
    public ImageModel image;
    public boolean selected;

    static {
        Covode.recordClassIndex(9688);
    }

    public long getId() {
        return this.f21688id;
    }

    public ImageModel getImage() {
        return this.image;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setId(long j) {
        this.f21688id = j;
    }

    public void setImage(ImageModel imageModel) {
        this.image = imageModel;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }
}
