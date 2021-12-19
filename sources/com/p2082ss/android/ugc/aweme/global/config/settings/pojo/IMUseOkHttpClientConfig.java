package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMUseOkHttpClientConfig */
public class IMUseOkHttpClientConfig {
    @AbstractC27891c(mo46611a = "downloader_use_okhttpclient")
    private Boolean downloaderUseOkhttpclient;
    @AbstractC27891c(mo46611a = "gif_manager_use_okhttpclient")
    private Boolean gifManagerUseOkhttpclient;
    @AbstractC27891c(mo46611a = "uploader_use_okhttpclient")
    private Boolean uploaderUseOkhttpclient;

    static {
        Covode.recordClassIndex(62366);
    }

    public Boolean getDownloaderUseOkhttpclient() {
        Boolean bool = this.downloaderUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getGifManagerUseOkhttpclient() {
        Boolean bool = this.gifManagerUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getUploaderUseOkhttpclient() {
        Boolean bool = this.uploaderUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
