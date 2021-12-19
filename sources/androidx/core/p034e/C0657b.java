package androidx.core.p034e;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p032a.C0629c;
import androidx.core.content.p032a.C0637f;
import androidx.core.graphics.C0715e;
import androidx.core.graphics.C0725l;
import androidx.core.p034e.C0665c;
import androidx.core.p036g.C0697g;
import androidx.p025c.C0490e;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.e.b */
public final class C0657b {

    /* renamed from: a */
    static final C0490e<String, Typeface> f2660a = new C0490e<>(16);

    /* renamed from: b */
    static final Object f2661b = new Object();

    /* renamed from: c */
    static final C0497g<String, ArrayList<C0665c.AbstractC0670a<C0664c>>> f2662c = new C0497g<>();

    /* renamed from: d */
    private static final C0665c f2663d = new C0665c("fonts");

    /* renamed from: e */
    private static final Comparator<byte[]> f2664e = new Comparator<byte[]>() {
        /* class androidx.core.p034e.C0657b.C06614 */

        static {
            Covode.recordClassIndex(740);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length != bArr4.length) {
                int length = bArr3.length;
                i2 = bArr4.length;
                i = length;
            } else {
                for (int i3 = 0; i3 < bArr3.length; i3++) {
                    if (bArr3[i3] != bArr4[i3]) {
                        byte b = bArr3[i3];
                        i2 = bArr4[i3];
                        i = b;
                    }
                }
                return 0;
            }
            return (i == 1 ? 1 : 0) - (i2 == 1 ? 1 : 0);
        }
    };

    /* renamed from: a */
    private static C0663b[] m2401a(Context context, C0656a aVar, String str) {
        Uri uri;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i = Build.VERSION.SDK_INT;
            Cursor query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f2656c}, null, null);
            if (query != null) {
                if (query.getCount() > 0) {
                    int columnIndex = query.getColumnIndex("result_code");
                    arrayList = new ArrayList();
                    int columnIndex2 = query.getColumnIndex("_id");
                    int columnIndex3 = query.getColumnIndex("file_id");
                    int columnIndex4 = query.getColumnIndex("font_ttc_index");
                    int columnIndex5 = query.getColumnIndex("font_weight");
                    int columnIndex6 = query.getColumnIndex("font_italic");
                    while (query.moveToNext()) {
                        int i2 = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                        int i3 = columnIndex4 != -1 ? query.getInt(columnIndex4) : 0;
                        if (columnIndex3 == -1) {
                            uri = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                        } else {
                            uri = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                        }
                        arrayList.add(new C0663b(uri, i3, columnIndex5 != -1 ? query.getInt(columnIndex5) : 400, columnIndex6 != -1 && query.getInt(columnIndex6) == 1, i2));
                    }
                }
                query.close();
            }
            return (C0663b[]) arrayList.toArray(new C0663b[0]);
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    static {
        Covode.recordClassIndex(736);
    }

    /* renamed from: a */
    private static List<byte[]> m2398a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: androidx.core.e.b$a */
    public static class C0662a {

        /* renamed from: a */
        public final int f2672a;

        /* renamed from: b */
        public final C0663b[] f2673b;

        static {
            Covode.recordClassIndex(741);
        }

        public C0662a(int i, C0663b[] bVarArr) {
            this.f2672a = i;
            this.f2673b = bVarArr;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.e.b$c */
    public static final class C0664c {

        /* renamed from: a */
        final Typeface f2679a;

        /* renamed from: b */
        final int f2680b;

        static {
            Covode.recordClassIndex(743);
        }

        C0664c(Typeface typeface, int i) {
            this.f2679a = typeface;
            this.f2680b = i;
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m2397a(C0656a aVar, Resources resources) {
        if (aVar.f2657d != null) {
            return aVar.f2657d;
        }
        return C0629c.m2338a(resources, aVar.f2658e);
    }

    /* renamed from: a */
    public static C0662a m2395a(Context context, C0656a aVar) {
        ProviderInfo a = m2393a(context.getPackageManager(), aVar, context.getResources());
        if (a == null) {
            return new C0662a(1, null);
        }
        return new C0662a(0, m2401a(context, aVar, a.authority));
    }

    /* renamed from: a */
    private static boolean m2400a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static ProviderInfo m2393a(PackageManager packageManager, C0656a aVar, Resources resources) {
        String str = aVar.f2654a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(String.valueOf(str)));
        } else if (resolveContentProvider.packageName.equals(aVar.f2655b)) {
            List<byte[]> a = m2398a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f2664e);
            List<List<byte[]>> a2 = m2397a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList(a2.get(i));
                Collections.sort(arrayList, f2664e);
                if (m2400a(a, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + aVar.f2655b);
        }
    }

    /* renamed from: a */
    static C0664c m2396a(Context context, C0656a aVar, int i) {
        try {
            C0662a a = m2395a(context, aVar);
            int i2 = -3;
            if (a.f2672a == 0) {
                Typeface a2 = C0715e.m2526a(context, a.f2673b, i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0664c(a2, i2);
            }
            if (a.f2672a == 1) {
                i2 = -2;
            }
            return new C0664c(null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0664c(null, -1);
        }
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m2399a(Context context, C0663b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0663b bVar : bVarArr) {
            if (bVar.f2678e == 0) {
                Uri uri = bVar.f2674a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0725l.m2576a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: androidx.core.e.b$b */
    public static class C0663b {

        /* renamed from: a */
        public final Uri f2674a;

        /* renamed from: b */
        public final int f2675b;

        /* renamed from: c */
        public final int f2676c;

        /* renamed from: d */
        public final boolean f2677d;

        /* renamed from: e */
        public final int f2678e;

        static {
            Covode.recordClassIndex(742);
        }

        public C0663b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f2674a = (Uri) C0697g.m2452a(uri);
            this.f2675b = i;
            this.f2676c = i2;
            this.f2677d = z;
            this.f2678e = i3;
        }
    }

    /* renamed from: a */
    public static Typeface m2394a(final Context context, final C0656a aVar, final C0637f.AbstractC0638a aVar2, Handler handler, boolean z, int i, final int i2) {
        C06592 r3;
        final String str = aVar.f2659f + "-" + i2;
        Typeface a = f2660a.mo2091a(str);
        if (a != null) {
            if (aVar2 != null) {
                aVar2.mo2006a(a);
            }
            return a;
        } else if (!z || i != -1) {
            CallableC06581 r4 = new Callable<C0664c>() {
                /* class androidx.core.p034e.C0657b.CallableC06581 */

                static {
                    Covode.recordClassIndex(737);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ C0664c call() {
                    C0664c a = C0657b.m2396a(context, aVar, i2);
                    if (a.f2679a != null) {
                        C0657b.f2660a.mo2092a(str, a.f2679a);
                    }
                    return a;
                }
            };
            if (z) {
                try {
                    return ((C0664c) f2663d.mo2688a(r4, i)).f2679a;
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                if (aVar2 == null) {
                    r3 = null;
                } else {
                    r3 = new C0665c.AbstractC0670a<C0664c>(null) {
                        /* class androidx.core.p034e.C0657b.C06592 */

                        static {
                            Covode.recordClassIndex(738);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // androidx.core.p034e.C0665c.AbstractC0670a
                        /* renamed from: a */
                        public final /* bridge */ /* synthetic */ void mo2686a(C0664c cVar) {
                            C0664c cVar2 = cVar;
                            if (cVar2 == null) {
                                C0637f.AbstractC0638a.this.mo2671a(1, null);
                            } else if (cVar2.f2680b == 0) {
                                C0637f.AbstractC0638a.this.mo2672a(cVar2.f2679a, null);
                            } else {
                                C0637f.AbstractC0638a.this.mo2671a(cVar2.f2680b, null);
                            }
                        }
                    };
                }
                synchronized (f2661b) {
                    C0497g<String, ArrayList<C0665c.AbstractC0670a<C0664c>>> gVar = f2662c;
                    ArrayList<C0665c.AbstractC0670a<C0664c>> arrayList = gVar.get(str);
                    if (arrayList != null) {
                        if (r3 != null) {
                            arrayList.add(r3);
                        }
                        return null;
                    }
                    if (r3 != null) {
                        ArrayList<C0665c.AbstractC0670a<C0664c>> arrayList2 = new ArrayList<>();
                        arrayList2.add(r3);
                        gVar.put(str, arrayList2);
                    }
                    C0665c cVar = f2663d;
                    cVar.mo2689a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0097: INVOKE  
                          (r3v2 'cVar' androidx.core.e.c)
                          (wrap: androidx.core.e.c$2 : 0x0094: CONSTRUCTOR  (r0v10 androidx.core.e.c$2) = 
                          (r3v2 'cVar' androidx.core.e.c)
                          (r4v0 'r4' androidx.core.e.b$1)
                          (wrap: android.os.Handler : 0x008f: CONSTRUCTOR  (r1v3 android.os.Handler) =  call: android.os.Handler.<init>():void type: CONSTRUCTOR)
                          (wrap: androidx.core.e.b$3 : 0x008a: CONSTRUCTOR  (r2v1 androidx.core.e.b$3) = (r6v0 'str' java.lang.String A[SKIP_ARG]) call: androidx.core.e.b.3.<init>(java.lang.String):void type: CONSTRUCTOR)
                         call: androidx.core.e.c.2.<init>(androidx.core.e.c, java.util.concurrent.Callable, android.os.Handler, androidx.core.e.c$a):void type: CONSTRUCTOR)
                         type: VIRTUAL call: androidx.core.e.c.a(java.lang.Runnable):void in method: androidx.core.e.b.a(android.content.Context, androidx.core.e.a, androidx.core.content.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0094: CONSTRUCTOR  (r0v10 androidx.core.e.c$2) = 
                          (r3v2 'cVar' androidx.core.e.c)
                          (r4v0 'r4' androidx.core.e.b$1)
                          (wrap: android.os.Handler : 0x008f: CONSTRUCTOR  (r1v3 android.os.Handler) =  call: android.os.Handler.<init>():void type: CONSTRUCTOR)
                          (wrap: androidx.core.e.b$3 : 0x008a: CONSTRUCTOR  (r2v1 androidx.core.e.b$3) = (r6v0 'str' java.lang.String A[SKIP_ARG]) call: androidx.core.e.b.3.<init>(java.lang.String):void type: CONSTRUCTOR)
                         call: androidx.core.e.c.2.<init>(androidx.core.e.c, java.util.concurrent.Callable, android.os.Handler, androidx.core.e.c$a):void type: CONSTRUCTOR in method: androidx.core.e.b.a(android.content.Context, androidx.core.e.a, androidx.core.content.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 37 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.core.e.c, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 43 more
                        */
                    /*
                    // Method dump skipped, instructions count: 158
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.core.p034e.C0657b.m2394a(android.content.Context, androidx.core.e.a, androidx.core.content.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
                }
            }
