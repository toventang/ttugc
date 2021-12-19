package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.ProviderEffect */
public class ProviderEffect {
    private String click_url;
    private String extra;

    /* renamed from: id */
    private String f195749id;
    private String path;
    private StickerBean sticker;
    private StickerBean thumbnail_sticker;
    private String title;
    private String user_name;

    static {
        Covode.recordClassIndex(102543);
    }

    public ProviderEffect() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: com.ss.ugc.effectplatform.model.ProviderEffect$StickerBean */
    public static class StickerBean {
        private String height;
        private String size;
        private String url;
        private String width;

        static {
            Covode.recordClassIndex(102544);
        }

        public StickerBean() {
            this(null, null, null, null, 15, null);
        }

        public String getHeight() {
            return this.height;
        }

        public String getSize() {
            return this.size;
        }

        public String getUrl() {
            return this.url;
        }

        public String getWidth() {
            return this.width;
        }

        public void setHeight(String str) {
            this.height = str;
        }

        public void setSize(String str) {
            this.size = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setWidth(String str) {
            this.width = str;
        }

        public StickerBean(String str, String str2, String str3, String str4) {
            this.url = str;
            this.width = str2;
            this.height = str3;
            this.size = str4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StickerBean(String str, String str2, String str3, String str4, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    public String getClick_url() {
        return this.click_url;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getId() {
        return this.f195749id;
    }

    public String getPath() {
        return this.path;
    }

    public final StickerBean getSticker_info() {
        return this.sticker;
    }

    public StickerBean getThumbnail_sticker() {
        return this.thumbnail_sticker;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setClick_url(String str) {
        this.click_url = str;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public final void setSticker_info(StickerBean stickerBean) {
        this.sticker = stickerBean;
    }

    public void setThumbnail_sticker(StickerBean stickerBean) {
        this.thumbnail_sticker = stickerBean;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser_name(String str) {
        this.user_name = str;
    }

    public void setId(String str) {
        C89219l.m154719c(str, "");
        this.f195749id = str;
    }

    public ProviderEffect(String str, String str2, String str3, StickerBean stickerBean, StickerBean stickerBean2, String str4, String str5, String str6) {
        C89219l.m154719c(str, "");
        this.f195749id = str;
        this.title = str2;
        this.user_name = str3;
        this.thumbnail_sticker = stickerBean;
        this.sticker = stickerBean2;
        this.click_url = str4;
        this.path = str5;
        this.extra = str6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffect(String str, String str2, String str3, StickerBean stickerBean, StickerBean stickerBean2, String str4, String str5, String str6, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : stickerBean, (i & 16) != 0 ? null : stickerBean2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? str6 : null);
    }
}
