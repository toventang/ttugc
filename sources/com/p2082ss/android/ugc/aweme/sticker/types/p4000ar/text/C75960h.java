package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.h */
public final class C75960h extends C75972r {
    static {
        Covode.recordClassIndex(88902);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r
    /* renamed from: a */
    public final void mo119637a() {
        if (!TextUtils.isEmpty(this.f170653j) && this.f170646c != null && this.f170647d != null) {
            this.f170646c.mo119403a(this.f170653j, this.f170647d.f170641b, this.f170647d.f170642c, this.f170647d.f170643d);
            this.f170646c.mo119400a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r
    /* renamed from: a */
    public final C75972r mo119621a(C75967n nVar) {
        nVar.setEffectTextChangeListener(new C75967n.AbstractC75968a() {
            /* class com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75960h.C759611 */

            static {
                Covode.recordClassIndex(88903);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n.AbstractC75968a
            /* renamed from: a */
            public final void mo119624a(String str) {
                if (C75960h.this.f170650g) {
                    C75960h.this.mo119653a(str);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n.AbstractC75968a
            /* renamed from: b */
            public final void mo119625b(String str) {
                C75960h.this.f170653j = str;
                C75960h.this.f170646c.mo119400a();
                C75960h.this.f170646c.mo119403a(str, C75960h.this.f170647d.f170641b, C75960h.this.f170647d.f170642c, C75960h.this.f170647d.f170643d);
            }
        });
        return super.mo119621a(nVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r
    /* renamed from: a */
    public final int mo119620a(int i, String str) {
        this.f170646c.mo119401a(new C75962i(this, i, str));
        return this.f170652i;
    }

    public C75960h(ActivityC0945e eVar, AbstractC75955e eVar2, AbstractC84903j jVar) {
        super(eVar, eVar2, jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo119636a(int i, String str, Integer num) {
        this.f170649f.runOnUiThread(new RunnableC75963j(this, num, i, str));
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo119638a(Integer num, int i, String str) {
        this.f170652i = num.intValue();
        if (this.f170652i > 0 || i != 1) {
            if (!TextUtils.isEmpty(str)) {
                this.f170652i += str.length();
            }
            if (this.f170644a != null) {
                this.f170644a.setMaxTextCount(this.f170652i);
                return;
            }
            return;
        }
        C85052j.m146243b(this.f170649f, this.f170649f.getResources().getString(R.string.f7b)).mo129996a();
    }
}
