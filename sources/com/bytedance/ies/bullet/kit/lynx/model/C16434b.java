package com.bytedance.ies.bullet.kit.lynx.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16379c;
import com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableType;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.C28368b;
import com.lynx.react.bridge.C28369c;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.C28716v;
import java.util.ArrayList;
import java.util.HashMap;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b */
public final class C16434b {
    static {
        Covode.recordClassIndex(18742);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$h */
    public static final class C16442h implements BulletDynamic {

        /* renamed from: a */
        final /* synthetic */ AbstractC28367a f39500a;

        static {
            Covode.recordClassIndex(18750);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final boolean asBoolean() {
            return this.f39500a.mo48553b();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final double asDouble() {
            return this.f39500a.mo48554c();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final int asInt() {
            return this.f39500a.mo48555d();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final String asString() {
            return this.f39500a.mo48556e();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final boolean isNull() {
            return this.f39500a.mo48552a();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final void recycle() {
            this.f39500a.mo48560i();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final BulletReadableArray asArray() {
            return C16434b.m30518a(this.f39500a.mo48557f());
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final BulletReadableMap asMap() {
            return C16434b.m30519a(this.f39500a.mo48558g());
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletDynamic
        public final BulletReadableType getType() {
            return C16434b.m30520a(this.f39500a.mo48559h());
        }

        C16442h(AbstractC28367a aVar) {
            this.f39500a = aVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$j */
    public static final class C16444j implements BulletReadableArray {

        /* renamed from: a */
        final /* synthetic */ ReadableArray f39502a;

        static {
            Covode.recordClassIndex(18752);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final int size() {
            return this.f39502a.size();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final ArrayList<Object> toArrayList() {
            return this.f39502a.toArrayList();
        }

        C16444j(ReadableArray readableArray) {
            this.f39502a = readableArray;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final boolean getBoolean(int i) {
            return this.f39502a.getBoolean(i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final byte getByte(int i) {
            return this.f39502a.getByte(i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final char getChar(int i) {
            return this.f39502a.getChar(i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final double getDouble(int i) {
            return this.f39502a.getDouble(i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final int getInt(int i) {
            return this.f39502a.getInt(i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final long getLong(int i) {
            return this.f39502a.getLong(i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final short getShort(int i) {
            return this.f39502a.getShort(i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final String getString(int i) {
            return this.f39502a.getString(i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final boolean isNull(int i) {
            return this.f39502a.isNull(i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final BulletReadableArray getArray(int i) {
            return C16434b.m30518a(this.f39502a.getArray(i));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final BulletDynamic getDynamic(int i) {
            C28368b a = C28368b.m56681a(this.f39502a, i);
            if (a != null) {
                return C16434b.m30517a(a);
            }
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final BulletReadableMap getMap(int i) {
            return C16434b.m30519a(this.f39502a.getMap(i));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableArray
        public final BulletReadableType getType(int i) {
            return C16434b.m30520a(this.f39502a.getType(i));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$k */
    public static final class C16445k implements BulletReadableMap {

        /* renamed from: a */
        final /* synthetic */ ReadableMap f39503a;

        static {
            Covode.recordClassIndex(18753);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final int size() {
            return this.f39503a.size();
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final HashMap<String, Object> toHashMap() {
            return this.f39503a.toHashMap();
        }

        C16445k(ReadableMap readableMap) {
            this.f39503a = readableMap;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final boolean getBoolean(String str) {
            return this.f39503a.getBoolean(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final double getDouble(String str) {
            return this.f39503a.getDouble(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final int getInt(String str) {
            return this.f39503a.getInt(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final String getString(String str) {
            return this.f39503a.getString(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final boolean isNull(String str) {
            return this.f39503a.isNull(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableArray getArray(String str) {
            return C16434b.m30518a(this.f39503a.getArray(str));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletDynamic getDynamic(String str) {
            C28369c a = C28369c.m56691a(this.f39503a, str);
            if (a != null) {
                return C16434b.m30517a(a);
            }
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableMap getMap(String str) {
            return C16434b.m30519a(this.f39503a.getMap(str));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableType getType(String str) {
            return C16434b.m30520a(this.f39503a.getType(str));
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final boolean hasKey(String str) {
            C89219l.m154719c(str, "");
            return this.f39503a.hasKey(str);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final boolean getBoolean(String str, boolean z) {
            return this.f39503a.getBoolean(str, z);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final double getDouble(String str, double d) {
            return this.f39503a.getDouble(str, d);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final int getInt(String str, int i) {
            return this.f39503a.getInt(str, i);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final String getString(String str, String str2) {
            return this.f39503a.getString(str, str2);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableArray getArray(String str, BulletReadableArray bulletReadableArray) {
            C89219l.m154719c(str, "");
            BulletReadableArray a = C16434b.m30518a(this.f39503a.getArray(str));
            return a == null ? bulletReadableArray : a;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap
        public final BulletReadableMap getMap(String str, BulletReadableMap bulletReadableMap) {
            C89219l.m154719c(str, "");
            BulletReadableMap a = C16434b.m30519a(this.f39503a.getMap(str));
            return a == null ? bulletReadableMap : a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$i */
    public static final class C16443i implements AbstractC16379c {

        /* renamed from: a */
        final /* synthetic */ Callback f39501a;

        static {
            Covode.recordClassIndex(18751);
        }

        C16443i(Callback callback) {
            this.f39501a = callback;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.api.AbstractC16379c
        /* renamed from: a */
        public final void mo26010a(Object... objArr) {
            C89219l.m154719c(objArr, "");
            this.f39501a.invoke(objArr);
        }
    }

    /* renamed from: a */
    public static final BulletDynamic m30517a(AbstractC28367a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C16442h(aVar);
    }

    /* renamed from: a */
    public static final BulletReadableArray m30518a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        return new C16444j(readableArray);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$a */
    static final class C16435a extends AbstractC89220m implements AbstractC89172b<String, String> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39493a;

        static {
            Covode.recordClassIndex(18743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16435a(C28716v vVar) {
            super(1);
            this.f39493a = vVar;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(this.f39493a.mo49824c(str));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (String) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$b */
    static final class C16436b extends AbstractC89220m implements AbstractC89172b<String, Integer> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39494a;

        static {
            Covode.recordClassIndex(18744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16436b(C28716v vVar) {
            super(1);
            this.f39494a = vVar;
        }

        /* renamed from: a */
        public final Integer invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(Integer.valueOf(this.f39494a.mo49820a(str, 0)));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (Integer) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$c */
    static final class C16437c extends AbstractC89220m implements AbstractC89172b<String, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39495a;

        static {
            Covode.recordClassIndex(18745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16437c(C28716v vVar) {
            super(1);
            this.f39495a = vVar;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(Boolean.valueOf(this.f39495a.mo49822a(str, false)));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (Boolean) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$d */
    static final class C16438d extends AbstractC89220m implements AbstractC89172b<String, Float> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39496a;

        static {
            Covode.recordClassIndex(18746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16438d(C28716v vVar) {
            super(1);
            this.f39496a = vVar;
        }

        /* renamed from: a */
        public final Float invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(Float.valueOf(this.f39496a.mo49819a(str, 0.0f)));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (Float) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$e */
    static final class C16439e extends AbstractC89220m implements AbstractC89172b<String, Double> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39497a;

        static {
            Covode.recordClassIndex(18747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16439e(C28716v vVar) {
            super(1);
            this.f39497a = vVar;
        }

        /* renamed from: a */
        public final Double invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(Double.valueOf(this.f39497a.mo49818a(str, 0.0d)));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (Double) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$f */
    static final class C16440f extends AbstractC89220m implements AbstractC89172b<String, ReadableMap> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39498a;

        static {
            Covode.recordClassIndex(18748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16440f(C28716v vVar) {
            super(1);
            this.f39498a = vVar;
        }

        /* renamed from: a */
        public final ReadableMap invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(this.f39498a.mo49826e(str));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            return (ReadableMap) obj;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.model.b$g */
    static final class C16441g extends AbstractC89220m implements AbstractC89172b<String, ReadableArray> {

        /* renamed from: a */
        final /* synthetic */ C28716v f39499a;

        static {
            Covode.recordClassIndex(18749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16441g(C28716v vVar) {
            super(1);
            this.f39499a = vVar;
        }

        /* renamed from: a */
        public final ReadableArray invoke(String str) {
            Object obj;
            C89219l.m154719c(str, "");
            try {
                obj = C89379q.m157068constructorimpl(this.f39499a.mo49825d(str));
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
    public static final BulletReadableMap m30519a(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new C16445k(readableMap);
    }

    /* renamed from: a */
    public static final BulletReadableType m30520a(ReadableType readableType) {
        if (readableType == null) {
            return null;
        }
        switch (C16446c.f39504a[readableType.ordinal()]) {
            case 1:
                return BulletReadableType.Boolean;
            case 2:
                return BulletReadableType.Int;
            case 3:
                return BulletReadableType.Number;
            case 4:
                return BulletReadableType.String;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return BulletReadableType.Map;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return BulletReadableType.Array;
            default:
                return BulletReadableType.Null;
        }
    }

    /* renamed from: a */
    public static final AbstractC16379c m30521a(Callback callback) {
        if (callback == null) {
            return null;
        }
        return new C16443i(callback);
    }
}
