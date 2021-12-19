package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageClearTask */
public final class StorageClearTask implements AbstractC58264w {

    /* renamed from: a */
    public static volatile boolean f132951a;

    /* renamed from: b */
    public static final C58395a f132952b = new C58395a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageClearTask$c */
    static final class C58398c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C58398c f132955a = new C58398c();

        static {
            Covode.recordClassIndex(68616);
        }

        C58398c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(68612);
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageClearTask$a */
    public static final class C58395a {
        static {
            Covode.recordClassIndex(68613);
        }

        private C58395a() {
        }

        public /* synthetic */ C58395a(byte b) {
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageClearTask$b */
    public static final class C58396b implements AbstractC88433f<Application> {

        /* renamed from: a */
        final /* synthetic */ Context f132953a;

        static {
            Covode.recordClassIndex(68614);
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageClearTask$b$a */
        static final class RunnableC58397a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C58396b f132954a;

            static {
                Covode.recordClassIndex(68615);
            }

            RunnableC58397a(C58396b bVar) {
                this.f132954a = bVar;
            }

            public final void run() {
                if (!C17867d.f42595s.equals("lark_inhouse") && !AVExternalServiceImpl.m113114a().publishService().isPublishing()) {
                    if (m106600a(this.f132954a.f132953a) != null) {
                        File a = m106600a(this.f132954a.f132953a);
                        C89219l.m154716b(a, "");
                        if (a.getParent() != null) {
                            StringBuilder sb = new StringBuilder();
                            File a2 = m106600a(this.f132954a.f132953a);
                            C89219l.m154716b(a2, "");
                            C80720e.m139938e(sb.append(a2.getAbsolutePath()).append("/cacheV2").toString());
                            StringBuilder sb2 = new StringBuilder();
                            File a3 = m106600a(this.f132954a.f132953a);
                            C89219l.m154716b(a3, "");
                            C80720e.m139938e(sb2.append(a3.getParent()).append("/app_assets").toString());
                            C51423a.m95791b(6, "StorageClearTask", "clear appassets ");
                        }
                    }
                    if (m106601b(this.f132954a.f132953a) != null) {
                        File b = m106601b(this.f132954a.f132953a);
                        C89219l.m154716b(b, "");
                        if (b.getAbsolutePath() != null) {
                            StringBuilder sb3 = new StringBuilder();
                            File b2 = m106601b(this.f132954a.f132953a);
                            C89219l.m154716b(b2, "");
                            C80720e.m139938e(sb3.append(b2.getAbsolutePath()).append("/offline").toString());
                            StringBuilder sb4 = new StringBuilder();
                            File b3 = m106601b(this.f132954a.f132953a);
                            C89219l.m154716b(b3, "");
                            C80720e.m139938e(sb4.append(b3.getAbsolutePath()).append("/offlineX").toString());
                            C51423a.m95791b(6, "StorageClearTask", "clear offlineX ");
                        }
                    }
                    C51423a.m95791b(6, "StorageClearTask", "clear data ");
                }
            }

            /* renamed from: a */
            private static File m106600a(Context context) {
                if (C58016d.f132221b != null && C58016d.f132224e) {
                    return C58016d.f132221b;
                }
                File cacheDir = context.getCacheDir();
                C58016d.f132221b = cacheDir;
                return cacheDir;
            }

            /* renamed from: b */
            private static File m106601b(Context context) {
                if (C58016d.f132222c != null && C58016d.f132224e) {
                    return C58016d.f132222c;
                }
                File filesDir = context.getFilesDir();
                C58016d.f132222c = filesDir;
                return filesDir;
            }
        }

        C58396b(Context context) {
            this.f132953a = context;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Application application) {
            if (C16048b.m29633a().mo25421a(true, "store_clear_open", false)) {
                C58254p.f132679a.postDelayed(new RunnableC58397a(this), 1000);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (context != null && !f132951a) {
            f132951a = true;
            C17873f.m33101i().mo143254a(new C58396b(context), C58398c.f132955a);
        }
    }
}
