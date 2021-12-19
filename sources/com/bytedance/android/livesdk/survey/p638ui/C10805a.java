package com.bytedance.android.livesdk.survey.p638ui;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.survey.p636a.C10788a;
import com.bytedance.android.livesdk.survey.p636a.C10789b;
import com.bytedance.android.livesdk.survey.p636a.C10790c;
import com.bytedance.android.livesdk.survey.p636a.C10791d;
import com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a;
import com.bytedance.android.livesdk.survey.p638ui.p639a.C10825c;
import com.bytedance.android.livesdk.survey.p638ui.p639a.C10858r;
import com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.watch.AbstractC11325d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a */
public final class C10805a extends AbstractC7501r<AbstractC10808b> {

    /* renamed from: g */
    public static final C10806a f26010g = new C10806a((byte) 0);

    /* renamed from: a */
    public final C88411a f26011a = new C88411a();

    /* renamed from: b */
    public final boolean f26012b;

    /* renamed from: c */
    public C10788a f26013c;

    /* renamed from: d */
    public AbstractC10819a f26014d;

    /* renamed from: e */
    public boolean f26015e;

    /* renamed from: f */
    public boolean f26016f;

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$a */
    public static final class C10806a {
        static {
            Covode.recordClassIndex(12408);
        }

        /* renamed from: com.bytedance.android.livesdk.survey.ui.a$a$a */
        public enum EnumC10807a {
            NOT_LOG("nl"),
            SUBMIT("submit"),
            CANCEL("cancel");
            

            /* renamed from: b */
            private final String f26018b;

            public final String getMethod() {
                return this.f26018b;
            }

            static {
                Covode.recordClassIndex(12409);
            }

            private EnumC10807a(String str) {
                this.f26018b = str;
            }
        }

        private C10806a() {
        }

        public /* synthetic */ C10806a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$b */
    public interface AbstractC10808b extends AbstractC8094bq, AbstractC10881a {
        static {
            Covode.recordClassIndex(12410);
        }
    }

