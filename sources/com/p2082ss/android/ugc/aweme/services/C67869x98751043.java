package com.p2082ss.android.ugc.aweme.services;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.property.C65365be;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76177c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76245b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76359j;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import java.lang.reflect.Type;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$2 */
public final class C67869x98751043 extends AbstractC21603p<AbstractC76115b<C84984j, Fragment>> {
    final /* synthetic */ ShortVideoContext $shortVideoContext$inlined;
    final /* synthetic */ InternalRecordServiceImpl this$0;

    static {
        Covode.recordClassIndex(79672);
    }

    @Override // com.bytedance.p1559o.AbstractC21603p
    public final AbstractC76115b<C84984j, Fragment> get(final C21582f fVar) {
        C89219l.m154721d(fVar, "");
        C76177c cVar = new C76177c((byte) 0);
        cVar.mo119931a("sticker_category:favorite", new C76245b((AbstractC1204m) fVar.mo35248a(AbstractC1204m.class, (String) null), (AbstractC75361b) fVar.mo35248a(AbstractC75361b.class, (String) null), ((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23167t(), (StickerPreferences) fVar.mo35248a(StickerPreferences.class, (String) null)));
        if (C65365be.m117061a()) {
            cVar.mo119931a("sticker_category:search", new C76359j((ActivityC0945e) fVar.mo35248a(ActivityC0945e.class, (String) null), (AbstractC76329a) fVar.mo35248a(AbstractC76329a.class, (String) null), this.this$0.assembleStickerDependencyRequired(fVar), (C75574j) fVar.mo35248a(C75574j.class, (String) null), new AbstractC89171a<C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.services.C67869x98751043.C678701 */

                static {
                    Covode.recordClassIndex(79673);
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final void invoke() {
                    AbstractC75573i v = ((AbstractC84089j) fVar.mo35249a((Type) AbstractC84089j.class, (String) null)).mo23169v();
                    if (v != null) {
                        v.mo119148l();
                    }
                }
            }));
        }
        return cVar;
    }

    public C67869x98751043(InternalRecordServiceImpl internalRecordServiceImpl, ShortVideoContext shortVideoContext) {
        this.this$0 = internalRecordServiceImpl;
        this.$shortVideoContext$inlined = shortVideoContext;
    }
}
