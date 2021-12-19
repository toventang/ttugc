package com.p2082ss.android.ugc.aweme.canvas.guide;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88502d;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget */
public final class CanvasGestureGuideWidget {

    /* renamed from: a */
    public AbstractC88412b f83468a;

    /* renamed from: b */
    public final ActivityC0945e f83469b;

    /* renamed from: c */
    final SimpleDraweeView f83470c;

    /* renamed from: d */
    public final View f83471d;

    /* renamed from: e */
    private final AbstractC89244h f83472e = C89250i.m154774a(EnumC89331m.NONE, new C35382c(this));

    /* renamed from: com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget$e */
    static final class C35384e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C35384e f83478a = new C35384e();

        static {
            Covode.recordClassIndex(42557);
        }

        C35384e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(42551);
    }

    /* renamed from: a */
    public final C1213t<Boolean> mo62284a() {
        return (C1213t) this.f83472e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget$c */
    static final class C35382c extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        final /* synthetic */ CanvasGestureGuideWidget f83476a;

        static {
            Covode.recordClassIndex(42555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35382c(CanvasGestureGuideWidget canvasGestureGuideWidget) {
            super(0);
            this.f83476a = canvasGestureGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return EditPhotoCanvasPromptViewModel.C35385a.m72412a(this.f83476a.f83469b).f83480a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget$d */
    static final class C35383d implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ CanvasGestureGuideWidget f83477a;

        static {
            Covode.recordClassIndex(42556);
        }

        C35383d(CanvasGestureGuideWidget canvasGestureGuideWidget) {
            this.f83477a = canvasGestureGuideWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f83477a.mo62284a().setValue(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget$CanvasGestureGuideObserver */
    public final class CanvasGestureGuideObserver implements AbstractC33974au {
        static {
            Covode.recordClassIndex(42552);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
                onDestroy();
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
        public final void onDestroy() {
            AbstractC88412b bVar = CanvasGestureGuideWidget.this.f83468a;
            if (bVar != null) {
                bVar.dispose();
            }
            CanvasGestureGuideWidget.this.f83469b.getLifecycle().mo4013b(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CanvasGestureGuideObserver() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget$a */
    public static final class C35380a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ CanvasGestureGuideWidget f83474a;

        static {
            Covode.recordClassIndex(42553);
        }

        public C35380a(CanvasGestureGuideWidget canvasGestureGuideWidget) {
            this.f83474a = canvasGestureGuideWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154721d("guide change ".concat(String.valueOf(bool)), "");
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                CanvasGestureGuideWidget canvasGestureGuideWidget = this.f83474a;
                AbstractC88412b bVar = canvasGestureGuideWidget.f83468a;
                if (bVar != null) {
                    bVar.dispose();
                }
                View view = canvasGestureGuideWidget.f83471d;
                if (view != null) {
                    view.setVisibility(0);
                }
                Uri parse = Uri.parse("asset:///edit_photo_gesture_guide.webp");
                C24185e b = C24182c.m45843b();
                b.f57306j = true;
                AbstractC24195a c = b.mo39799b(parse).mo39827e();
                SimpleDraweeView simpleDraweeView = canvasGestureGuideWidget.f83470c;
                if (simpleDraweeView != null) {
                    simpleDraweeView.setController(c);
                }
                canvasGestureGuideWidget.f83468a = C88925a.m154165a(C88502d.f200771a).mo142936a(5, TimeUnit.SECONDS).mo142937a(C88391a.m153580a(C88392a.f200660a)).mo142935a(new C35383d(canvasGestureGuideWidget), C35384e.f83478a);
                return;
            }
            CanvasGestureGuideWidget canvasGestureGuideWidget2 = this.f83474a;
            AbstractC88412b bVar2 = canvasGestureGuideWidget2.f83468a;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            View view2 = canvasGestureGuideWidget2.f83471d;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget$b */
    public static final class View$OnTouchListenerC35381b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CanvasGestureGuideWidget f83475a;

        static {
            Covode.recordClassIndex(42554);
        }

        public View$OnTouchListenerC35381b(CanvasGestureGuideWidget canvasGestureGuideWidget) {
            this.f83475a = canvasGestureGuideWidget;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() == 0) {
                this.f83475a.mo62284a().setValue(false);
            }
            return false;
        }
    }

    public CanvasGestureGuideWidget(ActivityC0945e eVar, SimpleDraweeView simpleDraweeView, View view) {
        C89219l.m154721d(eVar, "");
        this.f83469b = eVar;
        this.f83470c = simpleDraweeView;
        this.f83471d = view;
    }
}
