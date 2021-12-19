package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;

abstract class AbstractStreamingXXHash32Java extends StreamingXXHash32 {
    int memSize;
    final byte[] memory = new byte[16];
    long totalLen;

    /* renamed from: v1 */
    int f203845v1;

    /* renamed from: v2 */
    int f203846v2;

    /* renamed from: v3 */
    int f203847v3;

    /* renamed from: v4 */
    int f203848v4;

    static {
        Covode.recordClassIndex(106103);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public void reset() {
        this.f203845v1 = (this.seed - 1640531535) - 2048144777;
        this.f203846v2 = this.seed - 2048144777;
        this.f203847v3 = this.seed + 0;
        this.f203848v4 = this.seed - -1640531535;
        this.totalLen = 0;
        this.memSize = 0;
    }

    AbstractStreamingXXHash32Java(int i) {
        super(i);
        reset();
    }
}
