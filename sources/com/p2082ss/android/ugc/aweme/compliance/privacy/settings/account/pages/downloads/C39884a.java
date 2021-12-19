package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39252m;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.C39745b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a */
public final class C39884a extends AbstractC39856a<DownloadsViewModel> {
    static {
        Covode.recordClassIndex(47623);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return "download";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: d */
    public final String mo69151d() {
        String d = super.mo69151d();
        if (d != null) {
            return d;
        }
        if (C39631a.m80486b()) {
            return this.f93566d.getString(R.string.c_b);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: b */
    public final void mo69149b(int i) {
        if (C39631a.m80486b()) {
            C39745b.C39746a.m80626a(3);
        }
        super.mo69149b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$a */
    static final class C39887a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39884a f93844a;

        /* renamed from: b */
        final /* synthetic */ int f93845b;

        static {
            Covode.recordClassIndex(47626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39887a(C39884a aVar, int i) {
            super(1);
            this.f93844a = aVar;
            this.f93845b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37418b(R.string.bbi, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.C39884a.C39887a.C398881 */

                /* renamed from: a */
                final /* synthetic */ C39887a f93846a;

                static {
                    Covode.recordClassIndex(47627);
                }

                {
                    this.f93846a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f93846a.f93844a.mo69149b(this.f93846a.f93845b);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37416a(R.string.bbh, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: a */
    public final boolean mo69147a(int i) {
        if (i != 3) {
            C89219l.m154721d("download_setting_change_young", "");
            C39252m a = C39659b.m80536a("download_setting_change_young");
            if (a != null && a.f92732a == 1) {
                C23028c.m43435a((C23023b) new C23023b(this.f93566d).mo37479a(R.string.bbk).mo37483b(R.string.bbj), new C39887a(this, i)).mo37405a().mo37396b().show();
                C39659b.m80541b("download_setting_change_young");
                return true;
            }
        }
        return super.mo69147a(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39884a(com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.DownloadsViewModel r4, androidx.fragment.app.Fragment r5) {
        /*
            r3 = this;
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r1)
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r1)
            android.content.Context r0 = r5.getContext()
            if (r0 != 0) goto L_0x0011
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0011:
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r3.<init>(r4, r0)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r1 = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g
            r1.<init>()
            r0 = 1
            r2 = 0
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r1 = r3.mo69146a(r1, r2, r0)
            r0 = 2131823444(0x7f110b54, float:1.9279688E38)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r1 = r1.mo69156a(r0)
            r0 = 2131823443(0x7f110b53, float:1.9279686E38)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r1 = r1.mo69162b(r0)
            r0 = 3
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g r0 = r1.mo69157a(r2, r0)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.f r0 = r0.mo69155a()
            r3.mo69093a(r0)
            androidx.lifecycle.t<java.lang.Integer> r1 = r4.f93798d
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$1 r0 = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$1
            r0.<init>(r3)
            r1.observe(r5, r0)
            androidx.lifecycle.t<java.lang.Boolean> r1 = r4.f93799e
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$2 r0 = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.a$2
            r0.<init>(r3)
            r1.observe(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.C39884a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads.DownloadsViewModel, androidx.fragment.app.Fragment):void");
    }
}
