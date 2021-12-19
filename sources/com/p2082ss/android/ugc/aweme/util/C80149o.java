package com.p2082ss.android.ugc.aweme.util;

import android.content.Context;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.core.p036g.C0692e;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.AbstractC29839b;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.p2133d.C29856d;
import com.p2082ss.android.p2133d.C29858f;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.o */
public final class C80149o {

    /* renamed from: a */
    public final String f179571a = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();

    /* renamed from: b */
    public WeakReference<Context> f179572b;

    /* renamed from: c */
    public CountDownLatch f179573c = new CountDownLatch(1);

    /* renamed from: d */
    public boolean f179574d;

    /* renamed from: e */
    public Throwable f179575e;

    /* renamed from: com.ss.android.ugc.aweme.util.o$a */
    public interface AbstractC80152a {
        static {
            Covode.recordClassIndex(93396);
        }

        /* renamed from: a */
        void mo123600a();

        /* renamed from: a */
        void mo109545a(String str);

        /* renamed from: b */
        void mo123601b();
    }

    static {
        Covode.recordClassIndex(93393);
    }

    public C80149o(WeakReference<Context> weakReference) {
        this.f179572b = weakReference;
    }

    /* renamed from: a */
    public final C0692e<Boolean, String> mo123598a(final String str, final AbstractC80152a aVar) {
        MethodCollector.m26663i(4157);
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            new RuntimeException("Image url is empty.");
            aVar.mo123601b();
            C0692e<Boolean, String> eVar = new C0692e<>(false, null);
            MethodCollector.m26664o(4157);
            return eVar;
        }
        aVar.mo123600a();
        final String str3 = C13607d.m24442b(str) + ".png";
        String path = new File(this.f179571a, str3).getPath();
        if (C80720e.m139927b(path)) {
            this.f179574d = true;
        }
        if (!this.f179574d) {
            C29339a.m58752a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.util.C80149o.RunnableC801501 */

                static {
                    Covode.recordClassIndex(93394);
                }

                public final void run() {
                    try {
                        if (C80149o.this.f179572b.get() != null) {
                            C80149o oVar = C80149o.this;
                            String str = str;
                            String str2 = C80149o.this.f179571a;
                            String str3 = str3;
                            oVar.f179574d = C29856d.m60162a(oVar.f179572b.get(), C29858f.extractImageUrlList(str, null), str2, str3, new AbstractC29839b<String>() {
                                /* class com.p2082ss.android.ugc.aweme.util.C80149o.RunnableC801501.C801511 */

                                static {
                                    Covode.recordClassIndex(93395);
                                }
                            }, str3);
                        } else {
                            C80149o.this.f179575e = new RuntimeException("Context is null");
                            C80149o.this.f179574d = false;
                        }
                    } catch (Throwable th) {
                        C80149o.this.f179573c.countDown();
                        throw th;
                    }
                    C80149o.this.f179573c.countDown();
                }
            });
            try {
                this.f179573c.await();
            } catch (InterruptedException unused) {
            }
        }
        if (this.f179574d && !TextUtils.isEmpty(path) && this.f179572b.get() != null) {
            File file = new File(path);
            Context context = this.f179572b.get();
            C89219l.m154721d(file, "");
            C89219l.m154721d(context, "");
            try {
                ParcelFileDescriptor openFileDescriptor = C17867d.m33078a().getContentResolver().openFileDescriptor(C1757e.m5903a(context, file.getName(), "image/*", Environment.DIRECTORY_PICTURES + "/tiktok/"), "w");
                if (openFileDescriptor != null) {
                    C1756d.m5893a(file, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                }
            } catch (Throwable unused2) {
            }
        }
        if (this.f179574d) {
            aVar.mo109545a(path);
        } else {
            aVar.mo123601b();
        }
        Boolean valueOf = Boolean.valueOf(this.f179574d);
        if (this.f179574d) {
            str2 = path;
        }
        C0692e<Boolean, String> eVar2 = new C0692e<>(valueOf, str2);
        this.f179574d = false;
        MethodCollector.m26664o(4157);
        return eVar2;
    }
}
