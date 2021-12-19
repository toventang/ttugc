package com.p2082ss.android.ugc.aweme.specact.pendant;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3927a.C74951a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75020a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75021b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75023d;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75028h;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75060a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75061b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75062c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import com.p2082ss.android.ugc.aweme.specact.popup.p3944c.C75183a;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.BasePendant */
public abstract class BasePendant implements AbstractC33974au, AbstractC75021b, AbstractC75028h {

    /* renamed from: g */
    public static final C74943a f168479g = new C74943a((byte) 0);

    /* renamed from: a */
    public UgAwemeActivitySetting f168480a;

    /* renamed from: b */
    public ViewGroup f168481b;

    /* renamed from: c */
    public AbstractC1204m f168482c;

    /* renamed from: d */
    public int f168483d = 1;

    /* renamed from: e */
    public Aweme f168484e;

    /* renamed from: f */
    public String f168485f = "ForYou";

    /* renamed from: h */
    private final AbstractC89244h f168486h = C89250i.m154773a((AbstractC89171a) new C74944b(this));

    /* renamed from: i */
    private final AbstractC89244h f168487i = C89250i.m154773a((AbstractC89171a) new C74946d(this));

    static {
        Covode.recordClassIndex(87811);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC75020a mo118047a() {
        return (AbstractC75020a) this.f168486h.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AbstractC75023d mo118051b() {
        return (AbstractC75023d) this.f168487i.getValue();
    }

    /* renamed from: c */
    public boolean mo118054c() {
        return true;
    }

    /* renamed from: d */
    public abstract void mo118056d(UgAwemeActivitySetting ugAwemeActivitySetting);

    /* renamed from: h */
    public abstract boolean mo118060h();

    /* renamed from: i */
    public abstract void mo118061i();

    /* renamed from: j */
    public abstract void mo118062j();

    /* renamed from: k */
    public abstract AbstractC75020a mo118063k();

    /* renamed from: l */
    public abstract AbstractC75023d mo118064l();

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestory();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.BasePendant$a */
    public static final class C74943a {
        static {
            Covode.recordClassIndex(87812);
        }

        private C74943a() {
        }

        public /* synthetic */ C74943a(byte b) {
            this();
        }
    }

    /* renamed from: e */
    public void mo118057e() {
        mo118085s();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.BasePendant$b */
    static final class C74944b extends AbstractC89220m implements AbstractC89171a<AbstractC75020a> {

        /* renamed from: a */
        final /* synthetic */ BasePendant f168488a;

        static {
            Covode.recordClassIndex(87813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74944b(BasePendant basePendant) {
            super(0);
            this.f168488a = basePendant;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC75020a invoke() {
            return this.f168488a.mo118063k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.BasePendant$d */
    static final class C74946d extends AbstractC89220m implements AbstractC89171a<AbstractC75023d> {

        /* renamed from: a */
        final /* synthetic */ BasePendant f168490a;

        static {
            Covode.recordClassIndex(87815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74946d(BasePendant basePendant) {
            super(0);
            this.f168490a = basePendant;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC75023d invoke() {
            AbstractC75023d l = this.f168490a.mo118064l();
            l.mo118120a(this.f168490a);
            return l;
        }
    }

    /* renamed from: p */
    private boolean mo118082p() {
        if (this.f168482c == null || this.f168481b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private void mo118085s() {
        if (m131546t()) {
            mo118047a().mo118138c();
        }
    }

    /* renamed from: t */
    private boolean m131546t() {
        return mo118047a().mo118132a();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75021b
    /* renamed from: d */
    public final void mo118055d() {
        if (this.f168480a != null) {
            mo118057e();
            this.f168480a = null;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestory() {
        m131547u();
        mo118085s();
        this.f168481b = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.BasePendant$c */
    public static final class C74945c implements C75069i.AbstractC75070a {

        /* renamed from: a */
        final /* synthetic */ BasePendant f168489a;

        static {
            Covode.recordClassIndex(87814);
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i.AbstractC75070a
        /* renamed from: a */
        public final void mo118066a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i.AbstractC75070a
        /* renamed from: a */
        public final void mo118067a(int i, String str, Boolean bool, Integer num) {
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i.AbstractC75070a
        /* renamed from: b */
        public final void mo118069b() {
            C75183a.C75184a.m131921a().mo118341a(this.f168489a.mo118059g(), C75062c.m131823a());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74945c(BasePendant basePendant) {
            this.f168489a = basePendant;
        }

        @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75069i.AbstractC75070a
        /* renamed from: a */
        public final void mo118068a(List<C75126k.C75135i> list) {
            C74951a.C74952a.m131613a().mo118090a(list);
        }
    }

    /* renamed from: r */
    private void mo118084r() {
        if (mo118079n()) {
            AbstractC75023d b = mo118051b();
            Context f = mo118058f();
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f168480a;
            if (ugAwemeActivitySetting == null) {
                C89219l.m154715b();
            }
            b.mo118119a(f, ugAwemeActivitySetting);
        }
    }

    /* renamed from: u */
    private final void m131547u() {
        AbstractC1196i lifecycle;
        AbstractC1204m mVar = this.f168482c;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.mo4013b(this);
        }
        this.f168482c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Activity mo118059g() {
        AbstractC1204m mVar = this.f168482c;
        if (mVar instanceof Activity) {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type android.app.Activity");
            return (Activity) mVar;
        } else if (!(mVar instanceof Fragment)) {
            return null;
        } else {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            return ((Fragment) mVar).getActivity();
        }
    }

    /* renamed from: n */
    private boolean mo118079n() {
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f168480a;
        if (ugAwemeActivitySetting == null || C75060a.m131800c(ugAwemeActivitySetting)) {
            return false;
        }
        UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f168480a;
        if (ugAwemeActivitySetting2 == null) {
            C89219l.m154715b();
        }
        if (C75060a.m131796a(ugAwemeActivitySetting2) && C75060a.m131814p(this.f168480a).length() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean mo118083q() {
        if (!mo118079n()) {
            return false;
        }
        if (!mo118054c()) {
            return true;
        }
        AbstractC75023d b = mo118051b();
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f168480a;
        if (ugAwemeActivitySetting == null) {
            C89219l.m154715b();
        }
        String activityId = ugAwemeActivitySetting.getActivityId();
        C89219l.m154716b(activityId, "");
        return b.mo118122a(activityId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Context mo118058f() {
        Context a;
        AbstractC1204m mVar = this.f168482c;
        if (mVar instanceof Activity) {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type android.content.Context");
            a = (Context) mVar;
        } else if (mVar instanceof Fragment) {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            a = ((Fragment) mVar).getContext();
        } else {
            a = C17867d.m33078a();
        }
        if (a == null) {
            return C17867d.m33078a();
        }
        return a;
    }

    /* renamed from: o */
    private final void mo118080o() {
        if (!mo118079n()) {
            LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi, "");
            localTestApi.getSpecActDebugService().mo106976a("SpecPendant", "init pendant error: setting is not ready");
            return;
        }
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f168480a;
        if (ugAwemeActivitySetting == null) {
            C89219l.m154715b();
        }
        mo118056d(ugAwemeActivitySetting);
        if (!mo118082p()) {
            LocalTestApi localTestApi2 = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi2, "");
            localTestApi2.getSpecActDebugService().mo106976a("SpecPendant", "init pendant error: page is not ready");
        } else if (!mo118083q()) {
            LocalTestApi localTestApi3 = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi3, "");
            localTestApi3.getSpecActDebugService().mo106976a("SpecPendant", "init pendant error: resource is not ready");
            mo118084r();
        } else {
            ViewGroup viewGroup = this.f168481b;
            if (viewGroup == null) {
                C89219l.m154715b();
            }
            m131539a(viewGroup);
            C75061b.m131821a(6, this.f168483d);
            if (!mo118060h()) {
                mo118061i();
            } else {
                mo118062j();
            }
        }
    }

    /* renamed from: a */
    public final void mo118050a(String str) {
        C89219l.m154721d(str, "");
        this.f168485f = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75028h
    /* renamed from: c */
    public final void mo118053c(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        if (!m131546t()) {
            mo118080o();
        }
    }

    /* renamed from: a */
    private void m131539a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        if (!m131546t()) {
            mo118047a().mo118125a(viewGroup);
            mo118047a().mo118126a(this.f168480a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75028h
    /* renamed from: b */
    public final void mo118052b(UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(ugAwemeActivitySetting, "");
        LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
        C89219l.m154716b(localTestApi, "");
        localTestApi.getSpecActDebugService().mo106976a("SpecPendant", "onResourceLoadFailure, request task/page again");
        C75069i a = C75069i.C75071b.m131841a();
        Activity g = mo118059g();
        if (g == null) {
            C89219l.m154715b();
        }
        a.mo118183a(g, new C74945c(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75021b
    /* renamed from: a */
    public final void mo118049a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (mo118079n()) {
            mo118055d();
        }
        this.f168480a = ugAwemeActivitySetting;
        mo118080o();
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75021b
    /* renamed from: a */
    public final void mo118048a(AbstractC1204m mVar, ViewGroup viewGroup) {
        AbstractC1196i lifecycle;
        if (mo118082p()) {
            if (!C89219l.m154714a(this.f168482c, mVar)) {
                m131547u();
                this.f168481b = null;
                mo118085s();
            } else {
                return;
            }
        }
        this.f168482c = mVar;
        this.f168481b = viewGroup;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.mo4012a(this);
        }
        mo118080o();
    }
}
