package com.p2082ss.android.ugc.aweme.notification.redpoint;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.common.wschannel.p921e.C13747d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61550b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61556h;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61558j;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61551c;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61554f;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService;
import com.p2082ss.android.ugc.aweme.notice.api.p3508a.AbstractC61534a;
import com.p2082ss.android.ugc.aweme.notice.api.p3508a.C61535b;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61538b;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61540c;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61566a;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.C61569d;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61587i;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61595q;
import com.p2082ss.android.ugc.aweme.notice.repo.api.NotificationApi;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61799b;
import com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a.C61964b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.notification.redpoint.h */
public class C62232h implements WeakHandler.IHandler, AbstractC61534a, OldRedPointService, RedPointService {

    /* renamed from: d */
    private static long f141248d = System.currentTimeMillis();

    /* renamed from: j */
    private static volatile C62232h f141249j;

    /* renamed from: a */
    public boolean f141250a;

    /* renamed from: b */
    public SparseArray<AbstractC62217b> f141251b = new SparseArray<>();

    /* renamed from: c */
    public HashMap<Integer, Integer> f141252c;

    /* renamed from: e */
    private SparseArray<Integer> f141253e = new SparseArray<>();

    /* renamed from: f */
    private HashMap<Integer, Integer> f141254f;

    /* renamed from: g */
    private SharedPreferences f141255g;

    /* renamed from: h */
    private Handler f141256h = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: i */
    private boolean f141257i = false;

