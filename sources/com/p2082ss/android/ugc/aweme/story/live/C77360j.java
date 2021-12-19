package com.p2082ss.android.ugc.aweme.story.live;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.p691g.AbstractC11769i;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.p1469l.C20688a;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20696f;
import com.bytedance.p1469l.p1473b.C20700a;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.Live;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.LivePlayActivity;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a;
import com.p2082ss.android.ugc.aweme.p3668r.AbstractC66587b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.live.j */
public final class C77360j implements AbstractC66586a {

    /* renamed from: a */
    public static boolean f173557a;

    /* renamed from: b */
    public static final C77361a f173558b = new C77361a((byte) 0);

    /* renamed from: c */
    private final HashMap<String, C89378p<List<EnterRoomConfig>, AbstractC66587b>> f173559c = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.story.live.j$b */
    static final class C77362b implements AbstractC11769i {

        /* renamed from: c */
        public static final C77363a f173560c = new C77363a((byte) 0);

        /* renamed from: a */
        List<EnterRoomConfig> f173561a;

        /* renamed from: b */
        AbstractC66587b f173562b;

        static {
            Covode.recordClassIndex(90391);
        }

        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
        /* renamed from: a */
        public final void mo18718a(long j) {
        }

        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
        /* renamed from: b */
        public final void mo18720b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.story.live.j$b$a */
        public static final class C77363a {
            static {
                Covode.recordClassIndex(90392);
            }

            private C77363a() {
            }

            public /* synthetic */ C77363a(byte b) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.live.j$b$b */
        static final class C77364b {

            /* renamed from: a */
            static C77362b f173563a = new C77362b((byte) 0);

            /* renamed from: b */
            public static final C77364b f173564b = new C77364b();

            private C77364b() {
            }

            static {
                Covode.recordClassIndex(90393);
            }
        }

