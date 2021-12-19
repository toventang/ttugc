package com.bytedance.ies.dmt.p1194ui.p1198d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.d.b */
public final class C17195b {

    /* renamed from: b */
    public static final C17196a f40975b = new C17196a((byte) 0);

    /* renamed from: a */
    public final int f40976a;

    static {
        Covode.recordClassIndex(19655);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.d.b$a */
    public static final class C17196a {
        static {
            Covode.recordClassIndex(19656);
        }

        private C17196a() {
        }

        public /* synthetic */ C17196a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final CharSequence mo27181a(CharSequence charSequence) {
        if (charSequence == null || (charSequence instanceof C17191a) || this.f40976a != 1) {
            return charSequence;
        }
        return new C17191a.C17192a().mo27177a(charSequence).f40973a;
    }

    public C17195b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            this.f40976a = 0;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ki, R.attr.uo, R.attr.akw});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f40976a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
}
