package com.p2082ss.android.ugc.aweme.friends.p3019i;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import com.p2082ss.android.ugc.aweme.social.monitor.C74740e;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.i.g */
public final class C51526g {

    /* renamed from: a */
    public static boolean f118739a;

    /* renamed from: b */
    public static AbstractC88412b f118740b;

    /* renamed from: c */
    public static AbstractC88412b f118741c;

    /* renamed from: d */
    public static final C51526g f118742d = new C51526g();

    /* renamed from: e */
    private static final String f118743e = "public_profile, user_friends, email";

    /* renamed from: f */
    private static int f118744f;

    /* renamed from: g */
    private static boolean f118745g;

    /* renamed from: h */
    private static long f118746h;

    /* renamed from: i */
    private static final String[] f118747i = {"android.permission.READ_CONTACTS"};

    private C51526g() {
    }

    /* renamed from: a */
    public static final boolean m95989a() {
        try {
            if (C0643b.m2367a(C17867d.m33078a(), "android.permission.READ_CONTACTS") != -1) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m95995d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(60791);
    }

    /* renamed from: e */
    private static boolean m95996e() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean d = m95995d();
        C58029j.f132253e = d;
        return d;
    }

    /* renamed from: b */
    public static final void m95991b() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            C17867d.m33078a();
            if (m95996e() && m95989a() && C51648a.f118980a.mo87325e()) {
                C1731i.m5640b(CallableC51529c.f118750a, C1731i.f5562a);
            }
        }
    }

    /* renamed from: f */
    private static boolean m95997f() {
        C79519c.C79521b bVar = C79519c.C79521b.f178476a;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if ((TextUtils.isEmpty(bVar.mo86987a(g.getCurUserId())) || !C79519c.C79521b.f178476a.mo86991a()) && Keva.getRepo("friendslist_permission_keva_name").getLong("facebook_next_time_key", 0) < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.g$c */
    static final class CallableC51529c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC51529c f118750a = new CallableC51529c();

        static {
            Covode.recordClassIndex(60794);
        }

        CallableC51529c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Object obj;
            C74740e eVar = C74740e.f167996b;
            UUID randomUUID = UUID.randomUUID();
            C89219l.m154716b(randomUUID, "");
            AbstractC74739d a = eVar.mo117778a(1, randomUUID);
            a.mo117782a();
            List<ContactModelV2> a2 = C80241be.m139077a(C17867d.m33078a(), a, false);
            C89219l.m154716b(a2, "");
            if (!C13603b.m24435a((Collection) a2)) {
                try {
                    UploadContactsApi.m95880a(a2, a, 1, 1);
                    a.mo117789e();
                    obj = C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                Throwable r0 = C89379q.m157071exceptionOrNullimpl(obj);
                if (r0 != null) {
                    a.mo117783a(r0);
                }
                a.mo117791g();
                Keva.getRepo("friendslist_permission_keva_name").storeLong("contact_upload_next_time_key", System.currentTimeMillis() + (SettingsManager.m29616a().mo25395a("addressbook_upload_interval", 86400L) * 1000));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private static boolean m95994c() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f118746h > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            f118746h = elapsedRealtime;
            f118745g = C51648a.f118980a.mo87322d().mo86983b();
        }
        if ((!f118745g || !C51648a.f118980a.mo87322d().mo86982a()) && Keva.getRepo("friendslist_permission_keva_name").getLong("contact_next_time_key", 0) < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m95993b(String str) {
        if (TextUtils.equals(str, "personal_homepage")) {
            C63419ae.f143971a.updateProfilePermission(false);
        }
        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.g$a */
    public static final class C51527a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f118748a;

        static {
            Covode.recordClassIndex(60792);
        }

        public C51527a(String str) {
            this.f118748a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.AUTHORIZED) {
                C51526g.m95988a("facebook_friend_list", 1);
                C51526g.m95993b(this.f118748a);
                AbstractC88412b bVar = C51526g.f118740b;
                if (bVar != null) {
                    bVar.dispose();
                }
                C51526g.f118740b = null;
            }
            if ((dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION || dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION) && !dVar.f178517b.f178518a) {
                C51526g.m95988a("facebook_friend_list", 0);
                C51526g.m95993b(this.f118748a);
                AbstractC88412b bVar2 = C51526g.f118740b;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                C51526g.f118740b = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.g$b */
    public static final class C51528b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f118749a;

        static {
            Covode.recordClassIndex(60793);
        }

        public C51528b(String str) {
            this.f118749a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178517b.f178518a && dVar.f178516a == EnumC79549g.SYNC_STATUS) {
                C51526g.m95988a("contact_list", 1);
                C51526g.m95993b(this.f118749a);
                AbstractC88412b bVar = C51526g.f118741c;
                if (bVar != null) {
                    bVar.dispose();
                }
                C51526g.f118741c = null;
            }
            if ((dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION || dVar.f178516a == EnumC79549g.REQUEST_UID_PERMISSION) && !dVar.f178517b.f178518a) {
                C51526g.m95988a("contact_list", 0);
                C51526g.m95993b(this.f118749a);
                AbstractC88412b bVar2 = C51526g.f118741c;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                C51526g.f118741c = null;
            }
        }
    }

    /* renamed from: a */
    public static boolean m95990a(int i) {
        AbstractC51649b s = C51648a.f118980a.mo87339s();
        if (s != null) {
            C89378p<Boolean, Long> a = s.mo87352a(i);
            if (!a.getFirst().booleanValue() || System.currentTimeMillis() >= a.getSecond().longValue() + 2592000000L) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final void m95992b(int i) {
        if (i == 0) {
            if (C51502a.m95971a() != null) {
                C51535i a = C51502a.m95971a();
                if (a == null) {
                    C89219l.m154715b();
                }
                long j = a.f118768a * 1000;
                Keva.getRepo("friendslist_permission_keva_name").storeLong("contact_next_time_key", System.currentTimeMillis() + j);
                if (f118744f == 2) {
                    Keva.getRepo("friendslist_permission_keva_name").storeLong("facebook_next_time_key", System.currentTimeMillis() + j);
                }
                int i2 = Keva.getRepo("friendslist_permission_keva_name").getInt("contact_freq_time_key", 0);
                C51535i a2 = C51502a.m95971a();
                if (a2 == null) {
                    C89219l.m154715b();
                }
                if (i2 < a2.f118775h) {
                    Keva.getRepo("friendslist_permission_keva_name").storeInt("contact_freq_time_key", i2 + 1);
                }
            }
        } else if (C51523e.m95984a() != null) {
            C51535i a3 = C51523e.m95984a();
            if (a3 == null) {
                C89219l.m154715b();
            }
            long j2 = a3.f118768a * 1000;
            Keva.getRepo("friendslist_permission_keva_name").storeLong("facebook_next_time_key", System.currentTimeMillis() + j2);
            if (f118744f == 2) {
                Keva.getRepo("friendslist_permission_keva_name").storeLong("contact_next_time_key", System.currentTimeMillis() + j2);
            }
            int i3 = Keva.getRepo("friendslist_permission_keva_name").getInt("facebook_freq_time_key", 0);
            C51535i a4 = C51523e.m95984a();
            if (a4 == null) {
                C89219l.m154715b();
            }
            if (i3 < a4.f118775h) {
                Keva.getRepo("friendslist_permission_keva_name").storeInt("facebook_freq_time_key", i3 + 1);
            }
        }
        if (f118739a) {
            f118739a = false;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static final int m95987a(String str) {
        C89219l.m154721d(str, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            return 0;
        }
        boolean c = m95994c();
        if (c) {
            C51535i a = C51502a.m95971a();
            if (a != null && Keva.getRepo("friendslist_permission_keva_name").getInt("contact_freq_time_key", 0) < a.f118775h && !m95990a(1)) {
                switch (str.hashCode()) {
                    case -1572049565:
                        if (str.equals("notification_page")) {
                            c = a.f118772e;
                            break;
                        }
                        break;
                    case -1271119582:
                        if (str.equals("homepage_follow")) {
                            c = a.f118773f;
                            break;
                        }
                        break;
                    case -562830579:
                        if (str.equals("personal_homepage")) {
                            c = a.f118771d;
                            break;
                        }
                        break;
                    case 809483594:
                        if (str.equals("others_homepage")) {
                            c = a.f118774g;
                            break;
                        }
                        break;
                    case 1691937916:
                        if (str.equals("homepage_hot")) {
                            c = a.f118769b;
                            break;
                        }
                        break;
                }
            }
            c = false;
        }
        boolean f = m95997f();
        if (f) {
            C51535i a2 = C51523e.m95984a();
            if (a2 != null && Keva.getRepo("friendslist_permission_keva_name").getInt("facebook_freq_time_key", 0) < a2.f118775h && !m95990a(2)) {
                switch (str.hashCode()) {
                    case -1572049565:
                        if (str.equals("notification_page")) {
                            f = a2.f118772e;
                            break;
                        }
                        break;
                    case -1271119582:
                        if (str.equals("homepage_follow")) {
                            f = a2.f118773f;
                            break;
                        }
                        break;
                    case -562830579:
                        if (str.equals("personal_homepage")) {
                            f = a2.f118771d;
                            break;
                        }
                        break;
                    case 809483594:
                        if (str.equals("others_homepage")) {
                            f = a2.f118774g;
                            break;
                        }
                        break;
                    case 1691937916:
                        if (str.equals("homepage_hot")) {
                            f = a2.f118769b;
                            break;
                        }
                        break;
                }
            }
            f = false;
        }
        if (c) {
            if (!f) {
                f118744f = 1;
                return 1;
            }
            f118744f = 2;
            if (Keva.getRepo("friendslist_permission_keva_name").getInt("popup_next_show_key", 0) != 0) {
                return Keva.getRepo("friendslist_permission_keva_name").getInt("popup_next_show_key", 0);
            }
            if (Keva.getRepo("friendslist_permission_keva_name").getLong("contact_next_time_key", 0) >= Keva.getRepo("friendslist_permission_keva_name").getLong("facebook_next_time_key", 0)) {
                return 1;
            }
            return 2;
        } else if (f) {
            f118744f = 1;
            return 2;
        } else {
            f118744f = 0;
            return 0;
        }
    }

    /* renamed from: a */
    public static final void m95988a(String str, int i) {
        C89219l.m154721d(str, "");
        if (i == 1 && f118744f == 1) {
            f118744f = 0;
            Keva.getRepo("friendslist_permission_keva_name").storeInt("popup_next_show_key", 0);
        } else if (f118744f == 2) {
            if (i == 1) {
                f118744f = 1;
            }
            if (TextUtils.equals(str, "facebook_friend_list")) {
                Keva.getRepo("friendslist_permission_keva_name").storeInt("popup_next_show_key", 2);
            } else {
                Keva.getRepo("friendslist_permission_keva_name").storeInt("popup_next_show_key", 1);
            }
        }
    }
}
