package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel */
public class UrlModel {
    @AbstractC27891c(mo46611a = "height")
    private Integer height;
    @AbstractC27891c(mo46611a = "uri")
    private String uri;
    @AbstractC27891c(mo46611a = "url_key")
    private String urlKey;
    @AbstractC27891c(mo46611a = "url_list")
    private List<String> urlList = new ArrayList();
    @AbstractC27891c(mo46611a = "width")
    private Integer width;

    static {
        Covode.recordClassIndex(62419);
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public Integer getHeight() {
        Integer num = this.height;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getUri() {
        String str = this.uri;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getUrlKey() {
        String str = this.urlKey;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getWidth() {
        Integer num = this.width;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
