package com.p2082ss.android.ugc.aweme.account;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1642e.C22359a;
import com.p2082ss.android.ugc.aweme.C35333c;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.C43301e;
import com.p2082ss.android.ugc.aweme.C81775y;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.login.p2257b.C31893a;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32847a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32853e;
import com.p2082ss.android.ugc.aweme.account.util.C33052u;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.d */
public final class C31604d {

    /* renamed from: a */
    public static final C31604d f75629a = new C31604d();

    private C31604d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$a */
    public static final class C31605a implements AbstractC31598c {

        /* renamed from: a */
        final /* synthetic */ Bundle f75630a;

        /* renamed from: b */
        final /* synthetic */ Activity f75631b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f75632c;

        static {
            Covode.recordClassIndex(38334);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.d$a$a */
        public static final class C31606a implements C32853e.AbstractC32854a {

            /* renamed from: a */
            final /* synthetic */ C31605a f75633a;

            static {
                Covode.recordClassIndex(38335);
            }

            @Override // com.p2082ss.android.ugc.aweme.account.p2274n.C32853e.AbstractC32854a
            /* renamed from: a */
            public final void mo57639a() {
                this.f75633a.f75632c.invoke();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C31606a(C31605a aVar) {
                this.f75633a = aVar;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.account.AbstractC31598c
        /* renamed from: a */
        public final void mo57615a() {
            Bundle bundle = this.f75630a;
            if (bundle == null) {
                C89219l.m154715b();
            }
            String str = "";
            C89219l.m154721d(bundle, str);
            String string = bundle.getString("gms_store_id");
            String string2 = bundle.getString("gms_store_pwd");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                IAccountUserService e = C36085cj.f85262b.mo57069e();
                C89219l.m154716b(e, str);
                if (!e.isChildrenMode()) {
                    C22359a aVar = new C22359a();
                    aVar.f52836a = string;
                    aVar.f52838c = string2;
                    if (C36085cj.m73552f() != null) {
                        User f = C36085cj.m73552f();
                        C89219l.m154716b(f, str);
                        aVar.f52837b = f.getNickname();
                        if (f.getAvatarThumb() != null) {
                            UrlModel avatarThumb = f.getAvatarThumb();
                            C89219l.m154716b(avatarThumb, str);
                            if (avatarThumb.getUrlList() != null) {
                                UrlModel avatarThumb2 = f.getAvatarThumb();
                                C89219l.m154716b(avatarThumb2, str);
                                if (!avatarThumb2.getUrlList().isEmpty()) {
                                    UrlModel avatarThumb3 = f.getAvatarThumb();
                                    C89219l.m154716b(avatarThumb3, str);
                                    str = avatarThumb3.getUrlList().get(0);
                                }
                            }
                        }
                        aVar.f52839d = str;
                    }
                    C32853e.m67447a(this.f75631b, this.f75630a, new C31606a(this), aVar);
                    return;
                }
            }
            this.f75632c.invoke();
        }

        C31605a(Bundle bundle, Activity activity, AbstractC89171a aVar) {
            this.f75630a = bundle;
            this.f75631b = activity;
            this.f75632c = aVar;
        }
    }

    static {
        Covode.recordClassIndex(38333);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$f */
    static final class C31611f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f75638a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f75639b;

        /* renamed from: c */
        final /* synthetic */ Bundle f75640c;

        static {
            Covode.recordClassIndex(38340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31611f(List list, AbstractC89172b bVar, Bundle bundle) {
            super(0);
            this.f75638a = list;
            this.f75639b = bVar;
            this.f75640c = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (!this.f75638a.isEmpty()) {
                ((AbstractC31598c) this.f75638a.remove(0)).mo57615a();
            } else if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                AbstractC89172b bVar = this.f75639b;
                C1731i<Bundle> a = C35333c.m72321a(this.f75640c);
                C89219l.m154716b(a, "");
                bVar.invoke(a);
            } else {
                throw new IllegalArgumentException("Need to run on UI Thread".toString());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$d */
    static final class C31609d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Bundle f75636a;

        static {
            Covode.recordClassIndex(38338);
        }

        C31609d(Bundle bundle) {
            this.f75636a = bundle;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            return C33052u.m67706b(this.f75636a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$e */
    static final class C31610e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f75637a;

        static {
            Covode.recordClassIndex(38339);
        }

        C31610e(AbstractC89171a aVar) {
            this.f75637a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C31893a> iVar) {
            this.f75637a.invoke();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$g */
    public static final class C31612g<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Bundle f75641a;

        static {
            Covode.recordClassIndex(38341);
        }

        public C31612g(Bundle bundle) {
            this.f75641a = bundle;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            return C33052u.m67707c(this.f75641a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$h */
    public static final class C31613h<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Bundle f75642a;

        static {
            Covode.recordClassIndex(38342);
        }

        public C31613h(Bundle bundle) {
            this.f75642a = bundle;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            return C33052u.m67706b(this.f75642a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$b */
    static final class C31607b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Bundle f75634a;

        static {
            Covode.recordClassIndex(38336);
        }

        C31607b(Bundle bundle) {
            this.f75634a = bundle;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Bundle bundle = this.f75634a;
            if (bundle == null) {
                C89219l.m154715b();
            }
            return C33052u.m67700a(bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$c */
    static final class C31608c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ Bundle f75635a;

        static {
            Covode.recordClassIndex(38337);
        }

        C31608c(Bundle bundle) {
            this.f75635a = bundle;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Bundle bundle = this.f75635a;
            if (bundle == null) {
                C89219l.m154715b();
            }
            return C33052u.m67707c(bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d$i */
    public static final class C31614i<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ IAccountUserService f75643a;

        /* renamed from: b */
        final /* synthetic */ Bundle f75644b;

        static {
            Covode.recordClassIndex(38343);
        }

        public C31614i(IAccountUserService iAccountUserService, Bundle bundle) {
            this.f75643a = iAccountUserService;
            this.f75644b = bundle;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            IAccountUserService iAccountUserService = this.f75643a;
            C89219l.m154716b(iAccountUserService, "");
            C36085cj.m73546a(true, iAccountUserService.getCurUser());
            Bundle bundle = this.f75644b;
            return C81775y.m141657a(bundle, null).mo5534a(new C43301e(bundle), C1731i.f5564c, null);
        }
    }

    /* renamed from: a */
    public static final void m65915a(Bundle bundle, Activity activity, AbstractC89172b<? super C1731i<Bundle>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        if (bundle == null) {
            C1731i a = C1731i.m5632a(new Exception("Bundle is empty"));
            C89219l.m154716b(a, "");
            bVar.invoke(a);
        }
        ArrayList arrayList = new ArrayList();
        C31611f fVar = new C31611f(arrayList, bVar, bundle);
        arrayList.add(new C31605a(bundle, activity, fVar));
        if (!TextUtils.isEmpty(TwoStepAuthApi.f76630a)) {
            String str = TwoStepAuthApi.f76630a;
            if (str == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(str, "");
            TwoStepAuthApi.m66501a().addAuthDevice(str);
            TwoStepAuthApi.f76630a = null;
        }
        C1731i b = C1731i.m5640b(C32847a.CallableC32848a.f78222a, C1731i.f5562a);
        C89219l.m154716b(b, "");
        b.mo5532a((AbstractC1729g) new C31607b(bundle)).mo5537b((AbstractC1729g) new C31608c(bundle)).mo5537b((AbstractC1729g) new C31609d(bundle)).mo5534a(new C31610e(fVar), C1731i.f5564c, null);
    }
}
