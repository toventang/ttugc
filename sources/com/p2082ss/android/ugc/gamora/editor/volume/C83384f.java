package com.p2082ss.android.ugc.gamora.editor.volume;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.volume.f */
final /* synthetic */ class C83384f extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f186236a = new C83384f();

    static {
        Covode.recordClassIndex(97270);
    }

    C83384f() {
        super(EditVolumeState.class, "musicVolume", "getMusicVolume()Ljava/lang/Integer;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((EditVolumeState) obj).getMusicVolume();
    }
}
