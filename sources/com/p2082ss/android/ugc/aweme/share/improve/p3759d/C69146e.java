package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.e */
public final class C69146e implements AbstractC69184o {

    /* renamed from: a */
    public final AbstractC69581b f154604a;

    static {
        Covode.recordClassIndex(81460);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.e$b */
    static final class C69148b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f154608a;

        static {
            Covode.recordClassIndex(81462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69148b(AbstractC89172b bVar) {
            super(0);
            this.f154608a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f154608a.invoke(false);
            return C89391z.f203057a;
        }
    }

    public C69146e(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154604a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.e$a */
    static final class C69147a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69146e f154605a;

        /* renamed from: b */
        final /* synthetic */ Context f154606b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f154607c;

        static {
            Covode.recordClassIndex(81461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69147a(C69146e eVar, Context context, AbstractC89172b bVar) {
            super(1);
            this.f154605a = eVar;
            this.f154606b = context;
            this.f154607c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            String str3 = "";
            C89219l.m154721d(str2, str3);
            AbstractC69581b bVar = this.f154605a.f154604a;
            C69653n nVar = new C69653n(C69125c.m122230a(str2, C17867d.m33078a()), null, null, null, null, 62);
            String str4 = nVar.f155485g;
            if (str4 != null) {
                str3 = str4;
            }
            nVar.mo109799a("content_url", str3);
            nVar.mo109799a("media_type", "video/mp4");
            bVar.mo109552a(nVar, this.f154606b);
            this.f154607c.invoke(true);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        C69157h.C69158a.m122260a(awemeSharePackage, this.f154604a.mo109548a(), context, new C69147a(this, context, bVar), new C69148b(bVar));
        awemeSharePackage.f155492i.putString("share_form", "video_form");
        return true;
    }
}
