package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46994gu;
import com.p2082ss.android.ugc.aweme.feed.cache.C49324h;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58243m;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3418e.C58884a;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3418e.C58886b;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58905h;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.HwWallpaperMobEventTask */
public final class HwWallpaperMobEventTask implements AbstractC58264w {

    /* renamed from: a */
    private final String f132843a = "HwWallpaperMobEventTask";

    /* renamed from: b */
    private final long f132844b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: c */
    private final AbstractC89244h f132845c = C89250i.m154773a((AbstractC89171a) C58339a.f132846a);

    static {
        Covode.recordClassIndex(68462);
    }

    /* renamed from: c */
    private final SimpleDateFormat m105753c() {
        return (SimpleDateFormat) this.f132845c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.HwWallpaperMobEventTask$a */
    static final class C58339a extends AbstractC89220m implements AbstractC89171a<SimpleDateFormat> {

        /* renamed from: a */
        public static final C58339a f132846a = new C58339a();

        static {
            Covode.recordClassIndex(68463);
        }

        C58339a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (((Boolean) C58243m.f132663k.getValue()).booleanValue()) {
            return EnumC58151ae.APP_BACKGROUND;
        }
        return EnumC58151ae.BOOT_FINISH;
    }

    /* renamed from: a */
    private final long m105752a(long j) {
        Date parse = m105753c().parse(m105753c().format(new Date(j)));
        C89219l.m154716b(parse, "");
        return parse.getTime();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        if (C58901f.m108237d()) {
            C49324h.m92399a().storeInt("wallpaper_cache_feed_expire_hour", ((Number) C58886b.f134055b.getValue()).intValue());
            if (!C46994gu.m90274a(context)) {
                C58905h.m108240a(false);
            }
            C58905h.m108238a().storeInt("keva_key_active_check_interval_hour", ((Number) C58884a.f134051b.getValue()).intValue());
            String[] b = C58905h.m108242b();
            if (!(b == null || b.length == 0)) {
                C58905h.m108238a().erase("keva_key_wallpaper_active_date");
                int abs = (int) (Math.abs(m105752a(System.currentTimeMillis()) - m105752a(Long.parseLong(b[0]))) / this.f132844b);
                for (String str : b) {
                    long parseLong = Long.parseLong(str);
                    C39162r.m79460a("hw_wall_paper_active", new C33744d().mo59983a("date", m105753c().format(new Date(parseLong))).mo59980a("is_today", C89219l.m154714a(m105753c().format(new Date(parseLong)), m105753c().format(new Date(System.currentTimeMillis()))) ? 1 : 0).mo59980a("no_active_days", abs).f79943a);
                }
                C58905h.m108238a().storeLong("keva_key_already_upload_date", System.currentTimeMillis());
            }
        }
    }
}
