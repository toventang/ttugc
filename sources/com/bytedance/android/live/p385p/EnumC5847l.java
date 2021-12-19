package com.bytedance.android.live.p385p;

import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.p.l */
public enum EnumC5847l {
    INTERACTION(R.layout.bf7),
    INTERACTION_PK(R.layout.bf8),
    COHOST(R.layout.bf4),
    MULTIGUEST(R.layout.bfa),
    SLOT(R.layout.bf2),
    AUDIENCE_SLOT(R.layout.bf0),
    QUESTION(2131234555, 0),
    STICKER_DONATION(2131234667, R.string.dz_),
    SHARE(2131234578, R.string.gvm),
    EFFECT(2131234445, 0),
    CLOSE_ROOM(2131234611, 0),
    MORE(2131234525, 0),
    REVERSE_CAMERA(2131234563, R.string.e9p),
    REVERSE_MIRROR(2131234569, R.string.e95),
    INTRO(2131234504, R.string.ebq),
    PAUSE_LIVE(2131234533, R.string.duj),
    SETTING(2131234511, R.string.e5n),
    COMMENT(2131234436, R.string.gv5),
    STREAM_KEY(2131234605, R.string.ekl),
    TOPICS(2131234893, R.string.eab),
    TASK(2131234013, R.string.ecv),
    BEAUTY(2131234610, R.string.e9m),
    STICKER(2131234514, R.string.e6q),
    PROPS(2131234510, R.string.dt0),
    GIFT(R.layout.bf6),
    FAST_GIFT(R.layout.bf6),
    BROADCAST_GIFT(2131234456, R.string.e9r),
    DUMMY_GIFT(2131234669, R.string.gns),
    DUMMY_FAST_GIFT(R.layout.bf6),
    DUMMY_BROADCAST_GIFT(2131234668, R.string.e9r),
    REDENVELOPE(2131234616, R.string.eml);
    

    /* renamed from: b */
    private int f14704b;

    /* renamed from: c */
    private int f14705c;

    /* renamed from: d */
    private Integer f14706d;
    public boolean isButtonVisible = true;
    public boolean isEnableClick = true;
    public boolean isRedDotVisible;

    public final int getDrawable() {
        return this.f14704b;
    }

    public final Integer getLayoutId() {
        return this.f14706d;
    }

    public final int getTitleId() {
        return this.f14705c;
    }

    /* renamed from: a */
    private static AbstractC5842g m12789a() {
        return ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).toolbarManager();
    }

    public final Integer getRTLDrawable() {
        if (!C3966y.m9672g() || C5848m.f14707a[ordinal()] != 1) {
            return null;
        }
        return 2131234556;
    }

    static {
        Covode.recordClassIndex(6454);
    }

    public final View getView(DataChannel dataChannel) {
        AbstractC5842g a = m12789a();
        if (a != null) {
            return a.mo11608a(this);
        }
        return null;
    }

    public final C89391z hide(DataChannel dataChannel) {
        AbstractC5842g a = m12789a();
        if (a == null) {
            return null;
        }
        a.mo11621c(this, dataChannel);
        return C89391z.f203057a;
    }

    public final C89391z hideRedDot(DataChannel dataChannel) {
        AbstractC5842g a = m12789a();
        if (a == null) {
            return null;
        }
        a.mo11613a(this, dataChannel, false);
        return C89391z.f203057a;
    }

    public final boolean isRedDotShowing(DataChannel dataChannel) {
        AbstractC5842g a = m12789a();
        if (a != null) {
            return a.mo11622d(this, dataChannel);
        }
        return false;
    }

    public final C89391z show(DataChannel dataChannel) {
        AbstractC5842g a = m12789a();
        if (a == null) {
            return null;
        }
        a.mo11618b(this, dataChannel);
        return C89391z.f203057a;
    }

    public final C89391z showRedDot(DataChannel dataChannel) {
        AbstractC5842g a = m12789a();
        if (a == null) {
            return null;
        }
        a.mo11613a(this, dataChannel, true);
        return C89391z.f203057a;
    }

    public final C89391z unload(DataChannel dataChannel) {
        AbstractC5842g a = m12789a();
        if (a == null) {
            return null;
        }
        a.mo11611a(this, dataChannel);
        return C89391z.f203057a;
    }

    public final C89391z setBackgroundResource(DataChannel dataChannel, int i) {
        AbstractC5842g a = m12789a();
        if (a == null) {
            return null;
        }
        a.mo11610a(this, i);
        return C89391z.f203057a;
    }

    public final C89391z setEnableClick(DataChannel dataChannel, boolean z) {
        AbstractC5842g a = m12789a();
        if (a == null) {
            return null;
        }
        a.mo11619b(this, dataChannel, z);
        return C89391z.f203057a;
    }

    public final C89391z setRedDotVisible(DataChannel dataChannel, boolean z) {
        AbstractC5842g a = m12789a();
        if (a == null) {
            return null;
        }
        a.mo11613a(this, dataChannel, z);
        return C89391z.f203057a;
    }

    public final C89391z load(DataChannel dataChannel, AbstractView$OnClickListenerC5841f fVar) {
        C89219l.m154721d(fVar, "");
        AbstractC5842g a = m12789a();
        if (a == null) {
            return null;
        }
        a.mo11612a(this, dataChannel, fVar);
        return C89391z.f203057a;
    }

    private EnumC5847l(int i) {
        this.f14706d = Integer.valueOf(i);
    }

    public final void load(DataChannel dataChannel, AbstractView$OnClickListenerC5841f fVar, boolean z) {
        C89219l.m154721d(fVar, "");
        this.isButtonVisible = z;
        AbstractC5842g a = m12789a();
        if (a != null) {
            a.mo11612a(this, dataChannel, fVar);
        }
    }

    private EnumC5847l(int i, int i2) {
        this.f14704b = i;
        this.f14705c = i2;
    }
}
