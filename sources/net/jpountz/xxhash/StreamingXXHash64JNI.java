package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import net.jpountz.xxhash.StreamingXXHash64;

final class StreamingXXHash64JNI extends StreamingXXHash64 {
    private long state;

    static {
        Covode.recordClassIndex(106117);
    }

    static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        Factory() {
        }

        static {
            Covode.recordClassIndex(106118);
        }

        @Override // net.jpountz.xxhash.StreamingXXHash64.Factory
        public StreamingXXHash64 newStreamingHash(long j) {
            return new StreamingXXHash64JNI(j);
        }
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        MethodCollector.m26663i(8389);
        super.finalize();
        XXHashJNI.XXH64_free(this.state);
        this.state = 0;
        MethodCollector.m26664o(8389);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final long getValue() {
        MethodCollector.m26663i(8240);
        checkState();
        long XXH64_digest = XXHashJNI.XXH64_digest(this.state);
        MethodCollector.m26664o(8240);
        return XXH64_digest;
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final void reset() {
        MethodCollector.m26663i(8100);
        checkState();
        XXHashJNI.XXH64_free(this.state);
        this.state = XXHashJNI.XXH64_init(this.seed);
        MethodCollector.m26664o(8100);
    }

    StreamingXXHash64JNI(long j) {
        super(j);
        MethodCollector.m26663i(8098);
        this.state = XXHashJNI.XXH64_init(j);
        MethodCollector.m26664o(8098);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final void update(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(8387);
        checkState();
        XXHashJNI.XXH64_update(this.state, bArr, i, i2);
        MethodCollector.m26664o(8387);
    }
}
