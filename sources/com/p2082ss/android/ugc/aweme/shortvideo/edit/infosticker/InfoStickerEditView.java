package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

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
import android.view.ViewTreeObserver;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45896b;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.C45856a;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3811d.C70985a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3859a.C72840c;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78485b;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84908o;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import com.p2082ss.android.vesdk.C85615x;
import com.p2082ss.android.vesdk.VESize;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView */
public class InfoStickerEditView extends View {

    /* renamed from: N */
    private static int f158972N = 3000;

    /* renamed from: m */
    public static int f158973m = 1;

    /* renamed from: A */
    public boolean f158974A;

    /* renamed from: B */
    public boolean f158975B;

    /* renamed from: C */
    public Context f158976C;

    /* renamed from: D */
    public C71031b f158977D;

    /* renamed from: E */
    public C72840c f158978E = new C72840c(this, new C71030a(this, (byte) 0));

    /* renamed from: F */
    public PointF f158979F = new PointF();

    /* renamed from: G */
    public InfoStickerViewModel f158980G;

    /* renamed from: H */
    public C70985a f158981H;

    /* renamed from: I */
    public boolean f158982I = false;

    /* renamed from: J */
    public C45896b f158983J;

    /* renamed from: K */
    public boolean f158984K = true;

    /* renamed from: L */
    public boolean f158985L = false;

    /* renamed from: M */
    Runnable f158986M = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.RunnableC710292 */

        static {
            Covode.recordClassIndex(83526);
        }

