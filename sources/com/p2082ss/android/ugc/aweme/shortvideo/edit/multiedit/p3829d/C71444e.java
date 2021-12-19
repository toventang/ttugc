package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d;

import android.os.Handler;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70091f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71434c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a;
import com.p2082ss.android.vesdk.C85581w;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e */
public final class C71444e {

    /* renamed from: a */
    public VEVideoCutterViewModel f160077a;

    /* renamed from: b */
    public C71442d f160078b;

    /* renamed from: c */
    public AbstractC71434c f160079c;

    /* renamed from: d */
    public AbstractC71496a f160080d;

    /* renamed from: e */
    public int f160081e;

    /* renamed from: f */
    public boolean f160082f = true;

    /* renamed from: g */
    public boolean f160083g;

    /* renamed from: h */
    public final Handler f160084h = new Handler();

    /* renamed from: i */
    public final C70576a f160085i = new C70576a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing);

    /* renamed from: j */
    public final RunnableC71464t f160086j = new RunnableC71464t(this);

    /* renamed from: k */
    private CutMultiVideoViewModel f160087k;

    /* renamed from: l */
    private VideoEditViewModel f160088l;

    /* renamed from: m */
    private CutVideoSpeedViewModel f160089m;

    static {
        Covode.recordClassIndex(83978);
    }

    /* renamed from: a */
    public final void mo113074a() {
        this.f160084h.removeCallbacks(this.f160086j);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$t */
    public static final class RunnableC71464t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71444e f160109a;

        static {
            Covode.recordClassIndex(83998);
        }

        public final void run() {
            this.f160109a.mo113078a(false);
            this.f160109a.f160084h.postDelayed(this, 30);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC71464t(C71444e eVar) {
            this.f160109a = eVar;
        }
    }

    /* renamed from: b */
    public final long mo113079b() {
        AbstractC71496a aVar = this.f160080d;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        return aVar.mo113189a().getLeftSeekingValue();
    }

    /* renamed from: c */
    public final long mo113080c() {
        AbstractC71496a aVar = this.f160080d;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        return aVar.mo113189a().getRightSeekingValue();
    }

    /* renamed from: d */
    public final void mo113081d() {
        AbstractC71434c cVar = this.f160079c;
        if (cVar == null) {
            C89219l.m154710a("multiEditVideoObserversListener");
        }
        AbstractC71496a aVar = this.f160080d;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        F f = aVar.mo113189a().getPlayBoundary().f2750a;
        if (f == null) {
            C89219l.m154715b();
        }
        long longValue = f.longValue();
        AbstractC71496a aVar2 = this.f160080d;
        if (aVar2 == null) {
            C89219l.m154710a("viewManager");
        }
        S s = aVar2.mo113189a().getPlayBoundary().f2751b;
        if (s == null) {
            C89219l.m154715b();
        }
        cVar.mo113045a(longValue, s.longValue());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$n */
    public static final class C71458n implements VideoEditViewModel.AbstractC70515a {

        /* renamed from: a */
        final /* synthetic */ C71444e f160103a;

        static {
            Covode.recordClassIndex(83992);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71458n(C71444e eVar) {
            this.f160103a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.AbstractC70515a
        /* renamed from: a */
        public final void mo110973a(VideoSegment videoSegment) {
            if (this.f160103a.f160083g) {
                C71444e.m126201d(this.f160103a).mo113197a(videoSegment);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.AbstractC70515a
        /* renamed from: b */
        public final void mo110974b(VideoSegment videoSegment) {
            if (this.f160103a.f160083g) {
                C71444e.m126201d(this.f160103a).mo113204b(videoSegment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$h */
    public static final class C71452h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160097a;

        static {
            Covode.recordClassIndex(83986);
        }

        C71452h(C71444e eVar) {
            this.f160097a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C71444e.m126201d(this.f160097a).mo113207c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$l */
    public static final class C71456l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160101a;

        static {
            Covode.recordClassIndex(83990);
        }

        C71456l(C71444e eVar) {
            this.f160101a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C71444e.m126199b(this.f160101a).mo113046a((C0692e) obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$o */
    public static final class C71459o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160104a;

        static {
            Covode.recordClassIndex(83993);
        }

        C71459o(C71444e eVar) {
            this.f160104a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f160104a.f160083g) {
                C71444e.m126199b(this.f160104a).mo113050d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$p */
    public static final class C71460p<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160105a;

        static {
            Covode.recordClassIndex(83994);
        }

        C71460p(C71444e eVar) {
            this.f160105a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f160105a.f160083g) {
                C71444e.m126199b(this.f160105a).mo113048b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$q */
    public static final class C71461q<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160106a;

        static {
            Covode.recordClassIndex(83995);
        }

        C71461q(C71444e eVar) {
            this.f160106a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f160106a.f160083g) {
                C71444e.m126199b(this.f160106a).mo113049c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$r */
    public static final class C71462r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160107a;

        static {
            Covode.recordClassIndex(83996);
        }

        C71462r(C71444e eVar) {
            this.f160107a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f160107a.f160083g) {
                C71444e.m126199b(this.f160107a).mo113042a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C71442d m126198a(C71444e eVar) {
        C71442d dVar = eVar.f160078b;
        if (dVar == null) {
            C89219l.m154710a("editorPresenter");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC71434c m126199b(C71444e eVar) {
        AbstractC71434c cVar = eVar.f160079c;
        if (cVar == null) {
            C89219l.m154710a("multiEditVideoObserversListener");
        }
        return cVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ VEVideoCutterViewModel m126200c(C71444e eVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = eVar.f160077a;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ AbstractC71496a m126201d(C71444e eVar) {
        AbstractC71496a aVar = eVar.f160080d;
        if (aVar == null) {
            C89219l.m154710a("viewManager");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$k */
    public static final class C71455k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160100a;

        static {
            Covode.recordClassIndex(83989);
        }

        C71455k(C71444e eVar) {
            this.f160100a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                C71444e.m126199b(this.f160100a).mo113043a(f.floatValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$s */
    public static final class C71463s<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160108a;

        static {
            Covode.recordClassIndex(83997);
        }

        C71463s(C71444e eVar) {
            this.f160108a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (this.f160108a.f160083g) {
                C71444e.m126199b(this.f160108a).mo113047a(num);
            }
        }
    }

    /* renamed from: a */
    public final void mo113077a(AbstractC71434c cVar) {
        C89219l.m154721d(cVar, "");
        this.f160079c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$b */
    public static final class C71446b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160091a;

        static {
            Covode.recordClassIndex(83980);
        }

        C71446b(C71444e eVar) {
            this.f160091a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f160091a.f160083g && bool != null && (!bool.booleanValue())) {
                bool.booleanValue();
                C71444e.m126200c(this.f160091a).mo111336a(new C70576a(C71444e.m126201d(this.f160091a).mo113189a().getPlayingPosition(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$c */
    public static final class C71447c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160092a;

        static {
            Covode.recordClassIndex(83981);
        }

        C71447c(C71444e eVar) {
            this.f160092a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (this.f160092a.f160083g && l != null) {
                l.longValue();
                C71444e.m126200c(this.f160092a).mo111336a(new C70576a(l.longValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$d */
    public static final class C71448d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160093a;

        static {
            Covode.recordClassIndex(83982);
        }

        C71448d(C71444e eVar) {
            this.f160093a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f160093a.f160083g) {
                C71444e.m126200c(this.f160093a).mo111336a(new C70576a(this.f160093a.mo113079b(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing));
                C71444e.m126201d(this.f160093a).mo113207c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$e */
    public static final class C71449e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160094a;

        static {
            Covode.recordClassIndex(83983);
        }

        C71449e(C71444e eVar) {
            this.f160094a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f160094a.f160083g) {
                C71444e.m126200c(this.f160094a).mo111336a(new C70576a(this.f160094a.mo113080c(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_OnGoing));
                C71444e.m126201d(this.f160094a).mo113207c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$f */
    public static final class C71450f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160095a;

        static {
            Covode.recordClassIndex(83984);
        }

        C71450f(C71444e eVar) {
            this.f160095a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f160095a.f160083g) {
                C71444e.m126200c(this.f160095a).mo111336a(new C70576a(this.f160095a.mo113079b(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateIn));
                C71444e.m126201d(this.f160095a).mo113207c();
                this.f160095a.mo113081d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$g */
    public static final class C71451g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160096a;

        static {
            Covode.recordClassIndex(83985);
        }

        C71451g(C71444e eVar) {
            this.f160096a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f160096a.f160083g) {
                C71444e.m126200c(this.f160096a).mo111336a(new C70576a(this.f160096a.mo113080c(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateOut));
                C71444e.m126201d(this.f160096a).mo113207c();
                this.f160096a.mo113081d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$i */
    public static final class C71453i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160098a;

        static {
            Covode.recordClassIndex(83987);
        }

        C71453i(C71444e eVar) {
            this.f160098a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f160098a.f160083g) {
                this.f160098a.f160085i.f157912b = C71444e.m126201d(this.f160098a).mo113189a().getPlayingPosition();
                C71444e.m126200c(this.f160098a).mo111336a(this.f160098a.f160085i);
                C71444e.m126201d(this.f160098a).mo113207c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$j */
    public static final class C71454j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160099a;

        static {
            Covode.recordClassIndex(83988);
        }

        C71454j(C71444e eVar) {
            this.f160099a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C71444e.m126200c(this.f160099a).mo111336a(new C70576a(this.f160099a.mo113079b(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
            this.f160099a.mo113081d();
            C71444e.m126201d(this.f160099a).mo113207c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$a */
    public static final class C71445a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160090a;

        static {
            Covode.recordClassIndex(83979);
        }

        C71445a(C71444e eVar) {
            this.f160090a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            C70576a aVar = (C70576a) obj;
            if (aVar != null && (valueOf = Integer.valueOf(aVar.f157914d)) != null) {
                if (valueOf.intValue() == 1) {
                    this.f160090a.f160084h.post(this.f160090a.f160086j);
                    C71444e.m126198a(this.f160090a).mo113060a();
                } else if (valueOf.intValue() == 2) {
                    this.f160090a.f160084h.removeCallbacks(this.f160090a.f160086j);
                    C71444e.m126198a(this.f160090a).mo113069b();
                } else if (valueOf.intValue() == 3) {
                    this.f160090a.f160084h.removeCallbacks(this.f160090a.f160086j);
                    C71444e.m126198a(this.f160090a).mo113062a(aVar.f157912b, aVar.f157911a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo113078a(boolean z) {
        long k;
        C71442d dVar = this.f160078b;
        if (dVar == null) {
            C89219l.m154710a("editorPresenter");
        }
        if (dVar.f160074a == null) {
            k = 0;
        } else {
            AbstractC31071f fVar = dVar.f160074a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            k = (long) fVar.mo56370k();
        }
        if (z) {
            k = 0;
        } else if (k < 0) {
            return;
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f160087k;
        if (cutMultiVideoViewModel == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        VideoEditViewModel videoEditViewModel = this.f160088l;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        List<VideoSegment> j = videoEditViewModel.mo111231j();
        VideoEditViewModel videoEditViewModel2 = this.f160088l;
        if (videoEditViewModel2 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        cutMultiVideoViewModel.mo110474a(k, j, videoEditViewModel2.mo111233l());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.e$m */
    public static final class C71457m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C71444e f160102a;

        static {
            Covode.recordClassIndex(83991);
        }

        C71457m(C71444e eVar) {
            this.f160102a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            C70091f fVar = (C70091f) obj;
            if (fVar != null && (valueOf = Integer.valueOf(fVar.f156760d)) != null) {
                if (valueOf.intValue() == 0) {
                    if (this.f160102a.f160082f) {
                        this.f160102a.f160081e = fVar.f156761e;
                        C71444e.m126200c(this.f160102a).mo111336a(new C70576a(2, false));
                    }
                    this.f160102a.f160082f = false;
                    C71444e.m126201d(this.f160102a).mo113201a(false, 0);
                } else if (valueOf != null && valueOf.intValue() != 1 && valueOf.intValue() == 2) {
                    this.f160102a.f160082f = true;
                    C71444e.m126201d(this.f160102a).mo113201a(true, fVar.f156762f);
                    C71444e.m126199b(this.f160102a).mo113044a(this.f160102a.f160081e, fVar.f156762f);
                    if (!C71444e.m126201d(this.f160102a).mo113206b()) {
                        C71444e.m126200c(this.f160102a).mo111336a(new C70576a(1, false));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo113075a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f160077a;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo111335a().observe(eVar, new C71445a(this));
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f160087k;
        if (cutMultiVideoViewModel == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel.f156529a.observe(eVar, new C71456l(this));
        CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f160087k;
        if (cutMultiVideoViewModel2 == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel2.f156538j.observe(eVar, new C71457m(this));
        VideoEditViewModel videoEditViewModel = this.f160088l;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel.f157700y = new C71458n(this);
        VideoEditViewModel videoEditViewModel2 = this.f160088l;
        if (videoEditViewModel2 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel2.f157690o.observe(eVar, new C71459o(this));
        VideoEditViewModel videoEditViewModel3 = this.f160088l;
        if (videoEditViewModel3 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel3.f157691p.observe(eVar, new C71460p(this));
        VideoEditViewModel videoEditViewModel4 = this.f160088l;
        if (videoEditViewModel4 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel4.f157692q.observe(eVar, new C71461q(this));
        VideoEditViewModel videoEditViewModel5 = this.f160088l;
        if (videoEditViewModel5 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel5.f157693r.observe(eVar, new C71462r(this));
        VideoEditViewModel videoEditViewModel6 = this.f160088l;
        if (videoEditViewModel6 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel6.f157677b.observe(eVar, new C71463s(this));
        VideoEditViewModel videoEditViewModel7 = this.f160088l;
        if (videoEditViewModel7 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel7.f157678c.observe(eVar, new C71446b(this));
        VideoEditViewModel videoEditViewModel8 = this.f160088l;
        if (videoEditViewModel8 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel8.f157680e.observe(eVar, new C71447c(this));
        VideoEditViewModel videoEditViewModel9 = this.f160088l;
        if (videoEditViewModel9 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel9.f157682g.observe(eVar, new C71448d(this));
        VideoEditViewModel videoEditViewModel10 = this.f160088l;
        if (videoEditViewModel10 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel10.f157681f.observe(eVar, new C71449e(this));
        VideoEditViewModel videoEditViewModel11 = this.f160088l;
        if (videoEditViewModel11 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel11.f157683h.observe(eVar, new C71450f(this));
        VideoEditViewModel videoEditViewModel12 = this.f160088l;
        if (videoEditViewModel12 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel12.f157686k.observe(eVar, new C71451g(this));
        VideoEditViewModel videoEditViewModel13 = this.f160088l;
        if (videoEditViewModel13 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel13.f157679d.observe(eVar, new C71452h(this));
        VideoEditViewModel videoEditViewModel14 = this.f160088l;
        if (videoEditViewModel14 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel14.f157687l.observe(eVar, new C71453i(this));
        VideoEditViewModel videoEditViewModel15 = this.f160088l;
        if (videoEditViewModel15 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel15.f157688m.observe(eVar, new C71454j(this));
        VideoEditViewModel videoEditViewModel16 = this.f160088l;
        if (videoEditViewModel16 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        videoEditViewModel16.f157689n.observe(eVar, new C71455k(this));
    }

    /* renamed from: a */
    public final void mo113076a(VEVideoCutterViewModel vEVideoCutterViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, CutVideoSpeedViewModel cutVideoSpeedViewModel, C71442d dVar, AbstractC71496a aVar) {
        C89219l.m154721d(vEVideoCutterViewModel, "");
        C89219l.m154721d(cutMultiVideoViewModel, "");
        C89219l.m154721d(videoEditViewModel, "");
        C89219l.m154721d(cutVideoSpeedViewModel, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        this.f160077a = vEVideoCutterViewModel;
        this.f160087k = cutMultiVideoViewModel;
        this.f160088l = videoEditViewModel;
        this.f160089m = cutVideoSpeedViewModel;
        this.f160078b = dVar;
        this.f160080d = aVar;
    }
}
