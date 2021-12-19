package com.bytedance.android.live.publicscreen.impl.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9886p;
import com.bytedance.android.livesdk.widget.C11424f;
import com.bytedance.android.livesdk.widget.C11426h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.d */
public final class C6014d extends AbstractC5877k<C9886p> {
    static {
        Covode.recordClassIndex(6625);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k, com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5871f
    /* renamed from: k */
    public final boolean mo11683k() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        return ((C9886p) this.f14737d).f23894h;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        String str;
        Bitmap a = C11426h.m20242a(C3966y.m9669e(), ((C9886p) this.f14737d).f23895i);
        Context e = C3966y.m9669e();
        if (e != null) {
            str = e.getResources().getString(R.string.gs4);
        } else {
            str = "lit";
        }
        if (a != null) {
            str = str + "  ";
        }
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig();
        Spannable b = C6022k.m13209b(((C9886p) this.f14737d).f23894h, " ", str, R.color.xy, R.color.y0);
        if (!(a == null || a.isRecycled() || b == null || b.length() == 0)) {
            Context e2 = C3966y.m9669e();
            int b2 = (int) C13628n.m24520b(C3966y.m9669e(), 16.0f);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(e2.getResources(), a);
            bitmapDrawable.setBounds(0, 0, b2, b2);
            b.setSpan(new C11424f(bitmapDrawable), b.length() - 1, b.length(), 33);
        }
        return b;
    }

    public C6014d(C9886p pVar) {
        super(pVar);
    }
}
