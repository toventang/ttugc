package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import android.database.ContentObserver;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86637f;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.e */
public final class C86460e {

    /* renamed from: a */
    final Context f193902a;

    /* renamed from: b */
    public final ArrayList<String> f193903b = new ArrayList<>();

    /* renamed from: c */
    volatile boolean f193904c;

    /* renamed from: d */
    final ContentObserver f193905d = new ContentObserver() {
        /* class com.p2082ss.ttvideoengine.p4415h.C86460e.C864611 */

        static {
            Covode.recordClassIndex(101689);
        }

        public final void onChange(boolean z) {
            super.onChange(z);
            C86460e.this.mo137502a();
        }
    };

    static {
        Covode.recordClassIndex(101688);
    }

    /* renamed from: a */
    public final void mo137502a() {
        HashMap hashMap = new HashMap();
        hashMap.put("b", Float.valueOf((((float) C86637f.m150070b(this.f193902a)) * 1.0f) / 255.0f));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        this.f193903b.add(new JSONObject(hashMap).toString());
    }

    public C86460e(Context context) {
        this.f193902a = context;
    }
}
