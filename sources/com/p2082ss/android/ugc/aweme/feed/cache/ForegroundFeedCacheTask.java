package com.p2082ss.android.ugc.aweme.feed.cache;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.ForegroundFeedCacheTask */
public final class ForegroundFeedCacheTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C49294a f113306a = new C49294a((byte) 0);

    /* renamed from: b */
    private final EnumC58151ae f113307b;

    static {
        Covode.recordClassIndex(58093);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
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

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.ForegroundFeedCacheTask$a */
    public static final class C49294a {
        static {
            Covode.recordClassIndex(58094);
        }

        private C49294a() {
        }

        public /* synthetic */ C49294a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return this.f113307b;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    public ForegroundFeedCacheTask(EnumC58151ae aeVar) {
        C89219l.m154721d(aeVar, "");
        this.f113307b = aeVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.ForegroundFeedCacheTask$b */
    static final class C49295b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C49295b f113308a = new C49295b();

        static {
            Covode.recordClassIndex(58095);
        }

        C49295b() {
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Void> iVar) {
            AbstractC80918i b = C80937s.m140453b();
            if (b != null) {
                b.mo124065a(C49326i.f113367c);
            }
            new C58221f.C58224c().mo95703b((AbstractC58264w) new ForegroundFeedCacheTask(EnumC58151ae.IDLE)).mo95706a();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (C80937s.m140453b() == null || !C80937s.m140453b().mo124085g()) {
            return;
        }
        if (this.f113307b == EnumC58151ae.IDLE) {
            C49301e.f113327o.mo80895a(false);
        } else if (this.f113307b == EnumC58151ae.BOOT_FINISH) {
            C1731i.m5631a(180000).mo5534a(C49295b.f113308a, C1731i.f5564c, null);
        }
    }
}
