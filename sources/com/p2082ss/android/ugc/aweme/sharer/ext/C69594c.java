package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.facebook.C24872m;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.share.p1908a.C24919a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.sharer.ext.p3780a.C69588a;
import com.p2082ss.android.ugc.aweme.sharer.ext.p3781b.C69592a;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.c */
public final class C69594c extends AbstractC69574a {

    /* renamed from: a */
    private final AbstractC69575a f155432a;

    static {
        Covode.recordClassIndex(81966);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "facebook";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return "Facebook";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: b */
    public final boolean mo109557b(Context context) {
        C89219l.m154721d(context, "");
        return true;
    }

    /* renamed from: e */
    private final void m122892e() {
        if (C24872m.m47685a()) {
            return;
        }
        if (this.f155432a.mo81451a() == null) {
            C24872m.m47684a(C17867d.m33078a());
        } else {
            C24872m.m47684a(this.f155432a.mo81451a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.c$a */
    static final class C69595a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69595a f155433a = new C69595a();

        static {
            Covode.recordClassIndex(81967);
        }

        C69595a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_facebook_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69595a.f155433a).mo37368a(context);
        }
        return null;
    }

    public C69594c(AbstractC69575a aVar) {
        C89219l.m154721d(aVar, "");
        this.f155432a = aVar;
        if (!C69588a.m122881a() && !C24872m.m47685a()) {
            if (aVar.mo81451a() == null) {
                C24872m.m47684a(C17867d.m33078a());
            } else {
                C24872m.m47684a(aVar.mo81451a());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: a */
    public final boolean mo61913a(AbstractC69645h hVar, Context context) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        m122892e();
        if (C69592a.C69593a.m122891a(this.f155432a.mo81451a())) {
            return false;
        }
        return super.mo61913a(hVar, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: a */
    public final boolean mo109554a(C69650k kVar, Context context) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(context, "");
        m122892e();
        if (C69592a.C69593a.m122891a(this.f155432a.mo81451a())) {
            return false;
        }
        ShareLinkContent.C24977a aVar = new ShareLinkContent.C24977a();
        aVar.f59243a = Uri.parse(kVar.f155470b);
        aVar.f59259k = kVar.f155479e;
        ShareLinkContent shareLinkContent = new ShareLinkContent(aVar, (byte) 0);
        C24919a aVar2 = new C24919a(this.f155432a.mo81451a());
        if (!aVar2.mo40577a((Object) shareLinkContent)) {
            return false;
        }
        aVar2.mo40579b(shareLinkContent);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109550a(C69651l lVar, Context context) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(context, "");
        m122892e();
        if (C69592a.C69593a.m122891a(this.f155432a.mo81451a())) {
            return false;
        }
        SharePhoto.C24995a aVar = new SharePhoto.C24995a();
        aVar.f59296c = lVar.f155472b;
        SharePhotoContent a = new SharePhotoContent.C24997a().mo40881a(aVar.mo40878a()).mo40884a();
        C24919a aVar2 = new C24919a(this.f155432a.mo81451a());
        if (!aVar2.mo40577a((Object) a)) {
            return false;
        }
        aVar2.mo40579b(a);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        m122892e();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109552a(C69653n nVar, Context context) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(context, "");
        m122892e();
        if (C69592a.C69593a.m122891a(this.f155432a.mo81451a())) {
            return false;
        }
        ShareVideo.C25000a aVar = new ShareVideo.C25000a();
        aVar.f59306b = nVar.f155480b;
        ShareVideoContent shareVideoContent = new ShareVideoContent(new ShareVideoContent.C25002a().mo40894a(aVar.mo40891a()), (byte) 0);
        C24919a aVar2 = new C24919a(this.f155432a.mo81451a());
        if (!aVar2.mo40577a((Object) shareVideoContent)) {
            return false;
        }
        aVar2.mo40579b(shareVideoContent);
        return true;
    }
}
