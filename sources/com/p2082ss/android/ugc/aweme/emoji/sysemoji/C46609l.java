package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.l */
public final class C46609l implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private final int f108676a;
    @AbstractC27891c(mo46611a = "create_time")

    /* renamed from: b */
    private final int f108677b;
    @AbstractC27891c(mo46611a = "update_time")

    /* renamed from: c */
    private final int f108678c;
    @AbstractC27891c(mo46611a = "md5")

    /* renamed from: d */
    private final String f108679d;
    @AbstractC27891c(mo46611a = "resource_url")

    /* renamed from: e */
    private final String f108680e;

    static {
        Covode.recordClassIndex(55199);
    }

    /* renamed from: com_ss_android_ugc_aweme_emoji_sysemoji_ImSystemEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m89945x23984b9b(int i) {
        return i;
    }

    public static /* synthetic */ C46609l copy$default(C46609l lVar, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = lVar.f108676a;
        }
        if ((i4 & 2) != 0) {
            i2 = lVar.f108677b;
        }
        if ((i4 & 4) != 0) {
            i3 = lVar.f108678c;
        }
        if ((i4 & 8) != 0) {
            str = lVar.f108679d;
        }
        if ((i4 & 16) != 0) {
            str2 = lVar.f108680e;
        }
        return lVar.copy(i, i2, i3, str, str2);
    }

    public final int component1() {
        return this.f108676a;
    }

    public final int component2() {
        return this.f108677b;
    }

    public final int component3() {
        return this.f108678c;
    }

    public final String component4() {
        return this.f108679d;
    }

    public final String component5() {
        return this.f108680e;
    }

    public final C46609l copy(int i, int i2, int i3, String str, String str2) {
        return new C46609l(i, i2, i3, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46609l)) {
            return false;
        }
        C46609l lVar = (C46609l) obj;
        return this.f108676a == lVar.f108676a && this.f108677b == lVar.f108677b && this.f108678c == lVar.f108678c && C89219l.m154714a(this.f108679d, lVar.f108679d) && C89219l.m154714a(this.f108680e, lVar.f108680e);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_emoji_sysemoji_ImSystemEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((m89945x23984b9b(this.f108676a) * 31) + m89945x23984b9b(this.f108677b)) * 31) + m89945x23984b9b(this.f108678c)) * 31;
        String str = this.f108679d;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_emoji_sysemoji_ImSystemEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f108680e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ImSystemEmojiRes(id=" + this.f108676a + ", createTime=" + this.f108677b + ", updateTime=" + this.f108678c + ", md5=" + this.f108679d + ", resourceUrl=" + this.f108680e + ")";
    }

    public final int getCreateTime() {
        return this.f108677b;
    }

    public final int getId() {
        return this.f108676a;
    }

    public final String getMd5() {
        return this.f108679d;
    }

    public final String getResourceUrl() {
        return this.f108680e;
    }

    public final int getUpdateTime() {
        return this.f108678c;
    }

    public C46609l(int i, int i2, int i3, String str, String str2) {
        this.f108676a = i;
        this.f108677b = i2;
        this.f108678c = i3;
        this.f108679d = str;
        this.f108680e = str2;
    }
}
