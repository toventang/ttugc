package com.p2082ss.android.ugc.aweme.share.silent.p3774a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.model.C69331c;
import com.p2082ss.android.ugc.aweme.share.p3748f.C68925b;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69304c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.share.silent.a.i */
public final class C69442i implements AbstractC69431a {

    /* renamed from: a */
    public final AbstractC69581b f155130a;

    static {
        Covode.recordClassIndex(81780);
    }

    public C69442i(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f155130a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.a.i$a */
    static final class C69443a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C69442i f155131a;

        /* renamed from: b */
        final /* synthetic */ C69331c f155132b;

        /* renamed from: c */
        final /* synthetic */ Context f155133c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f155134d;

        static {
            Covode.recordClassIndex(81781);
        }

        C69443a(C69442i iVar, C69331c cVar, Context context, AbstractC89172b bVar) {
            this.f155131a = iVar;
            this.f155132b = cVar;
            this.f155133c = context;
            this.f155134d = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            C69331c cVar = this.f155132b;
            C89219l.m154716b(str, "");
            cVar.mo109609a(str);
            this.f155131a.f155130a.mo109554a(new C69650k(this.f155132b.f154899b, null, null, 6), this.f155133c);
            this.f155132b.mo109610b("url_form");
            this.f155134d.invoke(this.f155132b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.a.i$b */
    static final class C69444b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C69442i f155135a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f155136b;

        /* renamed from: c */
        final /* synthetic */ String f155137c;

        /* renamed from: d */
        final /* synthetic */ Context f155138d;

        /* renamed from: e */
        final /* synthetic */ C69331c f155139e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f155140f;

        static {
            Covode.recordClassIndex(81782);
        }

        C69444b(C69442i iVar, C89233z.C89238e eVar, String str, Context context, C69331c cVar, AbstractC89172b bVar) {
            this.f155135a = iVar;
            this.f155136b = eVar;
            this.f155137c = str;
            this.f155138d = context;
            this.f155139e = cVar;
            this.f155140f = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f155136b.element = (T) (((String) this.f155136b.element) + ' ' + ((String) obj));
            AbstractC69581b bVar = this.f155135a.f155130a;
            C69653n nVar = new C69653n(C69125c.m122230a(this.f155137c, this.f155138d), this.f155137c, this.f155136b.element, null, null, 56);
            String str = nVar.f155485g;
            if (str == null) {
                str = "";
            }
            nVar.mo109799a("content_url", str);
            nVar.mo109799a("media_type", "video/mp4");
            bVar.mo109552a(nVar, this.f155138d);
            this.f155139e.mo109610b("video_form");
            this.f155140f.invoke(this.f155139e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.p3774a.AbstractC69431a
    /* renamed from: a */
    public final void mo109696a(Context context, String str, C69331c cVar, AbstractC89172b<? super C69331c, C89391z> bVar) {
        String str2 = "";
        C89219l.m154721d(context, str2);
        C89219l.m154721d(str, str2);
        C89219l.m154721d(cVar, str2);
        C89219l.m154721d(bVar, str2);
        boolean z = true;
        if (C16048b.m29633a().mo25412a(true, "whatsapp_share_type", 0) != 1) {
            z = false;
        }
        if (z || C68925b.m121619a()) {
            ShareInfo shareInfo = cVar.f154901d.getShareInfo();
            C89219l.m154716b(shareInfo, str2);
            String shareUrl = shareInfo.getShareUrl();
            C89219l.m154716b(shareUrl, str2);
            C69125c.m122234b(shareUrl, "aweme", this.f155130a).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69443a(this, cVar, context, bVar));
            return;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = C68925b.m121620b() ? (T) context.getString(R.string.l5) : C68925b.m121621c() ? (T) context.getString(R.string.l6) : C68925b.m121622d() ? (T) context.getString(R.string.l7) : null;
        if (C69304c.m122502a(this.f155130a)) {
            ShareInfo shareInfo2 = cVar.f154901d.getShareInfo();
            C89219l.m154716b(shareInfo2, str2);
            String shareUrl2 = shareInfo2.getShareUrl();
            C89219l.m154716b(shareUrl2, str2);
            C69125c.m122234b(shareUrl2, "aweme", this.f155130a).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69444b(this, eVar, str, context, cVar, bVar));
            return;
        }
        AbstractC69581b bVar2 = this.f155130a;
        C69653n nVar = new C69653n(C69125c.m122230a(str, context), str, null, null, null, 60);
        String str3 = nVar.f155485g;
        if (str3 != null) {
            str2 = str3;
        }
        nVar.mo109799a("content_url", str2);
        nVar.mo109799a("media_type", "video/mp4");
        bVar2.mo109552a(nVar, context);
        cVar.mo109610b("video_form");
        bVar.invoke(cVar);
    }
}
