package com.bytedance.android.live.p385p;

import android.widget.LinearLayout;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.p.o */
public enum EnumC5852o {
    LEFT,
    RIGHT,
    POPUP;

    static {
        Covode.recordClassIndex(6459);
    }

    /* renamed from: a */
    private static AbstractC5842g m12793a() {
        return ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).toolbarManager();
    }

    public final C89391z release(DataChannel dataChannel) {
        AbstractC5842g a = m12793a();
        if (a == null) {
            return null;
        }
        a.mo11614a(this, dataChannel);
        return C89391z.f203057a;
    }

    public final C89391z createHolder(DataChannel dataChannel, LinearLayout linearLayout, List<? extends EnumC5847l> list, EnumC5854q qVar) {
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        AbstractC5842g a = m12793a();
        if (a == null) {
            return null;
        }
        a.mo11616a(dataChannel, linearLayout, list, qVar, this);
        return C89391z.f203057a;
    }

    public final C89391z onVisibility(boolean z, DataChannel dataChannel, List<EnumC5847l> list, EnumC5854q qVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        AbstractC5842g a = m12793a();
        if (a == null) {
            return null;
        }
        a.mo11617a(dataChannel, list, qVar, this);
        return C89391z.f203057a;
    }

    public final C89391z refreshHolder(DataChannel dataChannel, LinearLayout linearLayout, List<EnumC5847l> list, EnumC5854q qVar) {
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        AbstractC5842g a = m12793a();
        if (a == null) {
            return null;
        }
        a.mo11620b(dataChannel, linearLayout, list, qVar, this);
        return C89391z.f203057a;
    }
}