    static {
        Covode.recordClassIndex(72999);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99310a() {
        this.f141253e.clear();
        if (!this.f141250a) {
            SharedPreferences.Editor edit = this.f141255g.edit();
            edit.clear();
            C13611a.m24460a(edit);
        }
        C61964b.m112089a("RedPointManager", "clearNoticeCountMessage with all type");
    }

    /* renamed from: b */
    public static C62232h m112535b() {
        MethodCollector.m26663i(713);
        if (f141249j == null) {
            synchronized (C62232h.class) {
                try {
                    if (f141249j == null) {
                        f141249j = new C62232h();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(713);
                    throw th;
                }
            }
        }
        C62232h hVar = f141249j;
        MethodCollector.m26664o(713);
        return hVar;
    }

    private C62232h() {
        if (C13747d.m24781a(C17867d.m33078a())) {
            this.f141250a = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
        }
        Context a = C17867d.m33078a();
        C61587i iVar = C61587i.f139756b;
        iVar.f139757a.add(new C61535b());
        C61595q.f139777f.mo99331a(EnumC61554f.NOTICE, this);
        if (!this.f141250a) {
            this.f141255g = C34822d.m71158a(a, "red-point-cache", 0);
            m112538c();
        }
    }

    /* renamed from: c */
    private void m112538c() {
        for (Map.Entry<String, ?> entry : this.f141255g.getAll().entrySet()) {
            try {
                String key = entry.getKey();
                int intValue = ((Integer) entry.getValue()).intValue();
                if (key.startsWith("unread_")) {
                    this.f141253e.append(Integer.valueOf(key.substring(7)).intValue(), Integer.valueOf(intValue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99314a(boolean z) {
        this.f141257i = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo100236c(int i) {
        m112539d(i);
        return null;
    }

    /* renamed from: f */
    private static String m112541f(int i) {
        return "unread_".concat(String.valueOf(i));
    }

    /* renamed from: e */
    private boolean m112540e(int i) {
        if (i == 11) {
            if (mo99309a(i) <= 0 || mo99309a(998) <= 0) {
                return false;
            }
            return true;
        } else if (mo99309a(i) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: b */
    public final int mo99316b(int i) {
        if (this.f141253e.get(i) == null) {
            return 0;
        }
        return this.f141253e.get(i).intValue();
    }

    /* renamed from: d */
    private void m112539d(final int i) {
        if (C61538b.m111451b()) {
            C62211a.m112512a(i);
            return;
        }
        C34608n.m70658a().mo61083a(this.f141256h, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.notification.redpoint.C62232h.CallableC622331 */

            static {
                Covode.recordClassIndex(73000);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NotificationApi.m111631a(i);
            }
        }, 0);
        C61964b.m112089a("RedPointManager", "queryUnreadNotifyCount, source: ".concat(String.valueOf(i)));
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final int mo99309a(int i) {
        List<Integer> a = C62221f.m112520a(i, null);
        if (a.isEmpty()) {
            return mo99316b(i) + 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < a.size(); i3++) {
            i2 += mo99316b(a.get(i3).intValue());
        }
        return i2;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99313a(Message message) {
        if (C61538b.m111451b()) {
            C62211a.f141224b.mo100225a((NoticeList) message.obj);
            return;
        }
        handleMsg(message);
        C61964b.m112089a("RedPointManager", "initNoticeCountFromCombine sync");
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3508a.AbstractC61534a
    /* renamed from: a */
    public final void mo59576a(C61550b bVar) {
        boolean z;
        if (C61540c.m111452a() == C61540c.f139685a || C61540c.m111452a() == C61540c.f139686b || C61540c.m111452a() == C61540c.f139687c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C39109f.m79404c("RedPointManager", "onMessage ignored by reversing ws");
        } else if (bVar instanceof C61556h) {
            C61556h hVar = (C61556h) bVar;
            C61964b.m112089a("RedPointManager", "notice type " + hVar.f139718a + " count " + hVar.f139719b);
            if ((hVar.f139718a != 40 && hVar.f139718a != 41) || C61799b.f140285a.getShowRedDotType() != 3) {
                m112536b(hVar.f139718a, hVar.f139719b);
                this.f141253e.put(hVar.f139718a, Integer.valueOf(hVar.f139719b));
                if (!this.f141250a) {
                    SharedPreferences.Editor edit = this.f141255g.edit();
                    edit.putInt(m112541f(hVar.f139718a), hVar.f139719b);
                    C13611a.m24460a(edit);
                }
                C61964b.m112089a("RedPointManager", "setNoticeCountMessage with message group: " + hVar.f139718a + "count:" + hVar.f139719b);
                mo99315a(false, 2);
                if (hVar.f139718a == 100) {
                    ((AbstractC61566a) ServiceManager.get().getService(AbstractC61566a.class)).mo60984b();
                }
                int i = hVar.f139718a;
                AbstractC62217b bVar2 = this.f141251b.get(2);
                if (bVar2 != null) {
                    bVar2.mo100053a(hVar);
                }
                if (!C62230g.m112533b(i) && m112540e(i)) {
                    AbstractC81915c.m141874a(new C61561m(i, mo99309a(i)));
                }
                if (C61799b.f140285a.isEnableMultiAccountLogin() && C31575b.m65865g().allUidList().size() > 1) {
                    C62218c.m112516a().mo100229a(C31575b.m65865g().allUidList(), "ws_message_triggered");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d0, code lost:
        if (r2 != null) goto L_0x0069;
     */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r12) {
        /*
        // Method dump skipped, instructions count: 593
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.redpoint.C62232h.handleMsg(android.os.Message):void");
    }

    /* renamed from: b */
    private void m112536b(int i, int i2) {
        if (i == 11) {
            int a = i2 - mo99309a(11);
            if (!this.f141257i && a > 0) {
                this.f141253e.put(998, Integer.valueOf(a));
                this.f141253e.put(997, Integer.valueOf(a));
                if (!this.f141250a) {
                    SharedPreferences.Editor edit = this.f141255g.edit();
                    edit.putInt(m112541f(998), a);
                    edit.putInt(m112541f(997), a);
                    C13611a.m24460a(edit);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99311a(int i, int i2) {
        m112536b(i, i2);
        this.f141253e.put(i, Integer.valueOf(i2));
        if (!this.f141250a) {
            SharedPreferences.Editor edit = this.f141255g.edit();
            edit.putInt(m112541f(i), i2);
            C13611a.m24460a(edit);
        }
    }

    /* renamed from: b */
    private void m112537b(int i, EnumC61551c cVar) {
        C61558j e;
        if (cVar == null || (e = C62221f.m112529e(i)) == null || cVar == e.f139729a) {
            this.f141253e.remove(i);
            if (!this.f141250a) {
                SharedPreferences.Editor edit = this.f141255g.edit();
                edit.putInt(m112541f(i), 0);
                C13611a.m24460a(edit);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99312a(int i, EnumC61551c cVar) {
        List<Integer> a = C62221f.m112520a(i, null);
        if (!a.isEmpty()) {
            for (int i2 = 0; i2 < a.size(); i2++) {
                m112537b(a.get(i2).intValue(), cVar);
            }
        }
        m112537b(i, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99315a(boolean z, int i) {
        if (C31575b.m65865g().isLogin() && !TextUtils.isEmpty(C31575b.m65865g().getCurUserId()) && !C80580in.m139687c()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z || currentTimeMillis >= f141248d + 300000) {
                if (i == 2 || ((AbstractC61566a) C61569d.C61570a.m111506a(AbstractC61566a.class)).mo60983a() > 0) {
                    C1731i.m5631a((long) ((AbstractC61566a) C61569d.C61570a.m111506a(AbstractC61566a.class)).mo60983a()).mo5532a(new C62236i(this, i));
                } else {
                    m112539d(i);
                }
                f141248d = currentTimeMillis;
            }
        }
    }
}
