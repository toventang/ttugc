package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.k */
public final class C69172k implements AbstractC69184o {
    static {
        Covode.recordClassIndex(81486);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        if (!C69157h.C69158a.m122263a(awemeSharePackage.mo109569a(), context)) {
            return true;
        }
        awemeSharePackage.f155492i.putString("share_form", "url_form");
        return false;
    }
}
