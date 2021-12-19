package com.facebook.p1826c.p1828b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1829a.AbstractC24063b;
import com.facebook.common.p1829a.C24064c;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1832d.C24094l;
import com.facebook.p1826c.p1827a.AbstractC24022b;
import com.facebook.p1826c.p1827a.AbstractC24024d;
import com.facebook.p1826c.p1827a.C24029h;
import com.facebook.p1826c.p1827a.C24030i;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;

/* renamed from: com.facebook.c.b.c */
public final class C24042c {

    /* renamed from: a */
    public final int f56916a;

    /* renamed from: b */
    public final String f56917b;

    /* renamed from: c */
    public final AbstractC24093k<File> f56918c;

    /* renamed from: d */
    public final long f56919d;

    /* renamed from: e */
    public final long f56920e;

    /* renamed from: f */
    public final long f56921f;

    /* renamed from: g */
    public final AbstractC24055h f56922g;

    /* renamed from: h */
    public final AbstractC24022b f56923h;

    /* renamed from: i */
    public final AbstractC24024d f56924i;

    /* renamed from: j */
    public final AbstractC24063b f56925j;

    /* renamed from: k */
    public final Context f56926k;

    /* renamed from: l */
    public final boolean f56927l;

    static {
        Covode.recordClassIndex(28168);
    }

    /* renamed from: com.facebook.c.b.c$a */
    public static class C24043a {

        /* renamed from: a */
        public int f56928a;

        /* renamed from: b */
        public String f56929b;

        /* renamed from: c */
        public AbstractC24093k<File> f56930c;

        /* renamed from: d */
        public long f56931d;

        /* renamed from: e */
        public long f56932e;

        /* renamed from: f */
        public long f56933f;

        /* renamed from: g */
        public AbstractC24055h f56934g;

        /* renamed from: h */
        public AbstractC24022b f56935h;

        /* renamed from: i */
        public AbstractC24024d f56936i;

        /* renamed from: j */
        public AbstractC24063b f56937j;

        /* renamed from: k */
        public boolean f56938k;

        /* renamed from: l */
        public final Context f56939l;

        static {
            Covode.recordClassIndex(28169);
        }

        /* renamed from: a */
        public final C24042c mo39573a() {
            boolean z;
            if (this.f56930c == null && this.f56939l == null) {
                z = false;
            } else {
                z = true;
            }
            C24091i.m45623b(z, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f56930c == null && this.f56939l != null) {
                this.f56930c = new AbstractC24093k<File>() {
                    /* class com.facebook.p1826c.p1828b.C24042c.C24043a.C240441 */

                    static {
                        Covode.recordClassIndex(28170);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.facebook.common.p1832d.AbstractC24093k
                    /* renamed from: b */
                    public final /* synthetic */ File mo34217b() {
                        Context applicationContext = C24043a.this.f56939l.getApplicationContext();
                        if (C58003a.f132201c && applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                        if (C58016d.f132221b == null || !C58016d.f132224e) {
                            C58016d.f132221b = applicationContext.getCacheDir();
                        }
                        return C58016d.f132221b;
                    }
                };
            }
            return new C24042c(this, (byte) 0);
        }

        /* renamed from: a */
        public final C24043a mo39572a(File file) {
            this.f56930c = C24094l.m45626a(file);
            return this;
        }

        private C24043a(Context context) {
            this.f56928a = 1;
            this.f56929b = "image_cache";
            this.f56931d = 41943040;
            this.f56932e = 10485760;
            this.f56933f = 2097152;
            this.f56934g = new C24040b();
            this.f56939l = context;
        }

        /* synthetic */ C24043a(Context context, byte b) {
            this(context);
        }
    }

    /* renamed from: a */
    public static C24043a m45500a(Context context) {
        return new C24043a(context, (byte) 0);
    }

    private C24042c(C24043a aVar) {
        AbstractC24022b bVar;
        AbstractC24024d dVar;
        AbstractC24063b bVar2;
        this.f56916a = aVar.f56928a;
        this.f56917b = (String) C24091i.m45617a(aVar.f56929b);
        this.f56918c = (AbstractC24093k) C24091i.m45617a(aVar.f56930c);
        this.f56919d = aVar.f56931d;
        this.f56920e = aVar.f56932e;
        this.f56921f = aVar.f56933f;
        this.f56922g = (AbstractC24055h) C24091i.m45617a(aVar.f56934g);
        if (aVar.f56935h == null) {
            bVar = C24029h.m45463a();
        } else {
            bVar = aVar.f56935h;
        }
        this.f56923h = bVar;
        if (aVar.f56936i == null) {
            dVar = C24030i.m45464a();
        } else {
            dVar = aVar.f56936i;
        }
        this.f56924i = dVar;
        if (aVar.f56937j == null) {
            bVar2 = C24064c.m45574a();
        } else {
            bVar2 = aVar.f56937j;
        }
        this.f56925j = bVar2;
        this.f56926k = aVar.f56939l;
        this.f56927l = aVar.f56938k;
    }

    /* synthetic */ C24042c(C24043a aVar, byte b) {
        this(aVar);
    }
}
