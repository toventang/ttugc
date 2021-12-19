package com.p2082ss.android.ugc.aweme.sticker;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75462e;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75715t;
import com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.o */
public final class C75449o implements AbstractC75715t {

    /* renamed from: a */
    public static final C75449o f169546a = new C75449o();

    private C75449o() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.o$a */
    public static final class C75450a implements AbstractC63191aq {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f169547a;

        /* renamed from: b */
        final /* synthetic */ String f169548b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f169549c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f169550d;

        /* renamed from: e */
        final /* synthetic */ boolean f169551e;

        static {
            Covode.recordClassIndex(88371);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq
        /* renamed from: a */
        public final void mo101642a() {
            this.f169547a.invoke();
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.o$a$a */
        public static final class C75451a implements AbstractC63257p.AbstractC63258a {

            /* renamed from: a */
            final /* synthetic */ C75450a f169552a;

            /* renamed from: b */
            final /* synthetic */ C69905c f169553b;

            static {
                Covode.recordClassIndex(88372);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
            /* renamed from: a */
            public final void mo101753a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
            /* renamed from: a */
            public final void mo101754a(int i) {
                this.f169552a.f169549c.invoke(Integer.valueOf(i));
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
            /* renamed from: a */
            public final void mo101756a(String str) {
                C89219l.m154721d(str, "");
                this.f169552a.f169550d.invoke(this.f169553b, str);
            }

            C75451a(C75450a aVar, C69905c cVar) {
                this.f169552a = aVar;
                this.f169553b = cVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
            /* renamed from: a */
            public final void mo101755a(Integer num, String str) {
                this.f169552a.f169547a.invoke();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq
        /* renamed from: a */
        public final void mo101643a(C69905c cVar) {
            boolean z;
            if (cVar == null) {
                this.f169547a.invoke();
            } else if (!AVCommerceServiceImpl.m102988h().mo93962a() || cVar.isCommerceMusic()) {
                String a = C75462e.m132331a(this.f169548b);
                AbstractC63257p s = C63244g.m114602a().mo73291s();
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                Context applicationContext = application.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                C89219l.m154716b(applicationContext, "");
                if (!s.mo101747a(cVar, applicationContext, false)) {
                    this.f169547a.invoke();
                    return;
                }
                if (a == null || a.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && FileUtils.INSTANCE.checkFileExists(a)) {
                    this.f169549c.invoke(100);
                    this.f169550d.invoke(cVar, a);
                } else if (!this.f169551e) {
                    this.f169549c.invoke(100);
                    this.f169550d.invoke(cVar, null);
                } else {
                    AbstractC63257p s2 = C63244g.m114602a().mo73291s();
                    Application application2 = C63247i.f143610a;
                    C89219l.m154716b(application2, "");
                    s2.mo101744a(application2, cVar, 0, new C75451a(this, cVar));
                }
            } else {
                this.f169547a.invoke();
            }
        }

        C75450a(AbstractC89171a aVar, String str, AbstractC89172b bVar, AbstractC89183m mVar, boolean z) {
            this.f169547a = aVar;
            this.f169548b = str;
            this.f169549c = bVar;
            this.f169550d = mVar;
            this.f169551e = z;
        }
    }

    static {
        Covode.recordClassIndex(88370);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75715t
    /* renamed from: a */
    public final void mo118602a(String str, boolean z, AbstractC89172b<? super Integer, C89391z> bVar, AbstractC89183m<? super AbstractC75370g, ? super String, C89391z> mVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        C63244g.m114602a().mo73291s().mo101746a(str, new C75450a(aVar, str, bVar, mVar, z));
    }
}
