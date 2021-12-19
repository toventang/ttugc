package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.utils.C80312cr;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.d */
public final class C69144d implements AbstractC69184o {

    /* renamed from: a */
    public final AbstractC69581b f154599a;

    static {
        Covode.recordClassIndex(81458);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.d$a */
    public static final class C69145a implements AbstractC49927b {

        /* renamed from: a */
        final /* synthetic */ C69144d f154600a;

        /* renamed from: b */
        final /* synthetic */ AwemeSharePackage f154601b;

        /* renamed from: c */
        final /* synthetic */ Context f154602c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f154603d;

        static {
            Covode.recordClassIndex(81459);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
        /* renamed from: a */
        public final void mo84975a() {
            this.f154603d.invoke(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
        /* renamed from: a */
        public final void mo84976a(String str) {
            AbstractC69581b bVar = this.f154600a.f154599a;
            Uri a = C80312cr.m139224a(this.f154602c, new File(str));
            C89219l.m154716b(a, "");
            bVar.mo109552a(new C69653n(a, null, null, null, null, 62), this.f154602c);
            this.f154603d.invoke(true);
        }

        C69145a(C69144d dVar, AwemeSharePackage awemeSharePackage, Context context, AbstractC89172b bVar) {
            this.f154600a = dVar;
            this.f154601b = awemeSharePackage;
            this.f154602c = context;
            this.f154603d = bVar;
        }
    }

    public C69144d(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154599a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        String str = "";
        C89219l.m154721d(context, str);
        C89219l.m154721d(awemeSharePackage, str);
        C89219l.m154721d(bVar, str);
        Activity a = C69124b.m122223a(context);
        if (a != null) {
            Aweme a2 = awemeSharePackage.mo109569a();
            int i = awemeSharePackage.f155492i.getInt("page_type");
            String a3 = this.f154599a.mo109548a();
            C69145a aVar = new C69145a(this, awemeSharePackage, context, bVar);
            String string = awemeSharePackage.f155492i.getString("enter_from");
            if (string != null) {
                str = string;
            }
            C69157h.C69158a.m122259a(a, a2, true, i, a3, aVar, str);
        }
        awemeSharePackage.f155492i.putString("share_form", "video_form");
        return true;
    }
}
