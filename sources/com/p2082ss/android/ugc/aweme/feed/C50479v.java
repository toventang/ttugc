package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49968d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.v */
public final class C50479v {

    /* renamed from: a */
    public int f116591a;

    /* renamed from: b */
    public boolean f116592b;

    /* renamed from: c */
    private C39101b<C49968d> f116593c;

    static {
        Covode.recordClassIndex(59616);
    }

    /* renamed from: a */
    public final boolean mo85722a() {
        int i = this.f116591a;
        AbstractC39100a aVar = (AbstractC39100a) this.f116593c.f92286h;
        C89219l.m154716b(aVar, "");
        if (i >= aVar.getItems().size() - 1 || C39223a.m79592f().mo68589b()) {
            return false;
        }
        return true;
    }

    public C50479v(C39101b<C49968d> bVar) {
        C89219l.m154721d(bVar, "");
        this.f116593c = bVar;
        ((C49968d) bVar.f92286h).f115246d = this;
    }
}
