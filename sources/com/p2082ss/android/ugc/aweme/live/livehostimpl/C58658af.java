package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.event.C8453f;
import com.bytedance.android.livesdk.livesetting.roomfunction.ReturnBackSettingsSetting;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.p1469l.C20688a;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20696f;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.live.AbstractC58634g;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.deeplink.C58604c;
import com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af */
public final class C58658af implements AbstractC11815j {

    /* renamed from: a */
    public static final C58659a f133560a = new C58659a((byte) 0);

    static {
        Covode.recordClassIndex(68960);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$a */
    public static final class C58659a {
        static {
            Covode.recordClassIndex(68961);
        }

        private C58659a() {
        }

        /* renamed from: a */
        public static boolean m107811a() {
            if (C20688a.m38942a() == null) {
                return true;
            }
            Integer num = (Integer) C20688a.m38942a().mo12981a("live_mt_remove_traffic_dialog", (Object) 0);
            if (num != null && num.intValue() == 0) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C58659a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$d */
    static final class C58662d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C58662d f133568a = new C58662d();

        static {
            Covode.recordClassIndex(68964);
        }

        C58662d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C3854a.m9458a("userid_watchLive", th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$c */
    static final class C58661c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C58658af f133565a;

        /* renamed from: b */
        final /* synthetic */ EnterRoomConfig f133566b;

        /* renamed from: c */
        final /* synthetic */ Context f133567c;

        static {
            Covode.recordClassIndex(68963);
        }

        C58661c(C58658af afVar, EnterRoomConfig enterRoomConfig, Context context) {
            this.f133565a = afVar;
            this.f133566b = enterRoomConfig;
            this.f133567c = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            User user = (User) obj;
            C89219l.m154721d(user, "");
            long liveRoomId = user.getLiveRoomId();
            if (liveRoomId > 0) {
                this.f133566b.f28233c.f28301R = liveRoomId;
                this.f133566b.f28232b.f28267k = liveRoomId;
                this.f133565a.mo18879a(this.f133567c, this.f133566b);
                return;
            }
            String string = C3966y.m9669e().getString(R.string.gpa);
            C89219l.m154716b(string, "");
            C11226ao.m19883a(this.f133567c, string, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$b */
    static final class C58660b extends AbstractC89220m implements AbstractC89172b<C58604c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C58658af f133561a;

        /* renamed from: b */
        final /* synthetic */ EnterRoomConfig f133562b;

        /* renamed from: c */
        final /* synthetic */ String f133563c;

        /* renamed from: d */
        final /* synthetic */ Context f133564d;

        static {
            Covode.recordClassIndex(68962);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58660b(C58658af afVar, EnterRoomConfig enterRoomConfig, String str, Context context) {
            super(1);
            this.f133561a = afVar;
            this.f133562b = enterRoomConfig;
            this.f133563c = str;
            this.f133564d = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C58604c cVar) {
            C58604c cVar2 = cVar;
            if (cVar2 != null) {
                EnterRoomConfig.RoomsData roomsData = this.f133562b.f28233c;
                String str = cVar2.f133473c;
                if (str == null) {
                    str = "0";
                }
                roomsData.f28301R = Long.parseLong(str);
                this.f133562b.f28233c.f28348d = cVar2.f133472b;
                this.f133562b.f28232b.f28258b = cVar2.f133471a;
                this.f133562b.f28233c.f28287D = cVar2.f133471a;
                EnterRoomConfig.GuestUser guestUser = this.f133562b.f28233c.f28340au;
                if (guestUser != null) {
                    long j = 0;
                    if (guestUser.f28239a == 0) {
                        try {
                            EnterRoomConfig.GuestUser guestUser2 = this.f133562b.f28233c.f28340au;
                            if (guestUser2 != null) {
                                String str2 = cVar2.f133471a;
                                if (str2 != null) {
                                    j = Long.parseLong(str2);
                                }
                                guestUser2.f28239a = j;
                            }
                        } catch (NumberFormatException unused) {
                            EnterRoomConfig.GuestUser guestUser3 = this.f133562b.f28233c.f28340au;
                            if (guestUser3 != null) {
                                guestUser3.f28239a = -1;
                            }
                        }
                        EnterRoomConfig.GuestUser guestUser4 = this.f133562b.f28233c.f28340au;
                        if (guestUser4 != null) {
                            guestUser4.f28240b = this.f133563c;
                        }
                    }
                }
                this.f133561a.mo18879a(this.f133564d, this.f133562b);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$f */
    public static final class DialogInterface$OnClickListenerC58664f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC58664f f133571a = new DialogInterface$OnClickListenerC58664f();

        static {
            Covode.recordClassIndex(68966);
        }

        DialogInterface$OnClickListenerC58664f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$g */
    public static final class DialogInterface$OnClickListenerC58665g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC58665g f133572a = new DialogInterface$OnClickListenerC58665g();

        static {
            Covode.recordClassIndex(68967);
        }

        DialogInterface$OnClickListenerC58665g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$h */
    public static final class DialogInterface$OnClickListenerC58666h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC58666h f133573a = new DialogInterface$OnClickListenerC58666h();

        static {
            Covode.recordClassIndex(68968);
        }

        DialogInterface$OnClickListenerC58666h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$j */
    public static final class DialogInterface$OnClickListenerC58668j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC58668j f133578a = new DialogInterface$OnClickListenerC58668j();

        static {
            Covode.recordClassIndex(68970);
        }

        DialogInterface$OnClickListenerC58668j() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    static EnterRoomConfig m107806a(Room room, EnterRoomConfig enterRoomConfig) {
        enterRoomConfig.f28233c.f28308Y = room.getId();
        return enterRoomConfig;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$e */
    public static final class DialogInterface$OnClickListenerC58663e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f133569a;

        /* renamed from: b */
        final /* synthetic */ EnterRoomConfig f133570b;

        static {
            Covode.recordClassIndex(68965);
        }

        DialogInterface$OnClickListenerC58663e(Context context, EnterRoomConfig enterRoomConfig) {
            this.f133569a = context;
            this.f133570b = enterRoomConfig;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((AbstractC20696f) C20688a.m38943b(AbstractC20696f.class)).mo34109a(this.f133569a);
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            AbstractC2953a b = C20688a.m38943b(AbstractC58634g.class);
            C89219l.m154716b(b, "");
            ((AbstractC58634g) b).mo95867b().mo34106a(this.f133569a, this.f133570b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$i */
    public static final class DialogInterface$OnClickListenerC58667i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58658af f133574a;

        /* renamed from: b */
        final /* synthetic */ EnterRoomLinkSession f133575b;

        /* renamed from: c */
        final /* synthetic */ Room f133576c;

        /* renamed from: d */
        final /* synthetic */ EnterRoomConfig f133577d;

        static {
            Covode.recordClassIndex(68969);
        }

        DialogInterface$OnClickListenerC58667i(C58658af afVar, EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig) {
            this.f133574a = afVar;
            this.f133575b = enterRoomLinkSession;
            this.f133576c = room;
            this.f133577d = enterRoomConfig;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            C89219l.m154721d(dialogInterface, "");
            EnterRoomLinkSession enterRoomLinkSession = this.f133575b;
            C89219l.m154716b(enterRoomLinkSession, "");
            Room room = this.f133576c;
            long j = this.f133577d.f28233c.f28301R;
            EnterRoomConfig a = C58658af.m107806a(room, this.f133577d);
            C8452e eVar = new C8452e(j);
            enterRoomLinkSession.mo18994a(new Event("live_scheme_jump_to_other_room", 772, EnumC11866b.BussinessApiCall));
            eVar.f20899d = a;
            if (C89219l.m154714a((Object) "true", (Object) a.f28233c.f28353i)) {
                C6779a.m14563a().mo13053a(new C8453f(eVar));
            } else {
                if (ReturnBackSettingsSetting.INSTANCE.getValue().mo13893a()) {
                    if (!((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoom() || !a.f28233c.f28326ag) {
                        str = "jump_source_live_banner";
                    } else {
                        str = "jump_source_mic_room";
                    }
                    a.f28233c.f28341av = str;
                }
                C6779a.m14563a().mo13053a(eVar);
            }
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11815j
    /* renamed from: b */
    public final void mo18880b(Context context, EnterRoomConfig enterRoomConfig) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(enterRoomConfig, "");
        C11870f.C11871a.f28404a.mo19012a(new EnterRoomLinkSession(enterRoomConfig));
        enterRoomConfig.f28233c.f28320aa = "inner_jump";
        if (C13624l.m24486b(context) || ((AbstractC20696f) C20688a.m38943b(AbstractC20696f.class)).mo34110b(context) || !(context instanceof Activity) || !C58659a.m107811a()) {
            AbstractC2953a b = C20688a.m38943b(AbstractC58634g.class);
            C89219l.m154716b(b, "");
            ((AbstractC58634g) b).mo95867b().mo34106a(context, enterRoomConfig);
            return;
        }
        new C17197a.C17200a(context).mo27194b(R.string.h7f).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC58663e(context, enterRoomConfig), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC58664f.f133571a, false).mo27193a().mo27185c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x022f, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a(r1, com.bytedance.android.livesdk.chatroom.p491f.C7557c.f18769a) == false) goto L_0x0246;
     */
    @Override // com.bytedance.android.livesdkapi.host.AbstractC11815j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18879a(android.content.Context r13, com.bytedance.android.livesdkapi.session.EnterRoomConfig r14) {
        /*
        // Method dump skipped, instructions count: 641
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.livehostimpl.C58658af.mo18879a(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.af$k */
    public static final class C58669k implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ C58658af f133579a;

        /* renamed from: b */
        final /* synthetic */ Context f133580b;

        /* renamed from: c */
        final /* synthetic */ EnterRoomConfig f133581c;

        static {
            Covode.recordClassIndex(68971);
        }

        C58669k(C58658af afVar, Context context, EnterRoomConfig enterRoomConfig) {
            this.f133579a = afVar;
            this.f133580b = context;
            this.f133581c = enterRoomConfig;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                this.f133579a.mo18879a(this.f133580b, this.f133581c);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11815j
    /* renamed from: a */
    public final void mo18877a(Context context, EnterRoomConfig enterRoomConfig, long j) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(enterRoomConfig, "");
        C11115u.m19743a().mo17915b().mo13160b(j).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C58661c(this, enterRoomConfig, context), C58662d.f133568a);
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11815j
    /* renamed from: a */
    public final void mo18878a(Context context, EnterRoomConfig enterRoomConfig, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(str, "");
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        AbstractC77352b f = s.mo95832f();
        C89219l.m154716b(f, "");
        f.mo120929c().mo96057a(str, new C58660b(this, enterRoomConfig, str, context));
    }
}
