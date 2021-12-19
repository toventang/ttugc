package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import net.jpountz.xxhash.StreamingXXHash32;

final class StreamingXXHash32JNI extends StreamingXXHash32 {
    private long state;

    static {
        Covode.recordClassIndex(106108);
    }

    static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        Factory() {
        }

        static {
            Covode.recordClassIndex(106109);
        }

        @Override // net.jpountz.xxhash.StreamingXXHash32.Factory
        public StreamingXXHash32 newStreamingHash(int i) {
            return new StreamingXXHash32JNI(i);
        }
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        MethodCollector.m26663i(8843);
        super.finalize();
        XXHashJNI.XXH32_free(this.state);
        this.state = 0;
        MethodCollector.m26664o(8843);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public final int getValue() {
        MethodCollector.m26663i(8688);
        checkState();
        int XXH32_digest = XXHashJNI.XXH32_digest(this.state);
        MethodCollector.m26664o(8688);
        return XXH32_digest;
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public final void reset() {
        MethodCollector.m26663i(8544);
        checkState();
        XXHashJNI.XXH32_free(this.state);
        this.state = XXHashJNI.XXH32_init(this.seed);
        MethodCollector.m26664o(8544);
    }

    StreamingXXHash32JNI(int i) {
        super(i);
        MethodCollector.m26663i(8542);
        this.state = XXHashJNI.XXH32_init(i);
        MethodCollector.m26664o(8542);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public final void update(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(8690);
        checkState();
        XXHashJNI.XXH32_update(this.state, bArr, i, i2);
        MethodCollector.m26664o(8690);
    }
}
