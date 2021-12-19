package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent */
public class SystemContent extends BaseContent {
    @AbstractC27891c(mo46611a = "fallback_tips")
    String fallbackTips;
    @AbstractC27891c(mo46611a = "group_tips")
    String groupNoticeTips;
    @AbstractC27891c(mo46611a = "android_filter_max_version")
    String maxVersion;
    @AbstractC27891c(mo46611a = "android_filter_min_version")
    String minVersion;
    @AbstractC27891c(mo46611a = "new_template")
    Key[] newTemplate;
    @AbstractC27891c(mo46611a = "new_tips")
    String newTips;
    @AbstractC27891c(mo46611a = "strong_template")
    Key[] strongTemplate;
    @AbstractC27891c(mo46611a = "strong_tips")
    String strongTips;
    @AbstractC27891c(mo46611a = "template")
    Key[] template;
    @AbstractC27891c(mo46611a = "tips")
    String tips;

    static {
        Covode.recordClassIndex(63481);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent$Key */
    public static class Key implements Serializable {
        @AbstractC27891c(mo46611a = "action")
        int action;
        @AbstractC27891c(mo46611a = "extra")
        Map<String, String> extra;
        @AbstractC27891c(mo46611a = "key")
        String key;
        @AbstractC27891c(mo46611a = "link")
        String link;
        @AbstractC27891c(mo46611a = StringSet.name)
        String name;

        static {
            Covode.recordClassIndex(63482);
        }

        public int getAction() {
            return this.action;
        }

        public Map<String, String> getExtra() {
            return this.extra;
        }

        public String getKey() {
            return this.key;
        }

        public String getLink() {
            return this.link;
        }

        public String getName() {
            return this.name;
        }

        public void setAction(int i) {
            this.action = i;
        }

        public void setExtra(Map<String, String> map) {
            this.extra = map;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setLink(String str) {
            this.link = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public String getFallbackTips() {
        return this.fallbackTips;
    }

    public Key[] getNewTemplate() {
        return this.newTemplate;
    }

    public String getNewTips() {
        return this.newTips;
    }

    public Key[] getStrongTemplate() {
        return this.strongTemplate;
    }

    public String getStrongTips() {
        return this.strongTips;
    }

    public Key[] getTemplate() {
        return this.template;
    }

    public String getTips() {
        return this.tips;
    }

    public long getMaxVersion() {
        return safelyReturnLong(this.maxVersion);
    }

    public long getMinVersion() {
        return safelyReturnLong(this.minVersion);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        if (TextUtils.isEmpty(this.tips)) {
            return this.tips;
        }
        String str = this.tips;
        Key[] keyArr = this.template;
        if (keyArr != null) {
            for (Key key : keyArr) {
                str = str.replace(C1764a.m5928a("{{%s}}", new Object[]{key.getKey()}), key.getName());
            }
        }
        return str;
    }

    public void setTemplate(Key[] keyArr) {
        this.template = keyArr;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    private long safelyReturnLong(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            C56244a.m102188a(e);
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent$LinkTypeExtra */
    public static class LinkTypeExtra {
        static {
            Covode.recordClassIndex(63483);
        }

        public static boolean isSafeWarningLink(Key key) {
            if (key != null) {
                try {
                    if (key.getExtra() != null) {
                        return TextUtils.equals(key.extra.get("link_type"), "safe_warning");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
    }
}
