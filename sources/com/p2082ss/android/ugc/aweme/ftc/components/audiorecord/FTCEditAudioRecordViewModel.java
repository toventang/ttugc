package com.p2082ss.android.ugc.aweme.ftc.components.audiorecord;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel */
public final class FTCEditAudioRecordViewModel extends LifecycleAwareViewModel<FTCEditAudioRecordState> implements AbstractC52016c {

    /* renamed from: a */
    final C1213t<Boolean> f119813a = new C1213t<>();

    static {
        Covode.recordClassIndex(61383);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.AbstractC52016c
    /* renamed from: c */
    public final LiveData<Boolean> mo87739c() {
        return this.f119813a;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.AbstractC52016c
    /* renamed from: a */
    public final void mo87737a() {
        mo33690d(C52010b.f119815a);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.AbstractC52016c
    /* renamed from: b */
    public final void mo87738b() {
        mo33690d(C52009a.f119814a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FTCEditAudioRecordState(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel$a */
    static final class C52009a extends AbstractC89220m implements AbstractC89172b<FTCEditAudioRecordState, FTCEditAudioRecordState> {

        /* renamed from: a */
        public static final C52009a f119814a = new C52009a();

        static {
            Covode.recordClassIndex(61384);
        }

        C52009a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditAudioRecordState invoke(FTCEditAudioRecordState fTCEditAudioRecordState) {
            FTCEditAudioRecordState fTCEditAudioRecordState2 = fTCEditAudioRecordState;
            C89219l.m154721d(fTCEditAudioRecordState2, "");
            return fTCEditAudioRecordState2.copy(new AbstractC23517a.C23518a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel$b */
    static final class C52010b extends AbstractC89220m implements AbstractC89172b<FTCEditAudioRecordState, FTCEditAudioRecordState> {

        /* renamed from: a */
        public static final C52010b f119815a = new C52010b();

        static {
            Covode.recordClassIndex(61385);
        }

        C52010b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditAudioRecordState invoke(FTCEditAudioRecordState fTCEditAudioRecordState) {
            FTCEditAudioRecordState fTCEditAudioRecordState2 = fTCEditAudioRecordState;
            C89219l.m154721d(fTCEditAudioRecordState2, "");
            return fTCEditAudioRecordState2.copy(new AbstractC23517a.C23519b());
        }
    }
}
