package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.b.a.b */
public final class C46559b implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private final int f108551a;
    @AbstractC27891c(mo46611a = "create_time")

    /* renamed from: b */
    private final String f108552b;
    @AbstractC27891c(mo46611a = "update_time")

    /* renamed from: c */
    private final String f108553c;
    @AbstractC27891c(mo46611a = "resource_url")

    /* renamed from: d */
    private final String f108554d;
    @AbstractC27891c(mo46611a = "md5")

    /* renamed from: e */
    private final String f108555e;

    static {
        Covode.recordClassIndex(55146);
    }

    /* renamed from: com_ss_android_ugc_aweme_emoji_smallemoji_online_model_OnlineSmallEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m89857xacb3e314(int i) {
        return i;
    }

    public static /* synthetic */ C46559b copy$default(C46559b bVar, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f108551a;
        }
        if ((i2 & 2) != 0) {
            str = bVar.f108552b;
        }
        if ((i2 & 4) != 0) {
            str2 = bVar.f108553c;
        }
        if ((i2 & 8) != 0) {
            str3 = bVar.f108554d;
        }
        if ((i2 & 16) != 0) {
            str4 = bVar.f108555e;
        }
        return bVar.copy(i, str, str2, str3, str4);
    }

    public final int component1() {
        return this.f108551a;
    }

    public final String component2() {
        return this.f108552b;
    }

    public final String component3() {
        return this.f108553c;
    }

    public final String component4() {
        return this.f108554d;
    }

    public final String component5() {
        return this.f108555e;
    }

    public final C46559b copy(int i, String str, String str2, String str3, String str4) {
        return new C46559b(i, str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46559b)) {
            return false;
        }
        C46559b bVar = (C46559b) obj;
        return this.f108551a == bVar.f108551a && C89219l.m154714a(this.f108552b, bVar.f108552b) && C89219l.m154714a(this.f108553c, bVar.f108553c) && C89219l.m154714a(this.f108554d, bVar.f108554d) && C89219l.m154714a(this.f108555e, bVar.f108555e);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_emoji_smallemoji_online_model_OnlineSmallEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m89857xacb3e314(this.f108551a) * 31;
        String str = this.f108552b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_emoji_smallemoji_online_model_OnlineSmallEmojiRes_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f108553c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f108554d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f108555e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "OnlineSmallEmojiRes(id=" + this.f108551a + ", createTime=" + this.f108552b + ", updateTime=" + this.f108553c + ", resourceUrl=" + this.f108554d + ", md5=" + this.f108555e + ")";
    }

    public final String getCreateTime() {
        return this.f108552b;
    }

    public final int getId() {
        return this.f108551a;
    }

    public final String getMd5() {
        return this.f108555e;
    }

    public final String getResourceUrl() {
        return this.f108554d;
    }

    public final String getUpdateTime() {
        return this.f108553c;
    }

    public C46559b(int i, String str, String str2, String str3, String str4) {
        this.f108551a = i;
        this.f108552b = str;
        this.f108553c = str2;
        this.f108554d = str3;
        this.f108555e = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C46559b(int i, String str, String str2, String str3, String str4, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, str3, str4);
    }
}
