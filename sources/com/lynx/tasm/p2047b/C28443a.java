package com.lynx.tasm.p2047b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxEnv;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.lynx.tasm.b.a */
public class C28443a {

    /* renamed from: a */
    public static final C28443a f66899a = new C28443a();

    /* renamed from: b */
    private static final boolean f66900b;

    /* renamed from: c */
    private static final Charset f66901c = Charset.forName("UTF8");

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.b.a$a */
    public static final class C28444a extends ByteArrayOutputStream {
        static {
            Covode.recordClassIndex(34434);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final byte[] mo48886a() {
            return this.buf;
        }

        C28444a() {
            MethodCollector.m26663i(4373);
            MethodCollector.m26664o(4373);
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(34433);
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f66900b = z;
    }

    /* renamed from: c */
    private Object m56849c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return m56841a(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* renamed from: b */
    private static int m56847b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            if (i < 254) {
                return i;
            }
            if (i == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* renamed from: a */
    public final Object mo48884a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            byteBuffer.order(ByteOrder.nativeOrder());
            Object c = m56849c(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return c;
            }
            throw new IllegalArgumentException("Message corrupted");
        } catch (IllegalArgumentException e) {
            LynxEnv.m56706b().f66648o.mo19151a(new C28816j(e.toString(), -3));
            return null;
        }
    }

    /* renamed from: a */
    public final ByteBuffer mo48885a(Object obj) {
        if (obj == null) {
            return null;
        }
        C28444a aVar = new C28444a();
        try {
            m56844a(aVar, obj, new LinkedList<>());
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
            allocateDirect.put(aVar.mo48886a(), 0, aVar.size());
            return allocateDirect;
        } catch (IllegalArgumentException e) {
            LynxEnv.m56706b().f66648o.mo19151a(new C28816j(e.toString(), -3));
            return null;
        }
    }

    /* renamed from: a */
    private static void m56845a(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        MethodCollector.m26663i(3163);
        m56842a(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        MethodCollector.m26664o(3163);
    }

    /* renamed from: a */
    private static void m56842a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        MethodCollector.m26663i(2985);
        if (i < 254) {
            byteArrayOutputStream.write(i);
            MethodCollector.m26664o(2985);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            if (f66900b) {
                byteArrayOutputStream.write(i);
                byteArrayOutputStream.write(i >>> 8);
                MethodCollector.m26664o(2985);
                return;
            }
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i);
            MethodCollector.m26664o(2985);
        } else {
            byteArrayOutputStream.write(255);
            m56848b(byteArrayOutputStream, i);
            MethodCollector.m26664o(2985);
        }
    }

