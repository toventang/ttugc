package com.bytedance.lighten.p1477a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20729f;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20731h;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20734k;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20735l;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20737n;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.lighten.a.v */
public class C20766v {

    /* renamed from: P */
    public static final C20766v f49087P;

    /* renamed from: A */
    public EnumC20760q f49088A = EnumC20760q.MEDIUM;

    /* renamed from: B */
    public String f49089B;

    /* renamed from: C */
    public Executor f49090C;

    /* renamed from: D */
    public EnumC20739d f49091D = EnumC20739d.DEFAULT;

    /* renamed from: E */
    public AbstractC20755l f49092E;

    /* renamed from: F */
    public ImageView f49093F;

    /* renamed from: G */
    public AbstractC20734k f49094G;

    /* renamed from: H */
    public AbstractC20735l f49095H;

    /* renamed from: I */
    public AbstractC20737n f49096I;

    /* renamed from: J */
    public boolean f49097J;

    /* renamed from: K */
    public boolean f49098K;

    /* renamed from: L */
    public boolean f49099L;

    /* renamed from: M */
    public C20714a f49100M;

    /* renamed from: N */
    public int f49101N = C20713a.f48937a.f48938b;

    /* renamed from: O */
    public AbstractC20729f f49102O;

    /* renamed from: Q */
    private Object f49103Q;

    /* renamed from: a */
    public Uri f49104a;

    /* renamed from: b */
    public Context f49105b;

    /* renamed from: c */
    public boolean f49106c;

    /* renamed from: d */
    public boolean f49107d = true;

    /* renamed from: e */
    public boolean f49108e;

    /* renamed from: f */
    public int f49109f = -1;

    /* renamed from: g */
    public boolean f49110g;

    /* renamed from: h */
    public int f49111h = -1;

    /* renamed from: i */
    public int f49112i = -1;

    /* renamed from: j */
    public int f49113j = -1;

    /* renamed from: k */
    public int f49114k = -1;

    /* renamed from: l */
    public int f49115l = -1;

    /* renamed from: m */
    public int f49116m = -1;

    /* renamed from: n */
    public Drawable f49117n;

    /* renamed from: o */
    public EnumC20767w f49118o;

    /* renamed from: p */
    public int f49119p = -1;

    /* renamed from: q */
    public EnumC20767w f49120q;

    /* renamed from: r */
    public Drawable f49121r;

    /* renamed from: s */
    public int f49122s;

    /* renamed from: t */
    public EnumC20767w f49123t;

    /* renamed from: u */
    public Bitmap.Config f49124u;

    /* renamed from: v */
    public EnumC20767w f49125v;

    /* renamed from: w */
    public C20745e f49126w;

    /* renamed from: x */
    public C20717b f49127x;

    /* renamed from: y */
    public C20749f f49128y;

    /* renamed from: z */
    public C20768x f49129z;

    /* renamed from: a */
    public final C20766v mo34175a() {
        this.f49097J = true;
        this.f49109f = 1;
        return this;
    }

    static {
        Covode.recordClassIndex(24339);
        C20766v vVar = new C20766v(new C20714a(Collections.emptyList()));
        vVar.f49104a = Uri.parse("");
        f49087P = vVar;
    }

    /* renamed from: c */
    public final void mo34186c() {
        if (this.f49092E == null && this.f49093F == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView to display, use with(view)");
        }
        C20761r.m39062a(mo34183b());
    }

    /* renamed from: b */
    public final C20765u mo34183b() {
        String str;
        C20714a aVar;
        if (!(this.f49103Q == null || this.f49100M != null || this.f49104a != null || C20761r.m39055a().f49011p == null || C20761r.m39055a().f49011p.mo34127a() == null)) {
            this.f49100M = C20761r.m39055a().f49011p.mo34127a().mo34126a(this.f49103Q, this);
        }
        if (this.f49104a == null && ((aVar = this.f49100M) == null || aVar.mo34125a())) {
            return null;
        }
        if (this.f49124u == null) {
            this.f49124u = C20761r.m39055a().f48997b;
        }
        if (this.f49109f == -1) {
            this.f49109f = C20761r.m39055a().f48998c;
        }
        if (this == f49087P) {
            Context applicationContext = C20761r.m39055a().f48996a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f49105b = applicationContext;
        }
        if (this.f49105b == null) {
            AbstractC20755l lVar = this.f49092E;
            if (lVar instanceof View) {
                Context context = ((View) lVar).getContext();
                this.f49105b = context;
                if (!(context instanceof Activity)) {
                    if (context instanceof ContextWrapper) {
                        this.f49105b = ((ContextWrapper) context).getBaseContext();
                    }
                }
            } else {
                ImageView imageView = this.f49093F;
                if (imageView != null) {
                    Context context2 = imageView.getContext();
                    this.f49105b = context2;
                    if (!(context2 instanceof Activity)) {
                        if (context2 instanceof ContextWrapper) {
                            this.f49105b = ((ContextWrapper) context2).getBaseContext();
                        }
                    }
                }
            }
            if (this.f49105b == null) {
                this.f49105b = C20761r.m39055a().f48996a;
            }
        }
        Context context3 = this.f49105b;
        if (context3 == null || !(context3 instanceof Activity)) {
            str = "";
        } else {
            str = context3.getClass().getSimpleName();
        }
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.f49089B)) {
                this.f49089B = str + "-" + this.f49089B;
            } else {
                this.f49089B = str;
            }
        }
        TextUtils.isEmpty(this.f49089B);
        return new C20765u(this);
    }

    /* renamed from: b */
    public final C20766v mo34185b(int[] iArr) {
        if (iArr.length == 2) {
            this.f49113j = iArr[0];
            this.f49114k = iArr[1];
            return this;
        }
        throw new IllegalArgumentException("Lighten:the array size must be 2, first is width, second is height");
    }

    public C20766v(Uri uri) {
        this.f49104a = uri;
    }

    /* renamed from: a */
    public final C20766v mo34178a(AbstractC20731h hVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hVar);
        this.f49129z = new C20768x(arrayList);
        return this;
    }

    public C20766v(C20714a aVar) {
        this.f49100M = aVar;
    }

    /* renamed from: a */
    public final C20766v mo34179a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f49089B = str;
        }
        return this;
    }

    public C20766v(Object obj) {
        this.f49103Q = obj;
    }

    /* renamed from: a */
    public final C20766v mo34180a(int[] iArr) {
        if (iArr.length == 2) {
            this.f49111h = iArr[0];
            this.f49112i = iArr[1];
            return this;
        }
        throw new IllegalArgumentException("Lighten:the array size must be 2, first is width, second is height");
    }

    public C20766v(String str) {
        this.f49104a = Uri.parse(str);
    }

    /* renamed from: a */
    public final void mo34181a(AbstractC20734k kVar) {
        if (this.f49092E == null && this.f49093F == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView to display, use with(view)");
        }
        this.f49094G = kVar;
        C20761r.m39062a(mo34183b());
    }

    /* renamed from: a */
    public final void mo34182a(AbstractC20737n nVar) {
        this.f49096I = nVar;
        C20761r.m39065b(mo34183b());
    }

    /* renamed from: b */
    public final C20766v mo34184b(int i, int i2) {
        this.f49113j = i;
        this.f49114k = i2;
        return this;
    }

    /* renamed from: a */
    public final C20766v mo34176a(int i, int i2) {
        this.f49111h = i;
        this.f49112i = i2;
        return this;
    }

    /* renamed from: a */
    public final C20766v mo34177a(int i, AbstractC20729f fVar) {
        this.f49101N = i;
        this.f49102O = fVar;
        return this;
    }
}
