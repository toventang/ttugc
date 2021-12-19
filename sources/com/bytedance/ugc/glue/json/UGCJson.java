package com.bytedance.ugc.glue.json;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import org.json.JSONObject;

public class UGCJson {
    private static UGCJson instance = new UGCJson();

    /* access modifiers changed from: protected */
    public <T> T fromJsonImpl(Object obj, Type type) {
        return null;
    }

    /* access modifiers changed from: protected */
    public String toJsonImpl(Object obj) {
        return "";
    }

    /* renamed from: com.bytedance.ugc.glue.json.UGCJson$a */
    static class C23513a implements GenericArrayType {

        /* renamed from: a */
        private final Type f55716a;

        static {
            Covode.recordClassIndex(27535);
        }

        public final Type getGenericComponentType() {
            return this.f55716a;
        }

        private C23513a(Type type) {
            this.f55716a = type;
        }

        /* synthetic */ C23513a(Type type, byte b) {
            this(type);
        }
    }

    /* renamed from: com.bytedance.ugc.glue.json.UGCJson$b */
    static class C23514b implements ParameterizedType {

        /* renamed from: a */
        private final Type f55717a;

        /* renamed from: b */
        private final Type[] f55718b;

        static {
            Covode.recordClassIndex(27536);
        }

        public final Type getOwnerType() {
            return null;
        }

        public final Type[] getActualTypeArguments() {
            return this.f55718b;
        }

        public final Type getRawType() {
            return this.f55717a;
        }

        /* renamed from: a */
        private static void m44221a(Type type) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    throw new IllegalArgumentException("ParameterizedType doesn't support primitive Type: ".concat(String.valueOf(cls)));
                }
            }
        }

        private C23514b(Type type, Type... typeArr) {
            this.f55717a = type;
            this.f55718b = typeArr;
            m44221a(type);
            for (Type type2 : typeArr) {
                m44221a(type2);
            }
        }

        /* synthetic */ C23514b(Type type, Type[] typeArr, byte b) {
            this(type, typeArr);
        }
    }

    protected UGCJson() {
    }

    private static UGCJson getInstance() {
        return instance;
    }

    public final void register() {
        instance = this;
    }

    static {
        Covode.recordClassIndex(27534);
    }

    public static Type buildGenericArrayType(Type type) {
        return new C23513a(type, (byte) 0);
    }

    public static JSONObject jsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String toJson(Object obj) {
        return getInstance().toJsonImpl(obj);
    }

    public static JSONObject mergeJSONObject(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    try {
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject.putOpt(next, jSONObject2.get(next));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject jsonObject(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", th.getClass().getName());
            jSONObject.put("message", th.getMessage());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i = 0;
            while (i < 10 && i < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                jSONObject.put("trace".concat(String.valueOf(i)), stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName() + "@" + stackTraceElement.getLineNumber());
                i++;
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static Type buildParameterizedType(Type type, Type... typeArr) {
        return new C23514b(type, typeArr, (byte) 0);
    }

    public static <T> T convert(Object obj, Type type) {
        return (T) getInstance().convertImpl(obj, type);
    }

    public static <T> T fromJson(InputStream inputStream, Type type) {
        return (T) getInstance().fromJsonImpl(new InputStreamReader(inputStream), type);
    }

    /* access modifiers changed from: protected */
    public <T> T convertImpl(Object obj, Type type) {
        return (T) fromJsonImpl(toJsonImpl(obj), type);
    }

    public static <T> T fromJson(Reader reader, Type type) {
        return (T) getInstance().fromJsonImpl(reader, type);
    }

    public static <T> T fromJson(String str, Type type) {
        return (T) getInstance().fromJsonImpl(str, type);
    }

    public static JSONObject put(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!(str == null || obj == null)) {
            try {
                jSONObject.put(str, obj);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
