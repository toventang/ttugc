package com.p2082ss.android.ugc.aweme.share.improve.p3757b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69037c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.b */
public final class C69109b extends AbstractC69118e {

    /* renamed from: a */
    public static final C69110a f154553a = new C69110a((byte) 0);

    static {
        Covode.recordClassIndex(81423);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "copy";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.b$a */
    public static final class C69110a {
        static {
            Covode.recordClassIndex(81424);
        }

        private C69110a() {
        }

        public /* synthetic */ C69110a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        String b = C34722h.m70923b(R.string.fq2);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.b$b */
    static final class C69111b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69111b f154554a = new C69111b();

        static {
            Covode.recordClassIndex(81425);
        }

        C69111b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_link_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69111b.f154554a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo61913a(AbstractC69645h hVar, Context context) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        if (hVar instanceof C69650k) {
            return mo109554a((C69650k) hVar, context);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.AbstractC69118e, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109554a(C69650k kVar, Context context) {
        String str;
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(context, "");
        String str2 = kVar.f155479e;
        if (str2 == null || str2.length() == 0) {
            str = kVar.f155470b;
        } else {
            str = kVar.f155479e + ' ' + kVar.f155470b;
        }
        new C69037c(null, false, 7).mo109523a(str, context, PrivacyCert.Builder.Companion.with("bpea-106").usage("User may share video by copying video url, or posting video onto third-parties, including Instagram, WhatsApp, and SnapChat.").tag("clickCopyLinkButtonInShareDialog").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        return true;
    }
}
