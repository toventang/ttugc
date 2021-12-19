package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45859b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.C71077b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.C71083f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.C71231a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71277b;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.a */
public abstract class AbstractC71276a<T> extends AbstractC71078c implements AbstractC71288f<T>, C77268b.AbstractC77269a {

    /* renamed from: A */
    public C45922g f159745A;

    /* renamed from: B */
    public final VideoPublishEditModel f159746B;

    /* renamed from: a */
    public String f159747a;

    /* renamed from: b */
    public AbstractC71277b<T> f159748b;

    /* renamed from: c */
    public C77268b f159749c;

    static {
        Covode.recordClassIndex(83795);
    }

    /* renamed from: a */
    public abstract List<InteractStickerStruct> mo112706a(List<? extends StickerItemModel> list);

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: c */
    public final InteractStickerStruct mo112284c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: f */
    public final int mo112287f() {
        return R.string.axu;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: l */
    public final boolean mo112322l() {
        return true;
    }

    /* renamed from: q */
    public abstract List<String> mo112446q();

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: o */
    public final C71077b mo112325o() {
        return new C71083f();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: b */
    public final boolean mo112283b() {
        List list = this.f159183m;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final void mo112447r() {
        Iterator it = this.f159183m.iterator();
        while (it.hasNext()) {
            C45922g gVar = (C45922g) it.next();
            C89219l.m154716b(gVar, "");
            if (gVar.getParent() == null || gVar.getParent() == this.f159174d) {
                this.f159174d.removeView(gVar);
                this.f159182l = null;
                if (this.f159184n != null) {
                    this.f159184n.mo112342d();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public final void mo112711t() {
        this.f159745A = this.f159182l;
        this.f159182l = null;
        AbstractC71277b<T> bVar = this.f159748b;
        if (bVar != null) {
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            bVar.mo112713a(height, (float) frameLayout2.getTop());
        }
        AbstractC71277b<T> bVar2 = this.f159748b;
        if (bVar2 != null) {
            bVar2.mo112716a((AbstractC71284d) null, new C71231a((byte) 0));
        }
    }

    /* renamed from: s */
    public final void mo112710s() {
        AbstractC71284d<T> dVar;
        C71231a aVar;
        Context context = this.f159190t;
        C71286e eVar = null;
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar2 = (ActivityC0945e) context;
        if (eVar2 != null) {
            ((AbstractC72510a) ApiCenter.C2545a.m7450a(eVar2).mo7013a(AbstractC72510a.class)).mo114805a((AbstractC72510a) false, false, false);
        }
        AbstractC71277b<T> bVar = this.f159748b;
        if (bVar != null) {
            FrameLayout frameLayout = this.f159174d;
            C89219l.m154716b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f159174d;
            C89219l.m154716b(frameLayout2, "");
            bVar.mo112713a(height, (float) frameLayout2.getTop());
        }
        mo112324n();
        C45922g gVar = this.f159182l;
        if (!(gVar instanceof C71286e)) {
            gVar = null;
        }
        C71286e eVar3 = (C71286e) gVar;
        if (eVar3 != null) {
            dVar = eVar3.getBaseView();
        } else {
            dVar = null;
        }
        C45922g gVar2 = this.f159182l;
        if (gVar2 instanceof C71286e) {
            eVar = gVar2;
        }
        C71286e eVar4 = eVar;
        if (eVar4 == null || dVar == null) {
            aVar = new C71231a((byte) 0);
        } else {
            eVar4.mo112777r();
            aVar = new C71231a((byte) 0);
            aVar.f159631c = AbstractC71078c.m125575b(eVar4.getRotateAngle());
            View contentView = eVar4.getContentView();
            C89219l.m154716b(contentView, "");
            aVar.f159629a = contentView.getScaleX();
            View contentView2 = eVar4.getContentView();
            C89219l.m154716b(contentView2, "");
            aVar.f159630b = contentView2.getScaleY();
            View contentView3 = eVar4.getContentView();
            C89219l.m154716b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout3 = this.f159174d;
            C89219l.m154716b(frameLayout3, "");
            aVar.f159632d = x + frameLayout3.getX();
            View contentView4 = eVar4.getContentView();
            C89219l.m154716b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout4 = this.f159174d;
            C89219l.m154716b(frameLayout4, "");
            aVar.f159633e = y + frameLayout4.getY();
        }
        AbstractC71277b<T> bVar2 = this.f159748b;
        if (bVar2 != null) {
            bVar2.mo112716a(dVar, aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: b */
    public final void mo112315b(C45922g gVar) {
        this.f159174d.addView(this.f159182l);
    }

    public AbstractC71276a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f159746B = videoPublishEditModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
    /* renamed from: c */
    public final void mo77540c(int i) {
        AbstractC71277b<T> bVar = this.f159748b;
        if (bVar != null && bVar.getVisibility() == 0) {
            bVar.f159760k += i;
            bVar.setSearchListMarginBottom(bVar.f159760k);
        }
    }

    /* renamed from: a */
    public final void mo112708a(AbstractC71277b<T> bVar) {
        if (this.f159748b == null) {
            this.f159748b = bVar;
            if (bVar != null) {
                bVar.setVisibility(8);
            }
            AbstractC71277b<T> bVar2 = this.f159748b;
            if (bVar2 != null) {
                bVar2.setMEditingListener(this);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
    /* renamed from: b */
    public final void mo77535b(int i) {
        AbstractC71277b<T> bVar = this.f159748b;
        if (bVar != null) {
            boolean z = true;
            if (bVar.getVisibility() == 0 && !bVar.getMIsDismissing()) {
                if (this.f159182l != null) {
                    z = false;
                }
                AbstractC71284d<T> dVar = bVar.f159752c;
                if (dVar != null) {
                    if (z) {
                        bVar.f159753d.f159632d = (float) ((bVar.getWidth() - dVar.getWidth()) / 2);
                        bVar.f159753d.f159633e = ((bVar.f159756g.x - ((float) dVar.getHeight())) / 2.0f) + bVar.f159756g.y;
                    }
                    bVar.f159754e.f159632d = (float) ((bVar.getWidth() - dVar.getWidth()) / 2);
                    bVar.f159754e.f159633e = (float) (((bVar.getHeight() - i) - dVar.getHeight()) / 2);
                }
                C45922g gVar = this.f159182l;
                if (gVar == null) {
                    bVar.mo112720d();
                } else if (gVar instanceof C71286e) {
                    float newLayoutHeight = ((C71286e) gVar).getNewLayoutHeight();
                    AbstractC71277b<T> bVar2 = this.f159748b;
                    if (bVar2 != null) {
                        bVar2.f159753d.f159633e += newLayoutHeight;
                    }
                    AbstractC71277b<T> bVar3 = this.f159748b;
                    if (bVar3 != null) {
                        bVar3.mo112720d();
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.C77268b.AbstractC77269a
    /* renamed from: a */
    public final void mo77523a(int i) {
        float f;
        AbstractC71277b<T> bVar = this.f159748b;
        if (bVar != null && bVar.getVisibility() == 0 && !bVar.getMIsEditing()) {
            bVar.f159760k = i;
            bVar.setSearchListMarginBottom(bVar.f159760k);
            AbstractC71284d<T> dVar = bVar.f159752c;
            if (dVar != null) {
                bVar.f159754e.f159632d = (float) ((bVar.getWidth() - dVar.getWidth()) / 2);
                bVar.f159754e.f159633e = (float) (((bVar.getHeight() - i) - dVar.getHeight()) / 2);
            }
            bVar.f159758i = false;
            if (!bVar.f159757h) {
                bVar.f159757h = true;
                int i2 = bVar.f159759j;
                if (i2 == C71283c.f159771c) {
                    bVar.f159759j = C71283c.f159769a;
                    AbstractC71284d<T> dVar2 = bVar.f159752c;
                    if (dVar2 != null) {
                        dVar2.setVisibility(0);
                        AbstractC71277b.C71279b bVar2 = new AbstractC71277b.C71279b(bVar);
                        C89219l.m154721d(dVar2, "");
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar2, "scaleX", bVar.f159753d.f159629a, bVar.f159754e.f159629a);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dVar2, "scaleY", bVar.f159753d.f159630b, bVar.f159754e.f159630b);
                        float[] fArr = new float[2];
                        fArr[0] = bVar.f159753d.f159631c;
                        if (bVar.f159753d.f159631c > 180.0f) {
                            f = 360.0f;
                        } else {
                            f = bVar.f159754e.f159631c;
                        }
                        fArr[1] = f;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dVar2, "rotation", fArr);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(dVar2, "x", bVar.f159753d.f159632d, bVar.f159754e.f159632d);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dVar2, "y", bVar.f159753d.f159633e, bVar.f159754e.f159633e);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(300L);
                        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
                        animatorSet.addListener(bVar2);
                        animatorSet.start();
                        bVar.f159755f = animatorSet;
                    }
                } else if (i2 == C71283c.f159770b) {
                    bVar.f159759j = C71283c.f159769a;
                    AbstractC71284d<T> dVar3 = bVar.f159752c;
                    if (dVar3 != null) {
                        dVar3.setX(bVar.f159754e.f159632d);
                        dVar3.setY(bVar.f159754e.f159633e);
                        dVar3.setVisibility(0);
                        bVar.requestLayout();
                        AbstractC71277b.C71280c cVar = new AbstractC71277b.C71280c(bVar);
                        C89219l.m154721d(dVar3, "");
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(dVar3, "scaleX", 0.0f, 1.0f);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(dVar3, "scaleY", 0.0f, 1.0f);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.setDuration(300L);
                        animatorSet2.playTogether(ofFloat6, ofFloat7);
                        animatorSet2.addListener(cVar);
                        animatorSet2.start();
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112276a(Context context, FrameLayout frameLayout) {
        super.mo112276a(context, frameLayout);
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            C77268b bVar = new C77268b(eVar, null);
            this.f159749c = bVar;
            bVar.mo120871a(this);
        }
    }

    /* renamed from: a */
    public final void mo112707a(C45922g gVar, InteractStickerStruct interactStickerStruct) {
        NormalTrackTimeStamp a;
        if (gVar != null && interactStickerStruct != null && (a = C71073b.m125560a(interactStickerStruct)) != null) {
            Point b = mo112313b(new PointF(a.getX(), a.getY()));
            PointF centerViewPoint = gVar.getCenterViewPoint();
            gVar.mo77338a(((float) b.x) - centerViewPoint.x, ((float) b.y) - centerViewPoint.y, false);
            gVar.mo77345b();
            gVar.mo77339a(-a.getRotation(), (Boolean) false);
            Float scale = a.getScale();
            Objects.requireNonNull(scale, "null cannot be cast to non-null type kotlin.Float");
            gVar.mo77337a(scale.floatValue());
        }
    }

    /* renamed from: b */
    public final C1731i<List<C45859b>> mo112709b(String str, int i, int i2, int i3, int i4) {
        C89219l.m154721d(str, "");
        ArrayList arrayList = new ArrayList();
        for (C45922g gVar : this.f159183m) {
            C1731i<C45859b> a = this.f159186p.mo77212a(gVar, this.f159174d, str, i, i2, i3, i4);
            C89219l.m154716b(a, "");
            arrayList.add(a);
        }
        C1731i<List<C45859b>> a2 = C1731i.m5634a((Collection) arrayList);
        C89219l.m154716b(a2, "");
        return a2;
    }
}
