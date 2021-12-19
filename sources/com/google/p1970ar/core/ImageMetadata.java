package com.google.p1970ar.core;

import android.util.Rational;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.ImageMetadata */
public class ImageMetadata {
    private final long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;
    private final C27081ad sketchEntry;

    static {
        Covode.recordClassIndex(32597);
    }

    protected ImageMetadata() {
    }

    private native void nativeDestroyMetadataEntry(long j, long j2);

    private native long[] nativeGetAllKeys(long j, long j2);

    private native byte[] nativeGetByteArrayFromMetadataEntry(long j, long j2);

    private native byte nativeGetByteFromMetadataEntry(long j, long j2);

    private native double[] nativeGetDoubleArrayFromMetadataEntry(long j, long j2);

    private native double nativeGetDoubleFromMetadataEntry(long j, long j2);

    private native float[] nativeGetFloatArrayFromMetadataEntry(long j, long j2);

    private native float nativeGetFloatFromMetadataEntry(long j, long j2);

    private native int[] nativeGetIntArrayFromMetadataEntry(long j, long j2);

    private native int nativeGetIntFromMetadataEntry(long j, long j2);

    private native long[] nativeGetLongArrayFromMetadataEntry(long j, long j2);

    private native long nativeGetLongFromMetadataEntry(long j, long j2);

    private native long nativeGetMetadataEntry(long j, long j2, int i);

    private native int nativeGetMetadataEntryValueCount(long j, long j2);

    private native int nativeGetMetadataEntryValueType(long j, long j2);

    private native Rational[] nativeGetRationalArrayFromMetadataEntry(long j, long j2);

    private native Rational nativeGetRationalFromMetadataEntry(long j, long j2);

    static native void nativeLoadSymbols();

    private static native void nativeReleaseImageMetadata(long j, long j2);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(9972);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseImageMetadata(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(9972);
    }

    public long[] getKeys() {
        MethodCollector.m26663i(10123);
        long[] nativeGetAllKeys = nativeGetAllKeys(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeGetAllKeys != null) {
            MethodCollector.m26664o(10123);
            return nativeGetAllKeys;
        }
        FatalException fatalException = new FatalException("Unknown error in ImageMetadata.getKeys().");
        MethodCollector.m26664o(10123);
        throw fatalException;
    }

    public byte getByte(int i) {
        MethodCollector.m26663i(10124);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 0 && adVar.f64077c == 1) {
            byte nativeGetByteFromMetadataEntry = nativeGetByteFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(10124);
            return nativeGetByteFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(10124);
        throw illegalArgumentException;
    }

    public byte[] getByteArray(int i) {
        MethodCollector.m26663i(11329);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 0) {
            byte[] nativeGetByteArrayFromMetadataEntry = nativeGetByteArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(11329);
            return nativeGetByteArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(11329);
        throw illegalArgumentException;
    }

    public double getDouble(int i) {
        MethodCollector.m26663i(10888);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 4 && adVar.f64077c == 1) {
            double nativeGetDoubleFromMetadataEntry = nativeGetDoubleFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(10888);
            return nativeGetDoubleFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(10888);
        throw illegalArgumentException;
    }

    public double[] getDoubleArray(int i) {
        MethodCollector.m26663i(11817);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 4) {
            double[] nativeGetDoubleArrayFromMetadataEntry = nativeGetDoubleArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(11817);
            return nativeGetDoubleArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(11817);
        throw illegalArgumentException;
    }

    public float getFloat(int i) {
        MethodCollector.m26663i(10441);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 2 && adVar.f64077c == 1) {
            float nativeGetFloatFromMetadataEntry = nativeGetFloatFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(10441);
            return nativeGetFloatFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(10441);
        throw illegalArgumentException;
    }

    public float[] getFloatArray(int i) {
        MethodCollector.m26663i(11489);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 2) {
            float[] nativeGetFloatArrayFromMetadataEntry = nativeGetFloatArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(11489);
            return nativeGetFloatArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(11489);
        throw illegalArgumentException;
    }

    public int getInt(int i) {
        MethodCollector.m26663i(10291);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 1 && adVar.f64077c == 1) {
            int nativeGetIntFromMetadataEntry = nativeGetIntFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(10291);
            return nativeGetIntFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(10291);
        throw illegalArgumentException;
    }

    public int[] getIntArray(int i) {
        MethodCollector.m26663i(11488);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 1) {
            int[] nativeGetIntArrayFromMetadataEntry = nativeGetIntArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(11488);
            return nativeGetIntArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(11488);
        throw illegalArgumentException;
    }

    public long getLong(int i) {
        MethodCollector.m26663i(10741);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 3 && adVar.f64077c == 1) {
            long nativeGetLongFromMetadataEntry = nativeGetLongFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(10741);
            return nativeGetLongFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d, type: %2$d, count: %3$d.", new Object[]{Integer.valueOf(i), Integer.valueOf(this.sketchEntry.f64076b), Integer.valueOf(this.sketchEntry.f64077c)}));
        MethodCollector.m26664o(10741);
        throw illegalArgumentException;
    }

    public long[] getLongArray(int i) {
        MethodCollector.m26663i(11654);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 3) {
            long[] nativeGetLongArrayFromMetadataEntry = nativeGetLongArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(11654);
            return nativeGetLongArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(11654);
        throw illegalArgumentException;
    }

    public Rational getRational(int i) {
        MethodCollector.m26663i(11184);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 5 && adVar.f64077c == 1) {
            Rational nativeGetRationalFromMetadataEntry = nativeGetRationalFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(11184);
            return nativeGetRationalFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(11184);
        throw illegalArgumentException;
    }

    public Rational[] getRationalArray(int i) {
        MethodCollector.m26663i(11818);
        getMetdataEntry(i, this.sketchEntry);
        C27081ad adVar = this.sketchEntry;
        if (adVar.f64076b == 5) {
            Rational[] nativeGetRationalArrayFromMetadataEntry = nativeGetRationalArrayFromMetadataEntry(this.session.nativeWrapperHandle, adVar.f64075a);
            nativeDestroyMetadataEntry(this.session.nativeWrapperHandle, this.sketchEntry.f64075a);
            MethodCollector.m26664o(11818);
            return nativeGetRationalArrayFromMetadataEntry;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Wrong return type for ImageMetadata key: %1$d.", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(11818);
        throw illegalArgumentException;
    }

    ImageMetadata(long j, Session session2) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        this.sketchEntry = new C27081ad();
    }

    private void getMetdataEntry(int i, C27081ad adVar) {
        MethodCollector.m26663i(11978);
        long nativeGetMetadataEntry = nativeGetMetadataEntry(this.session.nativeWrapperHandle, this.nativeHandle, i);
        adVar.f64075a = nativeGetMetadataEntry;
        if (nativeGetMetadataEntry != 0) {
            adVar.f64076b = nativeGetMetadataEntryValueType(this.session.nativeWrapperHandle, nativeGetMetadataEntry);
            adVar.f64077c = nativeGetMetadataEntryValueCount(this.session.nativeWrapperHandle, adVar.f64075a);
            MethodCollector.m26664o(11978);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Invalid ImageMetadata key: %1$d", new Object[]{Integer.valueOf(i)}));
        MethodCollector.m26664o(11978);
        throw illegalArgumentException;
    }
}
