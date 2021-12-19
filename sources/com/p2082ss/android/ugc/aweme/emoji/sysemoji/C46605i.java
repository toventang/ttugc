package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.i */
public final class C46605i extends C46534a implements Serializable {
    public static final C46606a Companion = new C46606a((byte) 0);
    @AbstractC27891c(mo46611a = "preview_emoji")

    /* renamed from: a */
    private String f108666a;
    @AbstractC27891c(mo46611a = "emoji_list")

    /* renamed from: b */
    private List<String> f108667b;
    @AbstractC27891c(mo46611a = "support_skin_type")

    /* renamed from: c */
    private int f108668c = 1;
    @AbstractC27891c(mo46611a = "business_type")

    /* renamed from: d */
    private int f108669d = 7;
    @AbstractC27891c(mo46611a = "mini_support")

    /* renamed from: e */
    private String f108670e;

    /* renamed from: f */
    private int f108671f;

    static {
        Covode.recordClassIndex(55195);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.i$a */
    public static final class C46606a {
        static {
            Covode.recordClassIndex(55196);
        }

        private C46606a() {
        }

        public /* synthetic */ C46606a(byte b) {
            this();
        }
    }

    public final int getBusinessType() {
        return this.f108669d;
    }

    public final List<String> getEmojiList() {
        return this.f108667b;
    }

    public final String getMiniSupportSysVersion() {
        return this.f108670e;
    }

    public final int getPosition() {
        return this.f108671f;
    }

    public final int getSupportSkinBusinessType() {
        return this.f108668c;
    }

    public final String getPreviewEmoji() {
        String str = this.f108666a;
        if (str != null) {
            return str;
        }
        List<String> list = this.f108667b;
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    public final void setBusinessType(int i) {
        this.f108669d = i;
    }

    public final void setEmojiList(List<String> list) {
        this.f108667b = list;
    }

    public final void setMiniSupportSysVersion(String str) {
        this.f108670e = str;
    }

    public final void setPosition(int i) {
        this.f108671f = i;
    }

    public final void setPreviewEmoji(String str) {
        this.f108666a = str;
    }

    public final void setSupportSkinBusinessType(int i) {
        this.f108668c = i;
    }

    public final void updatePreviewEmoji(String str) {
        if (str != null) {
            this.f108666a = str;
        }
    }
}
