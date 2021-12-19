package com.p2082ss.android.ugc.aweme.contentlanguage.viewmodel;

import android.app.Activity;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40220l;
import com.p2082ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.C40186a;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.p2082ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;
import com.p2082ss.android.ugc.aweme.i18n.language.C53451b;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53452a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel */
public final class ContentPreferenceViewModel extends AbstractC1174ac implements C40220l.AbstractC40222a {

    /* renamed from: a */
    public int f94423a = -1;

    /* renamed from: b */
    public boolean f94424b;

    /* renamed from: c */
    private final AbstractC89244h f94425c = C89250i.m154773a((AbstractC89171a) new C40230d(this));

    /* renamed from: d */
    private final AbstractC89244h f94426d = C89250i.m154773a((AbstractC89171a) C40233g.f94437a);

    /* renamed from: e */
    private final AbstractC89244h f94427e = C89250i.m154773a((AbstractC89171a) C40227a.f94429a);

    /* renamed from: f */
    private final AbstractC89244h f94428f = C89250i.m154773a((AbstractC89171a) C40232f.f94436a);

    static {
        Covode.recordClassIndex(48023);
    }

    /* renamed from: b */
    public final C1213t<Integer> mo69432b() {
        return (C1213t) this.f94426d.getValue();
    }

    /* renamed from: c */
    public final C1213t<ArrayList<C68343a>> mo69433c() {
        return (C1213t) this.f94427e.getValue();
    }

