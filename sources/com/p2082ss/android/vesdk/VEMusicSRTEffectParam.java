package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam */
public class VEMusicSRTEffectParam {
    private boolean mAddMask;
    private String mEffectResourcePath;
    private int mFontFaceIndex;
    private String mFontTTFPath;
    public AbstractC85260a mGetMusicProgressInvoker;
    private int mMaskColor = 1291845632;
    private boolean mParamUpdated;
    private C85262c[] mSrtData;

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$a */
    public interface AbstractC85260a {
        static {
            Covode.recordClassIndex(99350);
        }

        /* renamed from: a */
        float mo130354a();
    }

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$b */
    public interface AbstractC85261b extends AbstractC85260a {
        static {
            Covode.recordClassIndex(99351);
        }

        /* renamed from: b */
        VEMusicBitmapParam mo130355b();
    }

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$c */
    public static class C85262c {

        /* renamed from: a */
        public String f190787a;

        /* renamed from: b */
        public int f190788b;

        /* renamed from: c */
        public int f190789c;

        /* renamed from: d */
        public int f190790d;

        static {
            Covode.recordClassIndex(99352);
        }
    }

    static {
        Covode.recordClassIndex(99349);
    }

    public boolean getAddMask() {
        return this.mAddMask;
    }

    public String getEffectResPath() {
        return this.mEffectResourcePath;
    }

    public int getFontFaceIndex() {
        return this.mFontFaceIndex;
    }

    public String getFontTTFPath() {
        return this.mFontTTFPath;
    }

    public int getMaskColor() {
        return this.mMaskColor;
    }

    private VEMusicSRTEffectParam() {
    }

    private boolean getParamUpdated() {
        if (!this.mParamUpdated) {
            return false;
        }
        this.mParamUpdated = false;
        return true;
    }

    public float getMusicProgress() {
        AbstractC85260a aVar = this.mGetMusicProgressInvoker;
        if (aVar != null) {
            return aVar.mo130354a();
        }
        return 0.0f;
    }

    public int[][] getSrtData() {
        int[][] iArr = new int[this.mSrtData.length][];
        int i = 0;
        while (true) {
            C85262c[] cVarArr = this.mSrtData;
            if (i >= cVarArr.length) {
                return iArr;
            }
            iArr[i] = convertDataToUnicode32(cVarArr[i]);
            i++;
        }
    }

    public void setAddMask(boolean z) {
        this.mAddMask = z;
        this.mParamUpdated = true;
    }

    public void setMaskColor(int i) {
        this.mMaskColor = i;
        this.mParamUpdated = true;
    }

    private int[] convertDataToUnicode32(C85262c cVar) {
        int codePointCount = cVar.f190787a.codePointCount(0, cVar.f190787a.length());
        int[] iArr = new int[(codePointCount + 3)];
        iArr[0] = cVar.f190790d;
        iArr[1] = cVar.f190788b;
        iArr[2] = cVar.f190789c;
        for (int i = 0; i < codePointCount; i++) {
            iArr[i + 3] = cVar.f190787a.codePointAt(i);
        }
        return iArr;
    }

    public void updateEffectResPath(C85262c[] cVarArr, String str, String str2, int i, AbstractC85260a aVar) {
        this.mSrtData = cVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicSRTEffectParam(C85262c[] cVarArr, String str, String str2, int i, AbstractC85260a aVar) {
        this.mSrtData = cVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicBitmapParam generateBitmap(String str, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        AbstractC85260a aVar = this.mGetMusicProgressInvoker;
        if (aVar == null || !(aVar instanceof AbstractC85261b)) {
            return null;
        }
        return ((AbstractC85261b) aVar).mo130355b();
    }

    public VEMusicBitmapParam generateBitmapUnicode(int[] iArr, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmap(new String(iArr, 0, iArr.length), i, i2, i3, f, i4, i5, i6);
    }
}
