package com.bytedance.tux.tooltip.p1727a.p1729b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.tooltip.a.b.b */
public final class C23330b extends FrameLayout {

    /* renamed from: a */
    final View f55296a;

    /* renamed from: b */
    private AbstractC89172b<? super ImageView, C89391z> f55297b;

    static {
        Covode.recordClassIndex(27283);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super android.widget.ImageView, h.z>, h.f.a.b<android.widget.ImageView, h.z> */
    public final AbstractC89172b<ImageView, C89391z> getCustomImage() {
        return this.f55297b;
    }

    public final View getView() {
        return this.f55296a;
    }

    public final void setCustomImage(AbstractC89172b<? super ImageView, C89391z> bVar) {
        this.f55297b = bVar;
        if (bVar != null) {
            ImageView imageView = (ImageView) this.f55296a.findViewById(R.id.bky);
            C89219l.m154709a((Object) imageView, "");
            imageView.setVisibility(0);
            View findViewById = this.f55296a.findViewById(R.id.bky);
            C89219l.m154709a((Object) findViewById, "");
            bVar.invoke(findViewById);
        }
    }

    /* renamed from: com.bytedance.tux.tooltip.a.b.b$a */
    static final class C23331a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f55298a;

        /* renamed from: b */
        final /* synthetic */ int f55299b;

        static {
            Covode.recordClassIndex(27284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23331a(int i, int i2) {
            super(1);
            this.f55298a = i;
            this.f55299b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            aVar2.f54431a = this.f55298a;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
            aVar2.f54435e = Integer.valueOf(this.f55299b);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C23330b(Context context) {
        super(context, null, R.attr.cg);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(7713);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.a0, this, true);
        C89219l.m154709a((Object) a, "");
        this.f55296a = a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.gm, R.attr.gn, R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu}, R.attr.cg, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        ((TuxTextView) a.findViewById(R.id.cj9)).setTextColor(obtainStyledAttributes.getColor(8, -1));
        ((TuxTextView) a.findViewById(R.id.cj9)).setTuxFont(obtainStyledAttributes.getInt(7, 0));
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(7713);
    }

    public /* synthetic */ C23330b(Context context, byte b) {
        this(context);
    }
}
