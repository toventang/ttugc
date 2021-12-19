package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* JADX WARN: Init of enum RECORD_COMBINE_LIGHTENING can be incorrect */
/* renamed from: com.ss.android.ugc.aweme.servicimpl.ad */
public enum EnumC67895ad {
    PHOTO_SHORT(R.string.f7y, R.string.f7z),
    RECORD_COMBINE(R.string.f7j, R.string.f7n),
    RECORD_COMBINE_60(R.string.f7_, R.string.f7m),
    RECORD_COMBINE_15(R.string.f79, R.string.f7k),
    RECORD_COMBINE_180(R.string.gcc, R.string.f7l),
    RECORD_STATUS(R.string.b03, R.string.f80),
    RECORD_SPLIT_3min(R.string.b70, R.string.f7l),
    RECORD_SPLIT_LIGHTENING(R.string.g62, R.string.f7l),
    RECORD_LIGHTENING_QUICK(R.string.g5z, R.string.f7r),
    RECORD_LIGHTENING_VIDEO(R.string.g61, R.string.f7s),
    RECORD_LIGHTENING_PHOTO(R.string.g60, R.string.f7q),
    RECORD_COMBINE_LIGHTENING(R.string.h6l, r6.f152074c);
    

    /* renamed from: b */
    private final int f152073b;

    /* renamed from: c */
    private final int f152074c;

    public final int getNameResId() {
        return this.f152073b;
    }

    public final int getTagResId() {
        return this.f152074c;
    }

    static {
        Covode.recordClassIndex(80064);
    }

    private EnumC67895ad(int i, int i2) {
        this.f152073b = i;
        this.f152074c = i2;
    }
}
