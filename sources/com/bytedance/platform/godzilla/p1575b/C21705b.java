package com.bytedance.platform.godzilla.p1575b;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1574a.C21682a;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1580b.InstrumentationC21699a;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1580b.p1582b.C21703a;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1580b.p1582b.C21704b;
import com.bytedance.platform.godzilla.p1585c.AbstractC21717a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.b.b */
public final class C21705b extends AbstractC21717a {
    static {
        Covode.recordClassIndex(25346);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "ProviderInstalledFailedPlugin";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: a */
    public final void mo35350a() {
        super.mo35350a();
        if (!InstrumentationC21699a.f51475a) {
            try {
                Object a = C21682a.m40625a();
                Field declaredField = a.getClass().getDeclaredField("mInstrumentation");
                declaredField.setAccessible(true);
                if (!(declaredField.get(a) instanceof InstrumentationC21699a)) {
                    declaredField.set(a, new InstrumentationC21699a());
                    C21689g.m40635a(C21689g.EnumC21691a.DEBUG);
                    InstrumentationC21699a.f51475a = true;
                }
            } catch (Exception e) {
                e.getMessage();
                C21689g.m40635a(C21689g.EnumC21691a.DEBUG);
            }
        }
        C21689g.m40635a(C21689g.EnumC21691a.ERROR);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: a */
    public final void mo35359a(Application application) {
        super.mo35359a(application);
        InstrumentationC21699a.m40647a(new C21703a());
        InstrumentationC21699a.m40647a(new C21704b());
    }
}
