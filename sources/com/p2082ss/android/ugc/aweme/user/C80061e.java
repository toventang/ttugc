package com.p2082ss.android.ugc.aweme.user;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.C43107dn;
import com.p2082ss.android.ugc.aweme.C43200dr;
import com.p2082ss.android.ugc.aweme.experiment.C47006hc;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.e */
public final class C80061e implements WeakHandler.IHandler {

    /* renamed from: i */
    public static final String f179401i = "https://api.tiktokv.com/aweme/v1/check/in/";

    /* renamed from: j */
    public static final String f179402j = "https://api.tiktokv.com/tiktok/v1/kids/check/in/";

    /* renamed from: k */
    public static final C80061e f179403k = new C80061e();

    /* renamed from: l */
    public static final C80062a f179404l = new C80062a((byte) 0);

    /* renamed from: a */
    public boolean f179405a;

    /* renamed from: b */
    public boolean f179406b;

    /* renamed from: c */
    public long f179407c = -1;

    /* renamed from: d */
    public final WeakHandler f179408d = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: e */
    public String f179409e;

    /* renamed from: f */
    public User f179410f;

    /* renamed from: g */
    public C80064f.C80065a f179411g;

    /* renamed from: h */
    public String f179412h;

    /* renamed from: com.ss.android.ugc.aweme.user.e$a */
    public static final class C80062a {
        static {
            Covode.recordClassIndex(93293);
        }

        private C80062a() {
        }

        public /* synthetic */ C80062a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.e$b */
    static final class RunnableC80063b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C80061e f179413a;

        /* renamed from: b */
        final /* synthetic */ User f179414b;

        static {
            Covode.recordClassIndex(93294);
        }

        RunnableC80063b(C80061e eVar, User user) {
            this.f179413a = eVar;
            this.f179414b = user;
        }

        public final void run() {
            this.f179413a.mo123511b(this.f179414b);
        }
    }

    /* renamed from: c */
    public final void mo123513c() {
        C80064f.m138828m();
        C43200dr.m86152a(5, null, mo123510b());
        C43107dn.m86004a();
    }

    static {
        Covode.recordClassIndex(93292);
    }

    /* renamed from: a */
    public final String mo123508a() {
        String str = this.f179409e;
        if (str == null) {
            str = C80064f.f179418d.mo123521e();
        }
        this.f179409e = str;
        return str;
    }

    /* renamed from: b */
    public final synchronized User mo123510b() {
        User user;
        MethodCollector.m26663i(12023);
        user = this.f179410f;
        if (user == null) {
            user = C80064f.f179418d.mo123524k();
        }
        this.f179410f = user;
        if (user == null) {
            C89219l.m154715b();
        }
        MethodCollector.m26664o(12023);
        return user;
    }

    /* renamed from: e */
    public final String mo123517e() {
        String a = mo123508a();
        if (a == null) {
            C89219l.m154715b();
        }
        return a;
    }

    /* renamed from: d */
    public final boolean mo123516d() {
        if (mo123510b().getAgeGatePostAction() == 1) {
            return true;
        }
        C80064f.C80065a aVar = this.f179411g;
        if (aVar == null) {
            aVar = C80064f.m138820e(mo123517e());
        }
        this.f179411g = aVar;
        if (aVar == null || !aVar.f179432g) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m138800a(User user) {
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static C80053c m138801e(String str) {
        C89219l.m154721d(str, "");
        return C80064f.m138821f(str);
    }

    /* renamed from: f */
    public static C80064f.C80065a m138802f(String str) {
        C89219l.m154721d(str, "");
        return C80064f.m138820e(str);
    }

    /* renamed from: c */
    public final void mo123514c(String str) {
        if (str != null && !C80064f.m138825h(str)) {
            if (C89219l.m154714a((Object) str, (Object) mo123508a())) {
                this.f179409e = null;
                this.f179410f = null;
                this.f179411g = null;
            }
            C80064f.f179418d.mo123522g(str);
        }
    }

    /* renamed from: d */
    public final void mo123515d(String str) {
        C89219l.m154721d(str, "");
        if (!C89219l.m154714a((Object) str, (Object) mo123508a())) {
            this.f179410f = null;
            this.f179409e = str;
            this.f179411g = null;
            C80064f.m138817b(str);
        }
    }

    /* renamed from: a */
    public final void mo123509a(String str) {
        if (str != null) {
            this.f179412h = str;
            C80064f.f179418d.mo123519c(str);
        }
    }

    /* renamed from: b */
    public final void mo123512b(String str) {
        if (!TextUtils.equals(mo123510b().getUniqueId(), str)) {
            mo123510b().setUniqueId(str);
            this.f179405a = true;
            C80064f.m138814a(mo123510b());
        }
    }

    /* renamed from: b */
    public final void mo123511b(User user) {
        if (m138800a(user)) {
            User b = mo123510b();
            this.f179406b = false;
            this.f179407c = -1;
            this.f179405a = true;
            if (user == null) {
                C89219l.m154715b();
            }
            mo123509a(user.getUid());
            String secUid = user.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            C80064f.m138819d(secUid);
            C43200dr.m86152a(4, b, user);
            this.f179410f = user;
            C80064f.m138814a(user);
            String uid = user.getUid();
            C89219l.m154716b(uid, "");
            mo123515d(uid);
            mo123513c();
            C80064f.f179418d.mo123521e();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C89219l.m154721d(message, "");
        if (!(message.obj instanceof Exception)) {
            int i = message.what;
            if (i != 112) {
                if (i == 113) {
                    C43200dr.m86152a(11, null, null);
                }
            } else if (message.obj != null && (message.obj instanceof User)) {
                if (!C47006hc.f109532a) {
                    Object obj = message.obj;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                    mo123511b((User) obj);
                    return;
                }
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                C40780g.m82246c().execute(new RunnableC80063b(this, (User) obj2));
            }
        }
    }
}
