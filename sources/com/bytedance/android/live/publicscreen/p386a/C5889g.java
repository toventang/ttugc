package com.bytedance.android.live.publicscreen.p386a;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.a.g */
public final class C5889g {

    /* renamed from: a */
    public final long f14744a;

    /* renamed from: b */
    public final long f14745b;

    /* renamed from: c */
    public final long f14746c;

    /* renamed from: d */
    public final Context f14747d;

    /* renamed from: e */
    public final AbstractC1204m f14748e;

    /* renamed from: f */
    public final boolean f14749f;

    /* renamed from: g */
    public final boolean f14750g;

    /* renamed from: h */
    public final boolean f14751h;

    /* renamed from: i */
    public final boolean f14752i;

    /* renamed from: j */
    public final Room f14753j;

    /* renamed from: k */
    public final User f14754k;

    /* renamed from: l */
    public final DataChannel f14755l;

    /* renamed from: m */
    public final AbstractC5857a f14756m;

    /* renamed from: n */
    public final AbstractC5865d f14757n;

    static {
        Covode.recordClassIndex(6496);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5889g)) {
            return false;
        }
        C5889g gVar = (C5889g) obj;
        return C89219l.m154714a(this.f14747d, gVar.f14747d) && C89219l.m154714a(this.f14748e, gVar.f14748e) && this.f14749f == gVar.f14749f && this.f14750g == gVar.f14750g && this.f14751h == gVar.f14751h && this.f14752i == gVar.f14752i && C89219l.m154714a(this.f14753j, gVar.f14753j) && C89219l.m154714a(this.f14754k, gVar.f14754k) && C89219l.m154714a(this.f14755l, gVar.f14755l) && C89219l.m154714a(this.f14756m, gVar.f14756m) && C89219l.m154714a(this.f14757n, gVar.f14757n);
    }

    public final int hashCode() {
        Context context = this.f14747d;
        int i = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        AbstractC1204m mVar = this.f14748e;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        boolean z = this.f14749f;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        boolean z2 = this.f14750g;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f14751h;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        if (!this.f14752i) {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        Room room = this.f14753j;
        int hashCode3 = (i15 + (room != null ? room.hashCode() : 0)) * 31;
        User user = this.f14754k;
        int hashCode4 = (hashCode3 + (user != null ? user.hashCode() : 0)) * 31;
        DataChannel dataChannel = this.f14755l;
        int hashCode5 = (hashCode4 + (dataChannel != null ? dataChannel.hashCode() : 0)) * 31;
        AbstractC5857a aVar = this.f14756m;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC5865d dVar = this.f14757n;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "PublicScreenContext(context=" + this.f14747d + ", owner=" + this.f14748e + ", isRtl=" + this.f14749f + ", isPortrait=" + this.f14750g + ", isTranslationEnabled=" + this.f14751h + ", isAnchor=" + this.f14752i + ", room=" + this.f14753j + ", anchor=" + this.f14754k + ", dataChannel=" + this.f14755l + ", publicScreenConfigurationProvider=" + this.f14756m + ", presenter=" + this.f14757n + ")";
    }

    /* renamed from: a */
    public final User mo11740a() {
        DataChannel dataChannel = this.f14755l;
        if (dataChannel != null) {
            return (User) dataChannel.mo28318b(C9101dm.class);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo11743a(AbstractC5877k<? extends AbstractC6571a> kVar) {
        this.f14757n.mo11669a(kVar);
    }

    /* renamed from: a */
    public final void mo11742a(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        AbstractC5880e eVar = (AbstractC5880e) C6193a.m13435a(AbstractC5880e.class);
        if (eVar != null) {
            eVar.updateModel(this.f14744a, hVar);
        }
    }

    /* renamed from: a */
    public final void mo11741a(TextView textView) {
        C89219l.m154721d(textView, "");
        if (((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).uiOptimized(this.f14750g)) {
            Context context = textView.getContext();
            C89219l.m154716b(context, "");
            float dimension = context.getResources().getDimension(R.dimen.xz);
            Context context2 = textView.getContext();
            C89219l.m154716b(context2, "");
            textView.setShadowLayer(dimension, 0.0f, context2.getResources().getDimension(R.dimen.y0), C0643b.m2378c(textView.getContext(), R.color.a0r));
            return;
        }
        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public C5889g(Context context, AbstractC1204m mVar, boolean z, boolean z2, boolean z3, boolean z4, Room room, User user, DataChannel dataChannel, AbstractC5857a aVar, AbstractC5865d dVar) {
        long j;
        long j2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar, "");
        this.f14747d = context;
        this.f14748e = mVar;
        this.f14749f = z;
        this.f14750g = z2;
        this.f14751h = z3;
        this.f14752i = z4;
        this.f14753j = room;
        this.f14754k = user;
        this.f14755l = dataChannel;
        this.f14756m = aVar;
        this.f14757n = dVar;
        long j3 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.f14744a = j;
        User a = mo11740a();
        if (a != null) {
            j2 = a.getId();
        } else {
            j2 = 0;
        }
        this.f14745b = j2;
        this.f14746c = user != null ? user.getId() : j3;
    }
}
