package com.p2082ss.android.ugc.aweme.challenge.data;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.data.d */
public class C35511d implements IAccountService.AbstractC31272b {

    /* renamed from: c */
    private static String f83741c = "FAKE_USER";

    /* renamed from: d */
    private static C35511d f83742d;

    /* renamed from: a */
    public int f83743a = 20;

    /* renamed from: b */
    public List<C35505a> f83744b;

    /* renamed from: e */
    private int f83745e = 10;

    /* renamed from: f */
    private C27910f f83746f = new C27910f();

    /* renamed from: g */
    private IAccountService f83747g;

    /* renamed from: h */
    private List<Pair<String, List<C35505a>>> f83748h;

    static {
        Covode.recordClassIndex(42705);
    }

    /* renamed from: b */
    public final void mo62412b() {
        try {
            m72606a(this.f83746f.mo46675b(this.f83748h, new C27895a<List<Pair<String, List<C35505a>>>>() {
                /* class com.p2082ss.android.ugc.aweme.challenge.data.C35511d.C355121 */

                static {
                    Covode.recordClassIndex(42706);
                }
            }.type));
        } catch (Exception unused) {
        }
    }

    C35511d() {
        IAccountService a = AccountService.m65215a();
        this.f83747g = a;
        a.mo57064a(this);
        this.f83748h = m72608d();
        m72607c();
    }

    /* renamed from: a */
    public static C35511d m72605a() {
        MethodCollector.m26663i(7743);
        if (f83742d == null) {
            synchronized (C35511d.class) {
                try {
                    if (f83742d == null) {
                        f83742d = new C35511d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7743);
                    throw th;
                }
            }
        }
        C35511d dVar = f83742d;
        MethodCollector.m26664o(7743);
        return dVar;
    }

    /* renamed from: d */
    private List<Pair<String, List<C35505a>>> m72608d() {
        try {
            this.f83748h = (List) this.f83746f.mo46671a(C34597d.m70637d().mo61051a("hash_tag_history", ""), new C27895a<List<Pair<String, List<C35505a>>>>() {
                /* class com.p2082ss.android.ugc.aweme.challenge.data.C35511d.C355132 */

                static {
                    Covode.recordClassIndex(42707);
                }
            }.type);
        } catch (Exception unused) {
        }
        if (this.f83748h == null) {
            this.f83748h = new ArrayList();
        }
        return this.f83748h;
    }

    /* renamed from: c */
    private void m72607c() {
        String str;
        IAccountUserService e = this.f83747g.mo57069e();
        if (e.isLogin()) {
            str = e.getCurUserId();
        } else {
            str = f83741c;
        }
        Iterator<Pair<String, List<C35505a>>> it = this.f83748h.iterator();
        this.f83744b = new ArrayList();
        while (it.hasNext()) {
            Pair<String, List<C35505a>> next = it.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, str) && next.second != null && ((List) next.second).size() > 0) {
                this.f83744b.addAll((Collection) next.second);
                it.remove();
            }
        }
        this.f83748h.add(0, new Pair<>(str, this.f83744b));
        if (this.f83745e > 0 && this.f83748h.size() > this.f83745e) {
            List<Pair<String, List<C35505a>>> list = this.f83748h;
            list.remove(list.size() - 1);
        }
        mo62412b();
    }

    /* renamed from: a */
    private static void m72606a(String str) {
        C34597d.m70637d().mo61057b("hash_tag_history", str);
    }

    /* renamed from: a */
    public final void mo62411a(List<C35514e> list) {
        String str;
        if (list != null && list.size() > 0) {
            for (C35514e eVar : list) {
                List<C35505a> list2 = this.f83744b;
                if (eVar == null) {
                    str = "";
                } else {
                    str = eVar.f83751a;
                }
                list2.add(new C35505a(str, true));
            }
            mo62412b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 2) {
            if (i == 1 || i == 3) {
                Iterator<Pair<String, List<C35505a>>> it = this.f83748h.iterator();
                while (it.hasNext()) {
                    Pair<String, List<C35505a>> next = it.next();
                    if (next != null && TextUtils.equals((CharSequence) next.first, f83741c)) {
                        it.remove();
                    }
                }
                mo62412b();
            } else {
                return;
            }
        }
        this.f83748h.clear();
        this.f83748h = m72608d();
        m72607c();
    }
}
