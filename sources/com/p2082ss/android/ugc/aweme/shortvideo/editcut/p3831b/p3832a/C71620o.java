package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.tabs.TabLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.o */
public final class C71620o extends AbstractC71586a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f160480a = {new C89232y(C71620o.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new C89232y(C71620o.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0)};

    /* renamed from: d */
    public static final C71621a f160481d = new C71621a((byte) 0);

    /* renamed from: b */
    public TabLayout f160482b;

    /* renamed from: c */
    final AbstractC89248d f160483c = C21572a.m40504a(getDiContainer(), AbstractC71775m.class);

    /* renamed from: e */
    private final AbstractC89248d f160484e = C21572a.m40504a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: f */
    private final String f160485f = "ModeSwitchScene";

    static {
        Covode.recordClassIndex(84165);
    }

    /* renamed from: C */
    public final EditAdjustClipsBottomViewModel mo113348C() {
        return (EditAdjustClipsBottomViewModel) this.f160484e.mo23374a(this, f160480a[1]);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.o$a */
    public static final class C71621a {
        static {
            Covode.recordClassIndex(84166);
        }

        private C71621a() {
        }

        public /* synthetic */ C71621a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d
    /* renamed from: a */
    public final String mo113345a() {
        return this.f160485f;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.o$b */
    public static final class C71622b implements TabLayout.AbstractC26717c {

        /* renamed from: a */
        final /* synthetic */ C71620o f160486a;

        static {
            Covode.recordClassIndex(84167);
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: b */
        public final void mo9937b(TabLayout.C26722f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71622b(C71620o oVar) {
            this.f160486a = oVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: a */
        public final void mo9936a(TabLayout.C26722f fVar) {
            if (fVar != null) {
                this.f160486a.mo113348C().mo33690d(new EditAdjustClipsBottomViewModel.C71542i(fVar.f63311e));
                C71620o oVar = this.f160486a;
                boolean z = false;
                AbstractC71775m mVar = (AbstractC71775m) oVar.f160483c.mo23374a(oVar, C71620o.f160480a[0]);
                if (fVar.f63311e == 0) {
                    z = true;
                }
                mVar.mo113387c(z);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TabLayout m126521a(C71620o oVar) {
        TabLayout tabLayout = oVar.f160482b;
        if (tabLayout == null) {
            C89219l.m154710a("tabLayout");
        }
        return tabLayout;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.o$c */
    static final class C71623c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71620o f160487a;

        static {
            Covode.recordClassIndex(84168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71623c(C71620o oVar) {
            super(1);
            this.f160487a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            TabLayout.C26722f tabAt;
            int i = !bool.booleanValue();
            if (!(i == C71620o.m126521a(this.f160487a).getSelectedTabPosition() || (tabAt = C71620o.m126521a(this.f160487a).getTabAt(i)) == null)) {
                tabAt.mo44370a();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.cl3);
        C89219l.m154716b(c, "");
        TabLayout tabLayout = (TabLayout) c;
        this.f160482b = tabLayout;
        if (tabLayout == null) {
            C89219l.m154710a("tabLayout");
        }
        TabLayout tabLayout2 = this.f160482b;
        if (tabLayout2 == null) {
            C89219l.m154710a("tabLayout");
        }
        TabLayout.C26722f newTab = tabLayout2.newTab();
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        TuxTextView tuxTextView = new TuxTextView(t, null, 0, 6);
        tuxTextView.setTuxFont(72);
        tuxTextView.setTextColor(tuxTextView.getResources().getColorStateList(R.color.db));
        tuxTextView.setText(R.string.g4j);
        tabLayout.addTab(newTab.mo44368a(tuxTextView));
        TabLayout tabLayout3 = this.f160482b;
        if (tabLayout3 == null) {
            C89219l.m154710a("tabLayout");
        }
        TabLayout tabLayout4 = this.f160482b;
        if (tabLayout4 == null) {
            C89219l.m154710a("tabLayout");
        }
        TabLayout.C26722f newTab2 = tabLayout4.newTab();
        Activity t2 = mo36486t();
        C89219l.m154716b(t2, "");
        TuxTextView tuxTextView2 = new TuxTextView(t2, null, 0, 6);
        tuxTextView2.setTuxFont(72);
        tuxTextView2.setTextColor(tuxTextView2.getResources().getColorStateList(R.color.db));
        tuxTextView2.setText(R.string.g4m);
        tabLayout3.addTab(newTab2.mo44368a(tuxTextView2));
        TabLayout tabLayout5 = this.f160482b;
        if (tabLayout5 == null) {
            C89219l.m154710a("tabLayout");
        }
        tabLayout5.addOnTabSelectedListener(new C71622b(this));
        AbstractC88412b unused = mo113348C().mo33677a(this, C71624p.f160488a, new C20370ah(), new C71623c(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.cz, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71620o(C21582f fVar, AbstractC22186b bVar) {
        super(fVar, bVar, R.id.b5m);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
    }
}
