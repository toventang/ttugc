package com.p2082ss.android.vesdk.p4390f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEListener;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.vesdk.f.f */
public interface AbstractC85469f {
    static {
        Covode.recordClassIndex(99590);
    }

    int addImageSticker(String str, float f, float f2, float f3, float f4);

    int addImageStickerWithRatio(String str, float f, float f2, float f3, float f4);

    int addInfoSticker(String str, String[] strArr);

    int addInfoStickerWithBuffer();

    int beginInfoStickerPin(int i);

    int cancelInfoStickerPin(int i);

    void clearNativeFromSticker();

    float[] getInfoStickerBoundingBox(int i);

    int getInfoStickerPinData(int i, ByteBuffer[] byteBufferArr);

    float getInfoStickerRotate(int i);

    float getInfoStickerScale(int i);

    boolean getInfoStickerVisible(int i);

    int getSrtInfoStickerInitPosition(int i, float[] fArr);

    boolean isInfoStickerAnimatable(int i);

    int removeInfoSticker(int i);

    int restoreInfoStickerPinWithData(int i, ByteBuffer byteBuffer);

    int setInfoStickerAlpha(int i, float f);

    int setInfoStickerBufferCallback(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    int setInfoStickerLayer(int i, int i2);

    int setInfoStickerPosition(int i, float f, float f2);

    int setInfoStickerRestoreMode(int i);

    int setInfoStickerRotation(int i, float f);

    int setInfoStickerScale(int i, float f);

    int setInfoStickerTime(int i, int i2, int i3);

    int setSrtInitialPosition(int i, float f, float f2);
}
