package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.twitter.sdk.android.core.internal.AbstractC87729h;
import com.twitter.sdk.android.core.internal.C87728g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.g */
public abstract class AbstractC87767g<T> {

    /* renamed from: a */
    protected final Context f199354a;

    /* renamed from: b */
    protected final AbstractC87766f<T> f199355b;

    /* renamed from: c */
    protected final AbstractC87729h f199356c;

    /* renamed from: d */
    protected final AbstractC87774m f199357d;

    /* renamed from: e */
    public final int f199358e;

    /* renamed from: f */
    public volatile long f199359f;

    /* renamed from: g */
    protected final List<AbstractC87775n> f199360g = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(103765);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo142225b();

    /* renamed from: c */
    public final List<File> mo142226c() {
        return this.f199357d.mo142241c();
    }

    /* renamed from: e */
    private void m152745e() {
        for (AbstractC87775n nVar : this.f199360g) {
            try {
                nVar.mo142229a();
            } catch (Exception unused) {
                C87728g.m152677b(this.f199354a, "One of the roll over listeners threw an exception");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo142224a() {
        boolean z = true;
        if (!this.f199357d.mo142240b()) {
            String b = mo142225b();
            this.f199357d.mo142236a(b);
            Context context = this.f199354a;
            C1764a.m5929a(Locale.US, "generated new file %s", new Object[]{b});
            C87728g.m152670a(context);
            this.f199359f = this.f199356c.mo142175a();
        } else {
            z = false;
        }
        m152745e();
        return z;
    }

    /* renamed from: d */
    public final void mo142227d() {
        List<File> d = this.f199357d.mo142242d();
        int i = this.f199358e;
        if (d.size() > i) {
            int size = d.size() - i;
            C87728g.m152671a(this.f199354a, C1764a.m5929a(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(d.size()), Integer.valueOf(i), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(C87769h.f199363a);
            for (File file : d) {
                treeSet.add(new C87768a(file, m152744a(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C87768a) it.next()).f199361a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.f199357d.mo142237a(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo142221a(AbstractC87775n nVar) {
        this.f199360g.add(nVar);
    }

    /* renamed from: a */
    public final void mo142223a(List<File> list) {
        this.f199357d.mo142237a(list);
    }

    /* renamed from: a */
    private static long m152744a(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo142222a(T t) {
        byte[] a = this.f199355b.mo142220a(t);
        int length = a.length;
        if (!this.f199357d.mo142239a(length)) {
            C1764a.m5929a(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.f199357d.mo142235a()), Integer.valueOf(length), 8000});
            C87728g.m152670a(this.f199354a);
            mo142224a();
        }
        this.f199357d.mo142238a(a);
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.g$a */
    static class C87768a {

        /* renamed from: a */
        final File f199361a;

        /* renamed from: b */
        final long f199362b;

        static {
            Covode.recordClassIndex(103766);
        }

        C87768a(File file, long j) {
            this.f199361a = file;
            this.f199362b = j;
        }
    }

    AbstractC87767g(Context context, AbstractC87766f<T> fVar, AbstractC87729h hVar, AbstractC87774m mVar, int i) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f199354a = applicationContext;
        this.f199355b = fVar;
        this.f199357d = mVar;
        this.f199356c = hVar;
        this.f199359f = hVar.mo142175a();
        this.f199358e = i;
    }
}
