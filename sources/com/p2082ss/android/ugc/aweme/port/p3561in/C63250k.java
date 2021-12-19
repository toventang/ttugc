package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27246l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.port.in.k */
public final class C63250k {

    /* renamed from: a */
    public boolean f143613a;

    /* renamed from: b */
    public final Set<Activity> f143614b;

    /* renamed from: c */
    public int f143615c;

    /* renamed from: d */
    public int f143616d;

    /* renamed from: e */
    public int f143617e;

    /* renamed from: f */
    public boolean f143618f;

    /* renamed from: g */
    private final List<Object> f143619g;

    /* renamed from: h */
    private final List<Object> f143620h;

    static {
        Covode.recordClassIndex(74523);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.k$a */
    public static class C63252a {

        /* renamed from: a */
        public static final C63250k f143622a = new C63250k((byte) 0);

        static {
            Covode.recordClassIndex(74525);
        }
    }

    /* renamed from: a */
    public final void mo101729a() {
        if (!this.f143618f) {
            throw new IllegalStateException("call this method after CreativeActivityMonitor is inited!");
        }
    }

    /* renamed from: b */
    public final void mo101732b() {
        Iterator<Object> it = this.f143620h.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private C63250k() {
        this.f143614b = Collections.newSetFromMap(new WeakHashMap());
        this.f143619g = new ArrayList();
        this.f143620h = new ArrayList();
        this.f143615c = 2;
        this.f143616d = 0;
        this.f143617e = 0;
        this.f143618f = false;
    }

    /* synthetic */ C63250k(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo101730a(int i) {
        this.f143615c = i;
        Iterator<Object> it = this.f143619g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public static boolean m114605a(Activity activity) {
        if (TextUtils.equals(activity.getClass().getSimpleName(), "LiveBgBroadcastActivity") || TextUtils.equals(activity.getClass().getSimpleName(), "LiveBroadcastActivity")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo101731a(AbstractC27246l<Activity> lVar) {
        mo101729a();
        for (Activity activity : this.f143614b) {
            if (lVar.mo45331a(activity)) {
                return true;
            }
        }
        return false;
    }
}
