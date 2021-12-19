package com.p2082ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.w */
public final class C49658w {

    /* renamed from: a */
    public static final C49658w f114296a = new C49658w();

    /* renamed from: b */
    private static final AbstractC89244h f114297b = C89250i.m154773a((AbstractC89171a) C49660b.f114302a);

    /* renamed from: c */
    private static final AbstractC89244h f114298c = C89250i.m154773a((AbstractC89171a) C49661c.f114303a);

    /* renamed from: d */
    private static final AbstractC89244h f114299d = C89250i.m154773a((AbstractC89171a) C49659a.f114301a);

    /* renamed from: e */
    private static final ArrayList<String> f114300e = new ArrayList<>();

    /* renamed from: a */
    public static Keva m93103a() {
        return (Keva) f114299d.getValue();
    }

    /* renamed from: b */
    private static AbstractC69581b m93107b() {
        return (AbstractC69581b) f114297b.getValue();
    }

    /* renamed from: c */
    private static AbstractC69581b m93110c() {
        return (AbstractC69581b) f114298c.getValue();
    }

    private C49658w() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.w$a */
    static final class C49659a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C49659a f114301a = new C49659a();

        static {
            Covode.recordClassIndex(58506);
        }

        C49659a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("SHARE_CHANNEL_RECORDER");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.w$b */
    static final class C49660b extends AbstractC89220m implements AbstractC89171a<AbstractC69581b> {

        /* renamed from: a */
        public static final C49660b f114302a = new C49660b();

        static {
            Covode.recordClassIndex(58507);
        }

        C49660b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC69581b invoke() {
            return C69583c.m122807a("whatsapp", null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.w$d */
    public static final class C49663d implements AbstractC69575a {

        /* renamed from: a */
        final /* synthetic */ Activity f114305a;

        static {
            Covode.recordClassIndex(58510);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a
        /* renamed from: a */
        public final Activity mo81451a() {
            Activity activity = this.f114305a;
            if (activity != null) {
                return activity;
            }
            return C17873f.m33102j();
        }

        C49663d(Activity activity) {
            this.f114305a = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.w$c */
    static final class C49661c extends AbstractC89220m implements AbstractC89171a<AbstractC69581b> {

        /* renamed from: a */
        public static final C49661c f114303a = new C49661c();

        static {
            Covode.recordClassIndex(58508);
        }

        C49661c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC69581b invoke() {
            C23001b bVar;
            Activity j = C17873f.m33102j();
            if (j != null) {
                bVar = C23005c.m43393a(C49662a.f114304a).mo37368a(j);
            } else {
                bVar = null;
            }
            return C69583c.m122807a("whatsapp_status", new C69584d(null, null, bVar, null));
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.helper.w$c$a */
        static final class C49662a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

            /* renamed from: a */
            public static final C49662a f114304a = new C49662a();

            static {
                Covode.recordClassIndex(58509);
            }

            C49662a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C22999a aVar) {
                C22999a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                aVar2.f54431a = R.raw.icon_color_whatsapp_circle;
                return C89391z.f203057a;
            }
        }
    }

    static {
        Covode.recordClassIndex(58505);
    }

    /* renamed from: a */
    public static final boolean m93105a(Context context) {
        if (C16048b.m29633a().mo25412a(true, "interction_share_button_whatsapp_style", 0) == 0 || !m93109b(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m93109b(Context context) {
        if (context == null || m93107b() == null) {
            return false;
        }
        AbstractC69581b b = m93107b();
        if (b == null) {
            C89219l.m154715b();
        }
        return b.mo109557b(context);
    }

    /* renamed from: a */
    public static final boolean m93106a(Aweme aweme) {
        long[] typeLabels;
        C89219l.m154721d(aweme, "");
        if (aweme.getAwemeType() == 56) {
            return true;
        }
        User author = aweme.getAuthor();
        if (!(author == null || (typeLabels = author.getTypeLabels()) == null || !C89064i.m154488a(typeLabels))) {
            return true;
        }
        List<TextExtraStruct> textExtra = aweme.getTextExtra();
        if (textExtra != null && !textExtra.isEmpty()) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                C89219l.m154716b(textExtraStruct, "");
                String hashTagName = textExtraStruct.getHashTagName();
                if (hashTagName != null && !C89361p.m154870a((CharSequence) hashTagName)) {
                    String hashTagName2 = textExtraStruct.getHashTagName();
                    C89219l.m154716b(hashTagName2, "");
                    if (!C89361p.m154908a((CharSequence) hashTagName2, (CharSequence) "status", false)) {
                        String hashTagName3 = textExtraStruct.getHashTagName();
                        C89219l.m154716b(hashTagName3, "");
                        if (C89361p.m154908a((CharSequence) hashTagName3, (CharSequence) "Status", false)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static ArrayList<String> m93108b(Activity activity) {
        ArrayList<String> arrayList = f114300e;
        if (arrayList.isEmpty()) {
            C49663d dVar = new C49663d(activity);
            AbstractC69581b a = C69583c.m122807a("instagram", null);
            if (a != null) {
                arrayList.add(a.mo109548a());
            }
            AbstractC69581b a2 = C69583c.m122807a("instagram_story", null);
            if (a2 != null) {
                arrayList.add(a2.mo109548a());
            }
            AbstractC69581b a3 = C69583c.m122807a("facebook", new C69584d(null, dVar, null, null));
            if (a3 != null) {
                arrayList.add(a3.mo109548a());
            }
            AbstractC69581b a4 = C69583c.m122807a("facebook_lite", null);
            if (a4 != null) {
                arrayList.add(a4.mo109548a());
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r1, (java.lang.Object) r2) != false) goto L_0x0069;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m93104a(android.app.Activity r10) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.helper.C49658w.m93104a(android.app.Activity):boolean");
    }
}
