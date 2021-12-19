package com.p2082ss.android.ugc.aweme.common.p2634f;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.common.f.a */
public final class C39110a {

    /* renamed from: a */
    public DialogInterfaceC0216c.C0217a f92306a;

    /* renamed from: b */
    private Context f92307b;

    static {
        Covode.recordClassIndex(46726);
    }

    /* renamed from: a */
    public final void mo67870a(DialogInterface.OnCancelListener onCancelListener) {
        this.f92306a.mo447a(onCancelListener);
    }

    public C39110a(Context context) {
        this.f92307b = context;
        this.f92306a = new DialogInterfaceC0216c.C0217a(context, R.style.w0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.f.a$a */
    public static class C39111a extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(46727);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        C39111a(Context context, CharSequence[] charSequenceArr) {
            super(context, (int) R.layout.co, 16908308, charSequenceArr);
        }
    }

    /* renamed from: a */
    public final void mo67871a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.f92306a.mo448a(new C39111a(this.f92307b, charSequenceArr), onClickListener);
    }
}