    static {
        Covode.recordClassIndex(12407);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$f */
    public static final class C10812f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10805a f26022a;

        static {
            Covode.recordClassIndex(12414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10812f(C10805a aVar) {
            super(0);
            this.f26022a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC10808b bVar = (AbstractC10808b) this.f26022a.f38654y;
            if (bVar != null) {
                bVar.mo17751c();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$g */
    public static final class C10813g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10805a f26023a;

        static {
            Covode.recordClassIndex(12415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10813g(C10805a aVar) {
            super(0);
            this.f26023a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC10808b bVar = (AbstractC10808b) this.f26023a.f38654y;
            if (bVar != null) {
                bVar.mo17752d();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$j */
    public static final class C10816j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10805a f26026a;

        static {
            Covode.recordClassIndex(12418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10816j(C10805a aVar) {
            super(0);
            this.f26026a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC10808b bVar = (AbstractC10808b) this.f26026a.f38654y;
            if (bVar != null) {
                bVar.mo17751c();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$k */
    public static final class C10817k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10805a f26027a;

        static {
            Covode.recordClassIndex(12419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10817k(C10805a aVar) {
            super(0);
            this.f26027a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC10808b bVar = (AbstractC10808b) this.f26027a.f38654y;
            if (bVar != null) {
                bVar.mo17752d();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final long mo17713a() {
        AbstractC10819a aVar = this.f26014d;
        if (aVar != null) {
            return aVar.f26032d.mo17712d();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo17716c() {
        String str;
        Integer num;
        C10790c a;
        C10790c a2;
        List<C10789b> list;
        if (!this.f26015e) {
            this.f26015e = true;
            C10788a aVar = this.f26013c;
            C6501b a3 = C6501b.C6502a.m13948a("livesdk_survey_notify").mo12643a(this.f18624w);
            String str2 = null;
            if (aVar != null) {
                str = aVar.f25977a;
            } else {
                str = null;
            }
            C6501b a4 = a3.mo12651a("survey_id", str);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            C6501b a5 = a4.mo12646a("user_id", b.mo13161c());
            if (aVar == null || (a2 = aVar.mo17701a()) == null || (list = a2.f25986d) == null) {
                num = null;
            } else {
                num = Integer.valueOf(list.size());
            }
            C6501b a6 = a5.mo12650a("no_of_choice", (Number) num).mo12645a("room_position", ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).getLiveRoomChangeCount());
            if (!(aVar == null || (a = aVar.mo17701a()) == null)) {
                str2 = a.f25983a;
            }
            a6.mo12651a("question_id", str2).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$d */
    public static final class C10810d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10805a f26020a;

        static {
            Covode.recordClassIndex(12412);
        }

        public C10810d(C10805a aVar) {
            this.f26020a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC10819a aVar = this.f26020a.f26014d;
            if (aVar != null) {
                aVar.mo17722b();
            }
            this.f26020a.f26013c = null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$c */
    public static final class C10809c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10805a f26019a;

        static {
            Covode.recordClassIndex(12411);
        }

        public C10809c(C10805a aVar) {
            this.f26019a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            if (this.f26019a.f38654y != null) {
                if (((C10788a) dVar.data).f25978b.size() == 0) {
                    this.f26019a.f26013c = null;
                    return;
                }
                this.f26019a.f26013c = (C10788a) dVar.data;
                C10805a aVar = this.f26019a;
                aVar.mo17715a(aVar.f26013c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$e */
    public static final class C10811e extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10805a f26021a;

        static {
            Covode.recordClassIndex(12413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10811e(C10805a aVar) {
            super(1);
            this.f26021a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (this.f26021a.f26013c != null) {
                if (booleanValue) {
                    this.f26021a.mo17716c();
                }
                AbstractC10808b bVar = (AbstractC10808b) this.f26021a.f38654y;
                if (bVar != null) {
                    C10788a aVar = this.f26021a.f26013c;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    bVar.mo17749a(aVar);
                }
                AbstractC10808b bVar2 = (AbstractC10808b) this.f26021a.f38654y;
                if (bVar2 != null) {
                    bVar2.mo17748a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$h */
    public static final class C10814h extends AbstractC89220m implements AbstractC89172b<C10806a.EnumC10807a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10805a f26024a;

        static {
            Covode.recordClassIndex(12416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10814h(C10805a aVar) {
            super(1);
            this.f26024a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10806a.EnumC10807a aVar) {
            C10806a.EnumC10807a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C10805a aVar3 = this.f26024a;
            aVar3.mo17714a(aVar3.mo17713a(), aVar2, 0);
            AbstractC10808b bVar = (AbstractC10808b) this.f26024a.f38654y;
            if (bVar != null) {
                bVar.mo17750b();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$i */
    public static final class C10815i extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10805a f26025a;

        static {
            Covode.recordClassIndex(12417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10815i(C10805a aVar) {
            super(1);
            this.f26025a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (this.f26025a.f26013c != null) {
                if (booleanValue) {
                    this.f26025a.mo17716c();
                }
                AbstractC10808b bVar = (AbstractC10808b) this.f26025a.f38654y;
                if (bVar != null) {
                    C10788a aVar = this.f26025a.f26013c;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    bVar.mo17749a(aVar);
                }
                AbstractC10808b bVar2 = (AbstractC10808b) this.f26025a.f38654y;
                if (bVar2 != null) {
                    bVar2.mo17748a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.ui.a$l */
    public static final class C10818l extends AbstractC89220m implements AbstractC89172b<C10806a.EnumC10807a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10805a f26028a;

        static {
            Covode.recordClassIndex(12420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10818l(C10805a aVar) {
            super(1);
            this.f26028a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10806a.EnumC10807a aVar) {
            C10806a.EnumC10807a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C10805a aVar3 = this.f26028a;
            aVar3.mo17714a(aVar3.mo17713a(), aVar2, 0);
            AbstractC10808b bVar = (AbstractC10808b) this.f26028a.f38654y;
            if (bVar != null) {
                bVar.mo17750b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo17715a(C10788a aVar) {
        AbstractC10819a rVar;
        if (aVar != null) {
            C10791d dVar = aVar.f25980d;
            C89219l.m154716b(dVar, "");
            if (dVar.f25987a == 1) {
                DataChannel dataChannel = this.f18624w;
                C89219l.m154716b(dataChannel, "");
                rVar = new C10825c(dataChannel, new C10811e(this), new C10812f(this), new C10813g(this), new C10814h(this));
            } else {
                DataChannel dataChannel2 = this.f18624w;
                C89219l.m154716b(dataChannel2, "");
                rVar = new C10858r(dataChannel2, new C10815i(this), new C10816j(this), new C10817k(this), new C10818l(this));
            }
            this.f26014d = rVar;
            C10791d dVar2 = aVar.f25980d;
            C89219l.m154716b(dVar2, "");
            if (!dVar2.mo17702a()) {
                AbstractC10819a aVar2 = this.f26014d;
                if (aVar2 != null) {
                    long j = aVar.f25980d.f25989c;
                    aVar2.f26030b = j;
                    aVar2.f26031c.mo17709a(j);
                }
                AbstractC10819a aVar3 = this.f26014d;
                if (aVar3 != null) {
                    aVar3.mo17718a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17714a(long j, C10806a.EnumC10807a aVar, long j2) {
        String str;
        Integer num;
        C10790c a;
        C10790c a2;
        List<C10789b> list;
        if (!C89219l.m154714a((Object) aVar.getMethod(), (Object) "nl") && !this.f26016f && this.f26015e) {
            this.f26016f = true;
            C10788a aVar2 = this.f26013c;
            C6501b a3 = C6501b.C6502a.m13948a("livesdk_exit_survey").mo12643a(this.f18624w);
            String str2 = null;
            if (aVar2 != null) {
                str = aVar2.f25977a;
            } else {
                str = null;
            }
            C6501b a4 = a3.mo12651a("survey_id", str);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            C6501b a5 = a4.mo12646a("user_id", b.mo13161c());
            if (aVar2 == null || (a2 = aVar2.mo17701a()) == null || (list = a2.f25986d) == null) {
                num = null;
            } else {
                num = Integer.valueOf(list.size());
            }
            C6501b a6 = a5.mo12650a("no_of_choice", (Number) num).mo12646a("stay_time", j).mo12651a("exit_method", aVar.getMethod()).mo12646a("option_id", j2).mo12646a("result", j2).mo12645a("room_position", ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).getLiveRoomChangeCount());
            if (!(aVar2 == null || (a = aVar2.mo17701a()) == null)) {
                str2 = a.f25983a;
            }
            a6.mo12651a("question_id", str2).mo12655b();
        }
    }
}
