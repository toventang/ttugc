package com.p2082ss.android.ugc.aweme.infoSticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.i */
public final class C56724i {

    /* renamed from: a */
    public final VideoPublishEditModel f129274a;

    /* renamed from: b */
    private final AbstractC89244h f129275b = C89250i.m154773a((AbstractC89171a) new C56726b(this));

    static {
        Covode.recordClassIndex(66584);
    }

    /* renamed from: a */
    public final StickerChallenge mo93671a() {
        return (StickerChallenge) this.f129275b.getValue();
    }

    /* renamed from: c */
    public final Collection<AVChallenge> mo93675c() {
        return mo93671a().getRecordStickerChallengeList();
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.i$b */
    static final class C56726b extends AbstractC89220m implements AbstractC89171a<StickerChallenge> {

        /* renamed from: a */
        final /* synthetic */ C56724i f129278a;

        static {
            Covode.recordClassIndex(66586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56726b(C56724i iVar) {
            super(0);
            this.f129278a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StickerChallenge invoke() {
            if (this.f129278a.f129274a.stickerChallenge == null) {
                return new StickerChallenge();
            }
            return this.f129278a.f129274a.stickerChallenge;
        }
    }

    /* renamed from: b */
    public final Collection<AVChallenge> mo93674b() {
        Collection<AVChallenge> values = mo93671a().getStickerToChallenge().values();
        C89219l.m154716b(values, "");
        return values;
    }

    public C56724i(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f129274a = videoPublishEditModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.i$a */
    public static final class C56725a implements AbstractC56659a {

        /* renamed from: a */
        final /* synthetic */ C56724i f129276a;

        /* renamed from: b */
        final /* synthetic */ Effect f129277b;

        static {
            Covode.recordClassIndex(66585);
        }

        public C56725a(C56724i iVar, Effect effect) {
            this.f129276a = iVar;
            this.f129277b = effect;
        }

        @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56659a
        /* renamed from: a */
        public final void mo93541a(AVChallenge aVChallenge) {
            this.f129276a.mo93671a().getStickerList().add(this.f129277b.getEffectId());
            this.f129276a.mo93671a().getStickerToChallenge().put(this.f129277b.getEffectId(), aVChallenge);
        }
    }

    /* renamed from: a */
    public final void mo93673a(List<? extends AVChallenge> list) {
        if ((!list.isEmpty()) && list != null) {
            mo93671a().getRecordStickerChallengeList().clear();
            mo93671a().getRecordStickerChallengeList().addAll(list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r2 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r5.f129274a.removeChallengeFromTitleAndStruct(p4600h.p4601a.C89047am.m154436a(r4));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93672a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.infoSticker.C56724i.mo93672a(java.lang.String):void");
    }
}
