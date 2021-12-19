package com.bytedance.tux.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.internal.AbstractC23064b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.e */
public final class C23048e extends AbstractC23064b<C23048e, C23039d> {

    /* renamed from: a */
    public C23049a f54551a;

    /* renamed from: b */
    public C23049a f54552b;

    /* renamed from: c */
    public C23049a f54553c;

    static {
        Covode.recordClassIndex(26968);
    }

    /* renamed from: com.bytedance.tux.dialog.e$a */
    public static final class C23049a {

        /* renamed from: a */
        public final CharSequence f54554a;

        /* renamed from: b */
        public final boolean f54555b;

        /* renamed from: c */
        public final DialogInterface.OnClickListener f54556c;

        static {
            Covode.recordClassIndex(26969);
        }

        private /* synthetic */ C23049a() {
            this(null, false, null);
        }

        public C23049a(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
            this.f54554a = charSequence;
            this.f54555b = z;
            this.f54556c = onClickListener;
        }
    }

    /* renamed from: a */
    public final C23039d mo37442a() {
        return new C23039d(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23048e(Context context) {
        super(context);
        C89219l.m154719c(context, "");
    }

    /* renamed from: a */
    public final C23048e mo37444a(DialogInterface.OnClickListener onClickListener) {
        this.f54552b = new C23049a(this.f54592n.getText(R.string.a8y), false, onClickListener);
        return this;
    }

    /* renamed from: a */
    public final C23048e mo37443a(int i, DialogInterface.OnClickListener onClickListener) {
        return mo37445a(this.f54592n.getText(i), false, onClickListener);
    }

    /* renamed from: a */
    public final C23048e mo37445a(CharSequence charSequence, boolean z, DialogInterface.OnClickListener onClickListener) {
        this.f54551a = new C23049a(charSequence, z, onClickListener);
        return this;
    }
}
