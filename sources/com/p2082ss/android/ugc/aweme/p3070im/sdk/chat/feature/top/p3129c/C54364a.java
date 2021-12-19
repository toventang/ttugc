package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3129c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55262b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.c.a */
public final class C54364a {

    /* renamed from: a */
    static final String f124512a = "DmSafetyNotice";

    /* renamed from: b */
    public static final C54364a f124513b = new C54364a();

    /* renamed from: c */
    private static final AbstractC89516am f124514c = C89517an.m155448a(C89546bf.f203267b);

    private C54364a() {
    }

    static {
        Covode.recordClassIndex(64066);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.c.a$a */
    static final class C54365a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f124515a;

        /* renamed from: b */
        final /* synthetic */ String f124516b;

        /* renamed from: c */
        final /* synthetic */ int f124517c;

        /* renamed from: d */
        final /* synthetic */ String f124518d;

        static {
            Covode.recordClassIndex(64067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54365a(String str, int i, String str2, AbstractC89124d dVar) {
            super(2, dVar);
            this.f124516b = str;
            this.f124517c = i;
            this.f124518d = str2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C54365a(this.f124516b, this.f124517c, this.f124518d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C54365a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f124515a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89531av<BaseResponse> acknowledgeNoticeRead = C55262b.m101019a().acknowledgeNoticeRead(this.f124516b, TopChatNoticeSourceType.DM_CHAT.getType(), this.f124517c, this.f124518d);
                this.f124515a = 1;
                if (acknowledgeNoticeRead.mo144106a(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    C89382r.m154942a(obj);
                } catch (Exception e) {
                    C56244a.m102187a(C54364a.f124512a, e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m99670a(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        AbstractC89568bz unused = C89624i.m155555a(f124514c, null, null, new C54365a(str, i, str2, null), 3);
    }
}
