package com.p2082ss.android.ugc.aweme.ecommerce.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.a */
public final class C45591a {

    /* renamed from: a */
    public static final C45591a f106167a = new C45591a();

    private C45591a() {
    }

    static {
        Covode.recordClassIndex(54088);
    }

    /* renamed from: a */
    public static Drawable m88135a(Context context) {
        C89219l.m154721d(context, "");
        return C23009f.m43397a(new C45592a(context)).mo37389a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.a$a */
    public static final class C45592a extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f106168a;

        /* renamed from: b */
        final /* synthetic */ int f106169b = R.color.u;

        /* renamed from: c */
        final /* synthetic */ int f106170c = R.color.bh;

        static {
            Covode.recordClassIndex(54089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45592a(Context context) {
            super(1);
            this.f106168a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            eVar2.f54462a = Integer.valueOf(C0643b.m2378c(this.f106168a, this.f106169b));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54465d = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics())));
            eVar2.f54466e = Integer.valueOf(C0643b.m2378c(this.f106168a, this.f106170c));
            return C89391z.f203057a;
        }
    }
}
