package com.bytedance.android.livesdk.envelope.p520a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.envelope.a.a */
public final class C8425a {
    @AbstractC27891c(mo46611a = "envelope_id")

    /* renamed from: a */
    public String f20839a;
    @AbstractC27891c(mo46611a = "business_type")

    /* renamed from: b */
    public Integer f20840b;
    @AbstractC27891c(mo46611a = "envelope_idc")

    /* renamed from: c */
    public String f20841c;
    @AbstractC27891c(mo46611a = "send_user_name")

    /* renamed from: d */
    public String f20842d;
    @AbstractC27891c(mo46611a = "diamond_count")

    /* renamed from: e */
    public Integer f20843e;
    @AbstractC27891c(mo46611a = "people_count")

    /* renamed from: f */
    public Integer f20844f;
    @AbstractC27891c(mo46611a = "unpack_at")

    /* renamed from: g */
    public Integer f20845g;
    @AbstractC27891c(mo46611a = "send_user_id")

    /* renamed from: h */
    public String f20846h;
    @AbstractC27891c(mo46611a = "send_user_avatar")

    /* renamed from: i */
    public ImageModel f20847i;

    static {
        Covode.recordClassIndex(9270);
    }

    public C8425a(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8425a)) {
            return false;
        }
        C8425a aVar = (C8425a) obj;
        return C89219l.m154714a(this.f20839a, aVar.f20839a) && C89219l.m154714a(this.f20840b, aVar.f20840b) && C89219l.m154714a(this.f20841c, aVar.f20841c) && C89219l.m154714a(this.f20842d, aVar.f20842d) && C89219l.m154714a(this.f20843e, aVar.f20843e) && C89219l.m154714a(this.f20844f, aVar.f20844f) && C89219l.m154714a(this.f20845g, aVar.f20845g) && C89219l.m154714a(this.f20846h, aVar.f20846h) && C89219l.m154714a(this.f20847i, aVar.f20847i);
    }

    public final int hashCode() {
        String str = this.f20839a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f20840b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f20841c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20842d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.f20843e;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f20844f;
        int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f20845g;
        int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str4 = this.f20846h;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ImageModel imageModel = this.f20847i;
        if (imageModel != null) {
            i = imageModel.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "RedEnvelopInfo(envelopeId=" + this.f20839a + ", businessType=" + this.f20840b + ", envelopeIdc=" + this.f20841c + ", sendUserName=" + this.f20842d + ", diamondCount=" + this.f20843e + ", peopleCount=" + this.f20844f + ", unpackAt=" + this.f20845g + ", sendUserId=" + this.f20846h + ", sendUserAvatar=" + this.f20847i + ")";
    }

    private C8425a() {
        this.f20839a = null;
        this.f20840b = null;
        this.f20841c = null;
        this.f20842d = null;
        this.f20843e = null;
        this.f20844f = null;
        this.f20845g = null;
        this.f20846h = null;
        this.f20847i = null;
    }

    private /* synthetic */ C8425a(byte b) {
        this();
    }
}
