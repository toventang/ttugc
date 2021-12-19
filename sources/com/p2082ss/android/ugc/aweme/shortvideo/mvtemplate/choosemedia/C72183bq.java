package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33484c;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72308f;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72433g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69791b;
import com.p2082ss.android.ugc.aweme.utils.C80244bh;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq */
public final class C72183bq implements AbstractC72263v {

    /* renamed from: a */
    ProgressDialogC84958b f161802a;

    /* renamed from: b */
    public final Activity f161803b;

    /* renamed from: c */
    public final long f161804c;

    /* renamed from: d */
    public final long f161805d;

    /* renamed from: e */
    private List<? extends MediaModel> f161806e;

    /* renamed from: f */
    private ShortVideoContext f161807f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$c */
    public static final class C72190c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f161825a;

        /* renamed from: b */
        int f161826b;

        /* renamed from: c */
        final /* synthetic */ C72183bq f161827c;

        /* renamed from: d */
        Object f161828d;

        /* renamed from: e */
        Object f161829e;

        /* renamed from: f */
        Object f161830f;

        /* renamed from: g */
        Object f161831g;

        /* renamed from: h */
        int f161832h;

        /* renamed from: i */
        int f161833i;

        static {
            Covode.recordClassIndex(84855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72190c(C72183bq bqVar, AbstractC89124d dVar) {
            super(dVar);
            this.f161827c = bqVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f161825a = obj;
            this.f161826b |= Integer.MIN_VALUE;
            return this.f161827c.mo114429a((List<? extends MediaModel>) null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$e */
    public static final class C72192e extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f161836a;

        /* renamed from: b */
        int f161837b;

        /* renamed from: c */
        final /* synthetic */ C72183bq f161838c;

        /* renamed from: d */
        Object f161839d;

        static {
            Covode.recordClassIndex(84857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72192e(C72183bq bqVar, AbstractC89124d dVar) {
            super(dVar);
            this.f161838c = bqVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f161836a = obj;
            this.f161837b |= Integer.MIN_VALUE;
            return this.f161838c.mo114430b(null, this);
        }
    }

    static {
        Covode.recordClassIndex(84848);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114427a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$g */
    public static final class C72194g implements AbstractC72433g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f161842a;

        static {
            Covode.recordClassIndex(84859);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72433g
        /* renamed from: a */
        public final void mo113365a() {
            this.f161842a.resumeWith(C89379q.m157068constructorimpl(true));
        }

        C72194g(AbstractC89124d dVar) {
            this.f161842a = dVar;
        }
    }

    /* renamed from: b */
    public final void mo114431b() {
        Activity activity = this.f161803b;
        if (activity != null && !activity.isFinishing()) {
            Activity activity2 = this.f161803b;
            ProgressDialogC84958b b = ProgressDialogC84958b.m146021b(activity2, activity2.getString(R.string.g1j));
            this.f161802a = b;
            if (b != null) {
                b.setIndeterminate(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$d */
    public static final class C72191d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f161834a;

        /* renamed from: b */
        final /* synthetic */ C72183bq f161835b;

        static {
            Covode.recordClassIndex(84856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72191d(C72183bq bqVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f161835b = bqVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C72191d(this.f161835b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C72191d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f161834a == 0) {
                C89382r.m154942a(obj);
                this.f161835b.mo114431b();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$f */
    public static final class C72193f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f161840a;

        /* renamed from: b */
        final /* synthetic */ C72183bq f161841b;

        static {
            Covode.recordClassIndex(84858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72193f(C72183bq bqVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f161841b = bqVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C72193f(this.f161841b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C72193f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f161840a == 0) {
                C89382r.m154942a(obj);
                this.f161841b.mo114431b();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$a */
    public static final class C72184a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f161808a;

        /* renamed from: b */
        final /* synthetic */ C72183bq f161809b;

        /* renamed from: c */
        final /* synthetic */ List f161810c;

        /* renamed from: d */
        private /* synthetic */ Object f161811d;

        static {
            Covode.recordClassIndex(84849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72184a(C72183bq bqVar, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f161809b = bqVar;
            this.f161810c = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C72184a aVar = new C72184a(this.f161809b, this.f161810c, dVar);
            aVar.f161811d = obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C72184a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$a$a */
        public static final class C72186a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Boolean>, Object> {

            /* renamed from: a */
            int f161816a;

            /* renamed from: b */
            final /* synthetic */ C72184a f161817b;

            static {
                Covode.recordClassIndex(84851);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72186a(C72184a aVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f161817b = aVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C72186a(this.f161817b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Boolean> dVar) {
                return ((C72186a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f161816a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    C72183bq bqVar = this.f161817b.f161809b;
                    List<? extends MediaModel> list = this.f161817b.f161810c;
                    this.f161816a = 1;
                    obj = bqVar.mo114429a(list, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C89382r.m154942a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$a$b */
        public static final class C72187b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Boolean>, Object> {

            /* renamed from: a */
            int f161818a;

            /* renamed from: b */
            final /* synthetic */ C72184a f161819b;

            static {
                Covode.recordClassIndex(84852);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72187b(C72184a aVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f161819b = aVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C72187b(this.f161819b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Boolean> dVar) {
                return ((C72187b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f161818a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    C72183bq bqVar = this.f161819b.f161809b;
                    List<? extends MediaModel> list = this.f161819b.f161810c;
                    this.f161818a = 1;
                    obj = bqVar.mo114430b(list, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C89382r.m154942a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72183bq.C72184a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$b */
    public static final class C72188b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89378p<? extends Boolean, ? extends String>>, Object> {

        /* renamed from: a */
        Object f161820a;

        /* renamed from: b */
        int f161821b;

        /* renamed from: c */
        final /* synthetic */ AbstractC33484c f161822c;

        /* renamed from: d */
        final /* synthetic */ VideoSegment f161823d;

        static {
            Covode.recordClassIndex(84853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72188b(AbstractC33484c cVar, VideoSegment videoSegment, AbstractC89124d dVar) {
            super(2, dVar);
            this.f161822c = cVar;
            this.f161823d = videoSegment;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C72188b(this.f161822c, this.f161823d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89378p<? extends Boolean, ? extends String>> dVar) {
            return ((C72188b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f161821b;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f161820a = this;
                this.f161821b = 1;
                C89134h hVar = new C89134h(C89099b.m154605a(this));
                this.f161822c.mo59567a(null, this.f161823d, new C72189a(hVar));
                obj = hVar.mo143576a();
                if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                    C89219l.m154721d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bq$b$a */
        public static final class C72189a extends AbstractC89220m implements AbstractC89183m<Boolean, String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89124d f161824a;

            static {
                Covode.recordClassIndex(84854);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72189a(AbstractC89124d dVar) {
                super(2);
                this.f161824a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Boolean bool, String str) {
                boolean booleanValue = bool.booleanValue();
                C89219l.m154721d(str, "");
                C80244bh.m139085a(this.f161824a, C89387v.m154943a(Boolean.valueOf(booleanValue), str));
                return C89391z.f203057a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114430b(java.util.List<? extends com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel> r8, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r9) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72183bq.mo114430b(java.util.List, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114429a(java.util.List<? extends com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel> r15, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r16) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72183bq.mo114429a(java.util.List, h.c.d):java.lang.Object");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114428a(int i, Intent intent) {
        ArrayList parcelableArrayListExtra;
        String str;
        boolean z;
        C89219l.m154721d(intent, "");
        if (i == 2 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null) {
            this.f161806e = parcelableArrayListExtra;
            this.f161807f = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
            List<? extends MediaModel> list = this.f161806e;
            if (list == null) {
                C89219l.m154710a("selectedMediaData");
            }
            C89386u<Boolean, Integer, Long> a = C72182bp.m127372a(this.f161803b, list, this.f161804c, this.f161805d);
            boolean booleanValue = a.component1().booleanValue();
            int intValue = a.component2().intValue();
            long longValue = a.component3().longValue();
            if (booleanValue) {
                ShortVideoContext shortVideoContext = this.f161807f;
                if (list.size() > 1) {
                    str = "multiple_content";
                } else {
                    str = "single_content";
                }
                int size = list.size() - intValue;
                String a2 = C69791b.m123314a(intValue, list.size() - intValue);
                if (list.size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                new C72308f(shortVideoContext, "video", str, intValue, size, a2, z).mo114575a((int) longValue).mo114578b(1).mo114576a(this.f161807f).mo114577a();
                AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C72184a(this, list, null), 3);
            }
        }
    }

    public C72183bq(Activity activity, long j, long j2) {
        C89219l.m154721d(activity, "");
        this.f161803b = activity;
        this.f161804c = j;
        this.f161805d = j2;
    }
}
