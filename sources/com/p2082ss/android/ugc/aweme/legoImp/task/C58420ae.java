package com.p2082ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.legoapi.C29954b;
import com.p2082ss.android.legoapi.abtest.C29953a;
import com.p2082ss.android.legoapi.freso.C29955a;
import com.p2082ss.android.legoimpl.BusinessToolsTask;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.InitFoundationTask;
import com.p2082ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitAdServiceTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.uitask.UIInitTask;
import com.p2082ss.android.ugc.aweme.legoImpl.task.InitFireBase;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ae */
public final class C58420ae {

    /* renamed from: a */
    private static AbstractC58264w f133010a;

    /* renamed from: b */
    private static AbstractC58264w f133011b;

    /* renamed from: c */
    private static AbstractC58264w f133012c;

    /* renamed from: d */
    private static AbstractC58264w f133013d;

    /* renamed from: e */
    private static AbstractC58264w f133014e;

    /* renamed from: f */
    private static AbstractC58264w f133015f;

    /* renamed from: g */
    private static AbstractC58264w f133016g;

    /* renamed from: h */
    private static AbstractC58264w f133017h;

    /* renamed from: i */
    private static AbstractC58264w f133018i;

    /* renamed from: j */
    private static AbstractC58264w f133019j;

    /* renamed from: k */
    private static AbstractC58264w f133020k;

    /* renamed from: l */
    private static AbstractC58264w f133021l;

    /* renamed from: m */
    private static AbstractC58264w f133022m;

    /* renamed from: n */
    private static AbstractC58264w f133023n;

    /* renamed from: o */
    private static AbstractC58264w f133024o;

    /* renamed from: p */
    private static AbstractC58264w f133025p;

    /* renamed from: q */
    private static AbstractC58264w f133026q;

    /* renamed from: r */
    private static AbstractC58264w f133027r;

    /* renamed from: s */
    private static AbstractC58264w f133028s;

    /* renamed from: t */
    private static AbstractC58264w f133029t;

    static {
        Covode.recordClassIndex(68661);
    }

    /* renamed from: a */
    public static AbstractC58264w m106833a() {
        if (f133023n == null) {
            f133023n = new PlayerKitInitTask();
        }
        return f133023n;
    }

    /* renamed from: b */
    public static AbstractC58264w m106834b() {
        if (f133013d == null) {
            f133013d = new InitModules();
        }
        return f133013d;
    }

    /* renamed from: c */
    public static AbstractC58264w m106835c() {
        if (f133011b == null) {
            f133011b = C29955a.f71449a.mo52302a();
        }
        return f133011b;
    }

    /* renamed from: d */
    public static AbstractC58264w m106836d() {
        if (f133010a == null) {
            f133010a = C29953a.f71445a.mo52299b();
        }
        return f133010a;
    }

    /* renamed from: e */
    public static AbstractC58264w m106837e() {
        if (f133016g == null) {
            f133016g = new InitPushTask();
        }
        return f133016g;
    }

    /* renamed from: f */
    public static AbstractC58264w m106838f() {
        if (f133012c == null) {
            f133012c = new InitFireBase();
        }
        return f133012c;
    }

    /* renamed from: i */
    public static AbstractC58264w m106841i() {
        if (f133017h == null) {
            f133017h = new PowerPageTask();
        }
        return f133017h;
    }

    /* renamed from: k */
    public static AbstractC58264w m106843k() {
        if (f133019j == null) {
            f133019j = new InitFoundationTask();
        }
        return f133019j;
    }

    /* renamed from: l */
    public static AbstractC58264w m106844l() {
        if (f133020k == null) {
            f133020k = new UIInitTask();
        }
        return f133020k;
    }

    /* renamed from: m */
    public static AbstractC58264w m106845m() {
        if (f133021l == null) {
            f133021l = new InitAVModule();
        }
        return f133021l;
    }

    /* renamed from: n */
    public static AbstractC58264w m106846n() {
        if (f133022m == null) {
            f133022m = C29954b.f71447a.mo52292a();
        }
        return f133022m;
    }

    /* renamed from: o */
    public static AbstractC58264w m106847o() {
        if (f133024o == null) {
            f133024o = new InitAdServiceTask();
        }
        return f133024o;
    }

    /* renamed from: p */
    public static AbstractC58264w m106848p() {
        if (f133025p == null) {
            f133025p = new InitAppsFlyer();
        }
        return f133025p;
    }

    /* renamed from: q */
    public static AbstractC58264w m106849q() {
        if (f133026q == null) {
            f133026q = C29953a.f71445a.mo52298a();
        }
        return f133026q;
    }

    /* renamed from: r */
    public static AbstractC58264w m106850r() {
        if (f133027r == null) {
            f133027r = new AssemInitTask();
        }
        return f133027r;
    }

    /* renamed from: s */
    public static AbstractC58264w m106851s() {
        if (f133028s == null) {
            f133028s = new SplitCompatInstall();
        }
        return f133028s;
    }

    /* renamed from: t */
    public static AbstractC58264w m106852t() {
        if (f133029t == null) {
            f133029t = new ColdBootPreloadPlayerSoTask();
        }
        return f133029t;
    }

    /* renamed from: g */
    public static AbstractC58264w m106839g() {
        if (f133014e == null) {
            f133014e = new BusinessToolsTask(C17879g.m33104a());
        }
        return f133014e;
    }

    /* renamed from: h */
    public static AbstractC58264w m106840h() {
        if (f133015f == null) {
            f133015f = (AbstractC58264w) C29902a.m60273a().getCancelNotiTask();
        }
        return f133015f;
    }

    /* renamed from: j */
    public static AbstractC58264w m106842j() {
        if (f133018i == null) {
            f133018i = InitAllServiceImpl.m68762q().mo59719j();
        }
        return f133018i;
    }
}
