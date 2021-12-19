package com.p2082ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69584d;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a */
public final class C68963a {

    /* renamed from: a */
    public static final C68964a f154285a = new C68964a((byte) 0);

    static {
        Covode.recordClassIndex(81277);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a */
    public static final class C68964a {
        static {
            Covode.recordClassIndex(81278);
        }

        private C68964a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a$a */
        public static final class C68965a implements AbstractC69575a {

            /* renamed from: a */
            final /* synthetic */ Activity f154286a;

            static {
                Covode.recordClassIndex(81279);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a
            /* renamed from: a */
            public final Activity mo81451a() {
                Activity activity = this.f154286a;
                if (activity != null) {
                    return activity;
                }
                return C17873f.m33102j();
            }

            C68965a(Activity activity) {
                this.f154286a = activity;
            }
        }

        public /* synthetic */ C68964a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a$b */
        public static final class C68966b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

            /* renamed from: a */
            public static final C68966b f154287a = new C68966b();

            static {
                Covode.recordClassIndex(81280);
            }

            C68966b() {
                super(1);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C22999a aVar) {
                C22999a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                aVar2.f54431a = R.raw.icon_color_whatsapp_circle;
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static AbstractC69581b m121652a(String str, Activity activity) {
            C68965a aVar = new C68965a(activity);
            C23001b bVar = null;
            if (str == null) {
                return null;
            }
            if (activity != null) {
                bVar = C23005c.m43393a(C68966b.f154287a).mo37368a(activity);
            }
            return C69583c.m122807a(str, new C69584d("www.tiktokv.com", aVar, bVar, C17867d.m33078a().getString(R.string.cb5)));
        }
    }
}
