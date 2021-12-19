package com.bytedance.android.livesdk.rank.impl.p611d;

import com.bytedance.android.live.core.p218f.C3957r;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.livesetting.rank.LiveHourlyRankLengthSetting;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.rank.api.model.C10354h;
import com.bytedance.android.livesdk.rank.impl.api.model.C10368e;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11207aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.rank.impl.d.b */
public class C10387b {

    /* renamed from: g */
    private static C10387b f25070g;

    /* renamed from: a */
    public C10368e f25071a;

    /* renamed from: b */
    public C10368e f25072b;

    /* renamed from: c */
    public C10368e f25073c;

    /* renamed from: d */
    public List<C10354h> f25074d;

    /* renamed from: e */
    public C10368e f25075e;

    /* renamed from: f */
    public long f25076f;

    static {
        Covode.recordClassIndex(11961);
    }

    private C10387b() {
    }

    /* renamed from: a */
    public static C10387b m18895a() {
        MethodCollector.m26663i(740);
        if (f25070g == null) {
            synchronized (C10387b.class) {
                try {
                    if (f25070g == null) {
                        f25070g = new C10387b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(740);
                    throw th;
                }
            }
        }
        C10387b bVar = f25070g;
        MethodCollector.m26664o(740);
        return bVar;
    }

    /* renamed from: a */
    public final boolean mo17279a(int i) {
        if (C3957r.m9644a(this.f25074d)) {
            return false;
        }
        long c = C11115u.m19743a().mo17915b().mo13161c();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < this.f25074d.size() && this.f25074d.get(i2).f25015a.getId() == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m18896a(int i, String str) {
        int value = LiveHourlyRankLengthSetting.INSTANCE.getValue();
        if (i == 1) {
            return C3966y.m9660a((int) R.string.drj, str);
        } else if (i >= 2 && i <= 3) {
            return C3966y.m9660a((int) R.string.emb, str);
        } else if (i >= 4 && i <= 10) {
            return C3966y.m9660a((int) R.string.e5a, str);
        } else if (i >= 11 && i <= value) {
            return C3966y.m9660a((int) R.string.e5c, str, Integer.valueOf(i - 1));
        } else if (i <= value) {
            return str;
        } else {
            return C3966y.m9660a((int) R.string.e59, str);
        }
    }

    /* renamed from: a */
    public final String mo17276a(long j, long j2) {
        String upperCase = C11207aa.m19863a(j2).toUpperCase(Locale.ENGLISH);
        C10368e eVar = this.f25075e;
        if (eVar == null || eVar.f25054b == null || j2 < ((long) this.f25075e.f25054b.f25059a)) {
            return upperCase;
        }
        if (this.f25075e.f25055c != null) {
            if (this.f25075e.f25055c.f25045a && (j == 0 || j == C11115u.m19743a().mo17915b().mo13161c())) {
                return upperCase;
            }
            if (this.f25075e.f25055c.f25046b && this.f25076f >= ((long) this.f25075e.f25054b.f25059a)) {
                return upperCase;
            }
        }
        return this.f25075e.f25054b.f25060b;
    }

    /* renamed from: a */
    public final String mo17278a(long j, long j2, String str) {
        C10368e eVar = this.f25072b;
        if (eVar == null || eVar.f25054b == null || j2 < ((long) this.f25072b.f25054b.f25059a)) {
            return str;
        }
        if (this.f25072b.f25055c == null || ((!this.f25072b.f25055c.f25045a || (j != 0 && j != C11115u.m19743a().mo17915b().mo13161c())) && !mo17279a(this.f25072b.f25055c.f25047c))) {
            return this.f25072b.f25054b.f25060b;
        }
        return str;
    }

    /* renamed from: a */
    public final String mo17277a(long j, long j2, int i, C9698b bVar) {
        String obj = C7557c.m15538a(bVar, "").toString();
        C10368e eVar = this.f25073c;
        if (eVar == null || eVar.f25054b == null || j2 < ((long) this.f25073c.f25054b.f25059a)) {
            return obj;
        }
        if (this.f25073c.f25055c == null || ((!this.f25073c.f25055c.f25045a || (j != 0 && j != C11115u.m19743a().mo17915b().mo13161c())) && !mo17279a(this.f25073c.f25055c.f25047c))) {
            return m18896a(i, this.f25073c.f25054b.f25060b);
        }
        return obj;
    }
}
