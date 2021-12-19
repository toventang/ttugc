package com.p2082ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.facebook.C24872m;
import com.facebook.internal.C24756m;
import com.facebook.messenger.C24886a;
import com.facebook.messenger.C24887b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.sharer.ext.p3780a.C69588a;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.AbstractC69575a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.l */
public final class C69612l extends AbstractC69643f {

    /* renamed from: a */
    private final AbstractC69575a f155442a;

    static {
        Covode.recordClassIndex(81984);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "messenger";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        return "Messenger";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f
    /* renamed from: e */
    public final String mo109798e() {
        return "com.facebook.orca";
    }

    /* renamed from: f */
    private final void m122948f() {
        if (!C24872m.m47685a()) {
            C24872m.m47684a(this.f155442a.mo81451a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ext.l$a */
    static final class C69613a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69613a f155443a = new C69613a();

        static {
            Covode.recordClassIndex(81985);
        }

        C69613a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_messenger_circle;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69613a.f155443a).mo37368a(context);
        }
        return null;
    }

    public C69612l(AbstractC69575a aVar) {
        C89219l.m154721d(aVar, "");
        this.f155442a = aVar;
        if (!C69588a.m122881a() && !C24872m.m47685a()) {
            C24872m.m47684a(aVar.mo81451a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        m122948f();
        if (C24756m.m47401a(context, "com.facebook.orca")) {
            return super.mo109551a(mVar, context);
        }
        C24886a.m47711a(context);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109550a(C69651l lVar, Context context) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(context, "");
        m122948f();
        C24886a.m47710a(this.f155442a.mo81451a(), C24887b.m47715a(lVar.f155472b, "image/*").mo40777a());
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69643f, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109552a(C69653n nVar, Context context) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(context, "");
        m122948f();
        C24886a.m47710a(this.f155442a.mo81451a(), C24887b.m47715a(nVar.f155480b, "video/*").mo40777a());
        return true;
    }
}
