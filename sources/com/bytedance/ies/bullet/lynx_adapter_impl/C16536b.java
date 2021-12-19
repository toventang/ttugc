package com.bytedance.ies.bullet.lynx_adapter_impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.lynx_adapter_impl.C16549d;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.AbstractC17609d;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.C17611f;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableTypeWrapper;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.C28368b;
import com.lynx.react.bridge.C28369c;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.C28716v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b */
public final class C16536b {
    static {
        Covode.recordClassIndex(18972);
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$h */
    public static final class C16544h implements DynamicWrapper {

        /* renamed from: a */
        final /* synthetic */ AbstractC28367a f39667a;

        static {
            Covode.recordClassIndex(18980);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final boolean asBoolean() {
            return this.f39667a.mo48553b();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final double asDouble() {
            return this.f39667a.mo48554c();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final int asInt() {
            return this.f39667a.mo48555d();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final String asString() {
            return this.f39667a.mo48556e();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final boolean isNull() {
            return this.f39667a.mo48552a();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final void recycle() {
            this.f39667a.mo48560i();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final ReadableArrayWrapper asArray() {
            return C16536b.m30715a(this.f39667a.mo48557f());
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final ReadableMapWrapper asMap() {
            return C16536b.m30716a(this.f39667a.mo48558g());
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.DynamicWrapper
        public final ReadableTypeWrapper getType() {
            return C16536b.m30717a(this.f39667a.mo48559h());
        }

        C16544h(AbstractC28367a aVar) {
            this.f39667a = aVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$j */
    public static final class C16546j implements ReadableArrayWrapper {

        /* renamed from: a */
        final /* synthetic */ ReadableArray f39669a;

        static {
            Covode.recordClassIndex(18982);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final int size() {
            return this.f39669a.size();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final ArrayList<Object> toArrayList() {
            return this.f39669a.toArrayList();
        }

        C16546j(ReadableArray readableArray) {
            this.f39669a = readableArray;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final boolean getBoolean(int i) {
            return this.f39669a.getBoolean(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final byte getByte(int i) {
            return this.f39669a.getByte(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final byte[] getByteArray(int i) {
            return this.f39669a.getByteArray(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final char getChar(int i) {
            return this.f39669a.getChar(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final double getDouble(int i) {
            return this.f39669a.getDouble(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final int getInt(int i) {
            return this.f39669a.getInt(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final long getLong(int i) {
            return this.f39669a.getLong(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final short getShort(int i) {
            return this.f39669a.getShort(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final String getString(int i) {
            return this.f39669a.getString(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final boolean isNull(int i) {
            return this.f39669a.isNull(i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final ReadableArrayWrapper getArray(int i) {
            return C16536b.m30715a(this.f39669a.getArray(i));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final DynamicWrapper getDynamic(int i) {
            C28368b a = C28368b.m56681a(this.f39669a, i);
            if (a != null) {
                return C16536b.m30714a(a);
            }
            return null;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final ReadableMapWrapper getMap(int i) {
            return C16536b.m30716a(this.f39669a.getMap(i));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper
        public final ReadableTypeWrapper getType(int i) {
            return C16536b.m30717a(this.f39669a.getType(i));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$k */
    public static final class C16547k implements ReadableMapWrapper {

        /* renamed from: a */
        final /* synthetic */ ReadableMap f39670a;

        static {
            Covode.recordClassIndex(18983);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final int size() {
            return this.f39670a.size();
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final HashMap<String, Object> toHashMap() {
            return this.f39670a.toHashMap();
        }

        C16547k(ReadableMap readableMap) {
            this.f39670a = readableMap;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final boolean getBoolean(String str) {
            return this.f39670a.getBoolean(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final byte[] getByteArray(String str) {
            return this.f39670a.getByteArray(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final double getDouble(String str) {
            return this.f39670a.getDouble(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final int getInt(String str) {
            return this.f39670a.getInt(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final String getString(String str) {
            return this.f39670a.getString(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final boolean isNull(String str) {
            return this.f39670a.isNull(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableArrayWrapper getArray(String str) {
            return C16536b.m30715a(this.f39670a.getArray(str));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final DynamicWrapper getDynamic(String str) {
            C28369c a = C28369c.m56691a(this.f39670a, str);
            if (a != null) {
                return C16536b.m30714a(a);
            }
            return null;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final Long getLong(String str) {
            return Long.valueOf(this.f39670a.getLong(str));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableMapWrapper getMap(String str) {
            return C16536b.m30716a(this.f39670a.getMap(str));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableTypeWrapper getType(String str) {
            return C16536b.m30717a(this.f39670a.getType(str));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final boolean hasKey(String str) {
            C89219l.m154719c(str, "");
            return this.f39670a.hasKey(str);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final boolean getBoolean(String str, boolean z) {
            return this.f39670a.getBoolean(str, z);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final byte[] getByteArray(String str, byte[] bArr) {
            C89219l.m154719c(bArr, "");
            return this.f39670a.getByteArray(str, bArr);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final double getDouble(String str, double d) {
            return this.f39670a.getDouble(str, d);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final int getInt(String str, int i) {
            return this.f39670a.getInt(str, i);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final String getString(String str, String str2) {
            return this.f39670a.getString(str, str2);
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableArrayWrapper getArray(String str, ReadableArrayWrapper readableArrayWrapper) {
            C89219l.m154719c(str, "");
            ReadableArrayWrapper a = C16536b.m30715a(this.f39670a.getArray(str));
            return a == null ? readableArrayWrapper : a;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final Long getLong(String str, long j) {
            return Long.valueOf(this.f39670a.getLong(str, j));
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper
        public final ReadableMapWrapper getMap(String str, ReadableMapWrapper readableMapWrapper) {
            C89219l.m154719c(str, "");
            ReadableMapWrapper a = C16536b.m30716a(this.f39670a.getMap(str));
            return a == null ? readableMapWrapper : a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$i */
    public static final class C16545i implements AbstractC17609d {

        /* renamed from: a */
        final /* synthetic */ Callback f39668a;

        static {
            Covode.recordClassIndex(18981);
        }

        C16545i(Callback callback) {
            this.f39668a = callback;
        }

        @Override // com.bytedance.ies.lynx.lynx_adapter.wrapper.AbstractC17609d
        /* renamed from: a */
        public final void mo26263a(Object... objArr) {
            C89219l.m154719c(objArr, "");
            this.f39668a.invoke(objArr);
        }
    }

    /* renamed from: a */
    public static final DynamicWrapper m30714a(AbstractC28367a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C16544h(aVar);
    }

    /* renamed from: a */
    public static final ReadableArrayWrapper m30715a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        return new C16546j(readableArray);
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$a */
    static final class C16537a extends AbstractC89220m implements AbstractC89172b<String, String> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39660a;

        static {
            Covode.recordClassIndex(18973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16537a(C28716v vVar) {
            super(1);
            this.f39660a = vVar;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(this.f39660a.mo49824c(str));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (String) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$b */
    static final class C16538b extends AbstractC89220m implements AbstractC89172b<String, Integer> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39661a;

        static {
            Covode.recordClassIndex(18974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16538b(C28716v vVar) {
            super(1);
            this.f39661a = vVar;
        }

        /* renamed from: a */
        public final Integer invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(Integer.valueOf(this.f39661a.mo49820a(str, 0)));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (Integer) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$c */
    static final class C16539c extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39662a;

        static {
            Covode.recordClassIndex(18975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16539c(C28716v vVar) {
            super(1);
            this.f39662a = vVar;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(Boolean.valueOf(this.f39662a.mo49822a(str, false)));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (Boolean) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$d */
    static final class C16540d extends AbstractC89220m implements AbstractC89172b<String, Float> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39663a;

        static {
            Covode.recordClassIndex(18976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16540d(C28716v vVar) {
            super(1);
            this.f39663a = vVar;
        }

        /* renamed from: a */
        public final Float invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(Float.valueOf(this.f39663a.mo49819a(str, 0.0f)));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (Float) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$e */
    static final class C16541e extends AbstractC89220m implements AbstractC89172b<String, Double> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39664a;

        static {
            Covode.recordClassIndex(18977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16541e(C28716v vVar) {
            super(1);
            this.f39664a = vVar;
        }

        /* renamed from: a */
        public final Double invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(Double.valueOf(this.f39664a.mo49818a(str, 0.0d)));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (Double) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$f */
    static final class C16542f extends AbstractC89220m implements AbstractC89172b<String, ReadableMap> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39665a;

        static {
            Covode.recordClassIndex(18978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16542f(C28716v vVar) {
            super(1);
            this.f39665a = vVar;
        }

        /* renamed from: a */
        public final ReadableMap invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(this.f39665a.mo49826e(str));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (ReadableMap) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.b$g */
    static final class C16543g extends AbstractC89220m implements AbstractC89172b<String, ReadableArray> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39666a;

        static {
            Covode.recordClassIndex(18979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16543g(C28716v vVar) {
            super(1);
            this.f39666a = vVar;
        }

        /* renamed from: a */
        public final ReadableArray invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(this.f39666a.mo49825d(str));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (ReadableArray) obj;
        }
    }

    /* renamed from: a */
    public static final ReadableMapWrapper m30716a(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new C16547k(readableMap);
    }

    /* renamed from: a */
    public static final C16549d m30713a(C17611f fVar) {
        Map map = null;
        if (fVar == null) {
            return null;
        }
        if (fVar.f42100b != null) {
            C16549d a = C16549d.C16550a.m30727a(fVar.f42100b);
            for (Map.Entry<String, Object> entry : fVar.f42099a.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                C89219l.m154719c(key, "");
                a.f39673a.mo48812a(key, C16549d.C16550a.m30729a(value));
            }
            return a;
        }
        Map<String, Object> map2 = fVar.f42099a;
        C16549d dVar = new C16549d();
        Object a2 = C16549d.C16550a.m30729a(map2);
        if (a2 instanceof Map) {
            map = a2;
        }
        TemplateData a3 = TemplateData.m56772a(map);
        C89219l.m154709a((Object) a3, "");
        dVar.f39673a = a3;
        return dVar;
    }

    /* renamed from: a */
    public static final ReadableTypeWrapper m30717a(ReadableType readableType) {
        if (readableType == null) {
            return null;
        }
        switch (C16548c.f39671a[readableType.ordinal()]) {
            case 1:
                return ReadableTypeWrapper.Boolean;
            case 2:
                return ReadableTypeWrapper.Int;
            case 3:
                return ReadableTypeWrapper.Number;
            case 4:
                return ReadableTypeWrapper.String;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return ReadableTypeWrapper.Map;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return ReadableTypeWrapper.Array;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return ReadableTypeWrapper.Long;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return ReadableTypeWrapper.ByteArray;
            default:
                return ReadableTypeWrapper.Null;
        }
    }

    /* renamed from: a */
    public static final AbstractC17609d m30718a(Callback callback) {
        if (callback == null) {
            return null;
        }
        return new C16545i(callback);
    }
}
