package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;

abstract class AbstractStreamingXXHash64Java extends StreamingXXHash64 {
    int memSize;
    final byte[] memory = new byte[32];
    long totalLen;

    /* renamed from: v1 */
    long f203849v1;

    /* renamed from: v2 */
    long f203850v2;

    /* renamed from: v3 */
    long f203851v3;

    /* renamed from: v4 */
    long f203852v4;

    static {
        Covode.recordClassIndex(106104);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public void reset() {
        this.f203849v1 = (this.seed - 7046029288634856825L) - 4417276706812531889L;
        this.f203850v2 = this.seed - 4417276706812531889L;
        this.f203851v3 = this.seed + 0;
        this.f203852v4 = this.seed - -7046029288634856825L;
        this.totalLen = 0;
        this.memSize = 0;
    }

    AbstractStreamingXXHash64Java(long j) {
        super(j);
        reset();
    }
}
