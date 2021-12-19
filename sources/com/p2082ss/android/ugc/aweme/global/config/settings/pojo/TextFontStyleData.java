package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.TextFontStyleData */
public class TextFontStyleData {
    @AbstractC27891c(mo46611a = "enable_bg_color")
    private Integer enableBgColor;
    @AbstractC27891c(mo46611a = "enable_maskblur_light_color")
    private Integer enableMaskblurLightColor;
    @AbstractC27891c(mo46611a = "extra_type")
    private Integer extraType;
    @AbstractC27891c(mo46611a = "font_name")
    private String fontName;
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = "url")
    private String url;

    static {
        Covode.recordClassIndex(62401);
    }

    public Integer getEnableBgColor() {
        Integer num = this.enableBgColor;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getEnableMaskblurLightColor() {
        Integer num = this.enableMaskblurLightColor;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getExtraType() {
        Integer num = this.extraType;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getFontName() {
        String str = this.fontName;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getUrl() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
