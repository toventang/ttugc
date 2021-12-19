package com.p2082ss.android.ugc.aweme.sticker.view.internal.p4014a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.AbstractC75461d;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.a.a */
public final class C76140a implements AbstractC76122i {

    /* renamed from: a */
    private final HashMap<String, Boolean> f171047a = new HashMap<>();

    /* renamed from: b */
    private final ArrayList<String> f171048b = new ArrayList<>();

    /* renamed from: c */
    private final AbstractC75461d f171049c;

    static {
        Covode.recordClassIndex(89088);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119861a(int i) {
    }

    public C76140a(AbstractC75461d dVar) {
        C89219l.m154721d(dVar, "");
        this.f171049c = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119864a(String str) {
        for (String str2 : this.f171047a.keySet()) {
            HashMap<String, Boolean> hashMap = this.f171047a;
            C89219l.m154716b(str2, "");
            hashMap.put(str2, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119863a(int i, String str, AbstractC89172b<? super Integer, ? extends Effect> bVar) {
        String adRawData;
        C89219l.m154721d(bVar, "");
        Effect effect = (Effect) bVar.invoke(Integer.valueOf(i + 1));
        if (effect != null && (adRawData = effect.getAdRawData()) != null && adRawData.length() != 0) {
            String effectId = effect.getEffectId();
            Boolean bool = this.f171047a.get(effectId);
            if (bool == null || !bool.booleanValue()) {
                this.f171049c.mo59542b(effect);
            }
            this.f171047a.put(effectId, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119862a(int i, int i2, String str, AbstractC89172b<? super Integer, ? extends Effect> bVar) {
        String adRawData;
        C89219l.m154721d(bVar, "");
        this.f171048b.clear();
        int i3 = i2 + 1;
        for (int i4 = i + 1; i4 < i3; i4++) {
            Effect effect = (Effect) bVar.invoke(Integer.valueOf(i4));
            if (!(effect == null || (adRawData = effect.getAdRawData()) == null || adRawData.length() == 0)) {
                String effectId = effect.getEffectId();
                Boolean bool = this.f171047a.get(effectId);
                if (bool == null || !bool.booleanValue()) {
                    this.f171049c.mo59542b(effect);
                }
                this.f171047a.put(effectId, true);
                this.f171048b.add(effectId);
            }
        }
        for (String str2 : this.f171047a.keySet()) {
            if (!this.f171048b.contains(str2)) {
                HashMap<String, Boolean> hashMap = this.f171047a;
                C89219l.m154716b(str2, "");
                hashMap.put(str2, false);
            }
        }
    }
}
