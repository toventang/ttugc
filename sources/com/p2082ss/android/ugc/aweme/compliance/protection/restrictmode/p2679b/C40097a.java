package com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2679b;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39236g;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.api.C40096a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.api.DigitalWellbeingApi;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a */
public final class C40097a {

    /* renamed from: a */
    public AbstractC39236g f94166a;

    /* renamed from: b */
    private final DigitalWellbeingApi f94167b;

    static {
        Covode.recordClassIndex(47874);
    }

    public C40097a() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(DigitalWellbeingApi.class);
        C89219l.m154716b(create, "");
        this.f94167b = (DigitalWellbeingApi) create;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a$a */
    public static final class C40098a implements AbstractC88986z<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C40097a f94168a;

        static {
            Covode.recordClassIndex(47875);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40098a(C40097a aVar) {
            this.f94168a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            C89219l.m154721d(baseResponse, "");
            AbstractC39236g gVar = this.f94168a.f94166a;
            if (gVar != null) {
                gVar.mo68126b();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            String errorMsg;
            C89219l.m154721d(th, "");
            Fragment fragment = null;
            if (th instanceof C34485a) {
                C34485a aVar = (C34485a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = C17867d.m33078a().getString(R.string.dcp);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                AbstractC39236g gVar = this.f94168a.f94166a;
                if (gVar instanceof Fragment) {
                    fragment = gVar;
                }
                Fragment fragment2 = (Fragment) fragment;
                if (fragment2 != null) {
                    new C23144b(fragment2).mo37635a(errorMsg).mo37637b();
                }
            } else {
                AbstractC39236g gVar2 = this.f94168a.f94166a;
                if (gVar2 instanceof Fragment) {
                    fragment = gVar2;
                }
                Fragment fragment3 = fragment;
                if (fragment3 != null) {
                    new C23144b(fragment3).mo37640e(R.string.dcp).mo37637b();
                }
            }
            AbstractC39236g gVar3 = this.f94168a.f94166a;
            if (gVar3 != null) {
                gVar3.mo68125a();
            }
        }
    }

    /* renamed from: a */
    public final void mo69236a(AbstractC39236g gVar) {
        C89219l.m154721d(gVar, "");
        this.f94166a = gVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.b.a$b */
    public static final class C40099b implements AbstractC88986z<C40096a> {

        /* renamed from: a */
        final /* synthetic */ C40097a f94169a;

        /* renamed from: b */
        final /* synthetic */ String f94170b;

        static {
            Covode.recordClassIndex(47876);
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
        public final /* synthetic */ void onNext(C40096a aVar) {
            C89219l.m154721d(aVar, "");
            AbstractC39236g gVar = this.f94169a.f94166a;
            if (gVar != null) {
                gVar.mo68126b();
            }
            C33830n.m69192a("compliance_api_status", "", new C33743c().mo59976a(StringSet.type, "/aweme/v1/minor/user/set/settings/").mo59976a("param", this.f94170b).mo59974a("status", (Integer) 0).mo59977a());
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            int i;
            String errorMsg;
            C89219l.m154721d(th, "");
            boolean z = th instanceof C34485a;
            String str = null;
            if (z) {
                C34485a aVar = (C34485a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = C17867d.m33078a().getString(R.string.dcp);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                AbstractC39236g gVar = this.f94169a.f94166a;
                if (!(gVar instanceof Fragment)) {
                    gVar = null;
                }
                Fragment fragment = (Fragment) gVar;
                if (fragment != null) {
                    new C23144b(fragment).mo37635a(errorMsg).mo37637b();
                }
            } else {
                AbstractC39236g gVar2 = this.f94169a.f94166a;
                if (!(gVar2 instanceof Fragment)) {
                    gVar2 = null;
                }
                Fragment fragment2 = (Fragment) gVar2;
                if (fragment2 != null) {
                    new C23144b(fragment2).mo37640e(R.string.dcp).mo37637b();
                }
            }
            C33743c a = new C33743c().mo59976a(StringSet.type, "/aweme/v1/minor/user/set/settings/");
            if (z) {
                i = ((C34480a) th).getErrorCode();
            } else {
                i = -1;
            }
            C33743c a2 = a.mo59974a("error_message", Integer.valueOf(i)).mo59976a("param", this.f94170b).mo59974a("status", (Integer) 1);
            if (z) {
                Object rawResponse = ((C34485a) th).getRawResponse();
                Objects.requireNonNull(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.protection.restrictmode.api.MinorSettingResp");
                LogPbBean logPbBean = ((C40096a) rawResponse).f94165a;
                if (logPbBean != null) {
                    str = logPbBean.getImprId();
                }
            } else {
                str = "";
            }
            C33830n.m69192a("compliance_api_status", "", a2.mo59976a("tns_logId", str).mo59977a());
            AbstractC39236g gVar3 = this.f94169a.f94166a;
            if (gVar3 != null) {
                gVar3.mo68125a();
            }
        }

        C40099b(C40097a aVar, String str) {
            this.f94169a = aVar;
            this.f94170b = str;
        }
    }

    /* renamed from: a */
    public final void mo69237a(String str) {
        C89219l.m154721d(str, "");
        this.f94167b.checkPassword(C40074a.m81035a(str)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40098a(this));
    }

    /* renamed from: b */
    public final void mo69238b(String str) {
        C89219l.m154721d(str, "");
        this.f94167b.setMinorSettings(str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40099b(this, str));
    }
}
