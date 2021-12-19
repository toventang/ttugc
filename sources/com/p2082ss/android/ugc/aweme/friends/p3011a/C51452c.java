package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.friends.a.c */
public final class C51452c implements SectionIndexer {

    /* renamed from: a */
    private String[] f118587a;

    /* renamed from: b */
    private int[] f118588b;

    /* renamed from: c */
    private int f118589c;

    static {
        Covode.recordClassIndex(60711);
    }

    public final Object[] getSections() {
        return this.f118587a;
    }

    public final int getPositionForSection(int i) {
        if (i < 0 || i >= this.f118587a.length) {
            return -1;
        }
        return this.f118588b[i];
    }

    public final int getSectionForPosition(int i) {
        if (i < 0 || i >= this.f118589c) {
            return -1;
        }
        int binarySearch = Arrays.binarySearch(this.f118588b, i);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return (-binarySearch) - 2;
    }

    /* renamed from: a */
    public final int mo86933a(int i) {
        if (i < 0 || i >= this.f118589c) {
            return -1;
        }
        int[] iArr = this.f118588b;
        int i2 = 0;
        int length = iArr.length - 1;
        while (true) {
            if (i2 <= length) {
                int i3 = (i2 + length) >>> 1;
                if (i >= iArr[i3]) {
                    if (i <= iArr[i3]) {
                        i2 = i3;
                        break;
                    }
                    i2 = i3 + 1;
                } else {
                    length = i3 - 1;
                }
            } else if (i2 == iArr.length || iArr[i2] > i) {
                i2--;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        return (-i2) - 2;
    }

    public C51452c(String[] strArr, int[] iArr) {
        int min = Math.min(strArr.length, iArr.length);
        this.f118587a = strArr;
        this.f118588b = new int[min];
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (TextUtils.isEmpty(this.f118587a[i2])) {
                this.f118587a[i2] = " ";
            } else if (!this.f118587a[i2].equals(" ")) {
                String[] strArr2 = this.f118587a;
                strArr2[i2] = strArr2[i2].trim();
            }
            this.f118588b[i2] = i;
            i += iArr[i2];
        }
        this.f118589c = i;
    }
}
