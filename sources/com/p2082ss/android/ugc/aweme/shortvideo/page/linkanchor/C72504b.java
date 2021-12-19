package com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor;

import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1210r;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89624i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.b */
public final class C72504b {
    static {
        Covode.recordClassIndex(85182);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.b$a */
    public static final class C72505a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f162510a;

        /* renamed from: b */
        final /* synthetic */ C1210r f162511b;

        /* renamed from: c */
        final /* synthetic */ LiveData f162512c;

        /* renamed from: d */
        final /* synthetic */ LiveData f162513d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89516am f162514e;

        /* renamed from: f */
        final /* synthetic */ long f162515f = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

        static {
            Covode.recordClassIndex(85183);
        }

        C72505a(C89233z.C89238e eVar, C1210r rVar, LiveData liveData, LiveData liveData2, AbstractC89516am amVar) {
            this.f162510a = eVar;
            this.f162511b = rVar;
            this.f162512c = liveData;
            this.f162513d = liveData2;
            this.f162514e = amVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(T t) {
            T t2 = this.f162510a.element;
            if (t2 != null) {
                t2.mo143985a(null);
            }
            this.f162510a.element = (T) C89624i.m155555a(this.f162514e, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor.C72504b.C72505a.C725061 */

                /* renamed from: a */
                int f162516a;

                /* renamed from: b */
                final /* synthetic */ C72505a f162517b;

                static {
                    Covode.recordClassIndex(85184);
                }

                {
                    this.f162517b = r2;
                }

                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                    C89219l.m154721d(dVar, "");
                    return 
                }
