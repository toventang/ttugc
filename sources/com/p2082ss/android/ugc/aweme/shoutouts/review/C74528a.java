package com.p2082ss.android.ugc.aweme.shoutouts.review;

import android.content.Context;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.a */
public final class C74528a {

    /* renamed from: a */
    public DialogInterfaceC0216c.C0217a f167589a;

    /* renamed from: b */
    public Context f167590b;

    static {
        Covode.recordClassIndex(87334);
    }

    public C74528a(Context context) {
        DialogInterfaceC0216c.C0217a aVar;
        this.f167590b = context;
        if (context != null) {
            aVar = new DialogInterfaceC0216c.C0217a(context, R.style.w0);
        } else {
            aVar = null;
        }
        this.f167589a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.a$a */
    public static final class C74529a extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(87335);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74529a(Context context, CharSequence[] charSequenceArr) {
            super(context, (int) R.layout.azm, 16908308, charSequenceArr);
            if (context == null) {
                C89219l.m154715b();
            }
            Objects.requireNonNull(charSequenceArr, "null cannot be cast to non-null type kotlin.Array<out kotlin.CharSequence?>");
        }
    }
}
