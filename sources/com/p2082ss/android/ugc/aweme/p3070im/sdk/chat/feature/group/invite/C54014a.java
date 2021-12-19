package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.a */
public final class C54014a {

    /* renamed from: a */
    public static final C54015a f123848a = new C54015a((byte) 0);

    static {
        Covode.recordClassIndex(63687);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.a$a */
    public static final class C54015a {
        static {
            Covode.recordClassIndex(63688);
        }

        private C54015a() {
        }

        public /* synthetic */ C54015a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.a$a$a */
        public static final class DialogInterface$OnDismissListenerC54016a implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ Activity f123849a;

            static {
                Covode.recordClassIndex(63689);
            }

            public DialogInterface$OnDismissListenerC54016a(Activity activity) {
                this.f123849a = activity;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Window window = ((ActivityC0945e) this.f123849a).getWindow();
                    C89219l.m154716b(window, "");
                    View decorView = window.getDecorView();
                    C89219l.m154716b(decorView, "");
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    Window window2 = ((ActivityC0945e) this.f123849a).getWindow();
                    C89219l.m154716b(window2, "");
                    View decorView2 = window2.getDecorView();
                    C89219l.m154716b(decorView2, "");
                    decorView2.setSystemUiVisibility(systemUiVisibility | 8192);
                }
            }
        }
    }
}
