package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69304c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.c */
public final class C69140c implements AbstractC69184o {

    /* renamed from: a */
    public final AbstractC69581b f154591a;

    static {
        Covode.recordClassIndex(81454);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.c$a */
    public static final class C69141a implements C69157h.C69158a.AbstractC69159a {

        /* renamed from: a */
        final /* synthetic */ C69140c f154592a;

        /* renamed from: b */
        final /* synthetic */ AwemeSharePackage f154593b;

        /* renamed from: c */
        final /* synthetic */ Context f154594c;

        /* renamed from: d */
        final /* synthetic */ AbstractC69581b f154595d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f154596e;

        static {
            Covode.recordClassIndex(81455);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.c$a$b */
        static final class C69143b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69141a f154598a;

            static {
                Covode.recordClassIndex(81457);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69143b(C69141a aVar) {
                super(0);
                this.f154598a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f154598a.f154596e.invoke(false);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: b */
        public final void mo109564b() {
            this.f154593b.f155492i.putString("share_form", "url_form");
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: a */
        public final void mo109563a() {
            C69157h.C69158a.m122260a(this.f154593b, this.f154592a.f154591a.mo109548a(), this.f154594c, new C69142a(this), new C69143b(this));
            this.f154593b.f155492i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.c$a$a */
        static final class C69142a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69141a f154597a;

            static {
                Covode.recordClassIndex(81456);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69142a(C69141a aVar) {
                super(1);
                this.f154597a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                String str2 = str;
                C89219l.m154721d(str2, "");
                AbstractC69581b bVar = this.f154597a.f154595d;
                if (bVar != null) {
                    C69653n nVar = new C69653n(C69125c.m122230a(str2, this.f154597a.f154594c), null, null, null, null, 62);
                    String str3 = nVar.f155485g;
                    if (str3 == null) {
                        str3 = "";
                    }
                    nVar.mo109799a("content_url", str3);
                    C89219l.m154716b("1862952583919182", "");
                    nVar.mo109799a("fb_app_id", "1862952583919182");
                    nVar.mo109799a("media_type", "video/mp4");
                    bVar.mo61913a((AbstractC69645h) nVar, this.f154597a.f154594c);
                }
                this.f154597a.f154596e.invoke(true);
                return C89391z.f203057a;
            }
        }

        C69141a(C69140c cVar, AwemeSharePackage awemeSharePackage, Context context, AbstractC69581b bVar, AbstractC89172b bVar2) {
            this.f154592a = cVar;
            this.f154593b = awemeSharePackage;
            this.f154594c = context;
            this.f154595d = bVar;
            this.f154596e = bVar2;
        }
    }

    public C69140c(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154591a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        AbstractC69581b a = C69583c.m122807a("facebook_story", null);
        if (!C69304c.m122503a(this.f154591a, false) && a != null && a.mo109557b(context)) {
            return C69157h.C69158a.m122262a(context, awemeSharePackage, this.f154591a.mo109548a(), new C69141a(this, awemeSharePackage, context, a, bVar));
        }
        if (!C69157h.C69158a.m122263a(awemeSharePackage.mo109569a(), context)) {
            return true;
        }
        awemeSharePackage.f155492i.putString("share_form", "url_form");
        return false;
    }
}
