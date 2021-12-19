package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.c */
public final class C55598c implements AbstractC17641a {

    /* renamed from: a */
    public final IMConversation f126829a;

    static {
        Covode.recordClassIndex(65376);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55598c) && C89219l.m154714a(this.f126829a, ((C55598c) obj).f126829a);
        }
        return true;
    }

    public final int hashCode() {
        IMConversation iMConversation = this.f126829a;
        if (iMConversation != null) {
            return iMConversation.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GroupListItem(contact=" + this.f126829a + ")";
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

    public C55598c(IMConversation iMConversation) {
        C89219l.m154721d(iMConversation, "");
        this.f126829a = iMConversation;
    }
}
