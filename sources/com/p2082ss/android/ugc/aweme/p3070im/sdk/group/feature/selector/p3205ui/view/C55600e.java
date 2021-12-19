package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.e */
public final class C55600e implements AbstractC17641a {

    /* renamed from: a */
    public final String f126832a;

    static {
        Covode.recordClassIndex(65378);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55600e) && C89219l.m154714a(this.f126832a, ((C55600e) obj).f126832a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f126832a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TextItem(str=" + this.f126832a + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    public C55600e(String str) {
        C89219l.m154721d(str, "");
        this.f126832a = str;
    }
}
