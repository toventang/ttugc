package com.lynx.react.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;

public class JavaOnlyArray extends ArrayList<Object> implements ReadableArray, WritableArray, AbstractC28371e {
    static {
        Covode.recordClassIndex(34340);
    }

    /* renamed from: com_lynx_react_bridge_JavaOnlyArray_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m56669x82804ef4(String str, String str2) {
        return 0;
    }

    public JavaOnlyArray() {
    }

    public void clear() {
        super.clear();
    }

    private static JavaOnlyArray create() {
        return new JavaOnlyArray();
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushNull() {
        add(null);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public int size() {
        return super.size();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.react.bridge.JavaOnlyArray$1 */
    public static /* synthetic */ class C283641 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66615a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.react.bridge.JavaOnlyArray.C283641.<clinit>():void");
        }
    }

    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        int size = size();
        for (int i = 0; i < size; i++) {
            Object obj = get(i);
            try {
                if (getType(i) == ReadableType.Map) {
                    jSONArray.put(((JavaOnlyMap) obj).toJSONObject());
                } else if (getType(i) == ReadableType.Array) {
                    jSONArray.put(((JavaOnlyArray) obj).toJSONArray());
                } else {
                    jSONArray.put(obj);
                }
            } catch (Exception e) {
                m56669x82804ef4("JavaOnlyArray", e.toString());
            }
        }
        return jSONArray;
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushArray(WritableArray writableArray) {
        add(writableArray);
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushByteArray(byte[] bArr) {
        add(bArr);
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushMap(WritableMap writableMap) {
        add(writableMap);
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushString(String str) {
        add(str);
    }

    private JavaOnlyArray(List list) {
        super(list);
    }

    public static JavaOnlyArray from(List list) {
        return new JavaOnlyArray(list);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public JavaOnlyArray getArray(int i) {
        return (JavaOnlyArray) get(i);
    }

    public Object getAt(int i) {
        return get(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public byte[] getByteArray(int i) {
        return (byte[]) get(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public AbstractC28367a getDynamic(int i) {
        return C28368b.m56681a(this, i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public JavaOnlyMap getMap(int i) {
        return (JavaOnlyMap) get(i);
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public String getString(int i) {
        return (String) get(i);
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushBoolean(boolean z) {
        add(Boolean.valueOf(z));
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushDouble(double d) {
        add(Double.valueOf(d));
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushInt(int i) {
        add(Integer.valueOf(i));
    }

    @Override // com.lynx.react.bridge.WritableArray
    public void pushLong(long j) {
        add(Long.valueOf(j));
    }

    /* renamed from: of */
    public static JavaOnlyArray m56670of(Object... objArr) {
        return new JavaOnlyArray(Arrays.asList(objArr));
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public boolean getBoolean(int i) {
        return ((Boolean) get(i)).booleanValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public byte getByte(int i) {
        return ((Number) get(i)).byteValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public char getChar(int i) {
        return (char) ((Number) get(i)).shortValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public double getDouble(int i) {
        return ((Number) get(i)).doubleValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public int getInt(int i) {
        return ((Number) get(i)).intValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public long getLong(int i) {
        return ((Number) get(i)).longValue();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public short getShort(int i) {
        return ((Number) get(i)).shortValue();
    }

    public int getTypeIndex(int i) {
        return getType(i).ordinal();
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public boolean isNull(int i) {
        if (get(i) == null) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.react.bridge.ReadableArray
    public ReadableType getType(int i) {
        Object obj = get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Integer) {
            return ReadableType.Int;
        }
        if (obj instanceof Long) {
            return ReadableType.Long;
        }
        if ((obj instanceof Number) || (obj instanceof Character)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof byte[]) {
            return ReadableType.ByteArray;
        }
        return null;
    }

    public static JavaOnlyArray deepClone(ReadableArray readableArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (C283641.f66615a[readableArray.getType(i).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 3:
                    javaOnlyArray.pushInt(readableArray.getInt(i));
                    break;
                case 4:
                    javaOnlyArray.pushLong(readableArray.getLong(i));
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    javaOnlyArray.pushMap(JavaOnlyMap.deepClone(readableArray.getMap(i)));
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    javaOnlyArray.pushArray(deepClone(readableArray.getArray(i)));
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    javaOnlyArray.pushByteArray((byte[]) readableArray.getByteArray(i).clone());
                    break;
            }
        }
        return javaOnlyArray;
    }
}
