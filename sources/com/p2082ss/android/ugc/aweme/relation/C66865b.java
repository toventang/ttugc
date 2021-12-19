package com.p2082ss.android.ugc.aweme.relation;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51526g;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.b */
public final class C66865b {

    /* renamed from: a */
    public static final Keva f150137a;

    /* renamed from: b */
    public static final C66865b f150138b = new C66865b();

    /* renamed from: c */
    private static Boolean f150139c;

    /* renamed from: d */
    private static Boolean f150140d;

    private C66865b() {
    }

    /* renamed from: b */
    public static final int m118574b() {
        return f150137a.getInt("key_display_strategy", 0);
    }

    /* renamed from: e */
    public static final boolean m118577e() {
        if (m118574b() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static String m118581i() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return g.getCurUserId();
    }

    static {
        Covode.recordClassIndex(78440);
        Keva repo = Keva.getRepo("repo_new_version_journey");
        C89219l.m154716b(repo, "");
        f150137a = repo;
    }

    /* renamed from: a */
    public static void m118573a() {
        Keva keva = f150137a;
        keva.storeBoolean("key_new_version", false);
        keva.storeBoolean("key_cache_ready_" + m118581i(), true);
    }

    /* renamed from: f */
    public static final boolean m118578f() {
        return f150137a.getBoolean("key_rec_friends_has_shown_" + m118581i(), false);
    }

    /* renamed from: h */
    public static final boolean m118580h() {
        return C89219l.m154714a((Object) f150137a.getString("key_check_status", "value_check_start"), (Object) "value_check_hasdata");
    }

    /* renamed from: c */
    public static final boolean m118575c() {
        boolean z;
        if (f150139c == null) {
            boolean z2 = false;
            if (!C58071d.m104910d()) {
                if (!C51648a.f118980a.mo87327g().mo86993b() && !C51526g.m95990a(2)) {
                    z2 = true;
                }
                z = Boolean.valueOf(z2);
            } else {
                z = false;
            }
            f150139c = z;
        }
        Boolean bool = f150139c;
        if (bool == null) {
            C89219l.m154715b();
        }
        return bool.booleanValue();
    }

    /* renamed from: d */
    public static final boolean m118576d() {
        if (f150140d == null) {
            boolean z = true;
            if (C51648a.f118980a.mo87322d().mo86984c() || C51526g.m95990a(1)) {
                z = false;
            }
            f150140d = Boolean.valueOf(z);
        }
        Boolean bool = f150140d;
        if (bool == null) {
            C89219l.m154715b();
        }
        return bool.booleanValue();
    }

    /* renamed from: g */
    public static final boolean m118579g() {
        long e = UgCommonServiceImpl.m138290j().mo123107e();
        if (e == 0) {
            e = f150137a.getLong("key_first_launch_time", 0);
        }
        if (e == 0 || System.currentTimeMillis() - e < TimeUnit.DAYS.toMillis(f150137a.getLong("key_rec_friends_frequency", 30))) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b$b */
    public static final class C66867b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C66867b f150143a = new C66867b();

        static {
            Covode.recordClassIndex(78442);
        }

        C66867b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C66865b.f150137a.storeString("key_check_status", "value_check_fail");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b$a */
    public static final class C66866a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ boolean f150141a;

        /* renamed from: b */
        final /* synthetic */ boolean f150142b;

        static {
            Covode.recordClassIndex(78441);
        }

        public C66866a(boolean z, boolean z2) {
            this.f150141a = z;
            this.f150142b = z2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((CheckMatchedFriendsResponse) obj).getHasData()) {
                if (!this.f150141a && !this.f150142b) {
                    C66865b.m118573a();
                }
                C66865b.f150137a.storeString("key_check_status", "value_check_hasdata");
                return;
            }
            C66865b.f150137a.storeBoolean("key_new_version", false);
            C66865b.f150137a.storeString("key_check_status", "value_check_empty");
        }
    }
}