    /* renamed from: d */
    public final C1213t<ArrayList<C53451b>> mo69434d() {
        return (C1213t) this.f94428f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel$a */
    static final class C40227a extends AbstractC89220m implements AbstractC89171a<C1213t<ArrayList<C68343a>>> {

        /* renamed from: a */
        public static final C40227a f94429a = new C40227a();

        static {
            Covode.recordClassIndex(48024);
        }

        C40227a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<ArrayList<C68343a>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel$f */
    static final class C40232f extends AbstractC89220m implements AbstractC89171a<C1213t<ArrayList<C53451b>>> {

        /* renamed from: a */
        public static final C40232f f94436a = new C40232f();

        static {
            Covode.recordClassIndex(48029);
        }

        C40232f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<ArrayList<C53451b>> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel$d */
    static final class C40230d extends AbstractC89220m implements AbstractC89171a<C40220l> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f94433a;

        static {
            Covode.recordClassIndex(48027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40230d(ContentPreferenceViewModel contentPreferenceViewModel) {
            super(0);
            this.f94433a = contentPreferenceViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40220l invoke() {
            C40220l lVar = new C40220l();
            lVar.f94418b = this.f94433a;
            return lVar;
        }
    }

    /* renamed from: e */
    public final void mo69435e() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            m81343f();
        } else {
            ContentLanguageServiceImpl.m81266f().mo69372a(new C40229c(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel$g */
    static final class C40233g extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C40233g f94437a = new C40233g();

        static {
            Covode.recordClassIndex(48030);
        }

        C40233g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            Integer valueOf;
            C1213t tVar = new C1213t();
            if (C39223a.m79591e().mo68729d() == 0) {
                valueOf = C39223a.m79591e().mo68732g();
            } else {
                valueOf = Integer.valueOf(C39223a.m79591e().mo68729d());
            }
            tVar.setValue(valueOf);
            return tVar;
        }
    }

    public ContentPreferenceViewModel() {
        mo69435e();
    }

    /* renamed from: f */
    private final void m81343f() {
        ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(LanguageApi.class)).getUnloginContentLanguage("content_language_region", ContentLanguageServiceImpl.m81266f().mo69378d()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40228b(this, ContentLanguageServiceImpl.m81266f().mo69377c()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.C40220l.AbstractC40222a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69391a() {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel.mo69391a():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel$c */
    public static final class C40229c implements AbstractC68342a {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f94432a;

        static {
            Covode.recordClassIndex(48026);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
        /* renamed from: a */
        public final void mo60119a(Exception exc) {
            C89219l.m154721d(exc, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40229c(ContentPreferenceViewModel contentPreferenceViewModel) {
            this.f94432a = contentPreferenceViewModel;
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
        /* renamed from: a */
        public final void mo60118a(C68348f fVar) {
            Integer valueOf;
            C89219l.m154721d(fVar, "");
            this.f94432a.mo69431a(fVar.f152965aa, fVar.f152963Z);
            ContentPreferenceViewModel contentPreferenceViewModel = this.f94432a;
            int i = fVar.f152968ad;
            if (C39223a.m79591e().mo68725a()) {
                if (i == 0) {
                    valueOf = C39223a.m79591e().mo68732g();
                } else {
                    valueOf = Integer.valueOf(i);
                }
                contentPreferenceViewModel.mo69432b().setValue(valueOf);
                IVPAService e = C39223a.m79591e();
                if (valueOf == null) {
                    C89219l.m154715b();
                }
                e.mo68723a(valueOf.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel$e */
    public static final class C40231e implements AbstractC88986z<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f94434a;

        /* renamed from: b */
        final /* synthetic */ int f94435b;

        static {
            Covode.recordClassIndex(48028);
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
            ContentPreferenceViewModel.m81342b(this.f94435b);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            C89219l.m154721d(baseResponse2, "");
            if (baseResponse2.error_code == 0) {
                Integer value = this.f94434a.mo69432b().getValue();
                if (value != null && value.intValue() == 3) {
                    ContentLanguageServiceImpl.m81266f().mo69374a(true);
                    return;
                }
                return;
            }
            ContentPreferenceViewModel.m81342b(this.f94435b);
        }

        C40231e(ContentPreferenceViewModel contentPreferenceViewModel, int i) {
            this.f94434a = contentPreferenceViewModel;
            this.f94435b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel$b */
    public static final class C40228b implements AbstractC88986z<ConfigListResponse> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f94430a;

        /* renamed from: b */
        final /* synthetic */ List f94431b;

        static {
            Covode.recordClassIndex(48025);
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
        public final /* synthetic */ void onNext(ConfigListResponse configListResponse) {
            ConfigListResponse configListResponse2 = configListResponse;
            C89219l.m154721d(configListResponse2, "");
            C40186a a = ContentLanguageServiceImpl.m81266f().mo69369a(this.f94431b, configListResponse2.getContentLanguage());
            this.f94430a.mo69431a(a.f94359a, a.f94360b);
        }

        C40228b(ContentPreferenceViewModel contentPreferenceViewModel, List list) {
            this.f94430a = contentPreferenceViewModel;
            this.f94431b = list;
        }
    }

    /* renamed from: b */
    public static void m81342b(int i) {
        C39223a.m79591e().mo68723a(i);
        Activity j = C17873f.m33102j();
        if (j != null) {
            new C23144b(j).mo37640e(R.string.g1_).mo37637b();
        }
        C33830n.m69192a("opt_out_failed_settings", "", (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo69429a(int i) {
        int d = C39223a.m79591e().mo68729d();
        mo69432b().setValue(Integer.valueOf(i));
        C39223a.m79591e().mo68723a(i);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            C39223a.m79591e().mo68726b(i).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40231e(this, d));
            return;
        }
        Integer value = mo69432b().getValue();
        if (value != null && value.intValue() == 3) {
            ContentLanguageServiceImpl.m81266f().mo69374a(false);
        }
    }

    /* renamed from: a */
    public final void mo69430a(C68343a aVar) {
        if (aVar != null) {
            ArrayList<C68343a> value = mo69433c().getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            value.add(aVar);
            mo69433c().setValue(value);
            this.f94424b = false;
            ((C40220l) this.f94425c.getValue()).mo69420a(aVar, 1);
            ArrayList<C53451b> value2 = mo69434d().getValue();
            if (value2 != null) {
                C89219l.m154716b(value2, "");
                Iterator<C53451b> it = value2.iterator();
                C89219l.m154716b(it, "");
                while (it.hasNext()) {
                    C53451b next = it.next();
                    C89219l.m154716b(next, "");
                    if (C89219l.m154714a((Object) next.mo90015a(), (Object) aVar.getLocalName())) {
                        it.remove();
                    }
                }
                mo69434d().setValue(value2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.C40220l.AbstractC40222a
    /* renamed from: a */
    public final void mo69392a(Throwable th) {
        C89219l.m154721d(th, "");
        Throwable a = C33615a.m68845a(th);
        if (a instanceof C34485a) {
            C34485a aVar = (C34485a) a;
            int errorCode = aVar.getErrorCode();
            aVar.getResponse();
            if (errorCode == 2090) {
                IContentLanguageService f = ContentLanguageServiceImpl.m81266f();
                C89219l.m154716b(f, "");
                Activity b = f.mo69376b();
                if (b != null) {
                    new C23144b(b).mo37640e(R.string.g1_).mo37637b();
                }
                ArrayList<C68343a> value = mo69433c().getValue();
                if (!C13603b.m24435a((Collection) value)) {
                    if (value != null) {
                        value.remove(value.size() - 1);
                    }
                    mo69433c().setValue(value);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo69431a(List<? extends C68343a> list, List<? extends C68343a> list2) {
        if (!C13603b.m24435a((Collection) list)) {
            mo69433c().setValue(list);
        }
        if (!C13603b.m24435a((Collection) list2)) {
            ArrayList<C53451b> arrayList = new ArrayList<>();
            if (list2 == null) {
                C89219l.m154715b();
            }
            for (C68343a aVar : list2) {
                arrayList.add(new C53451b(new C53452a("", aVar.getEnglishName(), aVar.getLanguageCode(), aVar.getLocalName()), false));
            }
            mo69434d().setValue(arrayList);
        }
    }
}
