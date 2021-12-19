package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39259r;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39697i;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api.C39742b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel */
public final class PrivacySettingViewModel extends AbstractC1174ac implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public final C1213t<C68348f> f93546a = new C1213t<>();

    /* renamed from: b */
    public boolean f93547b;

    /* renamed from: c */
    public final C1213t<C39258q> f93548c;

    /* renamed from: d */
    public final C1213t<Boolean> f93549d;

    /* renamed from: e */
    public final C1213t<Boolean> f93550e;

    /* renamed from: f */
    public final C1213t<Boolean> f93551f;

    /* renamed from: g */
    public final C1213t<Boolean> f93552g;

    static {
        Covode.recordClassIndex(47430);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(324, new RunnableC90250g(PrivacySettingViewModel.class, "onPrivacyUserSettingsChange", C39259r.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        C80298cg.m139205b(this);
        super.onCleared();
    }

    /* renamed from: a */
    public final void mo69090a() {
        C39697i.m80564a(true);
        C39659b.m80542b(true);
        C39742b.m80624a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b(C39704a.f93553a).mo143254a(new C39705b(this), C39707c.f93556a);
    }

    public PrivacySettingViewModel() {
        C80298cg.m139204a(this);
        C1213t<C39258q> tVar = new C1213t<>();
        tVar.setValue(C39659b.m80540b());
        this.f93548c = tVar;
        C1213t<Boolean> tVar2 = new C1213t<>();
        tVar2.setValue(Boolean.valueOf(C39631a.m80486b()));
        this.f93549d = tVar2;
        C1213t<Boolean> tVar3 = new C1213t<>();
        tVar3.setValue(false);
        this.f93550e = tVar3;
        C1213t<Boolean> tVar4 = new C1213t<>();
        tVar4.setValue(Boolean.valueOf(C39631a.m80489e().getAdAuthorization()));
        this.f93551f = tVar4;
        C1213t<Boolean> tVar5 = new C1213t<>();
        tVar5.setValue(false);
        this.f93552g = tVar5;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel$a */
    static final class C39704a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39704a f93553a = new C39704a();

        static {
            Covode.recordClassIndex(47431);
        }

        C39704a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C68348f fVar = (C68348f) obj;
            C89219l.m154716b(fVar, "");
            C89219l.m154721d(fVar, "");
            C39697i.f93529a = fVar;
            C39697i.m80562a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel$c */
    static final class C39707c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39707c f93556a = new C39707c();

        static {
            Covode.recordClassIndex(47434);
        }

        C39707c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            C40043a.m80998a("PRIVACY_SETTING_ALOG", new AbstractC89172b<C33743c, C33743c>() {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel.C39707c.C397081 */

                static {
                    Covode.recordClassIndex(47435);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C33743c invoke(C33743c cVar) {
                    C33743c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    C40043a.m80991a(cVar2, "Fetch UserSetting fail");
                    Throwable th = th;
                    C89219l.m154716b(th, "");
                    C40043a.m81000b(cVar2, C40043a.m80996a(th));
                    C40043a.m80990a(cVar2, C40043a.m80997a());
                    Throwable th2 = th;
                    C89219l.m154716b(th2, "");
                    return C40043a.m80992a(cVar2, "cause", C40043a.m81001b(th2));
                }
            });
        }
    }

    @AbstractC90264r
    public final void onPrivacyUserSettingsChange(C39259r rVar) {
        C89219l.m154721d(rVar, "");
        this.f93548c.setValue(rVar.f92750a);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel$b */
    static final class C39705b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ PrivacySettingViewModel f93554a;

        static {
            Covode.recordClassIndex(47432);
        }

        C39705b(PrivacySettingViewModel privacySettingViewModel) {
            this.f93554a = privacySettingViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C68348f fVar = (C68348f) obj;
            C89219l.m154716b(fVar, "");
            String str = fVar.f152946I;
            C89219l.m154716b(str, "");
            C39742b.m80625a(str);
            this.f93554a.f93546a.setValue(fVar);
            C40043a.m80998a("PRIVACY_SETTING_ALOG", new AbstractC89172b<C33743c, C33743c>() {
                /* class com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel.C39705b.C397061 */

                static {
                    Covode.recordClassIndex(47433);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C33743c invoke(C33743c cVar) {
                    C33743c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    C40043a.m80991a(cVar2, "Fetch UserSetting success");
                    C68348f fVar = fVar;
                    C89219l.m154716b(fVar, "");
                    C40043a.m81000b(cVar2, C40043a.m80993a((BaseResponse) fVar));
                    C40043a.m80990a(cVar2, C40043a.m80997a());
                    C68348f fVar2 = fVar;
                    C89219l.m154716b(fVar2, "");
                    return C40043a.m80992a(cVar2, "user_setting", C40043a.m80995a(fVar2));
                }
            });
        }
    }
}
