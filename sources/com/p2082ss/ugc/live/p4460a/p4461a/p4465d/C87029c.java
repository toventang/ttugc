package com.p2082ss.ugc.live.p4460a.p4461a.p4465d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.p4462a.AbstractC87012b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4463b.AbstractC87015b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87014a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87023c;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87025e;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87036a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87037b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: com.ss.ugc.live.a.a.d.c */
public final class C87029c implements AbstractC87031d<String> {

    /* renamed from: a */
    public AbstractC87010a<String> f196203a;

    /* renamed from: b */
    private AbstractC87015b f196204b;

    /* renamed from: c */
    private AbstractC87012b f196205c;

    static {
        Covode.recordClassIndex(102795);
    }

    /* renamed from: a */
    public final String mo140637a(C87020c cVar) {
        String a = C87037b.m150745a(this.f196205c.mo16301a(cVar));
        File file = new File(a);
        if (file.exists() || file.mkdirs()) {
            return a + C87036a.m150742a(cVar.f196191c[0]);
        }
        throw new IOException("mkdirs return false, dir=".concat(String.valueOf(file)));
    }

    public C87029c(AbstractC87015b bVar, AbstractC87012b bVar2) {
        this.f196204b = bVar;
        this.f196205c = bVar2;
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87031d
    /* renamed from: a */
    public final void mo16296a(final C87020c cVar, AbstractC87010a<String> aVar) {
        this.f196203a = aVar;
        final C87014a aVar2 = new C87014a(cVar.mo140630a());
        try {
            File b = C87037b.m150747b(mo140637a(cVar));
            if (b.exists()) {
                aVar2.f196183b = b.length();
            }
        } catch (Exception unused) {
        }
        this.f196204b.mo140625a(aVar2, new AbstractC87015b.AbstractC87016a() {
            /* class com.p2082ss.ugc.live.p4460a.p4461a.p4465d.C87029c.C870301 */

            static {
                Covode.recordClassIndex(102796);
            }

            /* renamed from: a */
            private static boolean m150728a(File file) {
                MethodCollector.m26663i(2529);
                try {
                    C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                    if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                        C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                    }
                    if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                        C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                        MethodCollector.m26664o(2529);
                        return false;
                    }
                } catch (Throwable unused) {
                }
                boolean delete = file.delete();
                MethodCollector.m26664o(2529);
                return delete;
            }

            @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4463b.AbstractC87015b.AbstractC87016a
            /* renamed from: a */
            public final void mo140627a(Throwable th, int i) {
                if (i == 416) {
                    try {
                        File b = C87037b.m150747b(C87029c.this.mo140637a(cVar));
                        if (b.exists()) {
                            m150728a(b);
                        }
                    } catch (Exception unused) {
                    }
                }
                C87029c.this.f196203a.mo63848a(cVar, new C87023c("download failed", th, cVar, i, aVar2));
            }

            @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4463b.AbstractC87015b.AbstractC87016a
            /* renamed from: a */
            public final void mo140626a(InputStream inputStream, long j) {
                Throwable th;
                int i;
                MethodCollector.m26663i(2515);
                try {
                    String a = C87029c.this.mo140637a(cVar);
                    File b = C87037b.m150747b(a);
                    C87029c cVar = C87029c.this;
                    C87020c cVar2 = cVar;
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(b, "rw");
                        try {
                            long length = randomAccessFile.length();
                            if (length > 0) {
                                randomAccessFile.seek(length);
                            }
                            byte[] bArr = new byte[2048];
                            long j2 = length + j;
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read >= 0) {
                                    randomAccessFile.write(bArr, i2, read);
                                    length += (long) read;
                                    if (j2 > 0) {
                                        i = (int) ((100 * length) / j2);
                                    } else {
                                        double d = (double) (-length);
                                        Double.isNaN(d);
                                        i = (int) (100.0d * (1.0d - Math.exp(d / 50000.0d)));
                                    }
                                    if (i != i3) {
                                        cVar.f196203a.mo63847a(cVar2, i);
                                        i3 = i;
                                    }
                                    i2 = 0;
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            randomAccessFile.close();
                            inputStream.close();
                            if (b.renameTo(new File(a))) {
                                C87029c.this.f196203a.mo63850a(cVar, a);
                                MethodCollector.m26664o(2515);
                                return;
                            }
                            m150728a(b);
                            Exception exc = new Exception("rename file failed");
                            MethodCollector.m26664o(2515);
                            throw exc;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                randomAccessFile.close();
                                inputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            MethodCollector.m26664o(2515);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        MethodCollector.m26664o(2515);
                        throw th;
                    }
                } catch (Exception e3) {
                    C87029c.this.f196203a.mo63848a(cVar, new C87025e("write storage failed.", e3, cVar));
                    MethodCollector.m26664o(2515);
                }
            }
        });
    }
}
