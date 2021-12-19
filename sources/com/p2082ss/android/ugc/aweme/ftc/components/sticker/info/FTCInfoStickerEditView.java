package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45896b;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.C52154a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a.C52155a;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71033a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71049b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3859a.C72840c;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78485b;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84908o;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import com.p2082ss.android.vesdk.C85615x;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerEditView */
public class FTCInfoStickerEditView extends View {

    /* renamed from: l */
    public static int f120294l = 1;

    /* renamed from: A */
    public boolean f120295A;

    /* renamed from: B */
    Context f120296B;

    /* renamed from: C */
    C52229b f120297C;

    /* renamed from: D */
    public C72840c f120298D = new C72840c(this, new C52228a(this, (byte) 0));

    /* renamed from: E */
    public PointF f120299E = new PointF();

    /* renamed from: F */
    C52155a f120300F;

    /* renamed from: G */
    public boolean f120301G = false;

    /* renamed from: H */
    public C45896b f120302H;

    /* renamed from: I */
    Runnable f120303I = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerEditView.RunnableC522271 */

        static {
            Covode.recordClassIndex(61614);
        }

        public final void run() {
            if (FTCInfoStickerEditView.this.f120313g != null && FTCInfoStickerEditView.this.f120318m != null && FTCInfoStickerEditView.this.f120318m.f120335a != null && FTCInfoStickerEditView.this.f120318m.f120335a.f120152c) {
                FTCInfoStickerEditView.this.f120295A = false;
                FTCInfoStickerEditView.this.f120318m.f120335a.f120152c = false;
                FTCInfoStickerEditView.this.f120313g.mo88006b();
                FTCInfoStickerEditView.this.f120298D.mo77176b();
                FTCInfoStickerEditView.this.invalidate();
            }
        }
    };

    /* renamed from: J */
    private Point f120304J;

    /* renamed from: K */
    private AbstractC71049b f120305K;

    /* renamed from: L */
    private FTCEditInfoStickerViewModel f120306L;

    /* renamed from: a */
    public int f120307a;

    /* renamed from: b */
    public int f120308b;

    /* renamed from: c */
    public int f120309c;

    /* renamed from: d */
    public int f120310d;

    /* renamed from: e */
    AbstractC31071f f120311e;

    /* renamed from: f */
    SafeHandler f120312f;

    /* renamed from: g */
    public C52263h f120313g;

    /* renamed from: h */
    public boolean f120314h = true;

    /* renamed from: i */
    AbstractC78485b<C52154a> f120315i;

    /* renamed from: j */
    AbstractC78485b<C52154a> f120316j;

    /* renamed from: k */
    public int f120317k;

    /* renamed from: m */
    public C52230c f120318m = new C52230c();

    /* renamed from: n */
    public int f120319n;

    /* renamed from: o */
    public boolean f120320o;

    /* renamed from: p */
    public long f120321p;

    /* renamed from: q */
    public boolean f120322q;

    /* renamed from: r */
    public float f120323r;

    /* renamed from: s */
    public float f120324s;

    /* renamed from: t */
    public float f120325t;

    /* renamed from: u */
    public float f120326u;

    /* renamed from: v */
    public C52264i.AbstractC52270b f120327v;

    /* renamed from: w */
    public boolean f120328w = true;

    /* renamed from: x */
    public boolean f120329x = true;

    /* renamed from: y */
    public boolean f120330y;

    /* renamed from: z */
    public boolean f120331z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerEditView$c */
    public static class C52230c {

        /* renamed from: a */
        C52154a f120335a;

        /* renamed from: b */
        int f120336b;

        /* renamed from: c */
        boolean f120337c;

        static {
            Covode.recordClassIndex(61617);
        }

        C52230c() {
        }
    }

    public C52229b getGestureListener() {
        return this.f120297C;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerEditView$a */
    class C52228a implements AbstractC45840k {
        static {
            Covode.recordClassIndex(61615);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: d */
        public final void mo77194d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: e */
        public final void mo77195e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: f */
        public final void mo77196f() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: g */
        public final void mo77197g() {
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: b */
        public final void mo77192b() {
            FTCInfoStickerEditView.this.mo87958c();
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: a */
        public final void mo77191a() {
            FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
            if (fTCInfoStickerEditView.f120318m.f120335a == null) {
                fTCInfoStickerEditView.setShowHelpBox(false);
            } else if (fTCInfoStickerEditView.f120328w) {
                fTCInfoStickerEditView.f120319n = 1;
                C52263h hVar = fTCInfoStickerEditView.f120313g;
                fTCInfoStickerEditView.f120318m.f120335a.f120152c = false;
                hVar.mo88006b();
                fTCInfoStickerEditView.f120313g.mo88009c();
                if (fTCInfoStickerEditView.f120315i != null) {
                    fTCInfoStickerEditView.f120315i.mo88033a(fTCInfoStickerEditView.f120318m.f120335a);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: c */
        public final void mo77193c() {
            FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
            if (fTCInfoStickerEditView.f120318m.f120335a == null) {
                fTCInfoStickerEditView.setShowHelpBox(false);
                return;
            }
            fTCInfoStickerEditView.f120319n = 1;
            fTCInfoStickerEditView.f120318m.f120335a.f120152c = false;
            fTCInfoStickerEditView.f120313g.mo88009c();
            if (fTCInfoStickerEditView.f120316j != null) {
                fTCInfoStickerEditView.f120316j.mo88033a(fTCInfoStickerEditView.f120318m.f120335a);
            }
        }

        private C52228a() {
        }

        /* synthetic */ C52228a(FTCInfoStickerEditView fTCInfoStickerEditView, byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(61613);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87951a() {
        this.f120313g.mo88011d();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f120298D.mo77180f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f120298D.mo77181g();
    }

    /* renamed from: b */
    public final void mo87957b() {
        this.f120295A = false;
        for (C52154a aVar : this.f120313g.f120398a) {
            aVar.f120152c = false;
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C45896b mo87960e() {
        StickerItemModel stickerItemModel = this.f120318m.f120335a.f120151b;
        return new C45896b(stickerItemModel.rotateAngle, stickerItemModel.scale, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
    }

    public int getStickNumber() {
        if (!C84892d.m145850a(this.f120313g.f120398a)) {
            return this.f120313g.f120398a.size();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo87959d() {
        C52230c cVar;
        if (this.f120319n != 1 && (cVar = this.f120318m) != null && cVar.f120335a != null) {
            if (this.f120318m.f120337c) {
                this.f120318m.f120335a.f120151b.getId();
                this.f120313g.mo88012d(this.f120318m.f120335a);
                invalidate();
                return;
            }
            this.f120313g.mo88007b(this.f120318m.f120335a);
        }
    }

    /* renamed from: c */
    public final void mo87958c() {
        C72840c cVar = this.f120298D;
        if (cVar != null) {
            cVar.f106779b = false;
        }
        setShowHelpBox(true);
        this.f120319n = 1;
        C52263h hVar = this.f120313g;
        C52154a aVar = this.f120318m.f120335a;
        if (!aVar.f120161l) {
            if (hVar.f120403f != null) {
                hVar.f120403f.mo77270a();
            }
            if (hVar.f120399b != aVar) {
                hVar.mo88006b();
                hVar.f120399b = aVar;
            }
            hVar.f120399b.f120152c = true;
            hVar.f120399b.f120151b.getId();
            hVar.f120401d.mo56255a(hVar.f120399b.f120151b.getId(), 0, hVar.f120400c);
        } else if (hVar.f120399b != aVar) {
            hVar.mo88006b();
        }
        if (this.f120306L == null) {
            this.f120306L = (FTCEditInfoStickerViewModel) C20531t.m38716a((ActivityC0945e) this.f120296B).mo33800a(FTCEditInfoStickerViewModel.class);
        }
        FTCEditInfoStickerViewModel fTCEditInfoStickerViewModel = this.f120306L;
        StickerItemModel stickerItemModel = this.f120318m.f120335a.f120151b;
        C89219l.m154721d(stickerItemModel, "");
        fTCEditInfoStickerViewModel.mo33689c(new FTCEditInfoStickerViewModel.C52223b(stickerItemModel));
    }

    public void setHavePinEdit(boolean z) {
        this.f120329x = z;
    }

    public void setHaveTimeEdit(boolean z) {
        this.f120328w = z;
    }

    public void setITimeEditListener(AbstractC71049b bVar) {
        this.f120305K = bVar;
    }

    public void setOnInfoStickerPinEditClick(AbstractC78485b<C52154a> bVar) {
        this.f120316j = bVar;
    }

    public void setOnInfoStickerTimeEdit(AbstractC78485b<C52154a> bVar) {
        this.f120315i = bVar;
    }

    public void setPinHelper(C52155a aVar) {
        this.f120300F = aVar;
    }

    public void setStickerOnMoveListener(C52264i.AbstractC52270b bVar) {
        this.f120327v = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerEditView$b */
    public class C52229b extends AbstractC14537a {
        static {
            Covode.recordClassIndex(61616);
        }

        private C52229b() {
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: c */
        public final boolean mo23403c(float f) {
            boolean z = FTCInfoStickerEditView.this.f120314h;
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final void mo23397b(C84882b bVar) {
            if (FTCInfoStickerEditView.this.f120314h) {
                FTCInfoStickerEditView.this.f120327v.mo87994a(FTCInfoStickerEditView.this.f120318m.f120335a, true, false);
                System.currentTimeMillis();
            }
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23393a(ScaleGestureDetector scaleGestureDetector) {
            if (!FTCInfoStickerEditView.this.f120314h) {
                return false;
            }
            scaleGestureDetector.getScaleFactor();
            if (FTCInfoStickerEditView.this.f120318m.f120335a == null) {
                return super.mo23393a(scaleGestureDetector);
            }
            FTCInfoStickerEditView.this.f120319n = 2;
            FTCInfoStickerEditView.this.f120313g.mo88008b(FTCInfoStickerEditView.this.f120318m.f120335a, scaleGestureDetector.getScaleFactor());
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23399b(float f) {
            if (!FTCInfoStickerEditView.this.f120314h) {
                return false;
            }
            FTCInfoStickerEditView.this.f120327v.mo87994a(FTCInfoStickerEditView.this.f120318m.f120335a, true, true);
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23390a(float f) {
            if (!FTCInfoStickerEditView.this.f120314h) {
                return false;
            }
            if (FTCInfoStickerEditView.this.f120318m.f120335a == null) {
                return super.mo23390a(f);
            }
            FTCInfoStickerEditView.this.f120319n = 2;
            float degrees = (float) Math.toDegrees((double) f);
            if (Math.abs(degrees) > 10.0f) {
                degrees = 0.0f;
            }
            if (4 == FTCInfoStickerEditView.this.f120327v.mo87994a(FTCInfoStickerEditView.this.f120318m.f120335a, false, true)) {
                degrees = FTCInfoStickerEditView.this.f120327v.mo87996a(degrees).floatValue();
            }
            FTCInfoStickerEditView.this.f120313g.mo88002a(FTCInfoStickerEditView.this.f120318m.f120335a, -degrees);
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: c */
        public final boolean mo23404c(MotionEvent motionEvent) {
            if (!FTCInfoStickerEditView.this.f120322q) {
                if (FTCInfoStickerEditView.this.f120313g != null) {
                    float y = motionEvent.getY() - ((float) C33398a.f79357a.mo59453d());
                    C52263h hVar = FTCInfoStickerEditView.this.f120313g;
                    int x = (int) motionEvent.getX();
                    int i = (int) y;
                    if (!(hVar.f120398a == null || hVar.f120398a.size() == 0)) {
                        for (C52154a aVar : hVar.f120398a) {
                            if (aVar.f120155f.contains((float) x, (float) i)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } else if (!FTCInfoStickerEditView.this.f120295A) {
                return false;
            } else {
                FTCInfoStickerEditView.this.f120295A = false;
                return true;
            }
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23394a(C84882b bVar) {
            if (!FTCInfoStickerEditView.this.f120314h) {
                return false;
            }
            float f = bVar.f189709i.x;
            float f2 = bVar.f189709i.y;
            float f3 = FTCInfoStickerEditView.this.f120323r + f;
            float f4 = FTCInfoStickerEditView.this.f120324s + f2;
            float abs = Math.abs(f3 - FTCInfoStickerEditView.this.f120325t);
            float abs2 = Math.abs(f4 - FTCInfoStickerEditView.this.f120326u);
            if ((abs < 5.0f && abs2 < 5.0f) || FTCInfoStickerEditView.this.f120318m.f120335a == null) {
                return false;
            }
            if (3 == FTCInfoStickerEditView.this.f120327v.mo87994a(FTCInfoStickerEditView.this.f120318m.f120335a, false, false)) {
                PointF a = FTCInfoStickerEditView.this.f120327v.mo87995a(FTCInfoStickerEditView.this.f120318m.f120335a, f, f2);
                f = a.x;
                f2 = a.y;
                f3 = FTCInfoStickerEditView.this.f120323r + a.x;
                f4 = FTCInfoStickerEditView.this.f120324s + a.y;
            }
            if (FTCInfoStickerEditView.this.f120318m.f120336b == 0) {
                if (FTCInfoStickerEditView.this.f120327v != null) {
                    if (FTCInfoStickerEditView.this.f120318m.f120335a.f120152c) {
                        FTCInfoStickerEditView.this.f120331z = true;
                    }
                    FTCInfoStickerEditView.this.f120327v.mo87997a(FTCInfoStickerEditView.this.f120318m.f120335a, (int) f3, (int) f4, false, false);
                }
                FTCInfoStickerEditView.this.f120323r = f3;
                FTCInfoStickerEditView.this.f120324s = f4;
            }
            FTCInfoStickerEditView.this.f120319n = 2;
            if (FTCInfoStickerEditView.this.f120318m.f120336b == 0) {
                FTCInfoStickerEditView.this.f120313g.mo88003a(FTCInfoStickerEditView.this.f120318m.f120335a, f, f2);
            }
            FTCInfoStickerEditView.this.f120313g.mo88000a();
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23402b(ScaleGestureDetector scaleGestureDetector) {
            if (!FTCInfoStickerEditView.this.f120314h) {
                return false;
            }
            scaleGestureDetector.getScaleFactor();
            scaleGestureDetector.getFocusX();
            scaleGestureDetector.getFocusY();
            FTCInfoStickerEditView.this.mo87952a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            if (FTCInfoStickerEditView.this.f120318m.f120335a == null) {
                return false;
            }
            FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
            fTCInfoStickerEditView.f120331z = fTCInfoStickerEditView.f120295A;
            FTCInfoStickerEditView.this.f120313g.mo88006b();
            FTCInfoStickerEditView.this.f120313g.mo88012d(FTCInfoStickerEditView.this.f120318m.f120335a);
            FTCInfoStickerEditView.this.f120318m.f120335a.f120152c = false;
            FTCInfoStickerEditView.this.f120313g.mo88001a(FTCInfoStickerEditView.this.f120318m.f120335a);
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: f */
        public final boolean mo23406f(MotionEvent motionEvent) {
            boolean z = false;
            FTCInfoStickerEditView.this.f120301G = false;
            FTCInfoStickerEditView.this.f120299E.set(motionEvent.getRawX(), motionEvent.getRawY());
            if (!FTCInfoStickerEditView.this.f120314h) {
                return false;
            }
            if (!(FTCInfoStickerEditView.this.f120327v == null || FTCInfoStickerEditView.this.f120318m.f120335a == null || FTCInfoStickerEditView.this.f120318m.f120336b != 0)) {
                FTCInfoStickerEditView.this.f120327v.mo87997a(FTCInfoStickerEditView.this.f120318m.f120335a, (int) FTCInfoStickerEditView.this.f120323r, (int) FTCInfoStickerEditView.this.f120324s, true, false);
                if (FTCInfoStickerEditView.this.f120331z) {
                    FTCInfoStickerEditView.this.f120331z = false;
                }
            }
            if (System.currentTimeMillis() - FTCInfoStickerEditView.this.f120321p < 200) {
                if (FTCInfoStickerEditView.this.f120318m.f120335a == null) {
                    FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
                    C52263h hVar = fTCInfoStickerEditView.f120313g;
                    if (hVar.f120399b != null) {
                        z = true;
                    }
                    hVar.mo88006b();
                    fTCInfoStickerEditView.f120322q = z;
                    FTCInfoStickerEditView.this.f120298D.mo77176b();
                } else {
                    FTCInfoStickerEditView.this.f120322q = false;
                    if (FTCInfoStickerEditView.this.f120318m.f120336b == 0) {
                        FTCInfoStickerEditView.this.mo87958c();
                    }
                    FTCInfoStickerEditView.this.f120313g.mo88000a();
                }
                FTCInfoStickerEditView.this.invalidate();
                if (!FTCInfoStickerEditView.this.f120295A) {
                    FTCInfoStickerEditView.this.mo87959d();
                    if (!(FTCInfoStickerEditView.this.f120318m == null || FTCInfoStickerEditView.this.f120318m.f120335a == null)) {
                        FTCInfoStickerEditView.this.f120318m.f120335a = null;
                    }
                }
                return true;
            }
            if (!FTCInfoStickerEditView.this.f120295A) {
                FTCInfoStickerEditView.this.mo87959d();
                if (!(FTCInfoStickerEditView.this.f120318m == null || FTCInfoStickerEditView.this.f120318m.f120335a == null)) {
                    FTCInfoStickerEditView.this.f120318m.f120335a = null;
                }
            }
            return super.mo23406f(motionEvent);
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23400b(MotionEvent motionEvent) {
            FTCInfoStickerEditView.this.f120320o = false;
            float y = motionEvent.getY() - ((float) C33398a.f79357a.mo59453d());
            FTCInfoStickerEditView.this.f120323r = motionEvent.getX();
            FTCInfoStickerEditView.this.f120324s = y;
            FTCInfoStickerEditView.this.f120325t = motionEvent.getX();
            FTCInfoStickerEditView.this.f120326u = y;
            FTCInfoStickerEditView.this.f120321p = System.currentTimeMillis();
            FTCInfoStickerEditView.this.f120319n = -1;
            FTCInfoStickerEditView.this.f120318m.f120335a = null;
            if (FTCInfoStickerEditView.this.f120314h) {
                FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
                float x = motionEvent.getX();
                if (!C13617h.m24465a(fTCInfoStickerEditView.f120313g.f120398a)) {
                    for (C52154a aVar : fTCInfoStickerEditView.f120313g.f120398a) {
                        if (aVar.f120151b.isPin) {
                            fTCInfoStickerEditView.mo87953a(aVar);
                        }
                    }
                    int k = fTCInfoStickerEditView.f120311e.mo56370k();
                    for (C52154a aVar2 : fTCInfoStickerEditView.f120313g.f120398a) {
                        if (fTCInfoStickerEditView.f120313g.mo88005a(aVar2, k) && !fTCInfoStickerEditView.f120313g.mo88013e(aVar2) && fTCInfoStickerEditView.mo87956a(aVar2, x, y)) {
                            if (fTCInfoStickerEditView.f120318m.f120335a == null || C52263h.m97093a(aVar2, fTCInfoStickerEditView.f120318m.f120335a) > 0) {
                                fTCInfoStickerEditView.f120318m.f120335a = aVar2;
                                fTCInfoStickerEditView.f120318m.f120336b = 0;
                                fTCInfoStickerEditView.f120318m.f120337c = aVar2.f120152c;
                            }
                        }
                    }
                    if (!(fTCInfoStickerEditView.f120318m.f120335a == null || fTCInfoStickerEditView.f120300F == null)) {
                        if (fTCInfoStickerEditView.f120318m.f120335a.f120151b.isPin) {
                            C52155a aVar3 = fTCInfoStickerEditView.f120300F;
                            C52154a aVar4 = fTCInfoStickerEditView.f120318m.f120335a;
                            C89219l.m154721d(aVar4, "");
                            AbstractC31071f fVar = aVar3.f120173j;
                            StickerItemModel stickerItemModel = aVar4.f120151b;
                            C89219l.m154716b(stickerItemModel, "");
                            fVar.mo56375m(stickerItemModel.getId());
                            fTCInfoStickerEditView.mo87953a(fTCInfoStickerEditView.f120318m.f120335a);
                            fTCInfoStickerEditView.f120318m.f120335a.f120151b.setPin(false);
                            C80720e.m139931c(fTCInfoStickerEditView.f120318m.f120335a.f120151b.pinAlgorithmFile);
                            fTCInfoStickerEditView.f120318m.f120335a.f120151b.setPinAlgorithmFile(null);
                        } else if (!TextUtils.isEmpty(fTCInfoStickerEditView.f120318m.f120335a.f120151b.pinAlgorithmFile) && C80720e.m139927b(fTCInfoStickerEditView.f120318m.f120335a.f120151b.pinAlgorithmFile)) {
                            C80720e.m139931c(fTCInfoStickerEditView.f120318m.f120335a.f120151b.pinAlgorithmFile);
                            fTCInfoStickerEditView.f120318m.f120335a.f120151b.setPinAlgorithmFile(null);
                        }
                    }
                    fTCInfoStickerEditView.f120313g.mo88010c(fTCInfoStickerEditView.f120318m.f120335a);
                    if (!(fTCInfoStickerEditView.f120318m == null || fTCInfoStickerEditView.f120318m.f120335a == null)) {
                        fTCInfoStickerEditView.f120302H = fTCInfoStickerEditView.mo87960e();
                    }
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23396a(C84885c cVar) {
            if (!FTCInfoStickerEditView.this.f120314h) {
                return false;
            }
            FTCInfoStickerEditView.this.mo87952a(cVar.f189714i, cVar.f189715j);
            if (FTCInfoStickerEditView.this.f120318m.f120335a == null) {
                return super.mo23396a(cVar);
            }
            FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
            fTCInfoStickerEditView.f120331z = fTCInfoStickerEditView.f120295A;
            FTCInfoStickerEditView.this.f120313g.mo88006b();
            FTCInfoStickerEditView.this.f120313g.mo88012d(FTCInfoStickerEditView.this.f120318m.f120335a);
            FTCInfoStickerEditView.this.f120318m.f120335a.f120152c = false;
            FTCInfoStickerEditView.this.f120313g.mo88001a(FTCInfoStickerEditView.this.f120318m.f120335a);
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        /* synthetic */ C52229b(FTCInfoStickerEditView fTCInfoStickerEditView, byte b) {
            this();
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23395a(C84882b bVar, float f, float f2) {
            float d = f2 - ((float) C33398a.f79357a.mo59453d());
            if (!FTCInfoStickerEditView.this.f120314h) {
                return false;
            }
            if (FTCInfoStickerEditView.this.f120318m.f120335a == null) {
                FTCInfoStickerEditView.this.mo87952a(f, d);
            }
            if (FTCInfoStickerEditView.this.f120318m.f120335a == null) {
                return false;
            }
            if (FTCInfoStickerEditView.this.f120318m.f120336b == 0) {
                FTCInfoStickerEditView fTCInfoStickerEditView = FTCInfoStickerEditView.this;
                fTCInfoStickerEditView.f120331z = fTCInfoStickerEditView.f120295A;
                FTCInfoStickerEditView.this.f120313g.mo88006b();
                FTCInfoStickerEditView.this.f120298D.mo77176b();
                FTCInfoStickerEditView.this.f120313g.mo88012d(FTCInfoStickerEditView.this.f120318m.f120335a);
                FTCInfoStickerEditView.this.f120318m.f120335a.f120152c = false;
                FTCInfoStickerEditView.this.f120313g.mo88001a(FTCInfoStickerEditView.this.f120318m.f120335a);
            }
            FTCInfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23392a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!FTCInfoStickerEditView.this.f120314h) {
                return false;
            }
            if (FTCInfoStickerEditView.this.f120320o) {
                FTCInfoStickerEditView.this.f120320o = false;
                return true;
            } else if (FTCInfoStickerEditView.this.f120318m.f120335a != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23401b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (FTCInfoStickerEditView.this.f120314h && FTCInfoStickerEditView.this.f120318m.f120335a != null) {
                return true;
            }
            return false;
        }
    }

    public void setStickerDataChangeListener(AbstractC71033a aVar) {
        this.f120313g.f120402e = aVar;
    }

    /* renamed from: a */
    public final void mo87955a(boolean z) {
        if (z) {
            this.f120313g.mo88011d();
        } else {
            this.f120313g.mo88009c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87953a(C52154a aVar) {
        try {
            float[] h = this.f120311e.mo56364h(aVar.f120151b.getId());
            float f = -this.f120311e.mo56380p(aVar.f120151b.getId());
            float o = this.f120311e.mo56378o(aVar.f120151b.getId());
            if (o > 0.0f) {
                aVar.f120151b.scale = o;
                aVar.mo87877b(o / aVar.f120160k);
            }
            aVar.f120151b.rotateAngle = f;
            aVar.mo87875a(f - aVar.f120151b.rotateAngle);
            RectF rectF = aVar.f120154e;
            float f2 = ((((h[2] - h[0]) / 2.0f) + h[0]) * ((float) this.f120309c)) + ((float) this.f120307a);
            float f3 = ((((h[1] - h[3]) / 2.0f) + h[3]) * ((float) this.f120310d)) + ((float) this.f120308b);
            float centerX = f2 - rectF.centerX();
            float centerY = f3 - rectF.centerY();
            aVar.mo87876a(centerX, centerY);
            aVar.f120151b.currentOffsetX += centerX / ((float) this.f120309c);
            aVar.f120151b.currentOffsetY += centerY / ((float) this.f120310d);
            this.f120311e.mo56254a(aVar.f120151b.getId(), aVar.f120151b.currentOffsetX, aVar.f120151b.currentOffsetY);
        } catch (C85615x e) {
            C40970e.m82487a((Throwable) new RuntimeException("restorePinStickerPositionImpl: ", e));
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(12036);
        super.onDraw(canvas);
        for (C52154a aVar : this.f120313g.f120398a) {
            aVar.f120158i = this.f120328w;
            if (aVar.f120155f != null) {
                int d = C33398a.f79357a.mo59453d();
                float f = (float) d;
                aVar.f120155f.top += f;
                aVar.f120155f.bottom += f;
                if (aVar.f120152c) {
                    canvas.save();
                    canvas.rotate(aVar.f120151b.rotateAngle, aVar.f120155f.centerX(), aVar.f120155f.centerY());
                    canvas.drawRect(aVar.f120155f, aVar.f120153d);
                    canvas.restore();
                    aVar.f120157h = System.currentTimeMillis();
                }
                float width = aVar.f120154e.width() / 2.0f;
                float height = aVar.f120154e.height() / 2.0f;
                float centerX = aVar.f120154e.centerX();
                float centerY = aVar.f120154e.centerY();
                float f2 = centerX - width;
                float f3 = centerY - height;
                aVar.f120159j[0].set(f2, f3);
                float f4 = centerX + width;
                aVar.f120159j[1].set(f4, f3);
                float f5 = centerY + height;
                aVar.f120159j[2].set(f4, f5);
                aVar.f120159j[3].set(f2, f5);
                aVar.f120155f.top -= f;
                aVar.f120155f.bottom -= f;
            }
        }
        MethodCollector.m26664o(12036);
    }

    public void setShowHelpBox(boolean z) {
        RectF rectF;
        Runnable runnable;
        SafeHandler safeHandler;
        this.f120295A = z;
        C52230c cVar = this.f120318m;
        if (!(cVar == null || cVar.f120335a == null)) {
            this.f120318m.f120335a.f120152c = z;
        }
        Runnable runnable2 = this.f120303I;
        if (!(runnable2 == null || (safeHandler = this.f120312f) == null)) {
            safeHandler.removeCallbacks(runnable2);
        }
        if (z) {
            SafeHandler safeHandler2 = this.f120312f;
            if (!(safeHandler2 == null || (runnable = this.f120303I) == null)) {
                safeHandler2.postDelayed(runnable, 3000);
            }
            AbstractC71049b bVar = this.f120305K;
            if (bVar != null && !bVar.mo88019a() && !this.f120305K.mo88021b()) {
                int d = C33398a.f79357a.mo59453d();
                C52230c cVar2 = this.f120318m;
                if (cVar2 == null || cVar2.f120335a == null || this.f120318m.f120335a.f120155f == null) {
                    rectF = new RectF();
                } else {
                    rectF = new RectF(this.f120318m.f120335a.f120155f);
                    float f = (float) d;
                    rectF.top += f;
                    rectF.bottom += f;
                }
                this.f120298D.mo77174a(rectF, (int) this.f120299E.x, (int) this.f120299E.y, this.f120318m.f120335a.f120151b.rotateAngle, false);
            }
        } else {
            this.f120298D.mo77176b();
        }
        invalidate();
    }

    public FTCInfoStickerEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11890);
        MethodCollector.m26664o(11890);
    }

    /* renamed from: a */
    public final void mo87952a(float f, float f2) {
        if (!C13617h.m24465a(this.f120313g.f120398a)) {
            int k = this.f120311e.mo56370k();
            for (C52154a aVar : this.f120313g.f120398a) {
                if (this.f120313g.mo88005a(aVar, k) && !this.f120313g.mo88013e(aVar) && mo87956a(aVar, f, f2)) {
                    if (this.f120318m.f120335a == null || C52263h.m97093a(aVar, this.f120318m.f120335a) > 0) {
                        this.f120318m.f120335a = aVar;
                        this.f120318m.f120336b = 0;
                        this.f120318m.f120337c = aVar.f120152c;
                    }
                }
            }
            this.f120313g.mo88010c(this.f120318m.f120335a);
            C52230c cVar = this.f120318m;
            if (!(cVar == null || cVar.f120335a == null)) {
                this.f120302H = mo87960e();
            }
        }
    }

    /* renamed from: a */
    public final void mo87954a(C52154a aVar, int i, int i2) {
        this.f120313g.mo88004a(aVar, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo87956a(C52154a aVar, float f, float f2) {
        if (aVar == null || aVar.f120155f == null) {
            return false;
        }
        if (this.f120304J == null) {
            this.f120304J = new Point(0, 0);
        }
        this.f120304J.set((int) f, (int) f2);
        C84908o.m145917a(this.f120304J, aVar.f120155f.centerX(), aVar.f120155f.centerY(), -aVar.f120151b.rotateAngle);
        return aVar.f120155f.contains((float) this.f120304J.x, (float) this.f120304J.y);
    }
}
