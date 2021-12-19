package com.p2082ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.f */
public final class C75444f implements Serializable {
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: a */
    private final int f169541a;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: b */
    private final int f169542b;
    @AbstractC27891c(mo46611a = "uri")

    /* renamed from: c */
    private final String f169543c;
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: d */
    private final List<String> f169544d;

    static {
        Covode.recordClassIndex(88365);
    }

    /* renamed from: com_ss_android_ugc_aweme_sticker_model_EffectAnchorIcon_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m132309x277e7146(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.model.f */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C75444f copy$default(C75444f fVar, int i, int i2, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fVar.f169541a;
        }
        if ((i3 & 2) != 0) {
            i2 = fVar.f169542b;
        }
        if ((i3 & 4) != 0) {
            str = fVar.f169543c;
        }
        if ((i3 & 8) != 0) {
            list = fVar.f169544d;
        }
        return fVar.copy(i, i2, str, list);
    }

    public final int component1() {
        return this.f169541a;
    }

    public final int component2() {
        return this.f169542b;
    }

    public final String component3() {
        return this.f169543c;
    }

    public final List<String> component4() {
        return this.f169544d;
    }

    public final C75444f copy(int i, int i2, String str, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        return new C75444f(i, i2, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75444f)) {
            return false;
        }
        C75444f fVar = (C75444f) obj;
        return this.f169541a == fVar.f169541a && this.f169542b == fVar.f169542b && C89219l.m154714a(this.f169543c, fVar.f169543c) && C89219l.m154714a(this.f169544d, fVar.f169544d);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_sticker_model_EffectAnchorIcon_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m132309x277e7146(this.f169541a) * 31) + m132309x277e7146(this.f169542b)) * 31;
        String str = this.f169543c;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_sticker_model_EffectAnchorIcon_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.f169544d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EffectAnchorIcon(height=" + this.f169541a + ", width=" + this.f169542b + ", uri=" + this.f169543c + ", urlList=" + this.f169544d + ")";
    }

    public final int getHeight() {
        return this.f169541a;
    }

    public final String getUri() {
        return this.f169543c;
    }

    public final List<String> getUrlList() {
        return this.f169544d;
    }

    public final int getWidth() {
        return this.f169542b;
    }

    public C75444f(int i, int i2, String str, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f169541a = i;
        this.f169542b = i2;
        this.f169543c = str;
        this.f169544d = list;
    }
}
