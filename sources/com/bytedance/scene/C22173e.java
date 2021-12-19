package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.p1622d.C22171k;
import java.util.HashSet;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.scene.e */
public final class C22173e {

    /* renamed from: a */
    private static final WeakHashMap<Activity, HashSet<String>> f52407a = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(25977);
    }

    /* renamed from: b */
    static void m41663b(Activity activity, String str) {
        f52407a.get(activity).remove(str);
    }

    /* renamed from: com.bytedance.scene.e$a */
    public static final class C22175a {

        /* renamed from: a */
        public final Activity f52413a;

        /* renamed from: b */
        public final Class<? extends AbstractC22186b> f52414b;

        /* renamed from: c */
        public Bundle f52415c;

        /* renamed from: d */
        public int f52416d;

        /* renamed from: e */
        public boolean f52417e;

        /* renamed from: f */
        public AbstractC22231l f52418f;

        /* renamed from: g */
        public String f52419g;

        /* renamed from: h */
        public boolean f52420h;

        static {
            Covode.recordClassIndex(25979);
        }

        private C22175a(Activity activity, Class<? extends AbstractC22186b> cls) {
            this.f52416d = 16908290;
            this.f52419g = "LifeCycleFragment";
            this.f52420h = true;
            this.f52413a = (Activity) C22171k.m41656a(activity, "Activity can't be null");
            this.f52414b = (Class) C22171k.m41656a(cls, "Root Scene class can't be null");
        }

        public /* synthetic */ C22175a(Activity activity, Class cls, byte b) {
            this(activity, cls);
        }
    }

    /* renamed from: a */
    public static void m41662a(Activity activity, String str) {
        WeakHashMap<Activity, HashSet<String>> weakHashMap = f52407a;
        if (weakHashMap.get(activity) == null || !weakHashMap.get(activity).contains(str)) {
            HashSet<String> hashSet = weakHashMap.get(activity);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                weakHashMap.put(activity, hashSet);
            }
            hashSet.add(str);
            return;
        }
        throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Activity");
    }
}
