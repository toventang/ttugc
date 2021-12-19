package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.b.bl */
public final class C26921bl implements AbstractC26904av {

    /* renamed from: a */
    private final FileChannel f63805a;

    /* renamed from: b */
    private final long f63806b;

    /* renamed from: c */
    private final long f63807c;

    static {
        Covode.recordClassIndex(32396);
    }

    public C26921bl(FileChannel fileChannel, long j, long j2) {
        this.f63805a = fileChannel;
        this.f63806b = j;
        this.f63807c = j2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26904av
    /* renamed from: a */
    public final long mo44590a() {
        return this.f63807c;
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26904av
    /* renamed from: a */
    public final void mo44591a(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.f63805a.map(FileChannel.MapMode.READ_ONLY, this.f63806b + j, (long) i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
