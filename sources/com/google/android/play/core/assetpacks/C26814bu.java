package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.common.C26971b;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1963b.C26958r;
import com.google.android.play.core.tasks.AbstractC27062d;
import com.google.android.play.core.tasks.C27064f;
import com.google.android.play.core.tasks.C27071m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.play.core.assetpacks.bu */
final class C26814bu implements AbstractC26857dj {

    /* renamed from: a */
    static final C26909b f63589a = new C26909b("FakeAssetPackService");

    /* renamed from: i */
    private static final AtomicInteger f63590i = new AtomicInteger(1);

    /* renamed from: b */
    final C26878w f63591b;

    /* renamed from: c */
    final Context f63592c;

    /* renamed from: d */
    final C26827cg f63593d;

    /* renamed from: e */
    final Handler f63594e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private final String f63595f;

    /* renamed from: g */
    private final C26791ay f63596g;

    /* renamed from: h */
    private final AbstractC26916bg<Executor> f63597h;

    static {
        Covode.recordClassIndex(32289);
    }

    C26814bu(File file, C26878w wVar, C26791ay ayVar, Context context, C26827cg cgVar, AbstractC26916bg<Executor> bgVar) {
        this.f63595f = file.getAbsolutePath();
        this.f63591b = wVar;
        this.f63596g = ayVar;
        this.f63592c = context;
        this.f63593d = cgVar;
        this.f63597h = bgVar;
    }

    /* renamed from: a */
    static String m53253a(File file) {
        try {
            return C26816bw.m53266a(Arrays.asList(file));
        } catch (NoSuchAlgorithmException e) {
            throw new C26971b("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new C26971b(C1764a.m5928a("Could not digest file: %s.", new Object[]{file}), e2);
        }
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final AbstractC27062d<List<String>> mo44502a(Map<String, Long> map) {
        f63589a.mo44598d("syncPacks()", new Object[0]);
        return C27064f.m53801a(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final void mo44503a() {
        f63589a.mo44598d("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final void mo44504a(int i) {
        f63589a.mo44598d("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final void mo44505a(int i, String str) {
        f63589a.mo44598d("notifyModuleCompleted", new Object[0]);
        this.f63597h.mo44603a().execute(new RunnableC26811br(this, i, str));
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final void mo44506a(int i, String str, String str2, int i2) {
        f63589a.mo44598d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: a */
    public final void mo44507a(List<String> list) {
        f63589a.mo44598d("cancelDownload(%s)", list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File[] mo44508a(String str) {
        File file = new File(this.f63595f);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C26812bs(str));
            if (listFiles != null) {
                int length = listFiles.length;
                if (length != 0) {
                    int i = 0;
                    while (!C26958r.m53561a(listFiles[i]).equals(str)) {
                        i++;
                        if (i >= length) {
                            throw new C26971b(C1764a.m5928a("No master slice available for pack '%s'.", new Object[]{str}));
                        }
                    }
                    return listFiles;
                }
                throw new C26971b(C1764a.m5928a("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new C26971b(C1764a.m5928a("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new C26971b(C1764a.m5928a("Local testing directory '%s' not found.", new Object[]{file}));
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26857dj
    /* renamed from: b */
    public final AbstractC27062d<ParcelFileDescriptor> mo44509b(int i, String str, String str2, int i2) {
        f63589a.mo44598d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C27071m mVar = new C27071m();
        try {
            File[] a = mo44508a(str);
            for (File file : a) {
                if (C26958r.m53561a(file).equals(str2)) {
                    mVar.f64055a.mo44788a(ParcelFileDescriptor.open(file, 268435456));
                    return mVar.f64055a;
                }
            }
            throw new C26971b(C1764a.m5928a("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f63589a.mo44599e("getChunkFileDescriptor failed", e);
            mVar.mo44782a((Exception) new C26971b("Asset Slice file not found.", e));
        } catch (C26971b e2) {
            f63589a.mo44599e("getChunkFileDescriptor failed", e2);
            mVar.mo44782a((Exception) e2);
        }
    }
}
