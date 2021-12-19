package com.p2082ss.android.ugc.aweme.commerce;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.d */
public final class C37491d implements Serializable {
    public static final C37492a Companion = new C37492a((byte) 0);
    @AbstractC27891c(mo46611a = "android_download_app_link")

    /* renamed from: a */
    private String f88498a;
    @AbstractC27891c(mo46611a = "ios_download_app_link")

    /* renamed from: b */
    private String f88499b;
    @AbstractC27891c(mo46611a = "permission_list")

    /* renamed from: c */
    private List<String> f88500c;
    @AbstractC27891c(mo46611a = "suggested_accounts_lynx_schema")

    /* renamed from: d */
    private String f88501d;
    @AbstractC27891c(mo46611a = "suggested_accounts_entrance_tip_type")

    /* renamed from: e */
    private int f88502e;

    static {
        Covode.recordClassIndex(44878);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.d$a */
    public static final class C37492a {
        static {
            Covode.recordClassIndex(44879);
        }

        private C37492a() {
        }

        public /* synthetic */ C37492a(byte b) {
            this();
        }
    }

    public final String getAndroidDownloadAppLink() {
        return this.f88498a;
    }

    public final String getIosDownloadAppLink() {
        return this.f88499b;
    }

    public final List<String> getPermissionList() {
        return this.f88500c;
    }

    public final int getSuggestedAccountsEntranceTipType() {
        return this.f88502e;
    }

    public final String getSuggestedAccountsLynxSchema() {
        return this.f88501d;
    }

    public final boolean enableAutoMsg() {
        List<String> list = this.f88500c;
        if (list != null) {
            return list.contains("001002");
        }
        return false;
    }

    public final boolean enableBrandedContent() {
        List<String> list = this.f88500c;
        if (list != null) {
            return list.contains("006001");
        }
        return false;
    }

    public final boolean enableBrandedContentRemoveMe() {
        List<String> list = this.f88500c;
        if (list != null) {
            return list.contains("006202");
        }
        return false;
    }

    public final boolean enableBrandedContentViewInsights() {
        List<String> list = this.f88500c;
        if (list != null) {
            return list.contains("006201");
        }
        return false;
    }

    public final boolean enableBusinessRegistration() {
        List<String> list = this.f88500c;
        if (list != null) {
            return list.contains("007001");
        }
        return false;
    }

    public final boolean enableCreativeHub() {
        List<String> list = this.f88500c;
        if (list != null) {
            return list.contains("002001");
        }
        return false;
    }

    public final boolean enableDM() {
        List<String> list = this.f88500c;
        if (list != null) {
            return list.contains("001001");
        }
        return false;
    }

    public final boolean enableLiveLinks() {
        List<String> list = this.f88500c;
        if (list != null) {
            return list.contains("005001");
        }
        return false;
    }

    public final boolean enableShowCategory() {
        List<String> list = this.f88500c;
        if (list != null) {
            return list.contains("007002");
        }
        return false;
    }

    public final String getDownloadAppLinkToShowInEditProfile() {
        if (!TextUtils.isEmpty(this.f88498a)) {
            return this.f88498a;
        }
        return this.f88499b;
    }

    public final boolean enableSuggestedAccounts() {
        List<String> list = this.f88500c;
        if (list == null || !list.contains("008001") || this.f88502e == 0) {
            return false;
        }
        return true;
    }

    public final void setAndroidDownloadAppLink(String str) {
        this.f88498a = str;
    }

    public final void setIosDownloadAppLink(String str) {
        this.f88499b = str;
    }

    public final void setPermissionList(List<String> list) {
        this.f88500c = list;
    }

    public final void setSuggestedAccountsEntranceTipType(int i) {
        this.f88502e = i;
    }

    public final void setSuggestedAccountsLynxSchema(String str) {
        this.f88501d = str;
    }
}
