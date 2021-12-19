package com.p2082ss.android.ugc.tools.utils;

import android.app.Application;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1728f;
import p077b.C1731i;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;
import p078c.p083d.C1762a;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tools.utils.h */
public final class C84896h {

    /* renamed from: a */
    public static Application f189731a;

    /* renamed from: b */
    public static boolean f189732b;

    /* renamed from: c */
    public static AbstractC84897a f189733c;

    /* renamed from: d */
    public static final C84896h f189734d = new C84896h();

    /* renamed from: e */
    private static String f189735e = "content";

    /* renamed from: f */
    private static String[] f189736f = {"png", "jpg", "jpeg", "bmp", "heif", "heic"};

    /* renamed from: g */
    private static String[] f189737g = {"gif", "webp"};

    /* renamed from: com.ss.android.ugc.tools.utils.h$a */
    public interface AbstractC84897a {
        static {
            Covode.recordClassIndex(98891);
        }

        /* renamed from: a */
        void mo73250a(int i, String str);
    }

    /* renamed from: com.ss.android.ugc.tools.utils.h$b */
    public interface AbstractC84898b {
        static {
            Covode.recordClassIndex(98892);
        }

        /* renamed from: a */
        void mo96669a(Object obj);
    }

    private C84896h() {
    }

    /* renamed from: a */
    public static final boolean m145864a(String str, AbstractC84898b bVar) {
        boolean z = false;
        if (m145869b(str)) {
            m145860a();
            if (bVar == null) {
                try {
                    z = C1757e.m5913c(f189731a, Uri.parse(str));
                    return z;
                } catch (Exception e) {
                    if (f189733c != null) {
                        Log.getStackTraceString(e);
                    }
                    AbstractC84897a aVar = f189733c;
                    if (aVar == null) {
                        return z;
                    }
                    aVar.mo73250a(9, "path:" + str + ", " + Log.getStackTraceString(e));
                    return z;
                }
            } else {
                C89233z.C89234a aVar2 = new C89233z.C89234a();
                aVar2.element = false;
                Uri parse = Uri.parse(str);
                C1728f fVar = new C1728f();
                C1731i.m5635a((Callable) new CallableC84899c(parse, str)).mo5534a(new C84900d(aVar2, bVar), C1731i.f5564c, fVar.mo5526b());
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC84901e(aVar2, fVar, bVar, parse), 100);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m145866a(String str, boolean z) {
        if (z) {
            return m145877j(m145878k(str));
        }
        return m145877j(m145874g(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x005f A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0066 A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089 A[SYNTHETIC, Splitter:B:48:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008e A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a1 A[SYNTHETIC, Splitter:B:61:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a6 A[Catch:{ Exception -> 0x00aa }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m145865a(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.utils.C84896h.m145865a(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static void m145860a() {
        if (f189731a == null) {
            throw new IllegalArgumentException("invalid application info to set AdapterAndroidRUtils.application");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.utils.h$c */
    public static final class CallableC84899c<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Uri f189738a;

        /* renamed from: b */
        final /* synthetic */ String f189739b;

        static {
            Covode.recordClassIndex(98893);
        }

        CallableC84899c(Uri uri, String str) {
            this.f189738a = uri;
            this.f189739b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() {
            boolean z;
            try {
                z = C1757e.m5913c(C84896h.f189731a, this.f189738a);
            } catch (Exception e) {
                if (C84896h.f189733c != null) {
                    Log.getStackTraceString(e);
                }
                AbstractC84897a aVar = C84896h.f189733c;
                if (aVar != null) {
                    aVar.mo73250a(9, "path:" + this.f189739b + ", " + Log.getStackTraceString(e));
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.utils.h$e */
    public static final class RunnableC84901e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f189742a;

        /* renamed from: b */
        final /* synthetic */ C1728f f189743b;

        /* renamed from: c */
        final /* synthetic */ AbstractC84898b f189744c;

        /* renamed from: d */
        final /* synthetic */ Uri f189745d;

        static {
            Covode.recordClassIndex(98895);
        }

        RunnableC84901e(C89233z.C89234a aVar, C1728f fVar, AbstractC84898b bVar, Uri uri) {
            this.f189742a = aVar;
            this.f189743b = fVar;
            this.f189744c = bVar;
            this.f189745d = uri;
        }

        public final void run() {
            if (!this.f189742a.element) {
                this.f189743b.mo5527c();
                this.f189744c.mo96669a(Boolean.valueOf(new File(C1762a.m5918a(C84896h.f189731a, this.f189745d)).exists()));
            }
        }
    }

    static {
        Covode.recordClassIndex(98890);
    }

    /* renamed from: k */
    private static final String m145878k(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            m145856a(str, options);
            return options.outMimeType;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static File m145858a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.utils.h$d */
    public static final class C84900d<TTaskResult, TContinuationResult> implements AbstractC1729g<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f189740a;

        /* renamed from: b */
        final /* synthetic */ AbstractC84898b f189741b;

        static {
            Covode.recordClassIndex(98894);
        }

        C84900d(C89233z.C89234a aVar, AbstractC84898b bVar) {
            this.f189740a = aVar;
            this.f189741b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ C89391z then(C1731i<Boolean> iVar) {
            this.f189740a.element = true;
            AbstractC84898b bVar = this.f189741b;
            C89219l.m154716b(iVar, "");
            bVar.mo96669a(Boolean.valueOf(C89219l.m154714a((Object) iVar.mo5545d(), (Object) true)));
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public static final Uri m145871d(String str) {
        if (m145869b(str)) {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            return parse;
        }
        Uri parse2 = Uri.parse("file://".concat(String.valueOf(str)));
        C89219l.m154716b(parse2, "");
        return parse2;
    }

    /* renamed from: h */
    public static final String m145875h(String str) {
        m145860a();
        try {
            if (m145869b(str)) {
                return C1757e.m5908b(f189731a, Uri.parse(str));
            }
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(m145874g(str));
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    public static final long m145876i(String str) {
        m145860a();
        try {
            if (m145869b(str)) {
                return C1757e.m5900a(f189731a, Uri.parse(str));
            }
            return new File(str).length();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: j */
    private static boolean m145877j(String str) {
        if (str != null) {
            for (String str2 : f189736f) {
                if (C89361p.m154908a((CharSequence) str, (CharSequence) str2, true)) {
                    return true;
                }
            }
            for (String str3 : f189737g) {
                if (C89361p.m154908a((CharSequence) str, (CharSequence) str3, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final void m145861a(String str) {
        AbstractC84897a aVar = f189733c;
        if (aVar != null) {
            aVar.mo73250a(-2, str);
        }
    }

    /* renamed from: b */
    public static final String m145868b(MediaModel mediaModel) {
        if (mediaModel == null) {
            return "";
        }
        if (m145869b(mediaModel.f134662b)) {
            StringBuilder sb = new StringBuilder();
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            C89219l.m154716b(externalStorageDirectory, "");
            return sb.append(externalStorageDirectory.getPath()).append(File.separator).append(mediaModel.f134663c).append(mediaModel.f134664d).toString();
        }
        String str = mediaModel.f134662b;
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: c */
    public static final ExifInterface m145870c(String str) {
        m145860a();
        try {
            if (m145869b(str) && Build.VERSION.SDK_INT >= 24) {
                ParcelFileDescriptor a = C1756d.m5889a(f189731a, Uri.parse(str), "r");
                C89219l.m154716b(a, "");
                return new ExifInterface(a.getFileDescriptor());
            } else if (str != null) {
                return new ExifInterface(str);
            } else {
                return null;
            }
        } catch (Exception e) {
            if (f189733c != null) {
                Log.getStackTraceString(e);
            }
            AbstractC84897a aVar = f189733c;
            if (aVar != null) {
                aVar.mo73250a(1, "path:" + str + ", " + Log.getStackTraceString(e));
            }
            return null;
        }
    }

    /* renamed from: e */
    public static final MediaMetadataRetriever m145872e(String str) {
        m145860a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (m145869b(str)) {
                mediaMetadataRetriever.setDataSource(f189731a, Uri.parse(str));
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
        } catch (Exception e) {
            if (f189733c != null) {
                Log.getStackTraceString(e);
            }
            AbstractC84897a aVar = f189733c;
            if (aVar != null) {
                aVar.mo73250a(3, "path:" + str + ", " + Log.getStackTraceString(e));
            }
        }
        return mediaMetadataRetriever;
    }

    /* renamed from: f */
    public static final FileInputStream m145873f(String str) {
        MethodCollector.m26663i(10573);
        m145860a();
        try {
            if (m145869b(str)) {
                ParcelFileDescriptor a = C1756d.m5889a(f189731a, Uri.parse(str), "r");
                C89219l.m154716b(a, "");
                FileInputStream fileInputStream = new FileInputStream(a.getFileDescriptor());
                MethodCollector.m26664o(10573);
                return fileInputStream;
            }
            FileInputStream fileInputStream2 = new FileInputStream(str);
            MethodCollector.m26664o(10573);
            return fileInputStream2;
        } catch (Exception e) {
            if (f189733c != null) {
                Log.getStackTraceString(e);
            }
            AbstractC84897a aVar = f189733c;
            if (aVar != null) {
                aVar.mo73250a(4, "path:" + str + ", " + Log.getStackTraceString(e));
            }
            MethodCollector.m26664o(10573);
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m145869b(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            String str3 = f189735e;
            if (parse != null) {
                str2 = parse.getScheme();
            } else {
                str2 = null;
            }
            if (C89219l.m154714a((Object) str3, (Object) str2)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            if (f189733c != null) {
                Log.getStackTraceString(e);
            }
            AbstractC84897a aVar = f189733c;
            if (aVar != null) {
                aVar.mo73250a(0, "path:" + str + ", " + Log.getStackTraceString(e));
            }
        }
    }

    /* renamed from: g */
    public static final String m145874g(String str) {
        String str2;
        m145860a();
        String str3 = "";
        if (m145869b(str)) {
            try {
                str2 = C1757e.m5908b(f189731a, Uri.parse(str));
                C89219l.m154716b(str2, str3);
            } catch (Exception unused) {
                AbstractC84897a aVar = f189733c;
                if (aVar != null) {
                    aVar.mo73250a(-10, "file path:".concat(String.valueOf(str)));
                }
                str2 = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (C89361p.m154908a((CharSequence) str2, (CharSequence) "image", true)) {
                    List<String> b = C89361p.m154915b(str2, new String[]{"image/"});
                    if (b.size() > 1) {
                        return b.get(1);
                    }
                } else if (C89361p.m154908a((CharSequence) str2, (CharSequence) "video", true)) {
                    List<String> b2 = C89361p.m154915b(str2, new String[]{"video/"});
                    if (b2.size() > 1) {
                        return b2.get(1);
                    }
                }
                return str3;
            }
            AbstractC84897a aVar2 = f189733c;
            if (aVar2 != null) {
                aVar2.mo73250a(-10, "file path:".concat(String.valueOf(str)));
            }
            return str3;
        } else if (str == null) {
            return str3;
        } else {
            try {
                String substring = str.substring(C89361p.m154885a((CharSequence) str, ".") + 1, str.length());
                C89219l.m154716b(substring, str3);
                str3 = substring;
                return str3;
            } catch (Exception e) {
                if (f189733c != null) {
                    Log.getStackTraceString(e);
                }
                AbstractC84897a aVar3 = f189733c;
                if (aVar3 == null) {
                    return str3;
                }
                aVar3.mo73250a(5, "path:" + str + ", " + Log.getStackTraceString(e));
                return str3;
            }
        }
    }

    /* renamed from: a */
    public static final boolean m145862a(MediaModel mediaModel) {
        if (mediaModel == null) {
            return false;
        }
        if (!m145877j(m145874g(mediaModel.f134662b)) || !m145877j(mediaModel.f134670j)) {
            return m145866a(mediaModel.f134662b, true);
        }
        return true;
    }

    /* renamed from: a */
    public static final String m145859a(Context context, String str) {
        C89219l.m154721d(context, "");
        if (str == null || !m145869b(str)) {
            return str;
        }
        String b = m145867b(context, str);
        if (m145865a(str, b)) {
            return b;
        }
        AbstractC84897a aVar = f189733c;
        if (aVar == null) {
            return str;
        }
        aVar.mo73250a(-1, "copy file failed path:".concat(String.valueOf(b)));
        return str;
    }

    /* renamed from: b */
    private static String m145867b(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        StringBuilder sb = new StringBuilder();
        File a = m145858a(context);
        C89219l.m154716b(a, "");
        return sb.append(a.getAbsolutePath()).append("/tools/temMedia/").append(str.hashCode()).toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r6 != null) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap m145856a(java.lang.String r9, android.graphics.BitmapFactory.Options r10) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.utils.C84896h.m145856a(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r9 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003d, code lost:
        if (r9 == null) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m145863a(java.io.FileInputStream r9, java.io.FileOutputStream r10) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.utils.C84896h.m145863a(java.io.FileInputStream, java.io.FileOutputStream):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x007d A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0084 A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8 A[SYNTHETIC, Splitter:B:58:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ad A[Catch:{ Exception -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c0 A[SYNTHETIC, Splitter:B:71:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c5 A[Catch:{ Exception -> 0x00c9 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.net.Uri m145857a(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.utils.C84896h.m145857a(android.content.Context, java.lang.String, java.lang.String):android.net.Uri");
    }
}
