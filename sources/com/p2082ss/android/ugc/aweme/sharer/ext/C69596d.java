package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.d */
public final class C69596d extends AbstractC69643f {
    static {
        Covode.recordClassIndex(81968);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "facebook_lite";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return "Lite";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f
    /* renamed from: e */
    public final String mo109798e() {
        return "com.facebook.lite";
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.d$a */
    static final class C69597a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69597a f155434a = new C69597a();

        static {
            Covode.recordClassIndex(81969);
        }

        C69597a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_facebook_lite_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69597a.f155434a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: b */
    public final boolean mo109557b(Context context) {
        C89219l.m154721d(context, "");
        if (!super.mo109557b(context) || !mo109549a(context, new C69652m("test"))) {
            return false;
        }
        return true;
    }
}
