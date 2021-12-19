package com.bytedance.android.live.design.app.p232b;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.design.app.b.g */
public final class C4071g extends LiveTextView {

    /* renamed from: a */
    C4063a f11279a;

    static {
        Covode.recordClassIndex(4615);
    }

    public C4071g(Context context) {
        super(context);
    }

    @Override // com.bytedance.android.live.design.widget.LiveTextView
    /* renamed from: a */
    public final void mo9523a(AttributeSet attributeSet, int i) {
        super.mo9523a(attributeSet, i);
        C4063a aVar = new C4063a(this);
        this.f11279a = aVar;
        aVar.mo9537a(attributeSet, i, 0);
        setGravity(17);
        setLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}
