package com.p2082ss.android.ugc.aweme.share.improve.p3759d;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69050g;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69157h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69315h;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69647i;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.j */
public final class C69167j implements AbstractC69184o {

    /* renamed from: b */
    public static final C69168a f154640b = new C69168a((byte) 0);

    /* renamed from: a */
    public final AbstractC69581b f154641a;

    static {
        Covode.recordClassIndex(81481);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.j$a */
    public static final class C69168a {
        static {
            Covode.recordClassIndex(81482);
        }

        private C69168a() {
        }

        public /* synthetic */ C69168a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.j$c */
    static final class C69171c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f154649a;

        static {
            Covode.recordClassIndex(81485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69171c(AbstractC89172b bVar) {
            super(0);
            this.f154649a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f154649a.invoke(false);
            return C89391z.f203057a;
        }
    }

    public C69167j(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        this.f154641a = bVar;
    }

    /* renamed from: a */
    public static void m122277a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oversize_cause", str);
            C39162r.m79461a("share_snapchat_oversized", jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.j$b */
    static final class C69169b extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C69167j f154642a;

        /* renamed from: b */
        final /* synthetic */ AwemeSharePackage f154643b;

        /* renamed from: c */
        final /* synthetic */ Context f154644c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f154645d;

        static {
            Covode.recordClassIndex(81483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69169b(C69167j jVar, AwemeSharePackage awemeSharePackage, Context context, AbstractC89172b bVar) {
            super(1);
            this.f154642a = jVar;
            this.f154643b = awemeSharePackage;
            this.f154644c = context;
            this.f154645d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            final String str2 = str;
            C89219l.m154721d(str2, "");
            File file = new File(str2);
            final String a = C69315h.f154879a.mo109599a(this.f154642a.f154641a, this.f154643b.f155487d, this.f154643b.f155490g);
            if (C69124b.m122225a(file)) {
                C69125c.m122234b(this.f154643b.f155491h, this.f154643b.f155487d, this.f154642a.f154641a).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.share.improve.p3759d.C69167j.C69169b.C691701 */

                    /* renamed from: a */
                    final /* synthetic */ C69169b f154646a;

                    static {
                        Covode.recordClassIndex(81484);
                    }

                    {
                        this.f154646a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        String str = (String) obj;
                        try {
                            this.f154646a.f154642a.f154641a.mo61913a((AbstractC69645h) new C69653n(C69125c.m122230a(str2, C17867d.m33078a()), str2, null, null, str, 28), this.f154646a.f154644c);
                            this.f154646a.f154643b.f155492i.putString("share_form", "video_form");
                            this.f154646a.f154643b.f155492i.putString("share_url", str);
                        } catch (C69647i e) {
                            String message = e.getMessage();
                            int hashCode = message.hashCode();
                            if (hashCode != 1212011917) {
                                if (hashCode == 1703438795 && message.equals("video_too_long")) {
                                    C69167j.m122277a("60S");
                                    new C79459a(this.f154646a.f154644c).mo123050a(R.string.h87).mo123053a();
                                    new C69050g(this.f154646a.f154643b.mo109569a(), null, a, true, 0, PrivacyCert.Builder.Companion.with("bpea-97").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("shareViewToSnapChatCaseVideoTooLong").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 18).mo61915a(this.f154646a.f154644c, this.f154646a.f154643b);
                                    this.f154646a.f154643b.f155492i.putString("share_form", "url_form");
                                    this.f154646a.f154643b.f155492i.putString("share_url", str);
                                }
                            } else if (message.equals("file_too_large")) {
                                C69167j.m122277a("100M");
                                new C79459a(this.f154646a.f154644c).mo123050a(R.string.aik).mo123053a();
                                new C69050g(this.f154646a.f154643b.mo109569a(), null, a, true, 0, PrivacyCert.Builder.Companion.with("bpea-94").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("shareVideoToSnapChatCaseFileTooLarge").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 18).mo61915a(this.f154646a.f154644c, this.f154646a.f154643b);
                                this.f154646a.f154643b.f155492i.putString("share_form", "url_form");
                                this.f154646a.f154643b.f155492i.putString("share_url", str);
                            }
                        }
                    }
                });
            } else {
                C69167j.m122277a("100M");
                new C79459a(this.f154644c).mo123050a(R.string.aik).mo123053a();
                new C69050g(this.f154643b.mo109569a(), null, a, true, 0, PrivacyCert.Builder.Companion.with("bpea-98").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("shareVideoToSnapChatCaseOverSize").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build(), 18).mo61915a(this.f154644c, this.f154643b);
                this.f154643b.f155492i.putString("share_form", "url_form");
            }
            this.f154645d.invoke(true);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3759d.AbstractC69184o
    /* renamed from: a */
    public final boolean mo109562a(Context context, AwemeSharePackage awemeSharePackage, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(awemeSharePackage, "");
        C89219l.m154721d(bVar, "");
        C69157h.C69158a.m122260a(awemeSharePackage, this.f154641a.mo109548a(), context, new C69169b(this, awemeSharePackage, context, bVar), new C69171c(bVar));
        return true;
    }
}
