package com.p2082ss.android.ugc.aweme.notice;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl */
public final class DmNoticeProxyImpl implements DmNoticeProxy {

    /* renamed from: b */
    public static final C61523a f139657b = new C61523a((byte) 0);

    /* renamed from: a */
    public String f139658a = "";

    /* renamed from: d */
    private final AbstractC89244h f139659d = C89250i.m154773a((AbstractC89171a) C61525c.f139665a);

    /* renamed from: e */
    private final AbstractC89244h f139660e = C89250i.m154773a((AbstractC89171a) C61528f.f139668a);

    /* renamed from: f */
    private final AbstractC89244h f139661f = C89250i.m154773a((AbstractC89171a) C61524b.f139664a);

    /* renamed from: g */
    private boolean f139662g;

    /* renamed from: h */
    private final AbstractC89244h f139663h = C89250i.m154773a((AbstractC89171a) C61526d.f139666a);

    static {
        Covode.recordClassIndex(72189);
    }

    /* renamed from: f */
    private final Map<String, TuxAlertBadgeLayout> m111429f() {
        return (Map) this.f139659d.getValue();
    }

    /* renamed from: g */
    private final C61613b m111430g() {
        return (C61613b) this.f139660e.getValue();
    }

    /* renamed from: h */
    private final C61613b m111431h() {
        return (C61613b) this.f139661f.getValue();
    }

