package com.bytedance.android.live.publicscreen.impl.widget.p402b;

import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.p400f.C5967b;
import com.bytedance.android.livesdk.chatroom.p499ui.C7759an;
import com.bytedance.android.livesdk.chatroom.p499ui.C7887da;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.d */
public final class C6068d extends C6069e {

    /* renamed from: a */
    static C6068d f15198a;

    static {
        Covode.recordClassIndex(6685);
    }

    /* renamed from: a */
    private static AbstractC6571a m13297a(TextView textView) {
        Object obj;
        if (textView != null) {
            obj = textView.getTag(R.id.epm);
        } else {
            obj = null;
        }
        if (obj instanceof AbstractC6571a) {
            return (AbstractC6571a) obj;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.p402b.C6069e
    /* renamed from: a */
    public final void mo11945a(TextView textView, ClickableSpan clickableSpan) {
        AbstractC6571a a;
        super.mo11945a(textView, clickableSpan);
        if (clickableSpan instanceof C7887da) {
            AbstractC6571a a2 = m13297a(textView);
            if (a2 != null) {
                C5967b.m13083a(a2);
            }
        } else if ((clickableSpan instanceof C7759an) && (a = m13297a(textView)) != null) {
            C5967b.m13085b(a);
        }
    }
}
