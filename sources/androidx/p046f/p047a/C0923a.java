package androidx.p046f.p047a;

import android.app.Application;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import javax.p4631a.AbstractC89405a;

/* renamed from: androidx.f.a.a */
public final class C0923a extends C1175ad.C1176a {

    /* renamed from: b */
    private final C1175ad.C1176a f3287b;

    /* renamed from: c */
    private final Map<String, AbstractC89405a<AbstractC0924b<? extends AbstractC1174ac>>> f3288c;

    static {
        Covode.recordClassIndex(1011);
    }

    @Override // androidx.lifecycle.C1175ad.C1179d, androidx.lifecycle.C1175ad.C1176a, androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        AbstractC89405a<AbstractC0924b<? extends AbstractC1174ac>> aVar = this.f3288c.get(cls.getName());
        return aVar == null ? (T) this.f3287b.mo3261a(cls) : (T) aVar.get().mo3262a();
    }

    C0923a(Application application, C1175ad.C1176a aVar, Map<String, AbstractC89405a<AbstractC0924b<? extends AbstractC1174ac>>> map) {
        super(application);
        this.f3287b = aVar;
        this.f3288c = map;
    }
}
