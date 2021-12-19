package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3748f.C68925b;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69304c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.utils.C80312cr;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.m */
public final class C69176m implements AbstractC69184o {

    /* renamed from: a */
    public final AbstractC69581b f154655a;

    static {
        Covode.recordClassIndex(81490);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.m$a */
    public static final class C69177a implements C69157h.C69158a.AbstractC69159a {

        /* renamed from: a */
        final /* synthetic */ C69176m f154656a;

        /* renamed from: b */
        final /* synthetic */ Context f154657b;

        /* renamed from: c */
        final /* synthetic */ AwemeSharePackage f154658c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f154659d;

        static {
            Covode.recordClassIndex(81491);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.m$a$b */
        static final class C69180b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69177a f154664a;

            static {
                Covode.recordClassIndex(81494);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69180b(C69177a aVar) {
                super(0);
                this.f154664a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f154664a.f154659d.invoke(false);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: b */
        public final void mo109564b() {
            this.f154658c.f155492i.putString("share_form", "url_form");
        }

        @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h.C69158a.AbstractC69159a
        /* renamed from: a */
        public final void mo109563a() {
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = C68925b.m121620b() ? (T) this.f154657b.getString(R.string.l5) : C68925b.m121621c() ? (T) this.f154657b.getString(R.string.l6) : C68925b.m121622d() ? (T) this.f154657b.getString(R.string.l7) : null;
            C69157h.C69158a.m122260a(this.f154658c, this.f154656a.f154655a.mo109548a(), this.f154657b, new C69178a(this, eVar), new C69180b(this));
            this.f154658c.f155492i.putString("share_form", "video_form");
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.m$a$a */
        static final class C69178a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69177a f154660a;

            /* renamed from: b */
            final /* synthetic */ C89233z.C89238e f154661b;

            static {
                Covode.recordClassIndex(81492);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69178a(C69177a aVar, C89233z.C89238e eVar) {
                super(1);
                this.f154660a = aVar;
                this.f154661b = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                final String str2 = str;
                C89219l.m154721d(str2, "");
                if (C69304c.m122502a(this.f154660a.f154656a.f154655a)) {
                    this.f154660a.f154658c.mo109572a(this.f154660a.f154656a.f154655a, new AbstractC89172b<AbstractC69645h, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69176m.C69177a.C69178a.C691791 */

                        /* renamed from: a */
                        final /* synthetic */ C69178a f154662a;

                        static {
                            Covode.recordClassIndex(81493);
                        }

                        {
                            this.f154662a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(AbstractC69645h hVar) {
                            AbstractC69645h hVar2 = hVar;
                            C89219l.m154721d(hVar2, "");
                            String str = ((C69650k) hVar2).f155470b;
                            this.f154662a.f154661b.element = (T) (((String) this.f154662a.f154661b.element) + ' ' + str);
                            AbstractC69581b bVar = this.f154662a.f154660a.f154656a.f154655a;
                            Uri a = C80312cr.m139224a(this.f154662a.f154660a.f154657b, new File(str2));
                            C89219l.m154716b(a, "");
                            bVar.mo109552a(new C69653n(a, null, this.f154662a.f154661b.element, null, null, 58), this.f154662a.f154660a.f154657b);
                            return C89391z.f203057a;
                        }
                    });
                } else {
                    AbstractC69581b bVar = this.f154660a.f154656a.f154655a;
                    Uri a = C80312cr.m139224a(this.f154660a.f154657b, new File(str2));
                    C89219l.m154716b(a, "");
                    bVar.mo109552a(new C69653n(a, null, this.f154661b.element, null, null, 58), this.f154660a.f154657b);
                }
                this.f154660a.f154659d.invoke(true);
                return C89391z.f203057a;
            }
        }

        C69177a(C69176m mVar, Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b bVar) {
            this.f154656a = mVar;
            this.f154657b = context;
            this.f154658c = awemeSharePackage;
            this.f154659d = bVar;
        }
    }

    public C69176m(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154655a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        if (!C69304c.m122503a(this.f154655a, false)) {
            return C69157h.C69158a.m122262a(context, awemeSharePackage, this.f154655a.mo109548a(), new C69177a(this, context, awemeSharePackage, bVar));
        }
        if (!C69157h.C69158a.m122263a(awemeSharePackage.mo109569a(), context)) {
            return true;
        }
        awemeSharePackage.f155492i.putString("share_form", "url_form");
        return false;
    }
}