    /* renamed from: a */
    public final C61529a mo99176a() {
        return (C61529a) this.f139663h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl$a */
    public static final class C61523a {
        static {
            Covode.recordClassIndex(72190);
        }

        private C61523a() {
        }

        public /* synthetic */ C61523a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl$b */
    static final class C61524b extends AbstractC89220m implements AbstractC89171a<C61613b> {

        /* renamed from: a */
        public static final C61524b f139664a = new C61524b();

        static {
            Covode.recordClassIndex(72191);
        }

        C61524b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61613b invoke() {
            return new C61613b((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl$c */
    static final class C61525c extends AbstractC89220m implements AbstractC89171a<Map<String, TuxAlertBadgeLayout>> {

        /* renamed from: a */
        public static final C61525c f139665a = new C61525c();

        static {
            Covode.recordClassIndex(72192);
        }

        C61525c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, TuxAlertBadgeLayout> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl$d */
    static final class C61526d extends AbstractC89220m implements AbstractC89171a<C61529a> {

        /* renamed from: a */
        public static final C61526d f139666a = new C61526d();

        static {
            Covode.recordClassIndex(72193);
        }

        C61526d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61529a invoke() {
            return new C61529a((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl$f */
    static final class C61528f extends AbstractC89220m implements AbstractC89171a<C61613b> {

        /* renamed from: a */
        public static final C61528f f139668a = new C61528f();

        static {
            Covode.recordClassIndex(72195);
        }

        C61528f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61613b invoke() {
            return new C61613b((byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    /* renamed from: d */
    public final int mo99183d() {
        return m111430g().f139815b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl$e */
    public static final class RunnableC61527e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DmNoticeProxyImpl f139667a;

        static {
            Covode.recordClassIndex(72194);
        }

        RunnableC61527e(DmNoticeProxyImpl dmNoticeProxyImpl) {
            this.f139667a = dmNoticeProxyImpl;
        }

        public final void run() {
            this.f139667a.mo99176a().f139669a = true;
            DmNoticeProxyImpl dmNoticeProxyImpl = this.f139667a;
            dmNoticeProxyImpl.mo99180b(dmNoticeProxyImpl.f139658a);
        }
    }

    /* renamed from: i */
    private final void m111432i() {
        Iterator<T> it = m111429f().values().iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
    }

    /* renamed from: k */
    private final void m111434k() {
        this.f139662g = false;
        Iterator<T> it = m111429f().values().iterator();
        while (it.hasNext()) {
            it.next().mo37320b();
        }
    }

    /* renamed from: l */
    private static boolean m111435l() {
        return C61542b.m111469c(101, 11);
    }

    /* renamed from: e */
    public static DmNoticeProxy m111428e() {
        MethodCollector.m26663i(548);
        Object a = C81908b.m141854a(DmNoticeProxy.class, false);
        if (a != null) {
            DmNoticeProxy dmNoticeProxy = (DmNoticeProxy) a;
            MethodCollector.m26664o(548);
            return dmNoticeProxy;
        }
        if (C81908b.f183270cT == null) {
            synchronized (DmNoticeProxy.class) {
                try {
                    if (C81908b.f183270cT == null) {
                        C81908b.f183270cT = new DmNoticeProxyImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(548);
                    throw th;
                }
            }
        }
        DmNoticeProxyImpl dmNoticeProxyImpl = (DmNoticeProxyImpl) C81908b.f183270cT;
        MethodCollector.m26664o(548);
        return dmNoticeProxyImpl;
    }

    /* renamed from: j */
    private final void m111433j() {
        this.f139662g = true;
        for (T t : m111429f().values()) {
            t.setVariant(0);
            t.mo37319a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    /* renamed from: b */
    public final boolean mo99181b() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin() || C80580in.m139687c() || C61542b.m111467b().isChatFunOfflineUnder16() || !IMService.createIIMServicebyMonsterPlugin(false).isIMAvailable()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    /* renamed from: c */
    public final String mo99182c() {
        if (m111430g().f139814a) {
            return "dot";
        }
        if (m111430g().f139815b > 0) {
            return "number";
        }
        return "";
    }

    /* renamed from: m */
    private final void m111436m() {
        if (this.f139658a.length() != 0) {
            if (m111431h().f139814a != m111430g().f139814a || m111431h().f139815b != m111430g().f139815b) {
                m111431h().f139814a = m111430g().f139814a;
                m111431h().f139815b = m111430g().f139815b;
                m111425a(this.f139658a, mo99182c(), m111431h().f139815b);
            }
        }
    }

    /* renamed from: c */
    private final String m111427c(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (m111429f().isEmpty()) {
            return "";
        }
        return "notification_page";
    }

    /* renamed from: a */
    private final void m111424a(int i) {
        this.f139662g = false;
        for (T t : m111429f().values()) {
            t.setVariant(1);
            t.setMaxCount(2);
            t.mo37319a();
            t.setCount(i);
        }
        if (mo99176a().f139670b) {
            mo99176a().f139670b = false;
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC61527e(this), 3000);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    /* renamed from: b */
    public final void mo99180b(String str) {
        C89219l.m154721d(str, "");
        if (!m111429f().isEmpty()) {
            this.f139658a = m111427c(str);
            if (mo99181b()) {
                m111432i();
                return;
            }
            int a = C61542b.m111458a(99);
            if (a > 0) {
                if (mo99176a().f139669a) {
                    m111433j();
                } else {
                    m111424a(a);
                }
            } else if (C61542b.m111469c(101, 11)) {
                m111433j();
            } else {
                m111434k();
            }
            C51423a.m95792b("UnreadCount", "DmNotice needShowDot " + m111435l());
            C51423a.m95792b("UnreadCount", "DmNotice unread count ".concat(String.valueOf(a)));
            m111426a(this.f139662g, a);
            m111436m();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    /* renamed from: a */
    public final void mo99179a(String str) {
        C89219l.m154721d(str, "");
        m111429f().remove(str);
    }

    /* renamed from: a */
    private final void m111426a(boolean z, int i) {
        if (z || i < 0) {
            i = 0;
        }
        if (z != m111430g().f139814a || i != m111430g().f139815b) {
            m111430g().f139814a = z;
            m111430g().f139815b = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    /* renamed from: a */
    public final void mo99177a(TuxAlertBadgeLayout tuxAlertBadgeLayout, String str) {
        C89219l.m154721d(tuxAlertBadgeLayout, "");
        C89219l.m154721d(str, "");
        if (C56297a.m102301c()) {
            tuxAlertBadgeLayout.mo37320b();
            return;
        }
        m111429f().put(str, tuxAlertBadgeLayout);
        mo99180b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    /* renamed from: a */
    public final void mo99178a(C61561m mVar, String str) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        int i = mVar.f139735a;
        if (i == 11 || i == 99 || i == 101) {
            C51423a.m95787a("UnReadCountMonitor MusNewNotification receive IM " + mVar.f139735a + ": " + mVar.f139736b);
            C61542b.m111460a(mVar.f139735a, mVar.f139736b);
            mo99180b(str);
        }
    }

    /* renamed from: a */
    private static void m111425a(String str, String str2, int i) {
        C39162r.m79460a("chat_notice_show", new C33744d().mo59983a("enter_from", str).mo59983a("notice_type", str2).mo59980a("num", i).f79943a);
    }
}
