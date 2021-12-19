package com.p2082ss.android.ugc.aweme.viewModel;

import android.content.Context;
import android.os.Build;
import com.bef.effectsdk.BEFEffectNative;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.common.AbstractC39075aa;
import com.p2082ss.android.ugc.aweme.common.C39076ab;
import com.p2082ss.android.ugc.aweme.common.C39160p;
import com.p2082ss.android.ugc.aweme.common.C39219x;
import com.p2082ss.android.ugc.aweme.common.C39220y;
import com.p2082ss.android.ugc.aweme.common.C39222z;
import com.p2082ss.android.ugc.aweme.common.NaviEffectNetworkerImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.AbstractC60154n;
import com.p2082ss.android.ugc.aweme.model.AbstractC60160s;
import com.p2082ss.android.ugc.aweme.model.AbstractC60162u;
import com.p2082ss.android.ugc.aweme.model.C60143e;
import com.p2082ss.android.ugc.aweme.model.C60145g;
import com.p2082ss.android.ugc.aweme.model.C60146h;
import com.p2082ss.android.ugc.aweme.model.C60148j;
import com.p2082ss.android.ugc.aweme.model.C60150k;
import com.p2082ss.android.ugc.aweme.model.C60155o;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.model.C60163v;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel */
public final class ProfileNaviEditorViewModel extends BaseJediViewModel<ProfileNaviEditorState> implements MessageCenter.Listener, AbstractC39075aa, ICheckChannelListener, IFetchEffectChannelListener {

    /* renamed from: a */
    public boolean f181668a;

    /* renamed from: b */
    private final String f181669b = "NaviEditorViewModel";

    /* renamed from: c */
    private final int f181670c = 66667;

    /* renamed from: d */
    private final int f181671d = 66666;

    /* renamed from: e */
    private final int f181672e = 8192;

    /* renamed from: f */
    private final int f181673f = 7;

    /* renamed from: g */
    private final int f181674g = 66666;

    /* renamed from: k */
    private final String f181675k = "142710f02c3a11e8b42429f14557854a";

    /* renamed from: l */
    private final String f181676l = "test";

    /* renamed from: m */
    private final String f181677m = "Navi";

    /* renamed from: n */
    private final String f181678n = "navi";

    /* renamed from: o */
    private final String f181679o = "ui";

    /* renamed from: p */
    private final String f181680p = "tiktok";

    /* renamed from: q */
    private final String f181681q = "categories";

    /* renamed from: r */
    private final String f181682r = "tabs";

    /* renamed from: s */
    private final String f181683s = "head";

    /* renamed from: t */
    private String f181684t = BEFEffectNative.getEffectSDKVersion();

    /* renamed from: u */
    private EffectManager f181685u;

    static {
        Covode.recordClassIndex(94660);
    }

