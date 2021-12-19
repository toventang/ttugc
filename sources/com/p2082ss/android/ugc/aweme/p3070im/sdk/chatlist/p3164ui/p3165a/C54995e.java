package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54823a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55340b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.e */
public final class C54995e extends AbstractC54985b {

    /* renamed from: f */
    private final boolean f125887f;

    /* renamed from: g */
    private final int f125888g;

    /* renamed from: h */
    private final int f125889h;

    static {
        Covode.recordClassIndex(64721);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: a */
    public final int mo91950a() {
        return this.f125888g;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: b */
    public final int mo91951b() {
        return this.f125889h;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: d */
    public final void mo91953d() {
        String str;
        this.f125871d.mo27748b(!this.f125887f, new C54996a(this));
        if (this.f125887f) {
            str = "unmute";
        } else {
            str = "mute";
        }
        C54823a.m100425a(str, this.f125872e.mo91860c());
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.e$a */
    public static final class C54996a implements AbstractC19479b<C19638h> {

        /* renamed from: a */
        final /* synthetic */ C54995e f125890a;

        static {
            Covode.recordClassIndex(64722);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo27861a(C19638h hVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54996a(C54995e eVar) {
            this.f125890a = eVar;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C55340b.m101158a(this.f125890a.f125870c, uVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54995e(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
        super(context, bVar, aVar, (byte) 0);
        int i;
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        boolean z = false;
        C19638h c = bVar.mo27749c();
        z = c != null ? c.isMute() : z;
        this.f125887f = z;
        if (z) {
            i = R.string.b9b;
        } else {
            i = R.string.b9_;
        }
        this.f125888g = i;
        this.f125889h = R.raw.icon_bell_slash;
    }
}
