package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.ttnet.org.chromium.net.AbstractC87536c;
import com.ttnet.org.chromium.net.AbstractC87547i;
import com.ttnet.org.chromium.net.AbstractC87658u;
import com.ttnet.org.chromium.net.AbstractC87670v;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class CronetEngineBuilderImpl extends AbstractC87547i {

    /* renamed from: F */
    private static final String f198654F = CronetEngineBuilderImpl.class.getSimpleName();

    /* renamed from: G */
    private static final Pattern f198655G = Pattern.compile("^[0-9\\.]*$");

    /* renamed from: A */
    public String f198656A;

    /* renamed from: B */
    public boolean f198657B;

    /* renamed from: C */
    public long f198658C;

    /* renamed from: D */
    public String f198659D;

    /* renamed from: E */
    public boolean f198660E;

    /* renamed from: a */
    public final Context f198661a;

    /* renamed from: b */
    public final List<C87556b> f198662b = new LinkedList();

    /* renamed from: c */
    public final List<C87555a> f198663c = new LinkedList();

    /* renamed from: d */
    public boolean f198664d;

    /* renamed from: e */
    public String f198665e;

    /* renamed from: f */
    public String f198666f;

    /* renamed from: g */
    public boolean f198667g;

    /* renamed from: h */
    public boolean f198668h;

    /* renamed from: i */
    public boolean f198669i;

    /* renamed from: j */
    public boolean f198670j;

    /* renamed from: k */
    public int f198671k;

    /* renamed from: l */
    public long f198672l;

    /* renamed from: m */
    public String f198673m;

    /* renamed from: n */
    public long f198674n;

    /* renamed from: o */
    public boolean f198675o;

    /* renamed from: p */
    int f198676p = 20;

    /* renamed from: q */
    public boolean f198677q;

    /* renamed from: r */
    public boolean f198678r;

    /* renamed from: s */
    public TTAppInfoProvider f198679s;

    /* renamed from: t */
    public AbstractC87670v f198680t;

    /* renamed from: u */
    public AbstractC87658u f198681u;

    /* renamed from: v */
    public String f198682v;

    /* renamed from: w */
    public ArrayList<byte[]> f198683w;

    /* renamed from: x */
    public Map<String[], Pair<byte[], byte[]>> f198684x;

    /* renamed from: y */
    public String f198685y;

    /* renamed from: z */
    public String f198686z;

    /* renamed from: com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl$a */
    public static class C87555a {

        /* renamed from: a */
        final String f198687a;

        /* renamed from: b */
        final byte[][] f198688b;

        /* renamed from: c */
        final boolean f198689c;

        /* renamed from: d */
        final Date f198690d;

        static {
            Covode.recordClassIndex(103522);
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141802a() {
        this.f198678r = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141815b() {
        this.f198669i = true;
        return this;
    }

    /* renamed from: b */
    public CronetEngineBuilderImpl mo141807a(AbstractC87536c.C87537a.AbstractC87539a aVar) {
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141821d() {
        this.f198675o = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public VersionSafeCallbacks.C87584a mo141841f() {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141813a(Map map) {
        this.f198684x = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141812a(ArrayList arrayList) {
        this.f198683w = arrayList;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141814a(boolean z) {
        this.f198668h = z;
        return this;
    }

    /* renamed from: e */
    public final String mo141840e() {
        return C87644s.m152412a(this.f198661a);
    }

    static {
        Covode.recordClassIndex(103521);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141819c(String str) {
        this.f198686z = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141825e(boolean z) {
        this.f198657B = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141826f(String str) {
        this.f198665e = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: g */
    public final AbstractC87547i mo141827g(String str) {
        this.f198659D = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141816b(String str) {
        this.f198685y = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141820c(boolean z) {
        this.f198677q = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141822d(String str) {
        this.f198656A = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141805a(long j) {
        this.f198658C = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141817b(boolean z) {
        this.f198667g = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141823d(boolean z) {
        this.f198660E = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* synthetic */ AbstractC87547i mo141803a(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.f198676p = i;
        return this;
    }

    public CronetEngineBuilderImpl(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f198661a = applicationContext;
        this.f198667g = false;
        this.f198668h = true;
        this.f198669i = false;
        mo141804a(0, 0);
        this.f198675o = false;
        this.f198664d = true;
        this.f198677q = false;
        this.f198660E = false;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141806a(TTAppInfoProvider tTAppInfoProvider) {
        this.f198679s = tTAppInfoProvider;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: e */
    public final /* synthetic */ AbstractC87547i mo141824e(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalArgumentException("create Storage path failed");
        } else if (file.isDirectory()) {
            this.f198666f = str;
            return this;
        } else {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141808a(AbstractC87658u uVar) {
        this.f198681u = uVar;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141809a(AbstractC87670v vVar) {
        this.f198680t = vVar;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87547i mo141810a(String str) {
        this.f198682v = str;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public CronetEngineBuilderImpl mo141804a(int i, long j) {
        boolean z;
        if (i == 3 || i == 2) {
            if (this.f198666f == null) {
                throw new IllegalArgumentException("Storage path must be set");
            }
        } else if (this.f198666f != null) {
            throw new IllegalArgumentException("Storage path must not be set");
        }
        if (i == 0 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f198670j = z;
        this.f198672l = j;
        if (i == 0) {
            this.f198671k = 0;
        } else if (i == 1) {
            this.f198671k = 2;
        } else if (i == 2 || i == 3) {
            this.f198671k = 1;
        } else {
            throw new IllegalArgumentException("Unknown cache mode");
        }
        return this;
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl$b */
    public static class C87556b {

        /* renamed from: a */
        final String f198691a;

        /* renamed from: b */
        final int f198692b;

        /* renamed from: c */
        final int f198693c;

        static {
            Covode.recordClassIndex(103523);
        }

        C87556b(String str, int i, int i2) {
            this.f198691a = str;
            this.f198692b = i;
            this.f198693c = i2;
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* synthetic */ AbstractC87547i mo141811a(String str, int i, int i2) {
        if (!str.contains("/")) {
            this.f198662b.add(new C87556b(str, i, i2));
            return this;
        }
        throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
    }
}
