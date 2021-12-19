package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45859b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45913a;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45887e;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45889g;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71513p;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3816c.AbstractC71087a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78484a;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VESize;
import dmt.p4542av.video.C88296t;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c */
public abstract class AbstractC71078c implements AbstractC45898d, AbstractC72865b {

    /* renamed from: A */
    private AbstractC45857b f159170A;

    /* renamed from: a */
    private View f159171a;

    /* renamed from: b */
    private String f159172b;

    /* renamed from: c */
    private boolean f159173c = true;

    /* renamed from: d */
    protected FrameLayout f159174d;

    /* renamed from: e */
    public boolean f159175e = true;

    /* renamed from: f */
    public AbstractC45899e f159176f;

    /* renamed from: g */
    protected Rect f159177g;

    /* renamed from: h */
    public int f159178h;

    /* renamed from: i */
    public int f159179i;

    /* renamed from: j */
    public AbstractC31071f f159180j;

    /* renamed from: k */
    protected AbstractC72510a f159181k;

    /* renamed from: l */
    public C45922g f159182l;

    /* renamed from: m */
    public List<C45922g> f159183m = new ArrayList();

    /* renamed from: n */
    public AbstractC71087a f159184n;

    /* renamed from: o */
    protected AbstractC45920e f159185o;

    /* renamed from: p */
    protected C71077b f159186p;

    /* renamed from: q */
    public VESize f159187q;

    /* renamed from: r */
    public C71080a f159188r;

    /* renamed from: s */
    public boolean f159189s = true;

    /* renamed from: t */
    public Context f159190t;

    /* renamed from: u */
    StickerHintTextViewModel f159191u;

    /* renamed from: v */
    public boolean f159192v = false;

    /* renamed from: w */
    public Runnable f159193w;

    /* renamed from: x */
    public boolean f159194x = true;

    /* renamed from: y */
    public AbstractC78484a<C45922g, C45922g> f159195y;

    /* renamed from: z */
    public EditToolbarViewModel f159196z;

