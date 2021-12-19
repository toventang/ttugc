package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69304c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.g */
public final class C69153g implements AbstractC69184o {

    /* renamed from: a */
    public final AbstractC69581b f154616a;

    static {
        Covode.recordClassIndex(81467);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.g$a */
    public static final class C69154a implements C69157h.C69158a.AbstractC69159a {

        /* renamed from: a */
        final /* synthetic */ C69153g f154617a;

        /* renamed from: b */
        final /* synthetic */ AwemeSharePackage f154618b;

        /* renamed from: c */
        final /* synthetic */ Context f154619c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f154620d;

        static {
            Covode.recordClassIndex(81468);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.g$a$b */
        static final class C69156b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69154a f154622a;

            static {
                Covode.recordClassIndex(81470);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69156b(C69154a aVar) {
                super(0);
                this.f154622a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f154622a.f154620d.invoke(false);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: b */
        public final void mo109564b() {
            this.f154618b.f155492i.putString("share_form", "url_form");
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: a */
        public final void mo109563a() {
            C69157h.C69158a.m122260a(this.f154618b, this.f154617a.f154616a.mo109548a(), this.f154619c, new C69155a(this), new C69156b(this));
            this.f154618b.f155492i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.g$a$a */
        static final class C69155a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69154a f154621a;

            static {
                Covode.recordClassIndex(81469);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69155a(C69154a aVar) {
                super(1);
                this.f154621a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                String str2 = str;
                C89219l.m154721d(str2, "");
                this.f154621a.f154617a.f154616a.mo109552a(new C69653n(C69125c.m122230a(str2, C17867d.m33078a()), null, null, null, null, 62), this.f154621a.f154619c);
                this.f154621a.f154620d.invoke(true);
                return C89391z.f203057a;
            }
        }

        C69154a(C69153g gVar, AwemeSharePackage awemeSharePackage, Context context, AbstractC89172b bVar) {
            this.f154617a = gVar;
            this.f154618b = awemeSharePackage;
            this.f154619c = context;
            this.f154620d = bVar;
        }
    }

    public C69153g(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154616a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        if (!C69304c.m122503a(this.f154616a, true)) {
            return C69157h.C69158a.m122262a(context, awemeSharePackage, this.f154616a.mo109548a(), new C69154a(this, awemeSharePackage, context, bVar));
        }
        if (!C69157h.C69158a.m122263a(awemeSharePackage.mo109569a(), context)) {
            return true;
        }
        awemeSharePackage.f155492i.putString("share_form", "url_form");
        return false;
    }
}
