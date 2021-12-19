package com.p2082ss.android.ugc.aweme.share.p3767m;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.experiment.C46970ge;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.C68869al;
import com.p2082ss.android.ugc.aweme.share.EnumC69509z;
import com.p2082ss.android.ugc.aweme.share.ShortenUrlApi;
import com.p2082ss.android.ugc.aweme.share.model.C69330b;
import com.p2082ss.android.ugc.aweme.share.model.ShortenModel;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.m.l */
public final class C69320l {

    /* renamed from: a */
    static final Map<String, EnumC69509z> f154885a = C89041ag.m154421a(C89387v.m154943a("aweme", EnumC69509z.ShareVideo), C89387v.m154943a("user", EnumC69509z.ShareUser), C89387v.m154943a("challenge", EnumC69509z.ShareChallenge), C89387v.m154943a("music", EnumC69509z.ShareMusic), C89387v.m154943a("sticker", EnumC69509z.ShareStickers), C89387v.m154943a("live", EnumC69509z.ShareLive), C89387v.m154943a("qna", EnumC69509z.ShareQA), C89387v.m154943a("invite_friends", EnumC69509z.ShareInviteFriends), C89387v.m154943a("group", EnumC69509z.ShareGroupChat), C89387v.m154943a("search", EnumC69509z.ShareSearch));

    /* renamed from: b */
    public static final C69320l f154886b = new C69320l();

    private C69320l() {
    }

    static {
        Covode.recordClassIndex(81650);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.m.l$b */
    public static final class C69322b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f154888a;

        static {
            Covode.recordClassIndex(81652);
        }

        C69322b(String str) {
            this.f154888a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return this.f154888a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.m.l$d */
    public static final class C69324d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C69324d f154890a = new C69324d();

        static {
            Covode.recordClassIndex(81654);
        }

        C69324d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.m.l$h */
    public static final class C69328h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f154896a;

        static {
            Covode.recordClassIndex(81658);
        }

        C69328h(String str) {
            this.f154896a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return this.f154896a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.m.l$c */
    public static final class C69323c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C69323c f154889a = new C69323c();

        static {
            Covode.recordClassIndex(81653);
        }

        C69323c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C69330b bVar = (C69330b) obj;
            C89219l.m154721d(bVar, "");
            return bVar.f154897a;
        }
    }

    /* renamed from: a */
    private static void m122519a(String str) {
        C68863ah.f154028b.mo109359a(C17867d.m33078a(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.m.l$a */
    public static final class C69321a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C69321a f154887a = new C69321a();

        static {
            Covode.recordClassIndex(81651);
        }

        C69321a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            ShortenModel shortenModel = (ShortenModel) obj;
            C89219l.m154721d(shortenModel, "");
            if (C46970ge.f109462a) {
                return shortenModel.getData();
            }
            return shortenModel.getShortenUrl();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.m.l$e */
    public static final class C69325e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f154891a;

        static {
            Covode.recordClassIndex(81655);
        }

        C69325e(String str) {
            this.f154891a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            C29844g gVar = new C29844g(this.f154891a);
            gVar.mo52130a("checksum", str);
            return gVar.mo52126a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.m.l$g */
    public static final class C69327g<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C69327g f154895a = new C69327g();

        static {
            Covode.recordClassIndex(81657);
        }

        C69327g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            ShortenModel shortenModel = (ShortenModel) obj;
            C89219l.m154721d(shortenModel, "");
            if (C46970ge.f109462a) {
                return shortenModel.getData();
            }
            return shortenModel.getShortenUrl();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.m.l$f */
    public static final class C69326f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f154892a;

        /* renamed from: b */
        final /* synthetic */ String f154893b;

        /* renamed from: c */
        final /* synthetic */ String f154894c;

        static {
            Covode.recordClassIndex(81656);
        }

        C69326f(String str, String str2, String str3) {
            this.f154892a = str;
            this.f154893b = str2;
            this.f154894c = str3;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            if (C46970ge.f109462a) {
                AbstractC88973n<ShortenModel> a = ShortenUrlApi.m121478a(str, "trill");
                C89219l.m154716b(a, "");
                return a;
            }
            EnumC69509z zVar = C69320l.f154885a.get(this.f154892a);
            if (zVar == null) {
                zVar = EnumC69509z.ShareDefault;
            }
            return C68869al.m121542a(zVar, this.f154893b, this.f154894c);
        }
    }

    /* renamed from: a */
    public static AbstractC88973n<String> m122518a(String str, String str2, String str3) {
        String str4;
        AbstractC88973n<ShortenModel> a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        m122519a(str3);
        if (C80538hl.m139614a(str3)) {
            Uri parse = Uri.parse(str3);
            C89219l.m154716b(parse, "");
            if (parse.isOpaque() || parse.getQueryParameterNames().isEmpty()) {
                AbstractC88973n<String> a2 = AbstractC88973n.m154245a(str3);
                C89219l.m154716b(a2, "");
                return a2;
            }
            str4 = parse.getQueryParameter("share_item_id");
        } else {
            str4 = "";
        }
        if (TextUtils.isEmpty(str4)) {
            if (C46970ge.f109462a) {
                a = ShortenUrlApi.m121478a(str3, "trill");
                C89219l.m154716b(a, "");
            } else {
                EnumC69509z zVar = f154885a.get(str);
                if (zVar == null) {
                    zVar = EnumC69509z.ShareDefault;
                }
                a = C68869al.m121542a(zVar, str2, str3);
            }
            AbstractC88973n<R> b = a.mo143248c(C69321a.f154887a).mo143233a(3, TimeUnit.SECONDS).mo143252d(new C69322b(str3)).mo143249c(C88446a.f200702h).mo143242b(C88925a.m154180b(C88946a.f201991c));
            C89219l.m154716b(b, "");
            return b;
        }
        AbstractC88973n<R> b2 = ShortenUrlApi.m121477a(str4).mo143248c(C69323c.f154889a).mo143233a(1, TimeUnit.SECONDS).mo143252d(C69324d.f154890a).mo143248c(new C69325e(str3)).mo143237a(new C69326f(str, str2, str3)).mo143248c(C69327g.f154895a).mo143233a(3, TimeUnit.SECONDS).mo143252d(new C69328h(str3)).mo143249c(C88446a.f200702h).mo143242b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b2, "");
        return b2;
    }
}
