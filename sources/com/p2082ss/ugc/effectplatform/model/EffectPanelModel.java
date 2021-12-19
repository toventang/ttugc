package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.EffectPanelModel */
public class EffectPanelModel {
    private String extra;
    private UrlModel icon;

    /* renamed from: id */
    private String f195748id;
    private List<String> tags;
    private String tags_updated_at;
    private String text;

    static {
        Covode.recordClassIndex(102537);
    }

    public EffectPanelModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f195748id;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public String getText() {
        return this.text;
    }

    public final boolean checkValued() {
        if (getIcon() != null) {
            return true;
        }
        setIcon(new UrlModel(null, null, 3, null));
        return true;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setId(String str) {
        this.f195748id = str;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTags(List<String> list) {
        C89219l.m154719c(list, "");
        this.tags = list;
    }

    public EffectPanelModel(String str, String str2, UrlModel urlModel, List<String> list, String str3, String str4) {
        C89219l.m154719c(list, "");
        this.text = str;
        this.f195748id = str2;
        this.icon = urlModel;
        this.tags = list;
        this.tags_updated_at = str3;
        this.extra = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectPanelModel(String str, String str2, UrlModel urlModel, List list, String str3, String str4, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new UrlModel(null, null, 3, null) : urlModel, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null);
    }
}