        public final void run() {
            if (InfoStickerEditView.this.f158998g != null && InfoStickerEditView.this.f159004n != null && InfoStickerEditView.this.f159004n.f159024a != null && InfoStickerEditView.this.f159004n.f159024a.f159055d) {
                InfoStickerEditView.this.f158975B = false;
                InfoStickerEditView.this.f159004n.f159024a.f159055d = false;
                InfoStickerEditView.this.f158998g.mo112231b();
                InfoStickerEditView.this.f158978E.mo77176b();
                InfoStickerEditView.this.invalidate();
            }
        }
    };

    /* renamed from: O */
    private Point f158987O;

    /* renamed from: P */
    private AbstractC71049b f158988P;

    /* renamed from: Q */
    private C71056i.AbstractC71062b f158989Q;

    /* renamed from: R */
    private EditInfoStickerViewModel f158990R;

    /* renamed from: S */
    private AbstractC45857b f158991S = C45856a.f106824a;

    /* renamed from: a */
    public int f158992a;

    /* renamed from: b */
    public int f158993b;

    /* renamed from: c */
    public int f158994c;

    /* renamed from: d */
    public int f158995d;

    /* renamed from: e */
    public AbstractC31071f f158996e;

    /* renamed from: f */
    public SafeHandler f158997f;

    /* renamed from: g */
    public C71050c f158998g;

    /* renamed from: h */
    public VideoPublishEditModel f158999h;

    /* renamed from: i */
    public boolean f159000i = true;

    /* renamed from: j */
    AbstractC78485b<C71044aj> f159001j;

    /* renamed from: k */
    AbstractC78485b<C71044aj> f159002k;

    /* renamed from: l */
    public int f159003l;

    /* renamed from: n */
    public C71032c f159004n = new C71032c();

    /* renamed from: o */
    public int f159005o;

    /* renamed from: p */
    public boolean f159006p;

    /* renamed from: q */
    public long f159007q;

    /* renamed from: r */
    public boolean f159008r;

    /* renamed from: s */
    public float f159009s;

    /* renamed from: t */
    public float f159010t;

    /* renamed from: u */
    public float f159011u;

    /* renamed from: v */
    public float f159012v;

    /* renamed from: w */
    public C71056i.AbstractC71063c f159013w;

    /* renamed from: x */
    public boolean f159014x = true;

    /* renamed from: y */
    public boolean f159015y = true;

    /* renamed from: z */
    public boolean f159016z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c */
    public static class C71032c {

        /* renamed from: a */
        C71044aj f159024a;

        /* renamed from: b */
        int f159025b;

        /* renamed from: c */
        boolean f159026c;

        static {
            Covode.recordClassIndex(83529);
        }

        C71032c() {
        }
    }

    public C71031b getGestureListener() {
        return this.f158977D;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$a */
    class C71030a implements AbstractC45840k {
        static {
            Covode.recordClassIndex(83527);
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
            InfoStickerEditView.this.mo112172d();
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: a */
        public final void mo77191a() {
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            if (infoStickerEditView.f159004n.f159024a == null) {
                infoStickerEditView.setShowHelpBox(false);
            } else if (infoStickerEditView.f159014x) {
                infoStickerEditView.f159005o = 1;
                C71050c cVar = infoStickerEditView.f158998g;
                infoStickerEditView.f159004n.f159024a.f159055d = false;
                cVar.mo112231b();
                infoStickerEditView.f158998g.mo112234c();
                if (infoStickerEditView.f159001j != null) {
                    infoStickerEditView.f159001j.mo88033a(infoStickerEditView.f159004n.f159024a);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45840k
        /* renamed from: c */
        public final void mo77193c() {
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            if (infoStickerEditView.f159004n.f159024a == null) {
                infoStickerEditView.setShowHelpBox(false);
                return;
            }
            infoStickerEditView.f159005o = 1;
            infoStickerEditView.f159004n.f159024a.f159055d = false;
            infoStickerEditView.f158998g.mo112234c();
            if (infoStickerEditView.f159002k != null) {
                infoStickerEditView.f159002k.mo88033a(infoStickerEditView.f159004n.f159024a);
            }
            C80322d.m139251a("prop_pin", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", infoStickerEditView.f158999h.mShootWay).mo129406a("creation_id", infoStickerEditView.f158999h.creationId).mo129406a("content_type", infoStickerEditView.f158999h.getAvetParameter().getContentType()).mo129406a("content_source", infoStickerEditView.f158999h.getAvetParameter().getContentSource()).mo129406a("prop_id", infoStickerEditView.f159004n.f159024a.f159054c.stickerId).mo129403a("is_diy_prop", infoStickerEditView.f159004n.f159024a.f159064m ? 1 : 0).f188764a);
        }

        private C71030a() {
        }

        /* synthetic */ C71030a(InfoStickerEditView infoStickerEditView, byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(83524);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo112170b() {
        this.f158998g.mo112236d();
        invalidate();
    }

    /* renamed from: f */
    public final void mo112174f() {
        this.f158997f.postDelayed(new RunnableC71054g(this), 300);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f158978E.mo77180f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f158978E.mo77181g();
    }

    /* renamed from: c */
    public final void mo112171c() {
        this.f158975B = false;
        for (C71044aj ajVar : this.f158998g.f159073a) {
            ajVar.f159055d = false;
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C45896b mo112175g() {
        StickerItemModel stickerItemModel = this.f159004n.f159024a.f159054c;
        return new C45896b(stickerItemModel.rotateAngle, stickerItemModel.scale, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
    }

    public int getStickNumber() {
        Iterator<C71044aj> it = this.f158998g.f159073a.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }

    /* renamed from: e */
    public final boolean mo112173e() {
        if (this.f159005o == 1) {
            return true;
        }
        C71032c cVar = this.f159004n;
        if (cVar == null || cVar.f159024a == null) {
            return false;
        }
        if (this.f159004n.f159026c) {
            this.f159004n.f159024a.f159054c.getId();
            this.f158998g.mo112237d(this.f159004n.f159024a);
            invalidate();
            return false;
        }
        this.f158998g.mo112232b(this.f159004n.f159024a);
        return false;
    }

    /* renamed from: a */
    public final void mo112163a() {
        AbstractC31071f fVar;
        int e;
        if ((this.f158994c == 0 || this.f158995d == 0) && (fVar = this.f158996e) != null) {
            VESize b = fVar.mo56330b();
            this.f158994c = b.width;
            this.f158995d = b.height;
            int b2 = C70636dh.m124831b(getContext());
            int i = this.f158994c;
            this.f158992a = (b2 - i) >> 1;
            if (C70635dg.m124827a(i, this.f158995d)) {
                e = 0;
            } else {
                e = (((C70636dh.m124836e(getContext()) - C33398a.f79357a.mo59455f()) - C33398a.f79357a.mo59453d()) - this.f158995d) / 2;
            }
            this.f158993b = e;
        }
    }

    /* renamed from: d */
    public final void mo112172d() {
        if (!this.f158991S.mo77208a()) {
            setShowHelpBox(true);
            this.f159005o = 1;
            C71050c cVar = this.f158998g;
            C71044aj ajVar = this.f159004n.f159024a;
            if (cVar.f159079g != null) {
                cVar.f159079g.mo77270a();
            }
            if (cVar.f159074b != ajVar) {
                cVar.mo112231b();
                cVar.f159074b = ajVar;
            }
            cVar.f159074b.f159055d = true;
            cVar.f159074b.f159054c.getId();
            cVar.f159077e.mo56255a(cVar.f159074b.f159054c.getId(), 0, cVar.f159075c);
            if (this.f158990R == null) {
                this.f158990R = (EditInfoStickerViewModel) C20531t.m38716a((ActivityC0945e) this.f158976C).mo33800a(EditInfoStickerViewModel.class);
            }
            EditInfoStickerViewModel editInfoStickerViewModel = this.f158990R;
            StickerItemModel stickerItemModel = this.f159004n.f159024a.f159054c;
            C89219l.m154721d(stickerItemModel, "");
            editInfoStickerViewModel.mo33689c(new EditInfoStickerViewModel.C82832b(stickerItemModel));
        }
    }

    public void setHavePinEdit(boolean z) {
        this.f159015y = z;
    }

    public void setHaveTimeEdit(boolean z) {
        this.f159014x = z;
    }

    public void setITimeEditListener(AbstractC71049b bVar) {
        this.f158988P = bVar;
    }

    public void setMotionInterceptor(AbstractC45857b bVar) {
        this.f158991S = bVar;
    }

    public void setOnInfoStickerPinEditClick(AbstractC78485b<C71044aj> bVar) {
        this.f159002k = bVar;
    }

    public void setOnInfoStickerTimeEdit(AbstractC78485b<C71044aj> bVar) {
        this.f159001j = bVar;
    }

    public void setPinHelper(C70985a aVar) {
        this.f158981H = aVar;
    }

    public void setStickerOnMoveListener(C71056i.AbstractC71063c cVar) {
        this.f159013w = cVar;
    }

    public void setStickerOnPlayListener(C71056i.AbstractC71062b bVar) {
        this.f158989Q = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$b */
    public class C71031b extends AbstractC14537a {
        static {
            Covode.recordClassIndex(83528);
        }

        private C71031b() {
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: c */
        public final boolean mo23403c(float f) {
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            InfoStickerEditView.this.mo112174f();
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final void mo23397b(C84882b bVar) {
            if (InfoStickerEditView.this.f159000i) {
                InfoStickerEditView.this.f159013w.mo112262a(InfoStickerEditView.this.f159004n.f159024a, true, false);
                System.currentTimeMillis();
                InfoStickerEditView.this.mo112174f();
            }
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23399b(float f) {
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            InfoStickerEditView.this.mo112174f();
            InfoStickerEditView.this.f159013w.mo112262a(InfoStickerEditView.this.f159004n.f159024a, true, true);
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23390a(float f) {
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            if (InfoStickerEditView.this.f159004n.f159024a == null) {
                return super.mo23390a(f);
            }
            InfoStickerEditView.this.f159005o = 2;
            float degrees = (float) Math.toDegrees((double) f);
            if (Math.abs(degrees) > 10.0f) {
                degrees = 0.0f;
            }
            if (4 == InfoStickerEditView.this.f159013w.mo112262a(InfoStickerEditView.this.f159004n.f159024a, false, true)) {
                degrees = InfoStickerEditView.this.f159013w.mo112264a(degrees).floatValue();
            }
            InfoStickerEditView.this.f158998g.mo112227a(InfoStickerEditView.this.f159004n.f159024a, -degrees);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: c */
        public final boolean mo23404c(MotionEvent motionEvent) {
            if (!InfoStickerEditView.this.f159008r) {
                if (InfoStickerEditView.this.f158998g != null) {
                    float y = motionEvent.getY() - ((float) C33398a.f79357a.mo59453d());
                    C71050c cVar = InfoStickerEditView.this.f158998g;
                    int x = (int) motionEvent.getX();
                    int i = (int) y;
                    if (!(cVar.f159073a == null || cVar.f159073a.size() == 0)) {
                        for (C71044aj ajVar : cVar.f159073a) {
                            if (ajVar.f159058g.contains((float) x, (float) i)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } else if (!InfoStickerEditView.this.f158975B) {
                return false;
            } else {
                InfoStickerEditView.this.f158975B = false;
                return true;
            }
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23393a(ScaleGestureDetector scaleGestureDetector) {
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            scaleGestureDetector.getScaleFactor();
            if (InfoStickerEditView.this.f159004n.f159024a == null) {
                return super.mo23393a(scaleGestureDetector);
            }
            InfoStickerEditView.this.f159005o = 2;
            InfoStickerEditView.this.f158998g.mo112233b(InfoStickerEditView.this.f159004n.f159024a, scaleGestureDetector.getScaleFactor());
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23402b(ScaleGestureDetector scaleGestureDetector) {
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            scaleGestureDetector.getScaleFactor();
            scaleGestureDetector.getFocusX();
            scaleGestureDetector.getFocusY();
            InfoStickerEditView.this.mo112164a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            if (InfoStickerEditView.this.f159004n.f159024a == null) {
                return false;
            }
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            infoStickerEditView.f158974A = infoStickerEditView.f158975B;
            InfoStickerEditView.this.f158998g.mo112231b();
            InfoStickerEditView.this.f158998g.mo112237d(InfoStickerEditView.this.f159004n.f159024a);
            InfoStickerEditView.this.f159004n.f159024a.f159055d = false;
            InfoStickerEditView.this.f158998g.mo112226a(InfoStickerEditView.this.f159004n.f159024a);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: f */
        public final boolean mo23406f(MotionEvent motionEvent) {
            boolean z = false;
            InfoStickerEditView.this.f158982I = false;
            InfoStickerEditView.this.f158979F.set(motionEvent.getRawX(), motionEvent.getRawY());
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            if (!(InfoStickerEditView.this.f159013w == null || InfoStickerEditView.this.f159004n.f159024a == null || InfoStickerEditView.this.f159004n.f159025b != 0)) {
                InfoStickerEditView.this.f159013w.mo112265a(InfoStickerEditView.this.f159004n.f159024a, (int) InfoStickerEditView.this.f159009s, (int) InfoStickerEditView.this.f159010t, true, false);
                if ((InfoStickerEditView.this.f159004n.f159024a == null || InfoStickerEditView.this.f159004n.f159024a != null) && InfoStickerEditView.this.f158974A) {
                    InfoStickerEditView.this.f158974A = false;
                }
            }
            if (System.currentTimeMillis() - InfoStickerEditView.this.f159007q < 200) {
                if (InfoStickerEditView.this.f159004n.f159024a == null) {
                    InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
                    C71050c cVar = infoStickerEditView.f158998g;
                    if (cVar.f159074b != null) {
                        z = true;
                    }
                    cVar.mo112231b();
                    infoStickerEditView.f159008r = z;
                    InfoStickerEditView.this.f158978E.mo77176b();
                    InfoStickerEditView.this.invalidate();
                } else {
                    InfoStickerEditView.this.f159008r = false;
                    if (InfoStickerEditView.this.f159004n.f159025b == 0) {
                        InfoStickerEditView.this.mo112172d();
                    }
                    InfoStickerEditView.this.f158998g.mo112224a();
                    InfoStickerEditView.this.mo112174f();
                    InfoStickerEditView.this.invalidate();
                }
                if (!InfoStickerEditView.this.f158975B) {
                    InfoStickerEditView.this.mo112173e();
                    if (!(InfoStickerEditView.this.f159004n == null || InfoStickerEditView.this.f159004n.f159024a == null)) {
                        InfoStickerEditView.this.f159004n.f159024a = null;
                    }
                }
                return true;
            }
            if (!InfoStickerEditView.this.f158975B) {
                InfoStickerEditView.this.mo112173e();
                if (!(InfoStickerEditView.this.f159004n == null || InfoStickerEditView.this.f159004n.f159024a == null)) {
                    InfoStickerEditView.this.f159004n.f159024a = null;
                }
            }
            return super.mo23406f(motionEvent);
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23394a(C84882b bVar) {
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            float f = bVar.f189709i.x;
            float f2 = bVar.f189709i.y;
            float f3 = InfoStickerEditView.this.f159009s + f;
            float f4 = InfoStickerEditView.this.f159010t + f2;
            float abs = Math.abs(f3 - InfoStickerEditView.this.f159011u);
            float abs2 = Math.abs(f4 - InfoStickerEditView.this.f159012v);
            if (InfoStickerEditView.this.f159004n.f159024a == null) {
                return false;
            }
            if (abs < 5.0f && abs2 < 5.0f) {
                return true;
            }
            int a = InfoStickerEditView.this.f159013w.mo112262a(InfoStickerEditView.this.f159004n.f159024a, false, false);
            if (3 == a) {
                PointF a2 = InfoStickerEditView.this.f159013w.mo112263a(InfoStickerEditView.this.f159004n.f159024a, f, f2);
                f = a2.x;
                f2 = a2.y;
                f3 = InfoStickerEditView.this.f159009s + a2.x;
                f4 = InfoStickerEditView.this.f159010t + a2.y;
            } else if (4 == a) {
                new C71055h(this);
            }
            if (InfoStickerEditView.this.f159004n.f159025b == 0) {
                if (InfoStickerEditView.this.f159013w != null) {
                    if (InfoStickerEditView.this.f159004n.f159024a.f159055d) {
                        InfoStickerEditView.this.f158974A = true;
                    }
                    InfoStickerEditView.this.f159013w.mo112265a(InfoStickerEditView.this.f159004n.f159024a, (int) f3, (int) f4, false, false);
                }
                InfoStickerEditView.this.f159009s = f3;
                InfoStickerEditView.this.f159010t = f4;
            }
            InfoStickerEditView.this.f159005o = 2;
            if (InfoStickerEditView.this.f159004n.f159025b == 0) {
                InfoStickerEditView.this.f158998g.mo112228a(InfoStickerEditView.this.f159004n.f159024a, f, f2);
            }
            InfoStickerEditView.this.f158998g.mo112224a();
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23400b(MotionEvent motionEvent) {
            boolean z;
            InfoStickerEditView.this.f159006p = false;
            float y = motionEvent.getY() - ((float) C33398a.f79357a.mo59453d());
            InfoStickerEditView.this.f159009s = motionEvent.getX();
            InfoStickerEditView.this.f159010t = y;
            InfoStickerEditView.this.f159011u = motionEvent.getX();
            InfoStickerEditView.this.f159012v = y;
            InfoStickerEditView.this.f159007q = System.currentTimeMillis();
            InfoStickerEditView.this.f159005o = -1;
            InfoStickerEditView.this.f159004n.f159024a = null;
            if (InfoStickerEditView.this.f159000i) {
                InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
                float x = motionEvent.getX();
                if (C13617h.m24465a(infoStickerEditView.f158998g.f159073a)) {
                    infoStickerEditView.f158985L = false;
                } else {
                    for (C71044aj ajVar : infoStickerEditView.f158998g.f159073a) {
                        if (ajVar.f159054c.isPin) {
                            infoStickerEditView.mo112166a(ajVar);
                        }
                    }
                    int k = infoStickerEditView.f158996e.mo56370k();
                    for (C71044aj ajVar2 : infoStickerEditView.f158998g.f159073a) {
                        if (infoStickerEditView.f158998g.mo112230a(ajVar2, k) && !infoStickerEditView.f158998g.mo112238e(ajVar2) && infoStickerEditView.mo112169a(ajVar2, x, y)) {
                            if (infoStickerEditView.f159004n.f159024a == null || C71050c.m125460a(ajVar2, infoStickerEditView.f159004n.f159024a) > 0) {
                                infoStickerEditView.f159004n.f159024a = ajVar2;
                                infoStickerEditView.f159004n.f159025b = 0;
                                infoStickerEditView.f159004n.f159026c = ajVar2.f159055d;
                            }
                        }
                    }
                    if (!(infoStickerEditView.f159004n.f159024a == null || infoStickerEditView.f158981H == null)) {
                        if (infoStickerEditView.f159004n.f159024a.f159054c.isPin) {
                            infoStickerEditView.f158981H.mo112115a(infoStickerEditView.f159004n.f159024a);
                            infoStickerEditView.mo112166a(infoStickerEditView.f159004n.f159024a);
                            infoStickerEditView.f159004n.f159024a.f159054c.setPin(false);
                            C80720e.m139931c(infoStickerEditView.f159004n.f159024a.f159054c.pinAlgorithmFile);
                            infoStickerEditView.f159004n.f159024a.f159054c.setPinAlgorithmFile(null);
                        } else if (!TextUtils.isEmpty(infoStickerEditView.f159004n.f159024a.f159054c.pinAlgorithmFile) && C80720e.m139927b(infoStickerEditView.f159004n.f159024a.f159054c.pinAlgorithmFile)) {
                            C80720e.m139931c(infoStickerEditView.f159004n.f159024a.f159054c.pinAlgorithmFile);
                            infoStickerEditView.f159004n.f159024a.f159054c.setPinAlgorithmFile(null);
                        }
                    }
                    infoStickerEditView.f158998g.mo112235c(infoStickerEditView.f159004n.f159024a);
                    if (infoStickerEditView.f159004n == null || infoStickerEditView.f159004n.f159024a == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    infoStickerEditView.f158985L = z;
                    if (infoStickerEditView.f158985L) {
                        infoStickerEditView.f158983J = infoStickerEditView.mo112175g();
                    }
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23396a(C84885c cVar) {
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            InfoStickerEditView.this.mo112164a(cVar.f189714i, cVar.f189715j);
            if (InfoStickerEditView.this.f159004n.f159024a == null) {
                return super.mo23396a(cVar);
            }
            InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
            infoStickerEditView.f158974A = infoStickerEditView.f158975B;
            InfoStickerEditView.this.f158998g.mo112231b();
            InfoStickerEditView.this.f158998g.mo112237d(InfoStickerEditView.this.f159004n.f159024a);
            InfoStickerEditView.this.f159004n.f159024a.f159055d = false;
            InfoStickerEditView.this.f158998g.mo112226a(InfoStickerEditView.this.f159004n.f159024a);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        public /* synthetic */ C71031b(InfoStickerEditView infoStickerEditView, byte b) {
            this();
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23395a(C84882b bVar, float f, float f2) {
            float d = f2 - ((float) C33398a.f79357a.mo59453d());
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            if (InfoStickerEditView.this.f159004n.f159024a == null) {
                InfoStickerEditView.this.mo112164a(f, d);
            }
            if (InfoStickerEditView.this.f159004n.f159024a == null) {
                return false;
            }
            if (InfoStickerEditView.this.f159004n.f159025b == 0) {
                InfoStickerEditView infoStickerEditView = InfoStickerEditView.this;
                infoStickerEditView.f158974A = infoStickerEditView.f158975B;
                InfoStickerEditView.this.f158998g.mo112231b();
                InfoStickerEditView.this.f158978E.mo77176b();
                InfoStickerEditView.this.f158998g.mo112237d(InfoStickerEditView.this.f159004n.f159024a);
                InfoStickerEditView.this.f159004n.f159024a.f159055d = false;
                InfoStickerEditView.this.f158998g.mo112226a(InfoStickerEditView.this.f159004n.f159024a);
            }
            InfoStickerEditView.this.invalidate();
            return true;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23392a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!InfoStickerEditView.this.f159000i) {
                return false;
            }
            if (InfoStickerEditView.this.f159006p) {
                InfoStickerEditView.this.f159006p = false;
                return true;
            } else if (InfoStickerEditView.this.f159004n.f159024a != null || InfoStickerEditView.this.f158985L) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23401b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (InfoStickerEditView.this.f159000i && InfoStickerEditView.this.f159004n.f159024a != null) {
                return true;
            }
            return false;
        }
    }

    public void setStickerDataChangeListener(AbstractC71033a aVar) {
        this.f158998g.f159078f = aVar;
    }

    /* renamed from: a */
    public final void mo112168a(boolean z) {
        if (z) {
            this.f158998g.mo112236d();
        } else {
            this.f158998g.mo112234c();
        }
    }

    public void setStickerHintEnable(boolean z) {
        this.f158984K = z;
        C71050c cVar = this.f158998g;
        if (cVar != null) {
            cVar.f159081i = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(10448);
        super.onDraw(canvas);
        for (C71044aj ajVar : this.f158998g.f159073a) {
            ajVar.f159061j = this.f159014x;
            if (ajVar.f159058g != null) {
                int d = C33398a.f79357a.mo59453d();
                float f = (float) d;
                ajVar.f159058g.top += f;
                ajVar.f159058g.bottom += f;
                if (ajVar.f159055d) {
                    canvas.save();
                    canvas.rotate(ajVar.f159054c.rotateAngle, ajVar.f159058g.centerX(), ajVar.f159058g.centerY());
                    canvas.drawRect(ajVar.f159058g, ajVar.f159056e);
                    canvas.restore();
                    ajVar.f159060i = System.currentTimeMillis();
                }
                float width = ajVar.f159057f.width() / 2.0f;
                float height = ajVar.f159057f.height() / 2.0f;
                float centerX = ajVar.f159057f.centerX();
                float centerY = ajVar.f159057f.centerY();
                float f2 = centerX - width;
                float f3 = centerY - height;
                ajVar.f159062k[0].set(f2, f3);
                float f4 = centerX + width;
                ajVar.f159062k[1].set(f4, f3);
                float f5 = centerY + height;
                ajVar.f159062k[2].set(f4, f5);
                ajVar.f159062k[3].set(f2, f5);
                ajVar.f159058g.top -= f;
                ajVar.f159058g.bottom -= f;
            }
        }
        MethodCollector.m26664o(10448);
    }

    public void setShowHelpBox(boolean z) {
        RectF rectF;
        SafeHandler safeHandler;
        this.f158975B = z;
        C71032c cVar = this.f159004n;
        if (!(cVar == null || cVar.f159024a == null)) {
            this.f159004n.f159024a.f159055d = z;
        }
        Runnable runnable = this.f158986M;
        if (!(runnable == null || (safeHandler = this.f158997f) == null)) {
            safeHandler.removeCallbacks(runnable);
        }
        if (z) {
            SafeHandler safeHandler2 = this.f158997f;
            if (safeHandler2 != null) {
                safeHandler2.postDelayed(this.f158986M, (long) f158972N);
            }
            AbstractC71049b bVar = this.f158988P;
            if (bVar != null && !bVar.mo88019a() && !this.f158988P.mo88021b()) {
                int d = C33398a.f79357a.mo59453d();
                C71032c cVar2 = this.f159004n;
                if (cVar2 == null || cVar2.f159024a == null || this.f159004n.f159024a.f159058g == null) {
                    rectF = new RectF();
                } else {
                    rectF = new RectF(this.f159004n.f159024a.f159058g);
                    float f = (float) d;
                    rectF.top += f;
                    rectF.bottom += f;
                }
                this.f158978E.mo77174a(rectF, (int) this.f158979F.x, (int) this.f158979F.y, this.f159004n.f159024a.f159054c.rotateAngle, false);
                VideoPublishEditModel videoPublishEditModel = this.f158999h;
                boolean z2 = this.f159004n.f159024a.f159064m;
                C89219l.m154721d(videoPublishEditModel, "");
                C39162r.m79460a("prop_more_click", C70968bl.m125247a(videoPublishEditModel, z2, false, 4).f188764a);
            }
        } else {
            this.f158978E.mo77176b();
        }
        invalidate();
    }

    /* renamed from: a */
    public final void mo112166a(C71044aj ajVar) {
        try {
            float[] h = this.f158996e.mo56364h(ajVar.f159054c.getId());
            float f = -this.f158996e.mo56380p(ajVar.f159054c.getId());
            float o = this.f158996e.mo56378o(ajVar.f159054c.getId());
            if (o > 0.0f) {
                ajVar.f159054c.scale = o;
                ajVar.mo112211b(o / ajVar.f159063l);
            }
            ajVar.f159054c.rotateAngle = f;
            ajVar.mo112208a(f - ajVar.f159054c.rotateAngle);
            RectF rectF = ajVar.f159057f;
            float f2 = ((((h[2] - h[0]) / 2.0f) + h[0]) * ((float) this.f158994c)) + ((float) this.f158992a);
            float f3 = ((((h[1] - h[3]) / 2.0f) + h[3]) * ((float) this.f158995d)) + ((float) this.f158993b);
            float centerX = f2 - rectF.centerX();
            float centerY = f3 - rectF.centerY();
            ajVar.mo112209a(centerX, centerY);
            ajVar.f159054c.currentOffsetX += centerX / ((float) this.f158994c);
            ajVar.f159054c.currentOffsetY += centerY / ((float) this.f158995d);
            this.f158996e.mo56254a(ajVar.f159054c.getId(), ajVar.f159054c.currentOffsetX, ajVar.f159054c.currentOffsetY);
        } catch (C85615x e) {
            C40970e.m82487a((Throwable) new RuntimeException("restorePinStickerPositionImpl: ", e));
        }
    }

    /* renamed from: a */
    public final void mo112165a(final InfoStickerModel infoStickerModel, final boolean z) {
        if (this.f158994c == 0 || this.f158995d == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.ViewTreeObserver$OnGlobalLayoutListenerC710281 */

                /* renamed from: a */
                boolean f159017a;

                static {
                    Covode.recordClassIndex(83525);
                }

                public final void onGlobalLayout() {
                    InfoStickerEditView.this.mo112163a();
                    if (InfoStickerEditView.this.f158994c > 0 && InfoStickerEditView.this.f158995d > 0 && !this.f159017a) {
                        InfoStickerEditView.this.f158998g.mo112225a(infoStickerModel, z);
                        this.f159017a = true;
                        InfoStickerEditView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
        } else {
            this.f158998g.mo112225a(infoStickerModel, z);
        }
    }

    public InfoStickerEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10116);
        MethodCollector.m26664o(10116);
    }

    /* renamed from: a */
    public final void mo112164a(float f, float f2) {
        if (!C13617h.m24465a(this.f158998g.f159073a)) {
            int k = this.f158996e.mo56370k();
            for (C71044aj ajVar : this.f158998g.f159073a) {
                if (this.f158998g.mo112230a(ajVar, k) && !this.f158998g.mo112238e(ajVar) && mo112169a(ajVar, f, f2)) {
                    if (this.f159004n.f159024a == null || C71050c.m125460a(ajVar, this.f159004n.f159024a) > 0) {
                        this.f159004n.f159024a = ajVar;
                        this.f159004n.f159025b = 0;
                        this.f159004n.f159026c = ajVar.f159055d;
                    }
                }
            }
            this.f158998g.mo112235c(this.f159004n.f159024a);
            C71032c cVar = this.f159004n;
            if (!(cVar == null || cVar.f159024a == null)) {
                this.f158983J = mo112175g();
            }
        }
    }

    /* renamed from: a */
    public final void mo112167a(C71044aj ajVar, int i, int i2) {
        this.f158998g.mo112229a(ajVar, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo112169a(C71044aj ajVar, float f, float f2) {
        if (ajVar == null || ajVar.f159058g == null) {
            return false;
        }
        if (this.f158987O == null) {
            this.f158987O = new Point(0, 0);
        }
        this.f158987O.set((int) f, (int) f2);
        C84908o.m145917a(this.f158987O, ajVar.f159058g.centerX(), ajVar.f159058g.centerY(), -ajVar.f159054c.rotateAngle);
        return ajVar.f159058g.contains((float) this.f158987O.x, (float) this.f158987O.y);
    }
}
