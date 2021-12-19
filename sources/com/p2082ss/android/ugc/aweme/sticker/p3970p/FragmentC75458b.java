package com.p2082ss.android.ugc.aweme.sticker.p3970p;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;

/* renamed from: com.ss.android.ugc.aweme.sticker.p.b */
public final class FragmentC75458b extends Fragment {

    /* renamed from: c */
    public static final C75459a f169563c = new C75459a((byte) 0);

    /* renamed from: a */
    public Intent f169564a;

    /* renamed from: b */
    public AbstractC89187q<? super Integer, ? super Integer, ? super Intent, C89391z> f169565b;

    static {
        Covode.recordClassIndex(88380);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.p.b$a */
    public static final class C75459a {
        static {
            Covode.recordClassIndex(88381);
        }

        private C75459a() {
        }

        public /* synthetic */ C75459a(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (intent = this.f169564a) != null) {
            startActivityForResult(intent, arguments.getInt("extra_request_code"));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC89187q<? super Integer, ? super Integer, ? super Intent, C89391z> qVar = this.f169565b;
        if (qVar != null) {
            qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
