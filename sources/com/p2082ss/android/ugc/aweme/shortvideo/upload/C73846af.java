package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73896b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.af */
public final class C73846af {

    /* renamed from: e */
    public static final C73847a f165767e = new C73847a((byte) 0);

    /* renamed from: a */
    public final int f165768a = C16048b.m29633a().mo25412a(true, "upload_status_report_gap_s", -1);

    /* renamed from: b */
    public AbstractC88412b f165769b;

    /* renamed from: c */
    public long f165770c = -1;

    /* renamed from: d */
    public boolean f165771d;

    /* renamed from: f */
    private final ConcurrentLinkedQueue<String> f165772f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    private volatile boolean f165773g;

    /* renamed from: h */
    private final String f165774h;

    /* renamed from: i */
    private final String f165775i;

    /* renamed from: j */
    private final boolean f165776j;

    /* renamed from: k */
    private final C73896b f165777k;

    static {
        Covode.recordClassIndex(86592);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.af$a */
    public static final class C73847a {
        static {
            Covode.recordClassIndex(86593);
        }

        private C73847a() {
        }

        public /* synthetic */ C73847a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.af$b */
    public static final class C73848b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73846af f165778a;

        static {
            Covode.recordClassIndex(86594);
        }

        public C73848b(C73846af afVar) {
            this.f165778a = afVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f165778a.mo116306a(null);
        }
    }

    /* renamed from: b */
    public final void mo116307b(EnumC73918s sVar) {
        C89219l.m154721d(sVar, "");
        if (this.f165768a > 0) {
            this.f165773g = true;
            AbstractC88412b bVar = this.f165769b;
            if (bVar != null && !bVar.isDisposed()) {
                AbstractC88412b bVar2 = this.f165769b;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                bVar2.dispose();
            }
            mo116306a(sVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116306a(EnumC73918s sVar) {
        String str;
        String str2;
        String str3;
        C84425b a = new C84425b().mo129403a("mob_lost_assist", 1).mo129406a("shoot_way", this.f165775i).mo129404a("mob_lost_gap", SystemClock.uptimeMillis() - this.f165770c).mo129403a("status", 20001).mo129405a("upload_is_success", sVar);
        String str4 = "1";
        if (this.f165776j) {
            str = str4;
        } else {
            str = "0";
        }
        C84425b a2 = a.mo129406a("retry_publish", str);
        if (this.f165777k.mo116344c()) {
            str2 = str4;
        } else {
            str2 = "0";
        }
        C84425b a3 = a2.mo129406a("is_synthetic_success", str2).mo129403a("synthetic_error_code", this.f165777k.f165910d).mo129403a("publish_step", 32);
        if (this.f165771d) {
            str3 = str4;
        } else {
            str3 = "0";
        }
        C84425b a4 = a3.mo129406a("is_click_publish", str3);
        if (!C72829c.m128602a(C63247i.f143610a)) {
            str4 = "0";
        }
        C84425b a5 = a4.mo129406a("network_available", str4);
        ArrayList arrayList = new ArrayList(this.f165772f);
        this.f165772f.clear();
        Iterator it = arrayList.iterator();
        String str5 = "";
        while (it.hasNext()) {
            str5 = str5 + " | " + ((String) it.next());
        }
        C39162r.m79460a("parallel_publish_result", a5.mo129406a("upload_error_msg", str5).mo129406a("publish_id", this.f165774h).f188764a);
    }

    /* renamed from: a */
    public final void mo116305a(int i, String str) {
        if (this.f165768a > 0 && !this.f165773g && str != null && str.length() != 0) {
            if (this.f165772f.size() >= 20) {
                this.f165772f.poll();
            }
            this.f165772f.offer("[" + i + "][" + System.currentTimeMillis() + ']' + str);
        }
    }

    public C73846af(String str, String str2, boolean z, boolean z2, C73896b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        this.f165774h = str;
        this.f165775i = str2;
        this.f165776j = z;
        this.f165771d = z2;
        this.f165777k = bVar;
    }
}
