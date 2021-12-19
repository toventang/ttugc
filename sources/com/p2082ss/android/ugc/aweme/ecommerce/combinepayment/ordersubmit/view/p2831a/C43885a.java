package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.p2831a;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43854h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43861o;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.a */
public final class C43885a extends FrameLayout {

    /* renamed from: a */
    public boolean f102280a;

    /* renamed from: b */
    private int f102281b;

    /* renamed from: c */
    private final C43861o f102282c;

    /* renamed from: d */
    private final AbstractC89171a<C89391z> f102283d;

    /* renamed from: e */
    private final AbstractC89171a<C89391z> f102284e;

    /* renamed from: f */
    private SparseArray f102285f;

    static {
        Covode.recordClassIndex(52167);
    }

    /* renamed from: a */
    public final View mo74806a(int i) {
        if (this.f102285f == null) {
            this.f102285f = new SparseArray();
        }
        View view = (View) this.f102285f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f102285f.put(i, findViewById);
        return findViewById;
    }

    public final AbstractC89171a<C89391z> getLogInputAction() {
        return this.f102284e;
    }

    public final AbstractC89171a<C89391z> getUpdateValidity() {
        return this.f102283d;
    }

    public final C43854h getReason() {
        String str = this.f102282c.f102231b;
        if (str == null) {
            str = "";
        }
        DmtEditText dmtEditText = (DmtEditText) mo74806a(R.id.ddn);
        C89219l.m154716b(dmtEditText, "");
        return new C43854h(str, String.valueOf(dmtEditText.getText()));
    }

    /* renamed from: a */
    public final void mo74807a() {
        boolean z;
        int i;
        TuxTextView tuxTextView = (TuxTextView) mo74806a(R.id.ddl);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(String.valueOf(((DmtEditText) mo74806a(R.id.ddn)).length()));
        if (((DmtEditText) mo74806a(R.id.ddn)).length() <= this.f102281b) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f102280a) {
            this.f102280a = z;
            TuxTextView tuxTextView2 = (TuxTextView) mo74806a(R.id.ddl);
            Context context = getContext();
            C89219l.m154716b(context, "");
            Resources resources = context.getResources();
            if (this.f102280a) {
                i = R.color.c5;
            } else {
                i = R.color.bd;
            }
            tuxTextView2.setTextColor(resources.getColor(i));
            AbstractC89171a<C89391z> aVar = this.f102283d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.a$a */
    public static final class C43886a extends C45571l {

        /* renamed from: a */
        final /* synthetic */ C43885a f102286a;

        static {
            Covode.recordClassIndex(52168);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C43886a(C43885a aVar) {
            this.f102286a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f102286a.mo74807a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.a$b */
    static final class View$OnFocusChangeListenerC43887b implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C43885a f102287a;

        static {
            Covode.recordClassIndex(52169);
        }

        View$OnFocusChangeListenerC43887b(C43885a aVar) {
            this.f102287a = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z && this.f102287a.getLogInputAction() != null) {
                this.f102287a.getLogInputAction().invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C43885a(Context context, C43861o oVar, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(oVar, "");
        MethodCollector.m26663i(8468);
        this.f102282c = oVar;
        this.f102283d = aVar;
        this.f102284e = aVar2;
        this.f102281b = 200;
        this.f102280a = true;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.p3, this, true);
        TuxTextView tuxTextView = (TuxTextView) mo74806a(R.id.ddo);
        C89219l.m154716b(tuxTextView, "");
        String str = oVar.f102232c;
        if (str == null) {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            str = context2.getResources().getString(R.string.bge);
        }
        tuxTextView.setText(str);
        Integer num = oVar.f102234e;
        if (num != null) {
            this.f102281b = num.intValue();
        }
        DmtEditText dmtEditText = (DmtEditText) mo74806a(R.id.ddn);
        C89219l.m154716b(dmtEditText, "");
        String str2 = oVar.f102233d;
        if (str2 == null) {
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            str2 = context3.getResources().getString(R.string.bgc);
        }
        dmtEditText.setHint(str2);
        mo74807a();
        ((DmtEditText) mo74806a(R.id.ddn)).addTextChangedListener(new C43886a(this));
        ((DmtEditText) mo74806a(R.id.ddn)).setOnFocusChangeListener(new View$OnFocusChangeListenerC43887b(this));
        TuxTextView tuxTextView2 = (TuxTextView) mo74806a(R.id.ddm);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText("/" + this.f102281b);
        MethodCollector.m26664o(8468);
    }

    public /* synthetic */ C43885a(Context context, C43861o oVar, AbstractC89171a aVar, AbstractC89171a aVar2, byte b) {
        this(context, oVar, aVar, aVar2);
    }
}
