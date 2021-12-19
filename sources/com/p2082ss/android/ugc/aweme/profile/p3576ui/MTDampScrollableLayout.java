package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MTDampScrollableLayout */
public final class MTDampScrollableLayout extends DampScrollableLayout {

    /* renamed from: P */
    public static final C63941a f145005P = new C63941a((byte) 0);

    /* renamed from: Q */
    private boolean f145006Q;

    static {
        Covode.recordClassIndex(75376);
    }

    public MTDampScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.MTDampScrollableLayout$a */
    public static final class C63941a {
        static {
            Covode.recordClassIndex(75377);
        }

        private C63941a() {
        }

        public /* synthetic */ C63941a(byte b) {
            this();
        }
    }

    public final boolean getMFlag3() {
        return this.f145006Q;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout
    /* renamed from: b */
    public final boolean mo68060b() {
        return super.mo68060b();
    }

    public final void setMFlag3(boolean z) {
        this.f145006Q = z;
    }

    private /* synthetic */ MTDampScrollableLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MTDampScrollableLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
