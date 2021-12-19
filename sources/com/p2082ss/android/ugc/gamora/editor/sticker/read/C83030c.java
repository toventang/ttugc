package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.C84401c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.c */
public final class C83030c {
    static {
        Covode.recordClassIndex(96903);
    }

    /* renamed from: a */
    public static final ArrayList<C83029b> m143351a(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null) {
            return new ArrayList<>();
        }
        ArrayList<C83029b> arrayList = new ArrayList<>();
        for (T t : effectChannelResponse.getAllCategoryEffects()) {
            try {
                C83060e eVar = (C83060e) C84401c.f188719c.mo46670a(t.getExtra(), C83060e.class);
                if (eVar != null) {
                    String name = t.getName();
                    C89219l.m154721d(name, "");
                    eVar.f185596b = name;
                }
                if (eVar == null) {
                    eVar = new C83060e(false, null, null, null, 63);
                }
                arrayList.add(new C83029b(t, eVar));
            } catch (Exception e) {
                C84401c.f188722f.mo123659a(e);
            }
        }
        return arrayList;
    }
}
