package com.bytedance.tux.tooltip.p1727a.p1728a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.p032a.C0641g;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.tooltip.a.a.f */
public final class C23327f extends FrameLayout {

    /* renamed from: a */
    private final View f55289a;

    /* renamed from: b */
    private C23322d.C23324b f55290b;

    static {
        Covode.recordClassIndex(27280);
    }

    public final C23322d.C23324b getAction() {
        return this.f55290b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.tooltip.a.a.f$a */
    public static final class C23328a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C23322d.C23324b f55291a;

        static {
            Covode.recordClassIndex(27281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23328a(C23322d.C23324b bVar) {
            super(1);
            this.f55291a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            aVar2.f54431a = this.f55291a.f55280a;
            aVar2.f54435e = Integer.valueOf(this.f55291a.f55281b);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C23327f(Context context) {
        super(context, null, R.attr.cg);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8023);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.z, this, true);
        this.f55289a = a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.gm, R.attr.gn, R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu}, R.attr.cg, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        try {
            C89219l.m154709a((Object) a, "");
            ((TuxTextView) a.findViewById(R.id.text)).setTuxFont(C0641g.m2356b(obtainStyledAttributes));
            C89219l.m154709a((Object) a, "");
            ((TuxTextView) a.findViewById(R.id.text)).setTextColor(C0641g.m2357b(obtainStyledAttributes, 3));
        } catch (IllegalArgumentException unused) {
        }
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(8023);
    }

    public final void setAction(C23322d.C23324b bVar) {
        this.f55290b = bVar;
        if (bVar != null) {
            if (bVar.f55280a != 0) {
                View view = this.f55289a;
                C89219l.m154709a((Object) view, "");
                ImageView imageView = (ImageView) view.findViewById(R.id.bh1);
                C89219l.m154709a((Object) imageView, "");
                imageView.setVisibility(0);
                View view2 = this.f55289a;
                C89219l.m154709a((Object) view2, "");
                C22999a a = C23005c.m43393a(new C23328a(bVar));
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                ((ImageView) view2.findViewById(R.id.bh1)).setImageDrawable(a.mo37368a(context));
            } else {
                View view3 = this.f55289a;
                C89219l.m154709a((Object) view3, "");
                ImageView imageView2 = (ImageView) view3.findViewById(R.id.bh1);
                C89219l.m154709a((Object) imageView2, "");
                imageView2.setVisibility(8);
            }
            if (bVar.f55282c != 0) {
                View view4 = this.f55289a;
                C89219l.m154709a((Object) view4, "");
                TuxTextView tuxTextView = (TuxTextView) view4.findViewById(R.id.text);
                C89219l.m154709a((Object) tuxTextView, "");
                tuxTextView.setText(getResources().getString(bVar.f55282c));
            } else {
                View view5 = this.f55289a;
                C89219l.m154709a((Object) view5, "");
                TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.text);
                C89219l.m154709a((Object) tuxTextView2, "");
                tuxTextView2.setText(bVar.f55283d);
            }
            if (bVar.f55284e != -1) {
                View view6 = this.f55289a;
                C89219l.m154709a((Object) view6, "");
                ((TuxTextView) view6.findViewById(R.id.text)).setTextColorRes(bVar.f55284e);
            }
            this.f55289a.setOnClickListener(bVar.f55285f);
        }
    }

    public /* synthetic */ C23327f(Context context, byte b) {
        this(context);
    }
}
