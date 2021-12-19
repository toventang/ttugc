package com.p2082ss.android.ugc.aweme.shortvideo.p3892x;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.tools.C84401c;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.x.a */
public final class C74305a {

    /* renamed from: a */
    public final AbstractC31193a f167093a;

    /* renamed from: b */
    private String f167094b;

    static {
        Covode.recordClassIndex(87077);
    }

    /* renamed from: a */
    public final void mo116913a() {
        AbstractC31193a aVar = this.f167093a;
        if (aVar != null) {
            aVar.mo56828i(true);
        }
    }

    public C74305a(AbstractC31193a aVar) {
        this.f167093a = aVar;
    }

    /* renamed from: a */
    public final void mo116914a(String str) {
        this.f167093a.mo56783a(str);
        this.f167094b = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.x.a$a */
    public static class C74306a {

        /* renamed from: a */
        public String f167095a;

        /* renamed from: b */
        public String f167096b;

        /* renamed from: c */
        public String f167097c;

        /* renamed from: d */
        public boolean f167098d;

        /* renamed from: e */
        public AbstractC31133a f167099e;

        /* renamed from: f */
        public boolean f167100f;

        /* renamed from: g */
        public boolean f167101g;

        /* renamed from: h */
        public boolean f167102h;

        static {
            Covode.recordClassIndex(87078);
        }

        /* renamed from: a */
        private static boolean m130714a(File file) {
            MethodCollector.m26663i(1955);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(1955);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(1955);
            return delete;
        }

        /* renamed from: b */
        private void m130715b(AbstractC74318j jVar) {
            if (this.f167101g) {
                mo116917a(jVar, this.f167095a, this.f167096b, 0);
                return;
            }
            if (this.f167095a != null) {
                File file = new File(this.f167095a);
                if (file.exists()) {
                    m130714a(file);
                }
            }
            if (this.f167096b != null) {
                File file2 = new File(this.f167096b);
                if (file2.exists()) {
                    m130714a(file2);
                }
            }
            if (this.f167095a != null && this.f167096b != null) {
                C84401c.f188722f.mo123662d("CameraVideoRecorder concatWithReleaseGPUResource concatAsync enableSingleSegmentConcatUseCopy " + this.f167098d);
                this.f167099e.mo56601a(this.f167095a, this.f167096b, this.f167098d, this.f167097c, "", new C74310c(this, jVar));
            }
        }

        /* renamed from: a */
        public final void mo116916a(AbstractC74318j jVar) {
            if (this.f167100f || this.f167102h) {
                m130715b(jVar);
            } else if (this.f167101g) {
                C84401c.f188722f.mo123662d("CameraVideoRecorder concat return 0");
                jVar.mo108517a(this.f167095a, this.f167096b, this.f167097c, 0);
            } else {
                if (this.f167095a != null) {
                    File file = new File(this.f167095a);
                    if (file.exists()) {
                        m130714a(file);
                    }
                }
                if (this.f167096b != null) {
                    File file2 = new File(this.f167096b);
                    if (file2.exists()) {
                        m130714a(file2);
                    }
                }
                C84401c.f188722f.mo123662d("CameraVideoRecorder executeAsync concatasync enableSingleSegmentConcatUseCopy " + this.f167098d);
                this.f167099e.mo56601a(this.f167095a, this.f167096b, this.f167098d, this.f167097c, "", new C74309b(this, jVar));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo116917a(AbstractC74318j jVar, String str, String str2, int i) {
            this.f167099e.mo56594a(new C74311d(this, jVar, str, str2, i));
        }
    }

    /* renamed from: a */
    public final void mo116915a(String str, float f) {
        this.f167093a.mo56784a(str, f);
        this.f167094b = str;
    }
}