        private C77362b() {
        }

        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
        /* renamed from: a */
        public final List<EnterRoomConfig> mo18716a() {
            return this.f173561a;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.live.j$b$c */
        public static final class C77365c implements AbstractC66587b.AbstractC66588a {

            /* renamed from: a */
            final /* synthetic */ AbstractC11769i.AbstractC11770a f173565a;

            static {
                Covode.recordClassIndex(90394);
            }

            C77365c(AbstractC11769i.AbstractC11770a aVar) {
                this.f173565a = aVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66587b.AbstractC66588a
            /* renamed from: a */
            public final void mo105596a(String str) {
                C89219l.m154721d(str, "");
                this.f173565a.mo15381a();
            }

            @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66587b.AbstractC66588a
            /* renamed from: a */
            public final void mo105597a(List<? extends Aweme> list) {
                C89219l.m154721d(list, "");
                this.f173565a.mo15382a(C77361a.m135296a(list));
            }
        }

        public /* synthetic */ C77362b(byte b) {
            this();
        }

        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
        /* renamed from: a */
        public final void mo18719a(Map<String, String> map) {
            C89219l.m154721d(map, "");
            AbstractC66587b bVar = this.f173562b;
            if (bVar != null) {
                bVar.mo73071a(map);
            }
        }

        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i
        /* renamed from: a */
        public final void mo18717a(int i, AbstractC11769i.AbstractC11770a aVar) {
            C89219l.m154721d(aVar, "");
            AbstractC66587b bVar = this.f173562b;
            if (bVar != null) {
                bVar.mo73070a(new C77365c(aVar));
            }
        }
    }

    static {
        Covode.recordClassIndex(90389);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.live.j$a */
    public static final class C77361a {
        static {
            Covode.recordClassIndex(90390);
        }

        private C77361a() {
        }

        public /* synthetic */ C77361a(byte b) {
            this();
        }

        /* renamed from: a */
        private static /* synthetic */ EnterRoomConfig m135293a(Aweme aweme) {
            return m135294a(aweme, new EnterRoomConfig());
        }

        /* renamed from: a */
        public static List<EnterRoomConfig> m135296a(List<? extends Aweme> list) {
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                return arrayList;
            }
            for (Aweme aweme : list) {
                EnterRoomConfig a = m135293a(aweme);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public static EnterRoomConfig m135294a(Aweme aweme, EnterRoomConfig enterRoomConfig) {
            if (aweme != null) {
                m135295a(aweme.getNewLiveRoomData(), enterRoomConfig);
            }
            return enterRoomConfig;
        }

        /* renamed from: a */
        public static EnterRoomConfig m135295a(LiveRoomStruct liveRoomStruct, EnterRoomConfig enterRoomConfig) {
            LiveStreamUrlExtra.SrConfig srConfig;
            if (liveRoomStruct != null) {
                enterRoomConfig.f28233c.f28301R = liveRoomStruct.f114485id;
                enterRoomConfig.f28233c.f28287D = String.valueOf(liveRoomStruct.userId);
                if (liveRoomStruct.isScreenshot) {
                    enterRoomConfig.f28231a.f28383j = 4;
                } else if (liveRoomStruct.isThirdParty) {
                    enterRoomConfig.f28231a.f28383j = 3;
                } else if (liveRoomStruct.liveTypeAudio) {
                    enterRoomConfig.f28231a.f28383j = 2;
                }
                enterRoomConfig.f28231a.f28377d = liveRoomStruct.getMultiStreamData();
                enterRoomConfig.f28231a.f28376c = null;
                enterRoomConfig.f28231a.f28379f = liveRoomStruct.getMultiStreamDefaultQualitySdkKey();
                LiveStreamUrlExtra streamUrlExtra = liveRoomStruct.getStreamUrlExtra();
                if (!(streamUrlExtra == null || (srConfig = streamUrlExtra.getSrConfig()) == null)) {
                    enterRoomConfig.f28231a.f28380g = srConfig.enabled;
                    enterRoomConfig.f28231a.f28381h = srConfig.antiAlias;
                    enterRoomConfig.f28231a.f28382i = srConfig.strength;
                }
            }
            return enterRoomConfig;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.live.j$c */
    public static final class C77366c {

        /* renamed from: a */
        public static final AbstractC66586a f173566a = new C77360j();

        /* renamed from: b */
        public static final C77366c f173567b = new C77366c();

        private C77366c() {
        }

        static {
            Covode.recordClassIndex(90395);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final void mo105594a(Context context, User user, boolean z) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(user, "");
        if (!m135277a(user)) {
            new C79459a(context).mo123050a(R.string.esx).mo123053a();
            return;
        }
        C77354d.m135263a(z, 1, user.getRequestId(), user.getUid(), user.roomId);
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28233c.f28293J = "others_homepage";
        enterRoomConfig.f28233c.f28295L = "others_photo";
        mo105593a(context, user, enterRoomConfig);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final void mo105590a(Context context, EnterRoomConfig enterRoomConfig, User user, long[] jArr, long j, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d(jArr, "");
        if (!f173557a) {
            if (!m135277a(user)) {
                LiveHostOuterService.m107232p().mo95803a(user.getUid(), user.getSecUid(), new C77373j(this, context, enterRoomConfig, jArr, i, user));
                f173557a = true;
                return;
            }
            C6204h.m13474a(C77374k.f173595a);
            enterRoomConfig.f28233c.f28291H = jArr;
            enterRoomConfig.f28233c.f28293J = "message";
            enterRoomConfig.f28233c.f28295L = "live_cell";
            enterRoomConfig.f28232b.f28258b = String.valueOf(j);
            enterRoomConfig.f28232b.f28256M = i;
            mo105593a(context, user, enterRoomConfig);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final void mo105591a(Context context, EnterRoomConfig enterRoomConfig, String str) {
        C89219l.m154721d(enterRoomConfig, "");
        mo120930a(context, str, enterRoomConfig, (List<Long>) null, (String) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final void mo105593a(Context context, User user, EnterRoomConfig enterRoomConfig) {
        if (context != null && user != null && enterRoomConfig != null) {
            String str = enterRoomConfig.f28232b.f28257a;
            if (str == null || str.length() == 0) {
                enterRoomConfig.f28232b.f28257a = user.getRequestId();
            }
            int followStatus = user.getFollowStatus();
            if (followStatus == 0 || followStatus == 1 || followStatus == 2) {
                enterRoomConfig.f28233c.f28289F = String.valueOf(followStatus);
            } else {
                enterRoomConfig.f28233c.f28289F = "3";
            }
            String str2 = user.roomData;
            long j = user.roomId;
            if (TextUtils.isEmpty(enterRoomConfig.f28232b.f28258b)) {
                enterRoomConfig.f28232b.f28258b = user.getUid();
            }
            if (!TextUtils.isEmpty(enterRoomConfig.f28233c.f28348d)) {
                enterRoomConfig.f28233c.f28348d = user.getSecUid();
            }
            enterRoomConfig.f28233c.f28301R = j;
            EnterRoomConfig.GuestUser guestUser = enterRoomConfig.f28233c.f28340au;
            if (guestUser != null && guestUser.f28239a == 0) {
                try {
                    EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.f28233c.f28340au;
                    if (guestUser2 != null) {
                        String uid = user.getUid();
                        C89219l.m154716b(uid, "");
                        guestUser2.f28239a = Long.parseLong(uid);
                    }
                } catch (NumberFormatException unused) {
                    EnterRoomConfig.GuestUser guestUser3 = enterRoomConfig.f28233c.f28340au;
                    if (guestUser3 != null) {
                        guestUser3.f28239a = -1;
                    }
                }
                EnterRoomConfig.GuestUser guestUser4 = enterRoomConfig.f28233c.f28340au;
                if (guestUser4 != null) {
                    guestUser4.f28240b = user.getUniqueId();
                }
            }
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                C89219l.m154716b(avatarThumb, "");
                if (C13617h.m24466b(avatarThumb.getUrlList())) {
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    C89219l.m154716b(avatarThumb2, "");
                    roomsData.f28344ay = new ImageModel(null, avatarThumb2.getUrlList());
                }
            }
            mo105591a(context, enterRoomConfig, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final void mo105592a(Context context, NewLiveRoomStruct newLiveRoomStruct, EnterRoomConfig enterRoomConfig) {
        LiveStreamUrlExtra.SrConfig srConfig;
        C89219l.m154721d(enterRoomConfig, "");
        if (newLiveRoomStruct != null) {
            enterRoomConfig.f28233c.f28301R = newLiveRoomStruct.f114488id;
            enterRoomConfig.f28231a.f28385l = newLiveRoomStruct.f114488id;
            enterRoomConfig.f28231a.f28383j = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
            enterRoomConfig.f28231a.f28377d = newLiveRoomStruct.getMultiStreamData();
            enterRoomConfig.f28231a.f28376c = null;
            enterRoomConfig.f28231a.f28379f = newLiveRoomStruct.getMultiStreamDefaultQualitySdkKey();
            LiveStreamUrlExtra streamUrlExtra = newLiveRoomStruct.getStreamUrlExtra();
            if (!(streamUrlExtra == null || (srConfig = streamUrlExtra.getSrConfig()) == null)) {
                enterRoomConfig.f28231a.f28380g = srConfig.enabled;
                enterRoomConfig.f28231a.f28381h = srConfig.antiAlias;
                enterRoomConfig.f28231a.f28382i = srConfig.strength;
            }
        }
        mo120930a(context, "", enterRoomConfig, (List<Long>) null, (String) null);
    }

    /* renamed from: a */
    public final void mo120930a(Context context, String str, EnterRoomConfig enterRoomConfig, List<Long> list, String str2) {
        if (m135278b() && !m135280d()) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gj1);
        } else if (Live.getService() != null) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                if (C80580in.m139687c() || C80580in.m139691e()) {
                    C20700a.C20701a.f48888a.mo34111a("ttlive_minor_mode_live", 0, new HashMap());
                }
                if (C13624l.m24486b(context) || ((AbstractC20696f) C20688a.m38943b(AbstractC20696f.class)).mo34110b(context) || !(context instanceof Activity) || LiveHostOuterService.m107232p().mo95811c(context) || !m135276a()) {
                    m135274a(str, enterRoomConfig);
                    enterRoomConfig.f28231a.f28374a = true;
                    if (list != null && !C13603b.m24435a((Collection) list)) {
                        long[] jArr = new long[list.size()];
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            jArr[i] = list.get(i).longValue();
                        }
                        enterRoomConfig.f28233c.f28291H = jArr;
                    }
                    C11870f.C11871a.f28404a.mo19012a(new EnterRoomLinkSession(enterRoomConfig));
                    Event event = new Event("ttlive_live_watch_live", 3328, EnumC11866b.SdkInterfaceCall);
                    event.mo19003a("live $ watchLive ");
                    C11870f fVar = C11870f.C11871a.f28404a;
                    C89219l.m154716b(fVar, "");
                    fVar.mo19010a().mo18994a(event);
                    if (!TextUtils.isEmpty(str2)) {
                        enterRoomConfig.f28233c.f28292I = str2;
                    }
                    enterRoomConfig.f28233c.f28320aa = "outside_normal_click";
                    LivePlayActivity.m107294a(context, enterRoomConfig);
                    m135275a(enterRoomConfig.f28233c.f28293J, enterRoomConfig.f28233c.f28295L);
                    return;
                }
                new C17197a.C17200a(context).mo27194b(R.string.h7f).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC77375l(this, context, str, enterRoomConfig, list, str2), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC77376m(enterRoomConfig), false).mo27193a().mo27184b();
            } else if (context instanceof Activity) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_fullscreen_dialog", true);
                bundle.putBoolean("is_skippable_dialog", false);
                IAccountService.C31274d dVar = new IAccountService.C31274d();
                dVar.f74961b = enterRoomConfig.f28233c.f28293J;
                dVar.f74962c = enterRoomConfig.f28233c.f28295L;
                dVar.f74960a = (Activity) context;
                dVar.f74963d = bundle;
                dVar.f74964e = new C77377n(this, context, str, enterRoomConfig, list, str2);
                AccountService.m65215a().mo57071g().showLoginAndRegisterView(dVar.mo57084a());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final void mo105589a(Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List<LiveRoomStruct> list, AbstractC66587b bVar) {
        EnterRoomConfig.RoomsData roomsData;
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(liveRoomStruct, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        if (context != null) {
            this.f173559c.clear();
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (LiveRoomStruct liveRoomStruct2 : list) {
                    EnterRoomConfig a = C77361a.m135295a(liveRoomStruct2, new EnterRoomConfig());
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            this.f173559c.put(String.valueOf(bVar.hashCode()), new C89378p<>(arrayList, bVar));
            if (m135278b() && !m135280d()) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gj1);
            } else if (Live.getService() != null) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                String str = null;
                if (g.isLogin()) {
                    if (C80580in.m139687c() || C80580in.m139691e()) {
                        C20700a.C20701a.f48888a.mo34111a("ttlive_minor_mode_live", 0, new HashMap());
                    }
                    if (!C13624l.m24486b(context) && !((AbstractC20696f) C20688a.m38943b(AbstractC20696f.class)).mo34110b(context) && (context instanceof Activity) && !LiveHostOuterService.m107232p().mo95811c(context) && m135276a()) {
                        new C17197a.C17200a(context).mo27194b(R.string.h7f).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC77370g(this, context, enterRoomConfig, liveRoomStruct, list, bVar), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC77371h.f173582a, false).mo27193a().mo27184b();
                    } else if (!list.isEmpty()) {
                        list.get(0);
                        EnterRoomConfig a2 = C77361a.m135295a(liveRoomStruct, enterRoomConfig);
                        if (a2 != null) {
                            EnterRoomConfig.SearchWrapData searchWrapData = a2.f28235e;
                            if (searchWrapData != null) {
                                searchWrapData.f28372a = String.valueOf(bVar.hashCode());
                            }
                            EnterRoomConfig.RoomsData roomsData2 = a2.f28233c;
                            if (roomsData2 != null) {
                                roomsData2.f28320aa = "outside_normal_click";
                            }
                        }
                        EnterRoomLinkSession.m20943a(a2);
                        Event event = new Event("ttlive_live_watch_live", 3328, EnumC11866b.SdkInterfaceCall);
                        event.mo19003a("live $ watchLive ");
                        C11870f fVar = C11870f.C11871a.f28404a;
                        C89219l.m154716b(fVar, "");
                        fVar.mo19010a().mo18994a(event);
                        LivePlayActivity.m107294a(context, a2);
                        if (!(a2 == null || (roomsData = a2.f28233c) == null)) {
                            str = roomsData.f28295L;
                        }
                        m135275a("search", str);
                    }
                } else if (context instanceof Activity) {
                    C58957c.m108320a((Activity) context, "personal_homepage", "click", new Bundle(), (AbstractC34543f) null);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.live.j$d */
    static final class C77367d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C77367d f173568a = new C77367d();

        static {
            Covode.recordClassIndex(90396);
        }

        C77367d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            LivePerformanceManager.getInstance().initStartValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.live.j$k */
    static final class C77374k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C77374k f173595a = new C77374k();

        static {
            Covode.recordClassIndex(90403);
        }

        C77374k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            LivePerformanceManager.getInstance().initStartValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private static boolean m135279c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m135280d() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean c = m135279c();
        C58029j.f132253e = c;
        return c;
    }

    /* renamed from: a */
    private static boolean m135276a() {
        if (Live.getService() == null) {
            return true;
        }
        Integer num = (Integer) Live.getService().mo12981a("live_mt_remove_traffic_dialog", (Object) 0);
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m135278b() {
        Integer num;
        if (Live.getService() == null || (num = (Integer) Live.getService().mo12981a("live_opt_enter_room_success", (Object) 0)) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.live.j$j */
    public static final class C77373j implements ILiveHostOuterService.AbstractC58469a {

        /* renamed from: a */
        final /* synthetic */ C77360j f173589a;

        /* renamed from: b */
        final /* synthetic */ Context f173590b;

        /* renamed from: c */
        final /* synthetic */ EnterRoomConfig f173591c;

        /* renamed from: d */
        final /* synthetic */ long[] f173592d;

        /* renamed from: e */
        final /* synthetic */ int f173593e;

        /* renamed from: f */
        final /* synthetic */ User f173594f;

        static {
            Covode.recordClassIndex(90402);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService.AbstractC58469a
        /* renamed from: a */
        public final void mo95825a(Exception exc) {
            C89219l.m154721d(exc, "");
            C77360j.f173557a = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService.AbstractC58469a
        /* renamed from: a */
        public final void mo95824a(User user) {
            C77360j.f173557a = false;
            if (user != null) {
                if (!C77360j.m135277a(user)) {
                    new C79459a(this.f173590b).mo123050a(R.string.esx).mo123053a();
                    return;
                }
                this.f173591c.f28233c.f28291H = this.f173592d;
                this.f173591c.f28233c.f28293J = "message";
                this.f173591c.f28233c.f28295L = "live_cell";
                this.f173591c.f28232b.f28256M = this.f173593e;
                this.f173589a.mo105593a(this.f173590b, this.f173594f, this.f173591c);
            }
        }

        C77373j(C77360j jVar, Context context, EnterRoomConfig enterRoomConfig, long[] jArr, int i, User user) {
            this.f173589a = jVar;
            this.f173590b = context;
            this.f173591c = enterRoomConfig;
            this.f173592d = jArr;
            this.f173593e = i;
            this.f173594f = user;
        }
    }

    /* renamed from: a */
    public static boolean m135277a(User user) {
        if (user == null || user.isBlock()) {
            return false;
        }
        if (!(!C80580in.m139685b(user, false) || user.getFollowStatus() == 2 || user.getFollowStatus() == 1)) {
            C31575b.m65859a();
            IAccountUserService e = C31575b.f75524a.mo57069e();
            C89219l.m154716b(e, "");
            if (!C89219l.m154714a((Object) e.getCurUserId(), (Object) user.getUid())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final AbstractC11769i mo105585a(String str) {
        AbstractC66587b bVar;
        C89219l.m154721d(str, "");
        C77362b bVar2 = C77362b.C77364b.f173563a;
        HashMap<String, C89378p<List<EnterRoomConfig>, AbstractC66587b>> hashMap = this.f173559c;
        C89219l.m154721d(hashMap, "");
        C89378p<List<EnterRoomConfig>, AbstractC66587b> pVar = hashMap.get(str);
        List<EnterRoomConfig> list = null;
        if (pVar != null) {
            bVar = pVar.getSecond();
        } else {
            bVar = null;
        }
        bVar2.f173562b = bVar;
        C89378p<List<EnterRoomConfig>, AbstractC66587b> pVar2 = hashMap.get(str);
        if (pVar2 != null) {
            list = pVar2.getFirst();
        }
        bVar2.f173561a = list;
        return C77362b.C77364b.f173563a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.live.j$f */
    public static final class DialogInterface$OnClickListenerC77369f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC77369f f173575a = new DialogInterface$OnClickListenerC77369f();

        static {
            Covode.recordClassIndex(90398);
        }

        DialogInterface$OnClickListenerC77369f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.live.j$h */
    public static final class DialogInterface$OnClickListenerC77371h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC77371h f173582a = new DialogInterface$OnClickListenerC77371h();

        static {
            Covode.recordClassIndex(90400);
        }

        DialogInterface$OnClickListenerC77371h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final void mo105587a(Context context, EnterRoomConfig enterRoomConfig) {
        C89219l.m154721d(enterRoomConfig, "");
        mo120930a(context, "", enterRoomConfig, (List<Long>) null, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.live.j$l */
    public static final class DialogInterface$OnClickListenerC77375l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77360j f173596a;

        /* renamed from: b */
        final /* synthetic */ Context f173597b;

        /* renamed from: c */
        final /* synthetic */ String f173598c;

        /* renamed from: d */
        final /* synthetic */ EnterRoomConfig f173599d;

        /* renamed from: e */
        final /* synthetic */ List f173600e;

        /* renamed from: f */
        final /* synthetic */ String f173601f;

        static {
            Covode.recordClassIndex(90404);
        }

        DialogInterface$OnClickListenerC77375l(C77360j jVar, Context context, String str, EnterRoomConfig enterRoomConfig, List list, String str2) {
            this.f173596a = jVar;
            this.f173597b = context;
            this.f173598c = str;
            this.f173599d = enterRoomConfig;
            this.f173600e = list;
            this.f173601f = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((AbstractC20696f) C20688a.m38943b(AbstractC20696f.class)).mo34109a(this.f173597b);
            this.f173596a.mo120930a(this.f173597b, this.f173598c, this.f173599d, this.f173600e, this.f173601f);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    private static void m135275a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from_merge", str);
            jSONObject.put("enter_method", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C12290b.m22060a("ttlive_enter_room_live_entrance", 0, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.live.j$e */
    public static final class DialogInterface$OnClickListenerC77368e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77360j f173569a;

        /* renamed from: b */
        final /* synthetic */ Context f173570b;

        /* renamed from: c */
        final /* synthetic */ EnterRoomConfig f173571c;

        /* renamed from: d */
        final /* synthetic */ Aweme f173572d;

        /* renamed from: e */
        final /* synthetic */ List f173573e;

        /* renamed from: f */
        final /* synthetic */ AbstractC66587b f173574f;

        static {
            Covode.recordClassIndex(90397);
        }

        DialogInterface$OnClickListenerC77368e(C77360j jVar, Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List list, AbstractC66587b bVar) {
            this.f173569a = jVar;
            this.f173570b = context;
            this.f173571c = enterRoomConfig;
            this.f173572d = aweme;
            this.f173573e = list;
            this.f173574f = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            ((AbstractC20696f) C20688a.m38943b(AbstractC20696f.class)).mo34109a(this.f173570b);
            this.f173569a.mo105588a(this.f173570b, this.f173571c, this.f173572d, this.f173573e, this.f173574f);
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.live.j$g */
    public static final class DialogInterface$OnClickListenerC77370g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77360j f173576a;

        /* renamed from: b */
        final /* synthetic */ Context f173577b;

        /* renamed from: c */
        final /* synthetic */ EnterRoomConfig f173578c;

        /* renamed from: d */
        final /* synthetic */ LiveRoomStruct f173579d;

        /* renamed from: e */
        final /* synthetic */ List f173580e;

        /* renamed from: f */
        final /* synthetic */ AbstractC66587b f173581f;

        static {
            Covode.recordClassIndex(90399);
        }

        DialogInterface$OnClickListenerC77370g(C77360j jVar, Context context, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List list, AbstractC66587b bVar) {
            this.f173576a = jVar;
            this.f173577b = context;
            this.f173578c = enterRoomConfig;
            this.f173579d = liveRoomStruct;
            this.f173580e = list;
            this.f173581f = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            ((AbstractC20696f) C20688a.m38943b(AbstractC20696f.class)).mo34109a(this.f173577b);
            this.f173576a.mo105589a(this.f173577b, this.f173578c, this.f173579d, this.f173580e, this.f173581f);
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.live.j$m */
    public static final class DialogInterface$OnClickListenerC77376m implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterRoomConfig f173602a;

        static {
            Covode.recordClassIndex(90405);
        }

        DialogInterface$OnClickListenerC77376m(EnterRoomConfig enterRoomConfig) {
            this.f173602a = enterRoomConfig;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            if (TextUtils.equals(this.f173602a.f28233c.f28293J, "push")) {
                if (C13627m.m24498a(this.f173602a.f28232b.f28258b)) {
                    str = "";
                } else {
                    str = this.f173602a.f28232b.f28258b;
                }
                C77354d.m135259a(str, this.f173602a.f28233c.f28301R, "no_wifi_dialog_cancel");
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    private static void m135274a(String str, EnterRoomConfig enterRoomConfig) {
        String str2;
        if (enterRoomConfig != null && !TextUtils.isEmpty(str) && C13627m.m24498a(enterRoomConfig.f28231a.f28377d) && C13627m.m24498a(enterRoomConfig.f28231a.f28375b)) {
            int i = 1;
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                Boolean enableEnterLiveRoomStreamOpt = iESSettingsProxy.getEnableEnterLiveRoomStreamOpt();
                if (enableEnterLiveRoomStreamOpt != null && !enableEnterLiveRoomStreamOpt.booleanValue()) {
                    return;
                }
            } catch (C16041a e) {
                e.printStackTrace();
            }
            Long l = null;
            if (1 != 0) {
                try {
                    SlimRoom slimRoom = (SlimRoom) C80342dg.m139301a(str, SlimRoom.class);
                    if (slimRoom != null) {
                        enterRoomConfig.f28231a.f28385l = slimRoom.getId();
                        enterRoomConfig.f28231a.f28375b = slimRoom.buildPullUrl();
                        enterRoomConfig.f28231a.f28376c = slimRoom.getSdkParams();
                        enterRoomConfig.f28231a.f28377d = slimRoom.getMultiStreamData();
                        enterRoomConfig.f28231a.f28379f = slimRoom.getMultiStreamDefaultQualitySdkKey();
                        C11738s streamUrlExtraSafely = slimRoom.getStreamUrlExtraSafely();
                        C89219l.m154716b(streamUrlExtraSafely, "");
                        C11738s.C11739a aVar = streamUrlExtraSafely.f28106n;
                        if (aVar != null) {
                            enterRoomConfig.f28231a.f28380g = aVar.f28114a;
                            enterRoomConfig.f28231a.f28381h = aVar.f28115b;
                            enterRoomConfig.f28231a.f28382i = aVar.f28116c;
                        }
                        enterRoomConfig.f28231a.f28383j = slimRoom.getStreamType().ordinal();
                        if (slimRoom.getLinkMic() != null) {
                            EnterRoomConfig.GuestUser guestUser = enterRoomConfig.f28233c.f28340au;
                            if (guestUser != null && guestUser.f28239a == 0) {
                                SlimRoom.C11692a linkMic = slimRoom.getLinkMic();
                                C89219l.m154716b(linkMic, "");
                                if (linkMic.f27944a != null) {
                                    SlimRoom.C11692a linkMic2 = slimRoom.getLinkMic();
                                    C89219l.m154716b(linkMic2, "");
                                    if (linkMic2.f27944a.size() > 0) {
                                        EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.f28233c.f28340au;
                                        if (guestUser2 != null) {
                                            SlimRoom.C11692a linkMic3 = slimRoom.getLinkMic();
                                            C89219l.m154716b(linkMic3, "");
                                            com.bytedance.android.live.base.model.user.User user = linkMic3.f27944a.get(0);
                                            C89219l.m154716b(user, "");
                                            guestUser2.f28239a = user.getId();
                                        }
                                        EnterRoomConfig.GuestUser guestUser3 = enterRoomConfig.f28233c.f28340au;
                                        if (guestUser3 != null) {
                                            SlimRoom.C11692a linkMic4 = slimRoom.getLinkMic();
                                            C89219l.m154716b(linkMic4, "");
                                            guestUser3.f28240b = linkMic4.f27944a.get(0).getDisplayId();
                                        }
                                    }
                                }
                            }
                            SlimRoom.C11692a linkMic5 = slimRoom.getLinkMic();
                            C89219l.m154716b(linkMic5, "");
                            if (linkMic5.f27945b != null) {
                                EnterRoomConfig.GuestUser guestUser4 = enterRoomConfig.f28233c.f28340au;
                                if (guestUser4 != null) {
                                    SlimRoom.C11692a linkMic6 = slimRoom.getLinkMic();
                                    C89219l.m154716b(linkMic6, "");
                                    if (linkMic6.f27945b.size() <= 0) {
                                        i = 0;
                                    }
                                    guestUser4.f28241c = i;
                                }
                                EnterRoomConfig.GuestUser guestUser5 = enterRoomConfig.f28233c.f28340au;
                                if (guestUser5 != null) {
                                    SlimRoom.C11692a linkMic7 = slimRoom.getLinkMic();
                                    C89219l.m154716b(linkMic7, "");
                                    List<Long> list = linkMic7.f27945b;
                                    EnterRoomConfig.GuestUser guestUser6 = enterRoomConfig.f28233c.f28340au;
                                    if (guestUser6 != null) {
                                        l = Long.valueOf(guestUser6.f28239a);
                                    }
                                    if (list.contains(l)) {
                                        str2 = "guest";
                                    } else {
                                        str2 = "anchor";
                                    }
                                    guestUser5.f28242d = str2;
                                }
                            }
                        }
                        enterRoomConfig.f28233c.f28336aq = slimRoom.isLiveTypeScreenshot();
                        if (slimRoom.warningTag != null) {
                            enterRoomConfig.f28233c.f28315aE = slimRoom.warningTag;
                        }
                        if (slimRoom.maskLayer != null) {
                            enterRoomConfig.f28233c.f28314aD = slimRoom.maskLayer;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.live.j$i */
    public static final class C77372i implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ C77360j f173583a;

        /* renamed from: b */
        final /* synthetic */ Context f173584b;

        /* renamed from: c */
        final /* synthetic */ EnterRoomConfig f173585c;

        /* renamed from: d */
        final /* synthetic */ Aweme f173586d;

        /* renamed from: e */
        final /* synthetic */ List f173587e;

        /* renamed from: f */
        final /* synthetic */ AbstractC66587b f173588f;

        static {
            Covode.recordClassIndex(90401);
        }

        C77372i(C77360j jVar, Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List list, AbstractC66587b bVar) {
            this.f173583a = jVar;
            this.f173584b = context;
            this.f173585c = enterRoomConfig;
            this.f173586d = aweme;
            this.f173587e = list;
            this.f173588f = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                this.f173583a.mo105588a(this.f173584b, this.f173585c, this.f173586d, this.f173587e, this.f173588f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.live.j$n */
    public static final class C77377n implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ C77360j f173603a;

        /* renamed from: b */
        final /* synthetic */ Context f173604b;

        /* renamed from: c */
        final /* synthetic */ String f173605c;

        /* renamed from: d */
        final /* synthetic */ EnterRoomConfig f173606d;

        /* renamed from: e */
        final /* synthetic */ List f173607e;

        /* renamed from: f */
        final /* synthetic */ String f173608f;

        static {
            Covode.recordClassIndex(90406);
        }

        C77377n(C77360j jVar, Context context, String str, EnterRoomConfig enterRoomConfig, List list, String str2) {
            this.f173603a = jVar;
            this.f173604b = context;
            this.f173605c = str;
            this.f173606d = enterRoomConfig;
            this.f173607e = list;
            this.f173608f = str2;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                this.f173603a.mo120930a(this.f173604b, this.f173605c, this.f173606d, this.f173607e, this.f173608f);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: b */
    public final void mo105595b(Context context, EnterRoomConfig enterRoomConfig, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(str, "");
        if (Live.getService() != null) {
            C6204h.m13474a(C77367d.f173568a);
            HashMap hashMap = new HashMap();
            hashMap.put("intercept", "new_style");
            hashMap.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", str);
            hashMap.put("toplive_position", enterRoomConfig.f28232b.f28250G);
            enterRoomConfig.f28233c.f28299P = str;
            enterRoomConfig.f28232b.f28256M = 0;
            EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
            C11870f.C11871a.f28404a.mo19012a(enterRoomLinkSession);
            enterRoomLinkSession.mo18994a(new Event("ttlive_enter_live_converge_start", 3329, EnumC11866b.BussinessApiCall));
            if (enterRoomConfig.f28233c.f28298O && Live.getService() != null) {
                AbstractC11846d service = Live.getService();
                C89219l.m154716b(service, "");
                if (service.mo13034o() != null) {
                    AbstractC11846d service2 = Live.getService();
                    C89219l.m154716b(service2, "");
                    service2.mo13034o().mo13211a(hashMap);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final void mo105588a(Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List<Aweme> list, AbstractC66587b bVar) {
        String str;
        EnterRoomConfig.RoomsData roomsData;
        Aweme aweme2 = aweme;
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        if (context != null) {
            this.f173559c.clear();
            this.f173559c.put(String.valueOf(bVar.hashCode()), new C89378p<>(C77361a.m135296a(list), bVar));
            if (m135278b() && !m135280d()) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gj1);
            } else if (Live.getService() != null) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    if (C80580in.m139687c() || C80580in.m139691e()) {
                        C20700a.C20701a.f48888a.mo34111a("ttlive_minor_mode_live", 0, new HashMap());
                    }
                    if (!C13624l.m24486b(context) && !((AbstractC20696f) C20688a.m38943b(AbstractC20696f.class)).mo34110b(context) && (context instanceof Activity) && !LiveHostOuterService.m107232p().mo95811c(context) && m135276a()) {
                        new C17197a.C17200a(context).mo27194b(R.string.h7f).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC77368e(this, context, enterRoomConfig, aweme2, list, bVar), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC77369f.f173575a, false).mo27193a().mo27184b();
                    } else if (!list.isEmpty()) {
                        Aweme aweme3 = list.get(0);
                        if (aweme2 == null) {
                            aweme2 = aweme3;
                        }
                        EnterRoomConfig a = C77361a.m135294a(aweme2, enterRoomConfig);
                        if (a != null) {
                            EnterRoomConfig.SearchWrapData searchWrapData = a.f28235e;
                            if (searchWrapData != null) {
                                searchWrapData.f28372a = String.valueOf(bVar.hashCode());
                            }
                            EnterRoomConfig.RoomsData roomsData2 = a.f28233c;
                            if (roomsData2 != null) {
                                roomsData2.f28320aa = "outside_normal_click";
                            }
                        }
                        EnterRoomLinkSession.m20943a(a);
                        Event event = new Event("ttlive_live_watch_live", 3328, EnumC11866b.SdkInterfaceCall);
                        event.mo19003a("live $ watchLive ");
                        C11870f fVar = C11870f.C11871a.f28404a;
                        C89219l.m154716b(fVar, "");
                        fVar.mo19010a().mo18994a(event);
                        LivePlayActivity.m107294a(context, a);
                        if (a == null || (roomsData = a.f28233c) == null) {
                            str = null;
                        } else {
                            str = roomsData.f28295L;
                        }
                        m135275a("search", str);
                    }
                } else if (context instanceof Activity) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_skippable_dialog", false);
                    IAccountService.C31274d dVar = new IAccountService.C31274d();
                    dVar.f74961b = enterRoomConfig.f28233c.f28293J;
                    dVar.f74962c = enterRoomConfig.f28233c.f28295L;
                    dVar.f74960a = (Activity) context;
                    dVar.f74963d = bundle;
                    dVar.f74964e = new C77372i(this, context, enterRoomConfig, aweme2, list, bVar);
                    AccountService.m65215a().mo57071g().showLoginAndRegisterView(dVar.mo57084a());
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a
    /* renamed from: a */
    public final void mo105586a(Context context, long j, EnterRoomConfig enterRoomConfig, String str, ArrayList<Long> arrayList, String str2) {
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        enterRoomConfig.f28233c.f28301R = j;
        enterRoomConfig.f28233c.f28293J = str;
        mo120930a(context, "", enterRoomConfig, arrayList, str2);
    }
}
