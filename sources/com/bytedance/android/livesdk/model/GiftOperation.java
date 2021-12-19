package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class GiftOperation {
    @AbstractC27891c(mo46611a = "event_name")
    public String eventName;
    @AbstractC27891c(mo46611a = "left_image")
    public ImageModel leftImage;
    @AbstractC27891c(mo46611a = "right_image")
    public ImageModel rightImage;
    @AbstractC27891c(mo46611a = "scheme_url")
    public String schemeUrl;
    @AbstractC27891c(mo46611a = "title")
    public String title;
    @AbstractC27891c(mo46611a = "title_color")
    public String titleColor;
    @AbstractC27891c(mo46611a = "title_size")
    public int titleSize;

    static {
        Covode.recordClassIndex(11037);
    }
}
