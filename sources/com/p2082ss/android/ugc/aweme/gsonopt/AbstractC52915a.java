package com.p2082ss.android.ugc.aweme.gsonopt;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.C28027t;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.gsonopt.a */
public abstract class AbstractC52915a<T> extends AbstractC28031v<T> {

    /* renamed from: a */
    protected final C27910f f121697a;

    static {
        Covode.recordClassIndex(62434);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C52916b mo89308a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo89309a();

    @Override // com.google.gson.AbstractC28031v
    public void write(C27900c cVar, T t) {
    }

    public AbstractC52915a(C27910f fVar) {
        this.f121697a = fVar;
    }

    @Override // com.google.gson.AbstractC28031v
    public T read(C27897a aVar) {
        Field a;
        if (aVar.mo46627f() == EnumC27899b.NULL) {
            aVar.mo46631k();
            return null;
        }
        T a2 = mo89309a();
        try {
            aVar.mo46623c();
            while (aVar.mo46626e()) {
                C52916b a3 = mo89308a(aVar.mo46628h());
                if (a3 == null || !a3.f121700c) {
                    aVar.mo46635o();
                } else {
                    Object read = a3.f121701d.read(aVar);
                    if ((read != null || !a3.f121702e) && (a = a3.mo89310a(a2)) != null) {
                        a.setAccessible(true);
                        a.set(a2, read);
                    }
                }
            }
            aVar.mo46625d();
            return a2;
        } catch (IllegalStateException e) {
            throw new C28027t(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC28031v mo89307a(Object obj, Class cls) {
        return ((AbstractC28033w) obj).create(this.f121697a, C27895a.get(cls));
    }
}
