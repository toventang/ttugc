package com.p2082ss.android.ugc.aweme.share.silent.p3774a;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69050g;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.model.C69331c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69647i;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.a.h */
public final class C69440h implements AbstractC69431a {

    /* renamed from: a */
    public final AbstractC69581b f155122a;

    static {
        Covode.recordClassIndex(81778);
    }

    public C69440h(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f155122a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.a.h$a */
    static final class C69441a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C69440h f155123a;

        /* renamed from: b */
        final /* synthetic */ C69331c f155124b;

        /* renamed from: c */
        final /* synthetic */ String f155125c;

        /* renamed from: d */
        final /* synthetic */ Context f155126d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f155127e;

        /* renamed from: f */
        final /* synthetic */ Aweme f155128f;

        /* renamed from: g */
        final /* synthetic */ AwemeSharePackage f155129g;

        static {
            Covode.recordClassIndex(81779);
        }

        C69441a(C69440h hVar, C69331c cVar, String str, Context context, AbstractC89172b bVar, Aweme aweme, AwemeSharePackage awemeSharePackage) {
            this.f155123a = hVar;
            this.f155124b = cVar;
            this.f155125c = str;
            this.f155126d = context;
            this.f155127e = bVar;
            this.f155128f = aweme;
            this.f155129g = awemeSharePackage;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            C69331c cVar = this.f155124b;
            C89219l.m154716b(str, "");
            cVar.mo109609a(str);
            try {
                this.f155123a.f155122a.mo61913a((AbstractC69645h) new C69653n(C69125c.m122230a(this.f155125c, C17867d.m33078a()), this.f155125c, null, null, str, 28), this.f155126d);
                this.f155124b.mo109610b("video_form");
                this.f155127e.invoke(this.f155124b);
            } catch (C69647i e) {
                String message = e.getMessage();
                int hashCode = message.hashCode();
                if (hashCode != 1212011917) {
                    if (hashCode == 1703438795 && message.equals("video_too_long")) {
                        new C79459a(this.f155126d).mo123050a(R.string.h87).mo123053a();
                        new C69050g(this.f155128f, "", null, true, 0, PrivacyCert.Builder.Companion.with("bpea-100").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("postAndShareToSnapChatCaseVideTooLong").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 20).mo61915a(this.f155126d, this.f155129g);
                        this.f155124b.mo109610b("url_form");
                    }
                } else if (message.equals("file_too_large")) {
                    new C79459a(this.f155126d).mo123050a(R.string.aik).mo123053a();
                    new C69050g(this.f155128f, "", null, true, 0, PrivacyCert.Builder.Companion.with("bpea-99").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("postAndShareToSnapChatCaseFileTooLarge").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 20).mo61915a(this.f155126d, this.f155129g);
                    this.f155124b.mo109610b("url_form");
                }
                this.f155127e.invoke(this.f155124b);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.silent.p3774a.AbstractC69431a
    /* renamed from: a */
    public final void mo109696a(Context context, String str, C69331c cVar, AbstractC89172b<? super C69331c, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        File file = new File(str);
        Aweme aweme = cVar.f154901d;
        AwemeSharePackage a = AwemeSharePackage.C69206a.m122312a(aweme, context, 0, "", "");
        if (C69124b.m122225a(file)) {
            ShareInfo shareInfo = aweme.getShareInfo();
            C89219l.m154716b(shareInfo, "");
            String shareUrl = shareInfo.getShareUrl();
            C89219l.m154716b(shareUrl, "");
            C69125c.m122234b(shareUrl, "aweme", this.f155122a).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69441a(this, cVar, str, context, bVar, aweme, a));
            return;
        }
        C39162r.onEventV3("share_snapchat_oversized");
        new C79459a(context).mo123050a(R.string.aik).mo123053a();
        new C69050g(aweme, "", null, true, 0, PrivacyCert.Builder.Companion.with("bpea-101").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("postAndShareToSnapChatCaseOverSize").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 20).mo61915a(context, a);
        cVar.mo109610b("url_form");
        bVar.invoke(cVar);
    }
}
