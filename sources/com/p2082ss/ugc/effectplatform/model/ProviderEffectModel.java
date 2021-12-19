package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.ProviderEffectModel */
public class ProviderEffectModel {
    private int cursor;
    private String extra;
    private boolean has_more;
    private String search_tips;
    private List<? extends ProviderEffect> sticker_list;
    private String subtitle;

    static {
        Covode.recordClassIndex(102545);
    }

    public ProviderEffectModel() {
        this(null, 0, false, null, null, null, 63, null);
    }

    public int getCursor() {
        return this.cursor;
    }

    public String getExtra() {
        return this.extra;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.ProviderEffect>, java.util.List<com.ss.ugc.effectplatform.model.ProviderEffect> */
    public List<ProviderEffect> getSticker_list() {
        return this.sticker_list;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setSticker_list(List<? extends ProviderEffect> list) {
        C89219l.m154719c(list, "");
        this.sticker_list = list;
    }

    public ProviderEffectModel(String str, int i, boolean z, List<? extends ProviderEffect> list, String str2, String str3) {
        C89219l.m154719c(list, "");
        this.search_tips = str;
        this.cursor = i;
        this.has_more = z;
        this.sticker_list = list;
        this.subtitle = str2;
        this.extra = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectModel(String str, int i, boolean z, List list, String str2, String str3, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? z : false, (i2 & 8) != 0 ? new ArrayList() : list, (i2 & 16) != 0 ? null : str2, (i2 & 32) == 0 ? str3 : null);
    }
}
