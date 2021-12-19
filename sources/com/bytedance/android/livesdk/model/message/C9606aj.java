package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p580d.p581a.C9746a;
import com.bytedance.android.livesdk.model.message.p580d.p582b.C9749a;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9753c;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9754d;
import com.bytedance.android.livesdk.model.message.p580d.p584d.C9761a;
import com.bytedance.android.livesdk.model.message.p580d.p585e.C9763a;
import com.bytedance.android.livesdk.model.message.p580d.p586f.C9765a;
import com.bytedance.android.livesdk.model.message.p580d.p587g.C9769a;
import com.bytedance.android.livesdk.model.message.p580d.p588h.C9771a;
import com.bytedance.android.livesdk.model.message.p580d.p589i.C9776a;
import com.bytedance.android.livesdk.model.message.p580d.p590j.C9778a;
import com.bytedance.android.livesdk.model.message.p580d.p591k.C9780a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.aj */
public class C9606aj extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "message_type")

    /* renamed from: a */
    public int f23319a;
    @AbstractC27891c(mo46611a = "linker_id")

    /* renamed from: f */
    public long f23320f;
    @AbstractC27891c(mo46611a = "scene")

    /* renamed from: g */
    public int f23321g;
    @AbstractC27891c(mo46611a = "invite_content")

    /* renamed from: h */
    public C9753c f23322h;
    @AbstractC27891c(mo46611a = "reply_content")

    /* renamed from: i */
    public C9780a f23323i;
    @AbstractC27891c(mo46611a = "cancel_content")

    /* renamed from: j */
    public C9746a f23324j;
    @AbstractC27891c(mo46611a = "linked_list_change_content")

    /* renamed from: k */
    public C9765a f23325k;
    @AbstractC27891c(mo46611a = "enter_content")

    /* renamed from: l */
    public C9749a f23326l;
    @AbstractC27891c(mo46611a = "kick_out_content")

    /* renamed from: m */
    public C9761a f23327m;
    @AbstractC27891c(mo46611a = "leave_content")

    /* renamed from: n */
    public C9763a f23328n;
    @AbstractC27891c(mo46611a = "mute_content")

    /* renamed from: o */
    public C9776a f23329o;
    @AbstractC27891c(mo46611a = "random_match_content")

    /* renamed from: p */
    public C9778a f23330p;
    @AbstractC27891c(mo46611a = "mic_idx_update_content")

    /* renamed from: q */
    public C9771a f23331q;
    @AbstractC27891c(mo46611a = "list_change_content")

    /* renamed from: r */
    public C9769a f23332r;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: s */
    public String f23333s;
    @AbstractC27891c(mo46611a = "expire_timestamp")

    /* renamed from: t */
    public long f23334t;
    @AbstractC27891c(mo46611a = "transfer_extra")

    /* renamed from: u */
    public String f23335u;

    /* renamed from: v */
    public C9754d f23336v;

    static {
        Covode.recordClassIndex(11148);
    }

    public C9606aj() {
        this.f28131L = EnumC9596a.LINK_MESSAGE;
    }

    /* renamed from: d */
    public final long mo16563d() {
        return this.f28132M - this.f28134O.f28135a;
    }

    /* renamed from: e */
    public final boolean mo16564e() {
        if (this.f23334t > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long mo16565f() {
        long j = this.f23334t;
        if (j > 0) {
            return j - this.f28132M;
        }
        return 0;
    }

    /* renamed from: c */
    public final EnumC9607a mo16562c() {
        int i = this.f23321g;
        if (i == 2) {
            return EnumC9607a.ANCHOR_LINKMIC;
        }
        if (i != 4) {
            return EnumC9607a.OTHER;
        }
        return EnumC9607a.AUDIENCE_LINKMIC;
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.aj$a */
    public enum EnumC9607a {
        ANCHOR_LINKMIC,
        AUDIENCE_LINKMIC,
        OTHER;

        static {
            Covode.recordClassIndex(11149);
        }
    }

    public String toString() {
        return "LinkMessage{messageType=" + this.f23319a + ", channelId=" + this.f23320f + ", scene=" + this.f23321g + ", linkerInviteContent=" + this.f23322h + ", extraStr='" + this.f23333s + '\'' + ", linkerInviteMessageExtra=" + this.f23336v + '}';
    }
}
