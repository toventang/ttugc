package com.bytedance.lottie.p1503d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.C21094h;
import com.bytedance.lottie.C21122n;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.lottie.d.c */
public final class C21040c {

    /* renamed from: a */
    final String f49923a;

    /* renamed from: b */
    final C21039b f49924b;

    /* renamed from: c */
    private final Context f49925c;

    static {
        Covode.recordClassIndex(24656);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C21122n<C21088g> mo34518a() {
        try {
            return m39618b();
        } catch (IOException e) {
            return new C21122n<>(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lottie.d.c$3 */
    public static /* synthetic */ class C210433 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49929a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 24659(0x6053, float:3.4555E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.d.a[] r0 = com.bytedance.lottie.p1503d.EnumC21038a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.p1503d.C21040c.C210433.f49929a = r2
                com.bytedance.lottie.d.a r0 = com.bytedance.lottie.p1503d.EnumC21038a.Zip     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.p1503d.C21040c.C210433.f49929a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.d.a r0 = com.bytedance.lottie.p1503d.EnumC21038a.Json     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.p1503d.C21040c.C210433.<clinit>():void");
        }
    }

    /* renamed from: b */
    private C21122n m39618b() {
        EnumC21038a aVar;
        C21122n<C21088g> a;
        MethodCollector.m26663i(10535);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.f49923a.endsWith(".json")) {
            aVar = EnumC21038a.Json;
        } else {
            aVar = EnumC21038a.Zip;
        }
        String a2 = C21039b.m39615a(this.f49923a, aVar, true);
        Downloader.with(this.f49925c).url(this.f49923a).name(a2).savePath(m39617a(this.f49925c).getAbsolutePath()).mainThreadListener(new AbsDownloadListener() {
            /* class com.bytedance.lottie.p1503d.C21040c.C210422 */

            static {
                Covode.recordClassIndex(24658);
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                countDownLatch.countDown();
            }

            @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                countDownLatch.countDown();
            }
        }).download();
        try {
            countDownLatch.await(3, TimeUnit.SECONDS);
            File file = new File(m39617a(this.f49925c).getAbsolutePath(), a2);
            if (C210433.f49929a[aVar.ordinal()] != 1) {
                a = C21094h.m39737a((InputStream) new FileInputStream(new File(file.getAbsolutePath())), this.f49923a, true);
            } else {
                a = C21094h.m39738a(new ZipInputStream(new FileInputStream(file)), this.f49923a);
            }
            if (a.f50100a != null) {
                C21039b bVar = this.f49924b;
                File file2 = new File(C21039b.m39614a(bVar.f49921a), C21039b.m39615a(bVar.f49922b, aVar, true));
                File file3 = new File(file2.getAbsolutePath().replace(".temp", ""));
                if (!file2.renameTo(file3)) {
                    C21044e.m39620a("Unable to rename cache file " + file2.getAbsolutePath() + " to " + file3.getAbsolutePath() + ".");
                }
            }
            MethodCollector.m26664o(10535);
            return a;
        } catch (InterruptedException unused) {
            C21122n nVar = new C21122n((Throwable) new IllegalArgumentException("Unable to fetch " + this.f49923a));
            MethodCollector.m26664o(10535);
            return nVar;
        }
    }

    /* renamed from: a */
    private static File m39617a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    public C21040c(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f49925c = applicationContext;
        this.f49923a = str;
        this.f49924b = new C21039b(applicationContext, str);
    }
}
