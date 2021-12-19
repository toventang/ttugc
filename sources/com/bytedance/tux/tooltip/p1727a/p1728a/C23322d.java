package com.bytedance.tux.tooltip.p1727a.p1728a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.tooltip.a.a.d */
public final class C23322d {

    /* renamed from: a */
    public final List<AbstractC23318a> f55272a = new ArrayList();

    /* renamed from: b */
    public final Context f55273b;

    static {
        Covode.recordClassIndex(27275);
    }

    /* renamed from: com.bytedance.tux.tooltip.a.a.d$a */
    public static final class C23323a implements AbstractC23318a {

        /* renamed from: a */
        public int f55274a;

        /* renamed from: b */
        public int f55275b;

        /* renamed from: c */
        public AbstractC89172b<? super ImageView, C89391z> f55276c;

        /* renamed from: d */
        public int f55277d;

        /* renamed from: e */
        public CharSequence f55278e = "";

        /* renamed from: f */
        public View.OnClickListener f55279f;

        static {
            Covode.recordClassIndex(27276);
        }

        /* renamed from: a */
        public final void mo38016a(CharSequence charSequence) {
            C89219l.m154719c(charSequence, "");
            this.f55278e = charSequence;
        }
    }

    /* renamed from: com.bytedance.tux.tooltip.a.a.d$b */
    public static final class C23324b implements AbstractC23318a {

        /* renamed from: a */
        public int f55280a;

        /* renamed from: b */
        public int f55281b;

        /* renamed from: c */
        public int f55282c;

        /* renamed from: d */
        public CharSequence f55283d = "";

        /* renamed from: e */
        public int f55284e = -1;

        /* renamed from: f */
        public View.OnClickListener f55285f;

        static {
            Covode.recordClassIndex(27277);
        }

        /* renamed from: a */
        public final void mo38017a(CharSequence charSequence) {
            C89219l.m154719c(charSequence, "");
            this.f55283d = charSequence;
        }
    }

    /* renamed from: a */
    public final C23322d mo38014a(C23323a aVar) {
        C89219l.m154719c(aVar, "");
        this.f55272a.add(aVar);
        return this;
    }

    public C23322d(Context context) {
        C89219l.m154719c(context, "");
        this.f55273b = context;
    }

    /* renamed from: a */
    public final C23322d mo38015a(C23324b bVar) {
        C89219l.m154719c(bVar, "");
        this.f55272a.add(bVar);
        return this;
    }
}
