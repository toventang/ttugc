package com.p2082ss.android.ugc.gamora.editor.lightening.p4281a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.c */
public final class C82322c extends AbstractC22219j implements AbstractC21566a {

    /* renamed from: g */
    public static final C82324b f184143g = new C82324b((byte) 0);

    /* renamed from: a */
    public View f184144a;

    /* renamed from: b */
    public TextView f184145b;

    /* renamed from: c */
    public LinearLayout f184146c;

    /* renamed from: d */
    public LinearLayout f184147d;

    /* renamed from: e */
    public boolean f184148e = true;

    /* renamed from: f */
    public final C82330d f184149f;

    /* renamed from: h */
    private TextView f184150h;

    /* renamed from: i */
    private TextView f184151i;

    /* renamed from: j */
    private final AbstractC89244h f184152j = C89250i.m154774a(EnumC89331m.NONE, new C82323a(this));

    /* renamed from: k */
    private final C21582f f184153k;

    static {
        Covode.recordClassIndex(96156);
    }

    /* renamed from: a */
    public final AbstractC72510a mo127451a() {
        return (AbstractC72510a) this.f184152j.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.c$b */
    public static final class C82324b {
        static {
            Covode.recordClassIndex(96158);
        }

        private C82324b() {
        }

        public /* synthetic */ C82324b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184153k;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.c$a */
    public static final class C82323a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184154a;

        static {
            Covode.recordClassIndex(96157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82323a(AbstractC21566a aVar) {
            super(0);
            this.f184154a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184154a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.lightening.p4281a.C82322c.C82323a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.c$c */
    public static final class C82325c extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C82322c f184155a;

        static {
            Covode.recordClassIndex(96159);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82325c(C82322c cVar) {
            super(600);
            this.f184155a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            if (this.f184155a.f184148e) {
                this.f184155a.mo127451a().mo114787L();
                C84911q.m145921a("VEVideoPublishEditActivity nextStep OnClick");
                AbstractC89171a<C89391z> aVar = this.f184155a.f184149f.f184165e;
                if (aVar == null) {
                    C89219l.m154710a("next");
                }
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.c$d */
    public static final class C82326d extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        public boolean f184156a;

        /* renamed from: b */
        final /* synthetic */ C82322c f184157b;

        static {
            Covode.recordClassIndex(96160);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82326d(C82322c cVar) {
            super(600);
            this.f184157b = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            if (!this.f184156a) {
                this.f184157b.mo127451a().mo114787L();
                this.f184156a = true;
            }
            AbstractC89171a<C89391z> aVar = this.f184157b.f184149f.f184164d;
            if (aVar == null) {
                C89219l.m154710a("publish");
            }
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m142377a(C82322c cVar) {
        View view = cVar.f184144a;
        if (view == null) {
            C89219l.m154710a("quickPublish");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ LinearLayout m142378b(C82322c cVar) {
        LinearLayout linearLayout = cVar.f184146c;
        if (linearLayout == null) {
            C89219l.m154710a("bottomContainer");
        }
        return linearLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ LinearLayout m142379c(C82322c cVar) {
        LinearLayout linearLayout = cVar.f184147d;
        if (linearLayout == null) {
            C89219l.m154710a("bottomContainerSingle");
        }
        return linearLayout;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.c$e */
    static final class C82327e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82322c f184158a;

        static {
            Covode.recordClassIndex(96161);
        }

        C82327e(C82322c cVar) {
            this.f184158a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            TextView textView = this.f184158a.f184145b;
            if (textView == null) {
                C89219l.m154710a("nextStep");
            }
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.c$f */
    static final class C82328f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82322c f184159a;

        static {
            Covode.recordClassIndex(96162);
        }

        C82328f(C82322c cVar) {
            this.f184159a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C82322c.m142377a(this.f184159a).setEnabled(true);
                C82322c.m142377a(this.f184159a).setVisibility(0);
                C82322c.m142377a(this.f184159a).setAlpha(1.0f);
                return;
            }
            C82322c.m142377a(this.f184159a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.c$g */
    static final class C82329g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82322c f184160a;

        static {
            Covode.recordClassIndex(96163);
        }

        C82329g(C82322c cVar) {
            this.f184160a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C82322c.m142378b(this.f184160a).setVisibility(8);
                C82322c.m142379c(this.f184160a).setVisibility(0);
                return;
            }
            C82322c.m142379c(this.f184160a).setVisibility(8);
            C82322c.m142378b(this.f184160a).setVisibility(0);
        }
    }

    public C82322c(C82330d dVar, C21582f fVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(fVar, "");
        this.f184149f = dVar;
        this.f184153k = fVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asj, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        C82326d dVar = new C82326d(this);
        View c = mo36475c(R.id.ddj);
        C89219l.m154716b(c, "");
        this.f184144a = c;
        if (c == null) {
            C89219l.m154710a("quickPublish");
        }
        c.setOnClickListener(dVar);
        View c2 = mo36475c(R.id.csd);
        C89219l.m154716b(c2, "");
        TextView textView = (TextView) c2;
        this.f184145b = textView;
        if (textView == null) {
            C89219l.m154710a("nextStep");
        }
        textView.setOnClickListener(new C82325c(this));
        View c3 = mo36475c(R.id.f1v);
        C89219l.m154716b(c3, "");
        this.f184150h = (TextView) c3;
        View c4 = mo36475c(R.id.c3e);
        C89219l.m154716b(c4, "");
        this.f184146c = (LinearLayout) c4;
        View c5 = mo36475c(R.id.c3f);
        C89219l.m154716b(c5, "");
        this.f184147d = (LinearLayout) c5;
        View c6 = mo36475c(R.id.ddk);
        C89219l.m154716b(c6, "");
        TextView textView2 = (TextView) c6;
        this.f184151i = textView2;
        if (textView2 == null) {
            C89219l.m154710a("singleQuickPublish");
        }
        textView2.setOnClickListener(dVar);
        C2560h<Boolean> hVar = this.f184149f.f184162b;
        if (hVar == null) {
            C89219l.m154710a("nextVisible");
        }
        hVar.mo7036a(this, new C82327e(this));
        C2560h<Boolean> hVar2 = this.f184149f.f184161a;
        if (hVar2 == null) {
            C89219l.m154710a("quickPublishVisible");
        }
        hVar2.mo7036a(this, new C82328f(this));
        C2560h<Boolean> hVar3 = this.f184149f.f184163c;
        if (hVar3 == null) {
            C89219l.m154710a("onlyShowQuickPublish");
        }
        hVar3.mo7036a(this, new C82329g(this));
    }
}
