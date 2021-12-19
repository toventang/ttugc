package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a;

import android.content.Context;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.DmViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54823a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.C54839a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.f */
public final class C54997f extends AbstractC54985b {

    /* renamed from: f */
    private final int f125891f = R.string.b9a;

    /* renamed from: g */
    private final int f125892g = R.raw.icon_tick_circle;

    /* renamed from: h */
    private final boolean f125893h;

    /* renamed from: i */
    private final AbstractC89244h f125894i;

    static {
        Covode.recordClassIndex(64723);
    }

    /* renamed from: h */
    private final boolean m100607h() {
        return ((Boolean) this.f125894i.getValue()).booleanValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: a */
    public final int mo91950a() {
        return this.f125891f;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: b */
    public final int mo91951b() {
        return this.f125892g;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: e */
    public final boolean mo91954e() {
        if (this.f125893h || m100607h()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.f$a */
    static final class C54998a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C54997f f125895a;

        static {
            Covode.recordClassIndex(64724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54998a(C54997f fVar) {
            super(0);
            this.f125895a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Integer mark_read;
            C54839a c = C54881c.m100498c(this.f125895a.f125868a);
            if (c == null || (mark_read = c.getMark_read()) == null || mark_read.intValue() != 0) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: d */
    public final void mo91953d() {
        C1213t<String> a;
        if (this.f125893h) {
            this.f125871d.mo27751e();
        }
        if (m100607h()) {
            C54881c.m100501e(this.f125868a);
            DmViewModel a2 = DmViewModel.C54241a.m99497a(C17873f.m33102j());
            if (!(a2 == null || (a = a2.mo91332a()) == null)) {
                a.setValue(this.f125869b);
            }
        }
        C54823a.m100425a("read", this.f125872e.mo91860c());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54997f(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
        super(context, bVar, aVar, (byte) 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        boolean z = false;
        C19638h hVar = this.f125868a;
        if (hVar != null && hVar.getUnreadCount() > 0) {
            z = true;
        }
        this.f125893h = z;
        this.f125894i = C89250i.m154773a((AbstractC89171a) new C54998a(this));
    }
}
