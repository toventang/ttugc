package com.p2082ss.android.ugc.aweme.sticker.p3947a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.b */
public final class C75255b implements AbstractC75591e, AbstractC75633m {

    /* renamed from: a */
    private final List<AbstractC75248a> f169202a = new ArrayList();

    static {
        Covode.recordClassIndex(88157);
    }

    /* renamed from: a */
    public final void mo118599a(AbstractC75248a aVar) {
        C89219l.m154721d(aVar, "");
        this.f169202a.add(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        return aVar.mo119345a(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e
    /* renamed from: a */
    public final void mo23211a(int i, int i2, int i3, String str) {
        if (i == 41) {
            C73991bj.m130133d("EffectChannelListener INTERACTION msg: " + i + " , " + i2 + " , " + i3 + " , " + str);
            for (T t : this.f169202a) {
                if (str != null && (t.mo118590b() || !C63244g.m114602a().mo73255A().mo93901a())) {
                    if (C89219l.m154714a((Object) t.mo118587a(), (Object) new JSONObject(str).optString("interface"))) {
                        C73991bj.m130133d("Effect interface: " + t.mo118587a() + " handle msg: " + i + " , " + i2 + " , " + i3 + " , " + str);
                        t.mo118588a(i3, str);
                    }
                }
            }
        }
    }
}
