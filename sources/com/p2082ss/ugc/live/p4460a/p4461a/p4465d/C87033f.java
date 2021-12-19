package com.p2082ss.ugc.live.p4460a.p4461a.p4465d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87024d;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87037b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87039d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.ss.ugc.live.a.a.d.f */
public final class C87033f implements AbstractC87010a<String>, AbstractC87031d<String> {

    /* renamed from: a */
    private AbstractC87031d<String> f196212a;

    /* renamed from: b */
    private AbstractC87010a<String> f196213b;

    static {
        Covode.recordClassIndex(102799);
    }

    public C87033f(AbstractC87031d dVar) {
        this.f196212a = dVar;
    }

    /* renamed from: a */
    private static boolean m150734a(File file) {
        MethodCollector.m26663i(2963);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(2963);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(2963);
        return delete;
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4465d.AbstractC87031d
    /* renamed from: a */
    public final void mo16296a(C87020c cVar, AbstractC87010a<String> aVar) {
        this.f196213b = aVar;
        this.f196212a.mo16296a(cVar, this);
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final void mo63847a(C87020c cVar, int i) {
        AbstractC87010a<String> aVar = this.f196213b;
        if (aVar != null) {
            aVar.mo63847a(cVar, i);
        }
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final void mo63848a(C87020c cVar, C87021a aVar) {
        AbstractC87010a<String> aVar2 = this.f196213b;
        if (aVar2 != null) {
            aVar2.mo63848a(cVar, aVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.a.a.c, java.lang.Object] */
    @Override // com.p2082ss.ugc.live.p4460a.p4461a.AbstractC87010a
    /* renamed from: a */
    public final /* synthetic */ void mo63850a(C87020c cVar, String str) {
        MethodCollector.m26663i(3027);
        String str2 = str;
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/"));
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str2)));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                String name = nextEntry.getName();
                if (!name.contains("../")) {
                    if (nextEntry.isDirectory()) {
                        new File(substring + File.separator + name).mkdirs();
                    } else {
                        File file = new File(substring + File.separator + name);
                        if (file.exists()) {
                            C87039d.m150750a(file);
                        } else {
                            file.getParentFile().mkdirs();
                        }
                        file.createNewFile();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    }
                }
            }
            zipInputStream.close();
            AbstractC87010a<String> aVar = this.f196213b;
            if (aVar != null) {
                aVar.mo63850a(cVar, substring);
            }
            m150734a(new File(str2));
            MethodCollector.m26664o(3027);
        } catch (Exception e) {
            mo63848a(cVar, (C87021a) new C87024d("unzip exception", e, cVar));
            if (0 != 0) {
                C87037b.m150746a(new File((String) null));
            }
            MethodCollector.m26664o(3027);
        }
    }
}
