package com.p2082ss.android.ugc.gamora.editor.sticker.donation;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.b */
public final class C82745b implements Serializable {

    /* renamed from: a */
    private final String f184958a;

    /* renamed from: b */
    private final String f184959b;

    /* renamed from: c */
    private final String f184960c;

    /* renamed from: d */
    private final String f184961d;

    static {
        Covode.recordClassIndex(96595);
    }

    public static /* synthetic */ C82745b copy$default(C82745b bVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f184958a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f184959b;
        }
        if ((i & 4) != 0) {
            str3 = bVar.f184960c;
        }
        if ((i & 8) != 0) {
            str4 = bVar.f184961d;
        }
        return bVar.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f184958a;
    }

    public final String component2() {
        return this.f184959b;
    }

    public final String component3() {
        return this.f184960c;
    }

    public final String component4() {
        return this.f184961d;
    }

    public final C82745b copy(String str, String str2, String str3, String str4) {
        return new C82745b(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82745b)) {
            return false;
        }
        C82745b bVar = (C82745b) obj;
        return C89219l.m154714a(this.f184958a, bVar.f184958a) && C89219l.m154714a(this.f184959b, bVar.f184959b) && C89219l.m154714a(this.f184960c, bVar.f184960c) && C89219l.m154714a(this.f184961d, bVar.f184961d);
    }

    public final int hashCode() {
        String str = this.f184958a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f184959b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f184960c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f184961d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "DonationStickerMobParams(shootWay=" + this.f184958a + ", creationId=" + this.f184959b + ", contentSource=" + this.f184960c + ", contentType=" + this.f184961d + ")";
    }

    public final String getContentSource() {
        return this.f184960c;
    }

    public final String getContentType() {
        return this.f184961d;
    }

    public final String getCreationId() {
        return this.f184959b;
    }

    public final String getShootWay() {
        return this.f184958a;
    }

    public C82745b(String str, String str2, String str3, String str4) {
        this.f184958a = str;
        this.f184959b = str2;
        this.f184960c = str3;
        this.f184961d = str4;
    }
}
