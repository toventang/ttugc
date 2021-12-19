package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75421b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import java.lang.reflect.Type;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$1 */
public final class C67867x98751042 extends AbstractC21603p<AbstractC75429h> {
    final /* synthetic */ ShortVideoContext $shortVideoContext$inlined;
    final /* synthetic */ InternalRecordServiceImpl this$0;

    static {
        Covode.recordClassIndex(79670);
    }

    @Override // com.bytedance.p1559o.AbstractC21603p
    public final AbstractC75429h get(final C21582f fVar) {
        C89219l.m154721d(fVar, "");
        return new C75421b(this.$shortVideoContext$inlined, new AbstractC89171a<AbstractC84089j>() {
            /* class com.p2082ss.android.ugc.aweme.services.C67867x98751042.C678681 */

            static {
                Covode.recordClassIndex(79671);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final AbstractC84089j invoke() {
                return (AbstractC84089j) fVar.mo35249a((Type) AbstractC84089j.class, (String) null);
            }
        });
    }

    public C67867x98751042(InternalRecordServiceImpl internalRecordServiceImpl, ShortVideoContext shortVideoContext) {
        this.this$0 = internalRecordServiceImpl;
        this.$shortVideoContext$inlined = shortVideoContext;
    }
}
