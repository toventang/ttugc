package com.p2082ss.bytertc.engine.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.bytertc.engine.adapter.VideoFrameConverter */
public class VideoFrameConverter {
    private static int MAX_BYTE_BUFFER_POOL_SIZE = 2;
    private int abandonFrameCount;
    private ArrayList<ByteBufferHolder> byteBufferPool;
    private ByteBuffer[] byteBuffers;
    private boolean isBufferDirect;
    final int[] steps;
    final int[] strides;

    /* renamed from: com.ss.bytertc.engine.adapter.VideoFrameConverter$ByteBufferHolder */
    public static class ByteBufferHolder {
        public ByteBuffer byteBuffer;
        public volatile boolean isPending;

        static {
            Covode.recordClassIndex(100955);
        }

        protected ByteBufferHolder() {
        }

        public boolean isPending() {
            return this.isPending;
        }

        public ByteBuffer getByteBuffer() {
            ByteBuffer byteBuffer2 = this.byteBuffer;
            if (byteBuffer2 != null) {
                byteBuffer2.clear();
            }
            return this.byteBuffer;
        }

        public byte[] getArray() {
            ByteBuffer byteBuffer2 = this.byteBuffer;
            if (byteBuffer2 == null) {
                return null;
            }
            byteBuffer2.clear();
            if (this.byteBuffer.hasArray() && this.byteBuffer.arrayOffset() == 0) {
                return this.byteBuffer.array();
            }
            int remaining = this.byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            this.byteBuffer.get(bArr, 0, remaining);
            return bArr;
        }

        public void setByteBuffer(ByteBuffer byteBuffer2) {
            this.byteBuffer = byteBuffer2;
        }

        public void setPending(boolean z) {
            this.isPending = z;
        }
    }

    /* renamed from: com.ss.bytertc.engine.adapter.VideoFrameConverter$I420BufferWrapper */
    static class I420BufferWrapper {
        private VideoFrame.I420Buffer i420Buffer;
        private boolean needManualRelease;

        static {
            Covode.recordClassIndex(100956);
        }

        public VideoFrame.I420Buffer getBuffer() {
            return this.i420Buffer;
        }

        public void release() {
            VideoFrame.I420Buffer i420Buffer2 = this.i420Buffer;
            if ((i420Buffer2 instanceof JavaI420Buffer) && this.needManualRelease) {
                i420Buffer2.release();
            }
        }

        public I420BufferWrapper(VideoFrame videoFrame) {
            if (videoFrame.getBuffer() instanceof JavaI420Buffer) {
                this.i420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
                this.needManualRelease = false;
                return;
            }
            this.i420Buffer = videoFrame.getBuffer().toI420();
            this.needManualRelease = true;
            videoFrame.getBuffer().release();
        }
    }

    public VideoFrameConverter() {
        this(false);
    }

    static {
        Covode.recordClassIndex(100950);
    }

    private ByteBufferHolder getPendingBuffer() {
        Iterator<ByteBufferHolder> it = this.byteBufferPool.iterator();
        while (it.hasNext()) {
            ByteBufferHolder next = it.next();
            if (!next.isPending) {
                next.setPending(true);
                return next;
            }
        }
        return null;
    }

    public VideoFrameConverter(boolean z) {
        this.byteBuffers = new ByteBuffer[3];
        this.strides = new int[3];
        this.steps = new int[2];
        this.byteBufferPool = new ArrayList<>();
        this.abandonFrameCount = 0;
        for (int i = 0; i < MAX_BYTE_BUFFER_POOL_SIZE; i++) {
            this.byteBufferPool.add(new ByteBufferHolder());
        }
        this.isBufferDirect = z;
    }

