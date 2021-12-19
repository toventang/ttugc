package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39257p;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a */
public abstract class AbstractC39856a<VM extends BasePrivacySettingViewModel> extends AbstractC39713b {

    /* renamed from: a */
    public final VM f93806a;

    /* renamed from: b */
    private final AbstractC89244h f93807b = C89250i.m154773a((AbstractC89171a) new C39865i(this));

    static {
        Covode.recordClassIndex(47589);
    }

    /* renamed from: a */
    public boolean mo69147a(int i) {
        return false;
    }

    /* renamed from: b */
    public final C39256o mo69148b() {
        return (C39256o) this.f93807b.getValue();
    }

    /* renamed from: c */
    public abstract String mo69150c();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$a */
    public static final class C39857a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39856a f93808a;

        static {
            Covode.recordClassIndex(47590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39857a(AbstractC39856a aVar) {
            super(0);
            this.f93808a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39699a.m80584a(this.f93808a.mo69148b(), this.f93808a.f93566d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$d */
    public static final class C39860d implements AbstractC39724i {

        /* renamed from: a */
        final /* synthetic */ AbstractC39856a f93809a;

        /* renamed from: b */
        final /* synthetic */ boolean f93810b = false;

        static {
            Covode.recordClassIndex(47593);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
        /* renamed from: d */
        public final boolean mo69103d() {
            return C39699a.m80581a(this.f93809a.mo69148b()).f93536b;
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
        /* renamed from: c */
        public final boolean mo69102c() {
            if (!C39699a.m80581a(this.f93809a.mo69148b()).f93535a) {
                return false;
            }
            if (!this.f93810b || !C39631a.m80486b()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39860d(AbstractC39856a aVar) {
            this.f93809a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$i */
    static final class C39865i extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39856a f93816a;

        static {
            Covode.recordClassIndex(47598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39865i(AbstractC39856a aVar) {
            super(0);
            this.f93816a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, this.f93816a.mo69150c());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$e */
    public static final class C39861e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39856a f93811a;

        /* renamed from: b */
        final /* synthetic */ int f93812b;

        static {
            Covode.recordClassIndex(47594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39861e(AbstractC39856a aVar, int i) {
            super(0);
            this.f93811a = aVar;
            this.f93812b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39257p pVar;
            C39256o b = this.f93811a.mo69148b();
            if (b != null) {
                pVar = b.getTargetRestrictionOption(Integer.valueOf(this.f93812b));
            } else {
                pVar = null;
            }
            C39699a.m80585a(pVar, this.f93811a.f93566d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$h */
    public static final class C39864h implements AbstractC39724i {

        /* renamed from: a */
        final /* synthetic */ AbstractC39856a f93813a;

        /* renamed from: b */
        final /* synthetic */ int f93814b;

        /* renamed from: c */
        final /* synthetic */ boolean f93815c;

        static {
            Covode.recordClassIndex(47597);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
        /* renamed from: d */
        public final boolean mo69103d() {
            C39257p pVar;
            C39256o b = this.f93813a.mo69148b();
            if (b != null) {
                pVar = b.getTargetRestrictionOption(Integer.valueOf(this.f93814b));
            } else {
                pVar = null;
            }
            return C39699a.m80582a(pVar).f93536b;
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
        /* renamed from: c */
        public final boolean mo69102c() {
            C39257p pVar;
            C39256o b = this.f93813a.mo69148b();
            if (b != null) {
                pVar = b.getTargetRestrictionOption(Integer.valueOf(this.f93814b));
            } else {
                pVar = null;
            }
            if (!C39699a.m80582a(pVar).f93535a || !C39699a.m80586b(this.f93813a.mo69148b()).f93535a) {
                return false;
            }
            if (!this.f93815c || !C39631a.m80486b()) {
                return true;
            }
            return false;
        }

        C39864h(AbstractC39856a aVar, int i, boolean z) {
            this.f93813a = aVar;
            this.f93814b = i;
            this.f93815c = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b
    public int getItemCount() {
        if (!C39699a.m80586b(mo69148b()).f93536b) {
            return 0;
        }
        return super.getItemCount();
    }

    /* renamed from: d */
    public String mo69151d() {
        Integer valueOf;
        C39256o b = mo69148b();
        if (b == null || (valueOf = Integer.valueOf(b.getTipsType())) == null || valueOf.intValue() != 1) {
            return null;
        }
        return this.f93566d.getString(R.string.fko);
    }

    /* renamed from: b */
    public void mo69149b(int i) {
        this.f93806a.mo69140a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$c */
    public static final /* synthetic */ class C39859c extends C89217j implements AbstractC89172b<Integer, C89391z> {
        static {
            Covode.recordClassIndex(47592);
        }

        C39859c(AbstractC39856a aVar) {
            super(1, aVar, AbstractC39856a.class, "onSelect", "onSelect(I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            ((AbstractC39856a) this.receiver).mo69149b(num.intValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$g */
    public static final /* synthetic */ class C39863g extends C89217j implements AbstractC89172b<Integer, C89391z> {
        static {
            Covode.recordClassIndex(47596);
        }

        C39863g(AbstractC39856a aVar) {
            super(1, aVar, AbstractC39856a.class, "onSelect", "onSelect(I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            ((AbstractC39856a) this.receiver).mo69149b(num.intValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$b */
    public static final /* synthetic */ class C39858b extends C89217j implements AbstractC89172b<Integer, Boolean> {
        static {
            Covode.recordClassIndex(47591);
        }

        C39858b(AbstractC39856a aVar) {
            super(1, aVar, AbstractC39856a.class, "interceptSelect", "interceptSelect(I)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(((AbstractC39856a) this.receiver).mo69147a(num.intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a$f */
    public static final /* synthetic */ class C39862f extends C89217j implements AbstractC89172b<Integer, Boolean> {
        static {
            Covode.recordClassIndex(47595);
        }

        C39862f(AbstractC39856a aVar) {
            super(1, aVar, AbstractC39856a.class, "interceptSelect", "interceptSelect(I)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(((AbstractC39856a) this.receiver).mo69147a(num.intValue()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC39856a(VM vm, Context context) {
        super(context);
        C89219l.m154721d(vm, "");
        C89219l.m154721d(context, "");
        this.f93806a = vm;
        if ((context instanceof Activity) && context != null) {
            vm.f93795a = new WeakReference<>(context);
        }
        String c = mo69150c();
        C89219l.m154721d(c, "");
        vm.f93796b = c;
    }

    /* renamed from: a */
    public static /* synthetic */ C39901g m80771a(AbstractC39856a aVar, C39901g gVar) {
        C89219l.m154721d(gVar, "");
        gVar.mo69159a(aVar.f93806a);
        gVar.mo69163b(new C39857a(aVar));
        gVar.mo69164b(new C39858b(aVar));
        gVar.mo69161a(new C39859c(aVar));
        gVar.mo69158a(new C39860d(aVar));
        return gVar;
    }

    /* renamed from: a */
    public final C39901g mo69146a(C39901g gVar, int i, boolean z) {
        C89219l.m154721d(gVar, "");
        gVar.mo69159a(this.f93806a);
        gVar.mo69163b(new C39861e(this, i));
        gVar.mo69164b(new C39862f(this));
        gVar.mo69161a(new C39863g(this));
        gVar.mo69158a(new C39864h(this, i, z));
        return gVar;
    }
}
