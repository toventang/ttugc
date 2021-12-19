package com.p2082ss.android.ugc.aweme.sticker.view.internal.p4014a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.a.d */
public final class C76145d implements AbstractC76144c {

    /* renamed from: a */
    private final List<AbstractC76122i> f171059a = new ArrayList();

    static {
        Covode.recordClassIndex(89093);
    }

    /* renamed from: a */
    public final void mo119900a(AbstractC76122i iVar) {
        C89219l.m154721d(iVar, "");
        this.f171059a.add(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119861a(int i) {
        Iterator<T> it = this.f171059a.iterator();
        while (it.hasNext()) {
            it.next().mo119861a(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119864a(String str) {
        Iterator<T> it = this.f171059a.iterator();
        while (it.hasNext()) {
            it.next().mo119864a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119863a(int i, String str, AbstractC89172b<? super Integer, ? extends Effect> bVar) {
        C89219l.m154721d(bVar, "");
        Iterator<T> it = this.f171059a.iterator();
        while (it.hasNext()) {
            it.next().mo119863a(i, str, bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76122i
    /* renamed from: a */
    public final void mo119862a(int i, int i2, String str, AbstractC89172b<? super Integer, ? extends Effect> bVar) {
        C89219l.m154721d(bVar, "");
        Iterator<T> it = this.f171059a.iterator();
        while (it.hasNext()) {
            it.next().mo119862a(i, i2, str, bVar);
        }
    }
}