    /* renamed from: a */
    private static boolean m56846a(Collection<Object> collection, Object obj) {
        if (obj == null) {
            return false;
        }
        for (Object obj2 : collection) {
            if (obj == obj2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static void m56848b(ByteArrayOutputStream byteArrayOutputStream, int i) {
        MethodCollector.m26663i(3133);
        if (f66900b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 24);
            MethodCollector.m26664o(3133);
            return;
        }
        byteArrayOutputStream.write(i >>> 24);
        byteArrayOutputStream.write(i >>> 16);
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
        MethodCollector.m26664o(3133);
    }

    /* renamed from: a */
    private Object m56841a(byte b, ByteBuffer byteBuffer) {
        int i = 0;
        switch (b) {
            case 0:
                return null;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                int position = byteBuffer.position() % 8;
                if (position != 0) {
                    byteBuffer.position((byteBuffer.position() + 8) - position);
                }
                return Double.valueOf(byteBuffer.getDouble());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                byte[] bArr = new byte[m56847b(byteBuffer)];
                byteBuffer.get(bArr);
                return new String(bArr, f66901c);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                int b2 = m56847b(byteBuffer);
                ArrayList arrayList = new ArrayList(b2);
                while (i < b2) {
                    arrayList.add(m56849c(byteBuffer));
                    i++;
                }
                return arrayList;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                int b3 = m56847b(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i < b3) {
                    hashMap.put(m56849c(byteBuffer), m56849c(byteBuffer));
                    i++;
                }
                return hashMap;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    /* renamed from: a */
    private static void m56843a(ByteArrayOutputStream byteArrayOutputStream, long j) {
        MethodCollector.m26663i(3159);
        if (f66900b) {
            byteArrayOutputStream.write((byte) ((int) j));
            byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 56)));
            MethodCollector.m26664o(3159);
            return;
        }
        byteArrayOutputStream.write((byte) ((int) (j >>> 56)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
        byteArrayOutputStream.write((byte) ((int) j));
        MethodCollector.m26664o(3159);
    }

    /* renamed from: a */
    private void m56844a(ByteArrayOutputStream byteArrayOutputStream, Object obj, LinkedList<Object> linkedList) {
        int i;
        MethodCollector.m26663i(3324);
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            MethodCollector.m26664o(3324);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                i = 1;
            } else {
                i = 2;
            }
            byteArrayOutputStream.write(i);
            MethodCollector.m26664o(3324);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m56848b(byteArrayOutputStream, ((Number) obj).intValue());
                MethodCollector.m26664o(3324);
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                m56843a(byteArrayOutputStream, ((Long) obj).longValue());
                MethodCollector.m26664o(3324);
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(5);
                int size = byteArrayOutputStream.size() % 8;
                if (size != 0) {
                    for (int i2 = 0; i2 < 8 - size; i2++) {
                        byteArrayOutputStream.write(0);
                    }
                }
                m56843a(byteArrayOutputStream, Double.doubleToLongBits(((Number) obj).doubleValue()));
                MethodCollector.m26664o(3324);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                MethodCollector.m26664o(3324);
                throw illegalArgumentException;
            }
        } else if (obj instanceof String) {
            byteArrayOutputStream.write(6);
            m56845a(byteArrayOutputStream, ((String) obj).getBytes(f66901c));
            MethodCollector.m26664o(3324);
        } else if (obj instanceof List) {
            List<Object> list = (List) obj;
            if (list.isEmpty() || !m56846a(linkedList, obj)) {
                linkedList.addLast(obj);
                byteArrayOutputStream.write(7);
                m56842a(byteArrayOutputStream, list.size());
                for (Object obj2 : list) {
                    m56844a(byteArrayOutputStream, obj2, linkedList);
                }
                linkedList.removeLast();
                MethodCollector.m26664o(3324);
                return;
            }
            byteArrayOutputStream.write(0);
            new IllegalArgumentException("writeValue has cycle array!");
            MethodCollector.m26664o(3324);
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.isEmpty() || !m56846a(linkedList, obj)) {
                linkedList.addLast(obj);
                byteArrayOutputStream.write(8);
                m56842a(byteArrayOutputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    m56844a(byteArrayOutputStream, entry.getKey(), linkedList);
                    m56844a(byteArrayOutputStream, entry.getValue(), linkedList);
                }
                linkedList.removeLast();
                MethodCollector.m26664o(3324);
                return;
            }
            byteArrayOutputStream.write(0);
            new IllegalArgumentException("writeValue has cycle dict!");
            MethodCollector.m26664o(3324);
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() <= 0 || !m56846a(linkedList, obj)) {
                linkedList.addLast(obj);
                byteArrayOutputStream.write(8);
                m56842a(byteArrayOutputStream, jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m56844a(byteArrayOutputStream, next, linkedList);
                    m56844a(byteArrayOutputStream, jSONObject.opt(next), linkedList);
                }
                linkedList.removeLast();
                MethodCollector.m26664o(3324);
                return;
            }
            byteArrayOutputStream.write(0);
            new IllegalArgumentException("writeValue has cycle JSONObject!");
            MethodCollector.m26664o(3324);
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() <= 0 || !m56846a(linkedList, obj)) {
                linkedList.addLast(obj);
                byteArrayOutputStream.write(7);
                m56842a(byteArrayOutputStream, jSONArray.length());
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    m56844a(byteArrayOutputStream, jSONArray.opt(i3), linkedList);
                }
                linkedList.removeLast();
                MethodCollector.m26664o(3324);
                return;
            }
            byteArrayOutputStream.write(0);
            new IllegalArgumentException("writeValue has cycle JSONArray!");
            MethodCollector.m26664o(3324);
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(9);
            m56845a(byteArrayOutputStream, (byte[]) obj);
            MethodCollector.m26664o(3324);
        } else {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unsupported type: " + obj.getClass() + " value: " + obj);
            MethodCollector.m26664o(3324);
            throw illegalArgumentException2;
        }
    }
}
