package com.bytedance.android.livesdkapi.depend.model.live.p688a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.a.a */
public final class C11694a {
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: a */
    public Long f27972a;
    @AbstractC27891c(mo46611a = "nick_name")

    /* renamed from: b */
    public String f27973b;
    @AbstractC27891c(mo46611a = "display_id")

    /* renamed from: c */
    public String f27974c;
    @AbstractC27891c(mo46611a = "avatar_thumb")

    /* renamed from: d */
    public ImageModel f27975d;

    static {
        Covode.recordClassIndex(13382);
    }

    public C11694a(byte b) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11694a)) {
            return false;
        }
        C11694a aVar = (C11694a) obj;
        return C89219l.m154714a(this.f27972a, aVar.f27972a) && C89219l.m154714a(this.f27973b, aVar.f27973b) && C89219l.m154714a(this.f27974c, aVar.f27974c) && C89219l.m154714a(this.f27975d, aVar.f27975d);
    }

    public final int hashCode() {
        Long l = this.f27972a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.f27973b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27974c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ImageModel imageModel = this.f27975d;
        if (imageModel != null) {
            i = imageModel.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "BattleBaseUserInfo(userId=" + this.f27972a + ", nickName=" + this.f27973b + ", displayId=" + this.f27974c + ", avatarThumb=" + this.f27975d + ")";
    }

    private /* synthetic */ C11694a() {
        this(null, null, null, null);
    }

    public C11694a(Long l, String str, String str2, ImageModel imageModel) {
        this.f27972a = l;
        this.f27973b = str;
        this.f27974c = str2;
        this.f27975d = imageModel;
    }
}
