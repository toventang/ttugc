package com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2855a;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a.a */
public final class C45333a extends FrameLayout {

    /* renamed from: a */
    public final AbstractC89171a<C89391z> f105648a;

    /* renamed from: b */
    public final AbstractC89171a<C89391z> f105649b;

    /* renamed from: c */
    private SparseArray f105650c;

    static {
        Covode.recordClassIndex(53792);
    }

    /* renamed from: a */
    public final View mo76420a(int i) {
        if (this.f105650c == null) {
            this.f105650c = new SparseArray();
        }
        View view = (View) this.f105650c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105650c.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a.a$a */
    public static final class C45334a extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105651a = 700;

        /* renamed from: b */
        final /* synthetic */ C45333a f105652b;

        static {
            Covode.recordClassIndex(53793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45334a(C45333a aVar) {
            super(700);
            this.f105652b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC89171a<C89391z> aVar;
            if (view != null && (aVar = this.f105652b.f105649b) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a.a$b */
    public static final class C45335b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105653a = 700;

        /* renamed from: b */
        final /* synthetic */ C45333a f105654b;

        static {
            Covode.recordClassIndex(53794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45335b(C45333a aVar) {
            super(700);
            this.f105654b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC89171a<C89391z> aVar;
            if (view != null && (aVar = this.f105654b.f105648a) != null) {
                aVar.invoke();
            }
        }
    }

    public final void setBottomText(String str) {
        C89219l.m154721d(str, "");
        TuxButton tuxButton = (TuxButton) mo76420a(R.id.a0k);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45333a(Context context, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8187);
        this.f105648a = aVar;
        this.f105649b = aVar2;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.o6, this, true);
        TuxButton tuxButton = (TuxButton) mo76420a(R.id.a0k);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setOnClickListener(new C45334a(this));
        TuxIconView tuxIconView = (TuxIconView) mo76420a(R.id.dv9);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setOnClickListener(new C45335b(this));
        MethodCollector.m26664o(8187);
    }
}
