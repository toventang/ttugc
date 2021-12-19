package com.p2082ss.android.ugc.gamora.recorder.sticker.p4310b;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.AbstractC14379b;
import com.bytedance.creativex.recorder.sticker.panel.AbstractC14380c;
import com.bytedance.creativex.recorder.sticker.panel.C14381d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.utils.C80245bi;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a.C83970a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.p4362a.C84921e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.b.a */
public final class C83959a implements AbstractC14380c, AbstractC21566a {

    /* renamed from: a */
    private final C21582f f187435a;

    static {
        Covode.recordClassIndex(97852);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.b.a$a */
    public static final class C83960a extends C84921e {
        static {
            Covode.recordClassIndex(97853);
        }

        C83960a() {
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
        return this.f187435a;
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.AbstractC14380c
    /* renamed from: a */
    public final AbstractC14379b mo23192a() {
        return new C14381d(getDiContainer(), new C83961b(getDiContainer()), new C83970a(getDiContainer()), new C83960a());
    }

    public C83959a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f187435a = fVar;
    }
}
