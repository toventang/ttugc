package com.tencent.wcdb;

import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.tencent.wcdb.database.AbstractC87245c;

public class CursorWindow extends AbstractC87245c implements Parcelable {
    public static final Parcelable.Creator<CursorWindow> CREATOR = new Parcelable.Creator<CursorWindow>() {
        /* class com.tencent.wcdb.CursorWindow.C872311 */

        static {
            Covode.recordClassIndex(103087);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CursorWindow[] newArray(int i) {
            return new CursorWindow[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CursorWindow createFromParcel(Parcel parcel) {
            return new CursorWindow((byte) 0);
        }
    };

    /* renamed from: d */
    private static int f197581d;

    /* renamed from: a */
    public long f197582a;

    /* renamed from: b */
    public int f197583b;

    /* renamed from: c */
    public final String f197584c;

    private static native boolean nativeAllocRow(long j);

    private static native void nativeClear(long j);

    static native void nativeCopyStringToBuffer(long j, int i, int i2, CharArrayBuffer charArrayBuffer);

    private static native long nativeCreate(String str, int i);

    private static native void nativeDispose(long j);

    private static native void nativeFreeLastRow(long j);

    private static native byte[] nativeGetBlob(long j, int i, int i2);

    private static native double nativeGetDouble(long j, int i, int i2);

    private static native long nativeGetLong(long j, int i, int i2);

    private static native int nativeGetNumRows(long j);

    private static native String nativeGetString(long j, int i, int i2);

    private static native int nativeGetType(long j, int i, int i2);

    private static native boolean nativePutBlob(long j, byte[] bArr, int i, int i2);

    private static native boolean nativePutDouble(long j, double d, int i, int i2);

    private static native boolean nativePutLong(long j, long j2, int i, int i2);

    private static native boolean nativePutNull(long j, int i, int i2);

    private static native boolean nativePutString(long j, String str, int i, int i2);

    private static native boolean nativeSetNumColumns(long j, int i);

    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.wcdb.database.AbstractC87245c
    /* renamed from: c */
    public final void mo141108c() {
        m151268f();
    }

    private CursorWindow() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            m151268f();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: f */
    private void m151268f() {
        MethodCollector.m26663i(4300);
        long j = this.f197582a;
        if (j != 0) {
            nativeDispose(j);
            this.f197582a = 0;
        }
        MethodCollector.m26664o(4300);
    }

    /* renamed from: b */
    public final int mo141105b() {
        MethodCollector.m26663i(4305);
        mo141228d();
        try {
            return nativeGetNumRows(this.f197582a);
        } finally {
            mo141229e();
            MethodCollector.m26664o(4305);
        }
    }

    static {
        Covode.recordClassIndex(103086);
        int identifier = Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", "android");
        if (identifier != 0) {
            f197581d = m151267a(Resources.getSystem(), identifier) * 1024;
        } else {
            f197581d = 2097152;
        }
    }

    /* renamed from: a */
    public final void mo141104a() {
        MethodCollector.m26663i(4302);
        mo141228d();
        try {
            this.f197583b = 0;
            nativeClear(this.f197582a);
        } finally {
            mo141229e();
            MethodCollector.m26664o(4302);
        }
    }

    public String toString() {
        return this.f197584c + " {" + Long.toHexString(this.f197582a) + "}";
    }

    /* synthetic */ CursorWindow(byte b) {
        this();
    }

    public CursorWindow(String str) {
        MethodCollector.m26663i(4292);
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.f197584c = str;
        long nativeCreate = nativeCreate(str, f197581d);
        this.f197582a = nativeCreate;
        if (nativeCreate != 0) {
            MethodCollector.m26664o(4292);
            return;
        }
        C87264f fVar = new C87264f("Cursor window allocation of " + (f197581d / 1024) + " kb failed. ");
        MethodCollector.m26664o(4292);
        throw fVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final int mo141103a(int i, int i2) {
        MethodCollector.m26663i(4307);
        mo141228d();
        try {
            return nativeGetType(this.f197582a, i - this.f197583b, i2);
        } finally {
            mo141229e();
            MethodCollector.m26664o(4307);
        }
    }

    /* renamed from: c */
    public final String mo141107c(int i, int i2) {
        MethodCollector.m26663i(4313);
        mo141228d();
        try {
            return nativeGetString(this.f197582a, i - this.f197583b, i2);
        } finally {
            mo141229e();
            MethodCollector.m26664o(4313);
        }
    }

    /* renamed from: d */
    public final long mo141109d(int i, int i2) {
        MethodCollector.m26663i(4315);
        mo141228d();
        try {
            return nativeGetLong(this.f197582a, i - this.f197583b, i2);
        } finally {
            mo141229e();
            MethodCollector.m26664o(4315);
        }
    }

    /* renamed from: e */
    public final double mo141111e(int i, int i2) {
        MethodCollector.m26663i(4381);
        mo141228d();
        try {
            return nativeGetDouble(this.f197582a, i - this.f197583b, i2);
        } finally {
            mo141229e();
            MethodCollector.m26664o(4381);
        }
    }

    /* renamed from: b */
    public final byte[] mo141106b(int i, int i2) {
        MethodCollector.m26663i(4310);
        mo141228d();
        try {
            return nativeGetBlob(this.f197582a, i - this.f197583b, i2);
        } finally {
            mo141229e();
            MethodCollector.m26664o(4310);
        }
    }

    /* renamed from: a */
    private static int m151267a(Resources resources, int i) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }
}
