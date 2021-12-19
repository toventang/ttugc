package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FloatingCardInfo */
public class FloatingCardInfo implements Serializable {
    static final long serialVersionUID = 42;
    @AbstractC27891c(mo46611a = "button_bg")
    public UrlModel buttonBackground;
    @AbstractC27891c(mo46611a = "button_desc")
    public String buttonDesc;
    @AbstractC27891c(mo46611a = "description")
    public String description;
    @AbstractC27891c(mo46611a = "icons")
    public List<UrlModel> icons;
    @AbstractC27891c(mo46611a = "schema")
    public String schema;
    @AbstractC27891c(mo46611a = "schema_desc")
    public String schemaDesc;
    @AbstractC27891c(mo46611a = "title")
    public String title;

    static {
        Covode.recordClassIndex(58690);
    }

    public UrlModel getButtonBackground() {
        return this.buttonBackground;
    }

    public String getButtonDesc() {
        return this.buttonDesc;
    }

    public String getDescription() {
        return this.description;
    }

    public List<UrlModel> getIcons() {
        return this.icons;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSchemaDesc() {
        return this.schemaDesc;
    }

    public String getTitle() {
        return this.title;
    }

    public void setButtonBackground(UrlModel urlModel) {
        this.buttonBackground = urlModel;
    }

    public void setButtonDesc(String str) {
        this.buttonDesc = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcons(List<UrlModel> list) {
        this.icons = list;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSchemaDesc(String str) {
        this.schemaDesc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