    /* renamed from: a */
    public final void mo124840a(Effect effect, EffectChannelResponse effectChannelResponse) {
        C28022o a = m141045a(effect);
        if (a != null) {
            C89219l.m154721d(a, "");
            try {
                if (a.mo46802b("animations")) {
                    AbstractC28019l c = a.mo46803c("animations");
                    C89219l.m154716b(c, "");
                    C27919i k = c.mo46790k();
                    if (k.mo46684a() > 0) {
                        AbstractC28019l a2 = k.mo46685a(0);
                        C89219l.m154716b(a2, "");
                        C28022o j = a2.mo46789j();
                        if (j.mo46802b("key") && j.mo46802b(StringSet.name)) {
                            AbstractC28019l c2 = j.mo46803c("key");
                            C89219l.m154716b(c2, "");
                            String c3 = c2.mo46689c();
                            C89219l.m154716b(c3, "");
                            C39076ab.f92275a = c3;
                            AbstractC28019l c4 = j.mo46803c(StringSet.name);
                            C89219l.m154716b(c4, "");
                            C39076ab.f92276b = c4.mo46689c();
                        }
                    }
                }
                if (a.mo46802b("enable_mocap")) {
                    AbstractC28019l c5 = a.mo46803c("enable_mocap");
                    C89219l.m154716b(c5, "");
                    C39076ab.f92277c = c5.mo46695h();
                }
            } catch (Exception unused) {
            }
            mo33690d(C81335i.f181696a);
            mo33690d(C81336j.f181697a);
            C89233z.C89238e eVar = new C89233z.C89238e();
            T t = (T) m141049a(a);
            if (t != null) {
                eVar.element = t;
                HashMap<String, AbstractC60142d> a3 = m141048a(a, eVar.element);
                if (a3 != null) {
                    for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategoryResponseList()) {
                        String key = effectCategoryResponse.getKey();
                        if (!C89219l.m154714a((Object) key, (Object) this.f181683s)) {
                            for (Effect effect2 : effectCategoryResponse.getTotalEffects()) {
                                if (a3.containsKey(key)) {
                                    AbstractC60142d dVar = a3.get(key);
                                    if (dVar == null) {
                                        C89219l.m154715b();
                                    }
                                    C89219l.m154716b(dVar, "");
                                    AbstractC60154n a4 = C60155o.m109634a(effect2, dVar);
                                    if (a4 != null) {
                                        AbstractC60142d dVar2 = a3.get(key);
                                        if (dVar2 == null) {
                                            C89219l.m154715b();
                                        }
                                        C89219l.m154716b(dVar2, "");
                                        dVar2.mo97819e().add(a4);
                                    }
                                }
                            }
                        }
                    }
                    for (AbstractC60162u uVar : eVar.element) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<AbstractC60142d> it = uVar.mo97838c().iterator();
                        while (it.hasNext()) {
                            AbstractC60142d next = it.next();
                            if (next.mo97819e().isEmpty() && next.mo97821g().isEmpty()) {
                                arrayList.add(next);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            uVar.mo97838c().remove(it2.next());
                        }
                    }
                    C89219l.m154721d(a3, "");
                    C60159r.f137142e = a3;
                    if (C60159r.f137143f != null) {
                        C60107b bVar = C60159r.f137143f;
                        if (bVar == null) {
                            C89219l.m154715b();
                        }
                        C60159r.m109649a(bVar);
                    }
                    mo33690d(new C81328b(eVar));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo124839a(AbstractC60154n nVar) {
        EffectManager effectManager = this.f181685u;
        if (effectManager != null) {
            if (effectManager.isEffectReady(nVar.mo97830e())) {
                EffectManager effectManager2 = this.f181685u;
                if (effectManager2 == null) {
                    C89219l.m154715b();
                }
                if (effectManager2.isEffectDownloaded(nVar.mo97830e())) {
                    mo124843b(nVar);
                    return;
                }
            }
            EffectManager effectManager3 = this.f181685u;
            if (effectManager3 == null) {
                C89219l.m154715b();
            }
            effectManager3.fetchEffect(nVar.mo97830e(), new C81330d(this, nVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39075aa
    /* renamed from: a */
    public final void mo67831a(List<C39220y> list, boolean z) {
        C89219l.m154721d(list, "");
        for (C39220y yVar : list) {
            mo33690d(new C81343q(yVar));
            if (!((ProfileNaviEditorState) aB_()).getNaviDoneLoading() && z) {
                mo33690d(C81344r.f181706a);
            }
        }
    }

    /* renamed from: b */
    private static List<Host> m141051b() {
        return C89070n.m154525d(new Host("https://api.tiktokv.com"));
    }

    /* renamed from: a */
    public final void mo124837a() {
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) aB_();
        profileNaviEditorState.setCurrentMessage(null);
        profileNaviEditorState.setHeadStickerPath(null);
        profileNaviEditorState.setNaviDoneLoading(false);
        profileNaviEditorState.setEditCategory(null);
        profileNaviEditorState.setTabList(null);
        profileNaviEditorState.setParentCategoryList(null);
        MessageCenter.removeAllListener();
        MessageCenter.destroy();
        C39222z.m79578a();
        C60159r.m109648a();
        C60159r.f137142e = null;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ProfileNaviEditorState(null, null, null, null, null, false, false, false, false, false, 1023, null);
    }

    /* renamed from: f */
    private static Context m141054f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final void mo124841a(String str) {
        mo33690d(new C81350x(str));
    }

    /* renamed from: c */
    public final void mo124844c(Context context) {
        C89219l.m154721d(context, "");
        m141053e(context).checkedEffectListUpdate(this.f181677m, this);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        Exception exception;
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            exception.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        Exception exception;
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            exception.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$b */
    public static final class C81328b extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f181687a;

        static {
            Covode.recordClassIndex(94662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81328b(C89233z.C89238e eVar) {
            super(1);
            this.f181687a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, this.f181687a.element, null, null, null, null, false, false, false, false, false, 1022, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$c */
    public static final class C81329c implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviEditorViewModel f181688a;

        /* renamed from: b */
        final /* synthetic */ EffectChannelResponse f181689b;

        static {
            Covode.recordClassIndex(94663);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            C89219l.m154721d(effect2, "");
            EffectChannelResponse effectChannelResponse = this.f181689b;
            if (effectChannelResponse != null) {
                this.f181688a.mo124840a(effect2, effectChannelResponse);
            }
            this.f181688a.mo124841a(effect2.getUnzipPath());
        }

        C81329c(ProfileNaviEditorViewModel profileNaviEditorViewModel, EffectChannelResponse effectChannelResponse) {
            this.f181688a = profileNaviEditorViewModel;
            this.f181689b = effectChannelResponse;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            if (exceptionResult.getException() != null) {
                exceptionResult.getException().printStackTrace();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$d */
    public static final class C81330d implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviEditorViewModel f181690a;

        /* renamed from: b */
        final /* synthetic */ AbstractC60154n f181691b;

        static {
            Covode.recordClassIndex(94664);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            C89219l.m154721d(effect2, "");
            this.f181691b.mo97828a(effect2.getUnzipPath());
            this.f181690a.mo124843b(this.f181691b);
        }

        C81330d(ProfileNaviEditorViewModel profileNaviEditorViewModel, AbstractC60154n nVar) {
            this.f181690a = profileNaviEditorViewModel;
            this.f181691b = nVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            if (exceptionResult.getException() != null) {
                exceptionResult.getException().printStackTrace();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$e */
    public static final class C81331e extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC60142d f181692a;

        static {
            Covode.recordClassIndex(94665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81331e(AbstractC60142d dVar) {
            super(1);
            this.f181692a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, new C39219x(this.f181692a), false, false, false, false, false, 1007, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$f */
    public static final class C81332f extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ C39220y f181693a;

        static {
            Covode.recordClassIndex(94666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81332f(C39220y yVar) {
            super(1);
            this.f181693a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, this.f181693a, null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$g */
    public static final class C81333g extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        public static final C81333g f181694a = new C81333g();

        static {
            Covode.recordClassIndex(94667);
        }

        C81333g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 1007, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$i */
    public static final class C81335i extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        public static final C81335i f181696a = new C81335i();

        static {
            Covode.recordClassIndex(94669);
        }

        C81335i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, true, 511, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$j */
    public static final class C81336j extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        public static final C81336j f181697a = new C81336j();

        static {
            Covode.recordClassIndex(94670);
        }

        C81336j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 511, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$l */
    static final class C81338l extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        public static final C81338l f181700a = new C81338l();

        static {
            Covode.recordClassIndex(94672);
        }

        C81338l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 991, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$n */
    static final class C81340n extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ C39220y f181702a;

        static {
            Covode.recordClassIndex(94674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81340n(C39220y yVar) {
            super(1);
            this.f181702a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, this.f181702a, null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$o */
    static final class C81341o extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        public static final C81341o f181703a = new C81341o();

        static {
            Covode.recordClassIndex(94675);
        }

        C81341o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, true, false, false, false, 959, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$p */
    static final class C81342p extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        public static final C81342p f181704a = new C81342p();

        static {
            Covode.recordClassIndex(94676);
        }

        C81342p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 959, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$q */
    static final class C81343q extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ C39220y f181705a;

        static {
            Covode.recordClassIndex(94677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81343q(C39220y yVar) {
            super(1);
            this.f181705a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, this.f181705a, null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$r */
    static final class C81344r extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        public static final C81344r f181706a = new C81344r();

        static {
            Covode.recordClassIndex(94678);
        }

        C81344r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, true, false, false, false, false, 991, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$s */
    public static final class C81345s extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        public static final C81345s f181707a = new C81345s();

        static {
            Covode.recordClassIndex(94679);
        }

        C81345s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, true, false, 767, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$t */
    public static final class C81346t extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        public static final C81346t f181708a = new C81346t();

        static {
            Covode.recordClassIndex(94680);
        }

        C81346t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 767, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$x */
    public static final class C81350x extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ String f181714a;

        static {
            Covode.recordClassIndex(94684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81350x(String str) {
            super(1);
            this.f181714a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, this.f181714a, null, false, false, false, false, false, 1015, null);
        }
    }

    /* renamed from: a */
    public static String m141047a(AbstractC60142d dVar) {
        String h = dVar.mo97822h();
        if (h == null || h.length() == 0) {
            return dVar.mo97815a();
        }
        String h2 = dVar.mo97822h();
        if (h2 == null) {
            C89219l.m154715b();
        }
        return h2;
    }

    /* renamed from: d */
    private static File m141052d(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        if (z) {
            EffectManager effectManager = this.f181685u;
            if (effectManager != null) {
                effectManager.fetchEffectList(this.f181677m, false, (IFetchEffectChannelListener) this);
                return;
            }
            return;
        }
        EffectManager effectManager2 = this.f181685u;
        if (effectManager2 != null) {
            effectManager2.fetchEffectListFromCache(this.f181677m, this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$a */
    public static final class C81327a extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ C60143e f181686a;

        static {
            Covode.recordClassIndex(94661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81327a(C60143e eVar) {
            super(1);
            this.f181686a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, C39220y.C39221a.m79575b(this.f181686a.f137087c), null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$h */
    public static final class C81334h extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC60142d f181695a;

        static {
            Covode.recordClassIndex(94668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81334h(AbstractC60142d dVar) {
            super(1);
            this.f181695a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            C60146h j = this.f181695a.mo97824j();
            if (j == null) {
                C89219l.m154715b();
            }
            String str = j.f137094c;
            if (this.f181695a.mo97824j() == null) {
                C89219l.m154715b();
            }
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, C39220y.C39221a.m79576c(str), null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$k */
    static final class C81337k extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviEditorViewModel f181698a;

        /* renamed from: b */
        final /* synthetic */ AbstractC60142d f181699b;

        static {
            Covode.recordClassIndex(94671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81337k(ProfileNaviEditorViewModel profileNaviEditorViewModel, AbstractC60142d dVar) {
            super(1);
            this.f181698a = profileNaviEditorViewModel;
            this.f181699b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            C60145g i = this.f181699b.mo97823i();
            if (i == null) {
                C89219l.m154715b();
            }
            C60143e eVar = i.f137091b;
            if (eVar == null) {
                C89219l.m154715b();
            }
            String str = eVar.f137087c;
            if (str == null) {
                C89219l.m154715b();
            }
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, C39220y.C39221a.m79575b(str), null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$m */
    static final class C81339m extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ C60148j f181701a;

        static {
            Covode.recordClassIndex(94673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81339m(C60148j jVar) {
            super(1);
            this.f181701a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, C39220y.C39221a.m79571a(this.f181701a.f137099a), null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$u */
    public static final class C81347u extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC60154n f181709a;

        static {
            Covode.recordClassIndex(94681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81347u(AbstractC60154n nVar) {
            super(1);
            this.f181709a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, C39220y.C39221a.m79574a(this.f181709a.mo97829d(), false), null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$v */
    public static final class C81348v extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ AbstractC60160s f181710a;

        static {
            Covode.recordClassIndex(94682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81348v(AbstractC60160s sVar) {
            super(1);
            this.f181710a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, C39220y.C39221a.m79571a(this.f181710a.mo97825a()), null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel$w */
    public static final class C81349w extends AbstractC89220m implements AbstractC89172b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviEditorViewModel f181711a;

        /* renamed from: b */
        final /* synthetic */ int f181712b;

        /* renamed from: c */
        final /* synthetic */ String f181713c;

        static {
            Covode.recordClassIndex(94683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81349w(ProfileNaviEditorViewModel profileNaviEditorViewModel, int i, String str) {
            super(1);
            this.f181711a = profileNaviEditorViewModel;
            this.f181712b = i;
            this.f181713c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            C89219l.m154721d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, C39220y.C39221a.m79572a(this.f181713c, this.f181712b), null, null, false, false, false, false, false, 1019, null);
        }
    }

    /* renamed from: b */
    public final void mo124843b(AbstractC60154n nVar) {
        AbstractC60154n b;
        C60157q qVar = C60159r.f137138a;
        if (qVar != null && (b = qVar.mo97833b(m141047a(nVar.mo97827c()))) != null) {
            if (C39222z.f92645b == null) {
                C39222z.m79579a(this);
            }
            if (C89219l.m154714a((Object) b.mo97825a(), (Object) nVar.mo97825a()) && !C39222z.m79581a(b.mo97829d())) {
                C39222z.m79580a(nVar);
            }
        }
    }

    /* renamed from: b */
    public static AbstractC60154n m141050b(AbstractC60142d dVar) {
        AbstractC60142d dVar2;
        C89219l.m154721d(dVar, "");
        HashMap<String, AbstractC60142d> hashMap = C60159r.f137142e;
        if (!(hashMap == null || (dVar2 = hashMap.get(dVar.mo97815a())) == null)) {
            C89219l.m154716b(dVar2, "");
            String h = dVar2.mo97822h();
            if (h == null || h.length() == 0) {
                C60157q qVar = C60159r.f137138a;
                if (qVar != null) {
                    return qVar.mo97833b(dVar2.mo97815a());
                }
                return null;
            }
            C60157q qVar2 = C60159r.f137138a;
            if (qVar2 != null) {
                String h2 = dVar2.mo97822h();
                if (h2 == null) {
                    C89219l.m154715b();
                }
                return qVar2.mo97833b(h2);
            }
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
        Effect effect;
        EffectManager effectManager;
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (effectChannelResponse2 != null) {
            for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse2.getCategoryResponseList()) {
                if (C89219l.m154714a((Object) effectCategoryResponse.getKey(), (Object) this.f181683s)) {
                    if (!(!(!effectCategoryResponse.getTotalEffects().isEmpty()) || (effect = effectCategoryResponse.getTotalEffects().get(0)) == null || (effectManager = this.f181685u) == null)) {
                        if (effectManager.isEffectReady(effect)) {
                            EffectManager effectManager2 = this.f181685u;
                            if (effectManager2 == null) {
                                C89219l.m154715b();
                            }
                            if (effectManager2.isEffectDownloaded(effect)) {
                                mo124840a(effect, effectChannelResponse2);
                                mo124841a(effect.getUnzipPath());
                                return;
                            }
                        }
                        EffectManager effectManager3 = this.f181685u;
                        if (effectManager3 == null) {
                            C89219l.m154715b();
                        }
                        effectManager3.fetchEffect(effect, new C81329c(this, effectChannelResponse2));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final C28022o m141045a(Effect effect) {
        boolean z;
        try {
            AbstractC28019l a = C28024q.m56139a(effect.getSdkExtra());
            if (a != null) {
                AbstractC28019l c = ((C28022o) a).mo46807f(this.f181678n).mo46807f(this.f181679o).mo46803c(this.f181680p);
                C89219l.m154716b(c, "");
                String c2 = c.mo46689c();
                String transResPath = effect.getTransResPath();
                if (transResPath == null || transResPath.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C89219l.m154716b(c2, "");
                    C28022o a2 = m141046a(effect, c2);
                    if (a2 != null) {
                        return a2;
                    }
                }
                String str = effect.getUnzipPath() + File.separator + c2;
                C89219l.m154716b(str, "");
                AbstractC28019l a3 = C28024q.m56139a(C89159j.m154648c(new File(str)));
                if (a3 != null) {
                    return (C28022o) a3;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.google.gson.JsonObject");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.gson.JsonObject");
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: e */
    private EffectManager m141053e(Context context) {
        C89219l.m154721d(context, "");
        if (this.f181685u == null) {
            EffectConfiguration.Builder executor = new EffectConfiguration.Builder().accessKey(this.f181675k).channel(this.f181676l).sdkVersion(this.f181684t).appVersion(this.f181684t).platform("android").deviceType(Build.MODEL).deviceId("0").effectDir(new File(m141052d(context), "effect")).JsonConverter(new C39160p()).effectNetWorker(new NaviEffectNetworkerImpl()).hosts(m141051b()).context(m141054f(context)).retryCount(3).region("").executor(C40780g.m82241a());
            DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
            C89219l.m154716b(instance, "");
            EffectConfiguration build = executor.effectFetcher(instance.getEffectFetcher()).build();
            C89219l.m154716b(build, "");
            EffectManager effectManager = new EffectManager();
            this.f181685u = effectManager;
            effectManager.init(build);
        }
        EffectManager effectManager2 = this.f181685u;
        if (effectManager2 == null) {
            C89219l.m154715b();
        }
        return effectManager2;
    }

    /* renamed from: b */
    public final DownloadableModelSupport mo124842b(Context context) {
        DownloadableModelConfig.ModelFileEnv modelFileEnv;
        C89219l.m154721d(context, "");
        if (!DownloadableModelSupport.isInitialized()) {
            DownloadableModelConfig.Builder jsonConverter = new DownloadableModelConfig.Builder().setContext(context).setAccessKey(this.f181675k).setAppId("1233").setHosts(m141051b()).setSdkVersion(this.f181684t).setDeviceType(Build.MODEL).setJsonConverter(new C39160p());
            if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableModelFileOnlyEnv()) {
                modelFileEnv = DownloadableModelConfig.ModelFileEnv.ONLINE;
            } else {
                modelFileEnv = DownloadableModelConfig.ModelFileEnv.TEST;
            }
            DownloadableModelSupport.initialize(jsonConverter.setModelFileEnv(modelFileEnv).setEffectNetWorker(new NaviEffectNetworkerImpl()).setAssetManager(context.getAssets()).setWorkspace(new File(m141052d(context), "effectmodel").getPath()).setExecutor(C40780g.m82241a()).build());
        }
        DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
        C89219l.m154716b(instance, "");
        return instance;
    }

    /* renamed from: a */
    private final List<AbstractC60162u> m141049a(C28022o oVar) {
        try {
            ArrayList arrayList = new ArrayList();
            AbstractC28019l c = oVar.mo46803c(this.f181682r);
            C89219l.m154716b(c, "");
            Iterator<AbstractC28019l> it = c.mo46790k().iterator();
            while (it.hasNext()) {
                AbstractC28019l next = it.next();
                C89219l.m154716b(next, "");
                C28022o j = next.mo46789j();
                C89219l.m154716b(j, "");
                AbstractC60162u a = C60163v.C60164a.m109661a(j);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo124838a(Context context) {
        List<AbstractC60162u> tabList;
        C89219l.m154721d(context, "");
        mo124842b(context);
        m141053e(context);
        MessageCenter.setListener(this);
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) aB_();
        String headStickerPath = profileNaviEditorState.getHeadStickerPath();
        if (headStickerPath == null || headStickerPath.length() == 0 || (tabList = profileNaviEditorState.getTabList()) == null || tabList.isEmpty()) {
            mo124844c(context);
        }
        C39222z.m79579a(this);
    }

    /* renamed from: a */
    private static C28022o m141046a(Effect effect, String str) {
        try {
            String str2 = effect.getTransResPath() + File.separator + "custom" + File.separator + str;
            C89219l.m154716b(str2, "");
            if (!new File(str2).exists()) {
                return null;
            }
            AbstractC28019l a = C28024q.m56139a(C89159j.m154648c(new File(str2)));
            if (a != null) {
                return (C28022o) a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.gson.JsonObject");
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    private final HashMap<String, AbstractC60142d> m141048a(C28022o oVar, List<? extends AbstractC60162u> list) {
        try {
            HashMap<String, AbstractC60142d> hashMap = new HashMap<>();
            AbstractC28019l c = oVar.mo46803c(this.f181681q);
            C89219l.m154716b(c, "");
            Iterator<AbstractC28019l> it = c.mo46790k().iterator();
            while (it.hasNext()) {
                AbstractC28019l next = it.next();
                C89219l.m154716b(next, "");
                C28022o j = next.mo46789j();
                C89219l.m154716b(j, "");
                AbstractC60142d a = C60150k.C60151a.m109630a(j);
                if (a != null) {
                    hashMap.put(a.mo97815a(), a);
                    for (AbstractC60162u uVar : list) {
                        if (C89219l.m154714a((Object) a.mo97818d(), (Object) uVar.mo97836a())) {
                            uVar.mo97838c().add(a);
                        }
                    }
                }
            }
            return hashMap;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C60143e eVar;
        String str2;
        C60157q qVar;
        C60143e eVar2;
        if (str == null || !C89219l.m154714a((Object) str, (Object) "head") || i2 != 3) {
            if (i == 17) {
                if (i2 == 3 && str != null) {
                    C89219l.m154721d(str, "");
                    int size = C39222z.f92644a.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (C89219l.m154714a((Object) C39222z.f92644a.get(i4).mo97829d(), (Object) str)) {
                            AbstractC60142d c = C39222z.f92644a.get(i4).mo97827c();
                            C39222z.f92644a.remove(i4);
                            C89219l.m154721d(c, "");
                            ArrayList arrayList = new ArrayList();
                            C60145g i5 = c.mo97823i();
                            if (!(i5 == null || (eVar = i5.f137091b) == null || (str2 = eVar.f137087c) == null || str2.length() == 0)) {
                                arrayList.add(C39220y.C39221a.m79575b(str2));
                            }
                            if (c.mo97824j() != null) {
                                C60146h j = c.mo97824j();
                                if (j == null) {
                                    C89219l.m154715b();
                                }
                                if (j.f137093b == 1) {
                                    C60146h j2 = c.mo97824j();
                                    if (j2 == null) {
                                        C89219l.m154715b();
                                    }
                                    arrayList.add(C39220y.C39221a.m79576c(j2.f137094c));
                                }
                            }
                            arrayList.addAll(C39222z.m79577a(c));
                            AbstractC39075aa aaVar = C39222z.f92645b;
                            if (aaVar != null) {
                                aaVar.mo67831a(arrayList, !C39222z.f92644a.isEmpty());
                            }
                            C39222z.m79582b();
                            return;
                        }
                    }
                }
            } else if (i == this.f181672e) {
                if (i2 != this.f181673f) {
                }
            } else if (i == 48) {
                mo33690d(C81341o.f181703a);
            } else if (i == 49) {
                mo33690d(C81342p.f181704a);
            }
        } else if (!this.f181668a) {
            this.f181668a = true;
            HashMap<String, AbstractC60142d> hashMap = C60159r.f137142e;
            if (!(hashMap == null || hashMap.isEmpty() || (qVar = C60159r.f137138a) == null)) {
                Collection<AbstractC60154n> values = qVar.f137134c.values();
                mo33690d(C81338l.f181700a);
                for (AbstractC60154n nVar : values) {
                    C89219l.m154716b(nVar, "");
                    mo124839a(nVar);
                }
                for (C60148j jVar : qVar.f137135d.values()) {
                    mo33690d(new C81339m(jVar));
                }
                HashMap<String, AbstractC60142d> hashMap2 = C60159r.f137142e;
                if (hashMap2 == null) {
                    C89219l.m154715b();
                }
                for (AbstractC60142d dVar : hashMap2.values()) {
                    C60145g i6 = dVar.mo97823i();
                    if (!(i6 == null || (eVar2 = i6.f137091b) == null || eVar2.f137087c == null)) {
                        mo33690d(new C81337k(this, dVar));
                    }
                    C89219l.m154716b(dVar, "");
                    for (C39220y yVar : C39222z.m79577a(dVar)) {
                        mo33690d(new C81340n(yVar));
                    }
                }
            }
        }
    }
}
