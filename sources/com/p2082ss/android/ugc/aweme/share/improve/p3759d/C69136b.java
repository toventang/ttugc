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

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.b */
public final class C69136b implements AbstractC69184o {

    /* renamed from: a */
    public final AbstractC69581b f154584a;

    static {
        Covode.recordClassIndex(81450);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.b$a */
    public static final class C69137a implements C69157h.C69158a.AbstractC69159a {

        /* renamed from: a */
        final /* synthetic */ C69136b f154585a;

        /* renamed from: b */
        final /* synthetic */ AwemeSharePackage f154586b;

        /* renamed from: c */
        final /* synthetic */ Context f154587c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f154588d;

        static {
            Covode.recordClassIndex(81451);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.b$a$b */
        static final class C69139b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69137a f154590a;

            static {
                Covode.recordClassIndex(81453);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69139b(C69137a aVar) {
                super(0);
                this.f154590a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f154590a.f154588d.invoke(false);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: b */
        public final void mo109564b() {
            this.f154586b.f155492i.putString("share_form", "url_form");
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: a */
        public final void mo109563a() {
            C69157h.C69158a.m122260a(this.f154586b, this.f154585a.f154584a.mo109548a(), this.f154587c, new C69138a(this), new C69139b(this));
            this.f154586b.f155492i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.b$a$a */
        static final class C69138a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69137a f154589a;

            static {
                Covode.recordClassIndex(81452);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69138a(C69137a aVar) {
                super(1);
                this.f154589a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                String str2 = str;
                C89219l.m154721d(str2, "");
                AbstractC69581b bVar = this.f154589a.f154585a.f154584a;
                Uri a = C80312cr.m139224a(this.f154589a.f154587c, new File(str2));
                C89219l.m154716b(a, "");
                bVar.mo109552a(new C69653n(a, null, null, null, null, 62), this.f154589a.f154587c);
                this.f154589a.f154588d.invoke(true);
                return C89391z.f203057a;
            }
        }

        C69137a(C69136b bVar, AwemeSharePackage awemeSharePackage, Context context, AbstractC89172b bVar2) {
            this.f154585a = bVar;
            this.f154586b = awemeSharePackage;
            this.f154587c = context;
            this.f154588d = bVar2;
        }
    }

    public C69136b(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154584a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        if (!C69304c.m122503a(this.f154584a, true)) {
            return C69157h.C69158a.m122262a(context, awemeSharePackage, this.f154584a.mo109548a(), new C69137a(this, awemeSharePackage, context, bVar));
        }
        if (!C69157h.C69158a.m122263a(awemeSharePackage.mo109569a(), context)) {
            return true;
        }
        awemeSharePackage.f155492i.putString("share_form", "url_form");
        return false;
    }
}
