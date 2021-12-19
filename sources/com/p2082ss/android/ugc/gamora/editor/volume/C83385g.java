package com.p2082ss.android.ugc.gamora.editor.volume;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.gamora.editor.music.EditMusicState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.volume.g */
final /* synthetic */ class C83385g extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f186237a = new C83385g();

    static {
        Covode.recordClassIndex(97271);
    }

    C83385g() {
        super(EditMusicState.class, "enableChangeVoice", "getEnableChangeVoice()Lcom/bytedance/jedi/arch/JediBooleanEvent;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((EditMusicState) obj).getEnableChangeVoice();
    }
}
