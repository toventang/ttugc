package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.h */
public final class C55895h implements SectionIndexer {

    /* renamed from: a */
    private String[] f127427a;

    /* renamed from: b */
    private int[] f127428b;

    /* renamed from: c */
    private int f127429c;

    static {
        Covode.recordClassIndex(65685);
    }

    public final Object[] getSections() {
        return this.f127427a;
    }

    public final int getPositionForSection(int i) {
        if (i < 0 || i >= this.f127427a.length) {
            return -1;
        }
        return this.f127428b[i];
    }

    public final int getSectionForPosition(int i) {
        if (i < 0 || i >= this.f127429c) {
            return -1;
        }
        int binarySearch = Arrays.binarySearch(this.f127428b, i);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return (-binarySearch) - 2;
    }

    public C55895h(String[] strArr, int[] iArr) {
        int min = Math.min(strArr.length, iArr.length);
        this.f127427a = strArr;
        this.f127428b = new int[min];
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (TextUtils.isEmpty(this.f127427a[i2])) {
                this.f127427a[i2] = " ";
            } else if (!this.f127427a[i2].equals(" ")) {
                String[] strArr2 = this.f127427a;
                strArr2[i2] = strArr2[i2].trim();
            }
            this.f127428b[i2] = i;
            i += iArr[i2];
        }
        this.f127429c = i;
    }
}
