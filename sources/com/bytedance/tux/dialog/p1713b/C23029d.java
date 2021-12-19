package com.bytedance.tux.dialog.p1713b;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.internal.C23072f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.dialog.b.d */
public final class C23029d extends AbstractC23034g {

    /* renamed from: b */
    public static final C23030a f54520b = new C23030a((byte) 0);

    /* renamed from: a */
    public final List<C23033f> f54521a = new ArrayList();

    /* renamed from: c */
    private final List<C23024a> f54522c = new ArrayList();

    static {
        Covode.recordClassIndex(26949);
    }

    /* renamed from: com.bytedance.tux.dialog.b.d$a */
    public static final class C23030a {
        static {
            Covode.recordClassIndex(26950);
        }

        private C23030a() {
        }

        public /* synthetic */ C23030a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final View mo37400a() {
        int i;
        TuxButton a;
        MethodCollector.m26663i(9022);
        LinearLayout linearLayout = new LinearLayout(this.f54597f);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        int i2 = 0;
        for (T t : this.f54521a) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            C23024a aVar = this.f54522c.get(i2);
            if (t2.f54532e != 1) {
                a = m43436a(new TuxButton(this.f54597f, null, 0, 6));
                a.setTextColor(this.f54595d.f54609k);
                a.setTuxFont(this.f54595d.f54604f);
                a.setButtonVariant(this.f54595d.f54616r);
            } else {
                a = m43436a(new C23072f(this.f54597f));
                a.setTextColor(this.f54595d.f54608j);
                a.setTuxFont(this.f54595d.f54603e);
            }
            a.setText(t2.f54531d);
            a.setOnClickListener(new View$OnClickListenerC23031b(t2, aVar, i2, linearLayout, this));
            a.setEnabled(t2.f54530c);
            AbstractC89172b<? super TuxButton, C89391z> bVar = t2.f54529b;
            if (bVar != null) {
                bVar.invoke(a);
            }
            t2.f54528a.add(a);
            linearLayout.addView(a);
            i2 = i3;
        }
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        int a3 = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system2.getDisplayMetrics()));
        int size = this.f54521a.size();
        if (size == 0) {
            i = 0;
        } else if (size != 1) {
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            i = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system3.getDisplayMetrics()));
        } else {
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            i = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system4.getDisplayMetrics()));
        }
        linearLayout.setPadding(a2, 0, a3, i);
        MethodCollector.m26664o(9022);
        return linearLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23029d(Context context) {
        super(context);
        C89219l.m154719c(context, "");
    }

    /* renamed from: com.bytedance.tux.dialog.b.d$b */
    static final class View$OnClickListenerC23031b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23033f f54523a;

        /* renamed from: b */
        final /* synthetic */ C23024a f54524b;

        /* renamed from: c */
        final /* synthetic */ int f54525c;

        /* renamed from: d */
        final /* synthetic */ LinearLayout f54526d;

        /* renamed from: e */
        final /* synthetic */ C23029d f54527e;

        static {
            Covode.recordClassIndex(26951);
        }

        View$OnClickListenerC23031b(C23033f fVar, C23024a aVar, int i, LinearLayout linearLayout, C23029d dVar) {
            this.f54523a = fVar;
            this.f54524b = aVar;
            this.f54525c = i;
            this.f54526d = linearLayout;
            this.f54527e = dVar;
        }

        public final void onClick(View view) {
            AbstractC89172b<C23024a, C89391z> bVar = this.f54523a.f54533f;
            if (bVar != null) {
                bVar.invoke(this.f54524b);
            }
            if (this.f54524b.f54509b) {
                this.f54527e.mo37488c().mo37470a(Integer.valueOf(this.f54525c));
            }
        }
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final void mo37401a(C23013a aVar) {
        C89219l.m154719c(aVar, "");
        super.mo37401a(aVar);
        Iterator<T> it = this.f54522c.iterator();
        while (it.hasNext()) {
            it.next().mo37415a(aVar);
        }
    }

    /* renamed from: a */
    private static TuxButton m43436a(TuxButton tuxButton) {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C89241a.m154730a(TypedValue.applyDimension(1, 44.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics()));
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        int a3 = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system4.getDisplayMetrics()));
        Resources system5 = Resources.getSystem();
        C89219l.m154709a((Object) system5, "");
        layoutParams.setMargins(a, a2, a3, C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system5.getDisplayMetrics())));
        tuxButton.setLayoutParams(layoutParams);
        tuxButton.setButtonSize(2);
        tuxButton.setGravity(17);
        return tuxButton;
    }

    /* renamed from: a */
    public final void mo37423a(int i, AbstractC89172b<? super C23024a, C89391z> bVar) {
        CharSequence text = this.f54597f.getText(i);
        C89219l.m154709a((Object) text, "");
        mo37424a(text, bVar);
    }

    /* renamed from: b */
    public final void mo37425b(int i, AbstractC89172b<? super C23024a, C89391z> bVar) {
        CharSequence text = this.f54597f.getText(i);
        C89219l.m154709a((Object) text, "");
        mo37426b(text, bVar);
    }

    /* renamed from: b */
    public final void mo37426b(CharSequence charSequence, AbstractC89172b<? super C23024a, C89391z> bVar) {
        C89219l.m154719c(charSequence, "");
        m43437a(1, charSequence, bVar);
    }

    /* renamed from: a */
    public final void mo37424a(CharSequence charSequence, AbstractC89172b<? super C23024a, C89391z> bVar) {
        C89219l.m154719c(charSequence, "");
        m43437a(0, charSequence, bVar);
    }

    /* renamed from: a */
    private final void m43437a(int i, CharSequence charSequence, AbstractC89172b<? super C23024a, C89391z> bVar) {
        this.f54522c.add(new C23024a(this.f54522c.size()));
        this.f54521a.add(new C23033f(this.f54595d, i, charSequence, bVar));
    }
}
