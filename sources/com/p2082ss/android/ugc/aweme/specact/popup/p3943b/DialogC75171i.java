package com.p2082ss.android.ugc.aweme.specact.popup.p3943b;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75081k;
import com.p2082ss.android.ugc.aweme.specact.popup.api.SpecActRedPacketApi;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import com.p2082ss.android.ugc.aweme.specact.popup.p3946e.C75202a;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.b.i */
public final class DialogC75171i extends DialogC81459o {
    static {
        Covode.recordClassIndex(88047);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.b.i$a */
    public static final class CountDownTimerC75174a extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ DialogC75171i f169029a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f169030b;

        static {
            Covode.recordClassIndex(88050);
        }

        public final void onFinish() {
            cancel();
        }

        public final void onTick(long j) {
            TuxTextView tuxTextView = (TuxTextView) this.f169029a.findViewById(R.id.time);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(DialogC75171i.m131910a(j / 1000));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC75174a(DialogC75171i iVar, C89233z.C89237d dVar, long j) {
            super(j, 1000);
            this.f169029a = iVar;
            this.f169030b = dVar;
        }
    }

    /* renamed from: a */
    public static String m131910a(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        if (j2 >= 10) {
            sb.append(j2).append(":");
        } else if (j2 >= 0) {
            sb.append("0".concat(String.valueOf(j2))).append(":");
        }
        if (j4 >= 10) {
            sb.append(j4).append(":");
        } else if (j4 >= 0) {
            sb.append("0".concat(String.valueOf(j4))).append(":");
        }
        if (j5 >= 10) {
            sb.append(j5);
        } else if (j5 >= 0) {
            sb.append("0".concat(String.valueOf(j5)));
        }
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC75171i(final Context context, final C75124i iVar) {
        super(context, R.style.zn, false, true);
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        setContentView(R.layout.b0k);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        ((SimpleDraweeView) findViewById(R.id.bh6)).setImageURI(iVar.f168885e);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.acy);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(iVar.f168887g);
        ((TuxTextView) findViewById(R.id.a7b)).mo37697a(30.0f);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.a7b);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(iVar.f168891k.get(0).f168855a);
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.ehp);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(iVar.f168891k.get(0).f168856b);
        C89233z.C89237d dVar = new C89233z.C89237d();
        dVar.element = iVar.f168897q - ((long) C75081k.m131844a());
        TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.time);
        C89219l.m154716b(tuxTextView4, "");
        tuxTextView4.setText(m131910a(dVar.element));
        final CountDownTimerC75174a aVar = new CountDownTimerC75174a(this, dVar, dVar.element * 1000);
        aVar.start();
        ((TuxIconView) findViewById(R.id.a6t)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.specact.popup.p3943b.DialogC75171i.View$OnClickListenerC751721 */

            /* renamed from: a */
            final /* synthetic */ DialogC75171i f169021a;

            static {
                Covode.recordClassIndex(88048);
            }

            {
                this.f169021a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                aVar.cancel();
                C39162r.m79460a("limited_invite_pop_click", new C33744d().mo59983a("position", "feed").mo59983a("button_name", "close").f79943a);
                SpecActRedPacketApi.C75139a.m131891a(iVar, "True");
                this.f169021a.dismiss();
            }
        });
        TuxTextView tuxTextView5 = (TuxTextView) findViewById(R.id.button);
        C89219l.m154716b(tuxTextView5, "");
        tuxTextView5.setText(iVar.f168892l.get(0).f168858a);
        final String str = iVar.f168892l.get(0).f168859b;
        if (str.length() > 0) {
            ((TuxTextView) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.specact.popup.p3943b.DialogC75171i.View$OnClickListenerC751732 */

                /* renamed from: a */
                final /* synthetic */ DialogC75171i f169024a;

                static {
                    Covode.recordClassIndex(88049);
                }

                {
                    this.f169024a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    aVar.cancel();
                    C75202a.m131946a(context, str);
                    C39162r.m79460a("limited_invite_pop_click", new C33744d().mo59983a("position", "feed").mo59983a("button_name", "ok").f79943a);
                    SpecActRedPacketApi.C75139a.m131891a(iVar, "False");
                    this.f169024a.dismiss();
                }
            });
        }
        C39162r.m79460a("limited_invite_pop_show", new C33744d().mo59983a("position", "feed").f79943a);
    }
}
