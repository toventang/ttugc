package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.twitter.sdk.android.core.internal.C87728g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.s */
public final class C87784s implements AbstractC87774m {

    /* renamed from: a */
    private final Context f199387a;

    /* renamed from: b */
    private final File f199388b;

    /* renamed from: c */
    private final String f199389c;

    /* renamed from: d */
    private final File f199390d;

    /* renamed from: e */
    private C87779r f199391e;

    /* renamed from: f */
    private File f199392f;

    static {
        Covode.recordClassIndex(103782);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87774m
    /* renamed from: a */
    public final int mo142235a() {
        return this.f199391e.mo142243a();
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87774m
    /* renamed from: b */
    public final boolean mo142240b() {
        return this.f199391e.mo142247b();
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87774m
    /* renamed from: d */
    public final List<File> mo142242d() {
        return Arrays.asList(this.f199392f.listFiles());
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87774m
    /* renamed from: c */
    public final List<File> mo142241c() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f199392f.listFiles()) {
            arrayList.add(file);
            if (arrayList.size() > 0) {
                break;
            }
        }
        return arrayList;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87774m
    /* renamed from: a */
    public final void mo142238a(byte[] bArr) {
        this.f199391e.mo142246a(bArr, bArr.length);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87774m
    /* renamed from: a */
    public final boolean mo142239a(int i) {
        if (this.f199391e.mo142243a() + 4 + i <= 8000) {
            return true;
        }
        return false;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87774m
    /* renamed from: a */
    public final void mo142237a(List<File> list) {
        for (File file : list) {
            C87728g.m152671a(this.f199387a, C1764a.m5928a("deleting sent analytics file %s", new Object[]{file.getName()}));
            m152789a(file);
        }
    }

    /* renamed from: a */
    private static boolean m152789a(File file) {
        MethodCollector.m26663i(4846);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(4846);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(4846);
        return delete;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87774m
    /* renamed from: a */
    public final void mo142236a(String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        MethodCollector.m26663i(4838);
        this.f199391e.close();
        File file = this.f199390d;
        File file2 = new File(this.f199392f, str);
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                C87728g.m152678b(fileInputStream);
                C87728g.m152678b(fileOutputStream);
                m152789a(file);
                MethodCollector.m26664o(4838);
                throw th;
            }
            try {
                C87728g.m152673a(fileInputStream, fileOutputStream, new byte[1024]);
                C87728g.m152678b(fileInputStream);
                C87728g.m152678b(fileOutputStream);
                m152789a(file);
                this.f199391e = new C87779r(this.f199390d);
                MethodCollector.m26664o(4838);
            } catch (Throwable th3) {
                th = th3;
                C87728g.m152678b(fileInputStream);
                C87728g.m152678b(fileOutputStream);
                m152789a(file);
                MethodCollector.m26664o(4838);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            fileOutputStream = null;
            C87728g.m152678b(fileInputStream);
            C87728g.m152678b(fileOutputStream);
            m152789a(file);
            MethodCollector.m26664o(4838);
            throw th;
        }
    }

    public C87784s(Context context, File file, String str, String str2) {
        this.f199387a = context;
        this.f199388b = file;
        this.f199389c = str2;
        File file2 = new File(file, str);
        this.f199390d = file2;
        this.f199391e = new C87779r(file2);
        File file3 = new File(file, str2);
        this.f199392f = file3;
        if (!file3.exists()) {
            this.f199392f.mkdirs();
        }
    }
}
