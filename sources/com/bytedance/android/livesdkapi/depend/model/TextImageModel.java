package com.bytedance.android.livesdkapi.depend.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;

public class TextImageModel extends ImageModel {

    /* renamed from: a */
    public String f27880a;

    /* renamed from: b */
    public int f27881b = 0;

    /* renamed from: c */
    public int f27882c;

    /* renamed from: d */
    public int f27883d;

    static {
        Covode.recordClassIndex(13339);
    }

    public TextImageModel(ImageModel imageModel, int i) {
        setAvgColor(imageModel.getAvgColor());
        setUri(imageModel.getUri());
        setUrls(imageModel.getUrls());
        setWidth(imageModel.getWidth());
        setHeight(imageModel.getHeight());
        this.f27882c = i;
    }
}
