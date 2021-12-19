package com.bytedance.android.live.broadcast.p197f;

import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.C1764a;
import com.bytedance.android.live.broadcast.p188b.View$OnClickListenerC3087f;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.p1114a.AbstractC16043b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.live.broadcast.f.a */
public final class C3229a extends AbstractC16043b<AbstractC3230a> implements WeakHandler.IHandler {

    /* renamed from: i */
    private static final Spannable f9271i = new SpannableString("");

    /* renamed from: a */
    String f9272a;

    /* renamed from: b */
    public long f9273b;

    /* renamed from: c */
    public WeakHandler f9274c;

    /* renamed from: d */
    public int f9275d = 1;

    /* renamed from: e */
    public boolean f9276e;

    /* renamed from: f */
    int f9277f;

    /* renamed from: g */
    int f9278g;

    /* renamed from: h */
    public View$OnClickListenerC3087f f9279h;

    /* renamed from: j */
    private int f9280j = 10;

    /* renamed from: k */
    private String f9281k;

    /* renamed from: l */
    private AbstractC88412b f9282l;

    /* renamed from: com.bytedance.android.live.broadcast.f.a$a */
    public interface AbstractC3230a extends AbstractC16042a {
        static {
            Covode.recordClassIndex(3711);
        }

        /* renamed from: a */
        void mo8499a(CharSequence charSequence);

        /* renamed from: a */
        void mo8500a(boolean z);

        /* renamed from: a */
        void mo8501a(boolean z, String str);

        /* renamed from: b */
        void mo8502b(CharSequence charSequence);

        /* renamed from: l */
        void mo8512l();

        /* renamed from: m */
        void mo8513m();

        /* renamed from: n */
        void mo8514n();

        /* renamed from: o */
        void mo8515o();
    }

    static {
        Covode.recordClassIndex(3710);
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b
    /* renamed from: b */
    public final void mo8577b() {
        super.mo8577b();
        this.f9274c.removeMessages(1);
        this.f9274c.removeMessages(2);
    }

    /* renamed from: a */
    public final void mo8575a() {
        if (this.f38654y != null) {
            ((AbstractC3230a) this.f38654y).mo8513m();
            C7307f.m15217a(this.f9274c, this.f9273b);
        }
    }

    /* renamed from: c */
    public final void mo8578c() {
        this.f9274c.removeMessages(1);
        this.f9274c.removeMessages(2);
        this.f9275d = 1;
        AbstractC88412b bVar = this.f9282l;
        if (bVar != null) {
            bVar.dispose();
            this.f9282l = null;
        }
        if (this.f38654y != null) {
            ((AbstractC3230a) this.f38654y).mo8500a(false);
            this.f9276e = false;
        }
        View$OnClickListenerC3087f fVar = this.f9279h;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    public C3229a(long j) {
        this.f9273b = j;
        this.f9274c = new WeakHandler(this);
        this.f9272a = C3966y.m9657a((int) R.string.gm_) + "（%ds）";
    }

    /* renamed from: b */
    private static CharSequence m8723b(C9688bt btVar) {
        Spannable spannable;
        Spannable spannable2 = f9271i;
        C7557c.m15538a(btVar.f23582i, "");
        if (btVar.mo12726a()) {
            spannable = C7557c.m15538a(btVar.f28134O.f28144j, "");
        } else {
            spannable = spannable2;
        }
        if (spannable != spannable2 || TextUtils.isEmpty(btVar.f23578a)) {
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C3966y.m9657a((int) R.string.gwa));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3966y.m9663b((int) R.color.ya)), 8, spannableStringBuilder.length(), 33);
        spannableStringBuilder.insert(0, (CharSequence) (C3966y.m9657a((int) R.string.gry) + btVar.f23578a + "\n"));
        return spannableStringBuilder;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (this.f38654y != null && this.f9275d != 1) {
            int i = message.what;
            if (i == 1) {
                ((AbstractC3230a) this.f38654y).mo8515o();
            } else if (i == 2) {
                C3719d.C3720a.m9229a().mo9038a().getReviewInfo(this.f9273b).mo143271a(new C11191f()).mo143254a(new C3235f(this), new C3236g(this));
            } else if (i == 25 && (message.obj instanceof C2908a) && this.f38654y != null) {
                mo8578c();
            }
        }
    }

    /* renamed from: a */
    public final void mo8576a(C9688bt btVar) {
        if (this.f38654y != null && btVar != null) {
            if (2 == btVar.f23579f && this.f9275d == 1) {
                this.f9275d = 2;
                this.f9280j = 10;
                this.f9281k = btVar.f23578a;
                ((AbstractC3230a) this.f38654y).mo8499a(C3966y.m9657a((int) R.string.gma));
                ((AbstractC3230a) this.f38654y).mo8502b(m8723b(btVar));
                String a = C1764a.m5929a(Locale.getDefault(), this.f9272a, new Object[]{Integer.valueOf(this.f9280j)});
                ((AbstractC3230a) this.f38654y).mo8512l();
                ((AbstractC3230a) this.f38654y).mo8501a(false, a);
                ((AbstractC3230a) this.f38654y).mo8500a(true);
                this.f9274c.sendEmptyMessageDelayed(1, 600000);
                AbstractC88412b bVar = this.f9282l;
                if (bVar == null || bVar.isDisposed()) {
                    this.f9282l = C11231b.m19897a(TimeUnit.MILLISECONDS).mo143271a(new C11191f()).mo143279b(new C3231b(this)).mo143289d(new C3232c(this));
                }
            } else if (3 == btVar.f23579f && this.f9275d != 1) {
                if (this.f38654y != null) {
                    ((AbstractC3230a) this.f38654y).mo8514n();
                }
                mo8578c();
            }
        }
    }
}
