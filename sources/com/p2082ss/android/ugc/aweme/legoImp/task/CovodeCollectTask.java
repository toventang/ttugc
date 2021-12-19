package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.services.apm.api.AbstractC22713f;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CovodeCollectTask */
public final class CovodeCollectTask implements AbstractC58264w {

    /* renamed from: b */
    public static final C58330a f132832b = new C58330a((byte) 0);

    /* renamed from: a */
    public final Keva f132833a = Keva.getRepo("covode");

    static {
        Covode.recordClassIndex(68437);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.CovodeCollectTask$a */
    public static final class C58330a {
        static {
            Covode.recordClassIndex(68438);
        }

        private C58330a() {
        }

        public /* synthetic */ C58330a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.CovodeCollectTask$c */
    public static final class C58332c implements AbstractC22713f {

        /* renamed from: a */
        final /* synthetic */ CovodeCollectTask f132835a;

        static {
            Covode.recordClassIndex(68440);
        }

        @Override // com.bytedance.services.apm.api.AbstractC22713f
        /* renamed from: a */
        public final void mo36999a() {
            this.f132835a.f132833a.storeLong("covode_upload_time", System.currentTimeMillis());
            int i = this.f132835a.f132833a.getInt("upload_interval_day", 0);
            int i2 = 1;
            if (i != 0 && (i2 = i << 1) > 8) {
                i2 = 8;
            }
            this.f132835a.f132833a.storeInt("upload_interval_day", i2);
        }

        @Override // com.bytedance.services.apm.api.AbstractC22713f
        /* renamed from: a */
        public final void mo37000a(String str) {
            C22708a.m42800a(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58332c(CovodeCollectTask covodeCollectTask) {
            this.f132835a = covodeCollectTask;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.CovodeCollectTask$b */
    public static final class C58331b implements Covode.AbstractC13806b {

        /* renamed from: a */
        final /* synthetic */ CovodeCollectTask f132834a;

        static {
            Covode.recordClassIndex(68439);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58331b(CovodeCollectTask covodeCollectTask) {
            this.f132834a = covodeCollectTask;
        }

        @Override // com.bytedance.covode.number.Covode.AbstractC13806b
        /* renamed from: a */
        public final boolean mo22213a(File file) {
            return this.f132834a.mo95743a(file);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        Covode.reportCollections(new C58331b(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if ((java.lang.System.currentTimeMillis() - r3) >= ((long) (r12.f132833a.getInt("upload_interval_day", 0) * 86400000))) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (com.p2082ss.android.ugc.aweme.experiment.C46893en.f109282c.getValue().intValue() == com.p2082ss.android.ugc.aweme.experiment.C46893en.f109281b) goto L_0x0039;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo95743a(java.io.File r13) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.CovodeCollectTask.mo95743a(java.io.File):boolean");
    }
}
