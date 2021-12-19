package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.EnumC56260m;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.e */
public final class C55954e {

    /* renamed from: a */
    public EnumC56260m f127588a;

    /* renamed from: b */
    public String f127589b;

    /* renamed from: c */
    public String f127590c;

    /* renamed from: d */
    public final List<IMContact> f127591d;

    /* renamed from: e */
    public final String f127592e;

    /* renamed from: f */
    public final SharePackage f127593f;

    /* renamed from: g */
    public final BaseContent f127594g = null;

    /* renamed from: h */
    public final String f127595h;

    /* renamed from: i */
    public AbstractC55947a f127596i;

    static {
        Covode.recordClassIndex(65747);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55954e)) {
            return false;
        }
        C55954e eVar = (C55954e) obj;
        return C89219l.m154714a(this.f127588a, eVar.f127588a) && C89219l.m154714a(this.f127589b, eVar.f127589b) && C89219l.m154714a(this.f127590c, eVar.f127590c) && C89219l.m154714a(this.f127591d, eVar.f127591d) && C89219l.m154714a(this.f127592e, eVar.f127592e) && C89219l.m154714a(this.f127593f, eVar.f127593f) && C89219l.m154714a(this.f127594g, eVar.f127594g) && C89219l.m154714a(this.f127595h, eVar.f127595h) && C89219l.m154714a(this.f127596i, eVar.f127596i);
    }

    public final int hashCode() {
        EnumC56260m mVar = this.f127588a;
        int i = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        String str = this.f127589b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f127590c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<IMContact> list = this.f127591d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.f127592e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        SharePackage sharePackage = this.f127593f;
        int hashCode6 = (hashCode5 + (sharePackage != null ? sharePackage.hashCode() : 0)) * 31;
        BaseContent baseContent = this.f127594g;
        int hashCode7 = (hashCode6 + (baseContent != null ? baseContent.hashCode() : 0)) * 31;
        String str4 = this.f127595h;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AbstractC55947a aVar = this.f127596i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "ShareMessageParams(status=" + this.f127588a + ", shareId=" + this.f127589b + ", aid=" + this.f127590c + ", contactList=" + this.f127591d + ", msg=" + this.f127592e + ", sharePackage=" + this.f127593f + ", shareContent=" + this.f127594g + ", processId=" + this.f127595h + ", shareComplete=" + this.f127596i + ")";
    }

    /* renamed from: a */
    public final void mo92821a(EnumC56260m mVar) {
        C89219l.m154721d(mVar, "");
        this.f127588a = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> */
    /* JADX WARN: Multi-variable type inference failed */
    public C55954e(EnumC56260m mVar, String str, String str2, List<? extends IMContact> list, String str3, SharePackage sharePackage, String str4, AbstractC55947a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        this.f127588a = mVar;
        this.f127589b = str;
        this.f127590c = str2;
        this.f127591d = list;
        this.f127592e = str3;
        this.f127593f = sharePackage;
        this.f127595h = str4;
        this.f127596i = aVar;
    }
}
