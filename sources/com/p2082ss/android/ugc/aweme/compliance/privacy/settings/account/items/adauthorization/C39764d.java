package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.C39755a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.d */
public final class C39764d extends AbstractC39771b implements AbstractC39718e.AbstractC39719a {

    /* renamed from: a */
    final C39256o f93621a;

    /* renamed from: b */
    public final PrivacySettingViewModel f93622b;

    /* renamed from: c */
    private final int f93623c = R.string.esp;

    /* renamed from: d */
    private final int f93624d = R.string.eso;

    static {
        Covode.recordClassIndex(47494);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: e */
    public final C39256o mo69120e() {
        return this.f93621a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: f */
    public final int mo69121f() {
        return this.f93623c;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final AbstractC39714c.AbstractC39715a mo69094a() {
        return new C39767c(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b
    /* renamed from: g */
    public final Integer mo69122g() {
        return Integer.valueOf(this.f93624d);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.d$a */
    static final class C39765a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39764d f93625a;

        /* renamed from: b */
        final /* synthetic */ C39723h f93626b;

        static {
            Covode.recordClassIndex(47495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39765a(C39764d dVar, C39723h hVar) {
            super(0);
            this.f93625a = dVar;
            this.f93626b = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39256o oVar = this.f93625a.f93621a;
            View view = this.f93626b.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C39699a.m80584a(oVar, context);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.d$d */
    static final class C39768d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39764d f93631a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39718e f93632b;

        static {
            Covode.recordClassIndex(47498);
        }

        C39768d(C39764d dVar, AbstractC39718e eVar) {
            this.f93631a = dVar;
            this.f93632b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC39713b.m80597a(this.f93632b, this.f93631a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.d$e */
    static final class C39769e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39764d f93633a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39718e f93634b;

        static {
            Covode.recordClassIndex(47499);
        }

        C39769e(C39764d dVar, AbstractC39718e eVar) {
            this.f93633a = dVar;
            this.f93634b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC39713b.m80597a(this.f93634b, this.f93633a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.d$f */
    static final class C39770f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39764d f93635a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39718e f93636b;

        static {
            Covode.recordClassIndex(47500);
        }

        C39770f(C39764d dVar, AbstractC39718e eVar) {
            this.f93635a = dVar;
            this.f93636b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC39713b.m80597a(this.f93636b, this.f93635a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.d$c */
    public static final class C39767c implements AbstractC39714c.AbstractC39715a {

        /* renamed from: a */
        final /* synthetic */ C39764d f93629a;

        /* renamed from: b */
        final /* synthetic */ int f93630b = R.layout.un;

        static {
            Covode.recordClassIndex(47497);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39767c(C39764d dVar) {
            this.f93629a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c.AbstractC39715a
        /* renamed from: a */
        public final C39723h mo69096a(Context context, ViewGroup viewGroup) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(context), this.f93630b, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C39755a(a, this.f93629a.f93622b);
        }
    }

    public C39764d(PrivacySettingViewModel privacySettingViewModel) {
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93622b = privacySettingViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e.AbstractC39719a
    /* renamed from: a */
    public final void mo69100a(AbstractC39718e eVar) {
        C89219l.m154721d(eVar, "");
        this.f93622b.f93550e.observe(eVar, new C39768d(this, eVar));
        this.f93622b.f93552g.observe(eVar, new C39769e(this, eVar));
        this.f93622b.f93551f.observe(eVar, new C39770f(this, eVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.d$b */
    static final class C39766b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C39764d f93627a;

        /* renamed from: b */
        final /* synthetic */ C39723h f93628b;

        static {
            Covode.recordClassIndex(47496);
        }

        C39766b(C39764d dVar, C39723h hVar) {
            this.f93627a = dVar;
            this.f93628b = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C39723h hVar = this.f93628b;
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.adauthorization.ADAuthorizationViewHolder");
            C39755a aVar = (C39755a) hVar;
            if (aVar.f93608a != null) {
                Context context = aVar.f93608a;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    if (z) {
                        C39162r.m79460a("ad_authorization_on", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").f79943a);
                    } else {
                        C39162r.m79460a("ad_authorization_off", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").f79943a);
                    }
                    C39757b.m80638a(aVar.f93608a, z, new C39755a.C39756a(aVar, z), false);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.AbstractC39771b, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        boolean z;
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
        if ((!C89219l.m154714a((Object) this.f93622b.f93550e.getValue(), (Object) true) || !C89219l.m154714a((Object) this.f93622b.f93551f.getValue(), (Object) true)) && !C89219l.m154714a((Object) this.f93622b.f93552g.getValue(), (Object) true)) {
            z = false;
        } else {
            z = true;
        }
        tuxTextCell.setCellEnabled(mo69102c());
        tuxTextCell.setLoading(z);
        AbstractC23293c.AbstractC23296b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AbstractC23293c.AbstractC23299e eVar = (AbstractC23293c.AbstractC23299e) accessory;
        eVar.mo37959c(C89219l.m154714a((Object) this.f93622b.f93551f.getValue(), (Object) true));
        eVar.f55218a = new C39765a(this, hVar);
        eVar.mo37957a(new C39766b(this, hVar));
    }
}
