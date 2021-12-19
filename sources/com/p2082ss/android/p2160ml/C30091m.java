package com.p2082ss.android.p2160ml;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.p2162bl.MLConfigModel;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* renamed from: com.ss.android.ml.m */
public class C30091m {

    /* renamed from: a */
    public volatile boolean f71805a;

    /* renamed from: b */
    public AbstractC30090l f71806b;

    /* renamed from: c */
    public final AbstractC30093n f71807c;

    /* renamed from: d */
    public MLConfigModel f71808d;

    /* renamed from: e */
    public C30083j f71809e;

    /* renamed from: f */
    public final C30094o f71810f;

    /* renamed from: g */
    public String f71811g;

    /* renamed from: h */
    private int f71812h;

    /* renamed from: i */
    private int f71813i;

    /* renamed from: j */
    private final AbstractC30090l f71814j;

    /* renamed from: k */
    private AbstractC30080g f71815k;

    /* renamed from: l */
    private String f71816l;

    static {
        Covode.recordClassIndex(36587);
    }

    /* renamed from: c */
    public final boolean mo53465c() {
        return this.f71807c.mo53469c();
    }

    /* renamed from: a */
    public final List<? extends AbstractC30113c> mo53460a() {
        if (this.f71808d.intput == null) {
            return this.f71808d.input;
        }
        return this.f71808d.intput;
    }

    /* renamed from: d */
    private synchronized void m60856d() {
        AbstractC30090l sVar;
        MethodCollector.m26663i(8825);
        if (this.f71809e == null) {
            this.f71809e = C30082i.m60841a().f71787b;
        }
        if (this.f71815k == null) {
            this.f71815k = this.f71809e.f71791d;
        }
        if (this.f71806b == null) {
            AbstractC30090l lVar = this.f71814j;
            if (lVar == null || ((!(lVar instanceof C30119s) || !C30074c.f71782c) && (!(this.f71814j instanceof C30072a) || !C30074c.f71780a))) {
                String d = this.f71807c.mo53470d();
                if (TextUtils.isEmpty(d)) {
                    sVar = new C30117q(d);
                } else if ("bytenn".equals(d)) {
                    sVar = new C30072a();
                } else {
                    sVar = new C30119s();
                }
            } else {
                sVar = this.f71814j;
            }
            this.f71806b = sVar;
            sVar.mo53456a(this.f71810f);
            this.f71806b.mo53458a(this.f71811g);
        }
        MethodCollector.m26664o(8825);
    }

    /* renamed from: b */
    public final boolean mo53464b() {
        final long j;
        if (C30082i.m60841a().f71787b == null) {
            return false;
        }
        m60856d();
        if (mo53465c() && !this.f71806b.mo53459a() && !this.f71805a && this.f71812h <= 5) {
            this.f71805a = true;
            this.f71812h++;
            if (C30120t.f71860a) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            RunnableC300921 r2 = new Runnable() {
                /* class com.p2082ss.android.p2160ml.C30091m.RunnableC300921 */

                static {
                    Covode.recordClassIndex(36588);
                }

                /* JADX WARNING: Removed duplicated region for block: B:71:0x02d0  */
                /* JADX WARNING: Removed duplicated region for block: B:74:0x0320  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 1279
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2160ml.C30091m.RunnableC300921.run():void");
                }
            };
            C30083j jVar = this.f71809e;
            if (jVar.f71794g == null && jVar.f71792e != null) {
                jVar.f71794g = jVar.f71792e.mo53451a();
            }
            jVar.f71794g.submit(r2);
        }
        if (C30120t.f71860a) {
            mo53465c();
            this.f71806b.mo53459a();
            this.f71807c.mo53468b();
            this.f71807c.mo53470d();
        }
        return this.f71806b.mo53459a();
    }

    public C30091m(AbstractC30093n nVar) {
        this(nVar, (byte) 0);
    }

    /* renamed from: a */
    public static void m60853a(String... strArr) {
        for (String str : strArr) {
            File file = new File(str);
            if (file.exists()) {
                m60855b(file);
            }
        }
    }

    /* renamed from: b */
    private static boolean m60855b(File file) {
        MethodCollector.m26663i(8975);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(8975);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(8975);
        return delete;
    }

    /* renamed from: a */
    public final boolean mo53462a(File file) {
        Throwable th;
        MethodCollector.m26663i(9129);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                this.f71806b.mo53457a(fileInputStream2, this.f71808d);
                mo53461a(7, (Throwable) null);
                this.f71810f.mo53476b(this.f71806b.mo53459a());
                C30120t.m60920a(fileInputStream2);
                MethodCollector.m26664o(9129);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                try {
                    C30088k.m60845a(this.f71811g, "loadModel error: ", th);
                    mo53461a(8, th);
                    this.f71810f.mo53476b(this.f71806b.mo53459a());
                    C30120t.m60920a(fileInputStream);
                    MethodCollector.m26664o(9129);
                    return false;
                } catch (Throwable th3) {
                    this.f71810f.mo53476b(this.f71806b.mo53459a());
                    C30120t.m60920a(fileInputStream);
                    MethodCollector.m26664o(9129);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            C30088k.m60845a(this.f71811g, "loadModel error: ", th);
            mo53461a(8, th);
            this.f71810f.mo53476b(this.f71806b.mo53459a());
            C30120t.m60920a(fileInputStream);
            MethodCollector.m26664o(9129);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo53461a(int i, Throwable th) {
        this.f71813i = i;
        m60854b(i, th);
    }

    /* renamed from: b */
    private void m60854b(int i, Throwable th) {
        AbstractC30080g gVar = this.f71815k;
        if (gVar != null) {
            this.f71807c.mo53467a();
            if (th != null) {
                th.getMessage();
                th.printStackTrace(new PrintWriter(new StringWriter()));
            }
            gVar.mo53448a();
        }
    }

    private C30091m(AbstractC30093n nVar, byte b) {
        this.f71816l = "default";
        this.f71811g = "ml#evaluator";
        if (nVar != null) {
            this.f71814j = null;
            this.f71807c = nVar;
            if (nVar.mo53469c()) {
                this.f71816l = nVar.mo53468b();
            }
            String str = this.f71816l;
            C30094o oVar = C30096p.f71838a.get(str);
            if (oVar == null) {
                oVar = new C30094o(str);
                C30096p.f71838a.put(str, oVar);
            }
            this.f71810f = oVar;
            oVar.mo53471a();
            if (C30120t.f71860a) {
                new StringBuilder("-----MLModelComponent created.---!!! config:").append(nVar).append(" engine:").append((Object) null);
                new Throwable("not crash, only for debug!!");
                return;
            }
            return;
        }
        throw new RuntimeException("MLModelConfig can not be null!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53463a(java.io.File r11, java.io.File r12) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2160ml.C30091m.mo53463a(java.io.File, java.io.File):boolean");
    }
}
