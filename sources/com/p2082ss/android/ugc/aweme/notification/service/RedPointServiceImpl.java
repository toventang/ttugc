package com.p2082ss.android.ugc.aweme.notification.service;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61551c;
import com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62232h;

/* renamed from: com.ss.android.ugc.aweme.notification.service.RedPointServiceImpl */
public class RedPointServiceImpl implements OldRedPointService, RedPointService {

    /* renamed from: a */
    private final RedPointService f141266a = C62232h.m112535b();

    static {
        Covode.recordClassIndex(73008);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99310a() {
        this.f141266a.mo99318a();
    }

    /* renamed from: b */
    public static OldRedPointService m112583b() {
        MethodCollector.m26663i(3737);
        Object a = C81908b.m141854a(OldRedPointService.class, false);
        if (a != null) {
            OldRedPointService oldRedPointService = (OldRedPointService) a;
            MethodCollector.m26664o(3737);
            return oldRedPointService;
        }
        if (C81908b.f183273cW == null) {
            synchronized (OldRedPointService.class) {
                try {
                    if (C81908b.f183273cW == null) {
                        C81908b.f183273cW = new RedPointServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3737);
                    throw th;
                }
            }
        }
        RedPointServiceImpl redPointServiceImpl = (RedPointServiceImpl) C81908b.f183273cW;
        MethodCollector.m26664o(3737);
        return redPointServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final int mo99309a(int i) {
        return this.f141266a.mo99317a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: b */
    public final int mo99316b(int i) {
        return this.f141266a.mo99324b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99313a(Message message) {
        this.f141266a.mo99321a(message);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99314a(boolean z) {
        this.f141266a.mo99322a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99311a(int i, int i2) {
        this.f141266a.mo99319a(i, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99312a(int i, EnumC61551c cVar) {
        this.f141266a.mo99320a(i, cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.count.RedPointService, com.p2082ss.android.ugc.aweme.notice.api.count.OldRedPointService
    /* renamed from: a */
    public final void mo99315a(boolean z, int i) {
        this.f141266a.mo99323a(z, i);
    }
}
