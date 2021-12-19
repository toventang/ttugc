package com.bytedance.android.livesdk.p562k;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.android.livesdk.widget.C11430k;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.k.a */
public final class DialogC9146a extends Dialog {

    /* renamed from: a */
    public CharSequence f22144a;

    /* renamed from: b */
    private C11430k f22145b;

    static {
        Covode.recordClassIndex(10050);
    }

    /* renamed from: com.bytedance.android.livesdk.k.a$a */
    public static class C9147a {

        /* renamed from: a */
        public DialogInterface.OnDismissListener f22146a;

        /* renamed from: b */
        public CharSequence f22147b;

        /* renamed from: c */
        public boolean f22148c;

        /* renamed from: d */
        private Context f22149d;

        /* renamed from: e */
        private DialogInterface.OnCancelListener f22150e;

        /* renamed from: f */
        private DialogInterface.OnShowListener f22151f;

        /* renamed from: g */
        private boolean f22152g;

        static {
            Covode.recordClassIndex(10051);
        }

        /* renamed from: a */
        public final DialogC9146a mo15240a() {
            DialogC9146a aVar = new DialogC9146a(this.f22149d);
            aVar.f22144a = this.f22147b;
            aVar.setOnCancelListener(this.f22150e);
            aVar.setOnDismissListener(this.f22146a);
            aVar.setOnShowListener(this.f22151f);
            aVar.setCancelable(this.f22148c);
            aVar.setCanceledOnTouchOutside(this.f22152g);
            return aVar;
        }

        public C9147a(Context context) {
            this.f22149d = context;
        }
    }

    public DialogC9146a(Context context) {
        super(context, R.style.hn);
    }

    /* renamed from: a */
    public final void mo15238a(CharSequence charSequence) {
        this.f22144a = charSequence;
        C11430k kVar = this.f22145b;
        if (kVar != null) {
            kVar.setMessage(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11430k kVar = new C11430k(getContext());
        this.f22145b = kVar;
        setContentView(kVar);
        this.f22145b.setMessage(this.f22144a);
    }
}
