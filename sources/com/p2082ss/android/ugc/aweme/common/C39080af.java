package com.p2082ss.android.ugc.aweme.common;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34707s;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.af */
public final class C39080af extends AbstractC34707s {

    /* renamed from: d */
    public final User f92279d;

    /* renamed from: e */
    public final int f92280e = 1;

    /* renamed from: f */
    public final AbstractC39081a f92281f;

    /* renamed from: com.ss.android.ugc.aweme.common.af$a */
    public interface AbstractC39081a {
        static {
            Covode.recordClassIndex(46697);
        }

        /* renamed from: a */
        void mo61478a(View view, User user, int i);
    }

    static {
        Covode.recordClassIndex(46696);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34707s
    public final void updateDrawState(TextPaint textPaint) {
        C89219l.m154721d(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        AbstractC39081a aVar = this.f92281f;
        if (aVar != null) {
            aVar.mo61478a(view, this.f92279d, this.f92280e);
        }
    }

    public C39080af(User user, AbstractC39081a aVar, int i, int i2) {
        super(i, i2);
        this.f92279d = user;
        this.f92281f = aVar;
    }
}
