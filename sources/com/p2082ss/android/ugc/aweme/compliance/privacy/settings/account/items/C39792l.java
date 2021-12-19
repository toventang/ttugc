package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.C39800m;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68344b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.l */
public final class C39792l extends AbstractC39771b implements AbstractC39718e.AbstractC39719a {

    /* renamed from: a */
    final C39256o f93683a;

    /* renamed from: b */
    public final C1213t<Boolean> f93684b;

    /* renamed from: c */
    public final C1213t<Boolean> f93685c;

    /* renamed from: d */
    final AbstractC89244h f93686d;

    /* renamed from: e */
    public final PrivacySettingViewModel f93687e;

    /* renamed from: f */
    private final int f93688f = R.string.fly;

    /* renamed from: g */
    private final int f93689g = R.string.flz;

    static {
        Covode.recordClassIndex(47522);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return this.f93683a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93688f;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final AbstractC39714c.AbstractC39715a mo69094a() {
        return new C39795c(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: g */
    public final Integer mo69122g() {
        return Integer.valueOf(this.f93689g);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.l$g */
    static final class C39799g extends AbstractC89220m implements AbstractC89171a<IAVSettingsService> {

        /* renamed from: a */
        public static final C39799g f93701a = new C39799g();

        static {
            Covode.recordClassIndex(47529);
        }

        C39799g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAVSettingsService invoke() {
            return AVExternalServiceImpl.m113114a().configService().avsettingsConfig();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.l$a */
    static final class C39793a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39792l f93690a;

        /* renamed from: b */
        final /* synthetic */ C39723h f93691b;

        static {
            Covode.recordClassIndex(47523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39793a(C39792l lVar, C39723h hVar) {
            super(0);
            this.f93690a = lVar;
            this.f93691b = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39256o oVar = this.f93690a.f93683a;
            View view = this.f93691b.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C39699a.m80584a(oVar, context);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.l$e */
    static final class C39797e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39792l f93697a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39718e f93698b;

        static {
            Covode.recordClassIndex(47527);
        }

        C39797e(C39792l lVar, AbstractC39718e eVar) {
            this.f93697a = lVar;
            this.f93698b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC39713b.m80597a(this.f93698b, this.f93697a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.l$c */
    public static final class C39795c implements AbstractC39714c.AbstractC39715a {

        /* renamed from: a */
        final /* synthetic */ C39792l f93694a;

        /* renamed from: b */
        final /* synthetic */ int f93695b = R.layout.un;

        static {
            Covode.recordClassIndex(47525);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39795c(C39792l lVar) {
            this.f93694a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c.AbstractC39715a
        /* renamed from: a */
        public final C39723h mo69096a(Context context, ViewGroup viewGroup) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(context), this.f93695b, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C39800m(a, this.f93694a.f93687e, this.f93694a.f93684b, this.f93694a.f93685c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.l$d */
    static final class C39796d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39792l f93696a;

        static {
            Covode.recordClassIndex(47526);
        }

        C39796d(C39792l lVar) {
            this.f93696a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C68348f fVar = (C68348f) obj;
            C1213t<Boolean> tVar = this.f93696a.f93685c;
            C89219l.m154716b(fVar, "");
            tVar.setValue(Boolean.valueOf(C68344b.m120623a(fVar.f152957T)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.l$f */
    static final class C39798f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39792l f93699a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39718e f93700b;

        static {
            Covode.recordClassIndex(47528);
        }

        C39798f(C39792l lVar, AbstractC39718e eVar) {
            this.f93699a = lVar;
            this.f93700b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            AbstractC39713b.m80597a(this.f93700b, this.f93699a);
            C89219l.m154716b(bool, "");
            ((IAVSettingsService) this.f93699a.f93686d.getValue()).setEnablePreUploadByUser(bool.booleanValue());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e.AbstractC39719a
    /* renamed from: a */
    public final void mo69100a(AbstractC39718e eVar) {
        C89219l.m154721d(eVar, "");
        this.f93687e.f93546a.observe(eVar, new C39796d(this));
        this.f93684b.observe(eVar, new C39797e(this, eVar));
        this.f93685c.observe(eVar, new C39798f(this, eVar));
    }

    public C39792l(PrivacySettingViewModel privacySettingViewModel) {
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93687e = privacySettingViewModel;
        C1213t<Boolean> tVar = new C1213t<>();
        tVar.setValue(false);
        this.f93684b = tVar;
        C1213t<Boolean> tVar2 = new C1213t<>();
        tVar2.setValue(Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enablePreUploadByUser()));
        this.f93685c = tVar2;
        this.f93686d = C89250i.m154773a((AbstractC89171a) C39799g.f93701a);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.l$b */
    static final class C39794b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C39792l f93692a;

        /* renamed from: b */
        final /* synthetic */ C39723h f93693b;

        static {
            Covode.recordClassIndex(47524);
        }

        C39794b(C39792l lVar, C39723h hVar) {
            this.f93692a = lVar;
            this.f93693b = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C39723h hVar = this.f93693b;
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.PreUploadingViewHolder");
            C39800m mVar = (C39800m) hVar;
            if (mVar.f93702a != null) {
                Context context = mVar.f93702a;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    boolean z2 = !z;
                    C39800m.m80714a("onSelect originStatus:" + z2 + " newStatus:" + z);
                    mVar.f93705d.setValue(Boolean.valueOf(z));
                    mVar.f93704c.setValue(true);
                    AbstractC88403ab.m153596a((AbstractC88407af) new C39800m.C39801a(z)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C39800m.C39802b(mVar, z), new C39800m.C39803c(mVar, z2));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        C89219l.m154721d(hVar, "");
        super.mo69095a(hVar, i);
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bqp);
        if (!(tuxTextCell.getAccessory() instanceof AbstractC23293c.C23309j)) {
            C89219l.m154716b(tuxTextCell, "");
            Context context = tuxTextCell.getContext();
            C89219l.m154716b(context, "");
            tuxTextCell.setAccessory(new AbstractC23293c.C23309j(context));
        }
        boolean a = C89219l.m154714a((Object) this.f93684b.getValue(), (Object) true);
        tuxTextCell.setCellEnabled(mo69102c());
        tuxTextCell.setLoading(a);
        AbstractC23293c.AbstractC23296b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AbstractC23293c.AbstractC23299e eVar = (AbstractC23293c.AbstractC23299e) accessory;
        this.f93685c.getValue();
        eVar.mo37959c(C89219l.m154714a((Object) this.f93685c.getValue(), (Object) true));
        eVar.f55218a = new C39793a(this, hVar);
        eVar.mo37957a(new C39794b(this, hVar));
    }
}