    static {
        Covode.recordClassIndex(83577);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C45922g mo112275a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112308a(AbstractC45920e eVar) {
    }

    /* renamed from: b */
    public boolean mo112283b() {
        return false;
    }

    /* renamed from: e */
    public int mo112286e() {
        return 2;
    }

    /* renamed from: f */
    public abstract int mo112287f();

    /* renamed from: g */
    public boolean mo112288g() {
        return false;
    }

    /* renamed from: a */
    public boolean mo112282a(C45922g gVar) {
        if (gVar == null) {
            return false;
        }
        if (gVar.getParent() != null && gVar.getParent() != this.f159174d) {
            return false;
        }
        this.f159174d.removeView(gVar);
        this.f159182l = null;
        AbstractC71087a aVar = this.f159184n;
        if (aVar != null) {
            aVar.mo112342d();
        }
        this.f159183m.remove(gVar);
        this.f159192v = true;
        return true;
    }

    /* renamed from: a */
    public void mo112281a(boolean z, boolean z2) {
        mo112280a(z);
    }

    /* renamed from: a */
    public void mo112280a(boolean z) {
        AbstractC45857b bVar;
        if (mo112322l()) {
            AbstractC71087a aVar = this.f159184n;
            if (aVar != null) {
                aVar.mo112343e();
            }
            C45922g a = mo112275a(this.f159190t);
            this.f159182l = a;
            if (!(a == null || (bVar = this.f159170A) == null)) {
                a.setMotionInterceptor(bVar);
            }
            mo112315b(this.f159182l);
            this.f159182l.mo77340a(this.f159178h, this.f159179i);
            this.f159182l.setStickerEditListener(new AbstractC45894a() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c.C710791 */

                static {
                    Covode.recordClassIndex(83578);
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: a */
                public final void mo77260a() {
                    if (AbstractC71078c.this.f159184n != null) {
                        AbstractC71078c.this.f159184n.mo112336a();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: b */
                public final void mo77263b() {
                    if (AbstractC71078c.this.f159184n != null) {
                        AbstractC71078c.this.f159184n.mo112339b();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: c */
                public final void mo77266c() {
                    if (AbstractC71078c.this.f159184n != null) {
                        AbstractC71078c.this.f159184n.mo112337a(AbstractC71078c.this.f159182l.getDrawView());
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: d */
                public final void mo77268d() {
                    if (AbstractC71078c.this.f159184n != null) {
                        AbstractC71078c.this.f159184n.mo112341c();
                    }
                    if (C65350at.m117036a()) {
                        AbstractC71078c.this.f159196z.mo128252c(false);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: e */
                public final PointF mo77269e() {
                    if (AbstractC71078c.this.f159185o == null || AbstractC71078c.this.f159182l == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] fourAnglePoint = AbstractC71078c.this.f159182l.getFourAnglePoint();
                    for (PointF pointF : fourAnglePoint) {
                        pointF.x += 0.0f;
                        pointF.y += 0.0f;
                    }
                    return AbstractC71078c.this.f159185o.mo77315a(fourAnglePoint);
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: a */
                public final Float mo77259a(float f) {
                    if (AbstractC71078c.this.f159185o != null) {
                        return Float.valueOf(AbstractC71078c.this.f159185o.mo77312a(f));
                    }
                    return Float.valueOf(f);
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: b */
                public final boolean mo77264b(float f) {
                    if (AbstractC71078c.this.f159185o != null) {
                        return AbstractC71078c.this.f159185o.mo77319a(AbstractC71078c.this.f159182l.getFourAnglePoint(), f);
                    }
                    return true;
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: c */
                public final boolean mo77267c(float f) {
                    if (AbstractC71078c.this.f159185o != null) {
                        return AbstractC71078c.this.f159185o.mo77321b(AbstractC71078c.this.f159182l.getFourAnglePoint(), f);
                    }
                    return true;
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: a */
                public final void mo77262a(boolean z) {
                    if (AbstractC71078c.this.f159184n != null) {
                        AbstractC71078c.this.f159184n.mo112340b(z);
                        if (z) {
                            AbstractC71078c.this.mo112320j();
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: a */
                public final void mo77261a(C45922g gVar, boolean z) {
                    AbstractC71078c.this.mo112309a(gVar, z);
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: b */
                public final boolean mo77265b(float f, float f2) {
                    if (AbstractC71078c.this.f159185o != null) {
                        return AbstractC71078c.this.f159185o.mo77322b(AbstractC71078c.this.f159182l.getFourAnglePoint(), f, f2);
                    }
                    return true;
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: a */
                public final PointF mo77258a(float f, float f2) {
                    if (AbstractC71078c.this.f159185o == null || AbstractC71078c.this.f159182l == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] fourAnglePoint = AbstractC71078c.this.f159182l.getFourAnglePoint();
                    for (PointF pointF : fourAnglePoint) {
                        pointF.x += f;
                        pointF.y += f2;
                    }
                    return AbstractC71078c.this.f159185o.mo77316a(fourAnglePoint, f, f2);
                }

                @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.p2884a.AbstractC45894a
                /* renamed from: a */
                public final int mo77257a(boolean z, boolean z2, boolean z3, boolean z4) {
                    if (AbstractC71078c.this.f159185o == null) {
                        return -1;
                    }
                    if (z) {
                        AbstractC71078c.this.f159185o.mo77320b();
                        return -1;
                    } else if (AbstractC71078c.this.f159182l != null) {
                        return AbstractC71078c.this.f159185o.mo77314a(AbstractC71078c.this.f159182l.getFourAnglePoint(), z2, z3, z4, z3, z3);
                    } else {
                        return -1;
                    }
                }
            });
            this.f159183m.add(0, this.f159182l);
            if (this.f159194x && !z && this.f159191u != null && mo112287f() != 0) {
                this.f159182l.postDelayed(new RunnableC71081d(this), 500);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo112312a() {
        C45922g gVar = this.f159182l;
        if (gVar == null) {
            return false;
        }
        return gVar.mo77371n();
    }

    /* renamed from: a */
    public void mo112279a(String str) {
        this.f159172b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo77274a(android.graphics.RectF r6) {
        /*
            r5 = this;
            java.util.List<com.ss.android.ugc.aweme.editSticker.interact.view.g> r0 = r5.f159183m
            boolean r0 = com.bytedance.common.utility.C13617h.m24465a(r0)
            r4 = 0
            if (r0 == 0) goto L_0x000a
            return r4
        L_0x000a:
            java.util.List<com.ss.android.ugc.aweme.editSticker.interact.view.g> r0 = r5.f159183m
            java.util.Iterator r3 = r0.iterator()
        L_0x0010:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.editSticker.interact.view.g r0 = (com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g) r0
            android.graphics.PointF[] r0 = r0.getFourAnglePoint()
            android.graphics.RectF r2 = com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b.m88523a(r0)
            float r1 = r2.top
            float r0 = r6.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            float r1 = r2.bottom
            float r0 = r6.bottom
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
        L_0x0034:
            r0 = 1
            return r0
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c.mo77274a(android.graphics.RectF):boolean");
    }

    /* renamed from: d */
    public void mo112285d() {
        C45922g gVar = this.f159182l;
        if (gVar != null) {
            mo112282a(gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C71080a mo112318h() {
        return new C71080a();
    }

    /* renamed from: i */
    public final void mo112319i() {
        AbstractC71087a aVar = this.f159184n;
        if (aVar != null) {
            aVar.mo112336a();
        }
    }

    /* renamed from: l */
    public boolean mo112322l() {
        if (this.f159182l == null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public C71077b mo112325o() {
        return new C71077b();
    }

    /* renamed from: p */
    public String mo112326p() {
        String str = this.f159172b;
        if (str != null) {
            return str.replace("interact_sticker.png", "");
        }
        return "";
    }

    /* renamed from: q */
    private void mo112446q() {
        this.f159191u = (StickerHintTextViewModel) C1181ae.m3881a((ActivityC0945e) this.f159190t, (C1175ad.AbstractC1177b) null).mo3983a(StickerHintTextViewModel.class);
    }

    /* renamed from: m */
    public final void mo112323m() {
        StickerHintTextViewModel stickerHintTextViewModel = this.f159191u;
        if (stickerHintTextViewModel != null) {
            stickerHintTextViewModel.mo77288a().postValue(true);
        }
    }

    /* renamed from: n */
    public final void mo112324n() {
        C45922g gVar = this.f159182l;
        if (gVar != null) {
            gVar.mo77369l();
            StickerHintTextViewModel stickerHintTextViewModel = this.f159191u;
            if (stickerHintTextViewModel != null) {
                stickerHintTextViewModel.mo77288a().postValue(true);
            }
        }
    }

    /* renamed from: k */
    public final void mo112321k() {
        AbstractC31071f fVar = this.f159180j;
        if (fVar != null) {
            VESize b = fVar.mo56330b();
            if (b.width != 0 && b.height != 0) {
                int[] a = C45889g.m88533a(this.f159174d, b.width, b.height);
                this.f159178h = a[0];
                this.f159179i = a[1];
                mo112447r();
            }
        }
    }

    /* renamed from: r */
    private void mo112447r() {
        ViewGroup.LayoutParams layoutParams = this.f159174d.getLayoutParams();
        this.f159177g = new Rect(0, 0, layoutParams.width, layoutParams.height);
        C45922g gVar = this.f159182l;
        if (gVar != null) {
            gVar.mo77340a(this.f159178h, this.f159179i);
        }
        View view = this.f159171a;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            this.f159171a.setLayoutParams(layoutParams2);
        }
        AbstractC45920e eVar = this.f159185o;
        if (eVar != null) {
            this.f159174d.removeView(eVar.getContentView());
        }
        AbstractC45913a aVar = C45866d.m88490c().f106821d;
        if (aVar != null) {
            AbstractC45920e a = aVar.mo77311a(this.f159190t, this.f159178h);
            this.f159185o = a;
            mo112308a(a);
            this.f159174d.addView(this.f159185o.getContentView());
        }
    }

    /* renamed from: j */
    public final void mo112320j() {
        ViewGroup viewGroup;
        C45922g gVar;
        if (this.f159174d != null && this.f159182l != null && this.f159185o != null) {
            Runnable runnable = this.f159193w;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f159174d.getChildCount() > 1) {
                FrameLayout frameLayout = this.f159174d;
                View childAt = frameLayout.getChildAt(frameLayout.getChildCount() - 1);
                C45922g gVar2 = this.f159182l;
                if (childAt != gVar2) {
                    this.f159174d.removeView(gVar2);
                    this.f159174d.addView(this.f159182l);
                }
            }
            if (this.f159183m.size() > 1 && this.f159183m.get(0) != (gVar = this.f159182l)) {
                this.f159183m.remove(gVar);
                this.f159183m.add(0, this.f159182l);
            }
            AbstractC45920e eVar = this.f159185o;
            if (!(eVar == null || (viewGroup = (ViewGroup) eVar.getContentView().getParent()) == null)) {
                viewGroup.removeView(this.f159185o.getContentView());
                viewGroup.addView(this.f159185o.getContentView());
            }
            if (this.f159183m.size() > 0) {
                this.f159183m.get(0);
                AbstractC78484a<C45922g, C45922g> aVar = this.f159195y;
                if (aVar != null) {
                    aVar.mo122407a(this.f159182l);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c$a */
    public class C71080a extends AbstractC14537a {
        static {
            Covode.recordClassIndex(83579);
        }

        public C71080a() {
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23390a(float f) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && (gVar.mo77346b(f) || gVar.f106959k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: c */
        public final boolean mo23404c(MotionEvent motionEvent) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && gVar.mo77368k()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: f */
        public boolean mo23406f(MotionEvent motionEvent) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && gVar.mo77347b(motionEvent)) {
                    AbstractC71078c.this.mo112323m();
                    return true;
                }
            }
            if (AbstractC71078c.this.f159176f != null) {
                AbstractC71078c.this.f159176f.mo77277b();
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public boolean mo23400b(MotionEvent motionEvent) {
            AbstractC71078c.this.f159192v = false;
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && gVar.mo77341a(motionEvent)) {
                    if (!AbstractC71078c.this.mo112288g()) {
                        return true;
                    }
                    AbstractC71078c.this.f159182l.post(new RunnableC71082e(AbstractC71078c.this));
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23393a(ScaleGestureDetector scaleGestureDetector) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && (gVar.mo77348b(scaleGestureDetector) || gVar.f106959k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23402b(ScaleGestureDetector scaleGestureDetector) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && (gVar.mo77342a(scaleGestureDetector) || gVar.f106959k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23394a(C84882b bVar) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && (gVar.mo77343a(bVar) || gVar.f106959k)) {
                    AbstractC71078c.this.mo112323m();
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23396a(C84885c cVar) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && (gVar.mo77344a(cVar) || gVar.f106959k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23395a(C84882b bVar, float f, float f2) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && (gVar.mo77352f() || gVar.f106959k)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: b */
        public final boolean mo23401b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && (gVar.f106957i || System.currentTimeMillis() - gVar.f106963o < 300)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: a */
        public final boolean mo23392a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!AbstractC71078c.this.f159175e) {
                return false;
            }
            for (C45922g gVar : AbstractC71078c.this.f159183m) {
                if (gVar != null && (gVar.f106957i || System.currentTimeMillis() - gVar.f106963o < 300)) {
                    return true;
                }
            }
            if (!AbstractC71078c.this.f159192v) {
                return false;
            }
            AbstractC71078c.this.f159192v = false;
            return true;
        }
    }

    /* renamed from: a */
    public void mo112305a(float f) {
        C45922g gVar = this.f159182l;
        if (gVar != null) {
            gVar.setAlpha(f);
        }
    }

    /* renamed from: b */
    public void mo112315b(C45922g gVar) {
        this.f159174d.addView(gVar, 0);
    }

    /* renamed from: a */
    public final void mo112307a(AbstractC45857b bVar) {
        this.f159170A = bVar;
        C45922g gVar = this.f159182l;
        if (gVar != null) {
            gVar.setMotionInterceptor(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: b */
    public final void mo112316b(boolean z) {
        C45922g gVar = this.f159182l;
        if (gVar != null) {
            gVar.setLockMode(z);
        }
    }

    /* renamed from: b */
    public static float m125575b(float f) {
        return new BigDecimal((double) f).setScale(4, 1).floatValue();
    }

    /* renamed from: a */
    public final PointF mo112303a(PointF pointF) {
        int i;
        int i2;
        PointF pointF2 = new PointF();
        VESize vESize = this.f159187q;
        if (vESize == null) {
            i = C70636dh.m124831b(this.f159182l.getContext());
            i2 = C70636dh.m124828a(this.f159182l.getContext());
        } else {
            i = vESize.width;
            i2 = this.f159187q.height;
        }
        pointF2.set(m125575b((pointF.x * 1.0f) / ((float) i)), m125575b((pointF.y * 1.0f) / ((float) i2)));
        return pointF2;
    }

    /* renamed from: b */
    public final Point mo112313b(PointF pointF) {
        int i;
        int i2;
        Point point = new Point();
        VESize vESize = this.f159187q;
        if (vESize == null) {
            i = C70636dh.m124831b(this.f159182l.getContext());
            i2 = C70636dh.m124828a(this.f159182l.getContext());
        } else {
            i = vESize.width;
            i2 = this.f159187q.height;
        }
        point.set((int) (((float) i) * pointF.x), (int) (((float) i2) * pointF.y));
        return point;
    }

    /* renamed from: d */
    public final InteractStickerStruct mo112317d(int i) {
        if (!mo112283b() || this.f159182l == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(i);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(m125575b(this.f159182l.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.f159182l.getScale()));
        PointF a = mo112303a(this.f159182l.getCenterViewPoint());
        normalTrackTimeStamp.setX(a.x);
        normalTrackTimeStamp.setY(a.y);
        normalTrackTimeStamp.setStartTime(0.0f);
        normalTrackTimeStamp.setEndTime(0.0f);
        PointF a2 = mo112303a(new PointF((float) this.f159182l.getContentViewWidth(), (float) this.f159182l.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(a2.x);
        normalTrackTimeStamp.setHeight(a2.y);
        linkedList.add(normalTrackTimeStamp);
        C45887e.m88531a(interactStickerStruct, linkedList);
        return interactStickerStruct;
    }

    /* renamed from: a */
    public void mo112310a(InteractStickerStruct interactStickerStruct) {
        mo112311a(interactStickerStruct, (Boolean) true);
    }

    /* renamed from: a */
    public void mo112276a(Context context, FrameLayout frameLayout) {
        this.f159190t = context;
        this.f159174d = frameLayout;
        this.f159188r = mo112318h();
        mo112446q();
        this.f159186p = mo112325o();
    }

    /* renamed from: b */
    public final void mo112314b(Context context, FrameLayout frameLayout) {
        this.f159190t = context;
        this.f159174d = frameLayout;
        this.f159188r = mo112318h();
        mo112446q();
        this.f159196z = (EditToolbarViewModel) C20531t.m38716a((ActivityC0945e) this.f159190t).mo33800a(EditToolbarViewModel.class);
        this.f159186p = mo112325o();
    }

    /* renamed from: a */
    public void mo112306a(AbstractC31071f fVar, AbstractC72510a aVar) {
        this.f159181k = aVar;
        if (fVar != null && this.f159180j == null) {
            VESize b = fVar.mo56330b();
            if (b.width != 0 && b.height != 0) {
                this.f159180j = fVar;
                int[] a = C45889g.m88533a(this.f159174d, b.width, b.height);
                this.f159178h = a[0];
                this.f159179i = a[1];
                mo112447r();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo112309a(C45922g gVar, boolean z) {
        C45922g gVar2;
        AbstractC72510a aVar;
        this.f159182l = gVar;
        if (gVar != null) {
            if (z) {
                gVar.setAlpha(1.0f);
            }
            boolean z2 = false;
            if (z) {
                this.f159173c = true;
            } else if (this.f159173c) {
                mo112320j();
                this.f159173c = false;
            }
            boolean a = C45883b.m88524a(this.f159177g, gVar.getFourAnglePoint());
            PointF centerViewPoint = this.f159182l.getCenterViewPoint();
            if (this.f159176f != null) {
                z2 = true;
            }
            if (z2 && (!mo112288g())) {
                int a2 = this.f159176f.mo77275a((int) (centerViewPoint.x + ((float) this.f159178h)), (int) (centerViewPoint.y + ((float) this.f159179i)), z, a);
                C45922g gVar3 = this.f159182l;
                if (a2 != 1 && a2 == 3) {
                    mo112282a(gVar3);
                }
            }
            if (C71513p.m126385a() && (aVar = this.f159181k) != null) {
                if (!z) {
                    AbstractC31071f fVar = this.f159180j;
                    if (!(fVar == null || fVar.mo56356f() == C85581w.EnumC85611j.PAUSED)) {
                        this.f159181k.mo114833v().setValue(C88296t.m153437b());
                    }
                } else if (aVar.mo114824m() != 1) {
                    this.f159181k.mo114833v().setValue(C88296t.m153435a());
                }
            }
            if (!(this.f159176f == null || (gVar2 = this.f159182l) == null)) {
                gVar2.setAlpha(1.0f);
            }
            AbstractC71087a aVar2 = this.f159184n;
            if (aVar2 != null) {
                aVar2.mo112338a(z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: a */
    public void mo112311a(InteractStickerStruct interactStickerStruct, Boolean bool) {
        NormalTrackTimeStamp a;
        if (interactStickerStruct != null && (a = C71073b.m125560a(interactStickerStruct)) != null && this.f159182l != null) {
            Point b = mo112313b(new PointF(a.getX(), a.getY()));
            PointF centerViewPoint = this.f159182l.getCenterViewPoint();
            this.f159182l.mo77338a(((float) b.x) - centerViewPoint.x, ((float) b.y) - centerViewPoint.y, bool);
            this.f159182l.mo77345b();
            this.f159182l.mo77339a(-a.getRotation(), bool);
            this.f159182l.mo77337a(a.getScale().floatValue());
        }
    }

    /* renamed from: a */
    public final C1731i<C45859b> mo112304a(String str, int i, int i2, int i3, int i4) {
        C45922g gVar = this.f159182l;
        if (gVar != null) {
            gVar.mo77369l();
        }
        return this.f159186p.mo77212a(this.f159182l, this.f159174d, str, i, i2, i3, i4);
    }
}
