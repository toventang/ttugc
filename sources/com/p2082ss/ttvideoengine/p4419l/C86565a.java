package com.p2082ss.ttvideoengine.p4419l;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.ttvideoengine.l.a */
public final class C86565a {

    /* renamed from: a */
    private ConcurrentHashMap<String, C86385d.C86395e> f195027a;

    static {
        Covode.recordClassIndex(101793);
    }

    /* renamed from: com.ss.ttvideoengine.l.a$a */
    public static class C86566a {

        /* renamed from: a */
        public static C86565a f195028a = new C86565a((byte) 0);

        static {
            Covode.recordClassIndex(101794);
        }
    }

    private C86565a() {
        this.f195027a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C86565a(byte b) {
        this();
    }

    /* renamed from: a */
    public final C86385d.C86395e mo137820a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f195027a.get(str);
        }
        C86641i.m150117e("MediaTaskCenter", "[preload] get, param is invalid key is null");
        return null;
    }

    /* renamed from: b */
    public final void mo137822b(String str) {
        if (TextUtils.isEmpty(str)) {
            C86641i.m150117e("MediaTaskCenter", "[preload] remove, param is invalid key is null");
        } else {
            this.f195027a.remove(str);
        }
    }

    /* renamed from: a */
    public final void mo137821a(String str, C86385d.C86395e eVar) {
        if (TextUtils.isEmpty(str) || eVar == null) {
            C86641i.m150117e("MediaTaskCenter", "[preload] param is invalid");
        } else {
            this.f195027a.put(str, eVar);
        }
    }
}
