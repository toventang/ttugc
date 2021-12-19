package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33482a;
import com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33484c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70070d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70093n;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70095p;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70155ad;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70156ae;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70241b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72433g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80244bh;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c */
public final class C71669c implements AbstractC33482a {

    /* renamed from: k */
    public static final C71670a f160570k = new C71670a((byte) 0);

    /* renamed from: a */
    AbstractC89568bz f160571a;

    /* renamed from: b */
    volatile boolean f160572b;

    /* renamed from: c */
    ProgressDialogC81146b f160573c;

    /* renamed from: d */
    public AbstractC33484c f160574d;

    /* renamed from: e */
    public List<? extends VideoSegment> f160575e;

    /* renamed from: f */
    public long f160576f;

    /* renamed from: g */
    public long f160577g;

    /* renamed from: h */
    public final Activity f160578h;

    /* renamed from: i */
    public final long f160579i;

    /* renamed from: j */
    public final long f160580j;

    /* renamed from: l */
    private long f160581l;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$c */
    public static final class C71673c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f160590a;

        /* renamed from: b */
        int f160591b;

        /* renamed from: c */
        final /* synthetic */ C71669c f160592c;

        /* renamed from: d */
        Object f160593d;

        /* renamed from: e */
        Object f160594e;

        /* renamed from: f */
        Object f160595f;

        /* renamed from: g */
        Object f160596g;

        /* renamed from: h */
        Object f160597h;

        /* renamed from: i */
        long f160598i;

