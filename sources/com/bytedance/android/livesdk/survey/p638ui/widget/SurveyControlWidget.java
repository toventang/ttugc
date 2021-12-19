package com.bytedance.android.livesdk.survey.p638ui.widget;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.survey.AbstractC10787a;
import com.bytedance.android.livesdk.survey.C10795b;
import com.bytedance.android.livesdk.survey.C10800c;
import com.bytedance.android.livesdk.survey.C10801d;
import com.bytedance.android.livesdk.survey.C10802e;
import com.bytedance.android.livesdk.survey.api.SurveyApi;
import com.bytedance.android.livesdk.survey.p636a.C10788a;
import com.bytedance.android.livesdk.survey.p636a.C10789b;
import com.bytedance.android.livesdk.survey.p636a.C10790c;
import com.bytedance.android.livesdk.survey.p636a.C10791d;
import com.bytedance.android.livesdk.survey.p636a.C10792e;
import com.bytedance.android.livesdk.survey.p636a.C10793f;
import com.bytedance.android.livesdk.survey.p638ui.C10805a;
import com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10819a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.HashMap;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget */
public final class SurveyControlWidget extends LiveWidget implements C10805a.AbstractC10808b, AbstractC33974au {

    /* renamed from: a */
    public C10874a f26113a;

    /* renamed from: b */
    public C10805a f26114b;

    /* renamed from: c */
    public final AbstractC89183m<String, Long, C89391z> f26115c = new C10877b(this);

    /* renamed from: d */
    public final AbstractC89171a<C89391z> f26116d = new C10878c(this);

    /* renamed from: e */
    private Room f26117e;

    /* renamed from: f */
    private final SurveyControlWidget$mActivityLifecycleObserver$1 f26118f = new SurveyControlWidget$mActivityLifecycleObserver$1(this);

