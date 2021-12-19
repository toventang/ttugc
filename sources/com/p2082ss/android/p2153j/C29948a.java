package com.p2082ss.android.p2153j;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.ss.android.j.a */
public final class C29948a implements AbstractC29949b {

    /* renamed from: a */
    private final RandomAccessFile f71436a;

    static {
        Covode.recordClassIndex(36361);
    }

    @Override // com.p2082ss.android.p2153j.AbstractC29949b
    /* renamed from: b */
    public final void mo52277b() {
        this.f71436a.close();
    }

    @Override // com.p2082ss.android.p2153j.AbstractC29949b
    /* renamed from: a */
    public final long mo52275a() {
        return this.f71436a.length();
    }

    public C29948a(File file) {
        this.f71436a = new RandomAccessFile(file, "r");
    }

    @Override // com.p2082ss.android.p2153j.AbstractC29949b
    /* renamed from: a */
    public final void mo52276a(long j) {
        this.f71436a.seek(j);
    }

    @Override // com.p2082ss.android.p2153j.AbstractC29949b
    /* renamed from: a */
    public final int mo52274a(byte[] bArr, int i) {
        return this.f71436a.read(bArr, 0, i);
    }
}
