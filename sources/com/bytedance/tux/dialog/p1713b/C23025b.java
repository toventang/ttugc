package com.bytedance.tux.dialog.p1713b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.internal.C23072f;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.widget.C23409b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.dialog.b.b */
public final class C23025b extends AbstractC23034g {

    /* renamed from: c */
    public static final C23026a f54511c = new C23026a((byte) 0);

    /* renamed from: a */
    public final List<C23033f> f54512a = new ArrayList();

    /* renamed from: b */
    public boolean f54513b;

    /* renamed from: g */
    private final List<C23024a> f54514g = new ArrayList();

    static {
        Covode.recordClassIndex(26945);
    }

    /* renamed from: com.bytedance.tux.dialog.b.b$a */
    public static final class C23026a {
        static {
            Covode.recordClassIndex(26946);
        }

        private C23026a() {
        }

        public /* synthetic */ C23026a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final View mo37400a() {
        C23072f a;
        MethodCollector.m26663i(9644);
        C23409b bVar = new C23409b(this.f54597f, (byte) 0);
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bVar.setForceVertical(this.f54513b);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        bVar.setDividerLineSize(C89241a.m154730a(TypedValue.applyDimension(1, 0.5f, system.getDisplayMetrics())));
        bVar.setDividerLine(new ColorDrawable(this.f54595d.f54610l));
        Context context = bVar.getContext();
        C89219l.m154709a((Object) context, "");
        if (C23163i.m43663a(context)) {
            C0792v.m2759b((View) bVar, 0);
        } else {
            C0792v.m2759b((View) bVar, 1);
        }
        int i = 0;
        for (T t : this.f54512a) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            C23024a aVar = this.f54514g.get(i);
            int i3 = t2.f54532e;
            if (i3 == 1) {
                a = m43425a(this.f54597f);
                a.setTextColor(this.f54595d.f54608j);
                a.setTuxFont(this.f54595d.f54603e);
            } else if (i3 != 2) {
                a = m43425a(this.f54597f);
                a.setTextColor(this.f54595d.f54607i);
                a.setTuxFont(this.f54595d.f54604f);
            } else {
                a = m43425a(this.f54597f);
                a.setTextColor(this.f54595d.f54611m);
                a.setTuxFont(this.f54595d.f54604f);
            }
            a.setText(t2.f54531d);
            a.setOnClickListener(new View$OnClickListenerC23027b(t2, aVar, i, bVar, this));
            a.setEnabled(t2.f54530c);
            AbstractC89172b<? super TuxButton, C89391z> bVar2 = t2.f54529b;
            if (bVar2 != null) {
                bVar2.invoke(a);
            }
            t2.f54528a.add(a);
            bVar.addView(a);
            i = i2;
        }
        LinearLayout linearLayout = new LinearLayout(this.f54597f);
        linearLayout.setOrientation(1);
        View view = new View(linearLayout.getContext());
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, C89241a.m154730a(TypedValue.applyDimension(1, 0.5f, system2.getDisplayMetrics()))));
        view.setBackground(new ColorDrawable(this.f54595d.f54610l));
        linearLayout.addView(view);
        linearLayout.addView(bVar);
        MethodCollector.m26664o(9644);
        return linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23025b(Context context) {
        super(context);
        C89219l.m154719c(context, "");
    }

    /* renamed from: com.bytedance.tux.dialog.b.b$b */
    static final class View$OnClickListenerC23027b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23033f f54515a;

        /* renamed from: b */
        final /* synthetic */ C23024a f54516b;

        /* renamed from: c */
        final /* synthetic */ int f54517c;

        /* renamed from: d */
        final /* synthetic */ C23409b f54518d;

        /* renamed from: e */
        final /* synthetic */ C23025b f54519e;

        static {
            Covode.recordClassIndex(26947);
        }

        View$OnClickListenerC23027b(C23033f fVar, C23024a aVar, int i, C23409b bVar, C23025b bVar2) {
            this.f54515a = fVar;
            this.f54516b = aVar;
            this.f54517c = i;
            this.f54518d = bVar;
            this.f54519e = bVar2;
        }

        public final void onClick(View view) {
            AbstractC89172b<C23024a, C89391z> bVar = this.f54515a.f54533f;
            if (bVar != null) {
                bVar.invoke(this.f54516b);
            }
            if (this.f54516b.f54509b) {
                this.f54519e.mo37488c().mo37470a(Integer.valueOf(this.f54517c));
            }
        }
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final void mo37401a(C23013a aVar) {
        C89219l.m154719c(aVar, "");
        super.mo37401a(aVar);
        Iterator<T> it = this.f54514g.iterator();
        while (it.hasNext()) {
            it.next().mo37415a(aVar);
        }
    }

    /* renamed from: a */
    private static C23072f m43425a(Context context) {
        C23072f fVar = new C23072f(context);
        fVar.setButtonSize(2);
        fVar.mo796a();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        fVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, C89241a.m154730a(TypedValue.applyDimension(1, 47.5f, system.getDisplayMetrics()))));
        fVar.setGravity(17);
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        fVar.setPadding(a, 0, C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())), 0);
        return fVar;
    }

    /* renamed from: a */
    public final void mo37416a(int i, AbstractC89172b<? super C23024a, C89391z> bVar) {
        CharSequence text = this.f54597f.getText(i);
        C89219l.m154709a((Object) text, "");
        mo37417a(text, bVar);
    }

    /* renamed from: b */
    public final void mo37418b(int i, AbstractC89172b<? super C23024a, C89391z> bVar) {
        CharSequence text = this.f54597f.getText(i);
        C89219l.m154709a((Object) text, "");
        mo37419b(text, bVar);
    }

    /* renamed from: c */
    public final void mo37420c(int i, AbstractC89172b<? super C23024a, C89391z> bVar) {
        CharSequence text = this.f54597f.getText(i);
        C89219l.m154709a((Object) text, "");
        mo37421c(text, bVar);
    }

    /* renamed from: b */
    public final void mo37419b(CharSequence charSequence, AbstractC89172b<? super C23024a, C89391z> bVar) {
        C89219l.m154719c(charSequence, "");
        m43426a(1, charSequence, bVar);
    }

    /* renamed from: c */
    public final void mo37421c(CharSequence charSequence, AbstractC89172b<? super C23024a, C89391z> bVar) {
        C89219l.m154719c(charSequence, "");
        m43426a(2, charSequence, bVar);
    }

    /* renamed from: a */
    public final void mo37417a(CharSequence charSequence, AbstractC89172b<? super C23024a, C89391z> bVar) {
        C89219l.m154719c(charSequence, "");
        m43426a(0, charSequence, bVar);
    }

    /* renamed from: a */
    private final void m43426a(int i, CharSequence charSequence, AbstractC89172b<? super C23024a, C89391z> bVar) {
        this.f54514g.add(new C23024a(this.f54514g.size()));
        this.f54512a.add(new C23033f(this.f54595d, i, charSequence, bVar));
    }
}
