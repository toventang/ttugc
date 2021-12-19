package com.tencent.wcdb.repair;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.AbstractC87232a;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.C87272a;

public class RepairKit implements C87272a.AbstractC87273a {

    /* renamed from: a */
    public long f197768a;

    /* renamed from: b */
    public int f197769b;

    /* renamed from: c */
    public C87271b f197770c;

    /* renamed from: d */
    public AbstractC87270a f197771d;

    /* renamed from: e */
    public RepairCursor f197772e;

    /* renamed from: com.tencent.wcdb.repair.RepairKit$a */
    public interface AbstractC87270a {
        static {
            Covode.recordClassIndex(103163);
        }

        /* renamed from: a */
        int mo31709a(String str, int i);
    }

    static {
        Covode.recordClassIndex(103161);
    }

    private static native void nativeCancel(long j);

    private static native void nativeFini(long j);

    public static native void nativeFreeMaster(long j);

    private static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    public static native int nativeIntegrityFlags(long j);

    private static native String nativeLastError();

    public static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    public static native long nativeMakeMaster(String[] strArr);

    public static native boolean nativeSaveMaster(long j, String str, byte[] bArr);

    public native int nativeOutput(long j, long j2, long j3, int i);

    /* access modifiers changed from: package-private */
    public static class RepairCursor extends AbstractC87232a {

        /* renamed from: i */
        long f197773i;

        static {
            Covode.recordClassIndex(103162);
        }

        private static native byte[] nativeGetBlob(long j, int i);

        private static native int nativeGetColumnCount(long j);

        private static native double nativeGetDouble(long j, int i);

        private static native long nativeGetLong(long j, int i);

        private static native String nativeGetString(long j, int i);

        private static native int nativeGetType(long j, int i);

        private RepairCursor() {
        }

        @Override // com.tencent.wcdb.AbstractC87232a
        public String[] getColumnNames() {
            throw new UnsupportedOperationException();
        }

        @Override // com.tencent.wcdb.AbstractC87236d, com.tencent.wcdb.AbstractC87232a
        public int getCount() {
            throw new UnsupportedOperationException();
        }

        @Override // com.tencent.wcdb.AbstractC87232a
        public int getColumnCount() {
            MethodCollector.m26663i(5744);
            int nativeGetColumnCount = nativeGetColumnCount(this.f197773i);
            MethodCollector.m26664o(5744);
            return nativeGetColumnCount;
        }

        /* synthetic */ RepairCursor(byte b) {
            this();
        }

        public float getFloat(int i) {
            return (float) getDouble(i);
        }

        @Override // com.tencent.wcdb.AbstractC87236d
        public int getInt(int i) {
            return (int) getLong(i);
        }

        public short getShort(int i) {
            return (short) ((int) getLong(i));
        }

        @Override // com.tencent.wcdb.AbstractC87232a
        public byte[] getBlob(int i) {
            MethodCollector.m26663i(6037);
            byte[] nativeGetBlob = nativeGetBlob(this.f197773i, i);
            MethodCollector.m26664o(6037);
            return nativeGetBlob;
        }

        public double getDouble(int i) {
            MethodCollector.m26663i(6035);
            double nativeGetDouble = nativeGetDouble(this.f197773i, i);
            MethodCollector.m26664o(6035);
            return nativeGetDouble;
        }

        @Override // com.tencent.wcdb.AbstractC87236d, com.tencent.wcdb.AbstractC87232a
        public long getLong(int i) {
            MethodCollector.m26663i(5890);
            long nativeGetLong = nativeGetLong(this.f197773i, i);
            MethodCollector.m26664o(5890);
            return nativeGetLong;
        }

        @Override // com.tencent.wcdb.AbstractC87236d, com.tencent.wcdb.AbstractC87232a
        public String getString(int i) {
            MethodCollector.m26663i(5887);
            String nativeGetString = nativeGetString(this.f197773i, i);
            MethodCollector.m26664o(5887);
            return nativeGetString;
        }

        @Override // com.tencent.wcdb.AbstractC87232a
        public int getType(int i) {
            MethodCollector.m26663i(5752);
            int nativeGetType = nativeGetType(this.f197773i, i);
            MethodCollector.m26664o(5752);
            return nativeGetType;
        }

        public boolean isNull(int i) {
            if (getType(i) == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.tencent.wcdb.repair.RepairKit$b */
    public static class C87271b {

        /* renamed from: a */
        public long f197774a;

        /* renamed from: b */
        public byte[] f197775b;

        static {
            Covode.recordClassIndex(103164);
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            mo141278a();
            super.finalize();
        }

        /* renamed from: a */
        public final void mo141278a() {
            MethodCollector.m26663i(5383);
            long j = this.f197774a;
            if (j == 0) {
                MethodCollector.m26664o(5383);
                return;
            }
            RepairKit.nativeFreeMaster(j);
            this.f197774a = 0;
            MethodCollector.m26664o(5383);
        }

        public C87271b(long j, byte[] bArr) {
            this.f197774a = j;
            this.f197775b = bArr;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        mo141271a();
        super.finalize();
    }

    /* renamed from: a */
    public final void mo141271a() {
        MethodCollector.m26663i(4859);
        C87271b bVar = this.f197770c;
        if (bVar != null) {
            bVar.mo141278a();
            this.f197770c = null;
        }
        long j = this.f197768a;
        if (j != 0) {
            nativeFini(j);
            this.f197768a = 0;
        }
        MethodCollector.m26664o(4859);
    }

    @Override // com.tencent.wcdb.support.C87272a.AbstractC87273a
    /* renamed from: b */
    public final void mo141178b() {
        MethodCollector.m26663i(4867);
        long j = this.f197768a;
        if (j == 0) {
            MethodCollector.m26664o(4867);
            return;
        }
        nativeCancel(j);
        MethodCollector.m26664o(4867);
    }

    private int onProgress(String str, int i, long j) {
        if (this.f197771d == null) {
            return 0;
        }
        if (this.f197772e == null) {
            this.f197772e = new RepairCursor((byte) 0);
        }
        this.f197772e.f197773i = j;
        return this.f197771d.mo31709a(str, i);
    }

    public RepairKit(String str, byte[] bArr, C87271b bVar) {
        byte[] bArr2;
        MethodCollector.m26663i(4821);
        if (str != null) {
            if (bVar == null) {
                bArr2 = null;
            } else {
                bArr2 = bVar.f197775b;
            }
            long nativeInit = nativeInit(str, bArr, null, bArr2);
            this.f197768a = nativeInit;
            if (nativeInit != 0) {
                this.f197769b = nativeIntegrityFlags(nativeInit);
                this.f197770c = bVar;
                MethodCollector.m26664o(4821);
                return;
            }
            SQLiteException sQLiteException = new SQLiteException("Failed initialize RepairKit.");
            MethodCollector.m26664o(4821);
            throw sQLiteException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        MethodCollector.m26664o(4821);
        throw illegalArgumentException;
    }
}
