package com.p2082ss.android.ugc.aweme.services.superentrance;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent */
public final class SuperEntranceEvent implements AbstractC81914b {
    public static final Companion Companion = new Companion(null);
    private String iconUrl;
    private boolean show;
    private String tipText;
    private int type;

    static {
        Covode.recordClassIndex(79997);
    }

    public final AbstractC81914b post() {
        return AbstractC81915c.m141874a(this);
    }

    public final AbstractC81914b postSticky() {
        return AbstractC81915c.m141875b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79998);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final String getTipText() {
        return this.tipText;
    }

    public final int getType() {
        return this.type;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setTipText(String str) {
        this.tipText = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public SuperEntranceEvent(int i, boolean z) {
        this.type = i;
        this.show = z;
    }
}
