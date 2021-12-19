package com.bytedance.android.live.publicscreen.impl.p399e;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.model.chat.C5993b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9605ai;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.model.message.C9719cc;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdkapi.session.C11868d;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.q */
public final class C5965q extends AbstractC5949f {

    /* renamed from: A */
    private int f14958A;

    /* renamed from: B */
    private int f14959B;

    /* renamed from: C */
    private int f14960C;

    /* renamed from: D */
    private int f14961D;

    /* renamed from: E */
    private int f14962E;

    /* renamed from: F */
    private long f14963F;

    /* renamed from: G */
    private int f14964G;

    /* renamed from: H */
    private int f14965H;

    /* renamed from: I */
    private int f14966I;

    /* renamed from: J */
    private long f14967J;

    /* renamed from: K */
    private int f14968K;

    /* renamed from: L */
    private int f14969L;

    /* renamed from: M */
    private int f14970M;

    /* renamed from: N */
    private int f14971N;

    /* renamed from: O */
    private int f14972O;

    /* renamed from: P */
    private int f14973P;

    /* renamed from: Q */
    private int f14974Q;

    /* renamed from: R */
    private int f14975R;

    /* renamed from: w */
    private int f14976w;

    /* renamed from: x */
    private int f14977x;

    /* renamed from: y */
    private long f14978y;

    /* renamed from: z */
    private int f14979z;

