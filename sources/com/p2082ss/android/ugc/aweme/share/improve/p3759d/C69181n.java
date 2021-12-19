package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.utils.C80312cr;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.n */
public final class C69181n implements AbstractC69184o {

    /* renamed from: a */
    public final AbstractC69581b f154665a;

    static {
        Covode.recordClassIndex(81495);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.n$b */
    static final class C69183b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f154669a;

        static {
            Covode.recordClassIndex(81497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69183b(AbstractC89172b bVar) {
            super(0);
            this.f154669a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f154669a.invoke(false);
            return C89391z.f203057a;
        }
    }

    public C69181n(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154665a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.n$a */
    static final class C69182a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69181n f154666a;

        /* renamed from: b */
        final /* synthetic */ Context f154667b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f154668c;

        static {
            Covode.recordClassIndex(81496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69182a(C69181n nVar, Context context, AbstractC89172b bVar) {
            super(1);
            this.f154666a = nVar;
            this.f154667b = context;
            this.f154668c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            AbstractC69581b bVar = this.f154666a.f154665a;
            Uri a = C80312cr.m139224a(this.f154667b, new File(str2));
            C89219l.m154716b(a, "");
            bVar.mo109552a(new C69653n(a, null, null, null, null, 62), this.f154667b);
            this.f154668c.invoke(true);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        C69157h.C69158a.m122260a(awemeSharePackage, this.f154665a.mo109548a(), context, new C69182a(this, context, bVar), new C69183b(bVar));
        awemeSharePackage.f155492i.putString("share_form", "video_form");
        return true;
    }
}
