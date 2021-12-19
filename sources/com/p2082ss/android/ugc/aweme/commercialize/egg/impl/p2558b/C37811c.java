package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2559c.C37818a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37782b;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2553b.AbstractC37785b;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37787a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37794b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c */
public final class C37811c extends AbstractC37801a {

    /* renamed from: f */
    public AbstractC37794b f89287f;

    /* renamed from: g */
    public long f89288g;

    /* renamed from: h */
    public boolean f89289h;

    static {
        Covode.recordClassIndex(45258);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$b */
    public static final class C37813b implements AbstractC37782b {

        /* renamed from: a */
        final /* synthetic */ C37811c f89291a;

        static {
            Covode.recordClassIndex(45260);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37782b
        /* renamed from: a */
        public final void mo65786a() {
            AbstractC37781a aVar = this.f89291a.f89267c;
            if (aVar != null) {
                aVar.mo65779a();
            }
            if (!this.f89291a.f89289h) {
                this.f89291a.f89289h = true;
                this.f89291a.mo65815a(true, null);
            }
        }

        C37813b(C37811c cVar) {
            this.f89291a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37782b
        /* renamed from: a */
        public final void mo65787a(String str) {
            AbstractC37781a aVar = this.f89291a.f89267c;
            if (aVar != null) {
                aVar.mo65782b();
            }
            this.f89291a.mo65815a(false, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b.AbstractC37801a
    /* renamed from: c */
    public final void mo65818c() {
        MethodCollector.m26663i(8919);
        AbstractC37794b bVar = this.f89287f;
        if (bVar != null) {
            this.f89269e.removeView(bVar.mo65788a());
            this.f89269e.setVisibility(8);
            bVar.mo65788a().setVisibility(8);
            this.f89287f = null;
            MethodCollector.m26664o(8919);
            return;
        }
        MethodCollector.m26664o(8919);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b.AbstractC37801a
    /* renamed from: b */
    public final void mo65817b() {
        String str;
        View a;
        AbstractC37794b bVar;
        MethodCollector.m26663i(8583);
        C37787a aVar = this.f89266b;
        View view = null;
        if (aVar == null || (str = aVar.f89211a) == null || str.length() == 0) {
            AbstractC37781a aVar2 = this.f89267c;
            if (aVar2 != null) {
                aVar2.mo65782b();
            }
            mo65814a("materialUrl is null");
            MethodCollector.m26664o(8583);
            return;
        }
        if (this.f89287f == null) {
            AbstractC37785b a2 = C37818a.m76472a();
            if (a2 != null) {
                bVar = a2.mo65692a(this.f89265a, str);
            } else {
                bVar = null;
            }
            this.f89287f = bVar;
            FrameLayout frameLayout = this.f89269e;
            AbstractC37794b bVar2 = this.f89287f;
            if (bVar2 != null) {
                view = bVar2.mo65788a();
            }
            frameLayout.addView(view);
        }
        AbstractC37794b bVar3 = this.f89287f;
        if (bVar3 != null) {
            AbstractC37781a aVar3 = this.f89267c;
            if (aVar3 != null) {
                aVar3.mo65783b(bVar3.mo65788a(), this.f89269e);
            }
            bVar3.mo65788a().setOnClickListener(new View$OnClickListenerC37812a(this));
            bVar3.mo65789a(new C37813b(this));
        }
        this.f89269e.setOnClickListener(new View$OnClickListenerC37814c(this));
        this.f89269e.setVisibility(0);
        AbstractC37794b bVar4 = this.f89287f;
        if (!(bVar4 == null || (a = bVar4.mo65788a()) == null)) {
            a.setVisibility(0);
        }
        this.f89288g = System.currentTimeMillis();
        AbstractC37794b bVar5 = this.f89287f;
        if (bVar5 != null) {
            this.f89289h = false;
            bVar5.mo65790b();
            MethodCollector.m26664o(8583);
            return;
        }
        MethodCollector.m26664o(8583);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37811c(FrameLayout frameLayout) {
        super(frameLayout);
        C89219l.m154721d(frameLayout, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$a */
    static final class View$OnClickListenerC37812a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37811c f89290a;

        static {
            Covode.recordClassIndex(45259);
        }

        View$OnClickListenerC37812a(C37811c cVar) {
            this.f89290a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f89290a.f89288g);
            AbstractC37781a aVar = this.f89290a.f89267c;
            if (aVar != null) {
                C89219l.m154716b(view, "");
                aVar.mo65780a(view, currentTimeMillis);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$c */
    static final class View$OnClickListenerC37814c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37811c f89292a;

        static {
            Covode.recordClassIndex(45261);
        }

        View$OnClickListenerC37814c(C37811c cVar) {
            this.f89292a = cVar;
        }

        public final void onClick(View view) {
            View view2;
            ClickAgent.onClick(view);
            AbstractC37781a aVar = this.f89292a.f89267c;
            if (aVar != null) {
                AbstractC37794b bVar = this.f89292a.f89287f;
                if (bVar != null) {
                    view2 = bVar.mo65788a();
                } else {
                    view2 = null;
                }
                C89219l.m154716b(view, "");
                aVar.mo65781a(view2, view);
            }
        }
    }
}
