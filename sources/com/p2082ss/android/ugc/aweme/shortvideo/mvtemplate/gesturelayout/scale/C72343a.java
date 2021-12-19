package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.p037h.C0769d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.C72354e;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.a */
public final class C72343a {

    /* renamed from: a */
    public final GestureDetector$OnDoubleTapListenerC72344a f162177a = new GestureDetector$OnDoubleTapListenerC72344a(this);

    /* renamed from: b */
    public final C72350g f162178b = new C72350g(this);

    /* renamed from: c */
    public final GestureDetector$OnGestureListenerC72346c f162179c = new GestureDetector$OnGestureListenerC72346c(this);

    /* renamed from: d */
    public final C72348e f162180d = new C72348e(this);

    /* renamed from: e */
    final AbstractC89244h f162181e;

    /* renamed from: f */
    final AbstractC89244h f162182f;

    /* renamed from: g */
    final AbstractC89244h f162183g;

    /* renamed from: h */
    public final AbstractC72351b f162184h;

    static {
        Covode.recordClassIndex(85012);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.a$d */
    static final class C72347d extends AbstractC89220m implements AbstractC89171a<C84882b> {

        /* renamed from: a */
        final /* synthetic */ C72343a f162189a;

        /* renamed from: b */
        final /* synthetic */ Context f162190b;

        static {
            Covode.recordClassIndex(85016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72347d(C72343a aVar, Context context) {
            super(0);
            this.f162189a = aVar;
            this.f162190b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84882b invoke() {
            return new C84882b(this.f162190b, this.f162189a.f162180d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.a$f */
    static final class C72349f extends AbstractC89220m implements AbstractC89171a<C72354e> {

        /* renamed from: a */
        final /* synthetic */ C72343a f162192a;

        static {
            Covode.recordClassIndex(85018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72349f(C72343a aVar) {
            super(0);
            this.f162192a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C72354e invoke() {
            return new C72354e(this.f162192a.f162178b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.a$b */
    static final class C72345b extends AbstractC89220m implements AbstractC89171a<C0769d> {

        /* renamed from: a */
        final /* synthetic */ C72343a f162186a;

        /* renamed from: b */
        final /* synthetic */ Context f162187b;

        static {
            Covode.recordClassIndex(85014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72345b(C72343a aVar, Context context) {
            super(0);
            this.f162186a = aVar;
            this.f162187b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C0769d invoke() {
            C0769d dVar = new C0769d(this.f162187b, this.f162186a.f162179c);
            dVar.mo2892a(this.f162186a.f162177a);
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.a$a */
    public static final class GestureDetector$OnDoubleTapListenerC72344a implements GestureDetector.OnDoubleTapListener {

        /* renamed from: a */
        final /* synthetic */ C72343a f162185a;

        static {
            Covode.recordClassIndex(85013);
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        GestureDetector$OnDoubleTapListenerC72344a(C72343a aVar) {
            this.f162185a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return this.f162185a.f162184h.mo114615b(motionEvent);
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return this.f162185a.f162184h.mo114611a(motionEvent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.a$c */
    public static final class GestureDetector$OnGestureListenerC72346c implements GestureDetector.OnGestureListener {

        /* renamed from: a */
        final /* synthetic */ C72343a f162188a;

        static {
            Covode.recordClassIndex(85015);
        }

        public final void onShowPress(MotionEvent motionEvent) {
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        GestureDetector$OnGestureListenerC72346c(C72343a aVar) {
            this.f162188a = aVar;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            return this.f162188a.f162184h.mo114617c(motionEvent);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            this.f162188a.f162184h.mo114619d(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            return this.f162188a.f162184h.mo114612a(motionEvent, motionEvent2, f, f2);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            return this.f162188a.f162184h.mo114616b(motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.a$e */
    public static final class C72348e implements C84882b.AbstractC84884b {

        /* renamed from: a */
        final /* synthetic */ C72343a f162191a;

        static {
            Covode.recordClassIndex(85017);
        }

        @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
        /* renamed from: a */
        public final boolean mo23091a(C84882b bVar) {
            C89219l.m154721d(bVar, "");
            return true;
        }

        @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
        /* renamed from: a */
        public final boolean mo23092a(C84882b bVar, float f, float f2) {
            C89219l.m154721d(bVar, "");
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72348e(C72343a aVar) {
            this.f162191a = aVar;
        }

        @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84882b.AbstractC84884b
        /* renamed from: b */
        public final void mo23093b(C84882b bVar) {
            C89219l.m154721d(bVar, "");
            this.f162191a.f162184h.mo114610a(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.a$g */
    public static final class C72350g implements C72354e.AbstractC72356b {

        /* renamed from: a */
        final /* synthetic */ C72343a f162193a;

        static {
            Covode.recordClassIndex(85019);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72350g(C72343a aVar) {
            this.f162193a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.C72354e.AbstractC72356b
        /* renamed from: c */
        public final void mo114635c(View view, C72354e eVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(eVar, "");
            this.f162193a.f162184h.mo114614b(eVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.C72354e.AbstractC72356b
        /* renamed from: a */
        public final boolean mo114633a(View view, C72354e eVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(eVar, "");
            return this.f162193a.f162184h.mo114618c(eVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.C72354e.AbstractC72356b
        /* renamed from: b */
        public final boolean mo114634b(View view, C72354e eVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(eVar, "");
            return this.f162193a.f162184h.mo114613a(eVar);
        }
    }

    public C72343a(Context context, AbstractC72351b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        this.f162184h = bVar;
        this.f162181e = C89250i.m154773a((AbstractC89171a) new C72345b(this, context));
        this.f162182f = C89250i.m154773a((AbstractC89171a) new C72347d(this, context));
        this.f162183g = C89250i.m154773a((AbstractC89171a) new C72349f(this));
    }
}
