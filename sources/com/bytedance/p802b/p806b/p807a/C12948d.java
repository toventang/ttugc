package com.bytedance.p802b.p806b.p807a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.bytedance.b.b.a.d */
public final class C12948d {

    /* renamed from: a */
    private MappedByteBuffer f31530a;

    /* renamed from: b */
    private long f31531b;

    static {
        Covode.recordClassIndex(14784);
    }

    /* renamed from: com.bytedance.b.b.a.d$a */
    static class C12949a {

        /* renamed from: a */
        public static final C12948d f31532a = new C12948d();

        static {
            Covode.recordClassIndex(14785);
        }
    }

    /* renamed from: a */
    public final long mo20799a() {
        if (this.f31530a == null) {
            try {
                File file = new File(C12930b.m23206a(), C13037a.m23436d().replace(".", "_").replace(":", "-") + "_seq_num.txt");
                boolean exists = file.exists();
                if (!exists) {
                    file.createNewFile();
                }
                MappedByteBuffer map = new RandomAccessFile(file, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, 8);
                this.f31530a = map;
                if (!exists) {
                    map.putLong(0, 0);
                    return 0;
                }
            } catch (Throwable th) {
                C13118b.m23587a(C12927a.f31456a, "prepare seq_number fail.", th);
            }
        }
        MappedByteBuffer mappedByteBuffer = this.f31530a;
        if (mappedByteBuffer != null) {
            long j = mappedByteBuffer.getLong(0) + 1;
            this.f31531b = j;
            this.f31530a.putLong(0, j);
            return this.f31531b;
        }
        long j2 = this.f31531b;
        this.f31531b = 1 + j2;
        return j2;
    }
}