    public ByteBufferHolder convert2YUV(VideoFrame videoFrame) {
        ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            return null;
        }
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        I420BufferWrapper i420BufferWrapper = new I420BufferWrapper(videoFrame);
        VideoFrame.I420Buffer buffer = i420BufferWrapper.getBuffer();
        boolean convertRawYUV2ByteHolder = convertRawYUV2ByteHolder(pendingBuffer, buffer.getDataY(), buffer.getDataU(), buffer.getDataV(), buffer.getStrideY(), buffer.getStrideU(), buffer.getStrideV(), width, height);
        i420BufferWrapper.release();
        if (!convertRawYUV2ByteHolder) {
            return null;
        }
        return pendingBuffer;
    }

    public void checkReuseByteBuffer(int i, ByteBufferHolder byteBufferHolder) {
        ByteBuffer allocate;
        if (byteBufferHolder.getByteBuffer() == null || byteBufferHolder.getByteBuffer().capacity() < i) {
            if (this.isBufferDirect) {
                allocate = ByteBuffer.allocateDirect(i);
            } else {
                allocate = ByteBuffer.allocate(i);
            }
            allocate.order(ByteOrder.nativeOrder());
            byteBufferHolder.setByteBuffer(allocate);
        }
    }

    public VideoFrame.I420Buffer convertToJavaI420Buffer(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            int i3 = this.abandonFrameCount + 1;
            this.abandonFrameCount = i3;
            if (i3 >= 60) {
                LogUtil.m147886e("VideoFrameConverter", "连续丢弃60帧，检查视频帧Buffer是否正常释放");
                this.abandonFrameCount = 0;
            }
            return null;
        }
        this.abandonFrameCount = 0;
        int i4 = (i2 + 1) / 2;
        int i5 = (i + 1) / 2;
        int i6 = i * i2;
        int i7 = (i5 * 2 * i4) + i6;
        checkReuseByteBuffer(i7, pendingBuffer);
        ByteBuffer byteBuffer2 = pendingBuffer.getByteBuffer();
        byteBuffer.position(0);
        byteBuffer2.position(0);
        if (byteBuffer.limit() > i7) {
            byteBuffer.limit(i7);
        }
        byteBuffer2.limit(i7);
        byteBuffer2.put(byteBuffer);
        int i8 = i6 + 0;
        int i9 = i4 * i5;
        int i10 = i8 + i9;
        byteBuffer2.position(0);
        byteBuffer2.limit(i8);
        ByteBuffer slice = byteBuffer2.slice();
        byteBuffer2.position(i8);
        byteBuffer2.limit(i10);
        ByteBuffer slice2 = byteBuffer2.slice();
        byteBuffer2.position(i10);
        byteBuffer2.limit(i10 + i9);
        ByteBuffer slice3 = byteBuffer2.slice();
        if (z) {
            return CountDownLatchI420Buffer.wrap(i, i2, slice, i, slice2, i5, slice3, i5, new VideoFrameConverter$$Lambda$0(pendingBuffer));
        }
        return JavaI420Buffer.wrap(i, i2, slice, i, slice2, i5, slice3, i5, new VideoFrameConverter$$Lambda$1(pendingBuffer));
    }

    public VideoFrame.I420Buffer convertToJavaI420Buffer(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            return null;
        }
        ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            int i3 = this.abandonFrameCount + 1;
            this.abandonFrameCount = i3;
            if (i3 >= 60) {
                LogUtil.m147886e("VideoFrameConverter", "连续丢弃60帧，检查视频帧Buffer是否正常释放");
                this.abandonFrameCount = 0;
            }
            return null;
        }
        this.abandonFrameCount = 0;
        int i4 = (i2 + 1) / 2;
        int i5 = (i + 1) / 2;
        int i6 = i * i2;
        int i7 = (i5 * 2 * i4) + i6;
        checkReuseByteBuffer(i7, pendingBuffer);
        ByteBuffer byteBuffer = pendingBuffer.getByteBuffer();
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        byteBuffer.put(bArr, 0, Math.min(bArr.length, i7));
        int i8 = i6 + 0;
        int i9 = i4 * i5;
        int i10 = i8 + i9;
        byteBuffer.position(0);
        byteBuffer.limit(i8);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(i8);
        byteBuffer.limit(i10);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBuffer.position(i10);
        byteBuffer.limit(i10 + i9);
        ByteBuffer slice3 = byteBuffer.slice();
        if (z) {
            return CountDownLatchI420Buffer.wrap(i, i2, slice, i, slice2, i5, slice3, i5, new VideoFrameConverter$$Lambda$2(pendingBuffer));
        }
        return JavaI420Buffer.wrap(i, i2, slice, i, slice2, i5, slice3, i5, new VideoFrameConverter$$Lambda$3(pendingBuffer));
    }

    public ByteBuffer convertRawYUV2ByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(bArr2.length);
        allocateDirect2.order(ByteOrder.nativeOrder());
        allocateDirect2.put(bArr2);
        allocateDirect2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(bArr3.length);
        allocateDirect3.order(ByteOrder.nativeOrder());
        allocateDirect3.put(bArr3);
        allocateDirect3.position(0);
        ByteBuffer allocate = ByteBuffer.allocate((i4 * i5) + (((i4 + 1) / 2) * 2 * i4));
        allocate.clear();
        convertRawYUV2ByteArray(allocate.array(), allocateDirect, allocateDirect2, allocateDirect3, i, i2, i3, i4, i5);
        return allocate;
    }

    public boolean convertRawYUV2ByteHolder(ByteBufferHolder byteBufferHolder, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        checkReuseByteBuffer((i4 * i5) + (((i4 + 1) / 2) * 2 * i5), byteBufferHolder);
        return convertRawYUV2ByteBuffer(byteBufferHolder.byteBuffer, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5);
    }

    private boolean convertRawYUV2ByteArray(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int[] iArr = this.strides;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        int[] iArr2 = this.steps;
        iArr2[0] = i4;
        iArr2[1] = (i4 + 1) / 2;
        int i7 = (i4 * i5) + (iArr2[1] * 2 * i5);
        byteBuffer.clear();
        byteBuffer2.clear();
        byteBuffer3.clear();
        if (bArr == null || i7 > bArr.length) {
            return false;
        }
        ByteBuffer[] byteBufferArr = this.byteBuffers;
        byteBufferArr[0] = byteBuffer;
        byteBufferArr[1] = byteBuffer2;
        byteBufferArr[2] = byteBuffer3;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            ByteBuffer[] byteBufferArr2 = this.byteBuffers;
            if (i8 < byteBufferArr2.length) {
                ByteBuffer byteBuffer4 = byteBufferArr2[i8];
                int i10 = this.strides[i8];
                int[] iArr3 = this.steps;
                if (i8 == 0) {
                    i6 = iArr3[0];
                } else {
                    i6 = iArr3[1];
                }
                int i11 = i10 - i6;
                if (i10 != i6) {
                    while (byteBuffer4.hasRemaining() && byteBuffer4.position() + i6 <= byteBuffer4.capacity()) {
                        byteBuffer4.get(bArr, i9, i6);
                        i9 += i6;
                        int position = byteBuffer4.position() + i11;
                        if (!byteBuffer4.hasRemaining() || position > byteBuffer4.capacity()) {
                            break;
                        }
                        byteBuffer4.position(position);
                    }
                } else {
                    int remaining = byteBuffer4.remaining();
                    byteBuffer4.get(bArr, i9, remaining);
                    i9 += remaining;
                }
                i8++;
            } else {
                byteBufferArr2[0] = null;
                byteBufferArr2[1] = null;
                byteBufferArr2[2] = null;
                return true;
            }
        }
    }

    private boolean convertRawYUV2ByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int[] iArr = this.strides;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        int[] iArr2 = this.steps;
        iArr2[0] = i4;
        iArr2[1] = (i4 + 1) / 2;
        int i7 = (i4 * i5) + (iArr2[1] * 2 * i5);
        byteBuffer2.clear();
        byteBuffer3.clear();
        byteBuffer4.clear();
        if (byteBuffer == null || i7 > byteBuffer.capacity()) {
            return false;
        }
        byteBuffer.clear();
        ByteBuffer[] byteBufferArr = this.byteBuffers;
        byteBufferArr[0] = byteBuffer2;
        byteBufferArr[1] = byteBuffer3;
        byteBufferArr[2] = byteBuffer4;
        int i8 = 0;
        while (true) {
            ByteBuffer[] byteBufferArr2 = this.byteBuffers;
            if (i8 < byteBufferArr2.length) {
                ByteBuffer byteBuffer5 = byteBufferArr2[i8];
                int i9 = this.strides[i8];
                int[] iArr3 = this.steps;
                if (i8 == 0) {
                    i6 = iArr3[0];
                } else {
                    i6 = iArr3[1];
                }
                int i10 = i9 - i6;
                if (i9 != i6) {
                    while (byteBuffer5.hasRemaining() && byteBuffer5.position() + i6 <= byteBuffer5.capacity()) {
                        byteBuffer5.limit(byteBuffer5.position() + i6);
                        byteBuffer.put(byteBuffer5);
                        int position = byteBuffer5.position() + i10;
                        if (position > byteBuffer5.capacity()) {
                            break;
                        }
                        byteBuffer5.limit(byteBuffer5.capacity());
                        byteBuffer5.position(position);
                    }
                } else {
                    byteBuffer.put(byteBuffer5);
                }
                i8++;
            } else {
                byteBufferArr2[0] = null;
                byteBufferArr2[1] = null;
                byteBufferArr2[2] = null;
                return true;
            }
        }
    }
}
