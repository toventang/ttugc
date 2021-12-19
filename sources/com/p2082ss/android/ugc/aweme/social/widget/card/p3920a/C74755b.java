package com.p2082ss.android.ugc.aweme.social.widget.card.p3920a;

import com.bytedance.common.utility.collection.C13606e;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74783e;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.b */
public class C74755b {

    /* renamed from: e */
    public static final C74755b f168027e = new C74755b();

    /* renamed from: f */
    public static final C74756a f168028f = new C74756a((byte) 0);

    /* renamed from: a */
    public final C74757c f168029a = ((C74757c) C74758d.f168038b.getValue());

    /* renamed from: b */
    public String f168030b = "";

    /* renamed from: c */
    public final Set<C13606e<Object>> f168031c = new LinkedHashSet();

    /* renamed from: d */
    public final Map<EnumC74761f, Boolean> f168032d = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.b$a */
    public static final class C74756a {
        static {
            Covode.recordClassIndex(87601);
        }

        private C74756a() {
        }

        public /* synthetic */ C74756a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C74755b m131266a(int i) {
            C74755b bVar;
            if (i == 5 || i == 7) {
                bVar = C74767j.f168066g;
            } else {
                bVar = C74755b.f168027e;
            }
            bVar.mo117809b();
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(87600);
    }

    /* renamed from: a */
    public final Keva mo117807a() {
        Keva repo = Keva.getRepo("social_permission_card_freq_" + this.f168030b);
        C89219l.m154716b(repo, "");
        return repo;
    }

    /* renamed from: b */
    public final void mo117809b() {
        boolean z;
        IAccountUserService g = C31575b.m65865g();
        String str = "";
        C89219l.m154716b(g, str);
        String curUserId = g.getCurUserId();
        if (curUserId != null) {
            str = curUserId;
        }
        if (!C89219l.m154714a((Object) str, (Object) this.f168030b)) {
            this.f168030b = str;
            EnumC74761f[] values = EnumC74761f.values();
            for (EnumC74761f fVar : values) {
                Map<EnumC74761f, Boolean> map = this.f168032d;
                if (C74783e.m131300b(fVar) || !mo117811c(fVar)) {
                    z = false;
                } else {
                    z = true;
                }
                map.put(fVar, Boolean.valueOf(z));
            }
            new StringBuilder().append(getClass().getSimpleName()).append(" current uid: ").append(str).append(',').append(" state: ").append(this.f168032d).append(". settings: ").append(this.f168029a);
        }
    }

    /* renamed from: a */
    public void mo117808a(EnumC74761f fVar) {
        C89219l.m154721d(fVar, "");
        mo117809b();
        Keva a = mo117807a();
        int i = 0;
        int i2 = a.getInt(m131260a("key_exp_count_", fVar), 0) + 1;
        if (i2 >= this.f168029a.f168033a) {
            a.storeLong(m131260a("key_auto_hide_ts_", fVar), System.currentTimeMillis());
        } else {
            i = i2;
        }
        a.storeInt(m131260a("key_exp_count_", fVar), i);
    }

    /* renamed from: b */
    public final void mo117810b(EnumC74761f fVar) {
        C89219l.m154721d(fVar, "");
        mo117809b();
        Keva a = mo117807a();
        int i = a.getInt(m131260a("key_delete_count_", fVar), 0) + 1;
        a.storeInt(m131260a("key_delete_count_", fVar), i);
        a.storeInt(m131260a("key_exp_count_", fVar), 0);
        a.storeLong(m131260a("key_auto_hide_ts_", fVar), -1);
        if (i >= this.f168029a.f168036d) {
            a.storeLong(m131260a("key_delete_hide_ts_", fVar), -1);
        } else {
            a.storeLong(m131260a("key_delete_hide_ts_", fVar), System.currentTimeMillis());
        }
        this.f168032d.put(fVar, false);
    }

    /* renamed from: c */
    public final boolean mo117811c(EnumC74761f fVar) {
        boolean z;
        if (mo117807a().getInt(m131260a("key_delete_count_", fVar), 0) >= this.f168029a.f168036d) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long valueOf = Long.valueOf(mo117807a().getLong(m131260a("key_delete_hide_ts_", fVar), -1));
        long longValue = valueOf.longValue();
        if (longValue == -1 || m131259a(currentTimeMillis, longValue) >= ((long) this.f168029a.f168035c)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || valueOf == null) {
            Long valueOf2 = Long.valueOf(mo117807a().getLong(m131260a("key_auto_hide_ts_", fVar), -1));
            long longValue2 = valueOf2.longValue();
            if (longValue2 == -1 || m131259a(currentTimeMillis, longValue2) >= ((long) this.f168029a.f168034b) || valueOf2 == null) {
                return true;
            }
            m131259a(currentTimeMillis, valueOf2.longValue());
            return false;
        }
        m131259a(currentTimeMillis, valueOf.longValue());
        return false;
    }

    /* renamed from: a */
    private static long m131259a(long j, long j2) {
        return Math.abs((j - j2) / 86400000);
    }

    /* renamed from: a */
    public static String m131260a(String str, EnumC74761f fVar) {
        return str + fVar.name();
    }
}
