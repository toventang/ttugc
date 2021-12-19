package com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.C76401f;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.h */
public final class C75492h extends C75490g {

    /* renamed from: e */
    public static final C75493a f169637e = new C75493a((byte) 0);

    /* renamed from: i */
    private final AbstractC76151g f169638i;

    static {
        Covode.recordClassIndex(88414);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.h$a */
    public static final class C75493a {
        static {
            Covode.recordClassIndex(88415);
        }

        private C75493a() {
        }

        public /* synthetic */ C75493a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.C75490g
    /* renamed from: b */
    public final C76401f<Effect> mo119165b(Effect effect, int i) {
        C89219l.m154721d(effect, "");
        int i2 = this.f171209h;
        Bundle bundle = new Bundle();
        bundle.putString("enter_method", "click_personal_board");
        return new C76401f<>(effect, i, i2, false, false, true, bundle, this, null, 792);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75492h(View view, C85037b bVar, AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar2) {
        super(view, bVar, oVar, gVar, bVar2);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar2, "");
        this.f169638i = gVar;
    }
}
