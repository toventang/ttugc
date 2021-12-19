package com.bytedance.tux.dialog.p1712a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.C23136b;
import com.bytedance.tux.p1719f.C23137c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.a.d */
public final class C23020d extends AbstractC23022e {

    /* renamed from: a */
    public String f54497a = "";

    /* renamed from: b */
    public boolean f54498b;

    /* renamed from: c */
    public final C23137c f54499c;

    static {
        Covode.recordClassIndex(26940);
    }

    /* renamed from: b */
    public final void mo37404b() {
        this.f54498b = true;
        this.f54499c.f54759b = true;
    }

    /* renamed from: com.bytedance.tux.dialog.a.d$a */
    static final class C23021a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C23020d f54500a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f54501b;

        static {
            Covode.recordClassIndex(26941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23021a(C23020d dVar, AbstractC89172b bVar) {
            super(0);
            this.f54500a = dVar;
            this.f54501b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC89172b bVar = this.f54501b;
            C23017a aVar = new C23017a();
            C23013a c = this.f54500a.mo37488c();
            C89219l.m154719c(c, "");
            aVar.f54494a = c;
            bVar.invoke(aVar);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final View mo37400a() {
        TuxTextView tuxTextView = new TuxTextView(this.f54597f, null, 0, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        tuxTextView.setLayoutParams(layoutParams);
        C23137c cVar = this.f54499c;
        Context context = tuxTextView.getContext();
        C89219l.m154709a((Object) context, "");
        tuxTextView.setText(cVar.mo37625a(context));
        tuxTextView.setMovementMethod(C23136b.f54757a);
        return tuxTextView;
    }

    @Override // com.bytedance.tux.dialog.internal.AbstractC23067c
    /* renamed from: a */
    public final void mo37401a(C23013a aVar) {
        C89219l.m154719c(aVar, "");
        mo37487b(aVar);
    }

    /* renamed from: a */
    public final void mo37402a(AbstractC89172b<? super C23017a, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f54499c.f54763f = new C23021a(this, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23020d(Context context) {
        super(context);
        C89219l.m154719c(context, "");
        C23137c a = new C23137c().mo37624a(this.f54497a);
        a.f54759b = this.f54498b;
        a.f54761d = this.f54595d.f54618t;
        a.f54760c = this.f54595d.f54604f;
        this.f54499c = a;
    }

    /* renamed from: a */
    public final void mo37403a(String str) {
        C89219l.m154719c(str, "");
        this.f54497a = str;
        this.f54499c.mo37624a(str);
    }
}
