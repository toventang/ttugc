package com.p2082ss.android.ugc.aweme.profile.edit;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52913d;
import com.p2082ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63784m;
import com.p2082ss.android.ugc.aweme.profile.settings.C63879e;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.C89982e;
import net.openid.appauth.C89990h;
import net.openid.appauth.C89993i;
import net.openid.appauth.C90008o;
import net.openid.appauth.C90011r;
import net.openid.appauth.C90013s;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask */
public final class YoutubeRefreshTask implements WeakHandler.IHandler, AbstractC52909a, AbstractC58264w {

    /* renamed from: b */
    static final boolean f144147b = false;

    /* renamed from: c */
    public static final C63512a f144148c = new C63512a((byte) 0);

    /* renamed from: a */
    Context f144149a;

    /* renamed from: d */
    private Handler f144150d;

    /* renamed from: e */
    private int f144151e;

    /* renamed from: f */
    private final AbstractC89244h f144152f = C89250i.m154773a((AbstractC89171a) C63515c.f144158a);

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask$c */
    static final class C63515c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C63515c f144158a = new C63515c();

        static {
            Covode.recordClassIndex(74826);
        }

        C63515c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "1096011445005-qqsj3hcu9s53dv6pbdrl6vs8ls649v01.apps.googleusercontent.com";
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo102156c() {
        return (String) this.f144152f.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
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

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask$a */
    static final class C63512a {
        static {
            Covode.recordClassIndex(74823);
        }

        private C63512a() {
        }

        public /* synthetic */ C63512a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask$d */
    public static final class RunnableC63516d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ YoutubeRefreshTask f144159a;

        /* renamed from: b */
        final /* synthetic */ User f144160b;

        static {
            Covode.recordClassIndex(74827);
        }

        RunnableC63516d(YoutubeRefreshTask youtubeRefreshTask, User user) {
            this.f144159a = youtubeRefreshTask;
            this.f144160b = user;
        }

        public final void run() {
            YoutubeRefreshTask youtubeRefreshTask = this.f144159a;
            User user = this.f144160b;
            C89219l.m154716b(user, "");
            youtubeRefreshTask.mo102155a(user);
        }
    }

    /* renamed from: d */
    static void m115087d() {
        if (YoutubeApi.m115113a()) {
            C31575b.m65865g().queryUser();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(74822);
    }

    /* renamed from: e */
    private static boolean m115088e() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Integer thirdPartyDataRefresh = iESSettingsProxy.getThirdPartyDataRefresh();
            if (thirdPartyDataRefresh == null) {
                return false;
            }
            if (thirdPartyDataRefresh.intValue() == 1) {
                return true;
            }
            return false;
        } catch (C16041a unused) {
            return false;
        }
    }

