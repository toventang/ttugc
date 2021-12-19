package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.settings.storage.c */
public final class C21901c extends C21909g {

    /* renamed from: a */
    public final String f51875a;

    /* renamed from: b */
    private final Context f51876b;

    static {
        Covode.recordClassIndex(25565);
    }

    /* renamed from: com.bytedance.push.settings.storage.c$a */
    final class SharedPreferences$EditorC21902a implements SharedPreferences.Editor {

        /* renamed from: b */
        private final Context f51878b;

        /* renamed from: c */
        private Map<String, String> f51879c = new ConcurrentHashMap();

        /* renamed from: d */
        private final SharedPreferences.Editor f51880d;

        static {
            Covode.recordClassIndex(25566);
        }

        public final SharedPreferences.Editor clear() {
            throw new UnsupportedOperationException("clear not support");
        }

        public final void apply() {
            this.f51880d.apply();
            m41133a();
        }

        public final boolean commit() {
            boolean commit = this.f51880d.commit();
            m41133a();
            return commit;
        }

        /* renamed from: a */
        private void m41133a() {
            for (Map.Entry<String, String> entry : this.f51879c.entrySet()) {
                PushProvider.m41124a(this.f51878b, C21901c.this.f51875a, entry.getKey(), entry.getValue()).run();
            }
            this.f51879c.clear();
        }

        public final SharedPreferences.Editor remove(String str) {
            this.f51880d.remove(str);
            this.f51879c.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new UnsupportedOperationException("not support putStringSet");
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f51880d.putBoolean(str, z);
            if (z == C21901c.this.mo35651a(str, false)) {
                this.f51879c.remove(str);
            } else {
                this.f51879c.put(str, "boolean");
            }
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f) {
            this.f51880d.putFloat(str, f);
            if (f == C21901c.this.mo35644a(str, 0.0f)) {
                this.f51879c.remove(str);
            } else {
                this.f51879c.put(str, "float");
            }
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i) {
            this.f51880d.putInt(str, i);
            if (i == C21901c.this.mo35645a(str, 0)) {
                this.f51879c.remove(str);
            } else {
                this.f51879c.put(str, "integer");
            }
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j) {
            this.f51880d.putLong(str, j);
            if (j == C21901c.this.mo35646a(str, 0L)) {
                this.f51879c.remove(str);
            } else {
                this.f51879c.put(str, "long");
            }
            return this;
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            this.f51880d.putString(str, str2);
            if (TextUtils.equals(C21901c.this.mo35648a(str, (String) null), str2)) {
                this.f51879c.remove(str);
            } else {
                this.f51879c.put(str, "string");
            }
            return this;
        }

        SharedPreferences$EditorC21902a(Context context, SharedPreferences.Editor editor) {
            this.f51878b = context;
            this.f51880d = editor;
        }
    }

    @Override // com.bytedance.push.settings.storage.C21909g, com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final /* synthetic */ SharedPreferences.Editor mo35633a() {
        return new SharedPreferences$EditorC21902a(this.f51876b, super.mo35633a());
    }

    C21901c(Context context, String str) {
        super(context, str);
        this.f51875a = str;
        this.f51876b = context;
    }
}
