package com.p2082ss.android.ugc.gamora.editor.subtitle;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45922g;
import com.p2082ss.android.ugc.aweme.property.C65339ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.C75308c;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.view.C76113a;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83090d;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.subtitle.a */
public final class C83070a extends AbstractC71078c {

    /* renamed from: A */
    C83090d.AbstractC83093b f185628A;

    /* renamed from: B */
    public boolean f185629B;

    /* renamed from: C */
    public final AbstractC72510a f185630C;

    /* renamed from: D */
    private C75309d f185631D;

    /* renamed from: E */
    private final AbstractC89244h f185632E = C89250i.m154773a((AbstractC89171a) new C83074c(this));

    /* renamed from: a */
    public C83090d f185633a;

    /* renamed from: b */
    public C75308c f185634b;

    /* renamed from: c */
    public VideoPublishEditModel f185635c;

    static {
        Covode.recordClassIndex(96945);
    }

    /* renamed from: r */
    private final C83074c.C830751 m143443r() {
        return (C83074c.C830751) this.f185632E.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3863d.AbstractC72865b
    /* renamed from: c */
    public final InteractStickerStruct mo112284c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: f */
    public final int mo112287f() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.a$a */
    public final class C83071a extends AbstractC71078c.C71080a {
        static {
            Covode.recordClassIndex(96946);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.a$a$a */
        static final class RunnableC83072a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C83071a f185637a;

            static {
                Covode.recordClassIndex(96947);
            }

            RunnableC83072a(C83071a aVar) {
                this.f185637a = aVar;
            }

            public final void run() {
                C83070a.this.mo112320j();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C83071a() {
            super();
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b, com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c.C71080a
        /* renamed from: b */
        public final boolean mo23400b(MotionEvent motionEvent) {
            C83070a.this.f159192v = false;
            if (!C83070a.this.f159175e) {
                return false;
            }
            for (C45922g gVar : C83070a.this.f159183m) {
                if (gVar != null && gVar.mo77341a(motionEvent)) {
                    C83070a.this.f185629B = true;
                    if (C83070a.this.mo112288g()) {
                        C83070a.this.f159182l.post(new RunnableC83072a(this));
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b, com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c.C71080a
        /* renamed from: f */
        public final boolean mo23406f(MotionEvent motionEvent) {
            if (!C83070a.this.f159175e) {
                return false;
            }
            for (C45922g gVar : C83070a.this.f159183m) {
                if (gVar != null && gVar.mo77347b(motionEvent)) {
                    C83070a.this.f185629B = false;
                    C83070a.this.mo112446q();
                    C83070a.this.mo112323m();
                    return true;
                }
            }
            if (C83070a.this.f159176f != null) {
                C83070a.this.f159176f.mo77277b();
            }
            if (C83070a.this.f159190t != null && (C83070a.this.f159190t instanceof ActivityC0945e) && !C83070a.this.mo112288g()) {
                C83070a.this.f185630C.mo114805a(true, true, true);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.a$c */
    static final class C83074c extends AbstractC89220m implements AbstractC89171a<C830751> {

        /* renamed from: a */
        final /* synthetic */ C83070a f185639a;

        static {
            Covode.recordClassIndex(96949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83074c(C83070a aVar) {
            super(0);
            this.f185639a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C830751 invoke() {
            return new AbstractC31071f.AbstractC31073b(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.subtitle.C83070a.C83074c.C830751 */

                /* renamed from: a */
                final /* synthetic */ C83074c f185640a;

                static {
                    Covode.recordClassIndex(96950);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f185640a = r1;
                }

                @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31071f.AbstractC31073b
                /* renamed from: a */
                public final void mo56404a(int i) {
                    C83090d dVar;
                    String str;
                    if ((!C65339ai.m117025a() || !this.f185640a.f185639a.f185629B) && (dVar = this.f185640a.f185639a.f185633a) != null) {
                        C75308c cVar = this.f185640a.f185639a.f185634b;
                        if (cVar != null) {
                            str = cVar.mo118854a(this.f185640a.f185639a.f159180j.mo56370k());
                        } else {
                            str = null;
                        }
                        dVar.setCaption(str);
                    }
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: b */
    public final boolean mo112283b() {
        if (this.f185631D != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: h */
    public final AbstractC71078c.C71080a mo112318h() {
        return new C83071a();
    }

    /* renamed from: q */
    public final void mo112446q() {
        String str;
        C83090d dVar = this.f185633a;
        if (dVar != null) {
            C75308c cVar = this.f185634b;
            if (cVar != null) {
                str = cVar.mo118854a(this.f159180j.mo56370k());
            } else {
                str = null;
            }
            dVar.setCaption(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.a$b */
    static final class RunnableC83073b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC45920e f185638a;

        static {
            Covode.recordClassIndex(96948);
        }

        RunnableC83073b(AbstractC45920e eVar) {
            this.f185638a = eVar;
        }

        public final void run() {
            this.f185638a.mo77318a((float) C83090d.f185667s, (float) C70636dh.m124831b(this.f185638a.getContentView().getContext()), (float) (C76113a.m133465a(this.f185638a.getContentView().getContext()) - C76113a.getTbMargin()));
        }
    }

    /* renamed from: a */
    public final void mo128173a(int i) {
        C83090d dVar = this.f185633a;
        if (dVar != null) {
            dVar.setCaptionLocation(i);
        }
    }

    public C83070a(AbstractC72510a aVar) {
        C89219l.m154721d(aVar, "");
        this.f185630C = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112308a(AbstractC45920e eVar) {
        if (eVar != null) {
            eVar.getContentView().post(new RunnableC83073b(eVar));
            eVar.mo77323c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final C45922g mo112275a(Context context) {
        if (context == null) {
            C89219l.m154715b();
        }
        C83090d dVar = new C83090d(context, (byte) 0);
        dVar.setLockMode(true);
        dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        dVar.setOnCaptionStickerListener(this.f185628A);
        dVar.setPublishEditModel(this.f185635c);
        this.f185633a = dVar;
        return dVar;
    }

    /* renamed from: a */
    public final void mo128174a(List<C75313h> list) {
        if (C84892d.m145850a(list)) {
            this.f185631D = null;
            this.f159180j.mo56332b(m143443r());
            this.f185634b = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            C89219l.m154715b();
        }
        arrayList.addAll(list);
        C75309d dVar = this.f185631D;
        if (dVar == null) {
            this.f185631D = new C75309d(null, arrayList, 0, null, null, 0, 61, null);
        } else {
            dVar.setUtterances(arrayList);
        }
        mo112280a(false);
        this.f185634b = new C75308c(arrayList);
        this.f159180j.mo56305a(m143443r());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c, com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d
    /* renamed from: a */
    public final boolean mo77274a(RectF rectF) {
        List<C75313h> list;
        C89219l.m154721d(rectF, "");
        C75309d dVar = this.f185631D;
        if (dVar != null) {
            list = dVar.getUtterances();
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c
    /* renamed from: a */
    public final void mo112306a(AbstractC31071f fVar, AbstractC72510a aVar) {
        super.mo112306a(fVar, aVar);
    }
}
