package com.p2082ss.android.ugc.aweme.utils;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.utils.bk */
public final class C80250bk {

    /* renamed from: a */
    public static C80253a f179732a;

    /* renamed from: b */
    public static Integer f179733b;

    /* renamed from: com.ss.android.ugc.aweme.utils.bk$a */
    public static class C80253a {

        /* renamed from: a */
        public double f179735a;

        /* renamed from: b */
        public double f179736b;

        static {
            Covode.recordClassIndex(93521);
        }
    }

    static {
        Covode.recordClassIndex(93518);
    }

    /* renamed from: a */
    public static C80253a m139099a() {
        RandomAccessFile randomAccessFile;
        FileNotFoundException e;
        IOException e2;
        C80253a aVar = new C80253a();
        RandomAccessFile randomAccessFile2 = null;
        try {
            String valueOf = String.valueOf(Process.myPid());
            RandomAccessFile randomAccessFile3 = new RandomAccessFile("/proc/stat", "r");
            try {
                String[] split = randomAccessFile3.readLine().split(" ");
                double d = 0.0d;
                int length = split.length;
                for (int i = 2; i < length; i++) {
                    d += Double.parseDouble(split[i]);
                }
                randomAccessFile = new RandomAccessFile("/proc/" + valueOf + "/stat", "r");
                try {
                    String[] split2 = randomAccessFile.readLine().split(" ");
                    aVar.f179735a = Double.parseDouble(split2[13]) + Double.parseDouble(split2[14]) + Double.parseDouble(split2[15]) + Double.parseDouble(split2[16]);
                    aVar.f179736b = d;
                    m139100a(randomAccessFile3);
                } catch (FileNotFoundException e3) {
                    e = e3;
                    randomAccessFile2 = randomAccessFile3;
                    e.printStackTrace();
                    m139100a(randomAccessFile2);
                    m139100a(randomAccessFile);
                    return aVar;
                } catch (IOException e4) {
                    e2 = e4;
                    randomAccessFile2 = randomAccessFile3;
                    try {
                        e2.printStackTrace();
                        m139100a(randomAccessFile2);
                        m139100a(randomAccessFile);
                        return aVar;
                    } catch (Throwable th) {
                        m139100a(randomAccessFile2);
                        m139100a(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable unused) {
                    randomAccessFile2 = randomAccessFile3;
                    m139100a(randomAccessFile2);
                    m139100a(randomAccessFile);
                    return aVar;
                }
            } catch (FileNotFoundException e5) {
                e = e5;
                randomAccessFile = null;
                randomAccessFile2 = randomAccessFile3;
                e.printStackTrace();
                m139100a(randomAccessFile2);
                m139100a(randomAccessFile);
                return aVar;
            } catch (IOException e6) {
                e2 = e6;
                randomAccessFile = null;
                randomAccessFile2 = randomAccessFile3;
                e2.printStackTrace();
                m139100a(randomAccessFile2);
                m139100a(randomAccessFile);
                return aVar;
            } catch (Throwable unused2) {
                randomAccessFile = null;
                randomAccessFile2 = randomAccessFile3;
                m139100a(randomAccessFile2);
                m139100a(randomAccessFile);
                return aVar;
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            randomAccessFile = null;
            e.printStackTrace();
            m139100a(randomAccessFile2);
            m139100a(randomAccessFile);
            return aVar;
        } catch (IOException e8) {
            e2 = e8;
            randomAccessFile = null;
            e2.printStackTrace();
            m139100a(randomAccessFile2);
            m139100a(randomAccessFile);
            return aVar;
        } catch (Throwable unused3) {
            randomAccessFile = null;
            m139100a(randomAccessFile2);
            m139100a(randomAccessFile);
            return aVar;
        }
        m139100a(randomAccessFile);
        return aVar;
    }

    /* renamed from: a */
    private static void m139100a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m139101a(final boolean z) {
        C1731i.m5640b(new Callable<C80253a>() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80250bk.CallableC802522 */

            static {
                Covode.recordClassIndex(93520);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C80253a call() {
                return C80250bk.m139099a();
            }
        }, C1731i.f5562a).mo5534a(new AbstractC1729g<C80253a, Void>() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80250bk.C802511 */

            static {
                Covode.recordClassIndex(93519);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Void then(C1731i<C80253a> iVar) {
                if (iVar.mo5545d() == null) {
                    return null;
                }
                if (!(!z || C80250bk.f179732a == null || iVar.mo5545d().f179736b == C80250bk.f179732a.f179736b)) {
                    C80250bk.f179733b = Integer.valueOf((int) (((iVar.mo5545d().f179735a - C80250bk.f179732a.f179735a) * 100.0d) / (iVar.mo5545d().f179736b - C80250bk.f179732a.f179736b)));
                }
                C80250bk.f179732a = iVar.mo5545d();
                return null;
            }
        }, C1731i.f5564c, null);
    }
}
