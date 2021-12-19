package com.p2082ss.android.ugc.aweme.p2929fe.method.upload;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.ttuploader.TTMediaDataReader;
import java.io.BufferedInputStream;
import java.io.InputStream;
import p078c.p080b.C1756d;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.i */
public final class C48012i implements TTMediaDataReader {

    /* renamed from: d */
    public static final C48013a f111221d = new C48013a((byte) 0);

    /* renamed from: a */
    public InputStream f111222a;

    /* renamed from: b */
    public BufferedInputStream f111223b;

    /* renamed from: c */
    public final Context f111224c;

    /* renamed from: e */
    private final Uri f111225e;

    /* renamed from: f */
    private final long f111226f;

    static {
        Covode.recordClassIndex(56731);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.i$a */
    public static final class C48013a {
        static {
            Covode.recordClassIndex(56732);
        }

        private C48013a() {
        }

        public /* synthetic */ C48013a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.ttuploader.TTMediaDataReader
    public final int close(int i) {
        C89391z zVar;
        try {
            BufferedInputStream bufferedInputStream = this.f111223b;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
                zVar = C89391z.f203057a;
            } else {
                zVar = null;
            }
            C89379q.m157068constructorimpl(zVar);
            return 0;
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
            return 0;
        }
    }

    @Override // com.p2082ss.ttuploader.TTMediaDataReader
    public final int open(int i) {
        Object obj;
        try {
            obj = C89379q.m157068constructorimpl(C1756d.m5891a(C17867d.m33078a(), this.f111225e));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        InputStream inputStream = (InputStream) obj;
        this.f111222a = inputStream;
        if (inputStream != null) {
            return 1;
        }
        return -1;
    }

    @Override // com.p2082ss.ttuploader.TTMediaDataReader
    public final long getValue(int i, int i2) {
        if (i2 == 0) {
            return this.f111226f;
        }
        return 0;
    }

    public C48012i(Context context, Uri uri, long j) {
        C89219l.m154721d(uri, "");
        this.f111224c = context;
        this.f111225e = uri;
        this.f111226f = j;
    }

    @Override // com.p2082ss.ttuploader.TTMediaDataReader
    public final int read(int i, long j, byte[] bArr, int i2) {
        MethodCollector.m26663i(5437);
        if (this.f111222a == null) {
            MethodCollector.m26664o(5437);
            return -1;
        } else if (j > this.f111226f) {
            MethodCollector.m26664o(5437);
            return 0;
        } else {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f111222a);
            this.f111223b = bufferedInputStream;
            int read = bufferedInputStream.read(bArr);
            MethodCollector.m26664o(5437);
            return read;
        }
    }
}
