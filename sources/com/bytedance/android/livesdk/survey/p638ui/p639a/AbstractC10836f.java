package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.f */
public abstract class AbstractC10836f {

    /* renamed from: a */
    private C10837g f26066a;

    /* renamed from: d */
    public final C88411a f26067d;

    /* renamed from: e */
    public DataChannel f26068e;

    /* renamed from: f */
    public boolean f26069f;

    static {
        Covode.recordClassIndex(12438);
    }

    /* renamed from: a */
    public abstract void mo17734a();

    private AbstractC10836f() {
        this.f26069f = false;
        this.f26067d = new C88411a();
    }

    public /* synthetic */ AbstractC10836f(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo17737a(C10837g gVar) {
        C89219l.m154721d(gVar, "");
        this.f26066a = gVar;
    }

    /* renamed from: a */
    public final void mo17738a(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f26068e = dataChannel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17739a(boolean z) {
        if (this.f26069f != z) {
            this.f26069f = z;
            C10837g gVar = this.f26066a;
            if (gVar != null) {
                gVar.mo17741a(z);
            }
        }
    }
}
