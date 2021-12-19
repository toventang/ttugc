package com.p2082ss.avframework.utils;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.NativeObject;

/* renamed from: com.ss.avframework.utils.TEBundle */
public class TEBundle extends NativeObject {
    static {
        Covode.recordClassIndex(100747);
    }

    private native void nativeClear();

    private native long nativeClone();

    private native boolean nativeContains(String str);

    private native long nativeCopyFrom(long j);

    private native void nativeCreate();

    private native void nativeDump();

    private native boolean nativeGetBool(String str);

    private native TEBundle nativeGetBundle(String str);

    private native double nativeGetDouble(String str);

    private native int nativeGetInt(String str);

    private native long nativeGetLong(String str);

    private native Object nativeGetObj(String str);

    private native String nativeGetString(String str);

    private native void nativeRelease();

    private native void nativeRemove(String str);

    private native void nativeSetBool(String str, boolean z);

    private native void nativeSetBundle(String str, TEBundle tEBundle);

    private native void nativeSetDouble(String str, double d);

    private native void nativeSetInt(String str, int i);

    private native void nativeSetLong(String str, long j);

    private native void nativeSetObj(String str, Object obj);

    private native void nativeSetString(String str, String str2);

    private native String nativeToString();

    private native void nativeUpdateFrom(TEBundle tEBundle);

    @Override // com.p2082ss.avframework.engine.NativeObject
    public void finalize() {
        release();
    }

    public TEBundle() {
        MethodCollector.m26663i(754);
        nativeCreate();
        MethodCollector.m26664o(754);
    }

    public void clear() {
        MethodCollector.m26663i(941);
        nativeClear();
        MethodCollector.m26664o(941);
    }

    public void dump() {
        MethodCollector.m26663i(940);
        nativeDump();
        MethodCollector.m26664o(940);
    }

    public String toString() {
        MethodCollector.m26663i(962);
        String nativeToString = nativeToString();
        MethodCollector.m26664o(962);
        return nativeToString;
    }

    public TEBundle copy() {
        MethodCollector.m26663i(758);
        TEBundle tEBundle = new TEBundle(nativeClone());
        MethodCollector.m26664o(758);
        return tEBundle;
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(943);
        if (this.mNativeObj != 0) {
            nativeRelease();
            this.mNativeObj = 0;
        }
        MethodCollector.m26664o(943);
    }

    protected TEBundle(long j) {
        this.mNativeObj = j;
    }

    public boolean contains(String str) {
        MethodCollector.m26663i(810);
        boolean nativeContains = nativeContains(str);
        MethodCollector.m26664o(810);
        return nativeContains;
    }

    public boolean getBool(String str) {
        MethodCollector.m26663i(799);
        boolean nativeGetBool = nativeGetBool(str);
        MethodCollector.m26664o(799);
        return nativeGetBool;
    }

    public TEBundle getBundle(String str) {
        MethodCollector.m26663i(808);
        TEBundle nativeGetBundle = nativeGetBundle(str);
        MethodCollector.m26664o(808);
        return nativeGetBundle;
    }

    public double getDouble(String str) {
        MethodCollector.m26663i(802);
        double nativeGetDouble = nativeGetDouble(str);
        MethodCollector.m26664o(802);
        return nativeGetDouble;
    }

    public int getInt(String str) {
        MethodCollector.m26663i(791);
        int nativeGetInt = nativeGetInt(str);
        MethodCollector.m26664o(791);
        return nativeGetInt;
    }

    public long getLong(String str) {
        MethodCollector.m26663i(796);
        long nativeGetLong = nativeGetLong(str);
        MethodCollector.m26664o(796);
        return nativeGetLong;
    }

    public Object getObject(String str) {
        MethodCollector.m26663i(806);
        Object nativeGetObj = nativeGetObj(str);
        MethodCollector.m26664o(806);
        return nativeGetObj;
    }

    public String getString(String str) {
        MethodCollector.m26663i(938);
        String nativeGetString = nativeGetString(str);
        MethodCollector.m26664o(938);
        return nativeGetString;
    }

    public void remove(String str) {
        MethodCollector.m26663i(939);
        nativeRemove(str);
        MethodCollector.m26664o(939);
    }

    public void updateFrom(TEBundle tEBundle) {
        MethodCollector.m26663i(759);
        if (tEBundle != null) {
            nativeUpdateFrom(tEBundle);
            MethodCollector.m26664o(759);
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Bad parameters");
        MethodCollector.m26664o(759);
        throw androidRuntimeException;
    }

    public TEBundle(TEBundle tEBundle) {
        MethodCollector.m26663i(756);
        if (tEBundle != null) {
            this.mNativeObj = nativeCopyFrom(tEBundle.mNativeObj);
            MethodCollector.m26664o(756);
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Bad parameters");
        MethodCollector.m26664o(756);
        throw androidRuntimeException;
    }

    public void setBool(String str, boolean z) {
        MethodCollector.m26663i(782);
        nativeSetBool(str, z);
        MethodCollector.m26664o(782);
    }

    public void setBundle(String str, TEBundle tEBundle) {
        MethodCollector.m26663i(785);
        nativeSetBundle(str, tEBundle);
        MethodCollector.m26664o(785);
    }

    public void setDouble(String str, double d) {
        MethodCollector.m26663i(783);
        nativeSetDouble(str, d);
        MethodCollector.m26664o(783);
    }

    public void setInt(String str, int i) {
        MethodCollector.m26663i(761);
        nativeSetInt(str, i);
        MethodCollector.m26664o(761);
    }

    public void setLong(String str, long j) {
        MethodCollector.m26663i(780);
        nativeSetLong(str, j);
        MethodCollector.m26664o(780);
    }

    public void setString(String str, String str2) {
        MethodCollector.m26663i(817);
        nativeSetString(str, str2);
        MethodCollector.m26664o(817);
    }

    public void setObject(String str, Object obj) {
        MethodCollector.m26663i(789);
        nativeSetObj(str, obj);
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("No implament");
        MethodCollector.m26664o(789);
        throw androidRuntimeException;
    }

    public boolean equal(String str, Object obj) {
        boolean contains = contains(str);
        if (!contains) {
            return contains;
        }
        if (obj instanceof Integer) {
            if (getInt(str) == ((Integer) obj).intValue()) {
                return true;
            }
            return false;
        } else if (obj instanceof Long) {
            if (getLong(str) == ((Long) obj).longValue()) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return getString(str).equalsIgnoreCase((String) obj);
        } else {
            if (obj instanceof Boolean) {
                if (getBool(str) == ((Boolean) obj).booleanValue()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Double)) {
                throw new AndroidRuntimeException("Not found Object type");
            } else if (getDouble(str) == ((Double) obj).doubleValue()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
