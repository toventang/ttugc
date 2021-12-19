package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.p3375a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.C57878a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api.C57883a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api.TeenageModeApi;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a */
public final class C57879a {

    /* renamed from: a */
    public AbstractC57877a f131955a;

    /* renamed from: b */
    private final TeenageModeApi f131956b;

    static {
        Covode.recordClassIndex(67890);
    }

    public C57879a() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C57345a.f130717a).create(TeenageModeApi.class);
        C89219l.m154716b(create, "");
        this.f131956b = (TeenageModeApi) create;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a$a */
    public static final class C57880a implements AbstractC88986z<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C57879a f131957a;

        static {
            Covode.recordClassIndex(67891);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57880a(C57879a aVar) {
            this.f131957a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            C89219l.m154721d(baseResponse, "");
            AbstractC57877a aVar = this.f131957a.f131955a;
            if (aVar != null) {
                aVar.mo95179b();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            String errorMsg;
            C89219l.m154721d(th, "");
            if (th instanceof C34485a) {
                C34485a aVar = (C34485a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = C17867d.m33078a().getString(R.string.dcp);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                new C79459a(C17867d.m33078a()).mo123052a(errorMsg).mo123053a();
            } else {
                new C79459a(C17867d.m33078a()).mo123050a(R.string.dcp).mo123053a();
            }
            AbstractC57877a aVar2 = this.f131957a.f131955a;
            if (aVar2 != null) {
                aVar2.mo95178a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.a.a$b */
    public static final class C57881b implements AbstractC88986z<C57883a> {

        /* renamed from: a */
        final /* synthetic */ C57879a f131958a;

        static {
            Covode.recordClassIndex(67892);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57881b(C57879a aVar) {
            this.f131958a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C57883a aVar) {
            C89219l.m154721d(aVar, "");
            AbstractC57877a aVar2 = this.f131958a.f131955a;
            if (aVar2 != null) {
                aVar2.mo95179b();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            String errorMsg;
            C89219l.m154721d(th, "");
            if (th instanceof C34485a) {
                C34485a aVar = (C34485a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = C17867d.m33078a().getString(R.string.dcp);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                new C79459a(C17867d.m33078a()).mo123052a(errorMsg).mo123053a();
            } else {
                new C79459a(C17867d.m33078a()).mo123050a(R.string.dcp).mo123053a();
            }
            AbstractC57877a aVar2 = this.f131958a.f131955a;
            if (aVar2 != null) {
                aVar2.mo95178a();
            }
        }
    }

    /* renamed from: a */
    public final void mo95197a(AbstractC57877a aVar) {
        C89219l.m154721d(aVar, "");
        this.f131955a = aVar;
    }

    /* renamed from: a */
    public final void mo95198a(String str) {
        C89219l.m154721d(str, "");
        this.f131956b.checkTeenagePassword(C57878a.m104634a(str)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C57880a(this));
    }

    /* renamed from: b */
    public final void mo95199b(String str) {
        C89219l.m154721d(str, "");
        this.f131956b.setMinorSettings(str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C57881b(this));
    }
}
