package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3783a.C69659a;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage */
public final class DownloadedVideoSharePackage extends KtfDefaultSharePackage {

    /* renamed from: c */
    public static final C69214a f154716c = new C69214a((byte) 0);

    /* renamed from: a */
    public String f154717a;

    /* renamed from: b */
    public Aweme f154718b;

    static {
        Covode.recordClassIndex(81531);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage$a */
    public static final class C69214a {
        static {
            Covode.recordClassIndex(81532);
        }

        private C69214a() {
        }

        public /* synthetic */ C69214a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage
    /* renamed from: b */
    public final Aweme mo109575b() {
        Aweme aweme = this.f154718b;
        if (aweme == null) {
            C89219l.m154710a("aweme");
        }
        return aweme;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage$c */
    static final class C69217c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f154721a;

        static {
            Covode.recordClassIndex(81535);
        }

        C69217c(AbstractC89172b bVar) {
            this.f154721a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC89172b bVar = this.f154721a;
            C89219l.m154716b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadedVideoSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage$b */
    static final class C69215b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C69215b f154719a = new C69215b();

        static {
            Covode.recordClassIndex(81533);
        }

        C69215b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q() {
                /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage.C69215b.C692161 */

                static {
                    Covode.recordClassIndex(81534);
                }

                @Override // p4560f.p4561a.AbstractC88976q
                /* renamed from: a */
                public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
                    C89219l.m154721d(oVar, "");
                    String str = str;
                    C89219l.m154716b(str, "");
                    oVar.mo143049a(new C69650k(str, null, null, 6));
                }
            });
        }
    }

    /* renamed from: c */
    private static boolean m122324c(AbstractC69581b bVar) {
        AbstractC69581b a;
        if (!C89219l.m154714a((Object) bVar.mo109548a(), (Object) "facebook") || (a = C69583c.m122807a("facebook_story", null)) == null || a.mo109557b(C17867d.m33078a())) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final void mo109572a(AbstractC69581b bVar, AbstractC89172b<? super AbstractC69645h, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        if (C69659a.m123052a()) {
            if (m122324c(bVar)) {
                Aweme aweme = this.f154718b;
                if (aweme == null) {
                    C89219l.m154710a("aweme");
                }
                ShareInfo shareInfo = aweme.getShareInfo();
                C89219l.m154716b(shareInfo, "");
                String shareUrl = shareInfo.getShareUrl();
                C89219l.m154716b(shareUrl, "");
                C69125c.m122234b(shareUrl, this.f155487d, bVar).mo143237a(C69215b.f154719a).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69217c(bVar2));
                return;
            }
            String str = this.f154717a;
            if (str == null) {
                C89219l.m154710a("path");
            }
            Uri a = C69125c.m122230a(str, C17867d.m33078a());
            String str2 = this.f154717a;
            if (str2 == null) {
                C89219l.m154710a("path");
            }
            C69653n nVar = new C69653n(a, str2, null, null, null, 60);
            String str3 = nVar.f155485g;
            if (str3 == null) {
                str3 = "";
            }
            nVar.mo109799a("content_url", str3);
            C89219l.m154716b("1862952583919182", "");
            nVar.mo109799a("fb_app_id", "1862952583919182");
            nVar.mo109799a("media_type", "video/mp4");
            bVar2.invoke(nVar);
        } else if (m122324c(bVar)) {
            Aweme aweme2 = this.f154718b;
            if (aweme2 == null) {
                C89219l.m154710a("aweme");
            }
            ShareInfo shareInfo2 = aweme2.getShareInfo();
            C89219l.m154716b(shareInfo2, "");
            String shareUrl2 = shareInfo2.getShareUrl();
            C89219l.m154716b(shareUrl2, "");
            bVar2.invoke(new C69650k(C69125c.m122232a(shareUrl2, this.f155487d, bVar), null, null, 6));
        } else {
            String str4 = this.f154717a;
            if (str4 == null) {
                C89219l.m154710a("path");
            }
            Uri a2 = C69125c.m122230a(str4, C17867d.m33078a());
            String str5 = this.f154717a;
            if (str5 == null) {
                C89219l.m154710a("path");
            }
            C69653n nVar2 = new C69653n(a2, str5, null, null, null, 60);
            String str6 = nVar2.f155485g;
            if (str6 == null) {
                str6 = "";
            }
            nVar2.mo109799a("content_url", str6);
            C89219l.m154716b("1862952583919182", "");
            nVar2.mo109799a("fb_app_id", "1862952583919182");
            nVar2.mo109799a("media_type", "video/mp4");
            bVar2.invoke(nVar2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109573a(AbstractC69581b bVar, Context context, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        C68863ah.f154028b.mo109361a(bVar.mo109548a(), 0);
        return false;
    }
}
