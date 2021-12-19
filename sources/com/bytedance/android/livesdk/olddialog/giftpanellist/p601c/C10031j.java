package com.bytedance.android.livesdk.olddialog.giftpanellist.p601c;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.dialogv2.p516b.C8348d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.service.animation.p622a.C10645a;
import com.bytedance.android.livesdk.service.assets.C10690j;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdk.widget.CountDownTextView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;

/* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.j */
public final class C10031j extends AbstractC10019b {

    /* renamed from: a */
    private TextView f24370a = ((TextView) this.f24349m.findViewById(R.id.da9));

    /* renamed from: b */
    private CountDownTextView f24371b;

    static {
        Covode.recordClassIndex(11585);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: a */
    public final void mo16837a(AbstractC10019b.AbstractC10022a aVar) {
        this.f24349m.setOnClickListener(new View$OnClickListenerC10033k(this));
        this.f24349m.setOnTouchListener(new View$OnTouchListenerC10034l(this));
        this.f24347k = aVar;
    }

    public C10031j(View view) {
        super(view);
        CountDownTextView countDownTextView = (CountDownTextView) this.itemView.findViewById(R.id.f5y);
        this.f24371b = countDownTextView;
        countDownTextView.setCountDownListener(new CountDownTextView.AbstractC11345a() {
            /* class com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.C10031j.C100321 */

            static {
                Covode.recordClassIndex(11586);
            }

            @Override // com.bytedance.android.livesdk.widget.CountDownTextView.AbstractC11345a
            /* renamed from: a */
            public final void mo16859a(TextView textView) {
                long j;
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                C10690j a = C10690j.m19257a();
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                a.mo17629b(j);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ boolean mo16858b(View view, MotionEvent motionEvent) {
        if (this.f24353q) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            C10645a.m19201a(view).start();
        } else if (1 == motionEvent.getAction()) {
            C10645a.m19202b(view).start();
        } else if (3 == motionEvent.getAction()) {
            C10645a.m19202b(view).start();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b
    /* renamed from: a */
    public final void mo16836a(AbstractC8812b bVar, int i) {
        String quantityString;
        this.f24343g.setVisibility(0);
        super.mo16836a(bVar, i);
        if (bVar instanceof C8348d) {
            int i2 = ((Prop) bVar.f21695b).count;
            if (i2 == 0) {
                this.f24349m.setAlpha(0.5f);
            }
            this.f24370a.setText("x".concat(String.valueOf(i2)));
            if (((Prop) bVar.f21695b).nextExpire > 0) {
                long currentTimeMillis = ((Prop) bVar.f21695b).nextExpire - ((System.currentTimeMillis() / 1000) + ((Prop) bVar.f21695b).getNowTimeDiff());
                if (currentTimeMillis <= 0) {
                    quantityString = this.f24371b.getContext().getResources().getString(R.string.gnv, "00:00");
                } else if (currentTimeMillis < 3600) {
                    quantityString = this.f24371b.getContext().getResources().getString(R.string.gnv, C11225an.m19879a(currentTimeMillis));
                    CountDownTextView countDownTextView = this.f24371b;
                    long j = (currentTimeMillis - 0) + 1;
                    if (j > 0) {
                        countDownTextView.f27174a = C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b(j).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new CountDownTextView.C11346b(countDownTextView, currentTimeMillis), CountDownTextView.C11347c.f27180a);
                    }
                } else if (currentTimeMillis < 86400) {
                    int i3 = (int) (currentTimeMillis / 3600);
                    quantityString = this.f24371b.getContext().getResources().getQuantityString(R.plurals.ia, i3, Integer.valueOf(i3));
                } else {
                    int i4 = (int) (currentTimeMillis / 86400);
                    quantityString = this.f24371b.getContext().getResources().getQuantityString(R.plurals.i_, i4, Integer.valueOf(i4));
                }
                this.f24371b.setText(quantityString);
                this.f24371b.setVisibility(0);
                return;
            }
            this.f24371b.setVisibility(4);
        }
    }
}
