package com.p2082ss.android.ugc.aweme.sticker.panel.p3971a;

import android.text.format.DateUtils;
import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.a.c */
public final class C75475c implements AbstractC75473a {

    /* renamed from: a */
    private final C0489d<Boolean> f169586a;

    /* renamed from: b */
    private long f169587b;

    /* renamed from: c */
    private final AbstractC75655o f169588c;

    /* renamed from: d */
    private final StickerPreferences f169589d;

    /* renamed from: e */
    private final int f169590e;

    /* renamed from: f */
    private final AbstractC89171a<Boolean> f169591f;

    static {
        Covode.recordClassIndex(88397);
    }

    /* renamed from: a */
    private final long m132400a() {
        if (this.f169587b == -1) {
            this.f169587b = this.f169589d.getAutoApplyStickerTime(0);
        }
        return this.f169587b;
    }

    public /* synthetic */ C75475c(AbstractC75655o oVar, StickerPreferences stickerPreferences, AbstractC89171a aVar) {
        this(oVar, stickerPreferences, C75344c.m132148b(oVar), aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75473a
    /* renamed from: a */
    public final boolean mo119149a(Effect effect, int i, int i2) {
        C89219l.m154721d(effect, "");
        if (this.f169588c.mo119294f() != null) {
            return false;
        }
        Boolean a = this.f169586a.mo2077a(m132400a());
        if (a == null) {
            a = Boolean.valueOf(DateUtils.isToday(m132400a()));
            this.f169586a.mo2083b(m132400a(), Boolean.valueOf(a.booleanValue()));
        }
        C89219l.m154716b(a, "");
        if (a.booleanValue() || i != this.f169590e || !this.f169591f.invoke().booleanValue()) {
            return false;
        }
        this.f169587b = System.currentTimeMillis();
        this.f169589d.setAutoApplyStickerTime(m132400a());
        return true;
    }

    private C75475c(AbstractC75655o oVar, StickerPreferences stickerPreferences, int i, AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(stickerPreferences, "");
        C89219l.m154721d(aVar, "");
        this.f169588c = oVar;
        this.f169589d = stickerPreferences;
        this.f169590e = i;
        this.f169591f = aVar;
        this.f169586a = new C0489d<>();
        this.f169587b = -1;
    }
}
