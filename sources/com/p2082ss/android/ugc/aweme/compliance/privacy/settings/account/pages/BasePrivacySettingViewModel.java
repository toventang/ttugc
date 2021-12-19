package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.app.Activity;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel */
public abstract class BasePrivacySettingViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public WeakReference<Activity> f93795a;

    /* renamed from: b */
    public String f93796b = "";

    /* renamed from: c */
    public Integer f93797c;

    /* renamed from: d */
    public final C1213t<Integer> f93798d;

    /* renamed from: e */
    public final C1213t<Boolean> f93799e;

    static {
        Covode.recordClassIndex(47584);
    }

    /* renamed from: b */
    public abstract AbstractC88979t<BaseResponse> mo69142b(int i);

    public BasePrivacySettingViewModel() {
        C1213t<Integer> tVar = new C1213t<>();
        tVar.setValue(-1);
        this.f93798d = tVar;
        C1213t<Boolean> tVar2 = new C1213t<>();
        tVar2.setValue(false);
        this.f93799e = tVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel$c */
    public static final class C39855c implements AbstractC88986z<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ BasePrivacySettingViewModel f93804a;

        /* renamed from: b */
        final /* synthetic */ int f93805b;

        static {
            Covode.recordClassIndex(47587);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            C89219l.m154721d(baseResponse2, "");
            this.f93804a.f93797c = null;
            this.f93804a.f93799e.postValue(false);
            this.f93804a.mo69141a(this.f93805b, baseResponse2);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            Activity activity;
            C89219l.m154721d(th, "");
            WeakReference<Activity> weakReference = this.f93804a.f93795a;
            if (!(weakReference == null || (activity = weakReference.get()) == null)) {
                C89219l.m154716b(activity, "");
                new C23144b(activity).mo37640e(R.string.dcr).mo37637b();
            }
            Integer num = this.f93804a.f93797c;
            if (num != null) {
                num.intValue();
                this.f93804a.f93798d.postValue(this.f93804a.f93797c);
                this.f93804a.f93797c = null;
            }
            this.f93804a.f93799e.postValue(false);
            BasePrivacySettingViewModel basePrivacySettingViewModel = this.f93804a;
            C89219l.m154721d(th, "");
            C40043a.m80998a("PRIVACY_SETTING_ALOG", new C39853a(basePrivacySettingViewModel, th));
        }

        C39855c(BasePrivacySettingViewModel basePrivacySettingViewModel, int i) {
            this.f93804a = basePrivacySettingViewModel;
            this.f93805b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel$a */
    static final class C39853a extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        final /* synthetic */ BasePrivacySettingViewModel f93800a;

        /* renamed from: b */
        final /* synthetic */ Throwable f93801b;

        static {
            Covode.recordClassIndex(47585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39853a(BasePrivacySettingViewModel basePrivacySettingViewModel, Throwable th) {
            super(1);
            this.f93800a = basePrivacySettingViewModel;
            this.f93801b = th;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            C33743c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C40043a.m80991a(cVar2, "Change " + this.f93800a.f93796b + "} setting fail");
            C40043a.m81000b(cVar2, C40043a.m80996a(this.f93801b));
            return C40043a.m80992a(cVar2, "cause", C40043a.m81001b(this.f93801b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel$b */
    public static final class C39854b extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        final /* synthetic */ BasePrivacySettingViewModel f93802a;

        /* renamed from: b */
        final /* synthetic */ BaseResponse f93803b;

        static {
            Covode.recordClassIndex(47586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39854b(BasePrivacySettingViewModel basePrivacySettingViewModel, BaseResponse baseResponse) {
            super(1);
            this.f93802a = basePrivacySettingViewModel;
            this.f93803b = baseResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            C33743c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C40043a.m80991a(cVar2, "Change " + this.f93802a.f93796b + " setting success");
            return C40043a.m81000b(cVar2, C40043a.m80993a(this.f93803b));
        }
    }

    /* renamed from: a */
    public final void mo69140a(int i) {
        Integer value = this.f93798d.getValue();
        if (value == null || value.intValue() != i) {
            mo69142b(i).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C39855c(this, i));
            if (this.f93797c == null) {
                this.f93797c = this.f93798d.getValue();
            }
            this.f93799e.postValue(true);
            this.f93798d.postValue(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public void mo69141a(int i, BaseResponse baseResponse) {
        C89219l.m154721d(baseResponse, "");
        C40043a.m80998a("PRIVACY_SETTING_ALOG", new C39854b(this, baseResponse));
    }
}
