package com.p2082ss.android.ugc.aweme.tools.draft.p4114l;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.l.a */
public final class C78402a {

    /* renamed from: a */
    public DialogInterfaceC0216c.C0217a f176147a;

    /* renamed from: b */
    private Context f176148b;

    static {
        Covode.recordClassIndex(91528);
    }

    public C78402a(Context context) {
        this.f176148b = context;
        this.f176147a = new DialogInterfaceC0216c.C0217a(context, R.style.w0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.l.a$a */
    public static class C78403a extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(91529);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        C78403a(Context context, CharSequence[] charSequenceArr) {
            super(context, (int) R.layout.cw, 16908308, charSequenceArr);
        }
    }

    /* renamed from: a */
    public final void mo122330a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.f176147a.mo448a(new C78403a(this.f176148b, charSequenceArr), onClickListener);
    }
}
