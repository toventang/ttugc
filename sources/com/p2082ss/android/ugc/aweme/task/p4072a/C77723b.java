package com.p2082ss.android.ugc.aweme.task.p4072a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.utils.C80257bo;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Calendar;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.task.a.b */
public final class C77723b implements AbstractC58259r {

    /* renamed from: a */
    public static final C77724a f174303a = new C77724a((byte) 0);

    static {
        Covode.recordClassIndex(90775);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.task.a.b$a */
    public static final class C77724a {
        static {
            Covode.recordClassIndex(90776);
        }

        private C77724a() {
        }

        public /* synthetic */ C77724a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.NORMAL;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: c */
    private static boolean m135776c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: d */
    private static boolean m135777d() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean c = m135776c();
        C58029j.f132253e = c;
        return c;
    }

    /* renamed from: com.ss.android.ugc.aweme.task.a.b$b */
    static final class C77725b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C77725b f174304a = new C77725b();

        static {
            Covode.recordClassIndex(90777);
        }

        C77725b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            FriendList friendList = (FriendList) obj;
            if (friendList != null && (friends = friendList.getFriends()) != null) {
                Integer.valueOf(friends.size());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.task.a.b$c */
    static final class C77726c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f174305a;

        static {
            Covode.recordClassIndex(90778);
        }

        C77726c(String str) {
            this.f174305a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            if (!(th2 instanceof C34485a)) {
                th = null;
            } else {
                th = th2;
            }
            C34480a aVar = (C34480a) th;
            if (aVar != null && aVar.getErrorCode() == 3002047) {
                C51648a.f118980a.mo87327g().mo86992b(this.f174305a);
            }
            if (th2 != null) {
                th2.getMessage();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        long j;
        String str;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        C89219l.m154721d(curUserId, "");
        long c = C51648a.f118980a.mo87327g().mo86994c(curUserId);
        long h = C51648a.f118980a.mo87328h();
        boolean b = C51648a.f118980a.mo87327g().mo86993b();
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        int i = 1;
        if (g2.isLogin() && b && h > 0) {
            C17867d.m33078a();
            if (m135777d() && (c == -1 || c + h <= System.currentTimeMillis())) {
                C51648a.f118980a.mo87327g().mo86988a(curUserId, System.currentTimeMillis());
                C51648a.f118980a.mo87301a(curUserId, 20).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(C77725b.f174304a, new C77726c(curUserId));
            }
        }
        boolean b2 = C51648a.f118980a.mo87322d().mo86983b();
        boolean a = C51648a.f118980a.mo87322d().mo86982a();
        C89219l.m154721d(curUserId, "");
        boolean z2 = C77722a.m135775a().getBoolean("click_contact_open_setting".concat(String.valueOf(curUserId)), false);
        IAccountUserService g3 = C31575b.m65865g();
        C89219l.m154716b(g3, "");
        if (g3.isLogin() && z && b2 && !a && z2) {
            C51648a.f118980a.mo87316b("cold_start");
        }
        C89219l.m154721d(curUserId, "");
        C77722a.m135775a().erase("click_contact_open_setting".concat(String.valueOf(curUserId)));
        C89219l.m154721d(curUserId, "");
        if (TextUtils.isEmpty(curUserId)) {
            j = -1;
        } else {
            j = C77722a.m135775a().getLong("last_cold_boot_time".concat(String.valueOf(curUserId)), -1);
        }
        if (z) {
            IAccountUserService g4 = C31575b.m65865g();
            C89219l.m154716b(g4, "");
            if (g4.isLogin() && !C80580in.m139687c()) {
                C17867d.m33078a();
                if (m135777d() && (j == -1 || !C80257bo.m139107a(j))) {
                    if (C51648a.f118980a.mo87327g().mo86987a(curUserId).length() <= 0) {
                        i = 0;
                    }
                    long d = C51648a.f118980a.mo87327g().mo86995d(curUserId);
                    String str2 = "on";
                    if (C51648a.f118980a.mo87327g().mo86991a()) {
                        str = str2;
                    } else {
                        str = "off";
                    }
                    boolean b3 = C51648a.f118980a.mo87322d().mo86983b();
                    if (!C51648a.f118980a.mo87322d().mo86982a()) {
                        str2 = "off";
                    }
                    C39162r.m79460a("authorize_status_update", new C33744d().mo59983a("user_id", curUserId).mo59980a("has_fb_token", i).mo59981a("token_expire_time", d).mo59983a("facebook_switch", str).mo59980a("has_contact_permission", b3 ? 1 : 0).mo59983a("contact_switch", str2).f79943a);
                    if (!z) {
                        return;
                    }
                }
            }
            Calendar instance = Calendar.getInstance();
            C89219l.m154716b(instance, "");
            long timeInMillis = instance.getTimeInMillis();
            C89219l.m154721d(curUserId, "");
            if (!TextUtils.isEmpty(curUserId)) {
                C77722a.m135775a().storeLong("last_cold_boot_time".concat(String.valueOf(curUserId)), timeInMillis);
            }
        }
    }
}
