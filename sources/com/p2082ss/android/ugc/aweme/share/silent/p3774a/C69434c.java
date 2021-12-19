package com.p2082ss.android.ugc.aweme.share.silent.p3774a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.model.C69331c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.a.c */
public final class C69434c implements AbstractC69431a {

    /* renamed from: a */
    public final AbstractC69581b f155113a;

    static {
        Covode.recordClassIndex(81772);
    }

    public C69434c(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f155113a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.p3774a.AbstractC69431a
    /* renamed from: a */
    public final void mo109696a(Context context, String str, C69331c cVar, AbstractC89172b<? super C69331c, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        AbstractC69581b a = C69583c.m122807a("facebook_story", null);
        if (a == null || !a.mo109557b(context)) {
            this.f155113a.mo109552a(new C69653n(C69125c.m122230a(str, context), str, null, null, null, 60), context);
            cVar.mo109610b("video_form");
            bVar.invoke(cVar);
            return;
        }
        C69653n nVar = new C69653n(C69125c.m122230a(str, context), null, null, null, null, 62);
        String str2 = nVar.f155485g;
        if (str2 == null) {
            str2 = "";
        }
        nVar.mo109799a("content_url", str2);
        C89219l.m154716b("1862952583919182", "");
        nVar.mo109799a("fb_app_id", "1862952583919182");
        nVar.mo109799a("media_type", "video/mp4");
        a.mo61913a((AbstractC69645h) nVar, context);
        cVar.mo109610b("video_form");
        bVar.invoke(cVar);
    }
}
