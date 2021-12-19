package com.p2082ss.android.ugc.aweme.music.assem.video;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.assem.C60394b;
import com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60796e;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel */
public final class MusicPlayViewModel extends AssemViewModel<C60706e> implements AbstractC1214u<C33942b>, AbstractC47432f, AbstractC90252i, AbstractC90253j {

    /* renamed from: m */
    public static final C60672b f137888m = new C60672b((byte) 0);

    /* renamed from: j */
    MusicDownloadPlayHelper f137889j;

    /* renamed from: k */
    public DataCenter f137890k;

    /* renamed from: l */
    public MusicModel f137891l;

    /* renamed from: n */
    private final C12786i f137892n = new C12786i(true, new C60671a(this, null));

    static {
        Covode.recordClassIndex(71226);
    }

    /* renamed from: m */
    private final OriginMusicArg m110192m() {
        return (OriginMusicArg) this.f137892n.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(65, new RunnableC90250g(MusicPlayViewModel.class, "onEvent", C60796e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel$b */
    public static final class C60672b {
        static {
            Covode.recordClassIndex(71228);
        }

        private C60672b() {
        }

        public /* synthetic */ C60672b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f
    /* renamed from: a */
    public final void mo79703a() {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f137889j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.aw_();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C60706e mo20674f() {
        return new C60706e();
    }

    /* renamed from: l */
    public final void mo98135l() {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f137889j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.f138618n = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel$c */
    static final class C60673c implements MusicDownloadPlayHelper.AbstractC61086a {

        /* renamed from: a */
        final /* synthetic */ DataCenter f137895a;

        static {
            Covode.recordClassIndex(71229);
        }

        C60673c(DataCenter dataCenter) {
            this.f137895a = dataCenter;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper.AbstractC61086a
        /* renamed from: a */
        public final void mo62754a() {
            DataCenter dataCenter = this.f137895a;
            if (dataCenter != null) {
                dataCenter.mo60191a("music_loading", (Object) false);
            }
        }
    }

    /* renamed from: n */
    private static boolean m110193n() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: c */
    public final void mo20669c() {
        super.mo20669c();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: g */
    public final String mo23342g() {
        OriginMusicArg m = m110192m();
        if (m != null) {
            return m.getPreviousPage();
        }
        return null;
    }

    /* renamed from: k */
    public final void mo98134k() {
        mo20667b(new C60680g(this));
        mo79703a();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel$a */
    public static final class C60671a extends AbstractC89220m implements AbstractC89171a<OriginMusicArg> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f137893a;

        /* renamed from: b */
        final /* synthetic */ String f137894b;

        static {
            Covode.recordClassIndex(71227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60671a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f137893a = assemViewModel;
            this.f137894b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.music.assem.OriginMusicArg] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f137893a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.music.assem.OriginMusicArg> r1 = com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg.class
                java.lang.String r0 = r3.f137894b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel.C60671a.invoke():java.lang.Object");
        }
    }

    /* renamed from: o */
    private static boolean m110194o() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean n = m110193n();
        C58029j.f132256h = n;
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo23343h() {
        C60394b bVar = (C60394b) C12801d.m23016a(this, C89204ab.m154669a(AbstractC60416h.class));
        if (bVar != null) {
            return bVar.f137576a;
        }
        return null;
    }

    /* renamed from: i */
    public final boolean mo98132i() {
        C60394b bVar = (C60394b) C12801d.m23016a(this, C89204ab.m154669a(AbstractC60416h.class));
        if (bVar != null) {
            return bVar.f137579d;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo98133j() {
        C60394b bVar = (C60394b) C12801d.m23016a(this, C89204ab.m154669a(AbstractC60416h.class));
        if (bVar != null) {
            return bVar.f137581f;
        }
        return false;
    }

    @AbstractC90264r
    public final void onEvent(C60796e eVar) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f137889j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.aw_();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel$g */
    public static final class C60680g extends AbstractC89220m implements AbstractC89172b<C60706e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusicPlayViewModel f137907a;

        static {
            Covode.recordClassIndex(71236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60680g(MusicPlayViewModel musicPlayViewModel) {
            super(1);
            this.f137907a = musicPlayViewModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel$g$a */
        static final class C60681a extends AbstractC89220m implements AbstractC89172b<C60706e, C60706e> {

            /* renamed from: a */
            public static final C60681a f137908a = new C60681a();

            static {
                Covode.recordClassIndex(71237);
            }

            C60681a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C60706e invoke(C60706e eVar) {
                C89219l.m154721d(eVar, "");
                return C60706e.m110228a(null, EnumC60707f.Default);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C60706e eVar) {
            C60706e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (eVar2.f137934a != null) {
                this.f137907a.mo20662a(C60681a.f137908a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel$d */
    static final class C60674d extends AbstractC89220m implements AbstractC89172b<C60706e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusicPlayViewModel f137896a;

        static {
            Covode.recordClassIndex(71230);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60674d(MusicPlayViewModel musicPlayViewModel) {
            super(1);
            this.f137896a = musicPlayViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C60706e eVar) {
            C60706e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (eVar2.f137934a != null) {
                this.f137896a.mo20662a(new C60675a(this));
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel$d$a */
        static final class C60675a extends AbstractC89220m implements AbstractC89172b<C60706e, C60706e> {

            /* renamed from: a */
            final /* synthetic */ C60674d f137897a;

            static {
                Covode.recordClassIndex(71231);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C60675a(C60674d dVar) {
                super(1);
                this.f137897a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C60706e invoke(C60706e eVar) {
                Object obj;
                EnumC60707f fVar;
                C60706e eVar2 = eVar;
                C89219l.m154721d(eVar2, "");
                DataCenter dataCenter = this.f137897a.f137896a.f137890k;
                if (dataCenter != null) {
                    obj = dataCenter.mo60192a("music_loading");
                } else {
                    obj = null;
                }
                if (C89219l.m154714a(obj, (Object) true)) {
                    fVar = EnumC60707f.Loading;
                } else {
                    fVar = EnumC60707f.Playing;
                }
                return C60706e.m110228a(eVar2.f137934a, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel$f */
    public static final class C60677f extends AbstractC89220m implements AbstractC89172b<C60706e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusicPlayViewModel f137902a;

        /* renamed from: b */
        final /* synthetic */ MusicModel f137903b;

        static {
            Covode.recordClassIndex(71233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60677f(MusicPlayViewModel musicPlayViewModel, MusicModel musicModel) {
            super(1);
            this.f137902a = musicPlayViewModel;
            this.f137903b = musicModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C60706e eVar) {
            final C60706e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel.C60677f.RunnableC606781 */

                /* renamed from: a */
                final /* synthetic */ C60677f f137904a;

                static {
                    Covode.recordClassIndex(71234);
                }

                {
                    this.f137904a = r1;
                }

                public final void run() {
                    String str;
                    MusicModel musicModel = eVar2.f137934a;
                    if (musicModel != null) {
                        str = musicModel.getMusicId();
                    } else {
                        str = null;
                    }
                    if (C89219l.m154714a((Object) str, (Object) this.f137904a.f137903b.getMusicId())) {
                        this.f137904a.f137902a.mo98134k();
                        return;
                    }
                    this.f137904a.f137902a.mo79703a();
                    this.f137904a.f137902a.mo20662a(new AbstractC89172b<C60706e, C60706e>(this) {
                        /* class com.p2082ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel.C60677f.RunnableC606781.C606791 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC606781 f137906a;

                        static {
                            Covode.recordClassIndex(71235);
                        }

                        {
                            this.f137906a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C60706e invoke(C60706e eVar) {
                            C89219l.m154721d(eVar, "");
                            return C60706e.m110228a(this.f137906a.f137904a.f137903b, EnumC60707f.Default);
                        }
                    });
                    this.f137904a.f137902a.mo79704a(this.f137904a.f137903b);
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f
    /* renamed from: a */
    public final void mo79704a(MusicModel musicModel) {
        if (musicModel != null) {
            MusicDownloadPlayHelper musicDownloadPlayHelper = this.f137889j;
            if (musicDownloadPlayHelper != null) {
                musicDownloadPlayHelper.f138618n = false;
            }
            DataCenter dataCenter = this.f137890k;
            if (dataCenter != null) {
                dataCenter.mo60191a("music_loading", (Object) true);
            }
            this.f137891l = musicModel;
            MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.f137889j;
            if (musicDownloadPlayHelper2 != null) {
                musicDownloadPlayHelper2.mo63041a(musicModel, 7, false);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        C33942b bVar2 = bVar;
        if (bVar2 != null) {
            String str = bVar2.f80277a;
            if (str.hashCode() == 502104354 && str.equals("music_loading")) {
                mo20667b(new C60674d(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo98128a(boolean z) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f137889j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.aw_();
        }
        if (z) {
            mo98134k();
            MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.f137889j;
            if (musicDownloadPlayHelper2 != null) {
                musicDownloadPlayHelper2.f138618n = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel$e */
    public static final class C60676e extends AbstractC89220m implements AbstractC89172b<C60706e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MusicPlayViewModel f137898a;

        /* renamed from: b */
        final /* synthetic */ boolean f137899b;

        /* renamed from: c */
        final /* synthetic */ MusicModel f137900c;

        /* renamed from: d */
        final /* synthetic */ int f137901d;

        static {
            Covode.recordClassIndex(71232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60676e(MusicPlayViewModel musicPlayViewModel, boolean z, MusicModel musicModel, int i) {
            super(1);
            this.f137898a = musicPlayViewModel;
            this.f137899b = z;
            this.f137900c = musicModel;
            this.f137901d = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C60706e eVar) {
            String str;
            String str2;
            C60706e eVar2 = eVar;
            String str3 = "";
            C89219l.m154721d(eVar2, str3);
            MusicPlayViewModel musicPlayViewModel = this.f137898a;
            boolean z = this.f137899b;
            MusicModel musicModel = this.f137900c;
            int i = this.f137901d;
            EnumC60707f fVar = eVar2.f137935b;
            if (musicPlayViewModel.mo98132i()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            if (!musicPlayViewModel.mo98132i()) {
                str3 = musicPlayViewModel.mo23343h();
            }
            if (!musicPlayViewModel.mo98133j()) {
                if (fVar == EnumC60707f.Playing) {
                    str2 = "pause";
                } else {
                    str2 = "play";
                }
                C39162r.m79460a("play_music", new C33744d().mo59983a("enter_from", str).mo59983a("previous_page", musicPlayViewModel.mo23342g()).mo59983a("music_id", musicModel.getMusicId()).mo59983a("to_user_id", str3).mo59980a("pos", i).mo59980a("is_pin_to_top", z ? 1 : 0).mo59983a("play_status", str2).mo59983a("enter_method", "personal_list").f79943a);
            } else if (fVar != EnumC60707f.Playing) {
                C39162r.m79460a("search_result_click", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("button_type", "play_music").mo59983a("search_result_id", musicModel.getMusicId()).mo59980a("rank", i).f79943a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f
    /* renamed from: a */
    public final void mo79705a(MusicModel musicModel, int i, boolean z) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f137889j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.f138615k = "popular_song";
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.f137889j;
        if (musicDownloadPlayHelper2 != null) {
            musicDownloadPlayHelper2.f138617m = i;
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper3 = this.f137889j;
        if (musicDownloadPlayHelper3 != null) {
            musicDownloadPlayHelper3.mo97994b(musicModel, 7, true);
        }
    }

    /* renamed from: d */
    public final void mo98131d(MusicModel musicModel, int i, boolean z) {
        C89219l.m154721d(musicModel, "");
        mo20667b(new C60676e(this, z, musicModel, i));
        C17867d.m33078a();
        if (!m110194o()) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.dcq).mo123053a();
        } else {
            mo20667b(new C60677f(this, musicModel));
        }
    }

    /* renamed from: c */
    public final void mo98130c(MusicModel musicModel, int i, boolean z) {
        String h;
        String str;
        C89219l.m154721d(musicModel, "");
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && MusicService.m81198m().mo69308a(musicModel, topActivity, true)) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() || !AVExternalServiceImpl.m113114a().configService().avsettingsConfig().needLoginBeforeRecord()) {
                mo79705a(musicModel, i, false);
                if (mo98132i()) {
                    h = "";
                } else {
                    h = mo23343h();
                }
                MobClick value = MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(musicModel.getMusicId());
                C33743c cVar = new C33743c();
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                if (TextUtils.equals(g2.getCurUserId(), mo23343h())) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C39162r.onEvent(value.setJsonObject(cVar.mo59976a("enter_from", str).mo59977a()));
                C33744d a = new C33744d().mo59983a("shoot_way", "single_song").mo59983a("music_id", musicModel.getMusicId());
                if (!mo98132i()) {
                    a.mo59983a("shoot_from", "others_homepage").mo59983a("enter_method", "others_homepage").mo59983a("to_user_id", h).mo59980a("pos", i).mo59980a("is_pin_to_top", z ? 1 : 0);
                }
                C39162r.m79460a("shoot", a.f79943a);
                return;
            }
            AbstractC34892bo b = C31575b.m65860b();
            IAccountService.C31274d dVar = new IAccountService.C31274d();
            dVar.f74960a = topActivity;
            b.showLoginAndRegisterView(dVar.mo57084a());
            C39162r.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName("click_music_shoot"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void mo98129b(MusicModel musicModel, int i, boolean z) {
        String str;
        String h;
        if (musicModel == null) {
            return;
        }
        if (musicModel.getMusicStatus() != 0 || musicModel.getMusic() == null) {
            if (mo98132i()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            if (mo98132i()) {
                h = "";
            } else {
                h = mo23343h();
            }
            C39162r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("personal_homepage_list").setValue(musicModel.getMusicId()));
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            if (mo98133j()) {
                C39162r.m79460a("search_result_click", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("button_type", "enter_music_detail").mo59983a("search_result_id", musicModel.getMusicId()).mo59980a("rank", i).f79943a);
            } else {
                C39162r.m79460a("enter_music_detail", new C33744d().mo59983a("enter_from", str).mo59983a("group_id", "").mo59983a("music_id", musicModel.getMusicId()).mo59983a("previous_page", mo23342g()).mo59983a("process_id", uuid).mo59983a("enter_method", "personal_list").mo59983a("to_user_id", h).mo59980a("pos", i).mo59980a("is_pin_to_top", z ? 1 : 0).f79943a);
            }
            if (MusicService.m81198m().mo69308a(musicModel, ActivityStack.getTopActivity(), true)) {
                JSONObject jSONObject = new JSONObject();
                if (!mo98132i()) {
                    jSONObject.put("shoot_from", "others_homepage");
                    jSONObject.put("to_user_id", mo23343h());
                    jSONObject.put("pos", i);
                    jSONObject.put("is_pin_to_top", (int) z);
                }
                C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a("aweme://music/detail/" + musicModel.getMusicId()).mo63248a("process_id", uuid).mo63248a("extra_track_info", jSONObject.toString()).mo63249a());
            } else if (mo98133j()) {
                C39162r.m79460a("search_result_click", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("button_type", "enter_music_detail").mo59983a("search_result_id", musicModel.getMusicId()).mo59980a("rank", i).f79943a);
            } else {
                C39162r.m79460a("enter_music_detail_failed", new C33744d().mo59983a("group_id", "").mo59983a("author_id", "").mo59983a("music_id", musicModel.getMusicId()).mo59983a("enter_from", str).mo59983a("to_user_id", h).mo59980a("pos", i).mo59980a("is_pin_to_top", (int) z).f79943a);
            }
        } else {
            Music music = musicModel.getMusic();
            C89219l.m154716b(music, "");
            String offlineDesc = music.getOfflineDesc();
            C89219l.m154716b(offlineDesc, "");
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = C17867d.m33078a().getString(R.string.dau);
                C89219l.m154716b(offlineDesc, "");
            }
            new C79459a(C17867d.m33078a()).mo123052a(offlineDesc).mo123053a();
        }
    }
}
