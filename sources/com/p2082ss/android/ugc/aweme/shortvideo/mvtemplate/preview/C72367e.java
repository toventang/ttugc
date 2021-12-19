package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.AbstractC22213f;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.experiment.C46916ew;
import com.p2082ss.android.ugc.aweme.p2477ci.C36080a;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72323j;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72316c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3845a.C72296a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72357f;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a.animationInterpolatorC74267a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.android.AbstractC89522b;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e */
public final class C72367e extends AbstractC22213f implements AbstractC72364c {

    /* renamed from: f */
    public AbstractC72363b f162237f;

    /* renamed from: g */
    public MvImageChooseAdapter.MyMediaModel f162238g;

    /* renamed from: h */
    public View f162239h;

    /* renamed from: i */
    private int f162240i = -1;

    /* renamed from: j */
    private final AbstractC89244h f162241j = C89250i.m154773a((AbstractC89171a) new C72369b(this));

    /* renamed from: k */
    private final AbstractC89244h f162242k = C89250i.m154773a((AbstractC89171a) new C72368a(this));

    /* renamed from: l */
    private AbstractC89568bz f162243l;

    static {
        Covode.recordClassIndex(85040);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final SimpleDraweeView mo62771E() {
        return (SimpleDraweeView) this.f162241j.getValue();
    }

    /* renamed from: F */
    public final ImageView mo114662F() {
        return (ImageView) this.f162242k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
    /* renamed from: a */
    public final void mo114657a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
    /* renamed from: b */
    public final void mo114660b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e$d */
    public static final class C72371d extends AbstractC72323j {

        /* renamed from: b */
        final /* synthetic */ View f162247b;

        static {
            Covode.recordClassIndex(85044);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72323j
        /* renamed from: c */
        public final View mo114591c() {
            return this.f162247b;
        }

        C72371d(View view) {
            this.f162247b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e$f */
    public static final class C72373f extends AbstractC72323j {

        /* renamed from: b */
        final /* synthetic */ View f162249b;

        static {
            Covode.recordClassIndex(85046);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72323j
        /* renamed from: c */
        public final View mo114591c() {
            return this.f162249b;
        }

        C72373f(View view) {
            this.f162249b = view;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
    /* renamed from: d */
    public final void mo114661d() {
        mo114663G();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e$e */
    public static final class C72372e implements AbstractC72357f {

        /* renamed from: a */
        final /* synthetic */ C72367e f162248a;

        static {
            Covode.recordClassIndex(85045);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72318e
        /* renamed from: b */
        public final void mo114586b() {
            this.f162248a.mo114663G();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72357f
        /* renamed from: c */
        public final void mo114639c() {
            AbstractC72363b bVar = this.f162248a.f162237f;
            if (bVar != null) {
                bVar.mo114655f();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72357f
        /* renamed from: d */
        public final void mo114640d() {
            AbstractC72363b bVar = this.f162248a.f162237f;
            if (bVar != null) {
                bVar.mo114656g();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72318e
        /* renamed from: a */
        public final void mo114584a() {
            if (C46916ew.m90217b()) {
                AbstractC72363b bVar = this.f162248a.f162237f;
                if (bVar != null) {
                    bVar.mo114654e();
                    return;
                }
                return;
            }
            this.f162248a.mo114663G();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72372e(C72367e eVar) {
            this.f162248a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72318e
        /* renamed from: a */
        public final void mo114585a(float f) {
            AbstractC72363b bVar = this.f162248a.f162237f;
            if (bVar != null) {
                bVar.mo114648a(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e$a */
    static final class C72368a extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C72367e f162244a;

        static {
            Covode.recordClassIndex(85041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72368a(C72367e eVar) {
            super(0);
            this.f162244a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            View c = this.f162244a.mo36475c(R.id.blt);
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e$b */
    static final class C72369b extends AbstractC89220m implements AbstractC89171a<SimpleDraweeView> {

        /* renamed from: a */
        final /* synthetic */ C72367e f162245a;

        static {
            Covode.recordClassIndex(85042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72369b(C72367e eVar) {
            super(0);
            this.f162245a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SimpleDraweeView invoke() {
            View c = this.f162245a.mo36475c(R.id.aow);
            C89219l.m154716b(c, "");
            return c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e$c */
    public static final class C72370c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72367e f162246a;

        static {
            Covode.recordClassIndex(85043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72370c(C72367e eVar) {
            super(0);
            this.f162246a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC72363b bVar = this.f162246a.f162237f;
            if (bVar != null) {
                bVar.mo114653d();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22213f
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC89568bz bzVar = this.f162243l;
        if (bzVar != null && (!bzVar.mo144007k())) {
            bzVar.mo143985a((CancellationException) null);
        }
    }

    /* renamed from: G */
    public final void mo114663G() {
        View c;
        AbstractC72363b bVar = this.f162237f;
        if (!(bVar == null || (c = bVar.mo114652c()) == null)) {
            C72371d dVar = new C72371d(c);
            AbstractC72352c a = C72402m.m127682a(this.f162239h);
            if (a != null) {
                a.mo114510a(dVar.mo114589a(), dVar.mo114590b(), new C72316c(), m127630H(), new C72370c(this));
                if (C89391z.f203057a != null) {
                    return;
                }
            }
        }
        AbstractC72363b bVar2 = this.f162237f;
        if (bVar2 != null) {
            bVar2.mo114653d();
        }
    }

    /* renamed from: H */
    private static C72296a m127630H() {
        C72296a aVar = new C72296a();
        aVar.f162078f = 220;
        aVar.f162079g = 220;
        aVar.f162080h = 220;
        aVar.f162081i = 220;
        aVar.mo114562a(new animationInterpolatorC74267a(C72402m.f162308a.getFirst(), C72402m.f162308a.getSecond()));
        aVar.mo114563b(new animationInterpolatorC74267a(C72402m.f162308a.getFirst(), C72402m.f162308a.getSecond()));
        aVar.mo114564c(new animationInterpolatorC74267a(C72402m.f162308a.getFirst(), C72402m.f162308a.getSecond()));
        aVar.mo114565d(new animationInterpolatorC74267a(C72402m.f162308a.getFirst(), C72402m.f162308a.getSecond()));
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e$g */
    public static final class C72374g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f162250a;

        /* renamed from: b */
        final /* synthetic */ C72367e f162251b;

        static {
            Covode.recordClassIndex(85047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72374g(C72367e eVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f162251b = eVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C72374g(this.f162251b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C72374g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            String str;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f162250a;
            if (i == 0) {
                C89382r.m154942a(obj);
                MvImageChooseAdapter.MyMediaModel myMediaModel = this.f162251b.f162238g;
                if (myMediaModel != null) {
                    str = myMediaModel.f134662b;
                } else {
                    str = null;
                }
                final int b = C36080a.m73537b(str);
                AbstractC89522b bVar = C31068c.f74429a;
                C723751 r0 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C72367e.C72374g.C723751 */

                    /* renamed from: a */
                    int f162252a;

                    /* renamed from: b */
                    final /* synthetic */ C72374g f162253b;

                    static {
                        Covode.recordClassIndex(85048);
                    }

                    {
                        this.f162253b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22213f
                        /* renamed from: a */
                        public final void mo22704a(Bundle bundle) {
                            super.mo22704a(bundle);
                            this.f162239h = mo36475c(R.id.b_c);
                            C72372e eVar = new C72372e(this);
                            AbstractC72352c a = C72402m.m127682a(this.f162239h);
                            if (a != null) {
                                a.setGestureListener(eVar);
                            }
                            ((AbstractC22213f) this).f52518b.getLifecycle().mo4012a(new PreviewImageScene$onActivityCreated$1(this));
                            this.f162243l = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C72374g(this, null), 3);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
                        /* renamed from: a */
                        public final void mo114659a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                            this.f162238g = myMediaModel;
                        }

                        /* renamed from: b */
                        public final void mo114664b(boolean z) {
                            AbstractC72363b bVar;
                            View c;
                            if (z && (bVar = this.f162237f) != null && (c = bVar.mo114652c()) != null) {
                                C72373f fVar = new C72373f(c);
                                AbstractC72352c a = C72402m.m127682a(this.f162239h);
                                if (a != null) {
                                    a.mo114509a(fVar.mo114589a(), fVar.mo114590b(), new C72316c(), m127630H());
                                }
                            }
                        }

                        @Override // com.bytedance.scene.group.AbstractC22213f
                        /* renamed from: a */
                        public final void mo36459a(boolean z) {
                            AbstractC72352c a;
                            super.mo36459a(z);
                            if (!z && (a = C72402m.m127682a(this.f162239h)) != null) {
                                a.mo114506a();
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e$h */
                        public static final class C72376h extends C24202c<AbstractC24457f> {

                            /* renamed from: a */
                            final /* synthetic */ C72367e f162255a;

                            /* renamed from: b */
                            final /* synthetic */ long f162256b;

                            static {
                                Covode.recordClassIndex(85049);
                            }

                            C72376h(C72367e eVar, long j) {
                                this.f162255a = eVar;
                                this.f162256b = j;
                            }

                            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                            public final void onFailure(String str, Throwable th) {
                                super.onFailure(str, th);
                                C72367e.m127631a(false, 0L);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                                super.onFinalImageSet(str, fVar, animatable);
                                C72367e.m127631a(true, SystemClock.elapsedRealtime() - this.f162256b);
                            }
                        }

                        @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
                        /* renamed from: a */
                        public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                            return mo22702a(layoutInflater, viewGroup);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.preview.AbstractC72364c
                        /* renamed from: a */
                        public final void mo114658a(int i, AbstractC72363b bVar) {
                            C89219l.m154721d(bVar, "");
                            this.f162240i = i;
                            this.f162237f = bVar;
                        }

                        /* renamed from: a */
                        public static void m127631a(boolean z, long j) {
                            JSONObject jSONObject = new JSONObject();
                            if (z) {
                                jSONObject.put("time_elapse", j);
                            }
                            C40982q.m82520a("tool_performance_preview_image_render_time", z ? 1 : 0, jSONObject);
                        }

                        @Override // com.bytedance.scene.group.AbstractC22186b
                        /* renamed from: b */
                        public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                            int i;
                            C89219l.m154721d(layoutInflater, "");
                            C89219l.m154721d(viewGroup, "");
                            if (C46916ew.m90217b()) {
                                i = R.layout.at7;
                            } else {
                                i = R.layout.at6;
                            }
                            View a = C1764a.m5927a(layoutInflater, i, viewGroup, false);
                            Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
                            return (ViewGroup) a;
                        }
                    }
