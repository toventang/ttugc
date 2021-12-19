package com.p2082ss.android.ugc.aweme.notification.p3535vm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61994d;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.e */
public final class C62496e extends C62474d {

    /* renamed from: k */
    public static final C62497a f141755k = new C62497a((byte) 0);

    /* renamed from: j */
    public volatile long f141756j;

    /* renamed from: l */
    private volatile long f141757l;

    /* renamed from: m */
    private volatile long f141758m;

    /* renamed from: n */
    private volatile boolean f141759n = true;

    /* renamed from: o */
    private boolean f141760o;

    static {
        Covode.recordClassIndex(73286);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.e$a */
    public static final class C62497a {
        static {
            Covode.recordClassIndex(73287);
        }

        private C62497a() {
        }

        public /* synthetic */ C62497a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.e$b */
    static final class C62498b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62496e f141761a;

        static {
            Covode.recordClassIndex(73288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62498b(C62496e eVar) {
            super(0);
            this.f141761a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C62496e.super.mo100443i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: n */
    public final boolean mo100455n() {
        List<MusNotice> value = mo100431a().getValue();
        if ((value == null || value.isEmpty()) && this.f141757l <= 0 && !mo100438d() && ((C62474d) this).f141724h == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
        if ((java.lang.System.currentTimeMillis() - r10.f141758m) >= com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a.m112075a().f140630i) goto L_0x00cb;
     */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c, com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo100443i() {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3535vm.C62496e.mo100443i():boolean");
    }

    /* renamed from: a */
    public final boolean mo100454a(C61933a.EnumC61952g gVar) {
        C89219l.m154721d(gVar, "");
        C39109f.m79403b("NotificationTLPreload", "preload, reason:".concat(String.valueOf(gVar)));
        if (gVar == C61933a.EnumC61952g.TAB_CLICK && this.f141758m <= 0) {
            return super.mo100447a(C62474d.EnumC62476b.PRELOAD_REFRESH_CLICK);
        }
        if (gVar == C61933a.EnumC61952g.BOOT_LAZY || gVar == C61933a.EnumC61952g.POST_UNREAD) {
            if (System.currentTimeMillis() - this.f141757l >= C61933a.m112075a().f140629h) {
                return super.mo100447a(C62474d.EnumC62476b.PRELOAD_REFRESH_EXCEPT_REC);
            }
        }
        C39109f.m79403b("NotificationTLPreload", "preload blocked, reason:" + gVar + ", lastTs:" + this.f141757l + ", lastFullTs:" + this.f141758m + ", lastJanusTs:" + this.f141756j);
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d
    /* renamed from: b */
    public final void mo100448b(C62474d.EnumC62476b bVar) {
        C89219l.m154721d(bVar, "");
        C39109f.m79403b("NotificationTLPreload", "onDataCombinedEnd, reason:" + bVar + ", refreshAgain:" + this.f141760o);
        if (bVar == C62474d.EnumC62476b.REFRESH || bVar == C62474d.EnumC62476b.PRELOAD_REFRESH_CLICK) {
            this.f141758m = System.currentTimeMillis();
        } else if (this.f141760o) {
            C61994d.m112123b(new C62498b(this));
        }
        this.f141760o = false;
        if (mo100450k().contains(bVar)) {
            this.f141756j = System.currentTimeMillis();
            this.f141757l = this.f141756j;
        }
    }
}
