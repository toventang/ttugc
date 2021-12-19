package com.p2082ss.android.ugc.aweme.specact.popup.p3943b;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import com.p2082ss.android.ugc.aweme.specact.popup.p3946e.C75202a;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.b.h */
public final class DialogC75166h extends DialogC81459o {

    /* renamed from: a */
    public static final C75170a f169013a = new C75170a((byte) 0);

    static {
        Covode.recordClassIndex(88042);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.h$a */
    public static final class C75170a {
        static {
            Covode.recordClassIndex(88046);
        }

        private C75170a() {
        }

        public /* synthetic */ C75170a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC75166h(final Context context, final C75124i iVar) {
        super(context, R.style.zn, false, true);
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        setContentView(R.layout.b0m);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnKeyListener(DialogInterface$OnKeyListenerC751671.f169014a);
        ((TuxIconView) findViewById(R.id.a6t)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.specact.popup.p3943b.DialogC75166h.View$OnClickListenerC751682 */

            /* renamed from: a */
            final /* synthetic */ DialogC75166h f169015a;

            static {
                Covode.recordClassIndex(88044);
            }

            {
                this.f169015a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C39162r.m79460a("invite_result_notification_pop_click", new C33744d().mo59983a("position", "feed").mo59983a("button_name", "close").f79943a);
                SpecActRedPacketApi.C75139a.m131891a(iVar, "True");
                this.f169015a.dismiss();
            }
        });
        ((SimpleDraweeView) findViewById(R.id.bh6)).setImageURI(iVar.f168885e);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.eis);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(iVar.f168886f);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.acy);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(iVar.f168887g);
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.button);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(iVar.f168892l.get(0).f168858a);
        final String str = iVar.f168892l.get(0).f168859b;
        if (str.length() > 0) {
            ((TuxTextView) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.specact.popup.p3943b.DialogC75166h.View$OnClickListenerC751693 */

                /* renamed from: a */
                final /* synthetic */ DialogC75166h f169017a;

                static {
                    Covode.recordClassIndex(88045);
                }

                {
                    this.f169017a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C75202a.m131946a(context, str);
                    C39162r.m79460a("invite_result_notification_pop_click", new C33744d().mo59983a("position", "feed").mo59983a("button_name", "ok").f79943a);
                    SpecActRedPacketApi.C75139a.m131891a(iVar, "False");
                    this.f169017a.dismiss();
                }
            });
        }
        C39162r.m79460a("invite_result_notification_pop_show", new C33744d().mo59983a("position", "feed").f79943a);
    }
}
