package com.p2082ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.e */
public final class C75443e implements Serializable {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    private final int f169534a;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: b */
    private final C75444f f169535b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    private final String f169536c;
    @AbstractC27891c(mo46611a = "subtitle")

    /* renamed from: d */
    private final String f169537d;
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: e */
    private final String f169538e;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: f */
    private final String f169539f;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: g */
    private final String f169540g;

    static {
        Covode.recordClassIndex(88364);
    }

    /* renamed from: com_ss_android_ugc_aweme_sticker_model_EffectAnchor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m132308x2b6f522d(int i) {
        return i;
    }

    public static /* synthetic */ C75443e copy$default(C75443e eVar, int i, C75444f fVar, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eVar.f169534a;
        }
        if ((i2 & 2) != 0) {
            fVar = eVar.f169535b;
        }
        if ((i2 & 4) != 0) {
            str = eVar.f169536c;
        }
        if ((i2 & 8) != 0) {
            str2 = eVar.f169537d;
        }
        if ((i2 & 16) != 0) {
            str3 = eVar.f169538e;
        }
        if ((i2 & 32) != 0) {
            str4 = eVar.f169539f;
        }
        if ((i2 & 64) != 0) {
            str5 = eVar.f169540g;
        }
        return eVar.copy(i, fVar, str, str2, str3, str4, str5);
    }

    public final int component1() {
        return this.f169534a;
    }

    public final C75444f component2() {
        return this.f169535b;
    }

    public final String component3() {
        return this.f169536c;
    }

    public final String component4() {
        return this.f169537d;
    }

    public final String component5() {
        return this.f169538e;
    }

    public final String component6() {
        return this.f169539f;
    }

    public final String component7() {
        return this.f169540g;
    }

    public final C75443e copy(int i, C75444f fVar, String str, String str2, String str3, String str4, String str5) {
        return new C75443e(i, fVar, str, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75443e)) {
            return false;
        }
        C75443e eVar = (C75443e) obj;
        return this.f169534a == eVar.f169534a && C89219l.m154714a(this.f169535b, eVar.f169535b) && C89219l.m154714a(this.f169536c, eVar.f169536c) && C89219l.m154714a(this.f169537d, eVar.f169537d) && C89219l.m154714a(this.f169538e, eVar.f169538e) && C89219l.m154714a(this.f169539f, eVar.f169539f) && C89219l.m154714a(this.f169540g, eVar.f169540g);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_sticker_model_EffectAnchor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m132308x2b6f522d(this.f169534a) * 31;
        C75444f fVar = this.f169535b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_sticker_model_EffectAnchor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str = this.f169536c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f169537d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f169538e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f169539f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f169540g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "EffectAnchor(type=" + this.f169534a + ", icon=" + this.f169535b + ", title=" + this.f169536c + ", subtitle=" + this.f169537d + ", desc=" + this.f169538e + ", url=" + this.f169539f + ", extra=" + this.f169540g + ")";
    }

    public final String getDesc() {
        return this.f169538e;
    }

    public final String getExtra() {
        return this.f169540g;
    }

    public final C75444f getIcon() {
        return this.f169535b;
    }

    public final String getSubtitle() {
        return this.f169537d;
    }

    public final String getTitle() {
        return this.f169536c;
    }

    public final int getType() {
        return this.f169534a;
    }

    public final String getUrl() {
        return this.f169539f;
    }

    public C75443e(int i, C75444f fVar, String str, String str2, String str3, String str4, String str5) {
        this.f169534a = i;
        this.f169535b = fVar;
        this.f169536c = str;
        this.f169537d = str2;
        this.f169538e = str3;
        this.f169539f = str4;
        this.f169540g = str5;
    }
}
