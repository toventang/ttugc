package com.p2082ss.texturerender.p4404a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.AbstractC86206n;
import com.p2082ss.texturerender.C86211p;

/* renamed from: com.ss.texturerender.a.a */
public abstract class AbstractC86171a {

    /* renamed from: a */
    protected int f192172a;

    /* renamed from: b */
    protected int f192173b;

    /* renamed from: c */
    protected int f192174c;

    /* renamed from: d */
    public C86211p f192175d;

    /* renamed from: e */
    public Bundle f192176e;

    /* renamed from: f */
    public AbstractC86206n f192177f;

    /* renamed from: g */
    public AbstractC86171a f192178g;

    /* renamed from: h */
    public AbstractC86171a f192179h;

    static {
        Covode.recordClassIndex(101314);
    }

    /* renamed from: a */
    public abstract C86176f mo136471a(C86176f fVar, C86179i iVar);

    /* renamed from: b */
    public String mo136476b(int i) {
        return "";
    }

    /* renamed from: a */
    public AbstractC86171a mo136470a() {
        AbstractC86171a aVar = this.f192179h;
        mo136491b();
        return aVar;
    }

    /* renamed from: b */
    private void mo136491b() {
        AbstractC86171a aVar = this.f192178g;
        if (aVar != null) {
            aVar.f192179h = this.f192179h;
        }
        AbstractC86171a aVar2 = this.f192179h;
        if (aVar2 != null) {
            aVar2.f192178g = aVar;
        }
        this.f192179h = null;
        this.f192178g = null;
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(getClass().getSimpleName()).append("[").append(this.f192174c).append("]->");
        AbstractC86171a aVar = this.f192179h;
        if (aVar != null) {
            str = aVar.toString();
        } else {
            str = "end";
        }
        return append.append(str).toString();
    }

    /* renamed from: a */
    public int mo136469a(Bundle bundle) {
        this.f192176e = bundle;
        return 0;
    }

    public AbstractC86171a(int i) {
        this.f192172a = i;
    }

    /* renamed from: b */
    public void mo136477b(Bundle bundle) {
        AbstractC86171a aVar = this.f192179h;
        if (aVar != null) {
            aVar.mo136477b(bundle);
        }
    }

    /* renamed from: a */
    public int mo136468a(int i) {
        if (i == 10004) {
            return this.f192173b;
        }
        if (i == 10005) {
            return this.f192172a;
        }
        if (i != 10011) {
            return -1;
        }
        return this.f192174c;
    }

    /* renamed from: a */
    public final void mo136475a(AbstractC86171a aVar) {
        AbstractC86171a aVar2;
        AbstractC86171a aVar3 = this;
        while (true) {
            int i = aVar.f192174c;
            if (i <= aVar3.f192174c) {
                aVar2 = aVar3.f192179h;
                if (aVar2 == null) {
                    aVar3.f192179h = aVar;
                    return;
                } else if (aVar2.f192174c < i) {
                    aVar.f192178g = aVar3;
                    aVar.f192179h = aVar2;
                    aVar3.f192179h.f192178g = aVar;
                    aVar3.f192179h = aVar;
                    return;
                }
            } else {
                aVar2 = aVar3.f192178g;
                if (aVar2 == null) {
                    aVar3.f192178g = aVar;
                    return;
                } else if (aVar2.f192174c >= i) {
                    aVar2.f192179h = aVar;
                    aVar.f192178g = aVar2;
                    aVar.f192179h = aVar3;
                    aVar3.f192178g = aVar;
                    return;
                }
            }
            aVar3 = aVar2;
        }
    }

    /* renamed from: a */
    public void mo136472a(int i, float f) {
        AbstractC86171a aVar = this.f192179h;
        if (aVar != null) {
            aVar.mo136472a(i, f);
        }
    }

    /* renamed from: a */
    public void mo136473a(int i, int i2) {
        AbstractC86171a aVar;
        if (i != 10011) {
            AbstractC86171a aVar2 = this.f192179h;
            if (aVar2 != null) {
                aVar2.mo136473a(i, i2);
                return;
            }
            return;
        }
        this.f192174c = i2;
        AbstractC86171a aVar3 = this.f192178g;
        if ((aVar3 != null && i2 > aVar3.f192174c) || ((aVar = this.f192179h) != null && i2 < aVar.f192174c)) {
            mo136491b();
            mo136475a(this);
        }
    }

    /* renamed from: a */
    public void mo136474a(int i, float[] fArr) {
        AbstractC86171a aVar = this.f192179h;
        if (aVar != null) {
            aVar.mo136474a(i, fArr);
        }
    }
}
