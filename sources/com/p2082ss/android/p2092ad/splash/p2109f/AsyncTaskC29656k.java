package com.p2082ss.android.p2092ad.splash.p2109f;

import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.C29628x;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.ss.android.ad.splash.f.k */
public final class AsyncTaskC29656k extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    private String f70729a;

    /* renamed from: b */
    private boolean f70730b;

    /* renamed from: c */
    private long f70731c;

    /* renamed from: d */
    private MessageDigest f70732d;

    /* renamed from: e */
    private long f70733e = -1;

    /* renamed from: f */
    private int f70734f;

    static {
        Covode.recordClassIndex(36052);
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        super.onCancelled();
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        super.onPreExecute();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0188, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x018a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x018c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x018e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0190, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0192, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0194, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0196, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0198, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r6.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0205 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[ExcHandler: all (unused java.lang.Throwable), SYNTHETIC, Splitter:B:9:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0205 A[PHI: r4 
      PHI: (r4v8 int) = (r4v9 int), (r4v10 int), (r4v10 int), (r4v10 int), (r4v10 int), (r4v10 int), (r4v10 int) binds: [B:73:0x0204, B:62:0x01d4, B:63:?, B:64:0x01e2, B:65:?, B:66:0x01eb, B:67:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:75:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0236  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Void m59758a() {
        /*
        // Method dump skipped, instructions count: 668
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.p2109f.AsyncTaskC29656k.m59758a():java.lang.Void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Void[] voidArr) {
        super.onProgressUpdate(voidArr);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ Void doInBackground(Void[] voidArr) {
        return m59758a();
    }

    /* renamed from: a */
    private final boolean m59759a(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[10];
        byte[] bArr4 = new byte[8];
        byte[] bArr5 = new byte[232];
        byte[] bArr6 = new byte[23];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0:
        while (true) {
            bArr2[i] = bArr[i];
            int i6 = i2 + 1;
            bArr6[i2] = bArr[i];
            while (true) {
                i2 = i6;
                while (true) {
                    i++;
                    if (i >= 255) {
                        break loop0;
                    } else if (i >= 4) {
                        if (i == 4) {
                            break;
                        } else if (i < 15) {
                            bArr3[i3] = bArr[i];
                            bArr6[i2] = bArr[i];
                            i2++;
                            i3++;
                        } else if (i < 23) {
                            bArr4[i5] = bArr[i];
                            bArr6[i2] = bArr[i];
                            i2++;
                            i5++;
                        } else {
                            bArr5[i4] = bArr[i];
                            i4++;
                        }
                    }
                }
                i6 = i2 + 1;
                bArr6[i2] = bArr[i];
            }
        }
        byte[] digest = this.f70732d.digest(bArr6);
        if (!Arrays.equals(digest, Arrays.copyOfRange(bArr5, 0, digest.length))) {
            return true;
        }
        String valueOf = String.valueOf(this.f70731c);
        int i7 = 0;
        for (int i8 = 0; i8 < valueOf.length(); i8++) {
            int numericValue = Character.getNumericValue(valueOf.charAt(i8));
            if (numericValue > 10) {
                return true;
            }
            i7 += bArr3[numericValue] & 255;
        }
        C29628x.m59641a().mo51919a(ByteBuffer.wrap(bArr4).getLong());
        C29644g.m59688b("sum: ".concat(String.valueOf(i7)));
        if (i7 % 10 > 4) {
            return true;
        }
        return false;
    }

    public AsyncTaskC29656k(String str, int i) {
        if (i > 0) {
            this.f70734f = i;
        } else if (C29495h.m59102b() != null) {
            this.f70734f = Integer.parseInt(C29495h.m59102b().mo51563a());
        }
        this.f70729a = str;
        this.f70730b = false;
    }
}
