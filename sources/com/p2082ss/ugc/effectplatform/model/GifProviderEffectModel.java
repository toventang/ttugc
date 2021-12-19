package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.ugc.effectplatform.model.GifProviderEffectModel */
public class GifProviderEffectModel {
    private ProviderEffectModel gifs;
    private String search_tips;

    static {
        Covode.recordClassIndex(102539);
    }

    public GifProviderEffectModel() {
        this(null, null, 3, null);
    }

    public ProviderEffectModel getGifs() {
        return this.gifs;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    public void setGifs(ProviderEffectModel providerEffectModel) {
        this.gifs = providerEffectModel;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public GifProviderEffectModel(String str, ProviderEffectModel providerEffectModel) {
        this.search_tips = str;
        this.gifs = providerEffectModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GifProviderEffectModel(String str, ProviderEffectModel providerEffectModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : providerEffectModel);
    }
}
