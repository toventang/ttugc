package com.p2082ss.android.ugc.aweme.notification.view;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62099d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.g */
public final class C62307g extends AbstractC33066c {

    /* renamed from: a */
    public static final C62308a f141419a = new C62308a((byte) 0);

    /* renamed from: b */
    private final User f141420b;

    /* renamed from: c */
    private final int f141421c;

    /* renamed from: e */
    private final AbstractC62099d f141422e;

    static {
        Covode.recordClassIndex(73087);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.g$a */
    public static final class C62308a {
        static {
            Covode.recordClassIndex(73088);
        }

        private C62308a() {
        }

        public /* synthetic */ C62308a(byte b) {
            this();
        }
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        this.f141422e.mo100133a(view, this.f141420b);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c
    public final void updateDrawState(TextPaint textPaint) {
        C89219l.m154721d(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62307g(User user, int i, int i2, int i3, AbstractC62099d dVar) {
        super(i2, i3);
        C89219l.m154721d(dVar, "");
        this.f141420b = user;
        this.f141421c = i;
        this.f141422e = dVar;
    }
}
