package com.p2082ss.android.ugc.aweme.share.improve.p3757b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69070j;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69651l;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.c */
public final class C69112c extends C69105a {

    /* renamed from: b */
    public static final C69113a f154555b = new C69113a((byte) 0);

    /* renamed from: c */
    private final C69070j f154556c;

    /* renamed from: d */
    private final SharePackage f154557d;

    static {
        Covode.recordClassIndex(81426);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "download";
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109550a(C69651l lVar, Context context) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(context, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109552a(C69653n nVar, Context context) {
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(context, "");
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.c$a */
    public static final class C69113a {
        static {
            Covode.recordClassIndex(81427);
        }

        private C69113a() {
        }

        public /* synthetic */ C69113a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
    /* renamed from: c */
    public final boolean mo109555c() {
        if (!this.f154556c.mo61923f()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        String string = C17867d.m33078a().getString(this.f154556c.mo61918b());
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context == null) {
            return null;
        }
        if (C56216k.m102134d()) {
            return super.mo109547a(context);
        }
        return C23005c.m43393a(C69114b.f154558a).mo37368a(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.c$b */
    static final class C69114b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69114b f154558a = new C69114b();

        static {
            Covode.recordClassIndex(81428);
        }

        C69114b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109551a(C69652m mVar, Context context) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        this.f154556c.mo61915a(context, this.f154557d);
        return true;
    }
}
