package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.f */
public final class C55955f {

    /* renamed from: a */
    public final String f127597a;

    /* renamed from: b */
    public final Map<String, Boolean> f127598b;

    /* renamed from: c */
    public final SharePackage f127599c;

    /* renamed from: d */
    public final List<IMContact> f127600d;

    static {
        Covode.recordClassIndex(65748);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55955f)) {
            return false;
        }
        C55955f fVar = (C55955f) obj;
        return C89219l.m154714a(this.f127597a, fVar.f127597a) && C89219l.m154714a(this.f127598b, fVar.f127598b) && C89219l.m154714a(this.f127599c, fVar.f127599c) && C89219l.m154714a(this.f127600d, fVar.f127600d);
    }

    public final int hashCode() {
        String str = this.f127597a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Boolean> map = this.f127598b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        SharePackage sharePackage = this.f127599c;
        int hashCode3 = (hashCode2 + (sharePackage != null ? sharePackage.hashCode() : 0)) * 31;
        List<IMContact> list = this.f127600d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ShareState(type=" + this.f127597a + ", conversationMap=" + this.f127598b + ", sharePackage=" + this.f127599c + ", list=" + this.f127600d + ")";
    }

    public C55955f(String str, Map<String, Boolean> map, SharePackage sharePackage, List<IMContact> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(list, "");
        this.f127597a = str;
        this.f127598b = map;
        this.f127599c = sharePackage;
        this.f127600d = list;
    }
}