    static {
        Covode.recordClassIndex(6573);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5950g
    /* renamed from: d */
    public final void mo11801d() {
        super.mo11801d();
        if (this.f14967J == 0) {
            this.f14967J = SystemClock.uptimeMillis();
        }
        this.f14968K += mo11808e().f14757n.mo11674f();
        this.f14969L += mo11808e().f14757n.mo11675g();
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5950g
    /* renamed from: a */
    public final void mo11789a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_id", mo11808e().f14744a);
            jSONObject.put("anchor_id", mo11808e().f14746c);
            jSONObject.put("msg_comment_cnt", this.f14888f);
            jSONObject.put("msg_comment_chathead_loaded", this.f14898p);
            jSONObject.put("admin_type", mo11826g());
            jSONObject.put("hot_duration", TimeUnit.MILLISECONDS.toSeconds(this.f14904v));
            jSONObject.put("folded_show_msg_cnt", this.f14899q);
            jSONObject.put("unfolded_show_msg_cnt", this.f14900r);
            jSONObject.put("show_msg_cnt", this.f14899q + this.f14900r);
            jSONObject.put("msg_like_cnt", this.f14889g);
            jSONObject.put("msg_gift_cnt", this.f14890h);
            jSONObject.put("msg_share_cnt", this.f14891i);
            jSONObject.put("msg_follow_cnt", this.f14892j);
            jSONObject.put("drop_like_cnt", this.f14893k);
            jSONObject.put("drop_gift_cnt", this.f14894l);
            jSONObject.put("drop_share_cnt", this.f14895m);
            jSONObject.put("drop_follow_cnt", this.f14896n);
            jSONObject.put("drop_comment_cnt", this.f14897o);
            jSONObject.put("msg_received_total_cnt", this.f14976w);
            jSONObject.put("msg_filtered_total_cnt", this.f14977x);
            jSONObject.put("msg_bind_total_duration", this.f14978y);
            jSONObject.put("msg_bind_total_cnt", this.f14979z);
            jSONObject.put("msg_member_enter_cnt", this.f14901s);
            jSONObject.put("drop_member_enter_cnt", this.f14902t);
            jSONObject.put("drop_total_cnt", this.f14958A);
            jSONObject.put("drop_anchor_msg_cnt", this.f14959B);
            jSONObject.put("drop_anchor_comment_cnt", this.f14960C);
            jSONObject.put("drop_following_user_msg_cnt", this.f14961D);
            jSONObject.put("drop_following_user_comment_cnt", this.f14962E);
            jSONObject.put("msg_buffer_total_duration", this.f14963F);
            jSONObject.put("msg_others_buffer_cnt", this.f14964G);
            jSONObject.put("msg_fold_buffer_cnt", this.f14965H);
            jSONObject.put("msg_buffer_total_cnt", this.f14966I);
            jSONObject.put("receive_comment_cnt", this.f14970M);
            jSONObject.put("receive_like_cnt", this.f14971N);
            jSONObject.put("receive_gift_cnt", this.f14972O);
            jSONObject.put("receive_share_cnt", this.f14973P);
            jSONObject.put("receive_follow_cnt", this.f14974Q);
            jSONObject.put("receive_member_enter_cnt", this.f14975R);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.f14967J);
            jSONObject.put("msg_others_buffer_avg_cnt", ((long) this.f14968K) / seconds);
            jSONObject.put("msg_fold_buffer_avg_cnt", ((long) this.f14969L) / seconds);
        } catch (Exception unused) {
        }
        C11868d.m20958a("ttlive_public_screen_message_metrics", null, null, jSONObject);
        this.f14976w = 0;
        this.f14977x = 0;
        this.f14978y = 0;
        this.f14958A = 0;
        this.f14959B = 0;
        this.f14960C = 0;
        this.f14961D = 0;
        this.f14962E = 0;
        this.f14963F = 0;
        this.f14979z = 0;
        this.f14964G = 0;
        this.f14965H = 0;
        this.f14967J = 0;
        this.f14968K = 0;
        this.f14969L = 0;
        this.f14966I = 0;
        this.f14970M = 0;
        this.f14971N = 0;
        this.f14972O = 0;
        this.f14973P = 0;
        this.f14974Q = 0;
        this.f14975R = 0;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: b */
    public final void mo11796b(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        super.mo11796b(hVar);
        this.f14966I++;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: a */
    public final void mo11794a(AbstractC6571a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo11794a(aVar);
        if (aVar instanceof C9878i) {
            this.f14970M++;
        } else if (aVar instanceof C9605ai) {
            this.f14971N++;
        } else if (aVar instanceof C9895y) {
            this.f14972O++;
        } else {
            if (aVar instanceof C9719cc) {
                if (((int) ((C9719cc) aVar).f23687a) == 3) {
                    this.f14973P++;
                } else if (((int) ((C9719cc) aVar).f23687a) == 1) {
                    this.f14974Q++;
                }
            }
            if ((aVar instanceof C9627ay) && ((C9627ay) aVar).f23446h == 1) {
                this.f14975R++;
            }
        }
        this.f14976w++;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5950g
    /* renamed from: f */
    public final void mo11804f(AbstractC5873h hVar) {
        Boolean bool;
        C89219l.m154721d(hVar, "");
        super.mo11804f(hVar);
        if (hVar instanceof AbstractC5877k) {
            AbstractC5877k kVar = (AbstractC5877k) hVar;
            if (kVar.mo11703D()) {
                this.f14959B++;
                if (hVar instanceof C5993b) {
                    this.f14960C++;
                }
            }
            User b = kVar.mo10375b();
            if (b != null) {
                bool = b.isFollowing;
            } else {
                bool = null;
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                this.f14961D++;
                if (hVar instanceof C5993b) {
                    this.f14962E++;
                }
            }
        }
        this.f14958A++;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: a */
    public final void mo11791a(AbstractC5859b<? extends IMessage> bVar, AbstractC6571a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        super.mo11791a(bVar, aVar);
        this.f14977x++;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: c */
    public final void mo11800c(AbstractC5873h hVar, long j) {
        C89219l.m154721d(hVar, "");
        super.mo11800c(hVar, j);
        if (hVar.mo11680h().f14729a) {
            this.f14963F += hVar.mo11680h().f14731c - hVar.mo11680h().f14730b;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5950g, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5949f
    /* renamed from: a */
    public final void mo11790a(AbstractC5873h hVar, long j) {
        C89219l.m154721d(hVar, "");
        super.mo11790a(hVar, j);
        this.f14978y += hVar.mo11676d().f14728c - hVar.mo11676d().f14727b;
        this.f14979z++;
        if (j == 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("room_id", mo11808e().f14744a);
                jSONObject.put("anchor_id", mo11808e().f14746c);
                jSONObject.put("admin_type", mo11826g());
                if (mo11808e().f14752i) {
                    Long startStreamingTimestamp = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getStartStreamingTimestamp(mo11808e().f14744a);
                    if (startStreamingTimestamp != null) {
                        long longValue = startStreamingTimestamp.longValue();
                        jSONObject.put("public_screen_load_duration", ((AbstractC5949f) this).f14881b - longValue);
                        jSONObject.put("public_screen_first_message_total_duration", this.f14883d - longValue);
                    }
                } else {
                    C11870f fVar = C11870f.C11871a.f28404a;
                    C89219l.m154716b(fVar, "");
                    EnterRoomLinkSession a = fVar.mo19010a();
                    C89219l.m154716b(a, "");
                    EnterRoomConfig.TimeStamp timeStamp = a.f28391b.f28233c.f28325af;
                    if (timeStamp != null) {
                        long j2 = timeStamp.f28388a;
                        jSONObject.put("public_screen_load_duration", ((AbstractC5949f) this).f14881b - j2);
                        jSONObject.put("public_screen_first_message_total_duration", this.f14883d - j2);
                    }
                }
                jSONObject.put("public_screen_first_message_receive_duration", ((AbstractC5949f) this).f14882c - ((AbstractC5949f) this).f14881b);
                jSONObject.put("public_screen_first_message_show_duration", this.f14883d - ((AbstractC5949f) this).f14882c);
            } catch (Exception unused) {
            }
            C11868d.m20958a("livesdk_public_screen_metrics", null, null, jSONObject);
        }
    }
}
