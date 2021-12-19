package com.p2082ss.android.ugc.aweme.share.qrcode.p3772a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.share.qrcode.a.a */
public final class C69389a extends C69105a {

    /* renamed from: b */
    public static final C69390a f155002b = new C69390a((byte) 0);

    static {
        Covode.recordClassIndex(81722);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "qr_code_save";
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a.a$a */
    public static final class C69390a {
        static {
            Covode.recordClassIndex(81723);
        }

        private C69390a() {
        }

        public /* synthetic */ C69390a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        String string = C17867d.m33078a().getString(R.string.bb2);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69105a, com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23163i.m43657a(C23005c.m43393a(C69391b.f155003a).mo37368a(context), C23009f.m43397a(C69392c.f155004a).mo37389a(context));
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a.a$b */
    static final class C69391b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69391b f155003a = new C69391b();

        static {
            Covode.recordClassIndex(81724);
        }

        C69391b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_2pt_arrow_to_bottom;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bc);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a.a$c */
    static final class C69392c extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C69392c f155004a = new C69392c();

        static {
            Covode.recordClassIndex(81725);
        }

        C69392c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.h);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54469h = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54468g = C89241a.m154730a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 24.0f, system3.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }
}
