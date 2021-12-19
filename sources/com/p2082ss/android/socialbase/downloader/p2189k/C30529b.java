package com.p2082ss.android.socialbase.downloader.p2189k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2153j.AbstractC29949b;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.ss.android.socialbase.downloader.k.b */
public final class C30529b implements AbstractC29949b {

    /* renamed from: a */
    private final FileInputStream f72828a;

    /* renamed from: b */
    private final FileChannel f72829b;

    /* renamed from: c */
    private final ByteBuffer f72830c = ByteBuffer.allocate(8192);

    static {
        Covode.recordClassIndex(37057);
    }

    @Override // com.p2082ss.android.p2153j.AbstractC29949b
    /* renamed from: a */
    public final long mo52275a() {
        return this.f72829b.size();
    }

    @Override // com.p2082ss.android.p2153j.AbstractC29949b
    /* renamed from: b */
    public final void mo52277b() {
        C30535g.m62556a(this.f72829b, this.f72828a);
    }

    @Override // com.p2082ss.android.p2153j.AbstractC29949b
    /* renamed from: a */
    public final void mo52276a(long j) {
        this.f72829b.position(j);
    }

    public C30529b(FileInputStream fileInputStream) {
        this.f72828a = fileInputStream;
        this.f72829b = fileInputStream.getChannel();
    }

    @Override // com.p2082ss.android.p2153j.AbstractC29949b
    /* renamed from: a */
    public final int mo52274a(byte[] bArr, int i) {
        int read = this.f72829b.read(this.f72830c);
        if (read != -1) {
            this.f72830c.flip();
            this.f72830c.get(bArr, 0, read);
            this.f72830c.clear();
        }
        return read;
    }
}
