package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3578b;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.jato.gcblocker.C13576b;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.C21478d;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.experiment.C46933fj;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.b.a */
public final class C64008a {

    /* renamed from: d */
    public static boolean f145163d;

    /* renamed from: e */
    public static final C64009a f145164e = new C64009a((byte) 0);

    /* renamed from: a */
    public final boolean f145165a;

    /* renamed from: b */
    public String f145166b;

    /* renamed from: c */
    public final RecyclerView f145167c;

    /* renamed from: f */
    private final AbstractC80347dl f145168f;

    static {
        Covode.recordClassIndex(75452);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.b.a$a */
    public static final class C64009a {
        static {
            Covode.recordClassIndex(75453);
        }

        private C64009a() {
        }

        public /* synthetic */ C64009a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo103585a() {
        AbstractC80321cz b = C80330da.C80331a.m139267b(mo103586b());
        if (b != null) {
            b.mo123695a(this.f145168f);
        }
    }

    /* renamed from: b */
    public final String mo103586b() {
        StringBuilder sb = new StringBuilder("profile_");
        String str = this.f145166b;
        if (str == null) {
            str = "";
        }
        return sb.append(str).toString();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.b.a$b */
    public static final class C64010b implements AbstractC80347dl {

        /* renamed from: a */
        final /* synthetic */ C64008a f145169a;

        static {
            Covode.recordClassIndex(75454);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64010b(C64008a aVar) {
            this.f145169a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl
        /* renamed from: a */
        public final void mo70708a(String str) {
            C89219l.m154721d(str, "");
            C64008a.f145163d = true;
            if (C46933fj.f109368a) {
                C80446fr.m139456a(5000);
            }
            if (C46933fj.f109369b) {
                C80446fr.m139459b(5000);
            }
            if (C46933fj.f109370c) {
                C80446fr.m139460c(5000);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl
        /* renamed from: b */
        public final void mo70709b(String str) {
            String str2;
            C89219l.m154721d(str, "");
            C64008a.f145163d = false;
            AbstractC80321cz b = C80330da.C80331a.m139267b(this.f145169a.mo103586b());
            if (b != null) {
                if (this.f145169a.f145165a) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                b.mo123696a("enter_from", str2);
            }
            if (C46933fj.f109368a) {
                C58254p.f132679a.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.utils.C80446fr.RunnableC804493 */

                    static {
                        Covode.recordClassIndex(93717);
                    }

                    public final void run() {
                        C13576b.m24384a().mo21845b("tt");
                    }
                });
            }
            if (C46933fj.f109369b) {
                C58254p.f132679a.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.utils.C80446fr.RunnableC804526 */

                    static {
                        Covode.recordClassIndex(93720);
                    }

                    public final void run() {
                        C29819a.m60075a();
                    }
                });
            }
            if (C46933fj.f109370c) {
                C21478d.f50922d = false;
            }
        }
    }

    public C64008a(boolean z, String str, RecyclerView recyclerView) {
        this.f145165a = z;
        this.f145166b = str;
        this.f145167c = recyclerView;
        C64010b bVar = new C64010b(this);
        this.f145168f = bVar;
        C80330da.C80331a.m139266a(mo103586b()).mo123695a(bVar).mo123698a(recyclerView);
    }
}
