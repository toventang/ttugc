package com.p2082ss.android.ugc.aweme.money.growth;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.money.growth.f */
public final class C60184f {

    /* renamed from: c */
    public static final C60185a f137192c = new C60185a((byte) 0);

    /* renamed from: a */
    public long f137193a;

    /* renamed from: b */
    public long f137194b;

    /* renamed from: d */
    private final Keva f137195d;

    static {
        Covode.recordClassIndex(70713);
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.f$a */
    public static final class C60185a {
        static {
            Covode.recordClassIndex(70714);
        }

        private C60185a() {
        }

        public /* synthetic */ C60185a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private static String m109689b() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        return e.getCurUserId();
    }

    public C60184f() {
        Keva repo = Keva.getRepo("money_growth_read_task");
        C89219l.m154716b(repo, "");
        this.f137195d = repo;
        this.f137193a = repo.getLong(m109688a("today_timestamp"), 0);
        this.f137194b = repo.getLong(m109688a("progress_time"), 0);
        mo97863a();
    }

    /* renamed from: a */
    public final void mo97863a() {
        long j = this.f137195d.getLong(m109688a("today_timestamp"), 0);
        this.f137193a = j;
        this.f137195d.storeLong(m109688a("today_timestamp"), j);
        long j2 = this.f137195d.getLong(m109688a("progress_time"), 0);
        this.f137194b = j2;
        this.f137195d.storeLong(m109688a("progress_time"), j2);
    }

    /* renamed from: a */
    private static String m109688a(String str) {
        return str + "_" + m109689b();
    }
}