    /* renamed from: l */
    private final void m115089l() {
        if (this.f144150d == null) {
            HandlerThread handlerThread = new HandlerThread("youtube-refresh-timer");
            handlerThread.start();
            this.f144150d = new WeakHandler(handlerThread.getLooper(), this);
        }
        Handler handler = this.f144150d;
        if (handler == null) {
            C89219l.m154715b();
        }
        if (handler.hasMessages(1)) {
            Handler handler2 = this.f144150d;
            if (handler2 == null) {
                C89219l.m154715b();
            }
            handler2.removeMessages(1);
        }
        Handler handler3 = this.f144150d;
        if (handler3 == null) {
            C89219l.m154715b();
        }
        handler3.sendEmptyMessage(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a
    /* renamed from: a */
    public final void mo61665a(IESSettingsProxy iESSettingsProxy) {
        C89219l.m154721d(iESSettingsProxy, "");
        Handler handler = this.f144150d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Context context = this.f144149a;
        if (context == null) {
            C89219l.m154710a("context");
        }
        mo28600a(context);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            Handler handler = this.f144150d;
            if (handler != null) {
                handler.removeMessages(1);
            }
            int i = this.f144151e + 1;
            this.f144151e = i;
            if (i > 3) {
                SettingsManagerProxy.inst().removeSettingsWatcher(this);
                Handler handler2 = this.f144150d;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            }
            Handler handler3 = this.f144150d;
            if (handler3 != null) {
                handler3.sendEmptyMessageDelayed(1, 1000);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        this.f144149a = context;
        C52913d a = C52913d.m97751a();
        C89219l.m154716b(a, "");
        if (!a.mo88581b()) {
            SettingsManagerProxy.inst().registerSettingsWatcher(this, true);
            m115089l();
        } else if (m115088e()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            if (f144147b) {
                C89219l.m154716b(curUser, "");
                curUser.getYouTubeRefreshToken();
                curUser.getYoutubeRawRefreshToken();
                new Date(curUser.getYouTubeLastRefreshTime() * 1000);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            C89219l.m154716b(curUser, "");
            long youTubeLastRefreshTime = curUser.getYouTubeLastRefreshTime();
            if (youTubeLastRefreshTime > 0 && currentTimeMillis - youTubeLastRefreshTime > TimeUnit.DAYS.toSeconds(30)) {
                if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                    C80214ai.m139042a(new RunnableC63516d(this, curUser), "YoutubeRefreshTask");
                } else {
                    mo102155a(curUser);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo102155a(User user) {
        String a;
        String youtubeRawRefreshToken;
        String youTubeRefreshToken = user.getYouTubeRefreshToken();
        if ((youTubeRefreshToken != null && youTubeRefreshToken.length() != 0) || ((youtubeRawRefreshToken = user.getYoutubeRawRefreshToken()) != null && youtubeRawRefreshToken.length() != 0)) {
            if (!TextUtils.isEmpty(user.getYoutubeRawRefreshToken())) {
                a = user.getYoutubeRawRefreshToken();
            } else {
                String a2 = C63879e.m115575a();
                String youTubeRefreshToken2 = user.getYouTubeRefreshToken();
                C89219l.m154716b(youTubeRefreshToken2, "");
                a = C63784m.m115344a(youTubeRefreshToken2, a2, "AES/CBC/PKCS7Padding", a2);
            }
            if (TextUtils.isEmpty(a)) {
                m115085a(this, false, null, new Exception("Failed to decrypt refresh token, cannot continue"), null, null, 26);
                return;
            }
            C90011r a3 = new C90011r.C90012a(new C89993i(Uri.parse("https://accounts.google.com/o/oauth2/v2/auth"), Uri.parse("https://www.googleapis.com/oauth2/v4/token")), mo102156c()).mo144671a("refresh_token").mo144674b("https://www.googleapis.com/auth/youtube.readonly").mo144676d(a).mo144673a();
            C89219l.m154716b(a3, "");
            Context context = this.f144149a;
            if (context == null) {
                C89219l.m154710a("context");
            }
            new C89990h(context).mo144660a(a3, C90008o.f204026a, new C63513b(this, a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask$b */
    public static final class C63513b implements C89990h.AbstractC89992b {

        /* renamed from: a */
        final /* synthetic */ YoutubeRefreshTask f144153a;

        /* renamed from: b */
        final /* synthetic */ String f144154b;

        static {
            Covode.recordClassIndex(74824);
        }

        C63513b(YoutubeRefreshTask youtubeRefreshTask, String str) {
            this.f144153a = youtubeRefreshTask;
            this.f144154b = str;
        }

        @Override // net.openid.appauth.C89990h.AbstractC89992b
        /* renamed from: a */
        public final void mo36766a(final C90013s sVar, final C89982e eVar) {
            C80214ai.m139042a(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask.C63513b.RunnableC635141 */

                /* renamed from: a */
                final /* synthetic */ C63513b f144155a;

                static {
                    Covode.recordClassIndex(74825);
                }

                {
                    this.f144155a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:11:0x0069  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 377
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask.C63513b.RunnableC635141.run():void");
                }
            }, "YoutubeRefreshTask");
        }
    }

    /* renamed from: a */
    private final void m115086a(boolean z, Boolean bool, Exception exc, Integer num, YoutubeApi.C63518a aVar) {
        Integer num2;
        Context context = this.f144149a;
        if (context == null) {
            C89219l.m154710a("context");
        }
        String a = YoutubeApi.m115112a(context, exc, num, aVar);
        C33744d a2 = new C33744d().mo59983a("platform", "youtube").mo59982a("is_success", Boolean.valueOf(z)).mo59980a("auto_unlink", C89219l.m154714a(bool, true) ? 1 : 0);
        if (aVar != null) {
            num2 = aVar.f144167a;
        } else {
            num2 = null;
        }
        C39162r.m79460a("social_profile_check", a2.mo59983a("error_code", String.valueOf(num2)).mo59983a("error_desc", a).f79943a);
    }

    /* renamed from: a */
    static /* synthetic */ void m115085a(YoutubeRefreshTask youtubeRefreshTask, boolean z, Boolean bool, Exception exc, Integer num, YoutubeApi.C63518a aVar, int i) {
        Boolean bool2 = bool;
        Exception exc2 = exc;
        Integer num2 = num;
        YoutubeApi.C63518a aVar2 = null;
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if ((i & 4) != 0) {
            exc2 = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) == 0) {
            aVar2 = aVar;
        }
        youtubeRefreshTask.m115086a(z, bool2, exc2, num2, aVar2);
    }
}
