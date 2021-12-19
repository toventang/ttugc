package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.AbstractC54313b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.b */
public final /* synthetic */ class C54518b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final AbstractC54482a f124955a;

    /* renamed from: b */
    private final AbstractC54313b f124956b;

    static {
        Covode.recordClassIndex(64229);
    }

    public C54518b(AbstractC54482a aVar, AbstractC54313b bVar) {
        this.f124955a = aVar;
        this.f124956b = bVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AbstractC54482a aVar = this.f124955a;
        AbstractC54313b bVar = this.f124956b;
        if (bVar != null) {
            bVar.mo91398a(z, aVar.getAdapterPosition());
        }
    }
}
