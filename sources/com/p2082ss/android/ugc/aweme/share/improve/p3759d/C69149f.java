package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69304c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.utils.C80312cr;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.f */
public final class C69149f implements AbstractC69184o {

    /* renamed from: a */
    public final AbstractC69581b f154609a;

    static {
        Covode.recordClassIndex(81463);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.f$a */
    public static final class C69150a implements C69157h.C69158a.AbstractC69159a {

        /* renamed from: a */
        final /* synthetic */ C69149f f154610a;

        /* renamed from: b */
        final /* synthetic */ AwemeSharePackage f154611b;

        /* renamed from: c */
        final /* synthetic */ Context f154612c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f154613d;

        static {
            Covode.recordClassIndex(81464);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.f$a$b */
        static final class C69152b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69150a f154615a;

            static {
                Covode.recordClassIndex(81466);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69152b(C69150a aVar) {
                super(0);
                this.f154615a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f154615a.f154613d.invoke(false);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: b */
        public final void mo109564b() {
            this.f154611b.f155492i.putString("share_form", "url_form");
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: a */
        public final void mo109563a() {
            C69157h.C69158a.m122260a(this.f154611b, this.f154610a.f154609a.mo109548a(), this.f154612c, new C69151a(this), new C69152b(this));
            this.f154611b.f155492i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.f$a$a */
        static final class C69151a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69150a f154614a;

            static {
                Covode.recordClassIndex(81465);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69151a(C69150a aVar) {
                super(1);
                this.f154614a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                String str2 = str;
                C89219l.m154721d(str2, "");
                AbstractC69581b bVar = this.f154614a.f154610a.f154609a;
                Uri a = C80312cr.m139224a(this.f154614a.f154612c, new File(str2));
                C89219l.m154716b(a, "");
                bVar.mo109552a(new C69653n(a, null, null, null, null, 62), this.f154614a.f154612c);
                this.f154614a.f154613d.invoke(true);
                return C89391z.f203057a;
            }
        }

        C69150a(C69149f fVar, AwemeSharePackage awemeSharePackage, Context context, AbstractC89172b bVar) {
            this.f154610a = fVar;
            this.f154611b = awemeSharePackage;
            this.f154612c = context;
            this.f154613d = bVar;
        }
    }

    public C69149f(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154609a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        if (!C69304c.m122503a(this.f154609a, true)) {
            return C69157h.C69158a.m122262a(context, awemeSharePackage, this.f154609a.mo109548a(), new C69150a(this, awemeSharePackage, context, bVar));
        }
        if (!C69157h.C69158a.m122263a(awemeSharePackage.mo109569a(), context)) {
            return true;
        }
        awemeSharePackage.f155492i.putString("share_form", "url_form");
        return false;
    }
}