    static {
        Covode.recordClassIndex(12477);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$a */
    public static final class C10874a implements AbstractC10881a {

        /* renamed from: a */
        public final Context f26119a;

        /* renamed from: b */
        public final DataChannel f26120b;

        /* renamed from: c */
        private AbstractC10881a f26121c;

        /* renamed from: d */
        private AbstractC10881a f26122d;

        /* renamed from: e */
        private final AbstractC89244h f26123e;

        /* renamed from: f */
        private final AbstractC89244h f26124f;

        /* renamed from: g */
        private AbstractC10881a f26125g;

        static {
            Covode.recordClassIndex(12478);
        }

        /* renamed from: e */
        private final SurveyCardWidget m19477e() {
            return (SurveyCardWidget) this.f26123e.getValue();
        }

        @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
        /* renamed from: a */
        public final void mo17748a() {
            AbstractC10881a aVar = this.f26125g;
            if (aVar != null) {
                aVar.mo17748a();
            }
        }

        @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
        /* renamed from: b */
        public final void mo17750b() {
            AbstractC10881a aVar = this.f26125g;
            if (aVar != null) {
                aVar.mo17750b();
            }
        }

        @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
        /* renamed from: c */
        public final void mo17751c() {
            AbstractC10881a aVar = this.f26125g;
            if (aVar != null) {
                aVar.mo17751c();
            }
        }

        @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
        /* renamed from: d */
        public final void mo17752d() {
            AbstractC10881a aVar = this.f26125g;
            if (aVar != null) {
                aVar.mo17752d();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$a$a */
        static final class C10875a extends AbstractC89220m implements AbstractC89171a<SurveyCardWidget> {

            /* renamed from: a */
            public static final C10875a f26126a = new C10875a();

            static {
                Covode.recordClassIndex(12479);
            }

            C10875a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ SurveyCardWidget invoke() {
                return ((AbstractC10787a) C6193a.m13435a(AbstractC10787a.class)).getSurveyCardWidget();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$a$b */
        static final class C10876b extends AbstractC89220m implements AbstractC89171a<DialogC10884c> {

            /* renamed from: a */
            final /* synthetic */ C10874a f26127a;

            static {
                Covode.recordClassIndex(12480);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10876b(C10874a aVar) {
                super(0);
                this.f26127a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ DialogC10884c invoke() {
                boolean z;
                Context context = this.f26127a.f26119a;
                DataChannel dataChannel = this.f26127a.f26120b;
                Boolean bool = (Boolean) this.f26127a.f26120b.mo28318b(C9076co.class);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                return new DialogC10884c(context, dataChannel, z);
            }
        }

        @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
        /* renamed from: a */
        public final void mo17749a(C10788a aVar) {
            C89219l.m154721d(aVar, "");
            m19476b(aVar);
            AbstractC10881a aVar2 = this.f26125g;
            if (aVar2 != null) {
                aVar2.mo17749a(aVar);
            }
        }

        /* renamed from: b */
        private final void m19476b(C10788a aVar) {
            AbstractC10881a aVar2;
            C10791d dVar = aVar.f25980d;
            C89219l.m154716b(dVar, "");
            if (dVar.f25987a == 2) {
                if (C6204h.m13480b()) {
                    aVar2 = (DialogC10884c) this.f26124f.getValue();
                } else {
                    aVar2 = this.f26122d;
                }
            } else if (C6204h.m13480b()) {
                aVar2 = m19477e();
            } else {
                aVar2 = this.f26121c;
            }
            this.f26125g = aVar2;
        }

        public C10874a(Context context, DataChannel dataChannel) {
            AbstractC10881a aVar;
            boolean z;
            C89219l.m154721d(context, "");
            C89219l.m154721d(dataChannel, "");
            this.f26119a = context;
            this.f26120b = dataChannel;
            if (!C6204h.m13480b()) {
                this.f26121c = ((AbstractC10787a) C6193a.m13435a(AbstractC10787a.class)).getSurveyCardWidget();
                Boolean bool = (Boolean) dataChannel.mo28318b(C9076co.class);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                this.f26122d = new DialogC10884c(context, dataChannel, z);
            }
            this.f26123e = C11831d.m20835a(C10875a.f26126a);
            this.f26124f = C11831d.m20835a(new C10876b(this));
            if (C6204h.m13480b()) {
                aVar = m19477e();
            } else {
                aVar = this.f26121c;
            }
            this.f26125g = aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: a */
    public final void mo17748a() {
        C10874a aVar = this.f26113a;
        if (aVar == null) {
            C89219l.m154710a("mViewProxy");
        }
        aVar.mo17748a();
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: b */
    public final void mo17750b() {
        C10874a aVar = this.f26113a;
        if (aVar == null) {
            C89219l.m154710a("mViewProxy");
        }
        aVar.mo17750b();
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: c */
    public final void mo17751c() {
        C10874a aVar = this.f26113a;
        if (aVar == null) {
            C89219l.m154710a("mViewProxy");
        }
        aVar.mo17751c();
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: d */
    public final void mo17752d() {
        C10874a aVar = this.f26113a;
        if (aVar == null) {
            C89219l.m154710a("mViewProxy");
        }
        aVar.mo17752d();
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$c */
    static final class C10878c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SurveyControlWidget f26129a;

        static {
            Covode.recordClassIndex(12482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10878c(SurveyControlWidget surveyControlWidget) {
            super(0);
            this.f26129a = surveyControlWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C10805a aVar = this.f26129a.f26114b;
            if (aVar == null) {
                return null;
            }
            AbstractC10819a aVar2 = aVar.f26014d;
            if (aVar2 != null) {
                aVar2.mo17725e();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        ActivityC0945e a;
        AbstractC1196i lifecycle;
        super.onDestroy();
        C10805a aVar = this.f26114b;
        if (aVar != null) {
            AbstractC10819a aVar2 = aVar.f26014d;
            if (aVar2 != null) {
                aVar2.mo17722b();
            }
            aVar.f26011a.dispose();
        }
        C10805a aVar3 = this.f26114b;
        if (aVar3 != null) {
            aVar3.mo8577b();
        }
        Context context = this.context;
        if (context != null && (a = C11279p.m20001a(context)) != null && (lifecycle = a.getLifecycle()) != null) {
            lifecycle.mo4013b(this.f26118f);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C10805a aVar;
        Long l;
        Long l2;
        ActivityC0945e a;
        AbstractC1196i lifecycle;
        long j;
        AbstractC10819a aVar2;
        C10805a aVar3;
        super.onCreate();
        if (this.dataChannel.mo28318b(C10802e.class) != null) {
            aVar = (C10805a) this.dataChannel.mo28318b(C10802e.class);
        } else if (this.dataChannel.mo28318b(C9096dh.class) != null) {
            aVar = new C10805a();
        } else {
            return;
        }
        this.f26114b = aVar;
        if (aVar != null) {
            aVar.mo10297a((AbstractC8094bq) this);
        }
        this.dataChannel.mo28311a(C10802e.class, this.f26114b);
        this.dataChannel.mo28310a(C10800c.class, (AbstractC89172b) new C10879d(this)).mo28310a(C10801d.class, (AbstractC89172b) new C10880e(this));
        Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
        Room room2 = this.f26117e;
        if (room2 != null) {
            l = Long.valueOf(room2.getId());
        } else {
            l = null;
        }
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        if ((!C89219l.m154714a(l, l2)) && (aVar3 = this.f26114b) != null) {
            aVar3.f26013c = null;
            aVar3.f26015e = false;
            aVar3.f26016f = false;
        }
        this.f26117e = room;
        Context context = this.context;
        C89219l.m154716b(context, "");
        DataChannel dataChannel = this.dataChannel;
        C89219l.m154716b(dataChannel, "");
        this.f26113a = new C10874a(context, dataChannel);
        C10805a aVar4 = this.f26114b;
        if (!(aVar4 == null || (aVar2 = aVar4.f26014d) == null)) {
            aVar2.mo17718a();
        }
        C10805a aVar5 = this.f26114b;
        if (aVar5 != null) {
            Long l3 = (Long) this.dataChannel.mo28318b(C9096dh.class);
            if (l3 != null) {
                j = l3.longValue();
            } else {
                j = 0;
            }
            if (aVar5.f26013c == null) {
                if (aVar5.f26012b) {
                    C10788a aVar6 = new C10788a();
                    aVar6.f25977a = "1111";
                    aVar6.f25979c = "thank you";
                    C10791d dVar = new C10791d();
                    dVar.f25987a = 2;
                    dVar.f25988b = 2;
                    dVar.f25989c = 3;
                    aVar6.f25980d = dVar;
                    C10790c cVar = new C10790c();
                    cVar.f25983a = "9999";
                    cVar.f25984b = "Do you like what you see";
                    C10789b bVar = new C10789b();
                    bVar.f25981a = 5001;
                    bVar.f25982b = "Yes";
                    C10789b bVar2 = new C10789b();
                    bVar2.f25981a = 5002;
                    bVar2.f25982b = "None";
                    C10789b bVar3 = new C10789b();
                    bVar3.f25981a = 5003;
                    bVar3.f25982b = "No";
                    cVar.f25986d = C89070n.m154522b(bVar, bVar2, bVar3);
                    aVar6.f25978b = C89070n.m154516a(cVar);
                    aVar5.f26013c = aVar6;
                    aVar5.mo17715a(aVar5.f26013c);
                } else {
                    aVar5.f26011a.mo142945a(((AbstractC11181z) ((SurveyApi) C5805e.m12718a().mo11572a(SurveyApi.class)).list(j).mo143271a(new C11191f()).mo143274a(C11152e.m19790a((AbstractC1204m) aVar5.f38654y))).mo17950a(new C10805a.C10809c(aVar5), new C10805a.C10810d(aVar5)));
                }
            }
        }
        Context context2 = this.context;
        if (context2 != null && (a = C11279p.m20001a(context2)) != null && (lifecycle = a.getLifecycle()) != null) {
            lifecycle.mo4012a(this.f26118f);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$e */
    static final class C10880e extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SurveyControlWidget f26131a;

        static {
            Covode.recordClassIndex(12484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10880e(SurveyControlWidget surveyControlWidget) {
            super(1);
            this.f26131a = surveyControlWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f26131a.f26116d.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$d */
    static final class C10879d extends AbstractC89220m implements AbstractC89172b<C10795b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SurveyControlWidget f26130a;

        static {
            Covode.recordClassIndex(12483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10879d(SurveyControlWidget surveyControlWidget) {
            super(1);
            this.f26130a = surveyControlWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10795b bVar) {
            C10795b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f26130a.f26115c.invoke(bVar2.f25998a, Long.valueOf(bVar2.f25999b));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.widget.AbstractC10881a
    /* renamed from: a */
    public final void mo17749a(C10788a aVar) {
        C89219l.m154721d(aVar, "");
        C10874a aVar2 = this.f26113a;
        if (aVar2 == null) {
            C89219l.m154710a("mViewProxy");
        }
        aVar2.mo17749a(aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$b */
    static final class C10877b extends AbstractC89220m implements AbstractC89183m<String, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SurveyControlWidget f26128a;

        static {
            Covode.recordClassIndex(12481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10877b(SurveyControlWidget surveyControlWidget) {
            super(2);
            this.f26128a = surveyControlWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Long l) {
            long j;
            String str2;
            String str3 = str;
            long longValue = l.longValue();
            C89219l.m154721d(str3, "");
            Long l2 = (Long) this.f26128a.dataChannel.mo28318b(C9096dh.class);
            C10805a aVar = this.f26128a.f26114b;
            if (aVar != null) {
                if (l2 != null) {
                    j = l2.longValue();
                } else {
                    j = -1;
                }
                C89219l.m154721d(str3, "");
                C10793f.C10794a aVar2 = new C10793f.C10794a();
                aVar2.f25995a = j;
                C10788a aVar3 = aVar.f26013c;
                if (aVar3 != null) {
                    str2 = aVar3.f25977a;
                } else {
                    str2 = null;
                }
                aVar2.f25996b = str2;
                aVar2.f25997c.add(new C10792e(str3, longValue));
                C10793f fVar = new C10793f(aVar2.f25995a, aVar2.f25996b, C4139e.C4140a.f11575b.mo46674b(aVar2.f25997c));
                C88411a aVar4 = aVar.f26011a;
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("room_id", Long.valueOf(fVar.f25992a));
                hashMap.put("survey_id", fVar.f25993b);
                hashMap.put("content", fVar.f25994c);
                aVar4.mo142945a(((SurveyApi) C5805e.m12718a().mo11572a(SurveyApi.class)).submit(hashMap).mo143271a(new C11191f()).mo143300g());
            }
            C10874a aVar5 = this.f26128a.f26113a;
            if (aVar5 == null) {
                C89219l.m154710a("mViewProxy");
            }
            aVar5.mo17752d();
            C10805a aVar6 = this.f26128a.f26114b;
            if (aVar6 == null) {
                return null;
            }
            AbstractC10819a aVar7 = aVar6.f26014d;
            if (aVar7 != null) {
                aVar7.mo17723c();
            }
            aVar6.mo17714a(aVar6.mo17713a(), C10805a.C10806a.EnumC10807a.SUBMIT, longValue);
            return C89391z.f203057a;
        }
    }
}
