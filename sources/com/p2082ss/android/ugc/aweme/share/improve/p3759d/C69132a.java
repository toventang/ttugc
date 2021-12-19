package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69304c;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69315h;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.a */
public final class C69132a implements AbstractC69184o {

    /* renamed from: a */
    public final AbstractC69581b f154577a;

    static {
        Covode.recordClassIndex(81446);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$a */
    public static final class C69133a implements C69157h.C69158a.AbstractC69159a {

        /* renamed from: a */
        final /* synthetic */ C69132a f154578a;

        /* renamed from: b */
        final /* synthetic */ AwemeSharePackage f154579b;

        /* renamed from: c */
        final /* synthetic */ Context f154580c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f154581d;

        static {
            Covode.recordClassIndex(81447);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$a$b */
        static final class C69135b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69133a f154583a;

            static {
                Covode.recordClassIndex(81449);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69135b(C69133a aVar) {
                super(0);
                this.f154583a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f154583a.f154581d.invoke(false);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: b */
        public final void mo109564b() {
            this.f154579b.f155492i.putString("share_form", "url_form");
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: a */
        public final void mo109563a() {
            C69157h.C69158a.m122260a(this.f154579b, this.f154578a.f154577a.mo109548a(), this.f154580c, new C69134a(this), new C69135b(this));
            this.f154579b.f155492i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$a$a */
        static final class C69134a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69133a f154582a;

            static {
                Covode.recordClassIndex(81448);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69134a(C69133a aVar) {
                super(1);
                this.f154582a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                String str2;
                String str3 = str;
                C89219l.m154721d(str3, "");
                if (C69315h.m122513a(this.f154582a.f154578a.f154577a, this.f154582a.f154579b.f155487d, 1)) {
                    str2 = this.f154582a.f154579b.f155490g;
                } else {
                    str2 = "";
                }
                String string = C17867d.m33078a().getString(R.string.gch);
                C89219l.m154716b(string, "");
                String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{this.f154582a.f154579b.f155492i.getString("author_name")}, 1));
                C89219l.m154716b(a, "");
                this.f154582a.f154578a.f154577a.mo109552a(new C69653n(C69125c.m122230a(str3, C17867d.m33078a()), null, str2, a, null, 42), this.f154582a.f154580c);
                this.f154582a.f154581d.invoke(true);
                return C89391z.f203057a;
            }
        }

        C69133a(C69132a aVar, AwemeSharePackage awemeSharePackage, Context context, AbstractC89172b bVar) {
            this.f154578a = aVar;
            this.f154579b = awemeSharePackage;
            this.f154580c = context;
            this.f154581d = bVar;
        }
    }

    public C69132a(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154577a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        if (!C69304c.m122503a(this.f154577a, false)) {
            return C69157h.C69158a.m122262a(context, awemeSharePackage, this.f154577a.mo109548a(), new C69133a(this, awemeSharePackage, context, bVar));
        }
        if (!C69157h.C69158a.m122263a(awemeSharePackage.mo109569a(), context)) {
            return true;
        }
        awemeSharePackage.f155492i.putString("share_form", "url_form");
        return false;
    }
}
