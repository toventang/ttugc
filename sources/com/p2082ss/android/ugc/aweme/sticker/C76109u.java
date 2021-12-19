package com.p2082ss.android.ugc.aweme.sticker;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.AbstractC14379b;
import com.bytedance.creativex.recorder.sticker.panel.AbstractC14380c;
import com.bytedance.creativex.recorder.sticker.panel.C14381d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import com.p2082ss.android.ugc.aweme.utils.C80245bi;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4310b.C83961b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.p4362a.C84921e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.u */
public final class C76109u implements AbstractC14380c, AbstractC21566a {

    /* renamed from: a */
    public final C75972r.AbstractC75974b f170999a;

    /* renamed from: b */
    private final C21582f f171000b;

    static {
        Covode.recordClassIndex(89057);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.u$a */
    public static final class C76110a extends C84921e {
        static {
            Covode.recordClassIndex(89058);
        }

        C76110a() {
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.C84921e
        /* renamed from: a */
        public final AbstractC84919c mo59545a(Object obj) {
            C89219l.m154721d(obj, "");
            if (obj instanceof Activity) {
                return C80245bi.m139086a((Activity) obj);
            }
            return super.mo59545a(obj);
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f171000b;
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.AbstractC14380c
    /* renamed from: a */
    public final AbstractC14379b mo23192a() {
        return new C14381d(getDiContainer(), new C83961b(getDiContainer()), this.f170999a, new C76110a());
    }

    public C76109u(C21582f fVar, C75972r.AbstractC75974b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f171000b = fVar;
        this.f170999a = bVar;
    }
}
