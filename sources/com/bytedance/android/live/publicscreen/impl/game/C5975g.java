package com.bytedance.android.live.publicscreen.impl.game;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.publicscreen.impl.game.g */
public final class C5975g implements AbstractC5877k.AbstractC5878a {

    /* renamed from: a */
    private final TextView f15003a;

    static {
        Covode.recordClassIndex(6585);
    }

    public C5975g(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f15003a = textView;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k.AbstractC5878a
    /* renamed from: a */
    public final void mo11711a(Bitmap bitmap, AbstractC5877k<? extends AbstractC6571a> kVar) {
        if (bitmap != null && kVar != null && kVar.mo11710z() != null) {
            int a = C89361p.m154885a((CharSequence) String.valueOf(kVar.mo11710z()), " . ");
            if (a != -1) {
                CharSequence z = kVar.mo11710z();
                if (!(z instanceof Spannable)) {
                    z = null;
                }
                Spannable spannable = (Spannable) z;
                if (spannable != null) {
                    C7557c.m15542a(spannable, bitmap, a + 1, a + 2, kVar);
                }
            }
            this.f15003a.setText(kVar.mo11710z());
        }
    }
}
