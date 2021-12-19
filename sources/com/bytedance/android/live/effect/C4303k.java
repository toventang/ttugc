package com.bytedance.android.live.effect;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4152e;
import com.bytedance.android.live.effect.api.p240a.AbstractC4162k;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p241b.C4179b;
import com.bytedance.android.live.effect.p241b.C4180c;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.k */
public final class C4303k implements AbstractC4162k {

    /* renamed from: a */
    public static final C4303k f11839a = new C4303k();

    private C4303k() {
    }

    static {
        Covode.recordClassIndex(4873);
    }

    /* renamed from: com.bytedance.android.live.effect.k$b */
    static final class C4305b extends AbstractC89220m implements AbstractC89172b<List<? extends FilterModel>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DataChannel f11841a;

        static {
            Covode.recordClassIndex(4875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4305b(DataChannel dataChannel) {
            super(1);
            this.f11841a = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends FilterModel> list) {
            C89219l.m154721d(list, "");
            C4208j jVar = C4208j.C4212b.f11691a;
            DataChannel dataChannel = this.f11841a;
            C6805b<Integer> bVar = AbstractC6804a.f16886O;
            C89219l.m154716b(bVar, "");
            Integer a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            jVar.mo9921a(dataChannel, a.intValue(), true, false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.effect.k$a */
    static final class C4304a extends AbstractC89220m implements AbstractC89172b<List<? extends C4315e<C11672a>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DataChannel f11840a;

        static {
            Covode.recordClassIndex(4874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4304a(DataChannel dataChannel) {
            super(1);
            this.f11840a = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C4315e<C11672a>> list) {
            List<? extends C4315e<C11672a>> list2 = list;
            C89219l.m154721d(list2, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                arrayList.addAll(t.f11862b);
                for (T t2 : t.f11862b) {
                    Collection collection = t2.f27907o;
                    if (collection == null) {
                        collection = C89086z.INSTANCE;
                    }
                    arrayList.addAll(collection);
                }
            }
            C4180c a = C4180c.C4181a.m10258a();
            String str = C4147a.f11586d;
            C89219l.m154716b(str, "");
            a.mo9861a(str, arrayList);
            C4208j.C4212b.f11691a.mo9920a(this.f11840a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4162k
    /* renamed from: a */
    public final void mo9871a(DataChannel dataChannel, AbstractC1204m mVar, boolean z) {
        AbstractC4152e f;
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(mVar, "");
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            C4284g.m10389a(dataChannel);
            if (z) {
                dataChannel.mo28309a(mVar, C4142a.class, (AbstractC89172b) new C4304a(dataChannel)).mo28309a(mVar, C4242e.class, (AbstractC89172b) new C4305b(dataChannel));
                return;
            }
            if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
                f = C4180c.C4181a.m10258a();
            } else {
                f = C4179b.m10204f();
                C89219l.m154716b(f, "");
            }
            f.mo9851c();
        } else if (z) {
            C4208j.C4212b.f11691a.mo9920a(dataChannel);
            return;
        }
        C4208j jVar = C4208j.C4212b.f11691a;
        C6805b<Integer> bVar = AbstractC6804a.f16886O;
        C89219l.m154716b(bVar, "");
        Integer a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        jVar.mo9921a(dataChannel, a.intValue(), true, false);
    }
}
