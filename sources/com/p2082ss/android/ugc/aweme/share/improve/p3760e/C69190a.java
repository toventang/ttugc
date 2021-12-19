package com.p2082ss.android.ugc.aweme.share.improve.p3760e;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.share.improve.C69130d;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.share.improve.p3761f.C69200d;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69580d;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.e.a */
public final class C69190a {

    /* renamed from: a */
    public static final AbstractC89244h f154682a = C89250i.m154773a((AbstractC89171a) C69195b.f154687a);

    /* renamed from: b */
    public static final C69191a f154683b = new C69191a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$a */
    public static final class C69191a {
        static {
            Covode.recordClassIndex(81505);
        }

        /* renamed from: a */
        public static List<String> m122288a() {
            return (List) C69190a.f154682a.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$a$b */
        public static final class C69193b implements AbstractC69575a {

            /* renamed from: a */
            final /* synthetic */ Activity f154685a;

            static {
                Covode.recordClassIndex(81507);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a
            /* renamed from: a */
            public final Activity mo81451a() {
                return this.f154685a;
            }

            C69193b(Activity activity) {
                this.f154685a = activity;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$a$c */
        public static final class C69194c implements AbstractC69575a {

            /* renamed from: a */
            final /* synthetic */ Activity f154686a;

            static {
                Covode.recordClassIndex(81508);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a
            /* renamed from: a */
            public final Activity mo81451a() {
                return this.f154686a;
            }

            C69194c(Activity activity) {
                this.f154686a = activity;
            }
        }

        private C69191a() {
        }

        public /* synthetic */ C69191a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$a$a */
        public static final class C69192a extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

            /* renamed from: a */
            public static final C69192a f154684a = new C69192a();

            static {
                Covode.recordClassIndex(81506);
            }

            C69192a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
                boolean z;
                AbstractC69581b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                if (C69191a.m122288a().isEmpty() || C89219l.m154714a((Object) bVar2.mo109548a(), (Object) "download")) {
                    z = true;
                } else {
                    z = C69191a.m122288a().contains(bVar2.mo109548a());
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: a */
        public static List<AbstractC69581b> m122289a(Activity activity) {
            C69194c cVar = new C69194c(activity);
            Drawable drawable = null;
            AbstractC69581b a = C69583c.m122807a("whatsapp", null);
            if (a != null) {
                drawable = a.mo109547a(activity);
            }
            C69584d dVar = new C69584d("www.tiktokv.com", cVar, drawable, C17867d.m33078a().getString(R.string.cb5));
            ArrayList arrayList = new ArrayList();
            m122291a("snapchat", dVar, arrayList);
            m122291a("instagram", dVar, arrayList);
            m122291a("instagram_story", dVar, arrayList);
            m122291a("whatsapp_status", dVar, arrayList);
            m122291a("zalo", dVar, arrayList);
            m122291a("kakaotalk", dVar, arrayList);
            if (activity != null && C69580d.m122792a(activity, "com.facebook.katana")) {
                m122291a("facebook", dVar, arrayList);
            }
            m122291a("facebook_lite", dVar, arrayList);
            m122291a("messenger", dVar, arrayList);
            m122291a("messenger_lite", dVar, arrayList);
            m122291a("sms", dVar, arrayList);
            m122291a("twitter", dVar, arrayList);
            m122291a("viber", dVar, arrayList);
            m122291a("vk", dVar, arrayList);
            m122291a("whatsapp", dVar, arrayList);
            m122291a("line", dVar, arrayList);
            m122291a("email", dVar, arrayList);
            m122291a("imgur", dVar, arrayList);
            m122291a("kakao_story", dVar, arrayList);
            m122291a("naver_blog", dVar, arrayList);
            m122291a("more", dVar, arrayList);
            return arrayList;
        }

        /* renamed from: a */
        private static void m122291a(String str, C69584d dVar, List<AbstractC69581b> list) {
            AbstractC69581b a = C69583c.m122807a(str, dVar);
            if (a != null) {
                list.add(a);
            }
        }

        /* renamed from: a */
        public static void m122290a(C69684e.C69686b bVar, boolean z, Activity activity, boolean z2) {
            C89219l.m154721d(bVar, "");
            C69193b bVar2 = new C69193b(activity);
            Drawable drawable = null;
            AbstractC69581b a = C69583c.m122807a("whatsapp", null);
            if (a != null) {
                drawable = a.mo109547a(activity);
            }
            C69584d dVar = new C69584d("www.tiktokv.com", bVar2, drawable, C17867d.m33078a().getString(R.string.cb5));
            if (z2) {
                C69583c.m122808a("snapchat", dVar, bVar);
                C69583c.m122808a("instagram", dVar, bVar);
                C69583c.m122808a("instagram_story", dVar, bVar);
                C69583c.m122808a("facebook", dVar, bVar);
                C69583c.m122808a("facebook_lite", dVar, bVar);
                C69583c.m122808a("messenger", dVar, bVar);
                C69583c.m122808a("messenger_lite", dVar, bVar);
                C69583c.m122808a("sms", dVar, bVar);
                C69583c.m122808a("twitter", dVar, bVar);
                C69583c.m122808a("viber", dVar, bVar);
                C69583c.m122808a("vk", dVar, bVar);
                C69583c.m122808a("whatsapp", dVar, bVar);
                C69583c.m122808a("line", dVar, bVar);
                C69583c.m122808a("band", dVar, bVar);
                C69583c.m122808a("email", dVar, bVar);
                C69583c.m122808a("imgur", dVar, bVar);
                C69583c.m122808a("kakao_story", dVar, bVar);
                C69583c.m122808a("kakaotalk", dVar, bVar);
                C69583c.m122808a("naver_blog", dVar, bVar);
                C69583c.m122808a("naver_cafe", dVar, bVar);
                C69583c.m122808a("zalo", dVar, bVar);
                C69583c.m122808a("telegram", dVar, bVar);
            }
            C69200d.C69201a.m122303a();
            bVar.f155584o = true;
            bVar.f155579j = R.string.fr9;
            bVar.f155582m = R.string.a8y;
            bVar.f155574e = true;
            bVar.mo109830a(new C69130d()).mo109832b(new C69200d()).mo109828a(C69192a.f154684a);
            if (z) {
                bVar.mo109829a("instagram").mo109829a("instagram_story").mo109829a("snapchat").mo109829a("whatsapp_status");
            }
            if (!IMAdapterServiceImpl.m101068d().mo90129a()) {
                bVar.mo109829a("chat_merge");
            }
            if (z2) {
                if (!z) {
                    bVar.mo109823a(new C69109b());
                }
                C69583c.m122808a("more", dVar, bVar);
            }
        }
    }

    static {
        Covode.recordClassIndex(81504);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e.a$b */
    static final class C69195b extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C69195b f154687a = new C69195b();

        static {
            Covode.recordClassIndex(81509);
        }

        C69195b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.util.List<? extends java.lang.String> invoke() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.share.i.a r0 = com.p2082ss.android.ugc.aweme.share.p3754i.C68960a.m121644a()
                java.lang.String r1 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
                java.util.List<com.ss.android.ugc.aweme.share.ag> r0 = r0.f154275a
                if (r0 == 0) goto L_0x001e
                com.ss.android.ugc.aweme.share.i.a r0 = com.p2082ss.android.ugc.aweme.share.p3754i.C68960a.m121644a()
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
                java.util.List<com.ss.android.ugc.aweme.share.ag> r0 = r0.f154275a
                if (r0 == 0) goto L_0x0045
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0045
            L_0x001e:
                java.util.List r1 = com.p2082ss.android.ugc.aweme.setting.C68126m.m120417a()
            L_0x0022:
                if (r1 == 0) goto L_0x0050
                java.util.ArrayList r2 = new java.util.ArrayList
                r0 = 10
                int r0 = p4600h.p4601a.C89070n.m154526a(r1, r0)
                r2.<init>(r0)
                java.util.Iterator r1 = r1.iterator()
            L_0x0033:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x004f
                java.lang.Object r0 = r1.next()
                com.ss.android.ugc.aweme.share.ag r0 = (com.p2082ss.android.ugc.aweme.share.C68862ag) r0
                java.lang.String r0 = r0.f154008a
                r2.add(r0)
                goto L_0x0033
            L_0x0045:
                com.ss.android.ugc.aweme.share.i.a r0 = com.p2082ss.android.ugc.aweme.share.p3754i.C68960a.m121644a()
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
                java.util.List<com.ss.android.ugc.aweme.share.ag> r1 = r0.f154275a
                goto L_0x0022
            L_0x004f:
                return r2
            L_0x0050:
                h.a.z r0 = p4600h.p4601a.C89086z.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.improve.p3760e.C69190a.C69195b.invoke():java.lang.Object");
        }
    }
}
