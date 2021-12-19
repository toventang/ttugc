package com.p2082ss.android.ugc.aweme.share.silent.p3774a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.model.C69331c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.a.e */
public final class C69436e implements AbstractC69431a {

    /* renamed from: a */
    public final AbstractC69581b f155115a;

    static {
        Covode.recordClassIndex(81774);
    }

    public C69436e(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f155115a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.p3774a.AbstractC69431a
    /* renamed from: a */
    public final void mo109696a(Context context, String str, C69331c cVar, AbstractC89172b<? super C69331c, C89391z> bVar) {
        String str2 = "";
        C89219l.m154721d(context, str2);
        C89219l.m154721d(str, str2);
        C89219l.m154721d(cVar, str2);
        C89219l.m154721d(bVar, str2);
        AbstractC69581b bVar2 = this.f155115a;
        C69653n nVar = new C69653n(C69125c.m122230a(str, context), str, null, null, null, 60);
        String str3 = nVar.f155485g;
        if (str3 != null) {
            str2 = str3;
        }
        nVar.mo109799a("content_url", str2);
        nVar.mo109799a("media_type", "video/mp4");
        bVar2.mo109552a(nVar, context);
        cVar.mo109610b("video_form");
        bVar.invoke(cVar);
    }
}
