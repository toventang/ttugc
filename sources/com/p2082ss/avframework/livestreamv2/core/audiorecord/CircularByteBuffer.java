package com.p2082ss.avframework.livestreamv2.core.audiorecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.avframework.livestreamv2.core.audiorecord.CircularByteBuffer */
public class CircularByteBuffer {
    private int available;
    private final byte[] buffer;
    private final int capacity;
    private int idxGet;
    private int idxPut;

    static {
        Covode.recordClassIndex(100280);
    }

    public int capacity() {
        return this.capacity;
    }

    public CircularByteBuffer() {
        this(8192);
    }

    public synchronized int available() {
        int i;
        MethodCollector.m26663i(3326);
        i = this.available;
        MethodCollector.m26664o(3326);
        return i;
    }

    public synchronized void clear() {
        MethodCollector.m26663i(3037);
        this.available = 0;
        this.idxPut = 0;
        this.idxGet = 0;
        MethodCollector.m26664o(3037);
    }

    public synchronized int free() {
        int i;
        MethodCollector.m26663i(3456);
        i = this.capacity - this.available;
        MethodCollector.m26664o(3456);
        return i;
    }

    public synchronized int peek() {
        MethodCollector.m26663i(3251);
        if (this.available > 0) {
            byte b = this.buffer[this.idxGet];
            MethodCollector.m26664o(3251);
            return b;
        }
        MethodCollector.m26664o(3251);
        return -1;
    }

    public synchronized int get() {
        MethodCollector.m26663i(3144);
        int i = this.available;
        if (i == 0) {
            MethodCollector.m26664o(3144);
            return -1;
        }
        byte[] bArr = this.buffer;
        int i2 = this.idxGet;
        byte b = bArr[i2];
        this.idxGet = (i2 + 1) % this.capacity;
        this.available = i - 1;
        MethodCollector.m26664o(3144);
        return b;
    }

    public int get(byte[] bArr) {
        return get(bArr, 0, bArr.length);
    }

    public int put(byte[] bArr) {
        return put(bArr, 0, bArr.length);
    }

    public CircularByteBuffer(int i) {
        this.capacity = i;
        this.buffer = new byte[i];
    }

    public synchronized int skip(int i) {
        MethodCollector.m26663i(3252);
        int i2 = this.available;
        if (i > i2) {
            i = i2;
        }
        this.idxGet = (this.idxGet + i) % this.capacity;
        this.available = i2 - i;
        MethodCollector.m26664o(3252);
        return i;
    }

    public synchronized boolean put(byte b) {
        MethodCollector.m26663i(3240);
        int i = this.available;
        int i2 = this.capacity;
        if (i == i2) {
            MethodCollector.m26664o(3240);
            return false;
        }
        byte[] bArr = this.buffer;
        int i3 = this.idxPut;
        bArr[i3] = b;
        this.idxPut = (i3 + 1) % i2;
        this.available = i + 1;
        MethodCollector.m26664o(3240);
        return true;
    }

    public synchronized int get(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(3154);
        if (this.available == 0) {
            MethodCollector.m26664o(3154);
            return 0;
        }
        int i3 = this.idxGet;
        int i4 = this.idxPut;
        if (i3 >= i4) {
            i4 = this.capacity;
        }
        int min = Math.min(i4 - i3, i2);
        System.arraycopy(this.buffer, this.idxGet, bArr, i, min);
        int i5 = this.idxGet + min;
        this.idxGet = i5;
        if (i5 == this.capacity) {
            int min2 = Math.min(i2 - min, this.idxPut);
            if (min2 > 0) {
                System.arraycopy(this.buffer, 0, bArr, i + min, min2);
                this.idxGet = min2;
                min += min2;
            } else {
                this.idxGet = 0;
            }
        }
        this.available -= min;
        MethodCollector.m26664o(3154);
        return min;
    }

    public synchronized int put(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(3250);
        int i3 = this.available;
        int i4 = this.capacity;
        if (i3 == i4) {
            MethodCollector.m26664o(3250);
            return 0;
        }
        int i5 = this.idxPut;
        int i6 = this.idxGet;
        if (i5 < i6) {
            i4 = i6;
        }
        int min = Math.min(i4 - i5, i2);
        System.arraycopy(bArr, i, this.buffer, this.idxPut, min);
        int i7 = this.idxPut + min;
        this.idxPut = i7;
        if (i7 == this.capacity) {
            int min2 = Math.min(i2 - min, this.idxGet);
            if (min2 > 0) {
                System.arraycopy(bArr, i + min, this.buffer, 0, min2);
                this.idxPut = min2;
                min += min2;
            } else {
                this.idxPut = 0;
            }
        }
        this.available += min;
        MethodCollector.m26664o(3250);
        return min;
    }
}
