package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69315h;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupSharePackage */
public final class GroupSharePackage extends SharePackage {
    static {
        Covode.recordClassIndex(65152);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final AbstractC69645h mo87088a(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        String a = C69125c.m122232a(this.f155491h, this.f155487d, bVar);
        if (C89219l.m154714a((Object) bVar.mo109548a(), (Object) "twitter")) {
            a = C17867d.m33078a().getString(R.string.c91, a);
            C89219l.m154716b(a, "");
        }
        String a2 = C69315h.f154879a.mo109599a(bVar, this.f155487d, this.f155490g);
        String a3 = bVar.mo109548a();
        if (a3.hashCode() == 96619420 && a3.equals("email")) {
            return new C69650k(a, this.f155489f, a2);
        }
        return new C69650k(a, a2, null, 4);
    }
}
