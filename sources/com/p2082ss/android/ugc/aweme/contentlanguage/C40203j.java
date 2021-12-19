package com.p2082ss.android.ugc.aweme.contentlanguage;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.AbstractC40187b;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Collection;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.j */
public final class C40203j {

    /* renamed from: e */
    public static final AbstractC89244h f94393e = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C40205b.f94400a);

    /* renamed from: f */
    public static final C40204a f94394f = new C40204a((byte) 0);

    /* renamed from: a */
    public final C40225o f94395a;

    /* renamed from: b */
    public boolean f94396b;

    /* renamed from: c */
    public String f94397c;

    /* renamed from: d */
    public View$OnClickListenerC40200i f94398d;

    /* renamed from: g */
    private final AbstractC89244h f94399g;

    /* renamed from: a */
    public final LanguageApi mo69405a() {
        return (LanguageApi) this.f94399g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.j$a */
    public static final class C40204a {
        static {
            Covode.recordClassIndex(47999);
        }

        /* renamed from: a */
        public static C40203j m81323a() {
            return (C40203j) C40203j.f94393e.getValue();
        }

        private C40204a() {
        }

        public /* synthetic */ C40204a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.j$e */
    public static final class C40208e implements AbstractC88986z<BaseResponse> {
        static {
            Covode.recordClassIndex(48003);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C40208e() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            C89219l.m154721d(baseResponse2, "");
            if (baseResponse2.status_code == 0) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                if (currentUser != null) {
                    currentUser.setContentLanguageDialogShown(true);
                }
                C31575b.m65865g().forceSave();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.j$b */
    static final class C40205b extends AbstractC89220m implements AbstractC89171a<C40203j> {

        /* renamed from: a */
        public static final C40205b f94400a = new C40205b();

        static {
            Covode.recordClassIndex(48000);
        }

        C40205b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40203j invoke() {
            return new C40203j((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.j$c */
    static final class C40206c extends AbstractC89220m implements AbstractC89171a<LanguageApi> {

        /* renamed from: a */
        public static final C40206c f94401a = new C40206c();

        static {
            Covode.recordClassIndex(48001);
        }

        C40206c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LanguageApi invoke() {
            return AbstractC40187b.m81299a();
        }
    }

    /* renamed from: d */
    public final void mo69410d() {
        if (!this.f94395a.mo69427c()) {
            this.f94395a.mo69428d();
        }
    }

    static {
        Covode.recordClassIndex(47998);
    }

    private C40203j() {
        this.f94395a = new C40225o();
        this.f94397c = "";
        this.f94399g = C89250i.m154773a((AbstractC89171a) C40206c.f94401a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.j$f */
    public static final class CallableC40209f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C40203j f94402a;

        /* renamed from: b */
        final /* synthetic */ Context f94403b;

        static {
            Covode.recordClassIndex(48004);
        }

        CallableC40209f(C40203j jVar, Context context) {
            this.f94402a = jVar;
            this.f94403b = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            View$OnClickListenerC40200i iVar;
            this.f94402a.f94398d = new View$OnClickListenerC40200i(this.f94403b, this.f94402a.f94397c);
            View$OnClickListenerC40200i iVar2 = this.f94402a.f94398d;
            if (iVar2 != null) {
                iVar2.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.contentlanguage.C40203j.CallableC40209f.DialogInterface$OnDismissListenerC402101 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC40209f f94404a;

                    static {
                        Covode.recordClassIndex(48005);
                    }

                    {
                        this.f94404a = r1;
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                    }
                });
            }
            View$OnClickListenerC40200i iVar3 = this.f94402a.f94398d;
            if (!(iVar3 == null || iVar3.isShowing() || (iVar = this.f94402a.f94398d) == null)) {
                iVar.show();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final boolean mo69408b() {
        if (C80064f.m138815a(C80061e.f179403k.mo123508a())) {
            if (C80580in.m139692f()) {
                return true;
            }
            return false;
        } else if (!TextUtils.isEmpty(this.f94395a.mo69426b()) || this.f94395a.mo69425a()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo69409c() {
        if (C80064f.m138815a(C80061e.f179403k.mo123508a())) {
            mo69405a().setContentLanguageDialogShown("content_language_already_popup").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40208e());
        } else {
            this.f94395a.mo69424a(true);
        }
    }

    public /* synthetic */ C40203j(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.j$d */
    public static final class C40207d implements AbstractC88986z<BaseResponse> {
        static {
            Covode.recordClassIndex(48002);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            C89219l.m154721d(baseResponse, "");
            ContentLanguageServiceImpl.m81266f().mo69372a((AbstractC68342a) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.j$g */
    public static final class C40211g implements AbstractC88986z<BaseResponse> {
        static {
            Covode.recordClassIndex(48006);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            ContentLanguageServiceImpl.m81266f().mo69372a((AbstractC68342a) null);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            C89219l.m154721d(baseResponse2, "");
            if (baseResponse2.status_code == 0) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
                currentUser.setContentLanguageDialogShown(true);
                C80061e.f179403k.mo123511b(currentUser);
            }
            ContentLanguageServiceImpl.m81266f().mo69372a((AbstractC68342a) null);
        }
    }

    /* renamed from: c */
    private final void m81315c(Context context) {
        C1731i.m5640b(new CallableC40209f(this, context), C1731i.f5564c);
    }

    /* renamed from: b */
    public final void mo69407b(Context context) {
        C89219l.m154721d(context, "");
        if (this.f94396b) {
            mo69406a(context);
        }
    }

    /* renamed from: d */
    private final boolean m81316d(Context context) {
        Pair<Boolean, String> a = ContentLanguageServiceImpl.m81266f().mo69368a(context);
        String str = (String) a.second;
        if (str == null) {
            str = "";
        }
        this.f94397c = str;
        Object obj = a.first;
        C89219l.m154716b(obj, "");
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: a */
    public final void mo69406a(Context context) {
        C89219l.m154721d(context, "");
        mo69410d();
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        if (!C13603b.m24435a((Collection) iESSettingsProxy.getContentLanguageGuideCodes()) && !mo69408b()) {
            if (!m81316d(context)) {
                this.f94396b = true;
                return;
            }
            IContentLanguageService f = ContentLanguageServiceImpl.m81266f();
            C89219l.m154716b(f, "");
            int a = f.mo69367a();
            if (a <= 5 || a > 9) {
                m81315c(context);
            }
            this.f94396b = false;
        }
    }
}