        static {
            Covode.recordClassIndex(84218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71673c(C71669c cVar, AbstractC89124d dVar) {
            super(dVar);
            this.f160592c = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f160590a = obj;
            this.f160591b |= Integer.MIN_VALUE;
            return this.f160592c.mo113364c(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$f */
    public static final class C71676f extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f160608a;

        /* renamed from: b */
        int f160609b;

        /* renamed from: c */
        final /* synthetic */ C71669c f160610c;

        /* renamed from: d */
        Object f160611d;

        /* renamed from: e */
        Object f160612e;

        /* renamed from: f */
        long f160613f;

        static {
            Covode.recordClassIndex(84221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71676f(C71669c cVar, AbstractC89124d dVar) {
            super(dVar);
            this.f160610c = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f160608a = obj;
            this.f160609b |= Integer.MIN_VALUE;
            return this.f160610c.mo113362b(null, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$i */
    public static final class C71679i extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f160619a;

        /* renamed from: b */
        int f160620b;

        /* renamed from: c */
        final /* synthetic */ C71669c f160621c;

        /* renamed from: d */
        Object f160622d;

        /* renamed from: e */
        long f160623e;

        static {
            Covode.recordClassIndex(84224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71679i(C71669c cVar, AbstractC89124d dVar) {
            super(dVar);
            this.f160621c = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f160619a = obj;
            this.f160620b |= Integer.MIN_VALUE;
            return this.f160621c.mo113358a(null, this);
        }
    }

    static {
        Covode.recordClassIndex(84214);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$a */
    public static final class C71670a {
        static {
            Covode.recordClassIndex(84215);
        }

        private C71670a() {
        }

        public /* synthetic */ C71670a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$e */
    public static final class C71675e implements AbstractC70443i {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f160601a;

        /* renamed from: b */
        final /* synthetic */ C71669c f160602b;

        /* renamed from: c */
        final /* synthetic */ List f160603c;

        /* renamed from: d */
        final /* synthetic */ long f160604d;

        /* renamed from: e */
        private List<? extends C69905c> f160605e;

        /* renamed from: f */
        private final long f160606f = System.currentTimeMillis();

        /* renamed from: g */
        private long f160607g;

        static {
            Covode.recordClassIndex(84220);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: a */
        public final void mo110996a() {
            long currentTimeMillis = System.currentTimeMillis();
            this.f160607g = currentTimeMillis;
            this.f160602b.f160576f = currentTimeMillis - this.f160606f;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: b */
        public final void mo111000b() {
            this.f160601a.resumeWith(C89379q.m157068constructorimpl(new C89386u(false, this.f160605e, Long.valueOf(System.currentTimeMillis() - this.f160604d))));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: c */
        public final void mo111002c() {
            this.f160601a.resumeWith(C89379q.m157068constructorimpl(new C89386u(false, this.f160605e, Long.valueOf(System.currentTimeMillis() - this.f160604d))));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: a */
        public final void mo110999a(List<? extends C69905c> list) {
            this.f160605e = list;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: a */
        public final void mo110997a(C69905c cVar) {
            this.f160602b.f160577g = System.currentTimeMillis() - this.f160607g;
            this.f160601a.resumeWith(C89379q.m157068constructorimpl(new C89386u(true, this.f160605e, Long.valueOf(System.currentTimeMillis() - this.f160604d))));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: a */
        public final void mo110998a(Exception exc) {
            if (exc != null) {
                exc.printStackTrace();
            }
            this.f160601a.resumeWith(C89379q.m157068constructorimpl(new C89386u(false, null, Long.valueOf(System.currentTimeMillis() - this.f160604d))));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: b */
        public final void mo111001b(Exception exc) {
            if (exc != null) {
                exc.printStackTrace();
            }
            this.f160601a.resumeWith(C89379q.m157068constructorimpl(new C89386u(false, null, Long.valueOf(System.currentTimeMillis() - this.f160604d))));
        }

        C71675e(AbstractC89124d dVar, C71669c cVar, List list, long j) {
            this.f160601a = dVar;
            this.f160602b = cVar;
            this.f160603c = list;
            this.f160604d = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$h */
    public static final class C71678h implements AbstractC72433g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f160616a;

        /* renamed from: b */
        final /* synthetic */ List f160617b;

        /* renamed from: c */
        final /* synthetic */ long f160618c;

        static {
            Covode.recordClassIndex(84223);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p3847a.AbstractC72433g
        /* renamed from: a */
        public final void mo113365a() {
            this.f160616a.resumeWith(C89379q.m157068constructorimpl(C89387v.m154943a(true, Long.valueOf(System.currentTimeMillis() - this.f160618c))));
        }

        C71678h(AbstractC89124d dVar, List list, long j) {
            this.f160616a = dVar;
            this.f160617b = list;
            this.f160618c = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$l */
    public static final class C71687l implements ProgressDialogC81146b.AbstractC81149c {

        /* renamed from: a */
        final /* synthetic */ C71669c f160656a;

        static {
            Covode.recordClassIndex(84232);
        }

        @Override // com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b.AbstractC81149c
        /* renamed from: a */
        public final void mo113366a() {
            C71669c cVar = this.f160656a;
            cVar.mo113363b("click");
            cVar.mo113360a(3);
            cVar.f160572b = true;
            AbstractC89568bz bzVar = cVar.f160571a;
            if (bzVar != null) {
                bzVar.mo143985a((CancellationException) null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71687l(C71669c cVar) {
            this.f160656a = cVar;
        }
    }

    /* renamed from: a */
    public final void mo113359a() {
        if (!this.f160578h.isFinishing()) {
            ProgressDialogC81146b bVar = this.f160573c;
            if (bVar == null || !bVar.isShowing()) {
                ProgressDialogC81146b a = ProgressDialogC81146b.C81148b.m140903a(this.f160578h, ProgressDialogC81146b.EnumC81147a.VISIBLE, new C71687l(this));
                a.setMessage(this.f160578h.getString(R.string.g1j));
                this.f160573c = a;
            }
        }
    }

    /* renamed from: a */
    public static void m126569a(String str) {
        C73991bj.m130128a("CutOptimizedVideoChosenHandler:".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$d */
    public static final class C71674d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f160599a;

        /* renamed from: b */
        final /* synthetic */ C71669c f160600b;

        static {
            Covode.recordClassIndex(84219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71674d(C71669c cVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f160600b = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C71674d(this.f160600b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C71674d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f160599a == 0) {
                C89382r.m154942a(obj);
                this.f160600b.mo113359a();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$g */
    public static final class C71677g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f160614a;

        /* renamed from: b */
        final /* synthetic */ C71669c f160615b;

        static {
            Covode.recordClassIndex(84222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71677g(C71669c cVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f160615b = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C71677g(this.f160615b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C71677g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f160614a == 0) {
                C89382r.m154942a(obj);
                this.f160615b.mo113359a();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$j */
    public static final class C71680j extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f160624a;

        /* renamed from: b */
        final /* synthetic */ C71669c f160625b;

        static {
            Covode.recordClassIndex(84225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71680j(C71669c cVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f160625b = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C71680j(this.f160625b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C71680j) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f160624a == 0) {
                C89382r.m154942a(obj);
                this.f160625b.mo113359a();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b */
    private static long m126570b(List<? extends VideoSegment> list) {
        Iterator<T> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().f156710b;
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$k */
    public static final class C71681k extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f160626a;

        /* renamed from: b */
        Object f160627b;

        /* renamed from: c */
        Object f160628c;

        /* renamed from: d */
        boolean f160629d;

        /* renamed from: e */
        boolean f160630e;

        /* renamed from: f */
        long f160631f;

        /* renamed from: g */
        long f160632g;

        /* renamed from: h */
        int f160633h;

        /* renamed from: i */
        final /* synthetic */ C71669c f160634i;

        /* renamed from: j */
        final /* synthetic */ List f160635j;

        /* renamed from: k */
        final /* synthetic */ Intent f160636k;

        /* renamed from: l */
        final /* synthetic */ AbstractC89171a f160637l;

        /* renamed from: m */
        private /* synthetic */ Object f160638m;

        static {
            Covode.recordClassIndex(84226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71681k(C71669c cVar, List list, Intent intent, AbstractC89171a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f160634i = cVar;
            this.f160635j = list;
            this.f160636k = intent;
            this.f160637l = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C71681k kVar = new C71681k(this.f160634i, this.f160635j, this.f160636k, this.f160637l, dVar);
            kVar.f160638m = obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C71681k) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$k$a */
        public static final class C71684a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89386u<? extends Boolean, ? extends Boolean, ? extends Long>>, Object> {

            /* renamed from: a */
            int f160647a;

            /* renamed from: b */
            final /* synthetic */ C71681k f160648b;

            /* renamed from: c */
            final /* synthetic */ ArrayList f160649c;

            static {
                Covode.recordClassIndex(84229);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C71684a(C71681k kVar, ArrayList arrayList, AbstractC89124d dVar) {
                super(2, dVar);
                this.f160648b = kVar;
                this.f160649c = arrayList;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C71684a(this.f160648b, this.f160649c, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89386u<? extends Boolean, ? extends Boolean, ? extends Long>> dVar) {
                return ((C71684a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f160647a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    C71669c cVar = this.f160648b.f160634i;
                    ArrayList arrayList = this.f160649c;
                    this.f160647a = 1;
                    obj = cVar.mo113364c(arrayList, this);
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
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$k$b */
        public static final class C71685b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89386u<? extends Boolean, ? extends List<? extends C69905c>, ? extends Long>>, Object> {

            /* renamed from: a */
            int f160650a;

            /* renamed from: b */
            final /* synthetic */ C71681k f160651b;

            /* renamed from: c */
            final /* synthetic */ ArrayList f160652c;

            static {
                Covode.recordClassIndex(84230);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C71685b(C71681k kVar, ArrayList arrayList, AbstractC89124d dVar) {
                super(2, dVar);
                this.f160651b = kVar;
                this.f160652c = arrayList;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C71685b(this.f160651b, this.f160652c, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89386u<? extends Boolean, ? extends List<? extends C69905c>, ? extends Long>> dVar) {
                return ((C71685b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f160650a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    C71669c cVar = this.f160651b.f160634i;
                    ArrayList arrayList = this.f160652c;
                    this.f160650a = 1;
                    obj = cVar.mo113362b(arrayList, this);
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
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$k$c */
        public static final class C71686c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89378p<? extends Boolean, ? extends Long>>, Object> {

            /* renamed from: a */
            int f160653a;

            /* renamed from: b */
            final /* synthetic */ C71681k f160654b;

            /* renamed from: c */
            final /* synthetic */ ArrayList f160655c;

            static {
                Covode.recordClassIndex(84231);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C71686c(C71681k kVar, ArrayList arrayList, AbstractC89124d dVar) {
                super(2, dVar);
                this.f160654b = kVar;
                this.f160655c = arrayList;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C71686c(this.f160654b, this.f160655c, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89378p<? extends Boolean, ? extends Long>> dVar) {
                return ((C71686c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f160653a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    C71669c cVar = this.f160654b.f160634i;
                    ArrayList arrayList = this.f160655c;
                    this.f160653a = 1;
                    obj = cVar.mo113358a(arrayList, this);
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

        /* JADX WARNING: Removed duplicated region for block: B:15:0x00d4 A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x010b A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x013d A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x013f A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x014c A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x014e A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x015b A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x016b A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x016c A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0170 A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x017d A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x017f A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0191 A[ADDED_TO_REGION, Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01c7 A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0200 A[Catch:{ all -> 0x02c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0224 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0234  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x023b  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x028e  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x02a6 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x02b4  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x02bb  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
            // Method dump skipped, instructions count: 782
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71669c.C71681k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b */
    public final void mo113363b(String str) {
        C39162r.m79460a("click_cancel_loading_content", new C84425b().mo129406a("cancel_from", str).mo129404a("time_elapsed", System.currentTimeMillis() - this.f160581l).f188764a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$b */
    public static final class C71671b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89378p<? extends Boolean, ? extends String>>, Object> {

        /* renamed from: a */
        Object f160582a;

        /* renamed from: b */
        int f160583b;

        /* renamed from: c */
        final /* synthetic */ C71669c f160584c;

        /* renamed from: d */
        final /* synthetic */ AbstractC33484c f160585d;

        /* renamed from: e */
        final /* synthetic */ VideoSegment f160586e;

        static {
            Covode.recordClassIndex(84216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71671b(C71669c cVar, AbstractC33484c cVar2, VideoSegment videoSegment, AbstractC89124d dVar) {
            super(2, dVar);
            this.f160584c = cVar;
            this.f160585d = cVar2;
            this.f160586e = videoSegment;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C71671b(this.f160584c, this.f160585d, this.f160586e, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89378p<? extends Boolean, ? extends String>> dVar) {
            return ((C71671b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f160583b;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f160582a = this;
                this.f160583b = 1;
                C89134h hVar = new C89134h(C89099b.m154605a(this));
                this.f160585d.mo59567a(null, this.f160586e, new C71672a(System.currentTimeMillis(), hVar, this));
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
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.c$b$a */
        public static final class C71672a extends AbstractC89220m implements AbstractC89183m<Boolean, String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ long f160587a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89124d f160588b;

            /* renamed from: c */
            final /* synthetic */ C71671b f160589c;

            static {
                Covode.recordClassIndex(84217);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C71672a(long j, AbstractC89124d dVar, C71671b bVar) {
                super(2);
                this.f160587a = j;
                this.f160588b = dVar;
                this.f160589c = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Boolean bool, String str) {
                boolean booleanValue = bool.booleanValue();
                C89219l.m154721d(str, "");
                C71669c.m126569a("compress single video,input:" + this.f160589c.f160586e.mo110571a(false) + ",result:" + booleanValue + ",cost:" + (System.currentTimeMillis() - this.f160587a));
                C80244bh.m139085a(this.f160588b, C89387v.m154943a(Boolean.valueOf(booleanValue), str));
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: a */
    public static List<ImportVideoInfo> m126568a(List<? extends VideoSegment> list) {
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new ImportVideoInfo(t.f156714f, t.f156715g, t.mo110577c(), t.mo110575b(), t.mo110571a(true).toString(), t.f156710b, t.mo110580e() - t.mo110578d(), t.f156730v, t.f156731w, t.mo110570a(), t.mo110582f(), t.mo110571a(false).toString()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo113360a(int i) {
        C84425b a = new C84425b().mo129403a("status", i).mo129404a("time_elapsed", System.currentTimeMillis() - this.f160581l);
        List<? extends VideoSegment> list = this.f160575e;
        if (list != null) {
            int i2 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().f156732x && (i2 = i2 + 1) < 0) {
                        C89070n.m154523b();
                    }
                }
            }
            C84425b a2 = a.mo129403a("pic_cnt", i2).mo129403a("video_cnt", list.size() - i2);
            long j = 0;
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                j += it2.next().f156710b;
            }
            a2.mo129404a("total_import_duration", j);
        }
        C39162r.m79460a("tools_performance_pre_cut_opt_process", a.f188764a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113358a(java.util.List<? extends com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r10, p4600h.p4603c.AbstractC89124d<? super p4600h.C89378p<java.lang.Boolean, java.lang.Long>> r11) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71669c.mo113358a(java.util.List, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113362b(java.util.List<? extends com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel> r15, p4600h.p4603c.AbstractC89124d<? super p4600h.C89386u<java.lang.Boolean, ? extends java.util.List<? extends com.p2082ss.android.ugc.aweme.shortvideo.C69905c>, java.lang.Long>> r16) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71669c.mo113362b(java.util.List, h.c.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113364c(java.util.List<? extends com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r16, p4600h.p4603c.AbstractC89124d<? super p4600h.C89386u<java.lang.Boolean, java.lang.Boolean, java.lang.Long>> r17) {
        /*
        // Method dump skipped, instructions count: 458
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71669c.mo113364c(java.util.List, h.c.d):java.lang.Object");
    }

    public C71669c(Activity activity, long j, long j2) {
        C89219l.m154721d(activity, "");
        this.f160578h = activity;
        this.f160579i = j;
        this.f160580j = j2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33482a
    /* renamed from: a */
    public final void mo59563a(List<? extends MediaModel> list, Intent intent, Intent intent2, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(intent, "");
        C89219l.m154721d(intent2, "");
        this.f160581l = System.currentTimeMillis();
        AbstractC89568bz bzVar = this.f160571a;
        if (bzVar != null) {
            bzVar.mo143985a((CancellationException) null);
        }
        if (list.isEmpty()) {
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (C63244g.m114602a().mo73284l().getAlbumService().checkMediaDurationValid(this.f160578h, list, this.f160579i, this.f160580j).component1().booleanValue()) {
            this.f160571a = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C71681k(this, list, intent2, aVar, null), 2);
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public final void mo113361a(Intent intent, List<? extends VideoSegment> list, List<? extends C69905c> list2, ArrayList<ImportVideoInfo> arrayList, Cut2EditTransferModel cut2EditTransferModel) {
        boolean z;
        C69905c cVar;
        boolean z2;
        long j;
        long duration;
        float f;
        int i;
        long duration2;
        Workspace a = C69744c.m123266a();
        C70155ad adVar = new C70155ad();
        adVar.f156851i = a;
        C70070d.m123697a(adVar, intent);
        if (list.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        C70241b bVar = new C70241b(list, 0, false, z, false, null, null);
        EditPreviewInfo a2 = C70093n.m123772a(true, a, list, new long[]{-1, -1});
        List<EditVideoSegment> videoList = a2.getVideoList();
        String str = "";
        if (videoList != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
            multiEditVideoRecordData.useMusic = true;
            multiEditVideoRecordData.concatAudio = str;
            multiEditVideoRecordData.concatVideo = str;
            multiEditVideoRecordData.curRecordingDir = str;
            multiEditVideoRecordData.startTime = 0;
            multiEditVideoRecordData.segmentDataList = new ArrayList(videoList.size());
            for (EditVideoSegment editVideoSegment : videoList) {
                List<MultiEditVideoSegmentRecordData> list3 = multiEditVideoRecordData.segmentDataList;
                C89219l.m154721d(editVideoSegment, str);
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
                multiEditVideoSegmentRecordData.videoPath = editVideoSegment.getVideoPath();
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo != null) {
                    j = videoCutInfo.getStart();
                } else {
                    j = 0;
                }
                multiEditVideoSegmentRecordData.setStartTime(j);
                VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo2 != null) {
                    duration = videoCutInfo2.getEnd();
                } else {
                    duration = editVideoSegment.getVideoFileInfo().getDuration();
                }
                multiEditVideoSegmentRecordData.setEndTime(duration);
                if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
                    multiEditVideoSegmentRecordData.draftVideoPath = editVideoSegment.getVideoPath();
                }
                multiEditVideoSegmentRecordData.videoLength = editVideoSegment.getVideoFileInfo().getDuration() * 1000;
                VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo3 != null) {
                    f = videoCutInfo3.getSpeed();
                } else {
                    f = 1.0f;
                }
                multiEditVideoSegmentRecordData.setVideoSpeed(f);
                VideoCutInfo videoCutInfo4 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo4 != null) {
                    i = videoCutInfo4.getRotate();
                } else {
                    i = 0;
                }
                multiEditVideoSegmentRecordData.rotate = i;
                multiEditVideoSegmentRecordData.width = editVideoSegment.getVideoFileInfo().getWidth();
                multiEditVideoSegmentRecordData.height = editVideoSegment.getVideoFileInfo().getHeight();
                list3.add(multiEditVideoSegmentRecordData);
                long j2 = multiEditVideoRecordData.endTime;
                VideoCutInfo videoCutInfo5 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo5 != null) {
                    duration2 = videoCutInfo5.getEnd() - videoCutInfo5.getStart();
                } else {
                    duration2 = editVideoSegment.getVideoFileInfo().getDuration();
                }
                multiEditVideoRecordData.endTime = j2 + duration2;
            }
            List<MultiEditVideoSegmentRecordData> list4 = multiEditVideoRecordData.segmentDataList;
            if (list4 != null) {
                int i2 = 0;
                for (T t : list4) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    t.videoKey = i2;
                    i2 = i3;
                }
            }
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            multiEditVideoRecordData.endTime = Math.min(m126570b(list), C70095p.m123775a());
            if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                if (multiEditVideoRecordData.segmentDataList.size() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                multiEditVideoRecordData.isSingleVideo = z2;
                multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordData.cloneData();
            }
            multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordData;
            Intent a3 = C70070d.m123694a(new Intent(intent), adVar, bVar, this.f160581l);
            a3.putExtra("workspace", a);
            a3.putExtra("extra_av_is_fast_import", true);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.os.Parcelable");
            a3.putExtra("extra_edit_preview_info", (Parcelable) a2);
            a3.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
            Objects.requireNonNull(cut2EditTransferModel, "null cannot be cast to non-null type android.os.Parcelable");
            a3.putExtra("cut_to_edit_transfer_model", (Parcelable) cut2EditTransferModel);
            if (!arrayList.isEmpty()) {
                a3.putParcelableArrayListExtra("extra_import_video_info_list", arrayList);
            }
            if (cut2EditTransferModel.getMusicSyncMode()) {
                if (list2 != null) {
                    cVar = (C69905c) list2.get(0);
                } else {
                    cVar = null;
                }
                String c = C70455f.m124271c(cVar);
                if (c != null) {
                    str = c;
                }
                a.mo110090a(str);
            }
            VECutVideoActivity.C70013a.m123647a(this.f160578h, a3, adVar.f156859q, C70156ae.m123857a(adVar));
        }
    }
}
