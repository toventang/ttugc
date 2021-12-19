package com.bytedance.push;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.notification.C21879h;
import com.bytedance.push.p1589b.AbstractC21762a;
import com.bytedance.push.p1590c.AbstractC21770a;
import com.bytedance.push.p1590c.AbstractC21771b;
import com.bytedance.push.p1590c.AbstractC21772c;
import com.bytedance.push.p1590c.AbstractC21773d;
import com.bytedance.push.p1590c.AbstractC21782m;
import com.bytedance.push.p1590c.AbstractC21783n;
import com.bytedance.push.p1590c.AbstractC21785p;
import com.bytedance.push.p1590c.AbstractC21787q;
import com.bytedance.push.p1596g.AbstractC21824b;
import com.p2082ss.android.message.AbstractC30063b;
import com.p2082ss.android.pushmanager.AbstractC30216c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.push.c */
public final class C21767c {

    /* renamed from: a */
    public final Application f51581a;

    /* renamed from: b */
    public final int f51582b;

    /* renamed from: c */
    public final int f51583c;

    /* renamed from: d */
    public final int f51584d;

    /* renamed from: e */
    public final String f51585e;

    /* renamed from: f */
    public final boolean f51586f;

    /* renamed from: g */
    public final String f51587g;

    /* renamed from: h */
    public final String f51588h;

    /* renamed from: i */
    public final String f51589i;

    /* renamed from: j */
    public final C21769b f51590j;

    /* renamed from: k */
    public final List<AbstractC30063b> f51591k;

    /* renamed from: l */
    public final AbstractC21773d f51592l;

    /* renamed from: m */
    public final C21879h f51593m;

    /* renamed from: n */
    public final String f51594n;

    /* renamed from: o */
    public final AbstractC21787q f51595o;

    /* renamed from: p */
    public final AbstractC21770a f51596p;

    /* renamed from: q */
    public final AbstractC30216c f51597q;

    /* renamed from: r */
    public final AbstractC21772c f51598r;

    /* renamed from: s */
    public final AbstractC21782m f51599s;

    /* renamed from: t */
    public final AbstractC21824b f51600t;

    /* renamed from: u */
    public final AbstractC21785p f51601u;

    /* renamed from: v */
    public final String f51602v;

    /* renamed from: w */
    public final boolean f51603w;

    /* renamed from: x */
    public final AbstractC21771b f51604x;

    /* renamed from: y */
    public final boolean f51605y;

    /* renamed from: z */
    public final long f51606z;

    static {
        Covode.recordClassIndex(25416);
    }

    /* renamed from: com.bytedance.push.c$a */
    public static class C21768a {

        /* renamed from: a */
        public final Application f51607a;

        /* renamed from: b */
        public boolean f51608b;

        /* renamed from: c */
        public String f51609c;

        /* renamed from: d */
        public C21769b f51610d;

        /* renamed from: e */
        public List<AbstractC30063b> f51611e = new ArrayList();

        /* renamed from: f */
        public AbstractC21773d f51612f;

        /* renamed from: g */
        public AbstractC21783n f51613g;

        /* renamed from: h */
        public String f51614h;

        /* renamed from: i */
        public AbstractC21787q f51615i;

        /* renamed from: j */
        public AbstractC21770a f51616j;

        /* renamed from: k */
        public boolean f51617k;

        /* renamed from: l */
        public AbstractC30216c f51618l;

        /* renamed from: m */
        public AbstractC21772c f51619m;

        /* renamed from: n */
        public AbstractC21762a f51620n;

        /* renamed from: o */
        public AbstractC21782m f51621o;

        /* renamed from: p */
        public AbstractC21824b f51622p;

        /* renamed from: q */
        public AbstractC21785p f51623q;

        /* renamed from: r */
        public C21757a f51624r;

        /* renamed from: s */
        public String f51625s;

        /* renamed from: t */
        public boolean f51626t;

        /* renamed from: u */
        public AbstractC21771b f51627u;

        /* renamed from: v */
        public boolean f51628v;

        /* renamed from: w */
        public long f51629w = TimeUnit.MINUTES.toMillis(2);

        static {
            Covode.recordClassIndex(25417);
        }

        /* renamed from: a */
        public final void mo35411a(String str) {
            if (this.f51608b) {
                throw new IllegalArgumentException(str);
            }
        }

        public C21768a(Application application, C21757a aVar) {
            this.f51607a = application;
            this.f51624r = aVar;
        }
    }

    /* renamed from: com.bytedance.push.c$b */
    public static class C21769b {

        /* renamed from: a */
        public String f51630a;

        /* renamed from: b */
        public String f51631b;

        static {
            Covode.recordClassIndex(25418);
        }

        public C21769b(String str, String str2) {
            this.f51630a = str2;
            this.f51631b = str;
        }
    }

    private C21767c(Application application, C21757a aVar, boolean z, String str, C21769b bVar, List<AbstractC30063b> list, AbstractC21773d dVar, C21879h hVar, String str2, AbstractC21787q qVar, AbstractC21770a aVar2, AbstractC30216c cVar, AbstractC21772c cVar2, AbstractC21782m mVar, AbstractC21824b bVar2, AbstractC21785p pVar, String str3, boolean z2, AbstractC21771b bVar3, C21768a aVar3) {
        this.f51581a = application;
        this.f51582b = aVar.f51561a;
        this.f51583c = aVar.f51562b;
        this.f51584d = aVar.f51564d;
        this.f51585e = aVar.f51563c;
        this.f51587g = aVar.f51565e;
        this.f51589i = aVar.f51566f;
        this.f51586f = z;
        this.f51588h = str;
        this.f51590j = bVar;
        this.f51591k = new CopyOnWriteArrayList(list);
        this.f51592l = dVar;
        this.f51593m = hVar;
        this.f51594n = str2;
        this.f51595o = qVar;
        this.f51596p = aVar2;
        this.f51597q = cVar;
        this.f51598r = cVar2;
        this.f51599s = mVar;
        this.f51600t = bVar2;
        this.f51601u = pVar;
        this.f51602v = str3;
        this.f51603w = z2;
        this.f51604x = bVar3;
        this.f51605y = aVar3.f51628v;
        this.f51606z = aVar3.f51629w;
    }

    public /* synthetic */ C21767c(Application application, C21757a aVar, boolean z, String str, C21769b bVar, List list, AbstractC21773d dVar, C21879h hVar, String str2, AbstractC21787q qVar, AbstractC21770a aVar2, AbstractC30216c cVar, AbstractC21772c cVar2, AbstractC21782m mVar, AbstractC21824b bVar2, AbstractC21785p pVar, String str3, boolean z2, AbstractC21771b bVar3, C21768a aVar3, byte b) {
        this(application, aVar, z, str, bVar, list, dVar, hVar, str2, qVar, aVar2, cVar, cVar2, mVar, bVar2, pVar, str3, z2, bVar3, aVar3);
    }
}
